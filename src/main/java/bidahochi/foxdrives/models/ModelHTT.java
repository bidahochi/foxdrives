//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.03.2025 - 17:09:29
// Last changed on: 12.03.2025 - 17:09:29

package bidahochi.foxdrives.models; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelHTT extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelHTT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[295];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 212, 233, textureX, textureY); // Box 124 axle 3-4
		bodyModel[1] = new ModelRendererTurbo(this, 218, 209, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[2] = new ModelRendererTurbo(this, 218, 215, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[3] = new ModelRendererTurbo(this, 218, 221, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[4] = new ModelRendererTurbo(this, 240, 216, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[5] = new ModelRendererTurbo(this, 218, 227, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[6] = new ModelRendererTurbo(this, 204, 227, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[7] = new ModelRendererTurbo(this, 204, 216, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[8] = new ModelRendererTurbo(this, 204, 210, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[9] = new ModelRendererTurbo(this, 218, 203, textureX, textureY, "wheel"); // Box 101 wheel 3 cover
		bodyModel[10] = new ModelRendererTurbo(this, 193, 227, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[11] = new ModelRendererTurbo(this, 193, 216, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[12] = new ModelRendererTurbo(this, 193, 210, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[13] = new ModelRendererTurbo(this, 229, 209, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[14] = new ModelRendererTurbo(this, 229, 215, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[15] = new ModelRendererTurbo(this, 229, 221, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[16] = new ModelRendererTurbo(this, 229, 227, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[17] = new ModelRendererTurbo(this, 240, 210, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[18] = new ModelRendererTurbo(this, 206, 203, textureX, textureY, "wheel"); // Box 104 wheel 4 cover
		bodyModel[19] = new ModelRendererTurbo(this, 1, 248, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 121, 195, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 41, 239, textureX, textureY); // Box 42
		bodyModel[24] = new ModelRendererTurbo(this, 121, 200, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 46
		bodyModel[27] = new ModelRendererTurbo(this, 121, 205, textureX, textureY); // Box 47
		bodyModel[28] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 48
		bodyModel[29] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 121, 210, textureX, textureY); // Box 50
		bodyModel[31] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 52
		bodyModel[33] = new ModelRendererTurbo(this, 40, 237, textureX, textureY); // Box 53
		bodyModel[34] = new ModelRendererTurbo(this, 40, 241, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 144, 14, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 142, 20, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 164, 12, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 175, 12, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 189, 10, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 167, 17, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 184, 13, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 62
		bodyModel[43] = new ModelRendererTurbo(this, 117, 1, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 129, 204, textureX, textureY); // Box 65
		bodyModel[46] = new ModelRendererTurbo(this, 110, 215, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 121, 215, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 61, 2, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 83, 7, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 55, 7, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 92, 1, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 126, 217, textureX, textureY, "cull"); // Box cull strutsbit
		bodyModel[53] = new ModelRendererTurbo(this, 111, 202, textureX, textureY); // Box strutsbit
		bodyModel[54] = new ModelRendererTurbo(this, 111, 195, textureX, textureY); // Box strutsbit
		bodyModel[55] = new ModelRendererTurbo(this, 116, 202, textureX, textureY); // Box 76
		bodyModel[56] = new ModelRendererTurbo(this, 117, 220, textureX, textureY); // Box 77
		bodyModel[57] = new ModelRendererTurbo(this, 116, 195, textureX, textureY); // Box 78
		bodyModel[58] = new ModelRendererTurbo(this, 120, 6, textureX, textureY); // Box 79
		bodyModel[59] = new ModelRendererTurbo(this, 170, 20, textureX, textureY); // Box 80
		bodyModel[60] = new ModelRendererTurbo(this, 169, 23, textureX, textureY); // Box 81
		bodyModel[61] = new ModelRendererTurbo(this, 196, 20, textureX, textureY); // Box 84
		bodyModel[62] = new ModelRendererTurbo(this, 187, 20, textureX, textureY); // Box 85
		bodyModel[63] = new ModelRendererTurbo(this, 115, 19, textureX, textureY); // Box 86
		bodyModel[64] = new ModelRendererTurbo(this, 159, 216, textureX, textureY, "wheel front"); // Box Wheel 2
		bodyModel[65] = new ModelRendererTurbo(this, 170, 210, textureX, textureY, "wheel front"); // Box Wheel 2
		bodyModel[66] = new ModelRendererTurbo(this, 170, 227, textureX, textureY, "wheel front"); // Box Wheel 2
		bodyModel[67] = new ModelRendererTurbo(this, 159, 227, textureX, textureY, "wheel front"); // Box Wheel 1
		bodyModel[68] = new ModelRendererTurbo(this, 170, 216, textureX, textureY, "wheel front"); // Box Wheel 1
		bodyModel[69] = new ModelRendererTurbo(this, 159, 210, textureX, textureY, "wheel front"); // Box Wheel 1
		bodyModel[70] = new ModelRendererTurbo(this, 159, 204, textureX, textureY, "wheel front"); // Box Wheel 1
		bodyModel[71] = new ModelRendererTurbo(this, 171, 199, textureX, textureY, "wheel front"); // Box Wheel 1
		bodyModel[72] = new ModelRendererTurbo(this, 52, 91, textureX, textureY); // Box 105
		bodyModel[73] = new ModelRendererTurbo(this, 20, 91, textureX, textureY); // Box trad hood
		bodyModel[74] = new ModelRendererTurbo(this, 52, 95, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 23, 171, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 24, 175, textureX, textureY); // Box 93
		bodyModel[77] = new ModelRendererTurbo(this, 29, 104, textureX, textureY); // Box 97
		bodyModel[78] = new ModelRendererTurbo(this, 29, 77, textureX, textureY); // Box 98
		bodyModel[79] = new ModelRendererTurbo(this, 43, 111, textureX, textureY); // Box 99
		bodyModel[80] = new ModelRendererTurbo(this, 38, 143, textureX, textureY); // Box 100
		bodyModel[81] = new ModelRendererTurbo(this, 55, 156, textureX, textureY); // Box 105
		bodyModel[82] = new ModelRendererTurbo(this, 18, 142, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 38, 175, textureX, textureY); // Box 107
		bodyModel[84] = new ModelRendererTurbo(this, 31, 82, textureX, textureY, "lamp"); // Box 59 headlight
		bodyModel[85] = new ModelRendererTurbo(this, 58, 78, textureX, textureY); // Box 121
		bodyModel[86] = new ModelRendererTurbo(this, 43, 104, textureX, textureY); // Box 112
		bodyModel[87] = new ModelRendererTurbo(this, 48, 111, textureX, textureY); // Box 116
		bodyModel[88] = new ModelRendererTurbo(this, 54, 83, textureX, textureY); // Box 119
		bodyModel[89] = new ModelRendererTurbo(this, 53, 111, textureX, textureY); // Box 122
		bodyModel[90] = new ModelRendererTurbo(this, 54, 88, textureX, textureY); // Box 123
		bodyModel[91] = new ModelRendererTurbo(this, 25, 78, textureX, textureY); // Box 124
		bodyModel[92] = new ModelRendererTurbo(this, 61, 102, textureX, textureY); // Box 126
		bodyModel[93] = new ModelRendererTurbo(this, 30, 63, textureX, textureY); // Box 127
		bodyModel[94] = new ModelRendererTurbo(this, 3, 63, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 10, 83, textureX, textureY); // Box 129
		bodyModel[96] = new ModelRendererTurbo(this, 25, 111, textureX, textureY); // Box 130
		bodyModel[97] = new ModelRendererTurbo(this, 49, 78, textureX, textureY); // Box 132
		bodyModel[98] = new ModelRendererTurbo(this, 43, 42, textureX, textureY); // Box 134
		bodyModel[99] = new ModelRendererTurbo(this, 9, 42, textureX, textureY); // Box 135
		bodyModel[100] = new ModelRendererTurbo(this, 53, 36, textureX, textureY); // Box 136
		bodyModel[101] = new ModelRendererTurbo(this, 30, 69, textureX, textureY); // Box 152
		bodyModel[102] = new ModelRendererTurbo(this, 201, 12, textureX, textureY); // Box 154
		bodyModel[103] = new ModelRendererTurbo(this, 66, 56, textureX, textureY); // Box 156
		bodyModel[104] = new ModelRendererTurbo(this, 6, 91, textureX, textureY); // Box 157
		bodyModel[105] = new ModelRendererTurbo(this, 6, 95, textureX, textureY); // Box 158
		bodyModel[106] = new ModelRendererTurbo(this, 35, 111, textureX, textureY); // Box 160
		bodyModel[107] = new ModelRendererTurbo(this, 30, 143, textureX, textureY); // Box 161
		bodyModel[108] = new ModelRendererTurbo(this, 9, 156, textureX, textureY); // Box 162
		bodyModel[109] = new ModelRendererTurbo(this, 84, 66, textureX, textureY); // Box 163
		bodyModel[110] = new ModelRendererTurbo(this, 3, 69, textureX, textureY); // Box 166
		bodyModel[111] = new ModelRendererTurbo(this, 84, 61, textureX, textureY); // Box 167
		bodyModel[112] = new ModelRendererTurbo(this, 84, 41, textureX, textureY); // Box 168
		bodyModel[113] = new ModelRendererTurbo(this, 48, 46, textureX, textureY); // Box 133
		bodyModel[114] = new ModelRendererTurbo(this, 35, 49, textureX, textureY); // Box 131
		bodyModel[115] = new ModelRendererTurbo(this, 24, 50, textureX, textureY); // Box 60
		bodyModel[116] = new ModelRendererTurbo(this, 6, 46, textureX, textureY); // Box 139
		bodyModel[117] = new ModelRendererTurbo(this, 11, 49, textureX, textureY); // Box 140
		bodyModel[118] = new ModelRendererTurbo(this, 24, 39, textureX, textureY); // Box 141
		bodyModel[119] = new ModelRendererTurbo(this, 11, 41, textureX, textureY); // Box 142
		bodyModel[120] = new ModelRendererTurbo(this, 35, 41, textureX, textureY); // Box 143
		bodyModel[121] = new ModelRendererTurbo(this, 19, 33, textureX, textureY); // Box 144
		bodyModel[122] = new ModelRendererTurbo(this, 35, 34, textureX, textureY); // Box 145
		bodyModel[123] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 146
		bodyModel[124] = new ModelRendererTurbo(this, 39, 31, textureX, textureY); // Box 147
		bodyModel[125] = new ModelRendererTurbo(this, 1, 36, textureX, textureY); // Box 148
		bodyModel[126] = new ModelRendererTurbo(this, 5, 31, textureX, textureY); // Box 149
		bodyModel[127] = new ModelRendererTurbo(this, 51, 43, textureX, textureY); // Box 150
		bodyModel[128] = new ModelRendererTurbo(this, 67, 36, textureX, textureY); // Box 152
		bodyModel[129] = new ModelRendererTurbo(this, 48, 53, textureX, textureY); // Box 153
		bodyModel[130] = new ModelRendererTurbo(this, 6, 53, textureX, textureY); // Box 154
		bodyModel[131] = new ModelRendererTurbo(this, 58, 50, textureX, textureY); // Box 212
		bodyModel[132] = new ModelRendererTurbo(this, 58, 36, textureX, textureY); // Box 172
		bodyModel[133] = new ModelRendererTurbo(this, 10, 88, textureX, textureY); // Box 159
		bodyModel[134] = new ModelRendererTurbo(this, 13, 102, textureX, textureY); // Box 160
		bodyModel[135] = new ModelRendererTurbo(this, 121, 87, textureX, textureY); // widevision mirors
		bodyModel[136] = new ModelRendererTurbo(this, 128, 81, textureX, textureY); // widevision mirors
		bodyModel[137] = new ModelRendererTurbo(this, 133, 92, textureX, textureY); // widevision mirors
		bodyModel[138] = new ModelRendererTurbo(this, 133, 88, textureX, textureY); // widevision mirors
		bodyModel[139] = new ModelRendererTurbo(this, 1, 252, textureX, textureY); // Box 173
		bodyModel[140] = new ModelRendererTurbo(this, 26, 137, textureX, textureY); // Box 174
		bodyModel[141] = new ModelRendererTurbo(this, 41, 150, textureX, textureY); // Box 175
		bodyModel[142] = new ModelRendererTurbo(this, 25, 150, textureX, textureY); // Box 176
		bodyModel[143] = new ModelRendererTurbo(this, 121, 93, textureX, textureY); // widevision mirors
		bodyModel[144] = new ModelRendererTurbo(this, 56, 239, textureX, textureY); // Box 184
		bodyModel[145] = new ModelRendererTurbo(this, 71, 239, textureX, textureY); // Box 185
		bodyModel[146] = new ModelRendererTurbo(this, 101, 5, textureX, textureY, "cull"); // Box 188 cull
		bodyModel[147] = new ModelRendererTurbo(this, 13, 125, textureX, textureY); // Box 191
		bodyModel[148] = new ModelRendererTurbo(this, 13, 120, textureX, textureY, "leftTurnLight"); // Box turnlight L
		bodyModel[149] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 195
		bodyModel[150] = new ModelRendererTurbo(this, 6, 120, textureX, textureY, "rightTurnLight"); // Box turnlight R
		bodyModel[151] = new ModelRendererTurbo(this, 3, 49, textureX, textureY); // Box 197
		bodyModel[152] = new ModelRendererTurbo(this, 3, 47, textureX, textureY); // Box 198
		bodyModel[153] = new ModelRendererTurbo(this, 43, 82, textureX, textureY, "lamp"); // Box 199 headlight
		bodyModel[154] = new ModelRendererTurbo(this, 14, 78, textureX, textureY); // Box 200
		bodyModel[155] = new ModelRendererTurbo(this, 30, 111, textureX, textureY); // Box 202
		bodyModel[156] = new ModelRendererTurbo(this, 30, 60, textureX, textureY); // Box 319
		bodyModel[157] = new ModelRendererTurbo(this, 3, 43, textureX, textureY); // Box 171
		bodyModel[158] = new ModelRendererTurbo(this, 58, 57, textureX, textureY); // Box 172
		bodyModel[159] = new ModelRendererTurbo(this, 58, 43, textureX, textureY); // Box 173
		bodyModel[160] = new ModelRendererTurbo(this, 7, 60, textureX, textureY); // Box 174
		bodyModel[161] = new ModelRendererTurbo(this, 183, 182, textureX, textureY); // Box 147
		bodyModel[162] = new ModelRendererTurbo(this, 233, 184, textureX, textureY); // Box 148
		bodyModel[163] = new ModelRendererTurbo(this, 208, 176, textureX, textureY); // Box 149
		bodyModel[164] = new ModelRendererTurbo(this, 208, 179, textureX, textureY); // Box 269
		bodyModel[165] = new ModelRendererTurbo(this, 114, 87, textureX, textureY); // widevision mirors
		bodyModel[166] = new ModelRendererTurbo(this, 128, 88, textureX, textureY); // widevision mirors
		bodyModel[167] = new ModelRendererTurbo(this, 133, 84, textureX, textureY); // widevision mirors
		bodyModel[168] = new ModelRendererTurbo(this, 133, 80, textureX, textureY); // widevision mirors
		bodyModel[169] = new ModelRendererTurbo(this, 114, 93, textureX, textureY); // widevision mirors
		bodyModel[170] = new ModelRendererTurbo(this, 209, 174, textureX, textureY); // Box 151
		bodyModel[171] = new ModelRendererTurbo(this, 198, 185, textureX, textureY, "cull"); // cull adjuster rail
		bodyModel[172] = new ModelRendererTurbo(this, 241, 168, textureX, textureY); // Box 187
		bodyModel[173] = new ModelRendererTurbo(this, 226, 168, textureX, textureY); // Box 188
		bodyModel[174] = new ModelRendererTurbo(this, 196, 165, textureX, textureY); // Box 189
		bodyModel[175] = new ModelRendererTurbo(this, 196, 171, textureX, textureY); // Box 190
		bodyModel[176] = new ModelRendererTurbo(this, 184, 170, textureX, textureY,"brakeLight"); // Box taillight
		bodyModel[177] = new ModelRendererTurbo(this, 189, 174, textureX, textureY); // Box 192
		bodyModel[178] = new ModelRendererTurbo(this, 184, 168, textureX, textureY,"leftTurnLight"); // Box turnlight L
		bodyModel[179] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 197
		bodyModel[180] = new ModelRendererTurbo(this, 208, 172, textureX, textureY, "cull"); // cull im gunna pintle HIYTCH yuh
		bodyModel[181] = new ModelRendererTurbo(this, 160, 40, textureX, textureY); // Box 200
		bodyModel[182] = new ModelRendererTurbo(this, 169, 40, textureX, textureY); // Box 201
		bodyModel[183] = new ModelRendererTurbo(this, 175, 31, textureX, textureY); // Box 202
		bodyModel[184] = new ModelRendererTurbo(this, 145, 31, textureX, textureY); // Box 203
		bodyModel[185] = new ModelRendererTurbo(this, 176, 47, textureX, textureY); // Box 204
		bodyModel[186] = new ModelRendererTurbo(this, 160, 32, textureX, textureY); // Box 205
		bodyModel[187] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 207
		bodyModel[188] = new ModelRendererTurbo(this, 160, 61, textureX, textureY); // Box 208
		bodyModel[189] = new ModelRendererTurbo(this, 169, 61, textureX, textureY); // Box 209
		bodyModel[190] = new ModelRendererTurbo(this, 176, 52, textureX, textureY); // Box 210
		bodyModel[191] = new ModelRendererTurbo(this, 146, 52, textureX, textureY); // Box 211
		bodyModel[192] = new ModelRendererTurbo(this, 176, 68, textureX, textureY); // Box 212
		bodyModel[193] = new ModelRendererTurbo(this, 161, 53, textureX, textureY); // Box 213
		bodyModel[194] = new ModelRendererTurbo(this, 176, 65, textureX, textureY); // Box 214
		bodyModel[195] = new ModelRendererTurbo(this, 94, 87, textureX, textureY); // Box 188
		bodyModel[196] = new ModelRendererTurbo(this, 77, 87, textureX, textureY); // Box 216
		bodyModel[197] = new ModelRendererTurbo(this, 121, 78, textureX, textureY); // standard mirrors
		bodyModel[198] = new ModelRendererTurbo(this, 121, 83, textureX, textureY); // standard mirrors
		bodyModel[199] = new ModelRendererTurbo(this, 114, 78, textureX, textureY); // standard mirrors
		bodyModel[200] = new ModelRendererTurbo(this, 58, 33, textureX, textureY, "lamp"); // Box headlight
		bodyModel[201] = new ModelRendererTurbo(this, 65, 33, textureX, textureY, "lamp"); // Box headlight
		bodyModel[202] = new ModelRendererTurbo(this, 65, 33, textureX, textureY, "lamp"); // Box headlight
		bodyModel[203] = new ModelRendererTurbo(this, 65, 33, textureX, textureY, "lamp"); // Box headlight
		bodyModel[204] = new ModelRendererTurbo(this, 58, 33, textureX, textureY, "lamp"); // Box headlight
		bodyModel[205] = new ModelRendererTurbo(this, 8, 15, textureX, textureY); // Box 364 prime base
		bodyModel[206] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "prime1"); // Box 6 PRIME2-1
		bodyModel[207] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "prime3"); // Box 7 PRIME2-3
		bodyModel[208] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "prime2"); // Box 8 PRIME2-2
		bodyModel[209] = new ModelRendererTurbo(this, 1, 17, textureX, textureY, "prime4"); // Box 9 PRIME2-4
		bodyModel[210] = new ModelRendererTurbo(this, 176, 40, textureX, textureY, "cull"); // Box cull lil steppa
		bodyModel[211] = new ModelRendererTurbo(this, 176, 61, textureX, textureY, "cull"); // Box cull lil steppa
		bodyModel[212] = new ModelRendererTurbo(this, 114, 83, textureX, textureY); // standard mirrors
		bodyModel[213] = new ModelRendererTurbo(this, 228, 149, textureX, textureY); // Box 152 hirail shit
		bodyModel[214] = new ModelRendererTurbo(this, 228, 149, textureX, textureY); // Box 151 hirail shit
		bodyModel[215] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 150 hirail shit wheel
		bodyModel[216] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 149 hirail shit wheel
		bodyModel[217] = new ModelRendererTurbo(this, 193, 150, textureX, textureY); // Box 148 hirail shit axle
		bodyModel[218] = new ModelRendererTurbo(this, 204, 148, textureX, textureY); // Box 31
		bodyModel[219] = new ModelRendererTurbo(this, 233, 147, textureX, textureY); // Box 243
		bodyModel[220] = new ModelRendererTurbo(this, 233, 147, textureX, textureY); // Box 244
		bodyModel[221] = new ModelRendererTurbo(this, 239, 155, textureX, textureY); // Box magnolia knux
		bodyModel[222] = new ModelRendererTurbo(this, 239, 161, textureX, textureY); // Box magnolia knux
		bodyModel[223] = new ModelRendererTurbo(this, 233, 151, textureX, textureY); // Box 247
		bodyModel[224] = new ModelRendererTurbo(this, 233, 151, textureX, textureY); // Box 249
		bodyModel[225] = new ModelRendererTurbo(this, 223, 155, textureX, textureY); // Box 254
		bodyModel[226] = new ModelRendererTurbo(this, 223, 149, textureX, textureY); // Box 255
		bodyModel[227] = new ModelRendererTurbo(this, 178, 148, textureX, textureY); // Box 256
		bodyModel[228] = new ModelRendererTurbo(this, 223, 149, textureX, textureY); // Box 257
		bodyModel[229] = new ModelRendererTurbo(this, 241, 150, textureX, textureY); // Box 258
		bodyModel[230] = new ModelRendererTurbo(this, 241, 150, textureX, textureY); // Box 259
		bodyModel[231] = new ModelRendererTurbo(this, 26, 2, textureX, textureY); // Box 104
		bodyModel[232] = new ModelRendererTurbo(this, 32, 7, textureX, textureY); // Box 262
		bodyModel[233] = new ModelRendererTurbo(this, 29, 7, textureX, textureY); // Box 263
		bodyModel[234] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 203 lightbar frame
		bodyModel[235] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Box 204 lightbar frame
		bodyModel[236] = new ModelRendererTurbo(this, 30, 27, textureX, textureY, "prime1"); // Box 206 lightbar glow 1f
		bodyModel[237] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 207 lightbar support
		bodyModel[238] = new ModelRendererTurbo(this, 30, 18, textureX, textureY, "prime1"); // Box 208 lightbar glow 1r
		bodyModel[239] = new ModelRendererTurbo(this, 30, 21, textureX, textureY, "prime3"); // Box 209 lightbar glow 3f
		bodyModel[240] = new ModelRendererTurbo(this, 30, 24, textureX, textureY, "prime3"); // Box 210 lightbar glow 3r
		bodyModel[241] = new ModelRendererTurbo(this, 2, 27, textureX, textureY, "cull"); // Box cull lightbar support
		bodyModel[242] = new ModelRendererTurbo(this, 75, 12, textureX, textureY); // Box tractorpope
		bodyModel[243] = new ModelRendererTurbo(this, 82, 12, textureX, textureY); // Box tractorpope
		bodyModel[244] = new ModelRendererTurbo(this, 103, 34, textureX, textureY); // Box 275
		bodyModel[245] = new ModelRendererTurbo(this, 104, 56, textureX, textureY); // Box 277
		bodyModel[246] = new ModelRendererTurbo(this, 214, 33, textureX, textureY); // Box 223
		bodyModel[247] = new ModelRendererTurbo(this, 196, 28, textureX, textureY); // Box 224
		bodyModel[248] = new ModelRendererTurbo(this, 210, 1, textureX, textureY); // Box 226 steeringwhool
		bodyModel[249] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 227
		bodyModel[250] = new ModelRendererTurbo(this, 211, 0, textureX, textureY); // Box 318
		bodyModel[251] = new ModelRendererTurbo(this, 221, 2, textureX, textureY); // Box 283
		bodyModel[252] = new ModelRendererTurbo(this, 234, 3, textureX, textureY); // Box 284
		bodyModel[253] = new ModelRendererTurbo(this, 214, 12, textureX, textureY); // Box 285
		bodyModel[254] = new ModelRendererTurbo(this, 245, 4, textureX, textureY); // Box floor shifter upfit
		bodyModel[255] = new ModelRendererTurbo(this, 238, 10, textureX, textureY); // Box floor shifter upfit
		bodyModel[256] = new ModelRendererTurbo(this, 23, 141, textureX, textureY); // Box 264
		bodyModel[257] = new ModelRendererTurbo(this, 52, 115, textureX, textureY); // Box 265
		bodyModel[258] = new ModelRendererTurbo(this, 77, 92, textureX, textureY, "cull"); // Box cull inner fender
		bodyModel[259] = new ModelRendererTurbo(this, 31, 104, textureX, textureY); // Box 267
		bodyModel[260] = new ModelRendererTurbo(this, 22, 115, textureX, textureY); // Box 268
		bodyModel[261] = new ModelRendererTurbo(this, 32, 148, textureX, textureY); // Box 269
		bodyModel[262] = new ModelRendererTurbo(this, 76, 8, textureX, textureY); // Box 270
		bodyModel[263] = new ModelRendererTurbo(this, 144, 80, textureX, textureY); // batterybox w/ step
		bodyModel[264] = new ModelRendererTurbo(this, 147, 72, textureX, textureY); // batterybox w/ step
		bodyModel[265] = new ModelRendererTurbo(this, 160, 73, textureX, textureY); // batterybox w/ step
		bodyModel[266] = new ModelRendererTurbo(this, 163, 81, textureX, textureY); // batterybox w/ step
		bodyModel[267] = new ModelRendererTurbo(this, 184, 170, textureX, textureY,"brakeLight"); // Box taillight
		bodyModel[268] = new ModelRendererTurbo(this, 184, 168, textureX, textureY, "rightTurnLight"); // Box turnlight R
		bodyModel[269] = new ModelRendererTurbo(this, 77, 97, textureX, textureY, "cull"); // Box cull inner fender
		bodyModel[270] = new ModelRendererTurbo(this, 121, 98, textureX, textureY); // Box 272
		bodyModel[271] = new ModelRendererTurbo(this, 128, 99, textureX, textureY); // Box 273
		bodyModel[272] = new ModelRendererTurbo(this, 107, 98, textureX, textureY); // Box 274
		bodyModel[273] = new ModelRendererTurbo(this, 114, 99, textureX, textureY); // Box 275
		bodyModel[274] = new ModelRendererTurbo(this, 159, 204, textureX, textureY, "wheel front"); // Box Wheel 2
		bodyModel[275] = new ModelRendererTurbo(this, 171, 199, textureX, textureY, "wheel front"); // Box Wheel 2
		bodyModel[276] = new ModelRendererTurbo(this, 58, 27, textureX, textureY); // Box 272
		bodyModel[277] = new ModelRendererTurbo(this, 63, 24, textureX, textureY); // Box 274
		bodyModel[278] = new ModelRendererTurbo(this, 58, 30, textureX, textureY); // Box 411
		bodyModel[279] = new ModelRendererTurbo(this, 58, 24, textureX, textureY); // Box 413
		bodyModel[280] = new ModelRendererTurbo(this, 35, 6, textureX, textureY); // Box 280
		bodyModel[281] = new ModelRendererTurbo(this, 35, 6, textureX, textureY); // Box 281
		bodyModel[282] = new ModelRendererTurbo(this, 231, 135, textureX, textureY); // Box 251 trailer cable holder
		bodyModel[283] = new ModelRendererTurbo(this, 236, 122, textureX, textureY, "cull"); // Box 252 cull trailer cables
		bodyModel[284] = new ModelRendererTurbo(this, 42, 21, textureX, textureY); // Box 417
		bodyModel[285] = new ModelRendererTurbo(this, 42, 24, textureX, textureY); // Box 418
		bodyModel[286] = new ModelRendererTurbo(this, 42, 27, textureX, textureY); // Box 419
		bodyModel[287] = new ModelRendererTurbo(this, 42, 18, textureX, textureY); // Box 420
		bodyModel[288] = new ModelRendererTurbo(this, 4, -3, textureX, textureY); // Box front lisenceplate
		bodyModel[289] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box rear lisenceplate
		bodyModel[290] = new ModelRendererTurbo(this, 38, 3, textureX, textureY); // Box front lisenceplate
		bodyModel[291] = new ModelRendererTurbo(this, 38, -2, textureX, textureY); // Box rear lisenceplate
		bodyModel[292] = new ModelRendererTurbo(this, 176, 246, textureX, textureY, "cull"); // Box 211 cull quarter pounder (fender)
		bodyModel[293] = new ModelRendererTurbo(this, 136, 235, textureX, textureY); // Box 213 quarter fender holder (dont texture mid section)
		bodyModel[294] = new ModelRendererTurbo(this, 176, 246, textureX, textureY, "cull"); // Box 306 cull quarter pounder (fender)

		bodyModel[0].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[0].setRotationPoint(19F, 6F, -9.5F);

		bodyModel[1].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[1].setRotationPoint(19F, 6F, -9F);

		bodyModel[2].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[2].setRotationPoint(19F, 6F, -9F);

		bodyModel[3].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[3].setRotationPoint(19F, 6F, -9F);

		bodyModel[4].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[4].setRotationPoint(19F, 6F, -9F);

		bodyModel[5].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[5].setRotationPoint(19F, 6F, -9F);

		bodyModel[6].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[6].setRotationPoint(19F, 6F, -7.5F);

		bodyModel[7].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[7].setRotationPoint(19F, 6F, -7.5F);

		bodyModel[8].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[8].setRotationPoint(19F, 6F, -7.5F);

		bodyModel[9].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101 wheel 3 cover
		bodyModel[9].setRotationPoint(19F, 6F, -9F);

		bodyModel[10].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[10].setRotationPoint(19F, 6F, 5.5F);

		bodyModel[11].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[11].setRotationPoint(19F, 6F, 5.5F);

		bodyModel[12].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[12].setRotationPoint(19F, 6F, 5.5F);

		bodyModel[13].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[13].setRotationPoint(19F, 6F, 9F);

		bodyModel[14].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[14].setRotationPoint(19F, 6F, 9F);

		bodyModel[15].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[15].setRotationPoint(19F, 6F, 9F);

		bodyModel[16].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[16].setRotationPoint(19F, 6F, 9F);

		bodyModel[17].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[17].setRotationPoint(19F, 6F, 9F);

		bodyModel[18].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104 wheel 4 cover
		bodyModel[18].setRotationPoint(19F, 6F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 29
		bodyModel[19].setRotationPoint(-16F, 3.01F, -4.25F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.05F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.05F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(-14F, 3F, -5.25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 35
		bodyModel[21].setRotationPoint(-10F, 3.5F, -5.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 36
		bodyModel[22].setRotationPoint(-14F, 3.5F, -5.25F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[23].setRotationPoint(8F, 3F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.05F, 0F, -0.125F); // Box 44
		bodyModel[24].setRotationPoint(-14F, 3F, 4.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 45
		bodyModel[25].setRotationPoint(-10F, 3.5F, 4.25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 46
		bodyModel[26].setRotationPoint(-14F, 3.5F, 4.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.125F, -0.05F, -0.5F, -0.125F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.05F, 0F, -0.125F); // Box 47
		bodyModel[27].setRotationPoint(15F, 3F, 4.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 48
		bodyModel[28].setRotationPoint(19F, 3.5F, 4.25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 49
		bodyModel[29].setRotationPoint(15F, 3.5F, 4.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,-0.05F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.05F, 0F, 0F); // Box 50
		bodyModel[30].setRotationPoint(15F, 3F, -5.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F); // Box 51
		bodyModel[31].setRotationPoint(15F, 3.5F, -5.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -2F, 0F); // Box 52
		bodyModel[32].setRotationPoint(19F, 3.5F, -5.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F); // Box 53
		bodyModel[33].setRotationPoint(-15.5F, 4F, -2.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0.75F, 0F, -0.75F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 54
		bodyModel[34].setRotationPoint(-15.5F, 4F, 0.75F);

		bodyModel[35].addShapeBox(0F, 1F, 0F, 8, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 55
		bodyModel[35].setRotationPoint(-13.5F, 2.25F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-13.5F, 0.25F, -2.5F);

		bodyModel[37].addShapeBox(0F, 1F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-5.5F, 2.25F, -2F);

		bodyModel[38].addShapeBox(0F, 1F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 58
		bodyModel[38].setRotationPoint(-2.5F, 2.25F, -2F);

		bodyModel[39].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[39].setRotationPoint(19F, 6F, -2.5F);

		bodyModel[40].addShapeBox(0F, -0.5F, -0.5F, 17, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[40].setRotationPoint(0.5F, 4.25F, -1F);
		bodyModel[40].rotateAngleZ = -0.10908308F;

		bodyModel[41].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 61
		bodyModel[41].setRotationPoint(0F, 3.25F, -1F);

		bodyModel[42].addShapeBox(0F, -1F, -0.5F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 62
		bodyModel[42].setRotationPoint(16.5F, 6F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -4.875F, 0F, 0F, -4.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -4.875F, 0F, 0F, -4.875F); // Box 63
		bodyModel[43].setRotationPoint(-15F, -2.25F, -2.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F); // Box 64
		bodyModel[44].setRotationPoint(-13.5F, -0.75F, -1.75F);

		bodyModel[45].addShapeBox(-1F, -1F, 0F, 2, 1, 11, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 65
		bodyModel[45].setRotationPoint(-10F, 6.5F, -5.5F);

		bodyModel[46].addShapeBox(-1F, -1F, 0F, 2, 1, 3, 0F,-0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 66
		bodyModel[46].setRotationPoint(-10F, 6.5F, -8.5F);

		bodyModel[47].addShapeBox(-1F, -1F, 0F, 2, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 67
		bodyModel[47].setRotationPoint(-10F, 6.5F, 5.5F);

		bodyModel[48].addShapeBox(0F, -1F, 0F, 13, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F); // Box 68
		bodyModel[48].setRotationPoint(-7F, 4F, 0.62F);

		bodyModel[49].addShapeBox(0F, -1F, 0F, 2, 2, 2, 0F,-0.25F, -1.5F, -0.25F, -0.25F, -1.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 1.5F, -0.25F); // Box 69
		bodyModel[49].setRotationPoint(5.75F, 2.25F, 0.62F);

		bodyModel[50].addShapeBox(0F, -1F, 0F, 2, 2, 6, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 70
		bodyModel[50].setRotationPoint(5.75F, 2F, 2.12F);

		bodyModel[51].addShapeBox(0F, -1F, 0F, 2, 14, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 71
		bodyModel[51].setRotationPoint(5.75F, -11.75F, 7.12F);

		bodyModel[52].addShapeBox(-1F, -1F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull strutsbit
		bodyModel[52].setRotationPoint(-9F, 7.5F, -7F);

		bodyModel[53].addShapeBox(-0.5F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box strutsbit
		bodyModel[53].setRotationPoint(-6.5F, 4.5F, -3.75F);
		bodyModel[53].rotateAngleZ = -0.61086524F;

		bodyModel[54].addShapeBox(-0.5F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box strutsbit
		bodyModel[54].setRotationPoint(-6.5F, 4.5F, 2.75F);
		bodyModel[54].rotateAngleZ = -0.61086524F;

		bodyModel[55].addShapeBox(-0.5F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 76
		bodyModel[55].setRotationPoint(22.5F, 4.5F, 2.75F);
		bodyModel[55].rotateAngleZ = -0.61086524F;

		bodyModel[56].addShapeBox(-1F, -1F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[56].setRotationPoint(20F, 7.5F, -4.5F);

		bodyModel[57].addShapeBox(-0.5F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 78
		bodyModel[57].setRotationPoint(22.5F, 4.5F, -3.75F);
		bodyModel[57].rotateAngleZ = -0.61086524F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[58].setRotationPoint(-14F, 1.26F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[59].setRotationPoint(-14F, -2F, -2.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 81
		bodyModel[60].setRotationPoint(-7F, -2F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 84
		bodyModel[61].setRotationPoint(-7F, -2F, 2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.375F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Box 85
		bodyModel[62].setRotationPoint(-10.25F, -2F, 2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[63].setRotationPoint(-15.1F, -0.25F, -3F);

		bodyModel[64].addShapeBox(-1.5F, -4F, -1F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Wheel 2
		bodyModel[64].setRotationPoint(-10F, 6F, 9F);

		bodyModel[65].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box Wheel 2
		bodyModel[65].setRotationPoint(-10F, 6F, 9F);

		bodyModel[66].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box Wheel 2
		bodyModel[66].setRotationPoint(-10F, 6F, 9F);

		bodyModel[67].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box Wheel 1
		bodyModel[67].setRotationPoint(-10F, 6F, -9F);

		bodyModel[68].addShapeBox(-1.5F, -4F, -1F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Wheel 1
		bodyModel[68].setRotationPoint(-10F, 6F, -9F);

		bodyModel[69].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box Wheel 1
		bodyModel[69].setRotationPoint(-10F, 6F, -9F);

		bodyModel[70].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Wheel 1
		bodyModel[70].setRotationPoint(-10F, 6F, -9F);

		bodyModel[71].addShapeBox(-1.5F, -1.5F, -1.75F, 3, 3, 1, 0F,-0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Wheel 1
		bodyModel[71].setRotationPoint(-10F, 6F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.75F, -0.25F, 0F, 0.25F, 1F, 0F, 0.75F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0.25F, 0F, 0F); // Box 105
		bodyModel[72].setRotationPoint(-15.5F, -4.5F, -7.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, -0.5F, 0F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0.25F, 0F, 0F); // Box trad hood
		bodyModel[73].setRotationPoint(-15.5F, -4.5F, -5.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -2F, 0.125F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -2F, 0.125F, 0F, -1F); // Box 88
		bodyModel[74].setRotationPoint(-15.5F, -3.5F, -7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, 0F); // Box 92
		bodyModel[75].setRotationPoint(-16.5F, 3.25F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.75F, 0F, 0F, 0.5F, 0F, 0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.25F, 0F, 0.5F, 0F, 0.125F, 0F, 0.25F, 0F, -0.25F, 0F, 0F); // Box 93
		bodyModel[76].setRotationPoint(-16.5F, 3.25F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 97
		bodyModel[77].setRotationPoint(-15.75F, -3.5F, -5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 98
		bodyModel[78].setRotationPoint(-15.75F, 2F, -5.5F);

		bodyModel[79].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 99
		bodyModel[79].setRotationPoint(-16.75F, 2F, -6.5F);

		bodyModel[80].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 100
		bodyModel[80].setRotationPoint(-16.75F, -3.5F, -6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.125F, -5F, 0F, -0.125F, -5F, 0F, -0.25F, -5F, -2F, 0.25F, -5F, -2F); // Box 105
		bodyModel[81].setRotationPoint(-15.37F, -3F, -6.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 10, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -9F, 0F, -5F, -9F); // Box 106
		bodyModel[82].setRotationPoint(-15.62F, -3F, -4.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.125F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0.125F, -0.75F, -0.25F, 0F); // Box 107
		bodyModel[83].setRotationPoint(-16.5F, 3.25F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 59 headlight
		bodyModel[84].setRotationPoint(-15.25F, 0.25F, -10.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.675F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[85].setRotationPoint(-15.5F, -0.5F, -10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 112
		bodyModel[86].setRotationPoint(-15.5F, 2F, -10.5F);

		bodyModel[87].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.5F); // Box 116
		bodyModel[87].setRotationPoint(-16.5F, 0F, -10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 1F, 6, 1, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[88].setRotationPoint(-13F, -1F, -11.5F);

		bodyModel[89].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 122
		bodyModel[89].setRotationPoint(-15.5F, 0.5F, -10.5F);

		bodyModel[90].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 123
		bodyModel[90].setRotationPoint(-15.5F, 0F, -10.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0.25F, -0.25F, -0.3F, 0F, -0.25F, -0.125F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 124
		bodyModel[91].setRotationPoint(-6.5F, -0.5F, -10.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0.25F, 0F, 0.625F, 0.25F, 0F, 0.875F, 0.25F, 0F, -0.875F, 0.25F, 0F); // Box 126
		bodyModel[92].setRotationPoint(-6.5F, 0F, -10.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[93].setRotationPoint(-5.5F, -3.5F, -8.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-5.5F, -3.5F, 7.75F);

		bodyModel[95].addShapeBox(0F, 0F, 1F, 6, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[95].setRotationPoint(-13F, -1F, 6.5F);

		bodyModel[96].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 130
		bodyModel[96].setRotationPoint(-15.5F, 0.5F, 9.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0.75F, 0F, -0.125F, 0F, 0F, -0.3F, 0F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 132
		bodyModel[97].setRotationPoint(-6.5F, -0.5F, 7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134
		bodyModel[98].setRotationPoint(-5.5F, -4.5F, -8.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[99].setRotationPoint(-5.5F, -4.5F, 6.75F);

		bodyModel[100].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[100].setRotationPoint(3.5F, -4.5F, -8.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[101].setRotationPoint(-5.5F, 0.5F, -8.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 154
		bodyModel[102].setRotationPoint(-5.5F, -5.25F, -6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 156
		bodyModel[103].setRotationPoint(4.5F, -4.75F, -7.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0.75F, -1F, 0F, 0.25F, 1F, 0F, -0.75F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F); // Box 157
		bodyModel[104].setRotationPoint(-15.5F, -4.5F, 5.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0.125F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0.125F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1.25F, 0F, 0F, 0F); // Box 158
		bodyModel[105].setRotationPoint(-15.5F, -3.5F, 5.5F);

		bodyModel[106].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.125F, -1F, 0F); // Box 160
		bodyModel[106].setRotationPoint(-16.75F, 2F, 5.5F);

		bodyModel[107].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 161
		bodyModel[107].setRotationPoint(-16.75F, -3.5F, 5.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.125F, 0F, -2F, 0.125F, 0F, -2F, 0.25F, -5F, 0F, -0.25F, -5F, 0F, -0.125F, -5F, -2F, 0.125F, -5F, -2F); // Box 162
		bodyModel[108].setRotationPoint(-15.37F, -3F, 4.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 163
		bodyModel[109].setRotationPoint(-5.5F, 2.5F, -7.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 166
		bodyModel[110].setRotationPoint(-5.5F, 0.5F, 7.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[111].setRotationPoint(-5.5F, 2.5F, 4.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 168
		bodyModel[112].setRotationPoint(-5.5F, 1.5F, -3.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F); // Box 133
		bodyModel[113].setRotationPoint(-5.5F, -10F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-4.5F, 0F, 0F, 4.5F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0.25F, 0.25F, 1F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 131
		bodyModel[114].setRotationPoint(-7F, -10F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 60
		bodyModel[115].setRotationPoint(-7F, -10F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 139
		bodyModel[116].setRotationPoint(-5.5F, -10F, 7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F); // Box 140
		bodyModel[117].setRotationPoint(-7F, -10F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F); // Box 141
		bodyModel[118].setRotationPoint(-1.5F, -12F, -2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F); // Box 142
		bodyModel[119].setRotationPoint(-1.5F, -12F, 2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F); // Box 143
		bodyModel[120].setRotationPoint(-1.5F, -12F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 144
		bodyModel[121].setRotationPoint(-0.5F, -11F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 145
		bodyModel[122].setRotationPoint(-0.5F, -11F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 146
		bodyModel[123].setRotationPoint(-0.5F, -11F, 2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 147
		bodyModel[124].setRotationPoint(-0.5F, -11F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 148
		bodyModel[125].setRotationPoint(-1.25F, -11F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 149
		bodyModel[126].setRotationPoint(-0.5F, -11F, 7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 150
		bodyModel[127].setRotationPoint(-1.25F, -11F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 152
		bodyModel[128].setRotationPoint(4.5F, -10F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 153
		bodyModel[129].setRotationPoint(4.5F, -10F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F); // Box 154
		bodyModel[130].setRotationPoint(4.5F, -10F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F); // Box 212
		bodyModel[131].setRotationPoint(-5F, -10F, -7.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 172
		bodyModel[132].setRotationPoint(-1F, -10F, -7.75F);

		bodyModel[133].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0.125F, -0.25F, -0.5F, 0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 159
		bodyModel[133].setRotationPoint(-15.5F, 0F, 9.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0.25F, 0F, 0.875F, 0.25F, 0F, 0.625F, 0.25F, 0F, -0.875F, 0.25F, 0F); // Box 160
		bodyModel[134].setRotationPoint(-6.5F, 0F, 7.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // widevision mirors
		bodyModel[135].setRotationPoint(-2.5F, -10F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // widevision mirors
		bodyModel[136].setRotationPoint(-2.5F, -9.5F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // widevision mirors
		bodyModel[137].setRotationPoint(-2.5F, -4.5F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.75F, 0F, 0.25F, -1.25F, 0F, 0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.75F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F); // widevision mirors
		bodyModel[138].setRotationPoint(-2.5F, -10F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 41, 2, 1, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 173
		bodyModel[139].setRotationPoint(-16F, 3.01F, 3.25F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 174
		bodyModel[140].setRotationPoint(-15.75F, -0.75F, -4.5F);

		bodyModel[141].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,-0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 175
		bodyModel[141].setRotationPoint(-16.75F, -0.75F, -6.5F);

		bodyModel[142].addShapeBox(1F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 176
		bodyModel[142].setRotationPoint(-16.75F, -0.75F, 4.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // widevision mirors
		bodyModel[143].setRotationPoint(-2.5F, -6.5F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[144].setRotationPoint(24F, 3F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[145].setRotationPoint(16F, 3F, -3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 188 cull
		bodyModel[146].setRotationPoint(5.75F, -8.75F, 7.12F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 191
		bodyModel[147].setRotationPoint(-14F, -3F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.05F, -0.55F, 0.05F, 0.05F, -0.55F, 0.05F, 0.05F, -0.55F, -0.55F, 0.05F, -0.55F, -0.55F, 0.05F, -0.05F, 0.05F, 0.05F, -0.05F, 0.05F, 0.05F, -0.05F, -0.55F, 0.05F, -0.05F, -0.55F); // Box turnlight L
		bodyModel[148].setRotationPoint(-14F, -3F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[149].setRotationPoint(-14F, -3F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.05F, -0.55F, -0.55F, 0.05F, -0.55F, -0.55F, 0.05F, -0.55F, 0.05F, 0.05F, -0.55F, 0.05F, 0.05F, -0.05F, -0.55F, 0.05F, -0.05F, -0.55F, 0.05F, -0.05F, 0.05F, 0.05F, -0.05F, 0.05F); // Box turnlight R
		bodyModel[150].setRotationPoint(-14F, -3F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[151].setRotationPoint(-14F, -1F, -9.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[152].setRotationPoint(-14F, -1F, 9.25F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 199 headlight
		bodyModel[153].setRotationPoint(-15.25F, 0.25F, 7.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.25F, -0.25F, -0.675F, 0F, -0.25F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 200
		bodyModel[154].setRotationPoint(-15.5F, -0.5F, 7.5F);

		bodyModel[155].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.625F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 202
		bodyModel[155].setRotationPoint(-16.5F, 0F, 9.5F);

		bodyModel[156].addShapeBox(1F, 0F, 0F, 9, 1, 1, 0F,0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[156].setRotationPoint(-5.5F, -4.5F, -8.75F);

		bodyModel[157].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[157].setRotationPoint(3.5F, -4.5F, 7.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 6, 0, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 172
		bodyModel[158].setRotationPoint(-5F, -10F, 7.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 173
		bodyModel[159].setRotationPoint(-1F, -10F, 7.75F);

		bodyModel[160].addShapeBox(1F, 0F, 0F, 9, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[160].setRotationPoint(-5.5F, -4.5F, 7.75F);

		bodyModel[161].addBox(-4F, 0F, 0F, 4, 1, 9, 0F); // Box 147
		bodyModel[161].setRotationPoint(20F, 1F, -4.5F);
		bodyModel[161].rotateAngleZ = -0.08726646F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 148
		bodyModel[162].setRotationPoint(20F, 1F, -3.5F);
		bodyModel[162].rotateAngleZ = -0.08726646F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 149
		bodyModel[163].setRotationPoint(20F, 1F, -4.5F);
		bodyModel[163].rotateAngleZ = -0.08726646F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 269
		bodyModel[164].setRotationPoint(20F, 1F, 3.5F);
		bodyModel[164].rotateAngleZ = -0.08726646F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // widevision mirors
		bodyModel[165].setRotationPoint(-2.5F, -10F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // widevision mirors
		bodyModel[166].setRotationPoint(-2.5F, -9.5F, 9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // widevision mirors
		bodyModel[167].setRotationPoint(-2.5F, -4.5F, 8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // widevision mirors
		bodyModel[168].setRotationPoint(-2.5F, -10F, 8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // widevision mirors
		bodyModel[169].setRotationPoint(-2.5F, -6.5F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 151
		bodyModel[170].setRotationPoint(16.5F, 1.5F, -4F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 11, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // cull adjuster rail
		bodyModel[171].setRotationPoint(12F, 2.5F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 187
		bodyModel[172].setRotationPoint(23F, 3.5F, -10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[173].setRotationPoint(23F, 3.5F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[174].setRotationPoint(23.5F, 4.5F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[175].setRotationPoint(23.5F, 4.5F, 5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box taillight
		bodyModel[176].setRotationPoint(25.02F, 4F, -5.79F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 192
		bodyModel[177].setRotationPoint(24F, 3F, -5.79F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box turnlight L
		bodyModel[178].setRotationPoint(25.02F, 3.5F, -5.79F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[179].setRotationPoint(24F, 3F, 3.79F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // cull im gunna pintle HIYTCH yuh
		bodyModel[180].setRotationPoint(24.5F, 3.75F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 200
		bodyModel[181].setRotationPoint(-4.5F, 4F, -10.25F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 201
		bodyModel[182].setRotationPoint(2.5F, 4F, -10.25F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[183].setRotationPoint(2.5F, 3.5F, -9.25F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[184].setRotationPoint(-4.5F, 3.5F, -9.25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 204
		bodyModel[185].setRotationPoint(-1.5F, 6F, -10.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[186].setRotationPoint(-1.5F, 3.5F, -8.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 207
		bodyModel[187].setRotationPoint(-1.5F, 6F, -9.25F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[188].setRotationPoint(-4.5F, 4F, 9.25F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[189].setRotationPoint(2.5F, 4F, 9.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[190].setRotationPoint(2.5F, 3.5F, 5.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[191].setRotationPoint(-4.5F, 3.5F, 5.25F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[192].setRotationPoint(-1.5F, 6F, 9.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[193].setRotationPoint(-1.5F, 3.5F, 5.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 214
		bodyModel[194].setRotationPoint(-1.5F, 6F, 8.25F);

		bodyModel[195].addShapeBox(0F, -1F, -1F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[195].setRotationPoint(6F, 5.25F, -5F);
		bodyModel[195].rotateAngleX = 0.78539816F;

		bodyModel[196].addShapeBox(0F, -1F, -1F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[196].setRotationPoint(6F, 5.25F, 5F);
		bodyModel[196].rotateAngleX = 0.78539816F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // standard mirrors
		bodyModel[197].setRotationPoint(-4.5F, -6.25F, -11.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // standard mirrors
		bodyModel[198].setRotationPoint(-4.5F, -5F, -9.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // standard mirrors
		bodyModel[199].setRotationPoint(-4.5F, -6.25F, 9.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box headlight
		bodyModel[200].setRotationPoint(-1.25F, -10.75F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box headlight
		bodyModel[201].setRotationPoint(-1.25F, -11F, -2.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box headlight
		bodyModel[202].setRotationPoint(-1.25F, -11F, -0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box headlight
		bodyModel[203].setRotationPoint(-1.25F, -11F, 1.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box headlight
		bodyModel[204].setRotationPoint(-1.25F, -10.75F, 6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[205].setRotationPoint(0.5F, -11.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[206].setRotationPoint(0.5F, -12F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[207].setRotationPoint(0.5F, -12F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[208].setRotationPoint(0.5F, -12F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[209].setRotationPoint(0.5F, -12F, -1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull lil steppa
		bodyModel[210].setRotationPoint(-1.5F, 7F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box cull lil steppa
		bodyModel[211].setRotationPoint(-1.5F, 7F, 9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // standard mirrors
		bodyModel[212].setRotationPoint(-4.5F, -5F, 7.5F);

		bodyModel[213].addBox(2F, -1F, 0F, 1, 4, 1, 0F); // Box 152 hirail shit
		bodyModel[213].setRotationPoint(-18.75F, 6.5F, 3F);
		bodyModel[213].rotateAngleZ = 0.4712389F;

		bodyModel[214].addBox(2F, -1F, 0F, 1, 4, 1, 0F); // Box 151 hirail shit
		bodyModel[214].setRotationPoint(-18.75F, 6.5F, -4F);
		bodyModel[214].rotateAngleZ = 0.4712389F;

		bodyModel[215].addShapeBox(0F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 150 hirail shit wheel
		bodyModel[215].setRotationPoint(-18.75F, 6.5F, 6F);
		bodyModel[215].rotateAngleZ = 0.4712389F;

		bodyModel[216].addShapeBox(0F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 149 hirail shit wheel
		bodyModel[216].setRotationPoint(-18.75F, 6.5F, -6F);
		bodyModel[216].rotateAngleZ = 0.4712389F;

		bodyModel[217].addBox(1F, 2F, 0F, 1, 1, 12, 0F); // Box 148 hirail shit axle
		bodyModel[217].setRotationPoint(-18.75F, 6.5F, -6F);
		bodyModel[217].rotateAngleZ = 0.4712389F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 31
		bodyModel[218].setRotationPoint(-18.5F, 3F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[219].setRotationPoint(-17.5F, 3.01F, -4.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[220].setRotationPoint(-17.5F, 3.01F, 3.25F);

		bodyModel[221].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box magnolia knux
		bodyModel[221].setRotationPoint(-21.25F, 3F, -1.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box magnolia knux
		bodyModel[222].setRotationPoint(27F, 3F, -1.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[223].setRotationPoint(25F, 3.01F, -4.25F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[224].setRotationPoint(25F, 3.01F, 3.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 254
		bodyModel[225].setRotationPoint(26F, 3F, -3F);

		bodyModel[226].addBox(-2F, -1F, 0F, 1, 4, 1, 0F); // Box 255
		bodyModel[226].setRotationPoint(26.25F, 6F, 3F);
		bodyModel[226].rotateAngleZ = -0.4712389F;

		bodyModel[227].addBox(-1F, 2F, 0F, 1, 1, 12, 0F); // Box 256
		bodyModel[227].setRotationPoint(26.25F, 6F, -6F);
		bodyModel[227].rotateAngleZ = -0.4712389F;

		bodyModel[228].addBox(-2F, -1F, 0F, 1, 4, 1, 0F); // Box 257
		bodyModel[228].setRotationPoint(26.25F, 6F, -4F);
		bodyModel[228].rotateAngleZ = -0.4712389F;

		bodyModel[229].addShapeBox(-2F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 258
		bodyModel[229].setRotationPoint(26.25F, 6F, -6F);
		bodyModel[229].rotateAngleZ = -0.4712389F;

		bodyModel[230].addShapeBox(-2F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 259
		bodyModel[230].setRotationPoint(26.25F, 6F, 6F);
		bodyModel[230].rotateAngleZ = -0.4712389F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[231].setRotationPoint(-7F, -17F, 8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 262
		bodyModel[232].setRotationPoint(-3.25F, -18F, 10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 263
		bodyModel[233].setRotationPoint(-3.25F, -18F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, -1F, 13, 1, 1, 0F,0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203 lightbar frame
		bodyModel[234].setRotationPoint(1.5F, -12F, -6.5F);
		bodyModel[234].rotateAngleY = 1.57079633F;

		bodyModel[235].addShapeBox(0F, 0F, -1F, 13, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 204 lightbar frame
		bodyModel[235].setRotationPoint(2.5F, -12F, -6.5F);
		bodyModel[235].rotateAngleY = 1.57079633F;

		bodyModel[236].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 206 lightbar glow 1f
		bodyModel[236].setRotationPoint(1.5F, -12.5F, -6F);
		bodyModel[236].rotateAngleY = 1.57079633F;

		bodyModel[237].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 207 lightbar support
		bodyModel[237].setRotationPoint(1.5F, -12.5F, -2F);
		bodyModel[237].rotateAngleY = 1.57079633F;

		bodyModel[238].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 208 lightbar glow 1r
		bodyModel[238].setRotationPoint(2.5F, -12.5F, -6F);
		bodyModel[238].rotateAngleY = 1.57079633F;

		bodyModel[239].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 209 lightbar glow 3f
		bodyModel[239].setRotationPoint(1.5F, -12.5F, 2F);
		bodyModel[239].rotateAngleY = 1.57079633F;

		bodyModel[240].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 210 lightbar glow 3r
		bodyModel[240].setRotationPoint(2.5F, -12.5F, 2F);
		bodyModel[240].rotateAngleY = 1.57079633F;

		bodyModel[241].addShapeBox(0F, 0F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull lightbar support
		bodyModel[241].setRotationPoint(2.5F, -11F, -5.5F);
		bodyModel[241].rotateAngleY = 1.57079633F;

		bodyModel[242].addShapeBox(0F, 0F, -0.25F, 2, 0, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box tractorpope
		bodyModel[242].setRotationPoint(5.75F, -12.75F, 7.37F);
		bodyModel[242].rotateAngleX = 0.78539816F;

		bodyModel[243].addShapeBox(0F, -1F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box tractorpope
		bodyModel[243].setRotationPoint(6.75F, -12.25F, 7.12F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 275
		bodyModel[244].setRotationPoint(-6.49F, -3.5F, -7.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 277
		bodyModel[245].setRotationPoint(-6.49F, 0.25F, -7.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 3, 15, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 223
		bodyModel[246].setRotationPoint(-0.5F, -1.5F, -7.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 4, 15, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 224
		bodyModel[247].setRotationPoint(4F, -5.5F, -7.5F);

		bodyModel[248].addShapeBox(1F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[248].setRotationPoint(-2.49F, -4.75F, -4.5F);
		bodyModel[248].rotateAngleZ = 0.29670597F;

		bodyModel[249].addBox(-4F, -0.5F, -0.5F, 5, 1, 1, 0F); // Box 227
		bodyModel[249].setRotationPoint(-2.5F, -4.75F, -4.5F);
		bodyModel[249].rotateAngleZ = 0.29670597F;

		bodyModel[250].addShapeBox(0.5F, -0.25F, -2F, 0, 1, 4, 0F,0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 318
		bodyModel[250].setRotationPoint(-2.49F, -4.75F, -4.5F);
		bodyModel[250].rotateAngleX = 0.20943951F;
		bodyModel[250].rotateAngleZ = 0.29670597F;

		bodyModel[251].addShapeBox(-3F, -1.25F, -2.5F, 2, 3, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[251].setRotationPoint(-2.5F, -4.75F, -4.5F);
		bodyModel[251].rotateAngleZ = 0.29670597F;

		bodyModel[252].addShapeBox(-3F, -1.25F, -2.5F, 2, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[252].setRotationPoint(-2.5F, -4.75F, -0.5F);
		bodyModel[252].rotateAngleZ = 0.29670597F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 285
		bodyModel[253].setRotationPoint(-5.5F, -3.5F, -7.75F);

		bodyModel[254].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box floor shifter upfit
		bodyModel[254].setRotationPoint(-2.25F, 0F, -0.75F);
		bodyModel[254].rotateAngleX = 0.15707963F;
		bodyModel[254].rotateAngleZ = -0.2443461F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box floor shifter upfit
		bodyModel[255].setRotationPoint(-3.5F, 0.5F, -1.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 0, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[256].setRotationPoint(-15.25F, -3F, -6.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, -1.2F, 0.125F, 0.5F, -1F, 0F, -3F, 0F, -1F, -3F, 0.25F, -1F, -3F, -1.15F, 0.125F, -3F, -1F); // Box 265
		bodyModel[257].setRotationPoint(-15.5F, 1F, -7.5F);

		bodyModel[258].addShapeBox(1F, 0F, 0F, 8, 2, 2, 0F,-1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.35F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.55F, 0.25F, 0F, 1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box cull inner fender
		bodyModel[258].setRotationPoint(-15.5F, 0.75F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 267
		bodyModel[259].setRotationPoint(-15.5F, 2F, 7.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.125F, 0.5F, -1F, 0F, 0.5F, -1.2F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0F, 0.125F, -3F, -1F, -1F, -3F, -1.15F, -1F, -3F, 0.25F, 0F, -3F, 0F); // Box 268
		bodyModel[260].setRotationPoint(-15.5F, 1F, 5.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, -1F, 0F, -1F, -1F); // Box 269
		bodyModel[261].setRotationPoint(-15.8F, -1F, -1F);

		bodyModel[262].addShapeBox(0F, -1F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 270
		bodyModel[262].setRotationPoint(5.75F, -13.5F, 8.12F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // batterybox w/ step
		bodyModel[263].setRotationPoint(-1.5F, 6F, 7.25F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // batterybox w/ step
		bodyModel[264].setRotationPoint(-4.5F, 3.5F, 5.25F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // batterybox w/ step
		bodyModel[265].setRotationPoint(-4.5F, 4F, 8.25F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // batterybox w/ step
		bodyModel[266].setRotationPoint(-1.5F, 4F, 7.25F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box taillight
		bodyModel[267].setRotationPoint(25.02F, 4F, 3.79F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box turnlight R
		bodyModel[268].setRotationPoint(25.02F, 3.5F, 3.79F);

		bodyModel[269].addShapeBox(1F, 0F, 0F, 8, 2, 2, 0F,-1F, 0.25F, 0.25F, 0.35F, 0.25F, 0.25F, 0.1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0.25F, 1F, 0.25F, 0.25F, 0.55F, 0.25F, 0F, 0F, 0.25F, 0F); // Box cull inner fender
		bodyModel[269].setRotationPoint(-15.5F, 0.75F, 8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 272
		bodyModel[270].setRotationPoint(-12.5F, -6F, -10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[271].setRotationPoint(-12.5F, -4.5F, -8.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 274
		bodyModel[272].setRotationPoint(-12.5F, -6F, 8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275
		bodyModel[273].setRotationPoint(-12.5F, -4.5F, 6.5F);

		bodyModel[274].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Wheel 2
		bodyModel[274].setRotationPoint(-10F, 6F, 9F);

		bodyModel[275].addShapeBox(-1.5F, -1.5F, 0.75F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box Wheel 2
		bodyModel[275].setRotationPoint(-10F, 6F, 9F);

		bodyModel[276].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[276].setRotationPoint(0.5F, -12F, 3.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 274
		bodyModel[277].setRotationPoint(2.5F, -11F, 3.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 411
		bodyModel[278].setRotationPoint(0.5F, -12F, -4.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 413
		bodyModel[279].setRotationPoint(2.5F, -11F, -4.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 280
		bodyModel[280].setRotationPoint(-19F, -6F, -8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 281
		bodyModel[281].setRotationPoint(-19F, -6F, 8F);

		bodyModel[282].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 251 trailer cable holder
		bodyModel[282].setRotationPoint(6F, -5F, -4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 16, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, 0F, -1.5F, -8F, 0F, -1.5F, -8F, -3F, 0F, -8F, -3F); // Box 252 cull trailer cables
		bodyModel[283].setRotationPoint(6.5F, -5F, -5F);

		bodyModel[284].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 417
		bodyModel[284].setRotationPoint(0F, -11.75F, 5.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 418
		bodyModel[285].setRotationPoint(0.5F, -12.25F, 4.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 419
		bodyModel[286].setRotationPoint(-1F, -12F, 3.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 420
		bodyModel[287].setRotationPoint(1F, -11.25F, 4.5F);

		bodyModel[288].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box front lisenceplate
		bodyModel[288].setRotationPoint(-16.26F, 5.75F, 2F);
		bodyModel[288].rotateAngleY = -3.14159265F;

		bodyModel[289].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box rear lisenceplate
		bodyModel[289].setRotationPoint(24.75F, 8F, 3F);

		bodyModel[290].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box front lisenceplate
		bodyModel[290].setRotationPoint(-15.76F, 2.75F, -3.5F);
		bodyModel[290].rotateAngleY = -3.14159265F;

		bodyModel[291].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box rear lisenceplate
		bodyModel[291].setRotationPoint(23.76F, 5.75F, 10F);
		bodyModel[291].rotateAngleY = -3.14159265F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, -1F, 2.25F, 0F, -1F, 2.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 211 cull quarter pounder (fender)
		bodyModel[292].setRotationPoint(14.5F, 4.25F, -10F);

		bodyModel[293].addShapeBox(-1F, -1F, 0F, 1, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 213 quarter fender holder (dont texture mid section)
		bodyModel[293].setRotationPoint(14.5F, 4.25F, -9F);
		bodyModel[293].rotateAngleZ = -0.6981317F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, -0.25F, -1F, 2.25F, -0.25F, -1F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 306 cull quarter pounder (fender)
		bodyModel[294].setRotationPoint(14.5F, 4.25F, 5F);
	}
}