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
class IM_GEN_test extends AnyFreeSpec with ChiselScalatestTester{
    "IM_GEN_test" in {
        test(new IM_GEN()) { dut =>
        // dut.io.INS.poke(-63894301.S)
        // dut.io.PC.poke(52.S)
        // dut.io.INS.poke(-6295441.S)
        // dut.io.PC.poke(56.S)
        // dut.io.INS.poke(1114419.S)
        // dut.io.PC.poke(48.S)
        // dut.io.INS.poke("h03800093".U) //56
        // dut.io.INS.poke("hfc800093".U) //-56 for Itype
        // dut.io.INS.poke("hfe322c23".U) // -8 for S type
        // dut.io.INS.poke("hfe208ce3".U) // 16 if PC is 24 for SB type
        // dut.io.INS.poke("h123452b7".U) // 305418240 for U type  by lui
        dut.io.INS.poke("h00001317".U) // 4104 if PC is 8 for UJ type by auipc

        dut.io.PC.poke(8.U)
        dut.clock.step(1)
        }
    }
}