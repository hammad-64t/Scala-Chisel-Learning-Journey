// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._
//import chiseltest.experimental.TestOptionBuilder._ 

import chisel3._ 
import chiseltest._ 
import org.scalatest.freespec.AnyFreeSpec
import chiseltest.simulator.VerilatorBackendAnnotation



// class R5_RAM_test extends FreeSpec with ChiselScalatestTester{
class RiscV_Main_test extends AnyFreeSpec with ChiselScalatestTester{
    "RiscV_Main_test" in {
        test(new RiscV_Main()) { dut =>

        dut.clock.step(999)

        }
    }
}