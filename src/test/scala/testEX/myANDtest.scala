
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._
//import chiseltest.experimental.TestOptionBuilder._ 

import chisel3._ 
import chiseltest._ 
import org.scalatest.freespec.AnyFreeSpec
import chiseltest.simulator.VerilatorBackendAnnotation


// class myANDtest extends FreeSpec with ChiselScalatestTester{
class myANDtest extends AnyFreeSpec with ChiselScalatestTester{
    "It should AND" in {
        test(new myAND()) { dut =>
        dut.io.a.poke(true.B)
        dut.io.b.poke(false.B)
        dut.io.y.expect(false.B)
        }
    }
}

