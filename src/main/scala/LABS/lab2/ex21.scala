
import chisel3._

class LM_IO_Interface extends Bundle {
    val s0 = Input(Bool())
    val s1 = Input(Bool())
    val s2 = Input(Bool())
    val out = Output(UInt(32.W))
}

class MUX5to1 extends Module(){
    val io = IO(new LM_IO_Interface)

    when(io.s2 === 1.U){
        io.out := 32.U
    }.elsewhen(io.s2 === 0.U & io.s1 === 0.U & io.s0 === 1.U){
        io.out := 24.U
    }.elsewhen(io.s2 === 0.U & io.s1 === 1.U & io.s0 === 0.U){
        io.out := 16.U
    }.elsewhen(io.s2 === 0.U & io.s1 === 1.U & io.s0 === 1.U){
        io.out := 8.U
    }.otherwise{
        io.out := 0.U
    }
}
