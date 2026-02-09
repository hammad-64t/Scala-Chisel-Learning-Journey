import chisel3._
import chisel3.util._


class ALU_IO_Interface extends Bundle {
    val inA = Input(SInt(32.W))
    val inB = Input(SInt(32.W))
    val ALU_CTRL = Input(UInt(5.W))

    val Branch_Out = Output(Bool())
    val OUT = Output(SInt(32.W))
}


class R5_ALU extends Module(){
    val io = IO(new ALU_IO_Interface)

    val add_addi = Wire(SInt(32.W))
    val sll_slli = Wire(SInt(32.W))
    val slt_slti = Wire(SInt(32.W))
    val sltu_sltui_bltu = Wire(SInt(32.W))
    val xor_xori = Wire(SInt(32.W))
    val srl_srli = Wire(SInt(32.W))
    val or_ori = Wire(SInt(32.W))
    val and_andi = Wire(SInt(32.W))
    val sub = Wire(SInt(32.W))
    val sra_srai = Wire(SInt(32.W))
    val beq = Wire(SInt(32.W))
    val bne = Wire(SInt(32.W))
    val blt = Wire(SInt(32.W))
    val bge = Wire(SInt(32.W))
    val bgeu = Wire(SInt(32.W))
    val jal_jalr = Wire(SInt(32.W))


    add_addi := io.inA + io.inB
    sll_slli := io.inA << io.inB(4, 0)
    slt_slti := Cat(0.U, (io.inA < io.inB)).asSInt
    sltu_sltui_bltu := Cat(0.U, (io.inA.asUInt < io.inB.asUInt)).asSInt
    xor_xori := io.inA ^ io.inB
    srl_srli := (io.inA.asUInt >> io.inB(4, 0).asUInt).asSInt
    or_ori := io.inA | io.inB
    and_andi := io.inA & io.inB
    sub := io.inA - io.inB
    sra_srai := (io.inA >> io.inB(4, 0)).asSInt
    beq := Cat(0.U, (io.inA === io.inB)).asSInt
    bne := Cat(0.U, (io.inA =/= io.inB)).asSInt
    blt := slt_slti
    // bge := Cat(0.U, ~(io.inA < io.inB)).asSInt
    // bgeu := Cat(0.U, ~(io.inA.asUInt < io.inB.asUInt)).asSInt
    bge := Cat(0.U, (io.inA >= io.inB)).asSInt
    bgeu := Cat(0.U, (io.inA.asUInt >= io.inB.asUInt)).asSInt
    jal_jalr := io.inA

    printf(s"\nALU \n------------------------------------------------------------------------------------------------- \n")
    printf(s"io.inA    = %d         bin = %b    |  %d  |  \n", io.inA, io.inA.asUInt, io.inA.asUInt)
    printf(s"io.inB    = %d         bin = %b    |  %d  |\n \n", io.inB, io.inB.asUInt, io.inB.asUInt)

    printf(s"add_addi  = %d         bin = %b\n", add_addi, add_addi.asUInt)
    printf(s"sll_slli  = %d         bin = %b\n", sll_slli, sll_slli.asUInt)
    printf(s"slt_slti  = %d         bin = %b\n", slt_slti, slt_slti.asUInt)
    printf(s"sltu_bltu = %d         bin = %b\n", sltu_sltui_bltu, sltu_sltui_bltu.asUInt)
    printf(s"xor_xori  = %d         bin = %b\n", xor_xori, xor_xori.asUInt)
    printf(s"srl_srli  = %d         bin = %b\n", srl_srli, srl_srli.asUInt)
    printf(s"or_ori    = %d         bin = %b\n", or_ori, or_ori.asUInt)
    printf(s"and_andi  = %d         bin = %b\n", and_andi, and_andi.asUInt)
    printf(s"sub       = %d         bin = %b\n", sub, sub.asUInt)
    printf(s"sra_srai  = %d         bin = %b\n", sra_srai, sra_srai.asUInt)
    printf(s"beq       = %d         bin = %b\n", beq, beq.asUInt)
    printf(s"bne       = %d         bin = %b\n", bne, bne.asUInt)
    printf(s"blt       = %d         bin = %b\n", blt, blt.asUInt)
    printf(s"bge       = %d         bin = %b\n", bge, bge.asUInt)
    printf(s"bgeu      = %d         bin = %b\n", bgeu, bgeu.asUInt)
    printf(s"jal_jalr  = %d         bin = %b\n", jal_jalr, jal_jalr.asUInt)

    io.OUT := MuxLookup(io.ALU_CTRL, 0.S, Seq(
        0.U -> add_addi, 
        1.U -> sll_slli,
        2.U -> slt_slti,
        3.U -> sltu_sltui_bltu,
        4.U -> xor_xori,
        5.U -> srl_srli,
        6.U -> or_ori,
        7.U -> and_andi,
        8.U -> sub,

        13.U -> sra_srai,
        16.U -> beq,
        17.U -> bne,

        20.U -> blt,
        21.U -> bge,
        22.U -> sltu_sltui_bltu,
        23.U -> bgeu,

        31.U -> jal_jalr
        ))

    io.Branch_Out := io.OUT === 1.S & io.ALU_CTRL(4, 3) === 2.U

    printf(s"\nio.OUT    = %d         bin = %b\n", io.OUT, io.OUT.asUInt)
    printf(s"BranchOut = %d                  bin = %b\n ", io.Branch_Out, io.Branch_Out.asUInt)

}
