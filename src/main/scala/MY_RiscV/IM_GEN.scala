
import chisel3._
import chisel3.util._


class IM_IO_Interface extends Bundle {
    val INS = Input(UInt(32.W))
    val PC = Input(UInt(32.W))

    val S_imm = Output(SInt(32.W))
    val SB_imm = Output(SInt(32.W))
    val U_imm = Output(SInt(32.W))
    val UJ_type = Output(SInt(32.W))
    val I_imm = Output(SInt(32.W))
}


class IM_GEN extends Module(){
    val io = IO(new IM_IO_Interface)
    
    val x = Wire(SInt())
    // val x = Wire(SInt(32.W))
    // x := 42.U

    io.I_imm := io.INS(31,20).asSInt

    val highV = io.INS(31,25)
    val lowV = io.INS(11,7)

    io.S_imm := Cat(highV, lowV).asSInt

    val temp = Wire(SInt(32.W))
    temp := io.INS(31,12).asSInt
    io.U_imm := (temp << 12)

    val temp1 = Cat(highV(6), lowV(0), highV(5,0), lowV(4,1), 0.S).asSInt
    io.SB_imm := (temp1.asSInt + io.PC.asSInt)

    val temp2 = Cat(io.INS(31), io.INS(19,12), io.INS(20), io.INS(30,21), 0.S).asSInt
    io.UJ_type := (temp2.asSInt + io.PC.asSInt)
    x := io.UJ_type

    printf(s"\nIM GEN \n----------------------------------------------------------------------------------------------- \n")
    printf(s"S_imm = %d     |   %b\n", io.S_imm, io.S_imm.asUInt)
    printf(s"SB_imm = %d    |   %b\n", io.SB_imm, io.SB_imm.asUInt)
    printf(s"U_imm = %d     |   %b\n", io.U_imm, io.U_imm.asUInt)
    printf(s"UJ_type = %d   |   %b\n", io.UJ_type, io.UJ_type.asUInt)
    printf(s"I_imm = %d     |   %b\n", io.I_imm, io.I_imm.asUInt)
    


    // printf(s"\nx = %d\n", x)      //prints dec
    // printf(s"x bits = %b\n", x.asUInt)      //prints raw bin
    // printf(s"x = 0x%x\n", x)    //prints hex
    // printf(s"x = %b\n", x)      //prints bin

}