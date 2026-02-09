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
class R5_RAM_test extends AnyFreeSpec with ChiselScalatestTester{
    "R5_RAM_test" in {
        test(new R5_RAM()) { dut =>

        dut.io.Addr.poke(0.U)
        dut.io.Write_EN.poke(1.U)
        dut.io.Read_EN.poke(1.U)
        dut.io.Data_in.poke(-1122334455.S)
        dut.clock.step(1)
        

        dut.io.Addr.poke(0.U)
        dut.io.Write_EN.poke(0.U)
        dut.io.Read_EN.poke(1.U)
        dut.io.Data_in.poke(-1122334455.S)
        dut.clock.step(1)

        dut.io.Addr.poke(0.U)
        dut.io.Write_EN.poke(0.U)
        dut.io.Read_EN.poke(0.U)
        dut.io.Data_in.poke(-1122334455.S)
        dut.clock.step(1)

        dut.io.Addr.poke(1.U)
        dut.io.Write_EN.poke(1.U)
        dut.io.Read_EN.poke(0.U)
        dut.io.Data_in.poke(-2334455.S)
        dut.clock.step(1)


        dut.io.Addr.poke(1.U)
        dut.io.Write_EN.poke(0.U)
        dut.io.Read_EN.poke(1.U)
        dut.io.Data_in.poke(-1122334455.S)
        dut.clock.step(1)

        dut.io.Addr.poke(2.U)
        dut.io.Write_EN.poke(1.U)
        dut.io.Read_EN.poke(0.U)
        dut.io.Data_in.poke(334455.S)
        dut.clock.step(1)

        dut.io.Addr.poke(2.U)
        dut.io.Write_EN.poke(0.U)
        dut.io.Read_EN.poke(0.U)
        dut.io.Data_in.poke(334455.S)
        dut.clock.step(1)

        dut.io.Addr.poke(2.U)
        dut.io.Write_EN.poke(0.U)
        dut.io.Read_EN.poke(1.U)
        dut.io.Data_in.poke(334455.S)
        dut.clock.step(1)

        }
    }
}