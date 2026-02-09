import chisel3._
import chisel3.util._


class R5_PCounter_IO_Interface extends Bundle {
    val NextPC_sel = Input(UInt(2.W))

    val ALU_branch = Input(Bool())
    val CTRL_branch = Input(Bool())

    val JALR_target = Input(UInt(32.W))
    // val IM_mux_Out = Input(SInt(32.W))
    // val REG_rd1 = Input(SInt(32.W))
    val IM_SBtype = Input(SInt(32.W))
    val IM_UJtype = Input(SInt(32.W))

    val NextPC_out = Output(UInt(32.W))
    val PC_out = Output(UInt(32.W))
}


class R5_PC extends Module(){
    val io = IO(new R5_PCounter_IO_Interface)
    val PC_REG = RegInit(0.U(32.W))

    // val JALR_target = Wire(UInt(32.W))
    // JALR_target := "hfffffffe".U & (io.REG_rd1.asUInt + io.IM_mux_Out.asUInt)

    io.NextPC_out := PC_REG + 4.U
    
    PC_REG := MuxLookup(io.NextPC_sel, io.NextPC_out, Seq(
        0.U -> io.NextPC_out,
        1.U -> Mux((io.ALU_branch & io.CTRL_branch), io.IM_SBtype.asUInt, io.NextPC_out),
        2.U -> io.IM_UJtype.asUInt,
        3.U -> io.JALR_target,
    ))

    // PC_REG := io.NextPC_out

    io.PC_out := PC_REG
    

    // val temp = Wire(SInt(32.W))
    // temp := -1.S + 1.S
    // printf(s"temp     = %d  bin = %b\n", temp.asUInt, temp.asUInt)
    
    printf(s"\nPC \n--------------------------------------------------------------------------------------------------- \n")
    printf(s"PC_out     = %d  bin = %b\n", io.PC_out.asSInt, io.PC_out.asUInt)
    printf(s"NextPC_out = %d  bin = %b\n \n", io.NextPC_out.asSInt, io.NextPC_out.asUInt)
}
