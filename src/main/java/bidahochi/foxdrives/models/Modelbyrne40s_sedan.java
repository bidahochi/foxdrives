//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.01.2025 - 20:10:34
// Last changed on: 31.01.2025 - 20:10:34

package bidahochi.foxdrives.models; //Path where the model is located


import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modelbyrne40s_sedan extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Modelbyrne40s_sedan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[323];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 234, 66, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[1] = new ModelRendererTurbo(this, 234, 61, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[2] = new ModelRendererTurbo(this, 234, 61, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[3] = new ModelRendererTurbo(this, 232, 116, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[4] = new ModelRendererTurbo(this, 232, 111, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[5] = new ModelRendererTurbo(this, 232, 111, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[6] = new ModelRendererTurbo(this, 163, 111, textureX, textureY); // Box 23 axle
		bodyModel[7] = new ModelRendererTurbo(this, 234, 66, textureX, textureY, "wheel"); // Box 136 Wheel3
		bodyModel[8] = new ModelRendererTurbo(this, 234, 61, textureX, textureY, "wheel"); // Box 9 Wheel3
		bodyModel[9] = new ModelRendererTurbo(this, 234, 61, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[10] = new ModelRendererTurbo(this, 232, 116, textureX, textureY, "wheel"); // Box 136 Wheel4
		bodyModel[11] = new ModelRendererTurbo(this, 232, 111, textureX, textureY, "wheel"); // Box 9 Wheel4
		bodyModel[12] = new ModelRendererTurbo(this, 232, 111, textureX, textureY, "wheel"); // Box 12 Wheel4
		bodyModel[13] = new ModelRendererTurbo(this, 163, 111, textureX, textureY); // Box 18 axle
		bodyModel[14] = new ModelRendererTurbo(this, 204, 81, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 219, 81, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 204, 93, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 204, 77, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 219, 85, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 204, 97, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 217, 77, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 204, 85, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 219, 89, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 204, 89, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 211, 113, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 197, 109, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 182, 110, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 210, 104, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 82, 117, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 94, 120, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 117, 109, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 103, 117, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 103, 123, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 144, 123, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 10, 2, textureX, textureY); // Box 50
		bodyModel[36] = new ModelRendererTurbo(this, 144, 120, textureX, textureY); // Box 51
		bodyModel[37] = new ModelRendererTurbo(this, 163, 98, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 150, 100, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 108, 108, textureX, textureY); // Box 56
		bodyModel[40] = new ModelRendererTurbo(this, 91, 113, textureX, textureY); // Box 57
		bodyModel[41] = new ModelRendererTurbo(this, 150, 104, textureX, textureY); // Box 58
		bodyModel[42] = new ModelRendererTurbo(this, 164, 91, textureX, textureY); // Box 59
		bodyModel[43] = new ModelRendererTurbo(this, 10, 7, textureX, textureY, "lamp"); // Box headlight
		bodyModel[44] = new ModelRendererTurbo(this, 124, 107, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 96, 89, textureX, textureY); // Box 66
		bodyModel[46] = new ModelRendererTurbo(this, 91, 89, textureX, textureY); // Box 67
		bodyModel[47] = new ModelRendererTurbo(this, 86, 89, textureX, textureY); // Box 68
		bodyModel[48] = new ModelRendererTurbo(this, 134, 108, textureX, textureY); // Box 69
		bodyModel[49] = new ModelRendererTurbo(this, 101, 107, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 125
		bodyModel[51] = new ModelRendererTurbo(this, 28, 107, textureX, textureY); // Box 79
		bodyModel[52] = new ModelRendererTurbo(this, 64, 89, textureX, textureY); // Box 80
		bodyModel[53] = new ModelRendererTurbo(this, 69, 89, textureX, textureY); // Box 81
		bodyModel[54] = new ModelRendererTurbo(this, 74, 89, textureX, textureY); // Box 82
		bodyModel[55] = new ModelRendererTurbo(this, 38, 108, textureX, textureY); // Box 83
		bodyModel[56] = new ModelRendererTurbo(this, 21, 109, textureX, textureY); // Box 86
		bodyModel[57] = new ModelRendererTurbo(this, 12, 108, textureX, textureY); // Box 87
		bodyModel[58] = new ModelRendererTurbo(this, 30, 117, textureX, textureY); // Box 88
		bodyModel[59] = new ModelRendererTurbo(this, 30, 123, textureX, textureY); // Box 89
		bodyModel[60] = new ModelRendererTurbo(this, 18, 113, textureX, textureY); // Box 90
		bodyModel[61] = new ModelRendererTurbo(this, 33, 20, textureX, textureY); // Box 98
		bodyModel[62] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 101
		bodyModel[63] = new ModelRendererTurbo(this, 28, 20, textureX, textureY); // Box 103
		bodyModel[64] = new ModelRendererTurbo(this, 5, 107, textureX, textureY); // Box 105
		bodyModel[65] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[66] = new ModelRendererTurbo(this, 28, 17, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[67] = new ModelRendererTurbo(this, 42, 23, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[68] = new ModelRendererTurbo(this, 78, 83, textureX, textureY); // Box 110
		bodyModel[69] = new ModelRendererTurbo(this, 26, 25, textureX, textureY); // Box 112
		bodyModel[70] = new ModelRendererTurbo(this, 2, 36, textureX, textureY); // Box 113
		bodyModel[71] = new ModelRendererTurbo(this, 17, 36, textureX, textureY); // Box 117
		bodyModel[72] = new ModelRendererTurbo(this, 16, 39, textureX, textureY); // Box 118
		bodyModel[73] = new ModelRendererTurbo(this, 10, 41, textureX, textureY); // Box 122
		bodyModel[74] = new ModelRendererTurbo(this, 50, 39, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[75] = new ModelRendererTurbo(this, 50, 38, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[76] = new ModelRendererTurbo(this, 50, 41, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[77] = new ModelRendererTurbo(this, 78, 78, textureX, textureY); // Box 127
		bodyModel[78] = new ModelRendererTurbo(this, 31, 5, textureX, textureY); // Box 128
		bodyModel[79] = new ModelRendererTurbo(this, 31, 2, textureX, textureY); // Box 129
		bodyModel[80] = new ModelRendererTurbo(this, 21, 90, textureX, textureY); // Box 130
		bodyModel[81] = new ModelRendererTurbo(this, 33, 95, textureX, textureY); // Box 132
		bodyModel[82] = new ModelRendererTurbo(this, 87, 74, textureX, textureY); // Box 135
		bodyModel[83] = new ModelRendererTurbo(this, 14, 102, textureX, textureY); // Box 136
		bodyModel[84] = new ModelRendererTurbo(this, 14, 105, textureX, textureY); // Box 137
		bodyModel[85] = new ModelRendererTurbo(this, 2, 40, textureX, textureY); // Box 138
		bodyModel[86] = new ModelRendererTurbo(this, 17, 40, textureX, textureY); // Box 139
		bodyModel[87] = new ModelRendererTurbo(this, 37, 102, textureX, textureY); // Box 140
		bodyModel[88] = new ModelRendererTurbo(this, 10, 95, textureX, textureY); // Box 141
		bodyModel[89] = new ModelRendererTurbo(this, 33, 83, textureX, textureY); // Box 142
		bodyModel[90] = new ModelRendererTurbo(this, 15, 80, textureX, textureY); // Box 143
		bodyModel[91] = new ModelRendererTurbo(this, 10, 83, textureX, textureY); // Box 145
		bodyModel[92] = new ModelRendererTurbo(this, 15, 77, textureX, textureY); // Box 146
		bodyModel[93] = new ModelRendererTurbo(this, 71, 120, textureX, textureY); // Box 147
		bodyModel[94] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Box 148
		bodyModel[95] = new ModelRendererTurbo(this, 17, 2, textureX, textureY); // Box 149
		bodyModel[96] = new ModelRendererTurbo(this, 71, 123, textureX, textureY); // Box 150
		bodyModel[97] = new ModelRendererTurbo(this, 163, 103, textureX, textureY); // Box 151
		bodyModel[98] = new ModelRendererTurbo(this, 150, 108, textureX, textureY); // Box 152
		bodyModel[99] = new ModelRendererTurbo(this, 163, 108, textureX, textureY); // Box 153
		bodyModel[100] = new ModelRendererTurbo(this, 151, 91, textureX, textureY); // Box 154
		bodyModel[101] = new ModelRendererTurbo(this, 37, 80, textureX, textureY); // Box 155
		bodyModel[102] = new ModelRendererTurbo(this, 86, 2, textureX, textureY, "cull"); // Box cull windoe
		bodyModel[103] = new ModelRendererTurbo(this, 118, 1, textureX, textureY, "cull"); // Box 164 cull windoe
		bodyModel[104] = new ModelRendererTurbo(this, 133, 1, textureX, textureY, "cull"); // Box 164 cull windoe
		bodyModel[105] = new ModelRendererTurbo(this, 83, 33, textureX, textureY); // Box 165
		bodyModel[106] = new ModelRendererTurbo(this, 128, 22, textureX, textureY); // Box 167
		bodyModel[107] = new ModelRendererTurbo(this, 139, 13, textureX, textureY); // Box 168
		bodyModel[108] = new ModelRendererTurbo(this, 111, 13, textureX, textureY); // Box 169
		bodyModel[109] = new ModelRendererTurbo(this, 75, 92, textureX, textureY); // Box 171
		bodyModel[110] = new ModelRendererTurbo(this, 75, 100, textureX, textureY); // Box 172
		bodyModel[111] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 173
		bodyModel[112] = new ModelRendererTurbo(this, 206, 66, textureX, textureY); // Box 176
		bodyModel[113] = new ModelRendererTurbo(this, 192, 64, textureX, textureY); // Box 177
		bodyModel[114] = new ModelRendererTurbo(this, 201, 66, textureX, textureY); // Box 178
		bodyModel[115] = new ModelRendererTurbo(this, 207, 66, textureX, textureY); // Box 179
		bodyModel[116] = new ModelRendererTurbo(this, 173, 65, textureX, textureY); // Box 180
		bodyModel[117] = new ModelRendererTurbo(this, 178, 65, textureX, textureY); // Box 181
		bodyModel[118] = new ModelRendererTurbo(this, 177, 64, textureX, textureY); // Box 182
		bodyModel[119] = new ModelRendererTurbo(this, 191, 66, textureX, textureY); // Box 183
		bodyModel[120] = new ModelRendererTurbo(this, 186, 66, textureX, textureY); // Box 184
		bodyModel[121] = new ModelRendererTurbo(this, 90, 97, textureX, textureY); // Box 186
		bodyModel[122] = new ModelRendererTurbo(this, 64, 97, textureX, textureY); // Box 188
		bodyModel[123] = new ModelRendererTurbo(this, 97, 94, textureX, textureY); // Box 190
		bodyModel[124] = new ModelRendererTurbo(this, 90, 103, textureX, textureY); // Box 191
		bodyModel[125] = new ModelRendererTurbo(this, 57, 94, textureX, textureY); // Box 192
		bodyModel[126] = new ModelRendererTurbo(this, 64, 103, textureX, textureY); // Box 193
		bodyModel[127] = new ModelRendererTurbo(this, 164, 80, textureX, textureY); // Box 194
		bodyModel[128] = new ModelRendererTurbo(this, 169, 80, textureX, textureY); // Box 195
		bodyModel[129] = new ModelRendererTurbo(this, 174, 80, textureX, textureY); // Box 196
		bodyModel[130] = new ModelRendererTurbo(this, 179, 80, textureX, textureY); // Box 197
		bodyModel[131] = new ModelRendererTurbo(this, 179, 86, textureX, textureY); // Box 198
		bodyModel[132] = new ModelRendererTurbo(this, 174, 86, textureX, textureY); // Box 199
		bodyModel[133] = new ModelRendererTurbo(this, 169, 86, textureX, textureY); // Box 200
		bodyModel[134] = new ModelRendererTurbo(this, 164, 86, textureX, textureY); // Box 201
		bodyModel[135] = new ModelRendererTurbo(this, 164, 83, textureX, textureY); // Box 202
		bodyModel[136] = new ModelRendererTurbo(this, 169, 83, textureX, textureY); // Box 203
		bodyModel[137] = new ModelRendererTurbo(this, 174, 83, textureX, textureY); // Box 204
		bodyModel[138] = new ModelRendererTurbo(this, 179, 83, textureX, textureY); // Box 205
		bodyModel[139] = new ModelRendererTurbo(this, 108, 89, textureX, textureY); // Box 210
		bodyModel[140] = new ModelRendererTurbo(this, 103, 97, textureX, textureY); // Box 212
		bodyModel[141] = new ModelRendererTurbo(this, 103, 82, textureX, textureY); // Box 213
		bodyModel[142] = new ModelRendererTurbo(this, 126, 82, textureX, textureY); // Box 214
		bodyModel[143] = new ModelRendererTurbo(this, 127, 97, textureX, textureY); // Box 215
		bodyModel[144] = new ModelRendererTurbo(this, 88, 33, textureX, textureY); // Box 218
		bodyModel[145] = new ModelRendererTurbo(this, 165, 0, textureX, textureY); // Box 219
		bodyModel[146] = new ModelRendererTurbo(this, 148, 0, textureX, textureY); // Box 221
		bodyModel[147] = new ModelRendererTurbo(this, 131, 28, textureX, textureY); // Box 223
		bodyModel[148] = new ModelRendererTurbo(this, 143, 23, textureX, textureY); // Box 225
		bodyModel[149] = new ModelRendererTurbo(this, 84, 17, textureX, textureY); // Box 227
		bodyModel[150] = new ModelRendererTurbo(this, 113, 23, textureX, textureY); // Box 229
		bodyModel[151] = new ModelRendererTurbo(this, 85, 14, textureX, textureY); // Box 231
		bodyModel[152] = new ModelRendererTurbo(this, 62, 12, textureX, textureY); // Box 172
		bodyModel[153] = new ModelRendererTurbo(this, 62, 18, textureX, textureY, "cull"); // Box 212
		bodyModel[154] = new ModelRendererTurbo(this, 87, 17, textureX, textureY); // Box 177
		bodyModel[155] = new ModelRendererTurbo(this, 102, 17, textureX, textureY); // Box 178
		bodyModel[156] = new ModelRendererTurbo(this, 111, 25, textureX, textureY); // Box 179
		bodyModel[157] = new ModelRendererTurbo(this, 58, 37, textureX, textureY, "cull"); // Box 1948 to 1950 trim
		bodyModel[158] = new ModelRendererTurbo(this, 42, 41, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[159] = new ModelRendererTurbo(this, 58, 32, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[160] = new ModelRendererTurbo(this, 65, 32, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[161] = new ModelRendererTurbo(this, 48, 34, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[162] = new ModelRendererTurbo(this, 50, 34, textureX, textureY); // Box 1948 to 1950 trim
		bodyModel[163] = new ModelRendererTurbo(this, 91, 45, textureX, textureY); // Box 192
		bodyModel[164] = new ModelRendererTurbo(this, 102, 47, textureX, textureY); // Box 193
		bodyModel[165] = new ModelRendererTurbo(this, 109, 45, textureX, textureY); // Box 194
		bodyModel[166] = new ModelRendererTurbo(this, 91, 27, textureX, textureY); // Box 192
		bodyModel[167] = new ModelRendererTurbo(this, 93, 33, textureX, textureY); // Box 194
		bodyModel[168] = new ModelRendererTurbo(this, 84, 23, textureX, textureY); // Box 195
		bodyModel[169] = new ModelRendererTurbo(this, 108, 33, textureX, textureY); // Box 201
		bodyModel[170] = new ModelRendererTurbo(this, 96, 11, textureX, textureY); // Box 202
		bodyModel[171] = new ModelRendererTurbo(this, 98, 33, textureX, textureY); // Box 203
		bodyModel[172] = new ModelRendererTurbo(this, 4, 63, textureX, textureY); // Box 104
		bodyModel[173] = new ModelRendererTurbo(this, 55, 15, textureX, textureY); // Box hood mirrors
		bodyModel[174] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 213
		bodyModel[175] = new ModelRendererTurbo(this, 151, 85, textureX, textureY); // Box 214
		bodyModel[176] = new ModelRendererTurbo(this, 39, 54, textureX, textureY); // Box 232
		bodyModel[177] = new ModelRendererTurbo(this, 32, 56, textureX, textureY, "prime1"); // Box PRIME-1
		bodyModel[178] = new ModelRendererTurbo(this, 32, 56, textureX, textureY, "prime2"); // Box PRIME-2
		bodyModel[179] = new ModelRendererTurbo(this, 32, 56, textureX, textureY, "prime3"); // Box PRIME-3
		bodyModel[180] = new ModelRendererTurbo(this, 32, 56, textureX, textureY, "prime4"); // Box PRIME-4
		bodyModel[181] = new ModelRendererTurbo(this, 22, 48, textureX, textureY, "ditch"); // Box 171 foglight
		bodyModel[182] = new ModelRendererTurbo(this, 15, 48, textureX, textureY, "ditch"); // Box 236 foglight alternative
		bodyModel[183] = new ModelRendererTurbo(this, 8, 48, textureX, textureY, "ditch"); // Box 211 foglight
		bodyModel[184] = new ModelRendererTurbo(this, 1, 48, textureX, textureY, "ditch"); // Box 212 foglight alternative
		bodyModel[185] = new ModelRendererTurbo(this, 42, 67, textureX, textureY, "ditch"); // Box 216 foglight
		bodyModel[186] = new ModelRendererTurbo(this, 42, 62, textureX, textureY); // Box 217
		bodyModel[187] = new ModelRendererTurbo(this, 35, 62, textureX, textureY, "ditch"); // Box 216 foglight
		bodyModel[188] = new ModelRendererTurbo(this, 35, 67, textureX, textureY); // Box 219
		bodyModel[189] = new ModelRendererTurbo(this, 35, 58, textureX, textureY, "cull"); // Box cull roofbars
		bodyModel[190] = new ModelRendererTurbo(this, 2, 60, textureX, textureY, "cull"); // Box cull roofbar gates
		bodyModel[191] = new ModelRendererTurbo(this, 51, 25, textureX, textureY); // Box 100 hitch ball
		bodyModel[192] = new ModelRendererTurbo(this, 19, 11, textureX, textureY); // Box 101 hitch
		bodyModel[193] = new ModelRendererTurbo(this, 30, 11, textureX, textureY); // Box 163
		bodyModel[194] = new ModelRendererTurbo(this, 59, 1, textureX, textureY, "cullwheelfront"); // Box 220 wheel 1
		bodyModel[195] = new ModelRendererTurbo(this, 55, 5, textureX, textureY, "wheel front"); // Box 221 wheel 1
		bodyModel[196] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel front"); // Box 222
		bodyModel[197] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel front"); // Box 223
		bodyModel[198] = new ModelRendererTurbo(this, 243, 59, textureX, textureY, "wheel front"); // Box 224
		bodyModel[199] = new ModelRendererTurbo(this, 52, 1, textureX, textureY, "cullwheelfront"); // Box 225
		bodyModel[200] = new ModelRendererTurbo(this, 50, 5, textureX, textureY, "wheel front"); // Box 226
		bodyModel[201] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel front"); // Box 227
		bodyModel[202] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel front"); // Box 228
		bodyModel[203] = new ModelRendererTurbo(this, 243, 59, textureX, textureY, "wheel front"); // Box 229
		bodyModel[204] = new ModelRendererTurbo(this, 84, 20, textureX, textureY); // Box 230
		bodyModel[205] = new ModelRendererTurbo(this, 85, 11, textureX, textureY); // Box 231
		bodyModel[206] = new ModelRendererTurbo(this, 87, 25, textureX, textureY); // Box 232
		bodyModel[207] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel"); // Box 233
		bodyModel[208] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel"); // Box 234
		bodyModel[209] = new ModelRendererTurbo(this, 243, 59, textureX, textureY, "wheel"); // Box 235
		bodyModel[210] = new ModelRendererTurbo(this, 45, 1, textureX, textureY, "cullwheel"); // Box 236
		bodyModel[211] = new ModelRendererTurbo(this, 45, 5, textureX, textureY, "wheel"); // Box 237
		bodyModel[212] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel"); // Box 238
		bodyModel[213] = new ModelRendererTurbo(this, 238, 59, textureX, textureY, "wheel"); // Box 239
		bodyModel[214] = new ModelRendererTurbo(this, 243, 59, textureX, textureY, "wheel"); // Box 240
		bodyModel[215] = new ModelRendererTurbo(this, 40, 5, textureX, textureY, "wheel"); // Box 241
		bodyModel[216] = new ModelRendererTurbo(this, 38, 1, textureX, textureY, "cullwheel"); // Box 242
		bodyModel[217] = new ModelRendererTurbo(this, 124, 110, textureX, textureY); // Box 244
		bodyModel[218] = new ModelRendererTurbo(this, 129, 109, textureX, textureY); // Box 245
		bodyModel[219] = new ModelRendererTurbo(this, 28, 110, textureX, textureY); // Box 247
		bodyModel[220] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 248
		bodyModel[221] = new ModelRendererTurbo(this, 87, 81, textureX, textureY); // Box 249
		bodyModel[222] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 250
		bodyModel[223] = new ModelRendererTurbo(this, 65, 74, textureX, textureY); // Box 251
		bodyModel[224] = new ModelRendererTurbo(this, 1, 18, textureX, textureY); // Box 252 1951 to 1953 trim
		bodyModel[225] = new ModelRendererTurbo(this, 45, 11, textureX, textureY, "brakeLight"); // Box taillight
		bodyModel[226] = new ModelRendererTurbo(this, 55, 12, textureX, textureY, "rightTurnLight"); // Box turnlight R
		bodyModel[227] = new ModelRendererTurbo(this, 40, 11, textureX, textureY, "brakeLight"); // Box taillight
		bodyModel[228] = new ModelRendererTurbo(this, 50, 12, textureX, textureY, "leftTurnLight"); // Box turnlight L
		bodyModel[229] = new ModelRendererTurbo(this, 48, 48, textureX, textureY); // Box 260
		bodyModel[230] = new ModelRendererTurbo(this, 48, 50, textureX, textureY); // Box 261
		bodyModel[231] = new ModelRendererTurbo(this, 27, 33, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[232] = new ModelRendererTurbo(this, 22, 33, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[233] = new ModelRendererTurbo(this, 12, 28, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[234] = new ModelRendererTurbo(this, 12, 23, textureX, textureY, "cull"); // Box 1951 to 1953 trim cull
		bodyModel[235] = new ModelRendererTurbo(this, 1, 23, textureX, textureY, "cull"); // Box 1951 to 1953 trim cull
		bodyModel[236] = new ModelRendererTurbo(this, 12, 34, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[237] = new ModelRendererTurbo(this, 7, 34, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[238] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[239] = new ModelRendererTurbo(this, 19, 28, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[240] = new ModelRendererTurbo(this, 8, 28, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[241] = new ModelRendererTurbo(this, 9, 14, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[242] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[243] = new ModelRendererTurbo(this, 18, 20, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[244] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[245] = new ModelRendererTurbo(this, 9, 20, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[246] = new ModelRendererTurbo(this, 18, 17, textureX, textureY); // Box 1951 to 1953 trim
		bodyModel[247] = new ModelRendererTurbo(this, 50, 9, textureX, textureY); // Box 284
		bodyModel[248] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 285
		bodyModel[249] = new ModelRendererTurbo(this, 31, 41, textureX, textureY); // Box 287
		bodyModel[250] = new ModelRendererTurbo(this, 9, 117, textureX, textureY); // Box 288
		bodyModel[251] = new ModelRendererTurbo(this, 21, 120, textureX, textureY); // Box 289
		bodyModel[252] = new ModelRendererTurbo(this, 45, 18, textureX, textureY); // Box 290
		bodyModel[253] = new ModelRendererTurbo(this, 40, 18, textureX, textureY, "leftTurnLight"); // Box 291 turnlight L
		bodyModel[254] = new ModelRendererTurbo(this, 45, 15, textureX, textureY); // Box 294
		bodyModel[255] = new ModelRendererTurbo(this, 40, 15, textureX, textureY, "rightTurnLight"); // Box 295 turnlight R
		bodyModel[256] = new ModelRendererTurbo(this, 190, 91, textureX, textureY); // Box 55
		bodyModel[257] = new ModelRendererTurbo(this, 204, 101, textureX, textureY); // Box driveshaf
		bodyModel[258] = new ModelRendererTurbo(this, 179, 92, textureX, textureY); // Box tork konvartah
		bodyModel[259] = new ModelRendererTurbo(this, 62, 5, textureX, textureY, "cull"); // Box 299
		bodyModel[260] = new ModelRendererTurbo(this, 71, 18, textureX, textureY); // Box 300
		bodyModel[261] = new ModelRendererTurbo(this, 98, 27, textureX, textureY); // Box 301
		bodyModel[262] = new ModelRendererTurbo(this, 103, 33, textureX, textureY); // Box 302
		bodyModel[263] = new ModelRendererTurbo(this, 81, 23, textureX, textureY); // Box 303
		bodyModel[264] = new ModelRendererTurbo(this, 26, 7, textureX, textureY, "leftTurnLight"); // Box turnlight L
		bodyModel[265] = new ModelRendererTurbo(this, 19, 7, textureX, textureY, "rightTurnLight"); // Box 306
		bodyModel[266] = new ModelRendererTurbo(this, 181, 98, textureX, textureY); // Box spooky engine
		bodyModel[267] = new ModelRendererTurbo(this, 89, 58, textureX, textureY); // Box 129
		bodyModel[268] = new ModelRendererTurbo(this, 191, 1, textureX, textureY); // Box 206
		bodyModel[269] = new ModelRendererTurbo(this, 166, 3, textureX, textureY); // Box 207
		bodyModel[270] = new ModelRendererTurbo(this, 215, 40, textureX, textureY); // Box 223
		bodyModel[271] = new ModelRendererTurbo(this, 196, 43, textureX, textureY); // Box 224
		bodyModel[272] = new ModelRendererTurbo(this, 215, 19, textureX, textureY); // Box 313
		bodyModel[273] = new ModelRendererTurbo(this, 196, 22, textureX, textureY); // Box 314
		bodyModel[274] = new ModelRendererTurbo(this, 158, 43, textureX, textureY); // Box 315
		bodyModel[275] = new ModelRendererTurbo(this, 181, 21, textureX, textureY); // Box 226 steeringwhool
		bodyModel[276] = new ModelRendererTurbo(this, 192, 29, textureX, textureY); // Box 227
		bodyModel[277] = new ModelRendererTurbo(this, 196, 28, textureX, textureY); // Box 318
		bodyModel[278] = new ModelRendererTurbo(this, 180, 46, textureX, textureY); // Box 50
		bodyModel[279] = new ModelRendererTurbo(this, 33, 48, textureX, textureY); // Box 320
		bodyModel[280] = new ModelRendererTurbo(this, 33, 50, textureX, textureY); // Box 321
		bodyModel[281] = new ModelRendererTurbo(this, 243, 66, textureX, textureY, "cull"); // Box cull nobodysgonnaseethis
		bodyModel[282] = new ModelRendererTurbo(this, 243, 72, textureX, textureY, "cull"); // Box cull nobodysgonnaseethis
		bodyModel[283] = new ModelRendererTurbo(this, 110, 59, textureX, textureY); // Box 249
		bodyModel[284] = new ModelRendererTurbo(this, 110, 40, textureX, textureY); // Box 328
		bodyModel[285] = new ModelRendererTurbo(this, 1, 7, textureX, textureY, "lamp"); // Box 290 headlight
		bodyModel[286] = new ModelRendererTurbo(this, 23, 55, textureX, textureY, "cull"); // Box cull lids
		bodyModel[287] = new ModelRendererTurbo(this, 23, 55, textureX, textureY, "cull"); // Box cull lids
		bodyModel[288] = new ModelRendererTurbo(this, 164, 21, textureX, textureY); // Box 292
		bodyModel[289] = new ModelRendererTurbo(this, 177, 39, textureX, textureY); // Box 293
		bodyModel[290] = new ModelRendererTurbo(this, 12, 54, textureX, textureY); // Box 294
		bodyModel[291] = new ModelRendererTurbo(this, 1, 53, textureX, textureY); // Box glow taxi bit
		bodyModel[292] = new ModelRendererTurbo(this, 45, 8, textureX, textureY, "cull"); // Box cull curb feeler
		bodyModel[293] = new ModelRendererTurbo(this, 40, 8, textureX, textureY, "cull"); // Box cull curb feeler
		bodyModel[294] = new ModelRendererTurbo(this, 29, 49, textureX, textureY); // Box 298
		bodyModel[295] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box deluxe trim
		bodyModel[296] = new ModelRendererTurbo(this, 138, 34, textureX, textureY); // Box deluxe trim
		bodyModel[297] = new ModelRendererTurbo(this, 124, 34, textureX, textureY); // Box deluxe trim
		bodyModel[298] = new ModelRendererTurbo(this, 113, 38, textureX, textureY); // Box deluxe trim
		bodyModel[299] = new ModelRendererTurbo(this, 135, 34, textureX, textureY); // Box deluxe trim
		bodyModel[300] = new ModelRendererTurbo(this, 113, 34, textureX, textureY); // Box deluxe trim
		bodyModel[301] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Box 305
		bodyModel[302] = new ModelRendererTurbo(this, 10, 64, textureX, textureY); // Box 306
		bodyModel[303] = new ModelRendererTurbo(this, 13, 64, textureX, textureY); // Box 307
		bodyModel[304] = new ModelRendererTurbo(this, 79, 49, textureX, textureY, "cull"); // Box cull sunvisor
		bodyModel[305] = new ModelRendererTurbo(this, 68, 52, textureX, textureY); // Box 312
		bodyModel[306] = new ModelRendererTurbo(this, 175, 30, textureX, textureY); // Box floor shifter upfit
		bodyModel[307] = new ModelRendererTurbo(this, 180, 32, textureX, textureY); // Box floor shifter upfit
		bodyModel[308] = new ModelRendererTurbo(this, 237, 89, textureX, textureY); // Box exhaust
		bodyModel[309] = new ModelRendererTurbo(this, 237, 92, textureX, textureY); // Box exhaust
		bodyModel[310] = new ModelRendererTurbo(this, 237, 95, textureX, textureY); // Box exhaust
		bodyModel[311] = new ModelRendererTurbo(this, 237, 98, textureX, textureY); // Box exhaust
		bodyModel[312] = new ModelRendererTurbo(this, 68, 63, textureX, textureY); // Box suitcase
		bodyModel[313] = new ModelRendererTurbo(this, 139, 61, textureX, textureY); // Box 317
		bodyModel[314] = new ModelRendererTurbo(this, 151, 88, textureX, textureY); // Box 318
		bodyModel[315] = new ModelRendererTurbo(this, 144, 118, textureX, textureY); // Box 315
		bodyModel[316] = new ModelRendererTurbo(this, 144, 118, textureX, textureY); // Box 316
		bodyModel[317] = new ModelRendererTurbo(this, 26, 36, textureX, textureY); // Box 317
		bodyModel[318] = new ModelRendererTurbo(this, 31, 36, textureX, textureY); // Box 318
		bodyModel[319] = new ModelRendererTurbo(this, 139, 29, textureX, textureY); // Box 319
		bodyModel[320] = new ModelRendererTurbo(this, 69, 39, textureX, textureY); // Box 106 plate
		bodyModel[321] = new ModelRendererTurbo(this, 69, 34, textureX, textureY); // Box 183 plate
		bodyModel[322] = new ModelRendererTurbo(this, 87, 32, textureX, textureY); // Box alt rear plate placememnt

		bodyModel[0].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[0].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[1].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[2].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[3].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[3].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[4].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[4].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[5].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[5].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[6].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[6].setRotationPoint(-13.5F, 7F, 0F);

		bodyModel[7].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
		bodyModel[7].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[8].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
		bodyModel[8].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[9].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
		bodyModel[9].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[10].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
		bodyModel[10].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[11].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
		bodyModel[11].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[12].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
		bodyModel[12].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[13].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 18 axle
		bodyModel[13].setRotationPoint(13.5F, 7F, 0F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 19
		bodyModel[14].setRotationPoint(-18F, 4.5F, -4.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.5F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0.5F); // Box 21
		bodyModel[15].setRotationPoint(-12F, 4.5F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-6F, 6.5F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(9F, 6.5F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(14F, 4.5F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[19].setRotationPoint(-6F, 6.5F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[20].setRotationPoint(9F, 6.5F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[21].setRotationPoint(14F, 4.5F, 5F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 34
		bodyModel[22].setRotationPoint(-18F, 4.5F, 3.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0.5F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, -0.5F); // Box 35
		bodyModel[23].setRotationPoint(-12F, 4.5F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[24].setRotationPoint(-10F, 5.5F, -4.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[25].setRotationPoint(9F, 6.75F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[26].setRotationPoint(20F, 5.5F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[27].setRotationPoint(-18F, 5.51F, -3.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 42
		bodyModel[28].setRotationPoint(-18F, 2.75F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 43
		bodyModel[29].setRotationPoint(-12F, 3.75F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[30].setRotationPoint(-17F, 3.75F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 19, 4, 1, 0F); // Box 45
		bodyModel[31].setRotationPoint(-9F, 2.75F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[32].setRotationPoint(-9F, 6.75F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 48
		bodyModel[33].setRotationPoint(10F, 2.75F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.625F, 0F, 0F, -0.625F); // Box 49
		bodyModel[34].setRotationPoint(10F, 5.25F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -1F, -0.625F); // Box 50
		bodyModel[35].setRotationPoint(15F, 5.25F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.625F, 0F, 0.5F, -0.625F); // Box 51
		bodyModel[36].setRotationPoint(10F, 3.75F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F); // Box 53
		bodyModel[37].setRotationPoint(17F, 2.75F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 54
		bodyModel[38].setRotationPoint(17F, 6.25F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 56
		bodyModel[39].setRotationPoint(-20F, 3.75F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[40].setRotationPoint(-19F, 0.75F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[41].setRotationPoint(12F, 0.75F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.75F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 59
		bodyModel[42].setRotationPoint(17F, 1.75F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box headlight
		bodyModel[43].setRotationPoint(-20.25F, 0.87F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 64
		bodyModel[44].setRotationPoint(-19F, 2.75F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[45].setRotationPoint(-20F, 0.75F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[46].setRotationPoint(-20F, 0.75F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[47].setRotationPoint(-20F, 0.75F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[48].setRotationPoint(-20F, 2.75F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 72
		bodyModel[49].setRotationPoint(-20F, 3.75F, -8F);

		bodyModel[50].addShapeBox(1F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.55F, -0.5F, 0F, 0.55F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 125
		bodyModel[50].setRotationPoint(-20.5F, 6.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 79
		bodyModel[51].setRotationPoint(-19F, 2.75F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[52].setRotationPoint(-20F, 0.75F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[53].setRotationPoint(-20F, 0.75F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[54].setRotationPoint(-20F, 0.75F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 83
		bodyModel[55].setRotationPoint(-20F, 2.75F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F); // Box 86
		bodyModel[56].setRotationPoint(-17F, 3.75F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -1F, 0F, -0.375F); // Box 87
		bodyModel[57].setRotationPoint(-20F, 3.75F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 19, 4, 1, 0F); // Box 88
		bodyModel[58].setRotationPoint(-9F, 2.75F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 89
		bodyModel[59].setRotationPoint(-9F, 6.75F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 31, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[60].setRotationPoint(-19F, 0.75F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.3F, -0.35F, 0.25F, -0.3F, -0.35F, -0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, -1F, -0.25F, 0F, -1F); // Box 98
		bodyModel[61].setRotationPoint(-20F, 3.5F, -6F);

		bodyModel[62].addShapeBox(0F, 1F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.75F, -0.5F, 1F, 0.75F, -0.5F, 0F, 0.05F, -0.65F, 0F, 0.05F, -0.65F, -0.5F, -1F, -0.5F, 1F, -1F, -0.5F); // Box 101
		bodyModel[62].setRotationPoint(-20.25F, 1.75F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F); // Box 103
		bodyModel[63].setRotationPoint(-20F, 3.5F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[64].setRotationPoint(-20F, 3.75F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 1948 to 1950 trim
		bodyModel[65].setRotationPoint(-21.25F, 1.75F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1948 to 1950 trim
		bodyModel[66].setRotationPoint(-21.25F, 1.75F, 0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1948 to 1950 trim
		bodyModel[67].setRotationPoint(-21.25F, 1F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 110
		bodyModel[68].setRotationPoint(-21F, 0.75F, -1.5F);

		bodyModel[69].addShapeBox(0F, 1F, 0F, 1, 1, 5, 0F,1F, 0.75F, -0.5F, -0.5F, 0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.05F, -0.65F, 0F, 0.05F, -0.65F); // Box 112
		bodyModel[69].setRotationPoint(-20.25F, 1.75F, 1F);

		bodyModel[70].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.125F, 0F, -0.25F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, 0F); // Box 113
		bodyModel[70].setRotationPoint(-21.5F, 6.5F, -9F);

		bodyModel[71].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, -0.125F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.75F, -0.25F); // Box 117
		bodyModel[71].setRotationPoint(-21.5F, 6.5F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.125F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.75F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, -0.625F, 0F); // Box 118
		bodyModel[72].setRotationPoint(-20.5F, 6.5F, -8F);

		bodyModel[73].addShapeBox(1F, 0F, 0F, 2, 2, 1, 0F,0F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.55F, -0.25F, 0F, 0.55F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		bodyModel[73].setRotationPoint(-20.5F, 6.5F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 1948 to 1950 trim
		bodyModel[74].setRotationPoint(-21.25F, 4F, -6.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1948 to 1950 trim
		bodyModel[75].setRotationPoint(-20.25F, 4F, -7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 1948 to 1950 trim
		bodyModel[76].setRotationPoint(-20.25F, 4F, 6.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[77].setRotationPoint(-21F, -0.25F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[78].setRotationPoint(-20F, 1.75F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[79].setRotationPoint(-20F, 1.75F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[80].setRotationPoint(-20F, -0.25F, -1.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[81].setRotationPoint(-13F, -0.25F, -6.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, -0.25F, 0.5F, 0F, 0F, 0.5F, 1F, -1F, -0.75F, -1.25F, -1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 1F, -1F, -1F, 1F, -1F); // Box 135
		bodyModel[82].setRotationPoint(-21F, -0.25F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F); // Box 136
		bodyModel[83].setRotationPoint(-19F, 0.75F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[84].setRotationPoint(-19F, 0.75F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F); // Box 138
		bodyModel[85].setRotationPoint(-21.5F, 5F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F); // Box 139
		bodyModel[86].setRotationPoint(-21.5F, 5F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 140
		bodyModel[87].setRotationPoint(-13F, 0.75F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, -1F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 141
		bodyModel[88].setRotationPoint(-19F, -0.25F, -6.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 142
		bodyModel[89].setRotationPoint(-13F, -0.25F, 1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 143
		bodyModel[90].setRotationPoint(-19F, 0.75F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F); // Box 145
		bodyModel[91].setRotationPoint(-19F, -0.25F, 1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[92].setRotationPoint(-19F, 0.75F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 147
		bodyModel[93].setRotationPoint(10F, 2.75F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -1F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[94].setRotationPoint(10F, 5.25F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 149
		bodyModel[95].setRotationPoint(15F, 5.25F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.625F, 0F, 0.5F, -0.625F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 150
		bodyModel[96].setRotationPoint(10F, 3.75F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 151
		bodyModel[97].setRotationPoint(17F, 2.75F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F); // Box 152
		bodyModel[98].setRotationPoint(17F, 6.25F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[99].setRotationPoint(12F, 0.75F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 0.25F, -0.75F, 0F, 0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 154
		bodyModel[100].setRotationPoint(17F, 1.75F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[101].setRotationPoint(-13F, 0.75F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box cull windoe
		bodyModel[102].setRotationPoint(-9F, -4.25F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-5F, -1F, 0F, 5F, -1F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 164 cull windoe
		bodyModel[103].setRotationPoint(-9F, -4.25F, -7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 164 cull windoe
		bodyModel[104].setRotationPoint(-9F, -4.25F, 1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3.75F, -0.25F, -0.25F, 3.25F, -0.25F, -0.25F, 3F, 0F, 0F, -3F, 0F, 0F, -0.75F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 165
		bodyModel[105].setRotationPoint(-7F, -3.25F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 167
		bodyModel[106].setRotationPoint(-3F, -6.25F, -1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,-1F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 168
		bodyModel[107].setRotationPoint(-3F, -6.25F, -7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2.25F, 0F, -1F, -2.25F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F); // Box 169
		bodyModel[108].setRotationPoint(-3F, -6.25F, 1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[109].setRotationPoint(22F, 0.75F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 172
		bodyModel[110].setRotationPoint(22F, 1.75F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 173
		bodyModel[111].setRotationPoint(-2F, -4.25F, -8.5F);

		bodyModel[112].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0.55F, -0.25F, 0F); // Box 176
		bodyModel[112].setRotationPoint(20.5F, 6.5F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0.25F, 0F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, 0F, 0.5F, -0.625F, 0F, -0.5F, -0.25F, 0F); // Box 177
		bodyModel[113].setRotationPoint(22.5F, 6.5F, -8F);

		bodyModel[114].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.125F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.75F, -0.25F, 0F, -0.625F, 0F, 0F, -0.25F, 0F); // Box 178
		bodyModel[114].setRotationPoint(21.5F, 6.5F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F); // Box 179
		bodyModel[115].setRotationPoint(23F, 6.5F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F); // Box 180
		bodyModel[116].setRotationPoint(23F, 5F, -6.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F); // Box 181
		bodyModel[117].setRotationPoint(23F, 5F, 5.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0.25F, 0F, 0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F); // Box 182
		bodyModel[118].setRotationPoint(22.5F, 6.5F, 2F);

		bodyModel[119].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0F, -0.125F, 0F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, 0F, -0.25F, -0.75F, -0.25F, 0F, -0.5F, 0F); // Box 183
		bodyModel[119].setRotationPoint(21.5F, 6.5F, 8F);

		bodyModel[120].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0.55F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.55F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.55F, -0.5F, 0F); // Box 184
		bodyModel[120].setRotationPoint(20.5F, 6.5F, 8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -1.25F, -1.25F, 0.25F, 1F, -1F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 1F, 0F, 1F, 1F, 0F); // Box 186
		bodyModel[121].setRotationPoint(22F, 0.75F, 3.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, -1F, 0.25F, -1.25F, -1.25F, 0.25F, -0.25F, -0.25F, 0.5F, 0F, 0F, 0.5F, 1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 188
		bodyModel[122].setRotationPoint(22F, 0.75F, -7.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0.5F, 1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 190
		bodyModel[123].setRotationPoint(22F, 1.75F, 3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 191
		bodyModel[124].setRotationPoint(22F, 2.75F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, -1F, 0.5F, -1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[125].setRotationPoint(22F, 1.75F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[126].setRotationPoint(22F, 2.75F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[127].setRotationPoint(22F, 1.75F, -9.5F);

		bodyModel[128].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 195
		bodyModel[128].setRotationPoint(22F, 1.75F, -8.5F);

		bodyModel[129].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 196
		bodyModel[129].setRotationPoint(22F, 1.75F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[130].setRotationPoint(22F, 1.75F, 5.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[131].setRotationPoint(22F, 2.75F, -8.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 199
		bodyModel[132].setRotationPoint(22F, 2.75F, -7.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 200
		bodyModel[133].setRotationPoint(22F, 2.75F, 7.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[134].setRotationPoint(22F, 2.75F, 6.5F);

		bodyModel[135].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0.25F, -0.25F); // Box 202
		bodyModel[135].setRotationPoint(22F, 5.75F, 6.5F);

		bodyModel[136].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 203
		bodyModel[136].setRotationPoint(22F, 5.75F, 5.5F);

		bodyModel[137].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, -0.25F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 204
		bodyModel[137].setRotationPoint(22F, 5.75F, -9.5F);

		bodyModel[138].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.5F, 0F, 0.25F, -0.25F); // Box 205
		bodyModel[138].setRotationPoint(22F, 5.75F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[139].setRotationPoint(12F, 0.75F, -3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[140].setRotationPoint(12F, 0.75F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[141].setRotationPoint(12F, 0.75F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, -1F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[142].setRotationPoint(17F, 0.75F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, -1F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, 0F, 0F, 0F); // Box 215
		bodyModel[143].setRotationPoint(17F, 0.75F, 3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,3.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, -3F, 0F, 0F, 3F, 0F, 0F, -0.75F, -1F, 0F, 0.25F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0F); // Box 218
		bodyModel[144].setRotationPoint(11F, -3.25F, -8.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -4F, -1F, 0F, 4F, -1F, 0F, 5F, -1F, 0.5F, -5F, -1F, 0.5F); // Box 219
		bodyModel[145].setRotationPoint(8F, -3.25F, -7.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,-1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0.5F, 5F, -1F, 0.5F, 4F, -1F, 0F, -4F, -1F, 0F); // Box 221
		bodyModel[146].setRotationPoint(8F, -3.25F, 0.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.25F, 0F, 1F, -1.25F, -1.5F, 1F, -1.25F, -1.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 1F, -1.5F, 1F, 1F, -1.5F, 0F, 0F, 0F); // Box 223
		bodyModel[147].setRotationPoint(4F, -5.25F, -1.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.25F, 0F, 1F, -1.25F, 1.5F, 0F, -1.25F, -1F, 0F, -1.25F, 0F, 0F, 0F, 0F, 1F, 1F, 1.5F, 0F, 1F, -1F, 0F, 1F, 0F); // Box 225
		bodyModel[148].setRotationPoint(4F, -5.25F, 1.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 1.25F, 0.25F, -0.25F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[149].setRotationPoint(4F, -4.25F, -8.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -1.25F, 0F, 0F, -1.25F, -1F, 1F, -1.25F, 1.5F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 1F, 1F, 1.5F, 0F, 0F, 0F); // Box 229
		bodyModel[150].setRotationPoint(4F, -5.25F, -7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 1F, 4, 1, 1, 0F,0F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 231
		bodyModel[151].setRotationPoint(4F, -4.25F, -8.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 11, 5, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 172
		bodyModel[152].setRotationPoint(-3F, -3.25F, -8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -0.75F, 0.25F, -2F, -0.75F, 0.25F, -2F, -0.75F, -0.25F, 1F, -0.75F, -0.25F); // Box 212
		bodyModel[153].setRotationPoint(-5F, -3.25F, -8F);

		bodyModel[154].addShapeBox(1F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0.125F, -1F, 0F, 1F, -1F, 0.5F, -1F, -0.25F, 0.5F, 0F, 0F, 0F, 0.125F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 177
		bodyModel[154].setRotationPoint(7F, -4.25F, -6.5F);

		bodyModel[155].addShapeBox(1F, 0F, 0F, 1, 1, 6, 0F,-1F, -0.25F, 0.5F, 1F, -1F, 0.5F, 0.125F, -1F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[155].setRotationPoint(7F, -4.25F, 0.5F);

		bodyModel[156].addShapeBox(2F, 0F, 0F, 1, 1, 1, 0F,1F, -0.5F, 0F, 0F, -1F, 0F, 0.125F, -1F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[156].setRotationPoint(6F, -4.25F, -7.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1948 to 1950 trim
		bodyModel[157].setRotationPoint(-21.25F, 3F, -1.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 1948 to 1950 trim
		bodyModel[158].setRotationPoint(-21.25F, 4F, 1.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 1948 to 1950 trim
		bodyModel[159].setRotationPoint(-21.75F, 3.5F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1948 to 1950 trim
		bodyModel[160].setRotationPoint(-20.75F, 3.5F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1948 to 1950 trim
		bodyModel[161].setRotationPoint(-21.25F, 3F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 0, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1948 to 1950 trim
		bodyModel[162].setRotationPoint(-21.25F, 4.5F, -1.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[163].setRotationPoint(-20.25F, 1.75F, -6.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 193
		bodyModel[164].setRotationPoint(-20.25F, 1.75F, -1.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 194
		bodyModel[165].setRotationPoint(-20.25F, 1.75F, 1.5F);

		bodyModel[166].addShapeBox(1F, 0F, 0F, 2, 4, 1, 0F,0F, -0.5F, -0.25F, -2F, -0.5F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, -0.25F, -0.5F, -1.25F, -0.25F, -0.5F); // Box 192
		bodyModel[166].setRotationPoint(7F, -3.25F, -8.5F);

		bodyModel[167].addShapeBox(1F, 0F, 0F, 1, 4, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 194
		bodyModel[167].setRotationPoint(1F, -3.25F, -8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.75F, -0.75F, 0.25F, 0.75F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F); // Box 195
		bodyModel[168].setRotationPoint(8F, -3.25F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3.25F, -0.25F, -0.25F, -3.75F, -0.25F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -1F, 0F, -0.75F, -1F, 0F); // Box 201
		bodyModel[169].setRotationPoint(-7F, -3.25F, 7.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 1.25F, 0.25F, -0.25F); // Box 202
		bodyModel[170].setRotationPoint(-2F, -4.25F, 7.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3.75F, -0.25F, -0.25F, 3.25F, -0.25F, -0.25F, -1F, -1F, 0F, 1F, -1F, 0F, 0.25F, -1F, 0F, -0.75F, -1F, 0F); // Box 203
		bodyModel[171].setRotationPoint(11F, -3.25F, 7.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[172].setRotationPoint(-8F, -8F, 8.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box hood mirrors
		bodyModel[173].setRotationPoint(-6.5F, -0.25F, -9.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 213
		bodyModel[174].setRotationPoint(-6.5F, -0.25F, 8.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1F, 0.5F, 0F, 0.5F, 0F, 0F, 0.25F, -0.25F, 0F, 0.75F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 214
		bodyModel[175].setRotationPoint(17F, 1.75F, -7.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[176].setRotationPoint(-2.5F, -5.75F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box PRIME-1
		bodyModel[177].setRotationPoint(-2.5F, -6.25F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box PRIME-2
		bodyModel[178].setRotationPoint(-2.5F, -6.25F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box PRIME-3
		bodyModel[179].setRotationPoint(-2.5F, -6.25F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // Box PRIME-4
		bodyModel[180].setRotationPoint(-2.5F, -6.25F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 171 foglight
		bodyModel[181].setRotationPoint(-21F, 6.5F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 236 foglight alternative
		bodyModel[182].setRotationPoint(-20.85F, 3.75F, -6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 211 foglight
		bodyModel[183].setRotationPoint(-21F, 6.5F, 5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 212 foglight alternative
		bodyModel[184].setRotationPoint(-20.85F, 3.75F, 4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 216 foglight
		bodyModel[185].setRotationPoint(-6F, -2.5F, -10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 217
		bodyModel[186].setRotationPoint(-5.75F, -2.5F, -10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 216 foglight
		bodyModel[187].setRotationPoint(-6F, -2.5F, 8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 219
		bodyModel[188].setRotationPoint(-5.75F, -2.5F, 8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box cull roofbars
		bodyModel[189].setRotationPoint(-2F, -5.25F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull roofbar gates
		bodyModel[190].setRotationPoint(-2F, -7.25F, -7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 100 hitch ball
		bodyModel[191].setRotationPoint(25.5F, 6.5F, -0.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101 hitch
		bodyModel[192].setRotationPoint(21F, 6.5F, -0.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[193].setRotationPoint(24.5F, 7.5F, -0.5F);

		bodyModel[194].addShapeBox(-1F, -1F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F); // Box 220 wheel 1
		bodyModel[194].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[195].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F); // Box 221 wheel 1
		bodyModel[195].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[196].addShapeBox(-1F, -2F, -1.01F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 222
		bodyModel[196].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[197].addShapeBox(-1F, 1F, -1.01F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[197].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[198].addShapeBox(-3F, -3F, -1.01F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[198].setRotationPoint(-13.5F, 7F, -7.5F);

		bodyModel[199].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[199].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[200].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[200].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[201].addShapeBox(-1F, -2F, 1.01F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 227
		bodyModel[201].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[202].addShapeBox(-1F, 1F, 1.01F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[202].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[203].addShapeBox(-3F, -3F, 1.01F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[203].setRotationPoint(-13.5F, 7F, 7.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, -1F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 2F, 0F, 0F, 1.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 230
		bodyModel[204].setRotationPoint(4F, -4.25F, 7.5F);

		bodyModel[205].addShapeBox(0F, 0F, 1F, 4, 1, 1, 0F,0F, -0.25F, -1F, 0F, -0.25F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[205].setRotationPoint(4F, -4.25F, 5.5F);

		bodyModel[206].addShapeBox(2F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0.125F, -1F, 0F, 0F, -1F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 232
		bodyModel[206].setRotationPoint(6F, -4.25F, 6.5F);

		bodyModel[207].addShapeBox(-1F, -2F, -1.01F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 233
		bodyModel[207].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[208].addShapeBox(-1F, 1F, -1.01F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[208].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[209].addShapeBox(-3F, -3F, -1.01F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[209].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[210].addShapeBox(-1F, -1F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F); // Box 236
		bodyModel[210].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[211].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F); // Box 237
		bodyModel[211].setRotationPoint(13.5F, 7F, -7.5F);

		bodyModel[212].addShapeBox(-1F, -2F, 1.01F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 238
		bodyModel[212].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[213].addShapeBox(-1F, 1F, 1.01F, 2, 1, 0, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[213].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[214].addShapeBox(-3F, -3F, 1.01F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[214].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[215].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[215].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[216].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,-0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[216].setRotationPoint(13.5F, 7F, 7.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 244
		bodyModel[217].setRotationPoint(-10F, 5.75F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 245
		bodyModel[218].setRotationPoint(-10F, 6.75F, -9F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 247
		bodyModel[219].setRotationPoint(-10F, 5.75F, 8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 248
		bodyModel[220].setRotationPoint(-10F, 6.75F, 8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -0.5F, 1F, 1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.75F, -0.5F, 1F, -1.75F, -0.5F); // Box 249
		bodyModel[221].setRotationPoint(-20F, 1.75F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.75F, -0.5F, -0.5F, -1.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 250
		bodyModel[222].setRotationPoint(-20F, 1.75F, 1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.25F, -1.25F, -0.75F, 1F, -1F, -0.75F, 0F, 0F, 0.5F, -0.25F, -0.25F, 0.5F, -1F, 1F, -1F, 1F, 1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 251
		bodyModel[223].setRotationPoint(-21F, -0.25F, -7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 252 1951 to 1953 trim
		bodyModel[224].setRotationPoint(-21.25F, 2F, -1.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.1F, 0.75F, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.25F, 0F, -0.1F, 0F, -0.75F, 0F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box taillight
		bodyModel[225].setRotationPoint(22.1F, 2.75F, 7.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.1F, 0.75F, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.25F, 0F, -0.1F, 0F); // Box turnlight R
		bodyModel[226].setRotationPoint(22.1F, 4.75F, 7.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.1F, 0F, -0.25F, -0.1F, -0.25F, 0F, -0.1F, 0F, -0.75F, -0.1F, 0.75F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0.75F); // Box taillight
		bodyModel[227].setRotationPoint(22.1F, 2.75F, -8.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0.75F, 0F, -0.1F, 0F, -0.25F, -0.1F, -0.25F, 0F, -0.1F, 0F, -0.75F, -0.1F, 0.75F); // Box turnlight L
		bodyModel[228].setRotationPoint(22.1F, 4.75F, -8.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[229].setRotationPoint(10F, 5.75F, -9.01F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 7, 2, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F); // Box 261
		bodyModel[230].setRotationPoint(10F, 6.75F, -9.01F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[231].setRotationPoint(-20.25F, 4.25F, -8.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[232].setRotationPoint(-19.25F, 4.25F, -9.25F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -0.25F, 0F, 1F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 1951 to 1953 trim
		bodyModel[233].setRotationPoint(-21.25F, 4.25F, -7.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim cull
		bodyModel[234].setRotationPoint(-21.25F, 3.75F, -4F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim cull
		bodyModel[235].setRotationPoint(-21.25F, 3.75F, 2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[236].setRotationPoint(-20.25F, 4.25F, 7.75F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[237].setRotationPoint(-19.25F, 4.25F, 8.25F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[238].setRotationPoint(-21.25F, 4.25F, 3.75F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[239].setRotationPoint(-21.25F, 4.25F, -2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[240].setRotationPoint(-21.25F, 4.25F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[241].setRotationPoint(-21.75F, 4.25F, -3.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[242].setRotationPoint(-21.75F, 4.25F, 2.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[243].setRotationPoint(-21.25F, 3.75F, 3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[244].setRotationPoint(-21.25F, 4.75F, 2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[245].setRotationPoint(-21.25F, 4.75F, -4F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1951 to 1953 trim
		bodyModel[246].setRotationPoint(-21.25F, 3.75F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[247].setRotationPoint(-21F, -1F, 0F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0.75F, -0.125F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.125F, 0F, 0.75F, -0.625F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, 0F); // Box 285
		bodyModel[248].setRotationPoint(-20.5F, 6.5F, 2F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.125F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, 0F); // Box 287
		bodyModel[249].setRotationPoint(-21.25F, 6.5F, -2F);

		bodyModel[250].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 288
		bodyModel[250].setRotationPoint(-18F, 2.75F, 8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 289
		bodyModel[251].setRotationPoint(-12F, 3.75F, 8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 290
		bodyModel[252].setRotationPoint(-18F, -0.25F, -8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 291 turnlight L
		bodyModel[253].setRotationPoint(-19F, -0.25F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 294
		bodyModel[254].setRotationPoint(-18F, -0.25F, 7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 295 turnlight R
		bodyModel[255].setRotationPoint(-19F, -0.25F, 7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[256].setRotationPoint(12F, 5.5F, -1.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box driveshaf
		bodyModel[257].setRotationPoint(-10.5F, 6.5F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box tork konvartah
		bodyModel[258].setRotationPoint(-12.5F, 5.5F, -1.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 11, 5, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 299
		bodyModel[259].setRotationPoint(-3F, -3.25F, 8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 5, 0, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -0.75F, -0.25F, -2F, -0.75F, -0.25F, -2F, -0.75F, 0.25F, 1F, -0.75F, 0.25F); // Box 300
		bodyModel[260].setRotationPoint(-5F, -3.25F, 8F);

		bodyModel[261].addShapeBox(1F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1.25F, -0.25F, -0.5F, 1.75F, -0.25F, -0.5F, 1.75F, 0F, 0F, -1.25F, 0F, 0F); // Box 301
		bodyModel[261].setRotationPoint(7F, -3.25F, 7.5F);

		bodyModel[262].addShapeBox(1F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[262].setRotationPoint(1F, -3.25F, 7.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F); // Box 303
		bodyModel[263].setRotationPoint(8F, -3.25F, 8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box turnlight L
		bodyModel[264].setRotationPoint(-20F, 5.25F, -8.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 306
		bodyModel[265].setRotationPoint(-20F, 5.25F, 6.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box spooky engine
		bodyModel[266].setRotationPoint(-18.5F, 2F, -3F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[267].setRotationPoint(-10F, 1F, -7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[268].setRotationPoint(-6F, 5.6F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 207
		bodyModel[269].setRotationPoint(-10F, 5.6F, -8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[270].setRotationPoint(-3F, 4F, -8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 224
		bodyModel[271].setRotationPoint(1F, 0F, -8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[272].setRotationPoint(6.1F, 4F, -8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 314
		bodyModel[273].setRotationPoint(10.1F, 0F, -8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.625F, 0F); // Box 315
		bodyModel[274].setRotationPoint(-10F, 1.75F, -8F);

		bodyModel[275].addShapeBox(1F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[275].setRotationPoint(-5.49F, 1.25F, -4.5F);
		bodyModel[275].rotateAngleZ = 0.29670597F;

		bodyModel[276].addBox(-6F, -0.5F, -0.5F, 7, 1, 1, 0F); // Box 227
		bodyModel[276].setRotationPoint(-5.5F, 1.25F, -4.5F);
		bodyModel[276].rotateAngleZ = 0.29670597F;

		bodyModel[277].addShapeBox(0.5F, -0.25F, -2F, 0, 1, 4, 0F,0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 318
		bodyModel[277].setRotationPoint(-5.49F, 1.25F, -4.5F);
		bodyModel[277].rotateAngleX = 0.20943951F;
		bodyModel[277].rotateAngleZ = 0.29670597F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[278].setRotationPoint(-9.5F, 1.5F, -2F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 7, 1, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[279].setRotationPoint(10F, 5.75F, 9.01F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 7, 2, 0, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 321
		bodyModel[280].setRotationPoint(10F, 6.75F, 9.01F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F); // Box cull nobodysgonnaseethis
		bodyModel[281].setRotationPoint(-15F, 3.5F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F, 2F, -0.75F, 0F); // Box cull nobodysgonnaseethis
		bodyModel[282].setRotationPoint(-15F, 3.5F, 6F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 249
		bodyModel[283].setRotationPoint(16F, 4.5F, -8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 6, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 328
		bodyModel[284].setRotationPoint(10F, 4.5F, -8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 headlight
		bodyModel[285].setRotationPoint(-20.25F, 0.87F, 6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box cull lids
		bodyModel[286].setRotationPoint(-20.5F, 0.86F, -9F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F); // Box cull lids
		bodyModel[287].setRotationPoint(-20.5F, 0.86F, 6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[288].setRotationPoint(-9.5F, 5.5F, -1.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 293
		bodyModel[289].setRotationPoint(12.1F, 1F, -8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[290].setRotationPoint(-2.5F, -5.75F, -2F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.3F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.05F, 0F, -0.05F, 0.45F, 0F, -0.05F, 0.45F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box glow taxi bit
		bodyModel[291].setRotationPoint(-2.5F, -7F, -2F);

		bodyModel[292].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.625F, -0.25F, 0F, 0.625F, -0.25F, 0.5F, -0.625F, 0F, 0.5F, -0.625F); // Box cull curb feeler
		bodyModel[292].setRotationPoint(-9.88F, 8F, -9.5F);

		bodyModel[293].addShapeBox(1F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.5F, -0.625F, -0.25F, 0.5F, -0.625F, -0.25F, 0F, 0.625F, 0F, 0F, 0.625F); // Box cull curb feeler
		bodyModel[293].setRotationPoint(-9.88F, 8F, 8.5F);

		bodyModel[294].addShapeBox(0.25F, -3F, 0F, 1, 3, 0, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 298
		bodyModel[294].setRotationPoint(-5.5F, -4.75F, 0F);
		bodyModel[294].rotateAngleZ = -0.6981317F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 26, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box deluxe trim
		bodyModel[295].setRotationPoint(-9F, 4.37F, -9.01F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F); // Box deluxe trim
		bodyModel[296].setRotationPoint(-10F, 4.37F, -9.01F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F); // Box deluxe trim
		bodyModel[297].setRotationPoint(17F, 4.37F, -9.01F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 26, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box deluxe trim
		bodyModel[298].setRotationPoint(-9F, 4.37F, 9.01F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.375F, 0F); // Box deluxe trim
		bodyModel[299].setRotationPoint(-10F, 4.37F, 9.01F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F); // Box deluxe trim
		bodyModel[300].setRotationPoint(17F, 4.37F, 9.01F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 305
		bodyModel[301].setRotationPoint(-8F, -8F, -8.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 306
		bodyModel[302].setRotationPoint(21F, -7F, -7.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 307
		bodyModel[303].setRotationPoint(21F, -7F, 7.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,-1F, -2.25F, -0.5F, 2F, -2.75F, -0.5F, 1F, -1.25F, 0F, 0F, -1.25F, 0F, 0.25F, 1.25F, 0.25F, 0.75F, 1.5F, 0.25F, 0F, 0.5F, 0F, 2F, 0.5F, 0F); // Box cull sunvisor
		bodyModel[304].setRotationPoint(-5F, -6.25F, -8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -1.25F, 0F, 1F, -1.25F, 0F, 2F, -2.75F, -0.5F, -1F, -2.25F, -0.5F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.75F, 1.5F, 0.25F, 0.25F, 1.25F, 0.25F); // Box 312
		bodyModel[305].setRotationPoint(-5F, -6.25F, 0F);

		bodyModel[306].addShapeBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box floor shifter upfit
		bodyModel[306].setRotationPoint(-5.25F, 5F, -0.75F);
		bodyModel[306].rotateAngleX = 0.15707963F;
		bodyModel[306].rotateAngleZ = -0.2443461F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box floor shifter upfit
		bodyModel[307].setRotationPoint(-6.5F, 4.5F, -1.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box exhaust
		bodyModel[308].setRotationPoint(13F, 6F, -3.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box exhaust
		bodyModel[309].setRotationPoint(13F, 6F, 2.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box exhaust
		bodyModel[310].setRotationPoint(18F, 8F, 2.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box exhaust
		bodyModel[311].setRotationPoint(18F, 8F, -3.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box suitcase
		bodyModel[312].setRotationPoint(-1.5F, -8.25F, -6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[313].setRotationPoint(9F, 4.5F, -8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.75F, -0.75F, 0F, 0.25F, -0.25F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 318
		bodyModel[314].setRotationPoint(17F, 1.75F, 6.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 315
		bodyModel[315].setRotationPoint(10F, 3.75F, -8F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 316
		bodyModel[316].setRotationPoint(10F, 3.75F, 8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F); // Box 317
		bodyModel[317].setRotationPoint(-21.5F, 5F, -5.25F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F); // Box 318
		bodyModel[318].setRotationPoint(-21.5F, 5F, 4.25F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 0, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[319].setRotationPoint(2.5F, -3.63F, -8F);

		bodyModel[320].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 106 plate
		bodyModel[320].setRotationPoint(-21.26F, 8.25F, 2F);
		bodyModel[320].rotateAngleY = -3.14159265F;

		bodyModel[321].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[321].setRotationPoint(24.01F, 8F, -2F);

		bodyModel[322].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box alt rear plate placememnt
		bodyModel[322].setRotationPoint(23.01F, 5.5F, -2F);
	}
}