
import chisel3._

class MUX2to1_io extends Bundle {
    val inA = Input(Bool())
    val inB = Input(Bool())
    val sel = Input(Bool())
    val out = Output(Bool())
}

class MUX2to1 extends Module(){
    val io = IO(new MUX2to1_io)

    io.out := io.inA & io.sel | io.inB & (~io.sel)
}
