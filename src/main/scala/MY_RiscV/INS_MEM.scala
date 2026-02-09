//INSTRUCTIONS.txt

import chisel3._
import chisel3.util._
import chisel3.util.experimental.loadMemoryFromFile


class INS_MEM_IO_Interface extends Bundle {
    val INS_addr = Input(UInt(20.W))
    val INS_out = Output(UInt(32.W))
}


class INS_MEM extends Module(){
    val io = IO(new INS_MEM_IO_Interface)

    // val imem = Mem ( INST_MEM_LEN , UInt ( WLEN . W ) )
    val INS_MEM = Mem(1048576, UInt(32.W))
    loadMemoryFromFile(INS_MEM , "/home/kalii/Scala-Chisel-Learning-Journey/INSTRUCTIONS_3.txt")

    io.INS_out := INS_MEM(io.INS_addr);

    printf(s"\nINS MEM \n---------------------------------------------------------------------------------------------- \n")
    printf(s"INS_addr = %d\n", io.INS_addr.asUInt)
    printf(s"INS_out  = 0x%x\n", io.INS_out.asUInt)
}