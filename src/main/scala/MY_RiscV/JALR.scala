
import chisel3._
import chisel3.util._


class JALR_IO_Interface extends Bundle {

    val IM_mux_Out = Input(SInt(32.W))
    val REG_rd1 = Input(SInt(32.W))

    val out = Output(UInt(32.W))
}


class JALR extends Module(){
    val io = IO(new JALR_IO_Interface)

    io.out := "hfffffffe".U & (io.REG_rd1.asUInt + io.IM_mux_Out.asUInt)

    printf(s"\nJALR \n------------------------------------------------------------------------------------------------- \n")
    printf(s"JALR     = %d  bin = %b\n", io.out.asUInt, io.out.asUInt)
}
