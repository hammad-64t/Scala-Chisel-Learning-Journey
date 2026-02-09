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
class R5_PC_test extends AnyFreeSpec with ChiselScalatestTester{
    "R5_PC_test" in {
        test(new R5_PC()) { dut =>

        dut.io.NextPC_sel.poke(0.U)
        dut.io.ALU_branch.poke(0.B)
        dut.io.CTRL_branch.poke(0.B)

        // dut.io.IM_mux_Out.poke(0.S)
        // dut.io.REG_rd1.poke(0.S)
        dut.io.IM_SBtype.poke(0.S)
        dut.io.IM_UJtype.poke(0.S)
        
        dut.clock.step(14)

        //---------------------------
        dut.io.NextPC_sel.poke(2.U)
        dut.io.ALU_branch.poke(1.B)
        dut.io.CTRL_branch.poke(1.B)

        // dut.io.IM_mux_Out.poke(7.S)
        // dut.io.REG_rd1.poke(9.S)
        dut.io.IM_SBtype.poke(44.S)
        dut.io.IM_UJtype.poke(48.S)
        
        dut.clock.step(1)

        //---------------------------
        dut.io.NextPC_sel.poke(0.U)
        dut.io.ALU_branch.poke(0.B)
        dut.io.CTRL_branch.poke(0.B)

        // dut.io.IM_mux_Out.poke(0.S)
        // dut.io.REG_rd1.poke(0.S)
        dut.io.IM_SBtype.poke(0.S)
        dut.io.IM_UJtype.poke(0.S)
        
        dut.clock.step(1)
        }
    }
}