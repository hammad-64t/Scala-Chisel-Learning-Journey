// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._
//import chiseltest.experimental.TestOptionBuilder._ 

import chisel3._ 
import chiseltest._ 
import org.scalatest.freespec.AnyFreeSpec
import chiseltest.simulator.VerilatorBackendAnnotation



// class REG_32bit extends FreeSpec with ChiselScalatestTester{
class REG_32bit_test extends AnyFreeSpec with ChiselScalatestTester{
    "REG_32bit_test" in {
        test(new REG_32bit()) { dut =>

        dut.io.REG_Read1_Addr.poke(0.U)
        dut.io.REG_Read2_Addr.poke(1.U)
        dut.io.REG_Write.poke(1.B)
        dut.io.REG_Write_Addr.poke(4.U)
        dut.io.REG_WRITE_DATA.poke(123456.S)
        dut.clock.step(1)

        
        dut.io.REG_Read1_Addr.poke(4.U)
        dut.io.REG_Read2_Addr.poke(1.U)
        dut.io.REG_Write.poke(1.B)
        dut.io.REG_Write_Addr.poke(1.U)
        dut.io.REG_WRITE_DATA.poke(123456.S)
        dut.clock.step(1)

        dut.io.REG_Read1_Addr.poke(4.U)
        dut.io.REG_Read2_Addr.poke(1.U)
        dut.io.REG_Write.poke(1.B)
        dut.io.REG_Write_Addr.poke(2.U)
        dut.io.REG_WRITE_DATA.poke(23425634.S)
        dut.clock.step(1)

        dut.io.REG_Read1_Addr.poke(4.U)
        dut.io.REG_Read2_Addr.poke(2.U)
        dut.io.REG_Write.poke(1.B)
        dut.io.REG_Write_Addr.poke(1.U)
        dut.io.REG_WRITE_DATA.poke(3333333.S)
        dut.clock.step(1)

        // dut.reset.poke(1.B)
        // dut.clock.step(1)
        // dut.reset.poke(0.B)
        // dut.clock.step(1)
        }
    }

    println(( new chisel3 . stage . ChiselStage ) . emitVerilog ( new REG_32bit ) )
}