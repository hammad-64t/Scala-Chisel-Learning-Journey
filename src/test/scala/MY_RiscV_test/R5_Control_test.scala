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
class R5_Control_test extends AnyFreeSpec with ChiselScalatestTester{
    "R5_Control_test" in {
        test(new R5_Control()) { dut =>

        // dut.io.INS.poke("h00110133".U) // for R type
        // dut.io.INS.poke("hfc310ce3".U) // for Branch
        // dut.io.INS.poke("hff9ff06f".U) // for JAL
        // dut.io.INS.poke("h00008067".U) // for JALR
        // dut.io.INS.poke("h06400413".U) // for I type
        // dut.io.INS.poke("h123452b7".U) // for LUI
        dut.io.INS.poke("h0122a023".U) // for Store


        // dut.io.PC.poke(8.U)
        dut.clock.step(1)
        }
    }
}