//INSTRUCTIONS.txt

import chisel3._
import chisel3.util._
import chisel3.util.experimental.loadMemoryFromFile


class R5_RAM_IO_Interface extends Bundle {
    val Addr = Input(UInt(8.W))

    val Write_EN = Input(Bool())
    val Read_EN = Input(Bool())

    val Data_in = Input(SInt(32.W))
    val Data_out = Output(SInt(32.W))
}


class R5_RAM extends Module(){
    val io = IO(new R5_RAM_IO_Interface)

    // val imem = Mem ( INST_MEM_LEN , UInt ( WLEN . W ) )
    val RAM = Mem(256, SInt(32.W))
    io.Data_out := 0.S

    when(io.Write_EN === 1.U){
        RAM.write(io.Addr, io.Data_in)
    }
    .elsewhen(io.Read_EN === 1.U){
      io.Data_out := RAM(io.Addr)  
    }
    
    // io.Data_out := io.Data_in

    printf(s"\nRAM \n------------------------------------------------------------------------------------------------- \n")
    printf(s"Addr = %d  |   ", io.Addr.asUInt)
    // printf(s"Data_out  = 0x%x\n", io.Data_out.asUInt)
    printf(s"Data_in  = %d  |   ", io.Data_in.asSInt)
    printf(s"Data_out  = %d\n", io.Data_out.asSInt)
}