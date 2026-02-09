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
class exe1Test extends AnyFreeSpec with ChiselScalatestTester{
    "It should count in lab1" in {
        test(new exe1Counter(3.U)) { dut =>
        dut.clock.step(50)
        }
    }
}
