import chisel3._
import chisel3.util._


class ALU_IO extends Bundle {
    val ALU_OP = Input(UInt(3.W))
    val Func3 = Input(UInt(3.W))
    val Func7 = Input(Bool())
    
    val inA = Input(SInt(32.W))
    val inB = Input(SInt(32.W))
    val ALU_CTRL = Input(UInt(5.W))

    val Branch_Out = Output(Bool())
    val OUT = Output(SInt(32.W))
}


class ALU extends Module(){
    val io = IO(new ALU_IO)
    
    val alu_ctrl = Module(new ALU_Control)
    val alu = Module(new R5_ALU)

    alu_ctrl.io.ALU_OP := io.ALU_OP
    alu_ctrl.io.Func3 := io.Func3
    alu_ctrl.io.Func7 := io.Func7

    alu.io.inA := io.inA
    alu.io.inB := io.inB
    alu.io.ALU_CTRL := alu_ctrl.io.ALU_CTRL_OUT

    io.Branch_Out := alu.io.Branch_Out
    io.OUT := alu.io.OUT
}