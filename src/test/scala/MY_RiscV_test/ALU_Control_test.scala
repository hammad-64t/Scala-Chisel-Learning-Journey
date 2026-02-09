// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._
//import chiseltest.experimental.TestOptionBuilder._ 

import chisel3._ 
import chiseltest._ 
import org.scalatest.freespec.AnyFreeSpec
import chiseltest.simulator.VerilatorBackendAnnotation



// class ALU_Control_test extends FreeSpec with ChiselScalatestTester{
class ALU_Control_test extends AnyFreeSpec with ChiselScalatestTester{
    "ALU_Control_test" in {
        test(new ALU_Control()) { dut =>

        dut.io.ALU_OP.poke("b010".U)
        dut.io.Func7.poke(1.B)
        dut.io.Func3.poke("b101".U)

        dut.clock.step(1)
        }
    }
}