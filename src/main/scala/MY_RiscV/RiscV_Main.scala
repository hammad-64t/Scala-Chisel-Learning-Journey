
import chisel3._
import chisel3.util._


class RiscV_Main_IO extends Bundle {

    val OUT = Output(SInt(32.W))
}


class RiscV_Main extends Module(){
    val io = IO(new RiscV_Main_IO)
    
    val PC = Module(new R5_PC)
    val JALR = Module(new JALR)
    val INS = Module(new INS_MEM)
    val IMGEN = Module(new IM_GEN)
    val CTRL = Module(new R5_Control)
    val ALU_CTRL = Module(new ALU_Control)
    val REG = Module(new REG_32bit)
    val ALU = Module(new R5_ALU)
    val RAM = Module(new R5_RAM)

    val IM_MUX = Wire(SInt(32.W))

    IM_MUX := MuxLookup(CTRL.io.Extend_sel, 0.S, Seq(
        0.U -> IMGEN.io.I_imm,
        1.U -> IMGEN.io.S_imm,
        2.U -> IMGEN.io.U_imm,
    ))

    val OP_MUX_A = Wire(SInt(32.W))

    OP_MUX_A := MuxLookup(CTRL.io.operand_A_sel, 0.S, Seq(
        0.U -> REG.io.REG_READ1,
        1.U -> PC.io.PC_out.asSInt,
        2.U -> PC.io.NextPC_out.asSInt,
        3.U -> REG.io.REG_READ1,
    ))


    //JALR inputs
    JALR.io.IM_mux_Out := IM_MUX
    JALR.io.REG_rd1 := REG.io.REG_READ1


    //PC INPUTS
    PC.io.NextPC_sel := CTRL.io.Next_PC_sel
    PC.io.ALU_branch := ALU.io.Branch_Out
    PC.io.CTRL_branch := CTRL.io.Branch
    // PC.io.IM_mux_Out := IM_MUX
    // PC.io.REG_rd1 := REG.io.REG_READ1
    PC.io.JALR_target := JALR.io.out
    PC.io.IM_SBtype := IMGEN.io.SB_imm
    PC.io.IM_UJtype := IMGEN.io.UJ_type


    //INSTRUNCTION MEMORY INPUTS
    INS.io.INS_addr := PC.io.PC_out(21, 2)

    
    //IMMEDIATE GENERATION INPUTS
    IMGEN.io.INS := INS.io.INS_out
    IMGEN.io.PC := PC.io.PC_out


    //CONTROL INPUTS
    CTRL.io.INS := INS.io.INS_out(6, 0)


    //ALU CONTROL INPUTS
    ALU_CTRL.io.ALU_OP := CTRL.io.ALU_OP
    ALU_CTRL.io.Func3 := INS.io.INS_out(14, 12)
    ALU_CTRL.io.Func7 := INS.io.INS_out(30)


    //32x32 bit REGISTER INPUTS
    REG.io.REG_Write := CTRL.io.RegWrite
    REG.io.REG_Read1_Addr := INS.io.INS_out(19, 15)
    REG.io.REG_Read2_Addr := INS.io.INS_out(24, 20)
    REG.io.REG_Write_Addr := INS.io.INS_out(11, 7)
    REG.io.REG_WRITE_DATA := Mux(CTRL.io.MemToReg === 1.U, RAM.io.Data_out, ALU.io.OUT)


    //ALU INPUTS
    ALU.io.inA := OP_MUX_A
    ALU.io.inB := Mux(CTRL.io.operand_B_sel === 1.U, IM_MUX, REG.io.REG_READ2)
    ALU.io.ALU_CTRL := ALU_CTRL.io.ALU_CTRL_OUT



    //RAM INPUTS 
    RAM.io.Addr := ALU.io.OUT(9, 2)
    RAM.io.Write_EN := CTRL.io.MemWrite
    RAM.io.Read_EN := CTRL.io.MemRead
    RAM.io.Data_in := REG.io.REG_READ2




    // val alu_ctrl = Module(new ALU_Control)
    // val alu = Module(new R5_ALU)

    // alu_ctrl.io.ALU_OP := io.ALU_OP
    // alu_ctrl.io.Func3 := io.Func3
    // alu_ctrl.io.Func7 := io.Func7

    // alu.io.inA := io.inA
    // alu.io.inB := io.inB
    // alu.io.ALU_CTRL := alu_ctrl.io.ALU_CTRL_OUT

    // io.Branch_Out := alu.io.Branch_Out
    io.OUT := 0.S
}