
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
class simpleMUXtest extends AnyFreeSpec with ChiselScalatestTester{
    "simple MUX 2to1" in {
        test(new MUX2to1()) { dut =>
        dut.io.inA.poke(1.B)
        dut.io.inB.poke(0.B)
        dut.io.sel.poke(1.B)
        dut.clock.step(35)
        }
    }
}