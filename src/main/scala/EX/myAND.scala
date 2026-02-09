
import chisel3._

class myAND extends Module {
    val io = IO(new Bundle{
        val a = Input(Bool())
        val b = Input(Bool())
        val y = Output(Bool())
    })

    io.y := io.a & io.b
}