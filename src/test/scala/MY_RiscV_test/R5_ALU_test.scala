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
class R5_ALU_test extends AnyFreeSpec with ChiselScalatestTester{
    "R5_ALU_test" in {
        test(new R5_ALU()) { dut =>

        dut.io.inA.poke(-2130706431.S)
        dut.io.inB.poke(-536870912.S)

        dut.io.ALU_CTRL.poke(16.U)

        dut.clock.step(1)
        }
    }
}