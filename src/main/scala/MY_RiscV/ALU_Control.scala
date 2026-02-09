import chisel3._
import chisel3.util._


class ALU_Control_IO_Interface extends Bundle {
    val ALU_OP = Input(UInt(3.W))
    val Func3 = Input(UInt(3.W))
    val Func7 = Input(Bool())
    
    val ALU_CTRL_OUT = Output(UInt(5.W))
}


class ALU_Control extends Module(){
    val io = IO(new ALU_Control_IO_Interface)

    val ALU_OP0 = Wire(Bool())
    val ALU_OP1 = Wire(Bool())
    val ALU_OP2 = Wire(Bool())

    val Func30 = Wire(Bool())
    val Func31 = Wire(Bool())
    val Func32 = Wire(Bool())

    ALU_OP0 := io.ALU_OP(0)
    ALU_OP1 := io.ALU_OP(1)
    ALU_OP2 := io.ALU_OP(2)

    Func30 := io.Func3(0)
    Func31 := io.Func3(1)
    Func32 := io.Func3(2)

    // printf(s"\nALU_OP   = %d         bin = %b\n", io.ALU_OP, io.ALU_OP.asUInt)
    // printf(s"ALU_OP0  = %d         bin = %b\n", ALU_OP0, ALU_OP0.asUInt)
    // printf(s"ALU_OP1  = %d         bin = %b\n", ALU_OP1, ALU_OP1.asUInt)
    // printf(s"ALU_OP2  = %d         bin = %b\n", ALU_OP2, ALU_OP2.asUInt)

    // printf(s"Func3    = %d         bin = %b\n", io.Func3, io.Func3.asUInt)
    // printf(s"Func30  = %d         bin = %b\n", Func30, Func30.asUInt)
    // printf(s"Func31  = %d         bin = %b\n", Func31, Func31.asUInt)
    // printf(s"Func32  = %d         bin = %b\n", Func32, Func32.asUInt)


    val priEin = Wire(Vec(9, Bool()))

    priEin(0) := ALU_OP0 & ALU_OP1 & ~ALU_OP2
    priEin(1) := ~ALU_OP0 & ALU_OP1 & ~ALU_OP2
    priEin(2) := ~ALU_OP0 & ~ALU_OP1 & ~ALU_OP2 & ~io.Func7
    priEin(3) := ~ALU_OP0 & ~ALU_OP1 & ~ALU_OP2 & io.Func7
    priEin(4) := ~ALU_OP0 & ~ALU_OP1 & ~ALU_OP2
    priEin(8) := ALU_OP0 & ~ALU_OP1 & ~ALU_OP2
    priEin(7) := priEin(8) & Func30 & ~Func31 & Func32
    priEin(5) := priEin(7) & ~io.Func7
    priEin(6) := priEin(7) & io.Func7

    // printf(s"priEin   = %d       bin = %b\n", priEin.asUInt, priEin.asUInt)


    val PriEnc = Wire(UInt(4.W))
    PriEnc := MuxCase(9.U, Array(
        priEin(8) -> 8.U,
        priEin(7) -> 7.U,
        priEin(6) -> 6.U,
        priEin(5) -> 5.U,
        priEin(4) -> 4.U,
        priEin(3) -> 3.U,
        priEin(2) -> 2.U,
        priEin(1) -> 1.U,
        priEin(0) -> 0.U,
    ))

    // printf(s"PriEnc   = %d        bin = %b\n \n", PriEnc.asUInt, PriEnc.asUInt)

    val tempA = Wire(UInt(5.W))
    val tempB = Wire(UInt(5.W))
    tempA := io.Func3(2, 0)
    tempB := Cat(1.U, io.Func3(2, 0))

    io.ALU_CTRL_OUT := MuxLookup(PriEnc.asUInt, 0.U, Seq(
        0.U -> 0x1f.U, 
        1.U -> Cat(2.U, io.Func3(2, 0)),
        2.U -> tempA,
        3.U -> tempB,
        4.U -> tempA,
        5.U -> tempA,
        6.U -> tempB,
        7.U -> tempA,
        8.U -> tempA,
        9.U -> 0.U,
    ))


    printf(s"\nALU CTRL \n-------------------------------------------------------------------------------------------- \n")
    printf(s"ALU_OP   = %d         bin = %b\n", io.ALU_OP, io.ALU_OP.asUInt)
    printf(s"Func3    = %d         bin = %b\n", io.Func3, io.Func3.asUInt)
    printf(s"Func7    = %d         bin = %b\n", io.Func7, io.Func7.asUInt)
    printf(s"priEin   = %d       bin = %b\n", priEin.asUInt, priEin.asUInt)
    printf(s"PriEnc   = %d        bin = %b\n", PriEnc.asUInt, PriEnc.asUInt)
    printf(s"ALU_CTRL_OUT   = %d  bin = %b\n \n", io.ALU_CTRL_OUT.asUInt, io.ALU_CTRL_OUT.asUInt)
}