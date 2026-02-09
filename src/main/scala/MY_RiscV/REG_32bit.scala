import chisel3._
import chisel3.util._


class REG_32bit_IO_Interface extends Bundle {
    val REG_Write_Addr = Input(UInt(5.W))
    val REG_Read1_Addr = Input(UInt(5.W))
    val REG_Read2_Addr = Input(UInt(5.W))

    val REG_Write = Input(Bool())

    val REG_WRITE_DATA = Input(SInt(32.W))

    val REG_READ1 = Output(SInt(32.W))
    val REG_READ2 = Output(SInt(32.W))
}


class REG_32bit extends Module(){
    val io = IO(new REG_32bit_IO_Interface)

    // val REG_32x32bit = Reg(Vec(32, SInt(32.W)))
    val REG_32x32bit = RegInit(VecInit(Seq.fill(32)(0.S(32.W))))

    io.REG_READ1 := Mux(io.REG_Read1_Addr === 0.U, 0.S, REG_32x32bit(io.REG_Read1_Addr))
    io.REG_READ2 := Mux(io.REG_Read2_Addr === 0.U, 0.S, REG_32x32bit(io.REG_Read2_Addr))

    when(io.REG_Write & io.REG_Write_Addr =/= 0.U){
        REG_32x32bit(io.REG_Write_Addr) := io.REG_WRITE_DATA
    }

    printf(s"\nREG 32 bit \n------------------------------------------------------------------------------------------ \n")
    printf(s"REG_Write = %d\n", io.REG_Write.asUInt)
    
    printf(s"REG_Write_Addr   = %d      ", io.REG_Write_Addr.asUInt)
    printf(s"REG_WRITE_DATA = %d  bin = %b\n", io.REG_WRITE_DATA.asSInt, io.REG_WRITE_DATA.asUInt)

    printf(s"REG_Read1_Addr   = %d      ", io.REG_Read1_Addr.asUInt)
    printf(s"REG_READ1      = %d  bin = %b\n", io.REG_READ1.asSInt, io.REG_READ1.asUInt)

    printf(s"REG_Read2_Addr   = %d      ", io.REG_Read2_Addr.asUInt)
    printf(s"REG_READ2      = %d  bin = %b\n \n", io.REG_READ2.asSInt, io.REG_READ2.asUInt)
}

