// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._
//import chiseltest.experimental.TestOptionBuilder._ 

import chisel3._ 
import chiseltest._ 
import org.scalatest.freespec.AnyFreeSpec
import chiseltest.simulator.VerilatorBackendAnnotation



// class INS_MEM_test extends FreeSpec with ChiselScalatestTester{
class INS_MEM_test extends AnyFreeSpec with ChiselScalatestTester{
    "INS_MEM_test" in {
        test(new INS_MEM()) { dut =>

        dut.io.INS_addr.poke(3.U)
        // dut.io.INS_out.poke(1.U)
        dut.clock.step(1)
        }
    }
}