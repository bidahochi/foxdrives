//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: me
// Created on: 01.01.2026 - 00:02:45
// Last changed on: 01.01.2026 - 00:02:45

package bidahochi.foxdrives.models; //Path where the model is located

import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelD250 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelD250() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[332];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 192, 6, textureX, textureY); // fueling my tank
		bodyModel[1] = new ModelRendererTurbo(this, 58, 30, textureX, textureY); // Box 175
		bodyModel[2] = new ModelRendererTurbo(this, 58, 30, textureX, textureY); // Box 176
		bodyModel[3] = new ModelRendererTurbo(this, 58, 26, textureX, textureY); // Box 177
		bodyModel[4] = new ModelRendererTurbo(this, 58, 26, textureX, textureY); // Box 327
		bodyModel[5] = new ModelRendererTurbo(this, 91, 12, textureX, textureY); // Box 494 BIG HOSS MUFFLER (SIZE OF TORSO)
		bodyModel[6] = new ModelRendererTurbo(this, 59, 15, textureX, textureY); // Complete power loss
		bodyModel[7] = new ModelRendererTurbo(this, 81, 15, textureX, textureY); // Complete power loss
		bodyModel[8] = new ModelRendererTurbo(this, 81, 15, textureX, textureY); // Complete power loss
		bodyModel[9] = new ModelRendererTurbo(this, 59, 9, textureX, textureY); // PIPE WITH NO CAT (unmodeled)
		bodyModel[10] = new ModelRendererTurbo(this, 72, 15, textureX, textureY); // PIPE WITH NO CAT (unmodeled)
		bodyModel[11] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 511
		bodyModel[12] = new ModelRendererTurbo(this, 79, 26, textureX, textureY); // Box 513
		bodyModel[13] = new ModelRendererTurbo(this, 106, 210, textureX, textureY); // Wheelwell
		bodyModel[14] = new ModelRendererTurbo(this, 11, 238, textureX, textureY); // Wheelwell
		bodyModel[15] = new ModelRendererTurbo(this, 0, 202, textureX, textureY); // Box 797
		bodyModel[16] = new ModelRendererTurbo(this, 23, 220, textureX, textureY); // Box 798
		bodyModel[17] = new ModelRendererTurbo(this, 92, 207, textureX, textureY,"rightTurnLight"); // taillight R
		bodyModel[18] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Box 813
		bodyModel[19] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Wheelwell
		bodyModel[20] = new ModelRendererTurbo(this, 192, 0, textureX, textureY); // Aftermarket Hitch Mount
		bodyModel[21] = new ModelRendererTurbo(this, 213, 6, textureX, textureY); // Aftermarket Hitch Mount
		bodyModel[22] = new ModelRendererTurbo(this, 187, 9, textureX, textureY); // Towpower Hitch
		bodyModel[23] = new ModelRendererTurbo(this, 187, 6, textureX, textureY); // Towpower Hitch
		bodyModel[24] = new ModelRendererTurbo(this, 187, 3, textureX, textureY); // Towpower Hitch
		bodyModel[25] = new ModelRendererTurbo(this, 187, 0, textureX, textureY); // 2" ball
		bodyModel[26] = new ModelRendererTurbo(this, 102, 203, textureX, textureY); // Box 830 rear emblem
		bodyModel[27] = new ModelRendererTurbo(this, 151, 116, textureX, textureY); // Box 832
		bodyModel[28] = new ModelRendererTurbo(this, 11, 238, textureX, textureY); // Box 235
		bodyModel[29] = new ModelRendererTurbo(this, 0, 234, textureX, textureY); // Box 236
		bodyModel[30] = new ModelRendererTurbo(this, 93, 20, textureX, textureY); // Box 552
		bodyModel[31] = new ModelRendererTurbo(this, 93, 20, textureX, textureY); // Box 553
		bodyModel[32] = new ModelRendererTurbo(this, 192, 3, textureX, textureY); // Aftermarket Hitch Mount
		bodyModel[33] = new ModelRendererTurbo(this, 58, 22, textureX, textureY); // Box 556
		bodyModel[34] = new ModelRendererTurbo(this, 58, 22, textureX, textureY); // Box 557
		bodyModel[35] = new ModelRendererTurbo(this, 130, 23, textureX, textureY); // Box 558
		bodyModel[36] = new ModelRendererTurbo(this, 121, 23, textureX, textureY); // Box 561 engine cradle/suspension point or something
		bodyModel[37] = new ModelRendererTurbo(this, 144, 4, textureX, textureY); // Box 275 The outcome will SHOCK you
		bodyModel[38] = new ModelRendererTurbo(this, 144, 4, textureX, textureY); // Box 275 The outcome will SHOCK you
		bodyModel[39] = new ModelRendererTurbo(this, 86, 22, textureX, textureY); // Box 276
		bodyModel[40] = new ModelRendererTurbo(this, 86, 22, textureX, textureY); // Box 277
		bodyModel[41] = new ModelRendererTurbo(this, 192, 0, textureX, textureY); // Box 278
		bodyModel[42] = new ModelRendererTurbo(this, 192, 3, textureX, textureY); // Box 279
		bodyModel[43] = new ModelRendererTurbo(this, 26, 119, textureX, textureY); // plate
		bodyModel[44] = new ModelRendererTurbo(this, 64, 202, textureX, textureY); // Box 289
		bodyModel[45] = new ModelRendererTurbo(this, 83, 167, textureX, textureY); // Box 296
		bodyModel[46] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 340
		bodyModel[47] = new ModelRendererTurbo(this, 79, 26, textureX, textureY); // Box 341
		bodyModel[48] = new ModelRendererTurbo(this, 106, 175, textureX, textureY); // Box 348
		bodyModel[49] = new ModelRendererTurbo(this, 97, 207, textureX, textureY,"reverseLight"); // reverse light
		bodyModel[50] = new ModelRendererTurbo(this, 83, 187, textureX, textureY); // Box 354
		bodyModel[51] = new ModelRendererTurbo(this, 83, 173, textureX, textureY); // Box 366
		bodyModel[52] = new ModelRendererTurbo(this, 77, 210, textureX, textureY); // Box 367
		bodyModel[53] = new ModelRendererTurbo(this, 77, 210, textureX, textureY); // Box 368
		bodyModel[54] = new ModelRendererTurbo(this, 64, 210, textureX, textureY); // Box 242
		bodyModel[55] = new ModelRendererTurbo(this, 64, 197, textureX, textureY); // Box 91
		bodyModel[56] = new ModelRendererTurbo(this, 104, 167, textureX, textureY); // Box 92
		bodyModel[57] = new ModelRendererTurbo(this, 83, 184, textureX, textureY); // Box 95
		bodyModel[58] = new ModelRendererTurbo(this, 104, 173, textureX, textureY); // Box 98
		bodyModel[59] = new ModelRendererTurbo(this, 77, 207, textureX, textureY); // Box 99
		bodyModel[60] = new ModelRendererTurbo(this, 77, 207, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 64, 207, textureX, textureY); // Box 101
		bodyModel[62] = new ModelRendererTurbo(this, 88, 202, textureX, textureY); // Box 105
		bodyModel[63] = new ModelRendererTurbo(this, 106, 210, textureX, textureY); // Box 106
		bodyModel[64] = new ModelRendererTurbo(this, 106, 210, textureX, textureY); // Box 107
		bodyModel[65] = new ModelRendererTurbo(this, 97, 197, textureX, textureY); // Box 108
		bodyModel[66] = new ModelRendererTurbo(this, 88, 197, textureX, textureY); // Box 109
		bodyModel[67] = new ModelRendererTurbo(this, 5, 119, textureX, textureY); // Box 110
		bodyModel[68] = new ModelRendererTurbo(this, 0, 119, textureX, textureY); // Box 111
		bodyModel[69] = new ModelRendererTurbo(this, 0, 119, textureX, textureY); // Box 112
		bodyModel[70] = new ModelRendererTurbo(this, 6, 121, textureX, textureY); // Box 113
		bodyModel[71] = new ModelRendererTurbo(this, 80, 159, textureX, textureY); // Box 114
		bodyModel[72] = new ModelRendererTurbo(this, 82, 211, textureX, textureY); // Box 115
		bodyModel[73] = new ModelRendererTurbo(this, 80, 163, textureX, textureY); // Box 116
		bodyModel[74] = new ModelRendererTurbo(this, 82, 207, textureX, textureY); // Box 117
		bodyModel[75] = new ModelRendererTurbo(this, 92, 207, textureX, textureY,"leftTurnLight"); // Taillight L
		bodyModel[76] = new ModelRendererTurbo(this, 97, 207, textureX, textureY,"reverseLight"); // reverse light
		bodyModel[77] = new ModelRendererTurbo(this, 73, 173, textureX, textureY); // Box 149
		bodyModel[78] = new ModelRendererTurbo(this, 75, 184, textureX, textureY); // Box 151
		bodyModel[79] = new ModelRendererTurbo(this, 75, 163, textureX, textureY); // Box 152
		bodyModel[80] = new ModelRendererTurbo(this, 70, 163, textureX, textureY); // Box 154
		bodyModel[81] = new ModelRendererTurbo(this, 68, 173, textureX, textureY); // Box 155
		bodyModel[82] = new ModelRendererTurbo(this, 70, 184, textureX, textureY); // Box 156
		bodyModel[83] = new ModelRendererTurbo(this, 39, 163, textureX, textureY); // Box 157
		bodyModel[84] = new ModelRendererTurbo(this, 39, 173, textureX, textureY); // Box 158
		bodyModel[85] = new ModelRendererTurbo(this, 41, 179, textureX, textureY); // Box 159
		bodyModel[86] = new ModelRendererTurbo(this, 32, 179, textureX, textureY); // Box 160
		bodyModel[87] = new ModelRendererTurbo(this, 0, 181, textureX, textureY); // Box 161
		bodyModel[88] = new ModelRendererTurbo(this, 17, 176, textureX, textureY); // Box 162
		bodyModel[89] = new ModelRendererTurbo(this, 32, 176, textureX, textureY); // Box 163
		bodyModel[90] = new ModelRendererTurbo(this, 23, 182, textureX, textureY); // Box 164
		bodyModel[91] = new ModelRendererTurbo(this, 7, 199, textureX, textureY); // Box 165
		bodyModel[92] = new ModelRendererTurbo(this, 10, 182, textureX, textureY); // Box 166
		bodyModel[93] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 167
		bodyModel[94] = new ModelRendererTurbo(this, 32, 184, textureX, textureY); // Box 168
		bodyModel[95] = new ModelRendererTurbo(this, 0, 199, textureX, textureY); // Box 170
		bodyModel[96] = new ModelRendererTurbo(this, 22, 112, textureX, textureY); // Stock Bumper
		bodyModel[97] = new ModelRendererTurbo(this, 17, 112, textureX, textureY); // Stock Bumper
		bodyModel[98] = new ModelRendererTurbo(this, 26, 141, textureX, textureY); // Box 176
		bodyModel[99] = new ModelRendererTurbo(this, 168, 0, textureX, textureY); // Box 177
		bodyModel[100] = new ModelRendererTurbo(this, 22, 112, textureX, textureY); // Stock Bumper
		bodyModel[101] = new ModelRendererTurbo(this, 17, 112, textureX, textureY); // Stock Bumper
		bodyModel[102] = new ModelRendererTurbo(this, 36, 113, textureX, textureY); // Stock Bumper
		bodyModel[103] = new ModelRendererTurbo(this, 17, 116, textureX, textureY); // Stock Bumper
		bodyModel[104] = new ModelRendererTurbo(this, 17, 116, textureX, textureY); // Stock Bumper
		bodyModel[105] = new ModelRendererTurbo(this, 31, 115, textureX, textureY); // Stock Bumper
		bodyModel[106] = new ModelRendererTurbo(this, 31, 115, textureX, textureY); // Stock Bumper
		bodyModel[107] = new ModelRendererTurbo(this, 49, 111, textureX, textureY); // Stock Bumper
		bodyModel[108] = new ModelRendererTurbo(this, 26, 176, textureX, textureY); // Box 197
		bodyModel[109] = new ModelRendererTurbo(this, 17, 147, textureX, textureY); // Box 203
		bodyModel[110] = new ModelRendererTurbo(this, 106, 210, textureX, textureY); // Box 205
		bodyModel[111] = new ModelRendererTurbo(this, 97, 202, textureX, textureY); // Box 206
		bodyModel[112] = new ModelRendererTurbo(this, 52, 147, textureX, textureY); // Box 208
		bodyModel[113] = new ModelRendererTurbo(this, 39, 141, textureX, textureY); // Box 226
		bodyModel[114] = new ModelRendererTurbo(this, 39, 147, textureX, textureY); // Box 227
		bodyModel[115] = new ModelRendererTurbo(this, 32, 179, textureX, textureY); // Box 228
		bodyModel[116] = new ModelRendererTurbo(this, 0, 181, textureX, textureY); // Box 229
		bodyModel[117] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Box 230
		bodyModel[118] = new ModelRendererTurbo(this, 32, 176, textureX, textureY); // Box 231
		bodyModel[119] = new ModelRendererTurbo(this, 7, 199, textureX, textureY); // Box 232
		bodyModel[120] = new ModelRendererTurbo(this, 10, 182, textureX, textureY); // Box 233
		bodyModel[121] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 234
		bodyModel[122] = new ModelRendererTurbo(this, 32, 184, textureX, textureY); // Box 235
		bodyModel[123] = new ModelRendererTurbo(this, 0, 199, textureX, textureY); // Box 236
		bodyModel[124] = new ModelRendererTurbo(this, 23, 182, textureX, textureY); // Box 241
		bodyModel[125] = new ModelRendererTurbo(this, 20, 189, textureX, textureY); // Box 242
		bodyModel[126] = new ModelRendererTurbo(this, 73, 167, textureX, textureY); // Box 244
		bodyModel[127] = new ModelRendererTurbo(this, 75, 179, textureX, textureY); // Box 246
		bodyModel[128] = new ModelRendererTurbo(this, 75, 159, textureX, textureY); // Box 247
		bodyModel[129] = new ModelRendererTurbo(this, 70, 159, textureX, textureY); // Box 249
		bodyModel[130] = new ModelRendererTurbo(this, 68, 167, textureX, textureY); // Box 250
		bodyModel[131] = new ModelRendererTurbo(this, 70, 179, textureX, textureY); // Box 251
		bodyModel[132] = new ModelRendererTurbo(this, 39, 167, textureX, textureY); // Box 253
		bodyModel[133] = new ModelRendererTurbo(this, 41, 184, textureX, textureY); // Box 254
		bodyModel[134] = new ModelRendererTurbo(this, 64, 174, textureX, textureY); // Box 255
		bodyModel[135] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Grill Surround (ALL TRIMS)
		bodyModel[136] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Box 264
		bodyModel[137] = new ModelRendererTurbo(this, 1, 155, textureX, textureY); // Box 819 emblem
		bodyModel[138] = new ModelRendererTurbo(this, 4, 154, textureX, textureY); // Box 268
		bodyModel[139] = new ModelRendererTurbo(this, 17, 159, textureX, textureY); // Box 269
		bodyModel[140] = new ModelRendererTurbo(this, 127, 40, textureX, textureY); // Winch
		bodyModel[141] = new ModelRendererTurbo(this, 169, 189, textureX, textureY); // I can see my road from here!
		bodyModel[142] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 246
		bodyModel[143] = new ModelRendererTurbo(this, 39, 159, textureX, textureY); // Box 247
		bodyModel[144] = new ModelRendererTurbo(this, 1, 192, textureX, textureY); // Box 248
		bodyModel[145] = new ModelRendererTurbo(this, 130, 204, textureX, textureY); // Box 274
		bodyModel[146] = new ModelRendererTurbo(this, 130, 209, textureX, textureY); // Box 275
		bodyModel[147] = new ModelRendererTurbo(this, 130, 214, textureX, textureY); // Box 276
		bodyModel[148] = new ModelRendererTurbo(this, 130, 198, textureX, textureY); // Box 278
		bodyModel[149] = new ModelRendererTurbo(this, 130, 201, textureX, textureY); // Box 279
		bodyModel[150] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 281
		bodyModel[151] = new ModelRendererTurbo(this, 151, 214, textureX, textureY); // Box 282
		bodyModel[152] = new ModelRendererTurbo(this, 145, 204, textureX, textureY); // Box 283
		bodyModel[153] = new ModelRendererTurbo(this, 141, 198, textureX, textureY); // Box 284
		bodyModel[154] = new ModelRendererTurbo(this, 141, 201, textureX, textureY); // Box 285
		bodyModel[155] = new ModelRendererTurbo(this, 7, 130, textureX, textureY); // Box 840 meeror
		bodyModel[156] = new ModelRendererTurbo(this, 7, 130, textureX, textureY); // Box 841 meeror
		bodyModel[157] = new ModelRendererTurbo(this, 0, 129, textureX, textureY,"cull"); // Cull Mirror Holder
		bodyModel[158] = new ModelRendererTurbo(this, 0, 129, textureX, textureY,"cull"); // Cull Mirror holder
		bodyModel[159] = new ModelRendererTurbo(this, 206, 197, textureX, textureY); // Box 304
		bodyModel[160] = new ModelRendererTurbo(this, 0, 109, textureX, textureY); // Valence Piece
		bodyModel[161] = new ModelRendererTurbo(this, 0, 111, textureX, textureY); // Valence Piece
		bodyModel[162] = new ModelRendererTurbo(this, 0, 111, textureX, textureY); // Valence Piece
		bodyModel[163] = new ModelRendererTurbo(this, 0, 112, textureX, textureY); // Valence Piece
		bodyModel[164] = new ModelRendererTurbo(this, 0, 112, textureX, textureY); // Valence Piece
		bodyModel[165] = new ModelRendererTurbo(this, 134, 35, textureX, textureY); // Box 317
		bodyModel[166] = new ModelRendererTurbo(this, 56, 144, textureX, textureY); // Box 183
		bodyModel[167] = new ModelRendererTurbo(this, 115, 45, textureX, textureY); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[168] = new ModelRendererTurbo(this, 98, 33, textureX, textureY); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[169] = new ModelRendererTurbo(this, 98, 45, textureX, textureY); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[170] = new ModelRendererTurbo(this, 115, 33, textureX, textureY); // Box 322
		bodyModel[171] = new ModelRendererTurbo(this, 122, 33, textureX, textureY); // Box 323
		bodyModel[172] = new ModelRendererTurbo(this, 115, 33, textureX, textureY); // Box 324
		bodyModel[173] = new ModelRendererTurbo(this, 122, 33, textureX, textureY); // Box 325
		bodyModel[174] = new ModelRendererTurbo(this, 154, 35, textureX, textureY); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[175] = new ModelRendererTurbo(this, 162, 35, textureX, textureY); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[176] = new ModelRendererTurbo(this, 154, 35, textureX, textureY); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[177] = new ModelRendererTurbo(this, 143, 35, textureX, textureY); // Box 331
		bodyModel[178] = new ModelRendererTurbo(this, 138, 35, textureX, textureY); // Box 332
		bodyModel[179] = new ModelRendererTurbo(this, 138, 35, textureX, textureY); // Box 335
		bodyModel[180] = new ModelRendererTurbo(this, 138, 35, textureX, textureY); // Box 336
		bodyModel[181] = new ModelRendererTurbo(this, 143, 35, textureX, textureY); // Box 337
		bodyModel[182] = new ModelRendererTurbo(this, 138, 35, textureX, textureY); // Box 338
		bodyModel[183] = new ModelRendererTurbo(this, 129, 35, textureX, textureY); // Box 339
		bodyModel[184] = new ModelRendererTurbo(this, 129, 35, textureX, textureY); // Box 340
		bodyModel[185] = new ModelRendererTurbo(this, 134, 35, textureX, textureY); // Box 341
		bodyModel[186] = new ModelRendererTurbo(this, 0, 8, textureX, textureY,"wheel"); // Box 77 wheel 4
		bodyModel[187] = new ModelRendererTurbo(this, 11, 8, textureX, textureY,"wheel"); // Box 77 wheel 4
		bodyModel[188] = new ModelRendererTurbo(this, 22, 8, textureX, textureY,"wheel"); // Box 77 wheel 4
		bodyModel[189] = new ModelRendererTurbo(this, 11, 14, textureX, textureY,"wheel"); // Box 84 wheel 3
		bodyModel[190] = new ModelRendererTurbo(this, 22, 18, textureX, textureY,"wheel"); // Box 84 wheel 3
		bodyModel[191] = new ModelRendererTurbo(this, 0, 14, textureX, textureY,"wheel"); // Box 84 wheel 3
		bodyModel[192] = new ModelRendererTurbo(this, 0, 0, textureX, textureY,"wheel"); // Box 77 wheel 4
		bodyModel[193] = new ModelRendererTurbo(this, 0, 0, textureX, textureY,"wheel"); // Box 84 wheel 3
		bodyModel[194] = new ModelRendererTurbo(this, 0, 8, textureX, textureY, "wheel front"); // Box 71 wheel 1
		bodyModel[195] = new ModelRendererTurbo(this, 11, 8, textureX, textureY, "wheel front"); // Box 73 wheel 1
		bodyModel[196] = new ModelRendererTurbo(this, 22, 8, textureX, textureY, "wheel front"); // Box 77 wheel 1
		bodyModel[197] = new ModelRendererTurbo(this, 11, 14, textureX, textureY, "wheel front"); // Box 84 wheel 2
		bodyModel[198] = new ModelRendererTurbo(this, 22, 18, textureX, textureY, "wheel front"); // Box 85 wheel 2
		bodyModel[199] = new ModelRendererTurbo(this, 0, 14, textureX, textureY, "wheel front"); // Box 87 wheel 2
		bodyModel[200] = new ModelRendererTurbo(this, 0, 0, textureX, textureY, "wheel front"); // Box 89 wheel 1
		bodyModel[201] = new ModelRendererTurbo(this, 0, 0, textureX, textureY, "wheel front"); // Box 90 wheel 2
		bodyModel[202] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 66 axle 1-2
		bodyModel[203] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // differing my entrials
		bodyModel[204] = new ModelRendererTurbo(this, 0, 29, textureX, textureY); // driving my shaft
		bodyModel[205] = new ModelRendererTurbo(this, 116, 21, textureX, textureY); // Front Shocks
		bodyModel[206] = new ModelRendererTurbo(this, 116, 21, textureX, textureY); // Front Shocks
		bodyModel[207] = new ModelRendererTurbo(this, 33, 22, textureX, textureY); // Box 290
		bodyModel[208] = new ModelRendererTurbo(this, 29, 17, textureX, textureY); // Box 291 axle 1-2
		bodyModel[209] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 339
		bodyModel[210] = new ModelRendererTurbo(this, 133, 5, textureX, textureY); // Box 366
		bodyModel[211] = new ModelRendererTurbo(this, 114, 0, textureX, textureY); // Box 367
		bodyModel[212] = new ModelRendererTurbo(this, 151, 96, textureX, textureY); // Dash that crumbles under UV radiation
		bodyModel[213] = new ModelRendererTurbo(this, 94, 127, textureX, textureY); // Aerodynamic Dash Profile
		bodyModel[214] = new ModelRendererTurbo(this, 88, 127, textureX, textureY); // non-telescopic steering shaft
		bodyModel[215] = new ModelRendererTurbo(this, 31, 0, textureX, textureY); // devistating lack of torque in 5th gear
		bodyModel[216] = new ModelRendererTurbo(this, 32, 7, textureX, textureY); // shifter
		bodyModel[217] = new ModelRendererTurbo(this, 46, 0, textureX, textureY); // trans missing front
		bodyModel[218] = new ModelRendererTurbo(this, 65, 0, textureX, textureY); // SEVEN TREE POWER STROKER
		bodyModel[219] = new ModelRendererTurbo(this, 109, 0, textureX, textureY); // SEVEN TREE POWER STROKER
		bodyModel[220] = new ModelRendererTurbo(this, 88, 0, textureX, textureY); // SEVEN TREE POWER STROKER
		bodyModel[221] = new ModelRendererTurbo(this, 40, 8, textureX, textureY); // SEVEN TREE POWER STROKER
		bodyModel[222] = new ModelRendererTurbo(this, 72, 15, textureX, textureY); // Box 385
		bodyModel[223] = new ModelRendererTurbo(this, 59, 12, textureX, textureY); // Box 386
		bodyModel[224] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 388
		bodyModel[225] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 390
		bodyModel[226] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 392
		bodyModel[227] = new ModelRendererTurbo(this, 111, 123, textureX, textureY); // Box 393
		bodyModel[228] = new ModelRendererTurbo(this, 113, 127, textureX, textureY); // Box 833
		bodyModel[229] = new ModelRendererTurbo(this, 103, 127, textureX, textureY); // Not a center console
		bodyModel[230] = new ModelRendererTurbo(this, 79, 127, textureX, textureY); // Box 836
		bodyModel[231] = new ModelRendererTurbo(this, 113, 127, textureX, textureY); // Box 399
		bodyModel[232] = new ModelRendererTurbo(this, 79, 127, textureX, textureY); // Box 400
		bodyModel[233] = new ModelRendererTurbo(this, 92, 212, textureX, textureY,"rightTurnLight"); // taillight R
		bodyModel[234] = new ModelRendererTurbo(this, 92, 212, textureX, textureY,"leftTurnLight"); // Taillight L
		bodyModel[235] = new ModelRendererTurbo(this, 0, 86, textureX, textureY); // Box 425
		bodyModel[236] = new ModelRendererTurbo(this, 0, 83, textureX, textureY); // Box 428
		bodyModel[237] = new ModelRendererTurbo(this, 118, 198, textureX, textureY); // Box 431
		bodyModel[238] = new ModelRendererTurbo(this, 0, 86, textureX, textureY); // Box 432
		bodyModel[239] = new ModelRendererTurbo(this, 0, 86, textureX, textureY); // Box 433
		bodyModel[240] = new ModelRendererTurbo(this, 0, 83, textureX, textureY); // Box 434
		bodyModel[241] = new ModelRendererTurbo(this, 0, 86, textureX, textureY); // Box 435
		bodyModel[242] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 436
		bodyModel[243] = new ModelRendererTurbo(this, 0, 87, textureX, textureY); // Box 437
		bodyModel[244] = new ModelRendererTurbo(this, 197, 189, textureX, textureY,"lamp"); // Clearance Lights
		bodyModel[245] = new ModelRendererTurbo(this, 197, 189, textureX, textureY,"lamp"); // Clearance Lights
		bodyModel[246] = new ModelRendererTurbo(this, 197, 189, textureX, textureY,"lamp"); // Clearance Lights
		bodyModel[247] = new ModelRendererTurbo(this, 197, 189, textureX, textureY,"lamp"); // Clearance Lights
		bodyModel[248] = new ModelRendererTurbo(this, 197, 189, textureX, textureY,"lamp"); // Clearance Lights
		bodyModel[249] = new ModelRendererTurbo(this, 116, 57, textureX, textureY); // Box 503
		bodyModel[250] = new ModelRendererTurbo(this, 111, 54, textureX, textureY); // Box 504
		bodyModel[251] = new ModelRendererTurbo(this, 116, 57, textureX, textureY); // Box 506
		bodyModel[252] = new ModelRendererTurbo(this, 111, 54, textureX, textureY); // Box 507
		bodyModel[253] = new ModelRendererTurbo(this, 116, 54, textureX, textureY); // Plow Components
		bodyModel[254] = new ModelRendererTurbo(this, 116, 54, textureX, textureY); // Plow Components
		bodyModel[255] = new ModelRendererTurbo(this, 103, 54, textureX, textureY); // Plow Components
		bodyModel[256] = new ModelRendererTurbo(this, 103, 54, textureX, textureY); // Plow Components
		bodyModel[257] = new ModelRendererTurbo(this, 173, 48, textureX, textureY); // Plow Components
		bodyModel[258] = new ModelRendererTurbo(this, 196, 45, textureX, textureY); // Plow Components
		bodyModel[259] = new ModelRendererTurbo(this, 150, 45, textureX, textureY); // Plow Components
		bodyModel[260] = new ModelRendererTurbo(this, 135, 61, textureX, textureY); // Plow Components
		bodyModel[261] = new ModelRendererTurbo(this, 116, 60, textureX, textureY); // Plow Components
		bodyModel[262] = new ModelRendererTurbo(this, 184, 189, textureX, textureY); // Box 242
		bodyModel[263] = new ModelRendererTurbo(this, 210, 189, textureX, textureY); // Box 298
		bodyModel[264] = new ModelRendererTurbo(this, 210, 197, textureX, textureY); // Box 299
		bodyModel[265] = new ModelRendererTurbo(this, 125, 198, textureX, textureY); // Box 429
		bodyModel[266] = new ModelRendererTurbo(this, 118, 205, textureX, textureY); // Box 408
		bodyModel[267] = new ModelRendererTurbo(this, 197, 189, textureX, textureY); // Box 409
		bodyModel[268] = new ModelRendererTurbo(this, 210, 189, textureX, textureY); // Box 410
		bodyModel[269] = new ModelRendererTurbo(this, 210, 197, textureX, textureY); // Box 411
		bodyModel[270] = new ModelRendererTurbo(this, 125, 205, textureX, textureY); // Box 412
		bodyModel[271] = new ModelRendererTurbo(this, 113, 205, textureX, textureY); // Box 413
		bodyModel[272] = new ModelRendererTurbo(this, 113, 198, textureX, textureY); // Box 414
		bodyModel[273] = new ModelRendererTurbo(this, 0, 222, textureX, textureY,"brakeLight"); // Box 809 brake light
		bodyModel[274] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[275] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[276] = new ModelRendererTurbo(this, 6, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[277] = new ModelRendererTurbo(this, 5, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[278] = new ModelRendererTurbo(this, 11, 102, textureX, textureY); // Gun rack and Guns
		bodyModel[279] = new ModelRendererTurbo(this, 18, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[280] = new ModelRendererTurbo(this, 6, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[281] = new ModelRendererTurbo(this, 15, 91, textureX, textureY); // Gun rack and Guns
		bodyModel[282] = new ModelRendererTurbo(this, 18, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[283] = new ModelRendererTurbo(this, 5, 101, textureX, textureY); // Gun rack and Guns
		bodyModel[284] = new ModelRendererTurbo(this, 103, 60, textureX, textureY); // Box 390
		bodyModel[285] = new ModelRendererTurbo(this, 126, 62, textureX, textureY); // Box 391
		bodyModel[286] = new ModelRendererTurbo(this, 116, 63, textureX, textureY); // Box 392
		bodyModel[287] = new ModelRendererTurbo(this, 103, 60, textureX, textureY); // Box 393
		bodyModel[288] = new ModelRendererTurbo(this, 103, 63, textureX, textureY); // Box 395
		bodyModel[289] = new ModelRendererTurbo(this, 116, 60, textureX, textureY); // Box 396
		bodyModel[290] = new ModelRendererTurbo(this, 103, 63, textureX, textureY); // Box 397
		bodyModel[291] = new ModelRendererTurbo(this, 135, 61, textureX, textureY); // Box 398
		bodyModel[292] = new ModelRendererTurbo(this, 108, 54, textureX, textureY); // Box 399
		bodyModel[293] = new ModelRendererTurbo(this, 116, 66, textureX, textureY); // Box 400
		bodyModel[294] = new ModelRendererTurbo(this, 26, 176, textureX, textureY); // Box 399
		bodyModel[295] = new ModelRendererTurbo(this, 5, 181, textureX, textureY); // Box 400
		bodyModel[296] = new ModelRendererTurbo(this, 5, 181, textureX, textureY); // Box 401
		bodyModel[297] = new ModelRendererTurbo(this, 13, 141, textureX, textureY); // Box 196
		bodyModel[298] = new ModelRendererTurbo(this, 13, 141, textureX, textureY); // Box 200
		bodyModel[299] = new ModelRendererTurbo(this, 0, 151, textureX, textureY); // Box 273 grille
		bodyModel[300] = new ModelRendererTurbo(this, 0, 141, textureX, textureY,"lamp"); // headlight
		bodyModel[301] = new ModelRendererTurbo(this, 13, 148, textureX, textureY,"leftTurnLight"); // turn signal L
		bodyModel[302] = new ModelRendererTurbo(this, 0, 141, textureX, textureY,"lamp"); // headlight
		bodyModel[303] = new ModelRendererTurbo(this, 0, 148, textureX, textureY,"turnLampRight"); // turn signal r
		bodyModel[304] = new ModelRendererTurbo(this, 50, 90, textureX, textureY); // running board
		bodyModel[305] = new ModelRendererTurbo(this, 50, 90, textureX, textureY); // running board
		bodyModel[306] = new ModelRendererTurbo(this, 50, 94, textureX, textureY,"cull"); // running board hanger cull
		bodyModel[307] = new ModelRendererTurbo(this, 50, 94, textureX, textureY,"cull"); // running board hanger cull
		bodyModel[308] = new ModelRendererTurbo(this, 133, 4, textureX, textureY); // Box 455
		bodyModel[309] = new ModelRendererTurbo(this, 133, 0, textureX, textureY,"cull"); // Box 566 CULL sus pension hangar
		bodyModel[310] = new ModelRendererTurbo(this, 133, 0, textureX, textureY); // CULL sus pension hangar
		bodyModel[311] = new ModelRendererTurbo(this, 133, 4, textureX, textureY); // Box 378
		bodyModel[312] = new ModelRendererTurbo(this, 123, 177, textureX, textureY); // Box 799 tailgate
		bodyModel[313] = new ModelRendererTurbo(this, 87, 211, textureX, textureY); // Box 353
		bodyModel[314] = new ModelRendererTurbo(this, 102, 187, textureX, textureY); // Box 355
		bodyModel[315] = new ModelRendererTurbo(this, 83, 178, textureX, textureY); // Box 359
		bodyModel[316] = new ModelRendererTurbo(this, 102, 184, textureX, textureY); // Box 96
		bodyModel[317] = new ModelRendererTurbo(this, 104, 178, textureX, textureY); // Box 97
		bodyModel[318] = new ModelRendererTurbo(this, 87, 207, textureX, textureY); // Box 120
		bodyModel[319] = new ModelRendererTurbo(this, 123, 147, textureX, textureY); // Box 379
		bodyModel[320] = new ModelRendererTurbo(this, 141, 144, textureX, textureY); // Box 380
		bodyModel[321] = new ModelRendererTurbo(this, 133, 157, textureX, textureY); // Box 381
		bodyModel[322] = new ModelRendererTurbo(this, 133, 157, textureX, textureY); // Box 382
		bodyModel[323] = new ModelRendererTurbo(this, 81, 197, textureX, textureY); // Box 89
		bodyModel[324] = new ModelRendererTurbo(this, 81, 202, textureX, textureY); // Box 383
		bodyModel[325] = new ModelRendererTurbo(this, 26, 141, textureX, textureY); // Box 393
		bodyModel[326] = new ModelRendererTurbo(this, 151, 98, textureX, textureY); // Steering wheel
		bodyModel[327] = new ModelRendererTurbo(this, 155, 167, textureX, textureY); // Box 202
		bodyModel[328] = new ModelRendererTurbo(this, 103, 70, textureX, textureY); // Plow Components
		bodyModel[329] = new ModelRendererTurbo(this, 40, 142, textureX, textureY); // Box 352
		bodyModel[330] = new ModelRendererTurbo(this, 40, 142, textureX, textureY); // Box 353
		bodyModel[331] = new ModelRendererTurbo(this, 39, 141, textureX, textureY); // Box 354

		bodyModel[0].addShapeBox(0F, -1F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // fueling my tank
		bodyModel[0].setRotationPoint(4F, 3.5F, -4.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[1].setRotationPoint(-10F, 3F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[2].setRotationPoint(-10F, 3F, 5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[3].setRotationPoint(14F, 2.5F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[4].setRotationPoint(14F, 2.5F, 5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494 BIG HOSS MUFFLER (SIZE OF TORSO)
		bodyModel[5].setRotationPoint(6F, 2.5F, 1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Complete power loss
		bodyModel[6].setRotationPoint(13F, 2.5F, 2.5F);

		bodyModel[7].addShapeBox(-2F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Complete power loss
		bodyModel[7].setRotationPoint(23F, 5F, 5.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 3F, -2.5F, 0F, -3F, -2.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2.5F, 0F, -3F, 2.5F, 0F); // Complete power loss
		bodyModel[8].setRotationPoint(18F, 2.5F, 2.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PIPE WITH NO CAT (unmodeled)
		bodyModel[9].setRotationPoint(-10F, 2.5F, 2.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // PIPE WITH NO CAT (unmodeled)
		bodyModel[10].setRotationPoint(-13F, 2.5F, 2.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[11].setRotationPoint(-14F, 2.5F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 513
		bodyModel[12].setRotationPoint(6F, 2.5F, 5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.75F, -3F, 0F, 0F, 0F, -0.01F, 0F, 0.01F, 0F, 0F, 0.05F, 0F, 0.25F, 0F, -0.01F, 0F); // Wheelwell
		bodyModel[13].setRotationPoint(10.01F, 2F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Wheelwell
		bodyModel[14].setRotationPoint(14F, 1F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 24, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		bodyModel[15].setRotationPoint(-11F, 2F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		bodyModel[16].setRotationPoint(20F, 2F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, 0F, -0.375F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // taillight R
		bodyModel[17].setRotationPoint(24.01F, -1.01F, 8.01F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
		bodyModel[18].setRotationPoint(13F, 2F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Wheelwell
		bodyModel[19].setRotationPoint(14F, 1F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 3F, 0F, 1.5F, -3F, 0F, 0F, 0F); // Aftermarket Hitch Mount
		bodyModel[20].setRotationPoint(20.5F, 4.5F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Aftermarket Hitch Mount
		bodyModel[21].setRotationPoint(23.5F, 6F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Towpower Hitch
		bodyModel[22].setRotationPoint(24.5F, 6F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, -0.5F, -1F, -0.125F, -0.5F, -1F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, 0.375F, -0.125F, -0.5F, 0.375F, -0.125F, 0F, -0.125F, -0.125F); // Towpower Hitch
		bodyModel[23].setRotationPoint(25.5F, 6F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.125F, -0.25F, -1F, -0.125F, -0.25F, -1F, -0.125F, 0F, -1F, -0.125F, 0F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, -0.25F, 0.375F, -0.125F, 0F, 0.375F, -0.125F); // Towpower Hitch
		bodyModel[24].setRotationPoint(26F, 6F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // 2" ball
		bodyModel[25].setRotationPoint(25.87F, 6F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 830 rear emblem
		bodyModel[26].setRotationPoint(23.65F, 0.5F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 832
		bodyModel[27].setRotationPoint(-7F, 0.5F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 235
		bodyModel[28].setRotationPoint(14F, 1F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[29].setRotationPoint(14F, 1F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[30].setRotationPoint(21F, 2.5F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[31].setRotationPoint(14F, 2.5F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Aftermarket Hitch Mount
		bodyModel[32].setRotationPoint(16.5F, 4.5F, 5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[33].setRotationPoint(-21F, 2.5F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[34].setRotationPoint(-21F, 2.5F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[35].setRotationPoint(-18F, 2F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561 engine cradle/suspension point or something
		bodyModel[36].setRotationPoint(-18F, 3F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 275 The outcome will SHOCK you
		bodyModel[37].setRotationPoint(12.5F, 2F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F); // Box 275 The outcome will SHOCK you
		bodyModel[38].setRotationPoint(18.5F, 2F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[39].setRotationPoint(22F, 2.5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[40].setRotationPoint(22F, 2.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, 3F, 0F, 0F, 0F); // Box 278
		bodyModel[41].setRotationPoint(20.5F, 4.5F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[42].setRotationPoint(16.5F, 4.5F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // plate
		bodyModel[43].setRotationPoint(25.01F, 2.5F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[44].setRotationPoint(4F, 2F, 7.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0.001F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0.001F, 0F, 0F, 0.001F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0.001F, 0F, 0F); // Box 296
		bodyModel[45].setRotationPoint(4F, -1F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[46].setRotationPoint(-14F, 2.5F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 341
		bodyModel[47].setRotationPoint(6F, 2.5F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F,0.375F, 0.01F, 0.125F, -0.375F, 0.01F, 0.25F, -0.375F, 0.01F, 0.25F, 0.375F, 0.01F, 0.125F, 0F, 0F, 0.375F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.375F); // Box 348
		bodyModel[48].setRotationPoint(23.5F, -3F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.365F, -0.5F, 0F, -1F, -0.5F, 0.01F, 0F, -0.5F, 0.01F, 0F, 0F, 0F, -0.365F, 0F, 0F, -1F, 0F, 0.01F, 0F, 0F, 0.01F); // reverse light
		bodyModel[49].setRotationPoint(24.01F, 0.5F, 8.01F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.001F, 0F, 0.125F, 1F, 0F, 0.125F, 1F, 0F, 0F, 0F, 0F, 0F, 0.001F, 0F, 0.125F, 0.001F, 0F, 0.125F, 0F, 0F, -1.125F, 0.001F, 0F, -1.125F); // Box 354
		bodyModel[50].setRotationPoint(4F, 3F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[51].setRotationPoint(13F, -1F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[52].setRotationPoint(13F, 2F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 368
		bodyModel[53].setRotationPoint(19F, 2F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 242
		bodyModel[54].setRotationPoint(13.5F, 1F, 9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 91
		bodyModel[55].setRotationPoint(4F, 2F, -8.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0.001F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0.001F, 1F, 0.125F, 0.001F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0.001F, 0F, 0.125F); // Box 92
		bodyModel[56].setRotationPoint(4F, -1F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.001F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.125F, -0.001F, 0F, 0.125F, -0.001F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 0.125F, -0.005F, 0F, 0.125F); // Box 95
		bodyModel[57].setRotationPoint(4F, 3F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 98
		bodyModel[58].setRotationPoint(13F, -1F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[59].setRotationPoint(13F, 2F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[60].setRotationPoint(19F, 2F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 101
		bodyModel[61].setRotationPoint(13.5F, 1F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[62].setRotationPoint(11F, 2F, 7.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0.75F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.01F, 0F, 0.01F, 0F, 0.25F, 0.01F, 0F, 0F, 0F, -0.01F, 0F); // Box 106
		bodyModel[63].setRotationPoint(10.01F, 2F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,3F, 0F, 0.75F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.126F, -0.125F, 0.25F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0.126F, -0.125F, 0F); // Box 107
		bodyModel[64].setRotationPoint(21.99F, 2F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2.875F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.5F, -2.875F, -0.125F, 0.5F); // Box 108
		bodyModel[65].setRotationPoint(19F, 2F, -8.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 109
		bodyModel[66].setRotationPoint(11F, 2F, -8.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 110
		bodyModel[67].setRotationPoint(24F, 3.5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F); // Box 111
		bodyModel[68].setRotationPoint(25F, 3.5F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F); // Box 112
		bodyModel[69].setRotationPoint(25F, 3.5F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 113
		bodyModel[70].setRotationPoint(25F, 4.75F, -3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0.01F, 0.375F, -0.875F, 0.01F, 0.375F, -0.375F, 0.01F, -0.375F, 0F, 0.01F, -0.375F, 0F, 0F, 0.125F, -0.5F, 0F, 0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 114
		bodyModel[71].setRotationPoint(4F, -3F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.375F, 0.01F, 0.375F, -0.375F, 0.01F, 0.25F, -0.875F, 0.01F, -0.375F, -0.125F, 0.01F, -0.375F, 0F, 0F, 0.125F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F); // Box 115
		bodyModel[72].setRotationPoint(23.5F, -3F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0.01F, -0.375F, -0.375F, 0.01F, -0.375F, -0.875F, 0.01F, 0.375F, 0F, 0.01F, 0.375F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.5F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 116
		bodyModel[73].setRotationPoint(4F, -3F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0.01F, -0.375F, -0.875F, 0.01F, -0.375F, -0.375F, 0.01F, 0.25F, 0.375F, 0.01F, 0.375F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0F, 0.125F); // Box 117
		bodyModel[74].setRotationPoint(23.5F, -3F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.375F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.375F, -0.5F, 0F, 0F, -0.5F, 0F); // Taillight L
		bodyModel[75].setRotationPoint(24.01F, -1.01F, -9.01F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.01F, -1F, -0.5F, 0.01F, -0.365F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.01F, -1F, 0F, 0.01F, -0.365F, 0F, 0F, 0F, 0F, 0F); // reverse light
		bodyModel[76].setRotationPoint(24.01F, 0.5F, -9.01F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0.125F, 0F, 1F, 0.125F); // Box 149
		bodyModel[77].setRotationPoint(3.75F, -1F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 151
		bodyModel[78].setRotationPoint(3.75F, 2F, -8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.375F, 0F, -0.375F, -0.625F, 0F, -0.375F, 0F, 0F, 0.375F, -0.375F, 0F, 0.375F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0.125F, -0.25F, 0.125F, -0.5F, 0F, 0.125F); // Box 152
		bodyModel[79].setRotationPoint(3.25F, -3F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 154
		bodyModel[80].setRotationPoint(3F, -3F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0.125F, 0F, 1F, 0.125F); // Box 155
		bodyModel[81].setRotationPoint(3F, -1F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[82].setRotationPoint(3F, 2F, -8.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 157
		bodyModel[83].setRotationPoint(-11F, -3F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F); // Box 158
		bodyModel[84].setRotationPoint(-10F, -1F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 159
		bodyModel[85].setRotationPoint(-10F, 2F, -8.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F); // Box 160
		bodyModel[86].setRotationPoint(-14F, 2F, -8.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 161
		bodyModel[87].setRotationPoint(-11F, 2F, -8.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 162
		bodyModel[88].setRotationPoint(-13F, -1F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 163
		bodyModel[89].setRotationPoint(-14F, 2F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -1F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 0.125F, -1F, 0F, 0.125F); // Box 164
		bodyModel[90].setRotationPoint(-13F, 3F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,3F, 0F, 0.75F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.01F, 0F, 0.25F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.01F, 0F, 0F); // Box 165
		bodyModel[91].setRotationPoint(-11.01F, 2F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 166
		bodyModel[92].setRotationPoint(-19.5F, 1F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 167
		bodyModel[93].setRotationPoint(-20F, -1F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[94].setRotationPoint(-20F, 2F, -9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0.75F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[95].setRotationPoint(-21.99F, 2F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.875F, -0.5F, 0F); // Stock Bumper
		bodyModel[96].setRotationPoint(-23F, 2.5F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.125F, -0.5F, -0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0F, 0.875F, -0.5F, 0F); // Stock Bumper
		bodyModel[97].setRotationPoint(-22F, 2.5F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 176
		bodyModel[98].setRotationPoint(-23F, 2F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F); // Box 177
		bodyModel[99].setRotationPoint(-21F, 2F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Stock Bumper
		bodyModel[100].setRotationPoint(-23F, 2.5F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, 0.875F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.125F, -0.125F, -0.5F, -0.125F); // Stock Bumper
		bodyModel[101].setRotationPoint(-22F, 2.5F, 8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.375F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.375F, -0.5F, 0F); // Stock Bumper
		bodyModel[102].setRotationPoint(-23.5F, 2.5F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.125F, 0F, -0.125F, 0.375F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, -0.125F, -0.25F, -0.625F); // Stock Bumper
		bodyModel[103].setRotationPoint(-22F, 4F, 8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0.875F, 0F, 0F, -0.125F, -0.25F, -0.625F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0F, 0.375F, -0.25F, 0F); // Stock Bumper
		bodyModel[104].setRotationPoint(-22F, 4F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, 0F, 0F, -0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.375F, -0.25F, 0F); // Stock Bumper
		bodyModel[105].setRotationPoint(-23F, 4F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0.375F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.625F, -0.25F, 0F); // Stock Bumper
		bodyModel[106].setRotationPoint(-23F, 4F, 4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.375F, 0F, 0F, -0.125F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Stock Bumper
		bodyModel[107].setRotationPoint(-23.5F, 4F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 197
		bodyModel[108].setRotationPoint(-21F, -1F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,-0.25F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[109].setRotationPoint(-23F, -2F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0.75F, 0.126F, -0.125F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0.126F, -0.125F, 0.25F); // Box 205
		bodyModel[110].setRotationPoint(21.99F, 2F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2.875F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, -2.875F, -0.125F, -0.5F); // Box 206
		bodyModel[111].setRotationPoint(19F, 2F, 7.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.875F, -0.25F, -1.125F, 0F, 0.25F, -0.375F, -0.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -2F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 208
		bodyModel[112].setRotationPoint(-23F, -2F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, 0F, 0F, -0.5F, 0.75F, 0F, -1.125F, -0.25F, -1.125F, -0.875F, -0.25F, -1.125F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 226
		bodyModel[113].setRotationPoint(-23F, -2F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, -0.375F, -0.875F, -0.25F, -1.125F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -2F, 0F, -0.125F); // Box 227
		bodyModel[114].setRotationPoint(-23F, -2F, 5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 228
		bodyModel[115].setRotationPoint(-14F, 2F, 7.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 229
		bodyModel[116].setRotationPoint(-11F, 2F, 7.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[117].setRotationPoint(-13F, -1F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 231
		bodyModel[118].setRotationPoint(-14F, 2F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0.75F, 0.01F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.01F, 0.25F); // Box 232
		bodyModel[119].setRotationPoint(-11.01F, 2F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 233
		bodyModel[120].setRotationPoint(-19.5F, 1F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0.75F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[121].setRotationPoint(-20F, -1F, 8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[122].setRotationPoint(-20F, 2F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 236
		bodyModel[123].setRotationPoint(-21.99F, 2F, 6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -1.125F, -1F, 0F, -1.125F); // Box 241
		bodyModel[124].setRotationPoint(-13F, 3F, 8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F,0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1F); // Box 242
		bodyModel[125].setRotationPoint(-21.5F, -3F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, 0.125F, -0.25F, 0F, 0.125F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, -0.25F, 0F, 0.125F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[126].setRotationPoint(3.75F, -1F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 246
		bodyModel[127].setRotationPoint(3.75F, 2F, 7.75F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.375F, 0F, 0.375F, 0F, 0F, 0.375F, -0.625F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.5F, 0F, 0.125F, 0.125F, -0.25F, 0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F); // Box 247
		bodyModel[128].setRotationPoint(3.25F, -3F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.375F, -0.375F, 0F, 0.375F, -0.375F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 249
		bodyModel[129].setRotationPoint(3F, -3F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, 0.125F, -0.25F, 1F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, -0.25F, 1F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[130].setRotationPoint(3F, -1F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 251
		bodyModel[131].setRotationPoint(3F, 2F, 7.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[132].setRotationPoint(-10F, -1F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 254
		bodyModel[133].setRotationPoint(-10F, 2F, 7.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F); // Box 255
		bodyModel[134].setRotationPoint(3.25F, -3F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.03F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, -0.5F, 0.03F, 0F, -0.5F, 0.03F, 0.5F, -0.5F, 0.03F, 0.5F, -0.5F, 0.03F, 0.5F, 0F, 0.03F, 0.5F, 0F); // Grill Surround (ALL TRIMS)
		bodyModel[135].setRotationPoint(-23F, -1F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.03F, 0F, -0.5F, 0.03F, 0F, -0.5F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0.5F, 0F, 0.03F, 0.5F, 0F, 0.03F, 0.5F, -0.5F, 0.03F, 0.5F, -0.5F); // Box 264
		bodyModel[136].setRotationPoint(-23F, -1F, 4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 819 emblem
		bodyModel[137].setRotationPoint(-23.01F, -0.75F, -2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.08F, 0F, -0.25F, -0.08F, 0F, -0.25F, -0.08F, 0F, -0.25F, -0.08F); // Box 268
		bodyModel[138].setRotationPoint(-23.02F, -1.25F, -4.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.25F, 0.08F, 0F, -0.25F, 0.08F, 0F, -0.25F, 0.08F, 0F, -0.25F, 0.08F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269
		bodyModel[139].setRotationPoint(-23.02F, 1.74F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Winch
		bodyModel[140].setRotationPoint(-25F, 2.75F, -2F);
		bodyModel[140].rotateAngleZ = -0.78539816F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-3F, 0.25F, 0F, 3F, 0.25F, 0F, 3F, 0.25F, 0F, -3F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // I can see my road from here!
		bodyModel[141].setRotationPoint(-12F, -8F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, -0.75F, -0.375F, 0F, 0F, -0.375F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 0F, 0.25F, 0.125F); // Box 246
		bodyModel[142].setRotationPoint(-21F, -3F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 247
		bodyModel[143].setRotationPoint(-11F, -3F, 8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.375F, 0F, -0.75F, -0.375F, 0F, 0.25F, 0.125F, 0F, 0F, 0.125F, 0F, -0.25F, -0.125F, 0F, 0F, -0.125F); // Box 248
		bodyModel[144].setRotationPoint(-21F, -3F, 5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[145].setRotationPoint(-8.5F, -9F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 275
		bodyModel[146].setRotationPoint(-8.5F, -9F, -6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 276
		bodyModel[147].setRotationPoint(-8.5F, -9F, -3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 278
		bodyModel[148].setRotationPoint(-8.5F, -9F, 6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.25F, -1.5F, 0F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[149].setRotationPoint(-8.5F, -9F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 281
		bodyModel[150].setRotationPoint(-4.5F, -9F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 282
		bodyModel[151].setRotationPoint(-4.5F, -9F, -3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[152].setRotationPoint(-4.5F, -9F, 3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
		bodyModel[153].setRotationPoint(-4.5F, -9F, 6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[154].setRotationPoint(-4.5F, -9F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840 meeror
		bodyModel[155].setRotationPoint(-8F, -5.5F, -11.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 841 meeror
		bodyModel[156].setRotationPoint(-8F, -5.5F, 9.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Cull Mirror Holder
		bodyModel[157].setRotationPoint(-8.13F, -2.5F, -10.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F); // Cull Mirror holder
		bodyModel[158].setRotationPoint(-8.13F, -2.5F, 8.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 15, 0F,0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 304
		bodyModel[159].setRotationPoint(3.25F, -8F, -7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Valence Piece
		bodyModel[160].setRotationPoint(-23F, 4.5F, -4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Valence Piece
		bodyModel[161].setRotationPoint(-22F, 4.5F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Valence Piece
		bodyModel[162].setRotationPoint(-22F, 4.5F, 4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -1F, 0F, 0F, 1F, 0F, 0F); // Valence Piece
		bodyModel[163].setRotationPoint(-21F, 4.5F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F); // Valence Piece
		bodyModel[164].setRotationPoint(-21F, 4.5F, 8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 317
		bodyModel[165].setRotationPoint(-25F, 2.99F, -4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 183
		bodyModel[166].setRotationPoint(-23F, 2F, -4.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[167].setRotationPoint(-24F, 2.5F, 4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[168].setRotationPoint(-25F, 2.5F, -4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[169].setRotationPoint(-24F, 2.5F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, -0.01F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1.5F, 0.01F, -0.25F); // Box 322
		bodyModel[170].setRotationPoint(-26.5F, 3F, 3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 323
		bodyModel[171].setRotationPoint(-26F, -2F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, -0.01F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F, -0.25F, -1.5F, -0.01F, -0.25F); // Box 324
		bodyModel[172].setRotationPoint(-26.5F, 3F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 325
		bodyModel[173].setRotationPoint(-26F, -2F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, 1.25F, -0.25F, 0F); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[174].setRotationPoint(-24.5F, 2.5F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[175].setRotationPoint(-26F, 2.5F, -4F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, -0.25F, 0F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // BIG HOSS AFTERMARKET METAL BUMPER
		bodyModel[176].setRotationPoint(-24.5F, 2.5F, 4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 331
		bodyModel[177].setRotationPoint(-25.25F, -1.5F, -4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1.5F, -0.25F, 0F, 1.25F, -0.25F, 0F); // Box 332
		bodyModel[178].setRotationPoint(-23.75F, -1.5F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.25F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 1.25F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F); // Box 335
		bodyModel[179].setRotationPoint(-23.75F, -1.5F, 4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,1.25F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 1.25F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F); // Box 336
		bodyModel[180].setRotationPoint(-23.75F, 1F, 4F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 337
		bodyModel[181].setRotationPoint(-25.25F, 1F, -4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1.5F, -0.25F, 0F, 1.25F, -0.25F, 0F); // Box 338
		bodyModel[182].setRotationPoint(-23.75F, 1F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.5F, 0F, -0.25F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0F); // Box 339
		bodyModel[183].setRotationPoint(-23.5F, -1.5F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -0.25F, -1F, -0.5F, -0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -0.5F); // Box 340
		bodyModel[184].setRotationPoint(-23.5F, -1.5F, 9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 341
		bodyModel[185].setRotationPoint(-25F, 2.99F, 3F);

		bodyModel[186].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F,0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 77 wheel 4
		bodyModel[186].setRotationPoint(16.5F, 6F, -8F);

		bodyModel[187].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F,0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 77 wheel 4
		bodyModel[187].setRotationPoint(16.5F, 6F, -8F);

		bodyModel[188].addShapeBox(-1.5F, -3.5F, -1F, 3, 7, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 77 wheel 4
		bodyModel[188].setRotationPoint(16.5F, 6F, -8F);

		bodyModel[189].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F,0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 84 wheel 3
		bodyModel[189].setRotationPoint(16.5F, 6F, 8F);

		bodyModel[190].addShapeBox(-1.5F, -3.5F, -1F, 3, 7, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 84 wheel 3
		bodyModel[190].setRotationPoint(16.5F, 6F, 8F);

		bodyModel[191].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F,0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 84 wheel 3
		bodyModel[191].setRotationPoint(16.5F, 6F, 8F);

		bodyModel[192].addShapeBox(-3.5F, -3.5F, -1.01F, 7, 7, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 77 wheel 4
		bodyModel[192].setRotationPoint(16.5F, 6F, -8F);

		bodyModel[193].addShapeBox(-3.5F, -3.5F, 1.01F, 7, 7, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 84 wheel 3
		bodyModel[193].setRotationPoint(16.5F, 6F, 8F);

		bodyModel[194].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F,0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 71 wheel 1
		bodyModel[194].setRotationPoint(-16.5F, 6F, -8F);

		bodyModel[195].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F,0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 73 wheel 1
		bodyModel[195].setRotationPoint(-16.5F, 6F, -8F);

		bodyModel[196].addShapeBox(-1.5F, -3.5F, -1F, 3, 7, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 77 wheel 1
		bodyModel[196].setRotationPoint(-16.5F, 6F, -8F);

		bodyModel[197].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F,0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 84 wheel 2
		bodyModel[197].setRotationPoint(-16.5F, 6F, 8F);

		bodyModel[198].addShapeBox(-1.5F, -3.5F, -1F, 3, 7, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 85 wheel 2
		bodyModel[198].setRotationPoint(-16.5F, 6F, 8F);

		bodyModel[199].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F,0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 87 wheel 2
		bodyModel[199].setRotationPoint(-16.5F, 6F, 8F);

		bodyModel[200].addShapeBox(-3.5F, -3.5F, -1.01F, 7, 7, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 89 wheel 1
		bodyModel[200].setRotationPoint(-16.5F, 6F, -8F);

		bodyModel[201].addShapeBox(-3.5F, -3.5F, 1.01F, 7, 7, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 90 wheel 2
		bodyModel[201].setRotationPoint(-16.5F, 6F, 8F);

		bodyModel[202].addShapeBox(-1F, -1F, 0F, 2, 2, 17, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 66 axle 1-2
		bodyModel[202].setRotationPoint(16.5F, 6F, -8.5F);

		bodyModel[203].addShapeBox(0F, -1F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // differing my entrials
		bodyModel[203].setRotationPoint(15F, 5.5F, -1.5F);

		bodyModel[204].addShapeBox(0F, -1F, 0F, 16, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, -0.25F, -0.25F); // driving my shaft
		bodyModel[204].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, 0F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0F, 1.25F, 0.25F, -0.25F, 1.25F, 0.25F, -3.25F, 0F, 0.25F, -3.5F, 0F, 0.25F, -3.25F, 0.25F, 0.25F, -3F, 0.25F); // Front Shocks
		bodyModel[205].setRotationPoint(-17F, -0.5F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, -0.25F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0.25F, -1F, 0.25F, 0F, -1F, 0.25F, -3F, 0.5F, 0.25F, -3.25F, 0.5F, 0.25F, -3.5F, 0F, 0.25F, -3.25F, 0F); // Front Shocks
		bodyModel[206].setRotationPoint(-17F, -0.5F, 6F);

		bodyModel[207].addShapeBox(0F, -1F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[207].setRotationPoint(-18F, 5.5F, -4.5F);

		bodyModel[208].addShapeBox(-1F, -1F, 0F, 2, 2, 17, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 291 axle 1-2
		bodyModel[208].setRotationPoint(-16.5F, 6F, -8.5F);

		bodyModel[209].addShapeBox(0F, -1F, 0F, 11, 2, 2, 0F,0F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, 0F, 1.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.5F, -0.25F); // Box 339
		bodyModel[209].setRotationPoint(-15F, 4.5F, -4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 9, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[210].setRotationPoint(-21F, 1F, -8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 367
		bodyModel[211].setRotationPoint(-12F, -1F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Dash that crumbles under UV radiation
		bodyModel[212].setRotationPoint(-11F, -3F, -8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.49F, 1F, 0F, -1.49F, 1F, 0F, -1.5F, 0F); // Aerodynamic Dash Profile
		bodyModel[213].setRotationPoint(-10.5F, -3.5F, -6F);

		bodyModel[214].addShapeBox(-3F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // non-telescopic steering shaft
		bodyModel[214].setRotationPoint(-8.5F, -2F, -4.56F);
		bodyModel[214].rotateAngleZ = 0.48869219F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // devistating lack of torque in 5th gear
		bodyModel[215].setRotationPoint(-8F, 1.5F, -1.5F);

		bodyModel[216].addShapeBox(-7.5F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // shifter
		bodyModel[216].setRotationPoint(-6.25F, -4F, -2F);
		bodyModel[216].rotateAngleX = 0.29670597F;
		bodyModel[216].rotateAngleY = -0.29670597F;
		bodyModel[216].rotateAngleZ = 1.01229097F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // trans missing front
		bodyModel[217].setRotationPoint(-13F, 1.5F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // SEVEN TREE POWER STROKER
		bodyModel[218].setRotationPoint(-20F, -0.5F, -2F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // SEVEN TREE POWER STROKER
		bodyModel[219].setRotationPoint(-20F, -0.5F, -4.25F);
		bodyModel[219].rotateAngleX = 0.78539816F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // SEVEN TREE POWER STROKER
		bodyModel[220].setRotationPoint(-20F, -2.5F, 2.25F);
		bodyModel[220].rotateAngleX = -0.78539816F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // SEVEN TREE POWER STROKER
		bodyModel[221].setRotationPoint(-19F, -2.5F, -2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 385
		bodyModel[222].setRotationPoint(-13F, 2.5F, -3.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[223].setRotationPoint(-10F, 2.5F, -3.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, -6F, -1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, -1F, 0F, 5F, 1F, 0F, 0F); // Box 388
		bodyModel[224].setRotationPoint(0F, 2.5F, -3.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 390
		bodyModel[225].setRotationPoint(-4F, 3F, -4.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[226].setRotationPoint(-1F, 0.5F, -7.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 4, 15, 0F,-0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[227].setRotationPoint(1.5F, -3.5F, -7.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 833
		bodyModel[228].setRotationPoint(-3.5F, -4.5F, -7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Not a center console
		bodyModel[229].setRotationPoint(-7F, -0.5F, -1.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 836
		bodyModel[230].setRotationPoint(-2.5F, -6.5F, -6F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 399
		bodyModel[231].setRotationPoint(-3.5F, -4.5F, 2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 400
		bodyModel[232].setRotationPoint(-2.5F, -6.5F, 3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // taillight R
		bodyModel[233].setRotationPoint(23.01F, -1.01F, 8.01F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Taillight L
		bodyModel[234].setRotationPoint(23.01F, -1.01F, -9.01F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 425
		bodyModel[235].setRotationPoint(5.5F, -8F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[236].setRotationPoint(4F, -9F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.125F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.625F, 0F, 0F, 0.625F); // Box 431
		bodyModel[237].setRotationPoint(-2F, -8F, 7F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 432
		bodyModel[238].setRotationPoint(21.5F, -8F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 433
		bodyModel[239].setRotationPoint(5.5F, -8F, 7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[240].setRotationPoint(4F, -9F, 6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 435
		bodyModel[241].setRotationPoint(21.5F, -8F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[242].setRotationPoint(5.5F, -9F, -6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[243].setRotationPoint(21.5F, -9F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
		bodyModel[244].setRotationPoint(-7F, -9F, -5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
		bodyModel[245].setRotationPoint(-7F, -9F, 4F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
		bodyModel[246].setRotationPoint(-7F, -9.25F, 1.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
		bodyModel[247].setRotationPoint(-7F, -9.25F, -0.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
		bodyModel[248].setRotationPoint(-7F, -9.25F, -2.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[249].setRotationPoint(-24F, 6F, -5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, -0.5F, 0F); // Box 504
		bodyModel[250].setRotationPoint(-21F, 3.5F, -5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[251].setRotationPoint(-24F, 6F, 4F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, -0.5F, 0F); // Box 507
		bodyModel[252].setRotationPoint(-21F, 3.5F, 4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Plow Components
		bodyModel[253].setRotationPoint(-26F, 6F, -5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Plow Components
		bodyModel[254].setRotationPoint(-26F, 6F, 4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, -0.5F, 0.625F, 0.5F, -0.5F, 0.625F, -1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Plow Components
		bodyModel[255].setRotationPoint(-27F, 3F, -5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, -0.5F, 0.625F, -0.5F, -0.5F, 0.625F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Plow Components
		bodyModel[256].setRotationPoint(-27F, 3F, 4F);

		bodyModel[257].addShapeBox(-0.5F, 0F, -10F, 1, 3, 20, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Plow Components
		bodyModel[257].setRotationPoint(-30F, 5F, 0F);
		bodyModel[257].rotateAngleY = 0.34906585F;

		bodyModel[258].addShapeBox(-1F, 0F, -10F, 1, 2, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Plow Components
		bodyModel[258].setRotationPoint(-30F, 8F, 0F);
		bodyModel[258].rotateAngleY = 0.34906585F;

		bodyModel[259].addShapeBox(-1.5F, 0F, -10F, 1, 2, 20, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Plow Components
		bodyModel[259].setRotationPoint(-30F, 3F, 0F);
		bodyModel[259].rotateAngleY = 0.34906585F;

		bodyModel[260].addShapeBox(-0.5F, 0F, -6F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Plow Components
		bodyModel[260].setRotationPoint(-30F, 7F, 0F);
		bodyModel[260].rotateAngleY = 0.34906585F;

		bodyModel[261].addShapeBox(0F, 0F, -5F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Plow Components
		bodyModel[261].setRotationPoint(-30F, 6F, 0F);
		bodyModel[261].rotateAngleY = 0.34906585F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 3F, 0F, -2F, -3F, 0F, -2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0.125F, -0.375F); // Box 242
		bodyModel[262].setRotationPoint(-11.5F, -8F, 3F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0.125F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 298
		bodyModel[263].setRotationPoint(-7.5F, -8F, 7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-3F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -2.25F, -3F, -0.5F, -2.25F, 0F, 0.125F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 299
		bodyModel[264].setRotationPoint(-10.5F, -8F, 7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 3.25F, -0.5F, -1F, -3.25F, -0.5F, -1F, 0F, 0.125F, -0.625F, 0F, 0F, -0.625F, 0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F); // Box 429
		bodyModel[265].setRotationPoint(-11.5F, -8F, 7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.625F, 0F, 0F, 0.625F, 0F, 0F, -0.375F, 0F, 0.125F, -0.375F); // Box 408
		bodyModel[266].setRotationPoint(-2F, -8F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-3F, 0F, -2F, 3F, 0F, -2F, 2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, 0F, 0.125F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 409
		bodyModel[267].setRotationPoint(-11.5F, -8F, -8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.85F, 0F, 0.125F, -0.85F); // Box 410
		bodyModel[268].setRotationPoint(-7.5F, -8F, -9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-3F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0.75F, -3F, 0F, 0.75F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.75F, 0F, 0.125F, -0.85F); // Box 411
		bodyModel[269].setRotationPoint(-10.5F, -8F, -9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3.25F, -0.5F, -1F, 3.25F, -0.5F, -1F, 3F, 0F, 1F, -3F, 0F, 1F, -0.5F, 0F, 0.625F, 0.5F, 0F, 0.625F, 0F, 0F, -0.625F, 0F, 0.125F, -0.625F); // Box 412
		bodyModel[270].setRotationPoint(-11.5F, -8F, -8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 1F, 0F, 0F, 1F, -0.125F, 0F, 0.625F, 0.125F, 0F, 0.625F, 0.75F, 0F, -0.625F, -0.125F, 0.125F, -0.625F); // Box 413
		bodyModel[271].setRotationPoint(2.5F, -8F, -8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 1F, 0.5F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.125F, 0.125F, -0.625F, 0.75F, 0F, -0.625F, 0.125F, 0F, 0.625F, -0.125F, 0F, 0.625F); // Box 414
		bodyModel[272].setRotationPoint(2.5F, -8F, 7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 809 brake light
		bodyModel[273].setRotationPoint(3F, -9F, -1.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Gun rack and Guns
		bodyModel[274].setRotationPoint(2.5F, -9F, -4.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Gun rack and Guns
		bodyModel[275].setRotationPoint(2.5F, -9F, 3.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F); // Gun rack and Guns
		bodyModel[276].setRotationPoint(2.25F, -7.75F, -5.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -1F, 0.5F, -0.125F, -1F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Gun rack and Guns
		bodyModel[277].setRotationPoint(2.25F, -8F, -2.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Gun rack and Guns
		bodyModel[278].setRotationPoint(2.25F, -8F, -1.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Gun rack and Guns
		bodyModel[279].setRotationPoint(2.25F, -8F, 2.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F); // Gun rack and Guns
		bodyModel[280].setRotationPoint(2.25F, -5.5F, 2.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Gun rack and Guns
		bodyModel[281].setRotationPoint(2.25F, -5.75F, -2.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Gun rack and Guns
		bodyModel[282].setRotationPoint(2.25F, -5.75F, -5.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, -1F, 0.5F, -0.125F, -1F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F); // Gun rack and Guns
		bodyModel[283].setRotationPoint(2.25F, -5.75F, 1.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, -3F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0.25F, 0F); // Box 390
		bodyModel[284].setRotationPoint(-29.5F, 6.5F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[285].setRotationPoint(-25.5F, 6.5F, -4.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0F); // Box 392
		bodyModel[286].setRotationPoint(-30.5F, 6.5F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 3F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0.25F, 0F); // Box 393
		bodyModel[287].setRotationPoint(-29.5F, 6.5F, 0F);

		bodyModel[288].addShapeBox(1F, 0F, -5F, 1, 1, 5, 0F,0F, -0.5F, -1F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 395
		bodyModel[288].setRotationPoint(-30F, 6F, 0F);
		bodyModel[288].rotateAngleY = 0.34906585F;

		bodyModel[289].addShapeBox(0F, 0F, 4F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[289].setRotationPoint(-30F, 6F, 0F);
		bodyModel[289].rotateAngleY = 0.34906585F;

		bodyModel[290].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F,-1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -1F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 397
		bodyModel[290].setRotationPoint(-30F, 6F, 0F);
		bodyModel[290].rotateAngleY = 0.34906585F;

		bodyModel[291].addShapeBox(-0.5F, 0F, -6F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 398
		bodyModel[291].setRotationPoint(-30F, 5F, 0F);
		bodyModel[291].rotateAngleY = 0.34906585F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 399
		bodyModel[292].setRotationPoint(-28.5F, 2F, 0F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[293].setRotationPoint(-27.5F, 1.5F, -0.5F);
		bodyModel[293].rotateAngleZ = -0.78539816F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, -0.125F); // Box 399
		bodyModel[294].setRotationPoint(-21F, -1F, 8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -1.125F, -1F, 0F, -1.125F, -1F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 400
		bodyModel[295].setRotationPoint(-21F, 3F, -9F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, -1F, 0F, 0.125F, -1F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 401
		bodyModel[296].setRotationPoint(-21F, 3F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 196
		bodyModel[297].setRotationPoint(-23F, -1F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.5F, 0F, -1F); // Box 200
		bodyModel[298].setRotationPoint(-23F, -1F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, 0F, -2F, -9F); // Box 273 grille
		bodyModel[299].setRotationPoint(-22.99F, -0.75F, -4.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, -0.125F, -1F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, -0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.45F, 0F, 0F, 0.3F); // headlight
		bodyModel[300].setRotationPoint(-23.01F, -1F, -9.01F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.49F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.35F, 0.01F, 0F, 0.25F, -0.49F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0.01F, 0F, 0.4F); // turn signal L
		bodyModel[301].setRotationPoint(-23.02F, 0.5F, -9.02F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.45F, 0F, 0F, -0.125F, -0.5F, 0F, -1F); // headlight
		bodyModel[302].setRotationPoint(-23.01F, -1F, 5.01F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.01F, 0F, 0.2F, 0F, 0F, 0.35F, 0F, 0F, -0.125F, -0.49F, 0F, -1F, 0.01F, 0F, 0.35F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.49F, 0F, -1F); // turn signal r
		bodyModel[303].setRotationPoint(-23.02F, 0.5F, 5.02F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // running board
		bodyModel[304].setRotationPoint(-9F, 5.5F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // running board
		bodyModel[305].setRotationPoint(-9F, 5.5F, 7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // running board hanger cull
		bodyModel[306].setRotationPoint(-7F, 3.5F, 6F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // running board hanger cull
		bodyModel[307].setRotationPoint(-7F, 3.5F, -7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,1F, -0.5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -3.5F, 0F); // Box 455
		bodyModel[308].setRotationPoint(12.5F, 3.5F, 6F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 566 CULL sus pension hangar
		bodyModel[309].setRotationPoint(11.5F, 2.5F, 6F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // CULL sus pension hangar
		bodyModel[310].setRotationPoint(11.5F, 2.5F, -7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,1F, -0.5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -3.5F, 0F); // Box 378
		bodyModel[311].setRotationPoint(12.5F, 3.5F, -7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0.5F, 0.625F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.5F, 0.625F, 0F, 0.5F, 0F, 0F, -0.375F, -0.25F, 0F, -0.375F, -0.25F, 0F, 0.5F, 0F, 0F); // Box 799 tailgate
		bodyModel[312].setRotationPoint(24F, -1F, -8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.125F, -0.375F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 353
		bodyModel[313].setRotationPoint(24F, 1F, 8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.125F, 0F, 0.25F, 0.125F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, -1.125F, -1F, 0F, -1.125F); // Box 355
		bodyModel[314].setRotationPoint(20F, 3F, 8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[315].setRotationPoint(20F, -1F, 8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.125F, 0F, 0F, 0.125F, -1F, 0F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.25F, 0.125F, -1F, 0F, 0.125F); // Box 96
		bodyModel[316].setRotationPoint(20F, 3F, -9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, 0F, 0F, 0.125F); // Box 97
		bodyModel[317].setRotationPoint(20F, -1F, -9F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.375F, -0.25F, 0F, 0F, 0.75F, 0.125F); // Box 120
		bodyModel[318].setRotationPoint(24F, 1F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,0.5F, 0F, 0.5F, 0F, -0.625F, 0.625F, 0F, -0.625F, 0.625F, 0.5F, 0F, 0.5F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.125F, -0.5F, -0.25F, 0.125F, 0.5F, -0.25F, -0.25F); // Box 379
		bodyModel[319].setRotationPoint(23.5F, 2F, -7.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 380
		bodyModel[320].setRotationPoint(24F, 2.75F, -8F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.625F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, -0.375F, 0.5F, 0F, -0.25F, -0.125F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.5F, -0.25F, 0.125F, 0.5F, -0.25F, 0.5F); // Box 381
		bodyModel[321].setRotationPoint(23.5F, 2F, -8.75F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.5F, 0F, -0.25F, 0F, -0.5F, -0.375F, -0.375F, 0F, 0F, -0.625F, 0F, 0F, 0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.125F, -0.875F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F); // Box 382
		bodyModel[322].setRotationPoint(23.5F, 2F, 7.75F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.5F, -0.375F, -0.25F, -0.5F, -1F, -0.25F, 0.5F, 0F, -0.125F, 0.5F); // Box 89
		bodyModel[323].setRotationPoint(22F, 2F, -8.75F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.25F, -1F, 0F, -0.25F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0.5F, -1F, -0.25F, 0.5F, -0.375F, -0.25F, -0.5F, 0F, -0.125F, -0.5F); // Box 383
		bodyModel[324].setRotationPoint(22F, 2F, 7.75F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.5F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.75F, 0F, -1F); // Box 393
		bodyModel[325].setRotationPoint(-23F, 2F, 5F);

		bodyModel[326].addShapeBox(0.01F, -1.5F, -1.5F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Steering wheel
		bodyModel[326].setRotationPoint(-8.5F, -2F, -4.56F);
		bodyModel[326].rotateAngleZ = 0.48869219F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[327].setRotationPoint(-22F, -1F, -5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Plow Components
		bodyModel[328].setRotationPoint(-27.5F, 2.5F, -3.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -1.125F, -0.25F, -0.125F, 0.125F, -0.25F, -0.125F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, 0.5F, 0F, 0F); // Box 352
		bodyModel[329].setRotationPoint(-22F, -2F, 5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.125F, -0.25F, -0.125F, -1.125F, -0.25F, -0.125F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.875F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 353
		bodyModel[330].setRotationPoint(-22F, -2F, -8F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.875F, -0.25F, -1.125F, -1.125F, -0.25F, -1.125F, -0.5F, 0.75F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[331].setRotationPoint(-23F, -2F, -9F);
	}
}