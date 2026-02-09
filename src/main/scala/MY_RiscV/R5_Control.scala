import chisel3._
import chisel3.util._


class Control_IO_Interface extends Bundle {
    val INS = Input(UInt(32.W))

    val operand_B_sel = Output(Bool())
    val operand_A_sel = Output(UInt(2.W))
    val RegWrite = Output(Bool())
    val MemWrite = Output(Bool())
    val MemToReg = Output(Bool())
    val Extend_sel = Output(UInt(2.W))
    val MemRead = Output(Bool())
    val Branch = Output(Bool())
    val Next_PC_sel = Output(UInt(2.W))
    val ALU_OP = Output(UInt(3.W))
}


class R5_Control extends Module(){
    val io = IO(new Control_IO_Interface)

    val OP_CODE = Wire(UInt(7.W))
    OP_CODE := io.INS(6,0)

    val R_type = Wire(Bool())
    val Load = Wire(Bool())
    val Store = Wire(Bool())
    val Branch = Wire(Bool())
    val I_type = Wire(Bool())
    val JALR = Wire(Bool())
    val JAL = Wire(Bool())
    val LUI = Wire(Bool())

    R_type := (OP_CODE === 0x33.U)
    Load := (OP_CODE === 0x03.U)
    Store := (OP_CODE === 0x23.U)
    Branch := (OP_CODE === 0x63.U)
    I_type := (OP_CODE === 0x13.U)
    JALR := (OP_CODE === 0x67.U)
    JAL := (OP_CODE === 0x6F.U)
    LUI := (OP_CODE === 0x37.U)

    printf(s"\nCTRL \n------------------------------------------------------------------------------------------------ \n")

    printf(s"R_type = %b\n", R_type)
    printf(s"Load = %b\n", Load)
    printf(s"Store = %b\n", Store)
    printf(s"Branch = %b\n", Branch)
    printf(s"I_type = %b\n", I_type)
    printf(s"JALR = %b\n", JALR)
    printf(s"JAL = %b\n", JAL)
    printf(s"LUI = %b\n", LUI)

    printf(s"OP_CODE = %d\n", OP_CODE)
    printf(s"OP_CODE = %b\n \n", OP_CODE.asUInt)


    io.operand_B_sel := (Load | Store | I_type | LUI)
    io.operand_A_sel := Cat(((~LUI & ~JALR & JAL) | (~LUI & JALR & ~JAL) | (LUI & ~JALR & ~JAL)), (LUI & ~JALR & ~JAL))
    io.RegWrite := (LUI | JAL | JALR | I_type | Load | R_type)
    io.MemWrite := Store
    io.MemToReg := Load
    io.Extend_sel := Cat(Store, LUI)
    io.MemRead := Load
    io.Branch := Branch
    io.Next_PC_sel := Cat(((~Branch & ~JAL & JALR) | (~Branch & JAL & ~JALR)), ((~Branch & ~JAL & JALR) | (Branch & ~JAL & ~JALR)))
    io.ALU_OP := Cat((~R_type & ~Branch & ~I_type & ~JALR & ~JAL), (~R_type & ~Load & ~Store & ~I_type), (~R_type & ~Load & ~Branch & ~LUI))

    printf(s"operand_B_sel = %b\n", io.operand_B_sel.asUInt)
    printf(s"operand_A_sel = %b\n", io.operand_A_sel.asUInt)
    printf(s"RegWrite = %b\n", io.RegWrite.asUInt)
    printf(s"MemWrite = %b\n", io.MemWrite.asUInt)
    printf(s"MemToReg = %b\n", io.MemToReg.asUInt)
    printf(s"Extend_sel = %b\n", io.Extend_sel.asUInt)
    printf(s"MemRead = %b\n", io.MemRead.asUInt)
    printf(s"Branch = %b\n", io.Branch.asUInt)
    printf(s"Next_PC_sel = %b\n", io.Next_PC_sel.asUInt)
    printf(s"ALU_OP = %b\n", io.ALU_OP.asUInt)

    // printf(s"UJ_type = %d\n", io.UJ_type)
    // printf(s"UJ_type = %b\n", io.UJ_type.asUInt)
    // printf(s"I_imm = %d\n", io.I_imm)
    // printf(s"I_imm = %b\n", io.I_imm.asUInt)
}