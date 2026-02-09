module REG_32bit(
  input         clock,
  input         reset,
  input  [4:0]  io_REG_Write_Addr,
  input  [4:0]  io_REG_Read1_Addr,
  input  [4:0]  io_REG_Read2_Addr,
  input         io_REG_Write,
  input  [31:0] io_REG_WRITE_DATA,
  output [31:0] io_REG_READ1,
  output [31:0] io_REG_READ2
);
`ifdef RANDOMIZE_REG_INIT
  reg [31:0] _RAND_0;
  reg [31:0] _RAND_1;
  reg [31:0] _RAND_2;
  reg [31:0] _RAND_3;
  reg [31:0] _RAND_4;
  reg [31:0] _RAND_5;
  reg [31:0] _RAND_6;
  reg [31:0] _RAND_7;
  reg [31:0] _RAND_8;
  reg [31:0] _RAND_9;
  reg [31:0] _RAND_10;
  reg [31:0] _RAND_11;
  reg [31:0] _RAND_12;
  reg [31:0] _RAND_13;
  reg [31:0] _RAND_14;
  reg [31:0] _RAND_15;
  reg [31:0] _RAND_16;
  reg [31:0] _RAND_17;
  reg [31:0] _RAND_18;
  reg [31:0] _RAND_19;
  reg [31:0] _RAND_20;
  reg [31:0] _RAND_21;
  reg [31:0] _RAND_22;
  reg [31:0] _RAND_23;
  reg [31:0] _RAND_24;
  reg [31:0] _RAND_25;
  reg [31:0] _RAND_26;
  reg [31:0] _RAND_27;
  reg [31:0] _RAND_28;
  reg [31:0] _RAND_29;
  reg [31:0] _RAND_30;
  reg [31:0] _RAND_31;
`endif // RANDOMIZE_REG_INIT
  reg [31:0] REG_32x32bit_0; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_1; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_2; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_3; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_4; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_5; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_6; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_7; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_8; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_9; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_10; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_11; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_12; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_13; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_14; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_15; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_16; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_17; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_18; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_19; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_20; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_21; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_22; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_23; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_24; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_25; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_26; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_27; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_28; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_29; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_30; // @[REG_32bit.scala 23:31]
  reg [31:0] REG_32x32bit_31; // @[REG_32bit.scala 23:31]
  wire [31:0] _GEN_1 = 5'h1 == io_REG_Read1_Addr ? $signed(REG_32x32bit_1) : $signed(REG_32x32bit_0); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_2 = 5'h2 == io_REG_Read1_Addr ? $signed(REG_32x32bit_2) : $signed(_GEN_1); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_3 = 5'h3 == io_REG_Read1_Addr ? $signed(REG_32x32bit_3) : $signed(_GEN_2); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_4 = 5'h4 == io_REG_Read1_Addr ? $signed(REG_32x32bit_4) : $signed(_GEN_3); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_5 = 5'h5 == io_REG_Read1_Addr ? $signed(REG_32x32bit_5) : $signed(_GEN_4); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_6 = 5'h6 == io_REG_Read1_Addr ? $signed(REG_32x32bit_6) : $signed(_GEN_5); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_7 = 5'h7 == io_REG_Read1_Addr ? $signed(REG_32x32bit_7) : $signed(_GEN_6); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_8 = 5'h8 == io_REG_Read1_Addr ? $signed(REG_32x32bit_8) : $signed(_GEN_7); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_9 = 5'h9 == io_REG_Read1_Addr ? $signed(REG_32x32bit_9) : $signed(_GEN_8); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_10 = 5'ha == io_REG_Read1_Addr ? $signed(REG_32x32bit_10) : $signed(_GEN_9); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_11 = 5'hb == io_REG_Read1_Addr ? $signed(REG_32x32bit_11) : $signed(_GEN_10); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_12 = 5'hc == io_REG_Read1_Addr ? $signed(REG_32x32bit_12) : $signed(_GEN_11); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_13 = 5'hd == io_REG_Read1_Addr ? $signed(REG_32x32bit_13) : $signed(_GEN_12); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_14 = 5'he == io_REG_Read1_Addr ? $signed(REG_32x32bit_14) : $signed(_GEN_13); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_15 = 5'hf == io_REG_Read1_Addr ? $signed(REG_32x32bit_15) : $signed(_GEN_14); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_16 = 5'h10 == io_REG_Read1_Addr ? $signed(REG_32x32bit_16) : $signed(_GEN_15); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_17 = 5'h11 == io_REG_Read1_Addr ? $signed(REG_32x32bit_17) : $signed(_GEN_16); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_18 = 5'h12 == io_REG_Read1_Addr ? $signed(REG_32x32bit_18) : $signed(_GEN_17); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_19 = 5'h13 == io_REG_Read1_Addr ? $signed(REG_32x32bit_19) : $signed(_GEN_18); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_20 = 5'h14 == io_REG_Read1_Addr ? $signed(REG_32x32bit_20) : $signed(_GEN_19); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_21 = 5'h15 == io_REG_Read1_Addr ? $signed(REG_32x32bit_21) : $signed(_GEN_20); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_22 = 5'h16 == io_REG_Read1_Addr ? $signed(REG_32x32bit_22) : $signed(_GEN_21); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_23 = 5'h17 == io_REG_Read1_Addr ? $signed(REG_32x32bit_23) : $signed(_GEN_22); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_24 = 5'h18 == io_REG_Read1_Addr ? $signed(REG_32x32bit_24) : $signed(_GEN_23); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_25 = 5'h19 == io_REG_Read1_Addr ? $signed(REG_32x32bit_25) : $signed(_GEN_24); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_26 = 5'h1a == io_REG_Read1_Addr ? $signed(REG_32x32bit_26) : $signed(_GEN_25); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_27 = 5'h1b == io_REG_Read1_Addr ? $signed(REG_32x32bit_27) : $signed(_GEN_26); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_28 = 5'h1c == io_REG_Read1_Addr ? $signed(REG_32x32bit_28) : $signed(_GEN_27); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_29 = 5'h1d == io_REG_Read1_Addr ? $signed(REG_32x32bit_29) : $signed(_GEN_28); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_30 = 5'h1e == io_REG_Read1_Addr ? $signed(REG_32x32bit_30) : $signed(_GEN_29); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_31 = 5'h1f == io_REG_Read1_Addr ? $signed(REG_32x32bit_31) : $signed(_GEN_30); // @[REG_32bit.scala 25:{24,24}]
  wire [31:0] _GEN_33 = 5'h1 == io_REG_Read2_Addr ? $signed(REG_32x32bit_1) : $signed(REG_32x32bit_0); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_34 = 5'h2 == io_REG_Read2_Addr ? $signed(REG_32x32bit_2) : $signed(_GEN_33); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_35 = 5'h3 == io_REG_Read2_Addr ? $signed(REG_32x32bit_3) : $signed(_GEN_34); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_36 = 5'h4 == io_REG_Read2_Addr ? $signed(REG_32x32bit_4) : $signed(_GEN_35); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_37 = 5'h5 == io_REG_Read2_Addr ? $signed(REG_32x32bit_5) : $signed(_GEN_36); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_38 = 5'h6 == io_REG_Read2_Addr ? $signed(REG_32x32bit_6) : $signed(_GEN_37); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_39 = 5'h7 == io_REG_Read2_Addr ? $signed(REG_32x32bit_7) : $signed(_GEN_38); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_40 = 5'h8 == io_REG_Read2_Addr ? $signed(REG_32x32bit_8) : $signed(_GEN_39); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_41 = 5'h9 == io_REG_Read2_Addr ? $signed(REG_32x32bit_9) : $signed(_GEN_40); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_42 = 5'ha == io_REG_Read2_Addr ? $signed(REG_32x32bit_10) : $signed(_GEN_41); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_43 = 5'hb == io_REG_Read2_Addr ? $signed(REG_32x32bit_11) : $signed(_GEN_42); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_44 = 5'hc == io_REG_Read2_Addr ? $signed(REG_32x32bit_12) : $signed(_GEN_43); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_45 = 5'hd == io_REG_Read2_Addr ? $signed(REG_32x32bit_13) : $signed(_GEN_44); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_46 = 5'he == io_REG_Read2_Addr ? $signed(REG_32x32bit_14) : $signed(_GEN_45); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_47 = 5'hf == io_REG_Read2_Addr ? $signed(REG_32x32bit_15) : $signed(_GEN_46); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_48 = 5'h10 == io_REG_Read2_Addr ? $signed(REG_32x32bit_16) : $signed(_GEN_47); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_49 = 5'h11 == io_REG_Read2_Addr ? $signed(REG_32x32bit_17) : $signed(_GEN_48); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_50 = 5'h12 == io_REG_Read2_Addr ? $signed(REG_32x32bit_18) : $signed(_GEN_49); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_51 = 5'h13 == io_REG_Read2_Addr ? $signed(REG_32x32bit_19) : $signed(_GEN_50); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_52 = 5'h14 == io_REG_Read2_Addr ? $signed(REG_32x32bit_20) : $signed(_GEN_51); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_53 = 5'h15 == io_REG_Read2_Addr ? $signed(REG_32x32bit_21) : $signed(_GEN_52); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_54 = 5'h16 == io_REG_Read2_Addr ? $signed(REG_32x32bit_22) : $signed(_GEN_53); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_55 = 5'h17 == io_REG_Read2_Addr ? $signed(REG_32x32bit_23) : $signed(_GEN_54); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_56 = 5'h18 == io_REG_Read2_Addr ? $signed(REG_32x32bit_24) : $signed(_GEN_55); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_57 = 5'h19 == io_REG_Read2_Addr ? $signed(REG_32x32bit_25) : $signed(_GEN_56); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_58 = 5'h1a == io_REG_Read2_Addr ? $signed(REG_32x32bit_26) : $signed(_GEN_57); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_59 = 5'h1b == io_REG_Read2_Addr ? $signed(REG_32x32bit_27) : $signed(_GEN_58); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_60 = 5'h1c == io_REG_Read2_Addr ? $signed(REG_32x32bit_28) : $signed(_GEN_59); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_61 = 5'h1d == io_REG_Read2_Addr ? $signed(REG_32x32bit_29) : $signed(_GEN_60); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_62 = 5'h1e == io_REG_Read2_Addr ? $signed(REG_32x32bit_30) : $signed(_GEN_61); // @[REG_32bit.scala 26:{24,24}]
  wire [31:0] _GEN_63 = 5'h1f == io_REG_Read2_Addr ? $signed(REG_32x32bit_31) : $signed(_GEN_62); // @[REG_32bit.scala 26:{24,24}]
  wire  _T_3 = ~reset; // @[REG_32bit.scala 33:11]
  assign io_REG_READ1 = io_REG_Read1_Addr == 5'h0 ? $signed(32'sh0) : $signed(_GEN_31); // @[REG_32bit.scala 25:24]
  assign io_REG_READ2 = io_REG_Read2_Addr == 5'h0 ? $signed(32'sh0) : $signed(_GEN_63); // @[REG_32bit.scala 26:24]
  always @(posedge clock) begin
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_0 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h0 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_0 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_1 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h1 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_1 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_2 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h2 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_2 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_3 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h3 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_3 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_4 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h4 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_4 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_5 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h5 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_5 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_6 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h6 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_6 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_7 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h7 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_7 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_8 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h8 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_8 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_9 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h9 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_9 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_10 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'ha == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_10 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_11 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'hb == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_11 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_12 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'hc == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_12 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_13 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'hd == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_13 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_14 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'he == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_14 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_15 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'hf == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_15 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_16 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h10 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_16 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_17 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h11 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_17 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_18 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h12 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_18 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_19 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h13 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_19 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_20 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h14 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_20 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_21 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h15 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_21 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_22 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h16 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_22 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_23 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h17 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_23 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_24 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h18 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_24 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_25 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h19 == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_25 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_26 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h1a == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_26 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_27 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h1b == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_27 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_28 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h1c == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_28 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_29 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h1d == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_29 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_30 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h1e == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_30 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    if (reset) begin // @[REG_32bit.scala 23:31]
      REG_32x32bit_31 <= 32'sh0; // @[REG_32bit.scala 23:31]
    end else if (io_REG_Write & io_REG_Write_Addr != 5'h0) begin // @[REG_32bit.scala 28:51]
      if (5'h1f == io_REG_Write_Addr) begin // @[REG_32bit.scala 29:41]
        REG_32x32bit_31 <= io_REG_WRITE_DATA; // @[REG_32bit.scala 29:41]
      end
    end
    `ifndef SYNTHESIS
    `ifdef PRINTF_COND
      if (`PRINTF_COND) begin
    `endif
        if (~reset) begin
          $fwrite(32'h80000002,"REG_Write = %d\n",io_REG_Write); // @[REG_32bit.scala 33:11]
        end
    `ifdef PRINTF_COND
      end
    `endif
    `endif // SYNTHESIS
    `ifndef SYNTHESIS
    `ifdef PRINTF_COND
      if (`PRINTF_COND) begin
    `endif
        if (_T_3) begin
          $fwrite(32'h80000002,"REG_Write_Addr   = %d      ",io_REG_Write_Addr); // @[REG_32bit.scala 35:11]
        end
    `ifdef PRINTF_COND
      end
    `endif
    `endif // SYNTHESIS
    `ifndef SYNTHESIS
    `ifdef PRINTF_COND
      if (`PRINTF_COND) begin
    `endif
        if (_T_3) begin
          $fwrite(32'h80000002,"REG_WRITE_DATA = %d  bin = %b\n",io_REG_WRITE_DATA,io_REG_WRITE_DATA); // @[REG_32bit.scala 36:11]
        end
    `ifdef PRINTF_COND
      end
    `endif
    `endif // SYNTHESIS
    `ifndef SYNTHESIS
    `ifdef PRINTF_COND
      if (`PRINTF_COND) begin
    `endif
        if (_T_3) begin
          $fwrite(32'h80000002,"REG_Read1_Addr   = %d      ",io_REG_Read1_Addr); // @[REG_32bit.scala 38:11]
        end
    `ifdef PRINTF_COND
      end
    `endif
    `endif // SYNTHESIS
    `ifndef SYNTHESIS
    `ifdef PRINTF_COND
      if (`PRINTF_COND) begin
    `endif
        if (_T_3) begin
          $fwrite(32'h80000002,"REG_READ1      = %d  bin = %b\n",io_REG_READ1,io_REG_READ1); // @[REG_32bit.scala 39:11]
        end
    `ifdef PRINTF_COND
      end
    `endif
    `endif // SYNTHESIS
    `ifndef SYNTHESIS
    `ifdef PRINTF_COND
      if (`PRINTF_COND) begin
    `endif
        if (_T_3) begin
          $fwrite(32'h80000002,"REG_Read2_Addr   = %d      ",io_REG_Read2_Addr); // @[REG_32bit.scala 41:11]
        end
    `ifdef PRINTF_COND
      end
    `endif
    `endif // SYNTHESIS
    `ifndef SYNTHESIS
    `ifdef PRINTF_COND
      if (`PRINTF_COND) begin
    `endif
        if (_T_3) begin
          $fwrite(32'h80000002,"REG_READ2      = %d  bin = %b\n \n",io_REG_READ2,io_REG_READ2); // @[REG_32bit.scala 42:11]
        end
    `ifdef PRINTF_COND
      end
    `endif
    `endif // SYNTHESIS
  end
// Register and memory initialization
`ifdef RANDOMIZE_GARBAGE_ASSIGN
`define RANDOMIZE
`endif
`ifdef RANDOMIZE_INVALID_ASSIGN
`define RANDOMIZE
`endif
`ifdef RANDOMIZE_REG_INIT
`define RANDOMIZE
`endif
`ifdef RANDOMIZE_MEM_INIT
`define RANDOMIZE
`endif
`ifndef RANDOM
`define RANDOM $random
`endif
`ifdef RANDOMIZE_MEM_INIT
  integer initvar;
`endif
`ifndef SYNTHESIS
`ifdef FIRRTL_BEFORE_INITIAL
`FIRRTL_BEFORE_INITIAL
`endif
initial begin
  `ifdef RANDOMIZE
    `ifdef INIT_RANDOM
      `INIT_RANDOM
    `endif
    `ifndef VERILATOR
      `ifdef RANDOMIZE_DELAY
        #`RANDOMIZE_DELAY begin end
      `else
        #0.002 begin end
      `endif
    `endif
`ifdef RANDOMIZE_REG_INIT
  _RAND_0 = {1{`RANDOM}};
  REG_32x32bit_0 = _RAND_0[31:0];
  _RAND_1 = {1{`RANDOM}};
  REG_32x32bit_1 = _RAND_1[31:0];
  _RAND_2 = {1{`RANDOM}};
  REG_32x32bit_2 = _RAND_2[31:0];
  _RAND_3 = {1{`RANDOM}};
  REG_32x32bit_3 = _RAND_3[31:0];
  _RAND_4 = {1{`RANDOM}};
  REG_32x32bit_4 = _RAND_4[31:0];
  _RAND_5 = {1{`RANDOM}};
  REG_32x32bit_5 = _RAND_5[31:0];
  _RAND_6 = {1{`RANDOM}};
  REG_32x32bit_6 = _RAND_6[31:0];
  _RAND_7 = {1{`RANDOM}};
  REG_32x32bit_7 = _RAND_7[31:0];
  _RAND_8 = {1{`RANDOM}};
  REG_32x32bit_8 = _RAND_8[31:0];
  _RAND_9 = {1{`RANDOM}};
  REG_32x32bit_9 = _RAND_9[31:0];
  _RAND_10 = {1{`RANDOM}};
  REG_32x32bit_10 = _RAND_10[31:0];
  _RAND_11 = {1{`RANDOM}};
  REG_32x32bit_11 = _RAND_11[31:0];
  _RAND_12 = {1{`RANDOM}};
  REG_32x32bit_12 = _RAND_12[31:0];
  _RAND_13 = {1{`RANDOM}};
  REG_32x32bit_13 = _RAND_13[31:0];
  _RAND_14 = {1{`RANDOM}};
  REG_32x32bit_14 = _RAND_14[31:0];
  _RAND_15 = {1{`RANDOM}};
  REG_32x32bit_15 = _RAND_15[31:0];
  _RAND_16 = {1{`RANDOM}};
  REG_32x32bit_16 = _RAND_16[31:0];
  _RAND_17 = {1{`RANDOM}};
  REG_32x32bit_17 = _RAND_17[31:0];
  _RAND_18 = {1{`RANDOM}};
  REG_32x32bit_18 = _RAND_18[31:0];
  _RAND_19 = {1{`RANDOM}};
  REG_32x32bit_19 = _RAND_19[31:0];
  _RAND_20 = {1{`RANDOM}};
  REG_32x32bit_20 = _RAND_20[31:0];
  _RAND_21 = {1{`RANDOM}};
  REG_32x32bit_21 = _RAND_21[31:0];
  _RAND_22 = {1{`RANDOM}};
  REG_32x32bit_22 = _RAND_22[31:0];
  _RAND_23 = {1{`RANDOM}};
  REG_32x32bit_23 = _RAND_23[31:0];
  _RAND_24 = {1{`RANDOM}};
  REG_32x32bit_24 = _RAND_24[31:0];
  _RAND_25 = {1{`RANDOM}};
  REG_32x32bit_25 = _RAND_25[31:0];
  _RAND_26 = {1{`RANDOM}};
  REG_32x32bit_26 = _RAND_26[31:0];
  _RAND_27 = {1{`RANDOM}};
  REG_32x32bit_27 = _RAND_27[31:0];
  _RAND_28 = {1{`RANDOM}};
  REG_32x32bit_28 = _RAND_28[31:0];
  _RAND_29 = {1{`RANDOM}};
  REG_32x32bit_29 = _RAND_29[31:0];
  _RAND_30 = {1{`RANDOM}};
  REG_32x32bit_30 = _RAND_30[31:0];
  _RAND_31 = {1{`RANDOM}};
  REG_32x32bit_31 = _RAND_31[31:0];
`endif // RANDOMIZE_REG_INIT
  `endif // RANDOMIZE
end // initial
`ifdef FIRRTL_AFTER_INITIAL
`FIRRTL_AFTER_INITIAL
`endif
`endif // SYNTHESIS
endmodule
