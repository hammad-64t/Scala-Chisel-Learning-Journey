
import chisel3._

class Counter extends Module {
    val io = IO(new Bundle{
        val pin = Output(Bool())
    })

    val count = RegInit(0.U(4.W))
    val max = 15.U

    when(count === max){
        count := 0.U
    }.otherwise{
        count := count + 1.U
    }

    io.pin := count(2)
    println(s"Counter started")
}