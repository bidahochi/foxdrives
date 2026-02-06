//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: dosei kiote
// Model Creator: bidahochi
// Created on: 23.12.2025 - 10:37:33
// Last changed on: 23.12.2025 - 10:37:33

package bidahochi.foxdrives.models; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelDoseiKiote_Sedan extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelDoseiKiote_Sedan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[240];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 10, 119, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 118, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 123, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 111, textureX, textureY, "wheel front"); // Box 17 Wheel1
		bodyModel[4] = new ModelRendererTurbo(this, 28, 119, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[5] = new ModelRendererTurbo(this, 19, 118, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[6] = new ModelRendererTurbo(this, 19, 123, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[7] = new ModelRendererTurbo(this, 19, 111, textureX, textureY, "wheel front"); // Box 17 Wheel2
		bodyModel[8] = new ModelRendererTurbo(this, 1, 94, textureX, textureY); // Box 23 axle 1-2
		bodyModel[9] = new ModelRendererTurbo(this, 46, 119, textureX, textureY, "wheel"); // Box 136 Wheel3
		bodyModel[10] = new ModelRendererTurbo(this, 37, 118, textureX, textureY, "wheel"); // Box 9 Wheel3
		bodyModel[11] = new ModelRendererTurbo(this, 37, 123, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[12] = new ModelRendererTurbo(this, 37, 111, textureX, textureY, "wheel"); // Box 17 Wheel3
		bodyModel[13] = new ModelRendererTurbo(this, 64, 119, textureX, textureY, "wheel"); // Box 136 Wheel4
		bodyModel[14] = new ModelRendererTurbo(this, 55, 118, textureX, textureY, "wheel"); // Box 9 Wheel4
		bodyModel[15] = new ModelRendererTurbo(this, 55, 123, textureX, textureY, "wheel"); // Box 12 Wheel4
		bodyModel[16] = new ModelRendererTurbo(this, 55, 111, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[17] = new ModelRendererTurbo(this, 1, 94, textureX, textureY); // Box 23 axle 3-4
		bodyModel[18] = new ModelRendererTurbo(this, 6, 72, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 5, 67, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 42, 28, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 20, 87, textureX, textureY); // Box 31 bumper center
		bodyModel[22] = new ModelRendererTurbo(this, 34, 86, textureX, textureY); // Box 32 bumper curved
		bodyModel[23] = new ModelRendererTurbo(this, 46, 87, textureX, textureY); // Box 34 bumper curved
		bodyModel[24] = new ModelRendererTurbo(this, 92, 82, textureX, textureY); // Box 37 bumper rear
		bodyModel[25] = new ModelRendererTurbo(this, 111, 105, textureX, textureY); // Box 106 plate front
		bodyModel[26] = new ModelRendererTurbo(this, 10, 86, textureX, textureY); // Box 41 bumper curved
		bodyModel[27] = new ModelRendererTurbo(this, 4, 12, textureX, textureY); // Box 42 grille
		bodyModel[28] = new ModelRendererTurbo(this, 23, 22, textureX, textureY); // Box 43
		bodyModel[29] = new ModelRendererTurbo(this, 24, 25, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 42, 3, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 38, 21, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 15, 11, textureX, textureY); // Box 49
		bodyModel[33] = new ModelRendererTurbo(this, 17, 35, textureX, textureY); // Box 65
		bodyModel[34] = new ModelRendererTurbo(this, 67, 11, textureX, textureY); // Box 67
		bodyModel[35] = new ModelRendererTurbo(this, 6, 37, textureX, textureY); // Box 68
		bodyModel[36] = new ModelRendererTurbo(this, 69, 5, textureX, textureY); // Box 72
		bodyModel[37] = new ModelRendererTurbo(this, 69, 19, textureX, textureY); // Box 74
		bodyModel[38] = new ModelRendererTurbo(this, 72, 25, textureX, textureY); // Box 75
		bodyModel[39] = new ModelRendererTurbo(this, 32, 37, textureX, textureY); // Box 81
		bodyModel[40] = new ModelRendererTurbo(this, 43, 40, textureX, textureY); // Box 82
		bodyModel[41] = new ModelRendererTurbo(this, 78, 14, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 80, 8, textureX, textureY); // Box 84
		bodyModel[43] = new ModelRendererTurbo(this, 80, 22, textureX, textureY); // Box 86
		bodyModel[44] = new ModelRendererTurbo(this, 83, 28, textureX, textureY); // Box 87
		bodyModel[45] = new ModelRendererTurbo(this, 167, 52, textureX, textureY); // Box 88
		bodyModel[46] = new ModelRendererTurbo(this, 79, 35, textureX, textureY); // Box 89
		bodyModel[47] = new ModelRendererTurbo(this, 94, 37, textureX, textureY); // Box 91
		bodyModel[48] = new ModelRendererTurbo(this, 63, 40, textureX, textureY); // Box 92
		bodyModel[49] = new ModelRendererTurbo(this, 68, 37, textureX, textureY); // Box 93
		bodyModel[50] = new ModelRendererTurbo(this, 107, 11, textureX, textureY); // Box 94
		bodyModel[51] = new ModelRendererTurbo(this, 109, 5, textureX, textureY); // Box 96
		bodyModel[52] = new ModelRendererTurbo(this, 109, 19, textureX, textureY); // Box 97
		bodyModel[53] = new ModelRendererTurbo(this, 112, 25, textureX, textureY); // Box 98
		bodyModel[54] = new ModelRendererTurbo(this, 119, 21, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 118, 13, textureX, textureY); // Box 101
		bodyModel[57] = new ModelRendererTurbo(this, 38, 6, textureX, textureY); // Box 104
		bodyModel[58] = new ModelRendererTurbo(this, 37, 13, textureX, textureY); // Box 105
		bodyModel[59] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 121
		bodyModel[60] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 122
		bodyModel[61] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 123
		bodyModel[62] = new ModelRendererTurbo(this, 67, 98, textureX, textureY); // Box 124
		bodyModel[63] = new ModelRendererTurbo(this, 68, 98, textureX, textureY); // Box 125
		bodyModel[64] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 131
		bodyModel[65] = new ModelRendererTurbo(this, 78, 102, textureX, textureY); // Box 133
		bodyModel[66] = new ModelRendererTurbo(this, 2, 62, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 1, 72, textureX, textureY); // Box 136
		bodyModel[68] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 137
		bodyModel[69] = new ModelRendererTurbo(this, 2, 59, textureX, textureY); // Box 139
		bodyModel[70] = new ModelRendererTurbo(this, 70, 102, textureX, textureY); // Box 140
		bodyModel[71] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 141
		bodyModel[72] = new ModelRendererTurbo(this, 68, 98, textureX, textureY); // Box 142
		bodyModel[73] = new ModelRendererTurbo(this, 126, 117, textureX, textureY); // Box 143
		bodyModel[74] = new ModelRendererTurbo(this, 128, 113, textureX, textureY); // Box 144
		bodyModel[75] = new ModelRendererTurbo(this, 126, 122, textureX, textureY); // Box 145
		bodyModel[76] = new ModelRendererTurbo(this, 68, 98, textureX, textureY); // Box 146
		bodyModel[77] = new ModelRendererTurbo(this, 48, 40, textureX, textureY); // Box 147
		bodyModel[78] = new ModelRendererTurbo(this, 53, 40, textureX, textureY); // Box 148
		bodyModel[79] = new ModelRendererTurbo(this, 73, 2, textureX, textureY); // Box 149
		bodyModel[80] = new ModelRendererTurbo(this, 1, 40, textureX, textureY); // Box 150
		bodyModel[81] = new ModelRendererTurbo(this, 83, 5, textureX, textureY); // Box 151
		bodyModel[82] = new ModelRendererTurbo(this, 105, 40, textureX, textureY); // Box 152
		bodyModel[83] = new ModelRendererTurbo(this, 112, 2, textureX, textureY); // Box 153
		bodyModel[84] = new ModelRendererTurbo(this, 48, 33, textureX, textureY); // Box 154
		bodyModel[85] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 155
		bodyModel[86] = new ModelRendererTurbo(this, 37, 72, textureX, textureY); // Box 156
		bodyModel[87] = new ModelRendererTurbo(this, 38, 66, textureX, textureY); // Box 157
		bodyModel[88] = new ModelRendererTurbo(this, 38, 69, textureX, textureY); // Box 158
		bodyModel[89] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 159
		bodyModel[90] = new ModelRendererTurbo(this, 41, 63, textureX, textureY); // Box 160
		bodyModel[91] = new ModelRendererTurbo(this, 80, 58, textureX, textureY); // Box 162
		bodyModel[92] = new ModelRendererTurbo(this, 67, 98, textureX, textureY); // Box 164
		bodyModel[93] = new ModelRendererTurbo(this, 68, 98, textureX, textureY); // Box 165
		bodyModel[94] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 166
		bodyModel[95] = new ModelRendererTurbo(this, 78, 102, textureX, textureY); // Box 167
		bodyModel[96] = new ModelRendererTurbo(this, 68, 98, textureX, textureY); // Box 168
		bodyModel[97] = new ModelRendererTurbo(this, 68, 98, textureX, textureY); // Box 169
		bodyModel[98] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 170
		bodyModel[99] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 171
		bodyModel[100] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 172
		bodyModel[101] = new ModelRendererTurbo(this, 70, 102, textureX, textureY); // Box 173
		bodyModel[102] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 174
		bodyModel[103] = new ModelRendererTurbo(this, 66, 98, textureX, textureY); // Box 175
		bodyModel[104] = new ModelRendererTurbo(this, 124, 63, textureX, textureY); // Box 176
		bodyModel[105] = new ModelRendererTurbo(this, 124, 66, textureX, textureY); // Box 177
		bodyModel[106] = new ModelRendererTurbo(this, 124, 69, textureX, textureY); // Box 178
		bodyModel[107] = new ModelRendererTurbo(this, 81, 62, textureX, textureY); // Box 180
		bodyModel[108] = new ModelRendererTurbo(this, 129, 72, textureX, textureY); // Box 181
		bodyModel[109] = new ModelRendererTurbo(this, 124, 72, textureX, textureY); // Box 182
		bodyModel[110] = new ModelRendererTurbo(this, 142, 72, textureX, textureY); // Box 183
		bodyModel[111] = new ModelRendererTurbo(this, 155, 72, textureX, textureY); // Box 184
		bodyModel[112] = new ModelRendererTurbo(this, 147, 69, textureX, textureY); // Box 185
		bodyModel[113] = new ModelRendererTurbo(this, 147, 66, textureX, textureY); // Box 186
		bodyModel[114] = new ModelRendererTurbo(this, 143, 63, textureX, textureY); // Box 187
		bodyModel[115] = new ModelRendererTurbo(this, 139, 85, textureX, textureY); // Box 190 bumper rear
		bodyModel[116] = new ModelRendererTurbo(this, 115, 82, textureX, textureY); // Box 191 bumper rear
		bodyModel[117] = new ModelRendererTurbo(this, 111, 100, textureX, textureY); // Box 192 plate rear
		bodyModel[118] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 193
		bodyModel[119] = new ModelRendererTurbo(this, 94, 121, textureX, textureY); // Box 194 exhausting fr this time
		bodyModel[120] = new ModelRendererTurbo(this, 101, 78, textureX, textureY); // Box 196 bumper rear
		bodyModel[121] = new ModelRendererTurbo(this, 126, 83, textureX, textureY); // Box 197 bumper rear
		bodyModel[122] = new ModelRendererTurbo(this, 131, 77, textureX, textureY); // Box 199
		bodyModel[123] = new ModelRendererTurbo(this, 124, 76, textureX, textureY); // Box 200
		bodyModel[124] = new ModelRendererTurbo(this, 136, 76, textureX, textureY); // Box 201
		bodyModel[125] = new ModelRendererTurbo(this, 68, 112, textureX, textureY); // Box 202 exhaust muffler system
		bodyModel[126] = new ModelRendererTurbo(this, 81, 72, textureX, textureY); // Box 203
		bodyModel[127] = new ModelRendererTurbo(this, 76, 72, textureX, textureY); // Box 204
		bodyModel[128] = new ModelRendererTurbo(this, 112, 72, textureX, textureY); // Box 205
		bodyModel[129] = new ModelRendererTurbo(this, 29, 68, textureX, textureY); // Box 206
		bodyModel[130] = new ModelRendererTurbo(this, 80, 67, textureX, textureY); // Box 207
		bodyModel[131] = new ModelRendererTurbo(this, 46, 91, textureX, textureY); // Box 211
		bodyModel[132] = new ModelRendererTurbo(this, 142, 58, textureX, textureY); // Box 212
		bodyModel[133] = new ModelRendererTurbo(this, 142, 58, textureX, textureY); // Box 213
		bodyModel[134] = new ModelRendererTurbo(this, 140, 19, textureX, textureY); // Box 197
		bodyModel[135] = new ModelRendererTurbo(this, 140, 4, textureX, textureY); // Box 198
		bodyModel[136] = new ModelRendererTurbo(this, 139, 11, textureX, textureY); // Box 199
		bodyModel[137] = new ModelRendererTurbo(this, 140, 21, textureX, textureY); // Box 200
		bodyModel[138] = new ModelRendererTurbo(this, 140, 14, textureX, textureY); // Box 201
		bodyModel[139] = new ModelRendererTurbo(this, 124, 58, textureX, textureY); // Box 202
		bodyModel[140] = new ModelRendererTurbo(this, 148, 13, textureX, textureY); // Box 203 factory spoiler
		bodyModel[141] = new ModelRendererTurbo(this, 149, 6, textureX, textureY); // Box 204 factory spoiler
		bodyModel[142] = new ModelRendererTurbo(this, 149, 21, textureX, textureY); // Box 205 factory spoiler
		bodyModel[143] = new ModelRendererTurbo(this, 131, 52, textureX, textureY, "brakeLight"); // Box 206 brake light
		bodyModel[144] = new ModelRendererTurbo(this, 150, 52, textureX, textureY, "brakeLight"); // Box 207 brake light
		bodyModel[145] = new ModelRendererTurbo(this, 145, 52, textureX, textureY, "brakeLight"); // Box 208 brake light
		bodyModel[146] = new ModelRendererTurbo(this, 140, 52, textureX, textureY, "brakeLight"); // Box 209 brake light
		bodyModel[147] = new ModelRendererTurbo(this, 140, 55, textureX, textureY, "reverseLight"); // Box 210 reverse light
		bodyModel[148] = new ModelRendererTurbo(this, 145, 55, textureX, textureY, "reverseLight"); // Box 211 reverse light
		bodyModel[149] = new ModelRendererTurbo(this, 159, 55, textureX, textureY, "rightTurnLight"); // Box 212 turn signal R
		bodyModel[150] = new ModelRendererTurbo(this, 159, 52, textureX, textureY, "rightTurnLight"); // Box 213 turn signal R
		bodyModel[151] = new ModelRendererTurbo(this, 124, 55, textureX, textureY, "leftTurnLight"); // Box 214 turn signal L
		bodyModel[152] = new ModelRendererTurbo(this, 124, 52, textureX, textureY, "leftTurnLight"); // Box 214 turn signal L
		bodyModel[153] = new ModelRendererTurbo(this, 34, 32, textureX, textureY); // Box 216
		bodyModel[154] = new ModelRendererTurbo(this, 26, 32, textureX, textureY); // Box 217
		bodyModel[155] = new ModelRendererTurbo(this, 148, 1, textureX, textureY, "brakeLight"); // Box 218 brake light
		bodyModel[156] = new ModelRendererTurbo(this, 31, 31, textureX, textureY); // Box 219
		bodyModel[157] = new ModelRendererTurbo(this, 23, 31, textureX, textureY); // Box 220
		bodyModel[158] = new ModelRendererTurbo(this, 58, 40, textureX, textureY); // Box 221
		bodyModel[159] = new ModelRendererTurbo(this, 58, 33, textureX, textureY); // Box 222
		bodyModel[160] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 223
		bodyModel[161] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 224
		bodyModel[162] = new ModelRendererTurbo(this, 12, 31, textureX, textureY); // Box 225
		bodyModel[163] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 226
		bodyModel[164] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Box 227
		bodyModel[165] = new ModelRendererTurbo(this, 12, 31, textureX, textureY); // Box 228
		bodyModel[166] = new ModelRendererTurbo(this, 25, 14, textureX, textureY); // Box 229
		bodyModel[167] = new ModelRendererTurbo(this, 1, 12, textureX, textureY, "lamp"); // Box 230 headlight
		bodyModel[168] = new ModelRendererTurbo(this, 1, 48, textureX, textureY); // Box 232 FOLDED PART FIX IT STUPID
		bodyModel[169] = new ModelRendererTurbo(this, 10, 48, textureX, textureY); // Box 233
		bodyModel[170] = new ModelRendererTurbo(this, 6, 87, textureX, textureY); // Box 234 bumper curved
		bodyModel[171] = new ModelRendererTurbo(this, 114, 48, textureX, textureY); // Box 235 FOLDED PART FIX IT STUPID
		bodyModel[172] = new ModelRendererTurbo(this, 97, 48, textureX, textureY); // Box 236
		bodyModel[173] = new ModelRendererTurbo(this, 1, 16, textureX, textureY, "lamp"); // Box 237 headlight
		bodyModel[174] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 238
		bodyModel[175] = new ModelRendererTurbo(this, 24, 28, textureX, textureY); // Box 239
		bodyModel[176] = new ModelRendererTurbo(this, 20, 14, textureX, textureY, "rightTurnLight"); // Box 240 turnlight R
		bodyModel[177] = new ModelRendererTurbo(this, 20, 17, textureX, textureY, "rightTurnLight"); // Box 241 turnlight R
		bodyModel[178] = new ModelRendererTurbo(this, 15, 14, textureX, textureY, "leftTurnLight"); // Box 244 turnlight L
		bodyModel[179] = new ModelRendererTurbo(this, 15, 17, textureX, textureY, "leftTurnLight"); // Box 245 turnlight L
		bodyModel[180] = new ModelRendererTurbo(this, 8, 76, textureX, textureY); // Box 251
		bodyModel[181] = new ModelRendererTurbo(this, 21, 80, textureX, textureY); // Box 254
		bodyModel[182] = new ModelRendererTurbo(this, 21, 76, textureX, textureY); // Box 258
		bodyModel[183] = new ModelRendererTurbo(this, 3, 80, textureX, textureY); // Box 259
		bodyModel[184] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 260
		bodyModel[185] = new ModelRendererTurbo(this, 78, 102, textureX, textureY); // Box 261
		bodyModel[186] = new ModelRendererTurbo(this, 77, 87, textureX, textureY); // Box 262
		bodyModel[187] = new ModelRendererTurbo(this, 20, 97, textureX, textureY, "leftTurnLight"); // Box 263 bumper orange light curved
		bodyModel[188] = new ModelRendererTurbo(this, 20, 97, textureX, textureY, "rightTurnLight"); // Box 264 bumper orange light curved
		bodyModel[189] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 265
		bodyModel[190] = new ModelRendererTurbo(this, 34, 106, textureX, textureY); // Box 266
		bodyModel[191] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 267
		bodyModel[192] = new ModelRendererTurbo(this, 101, 118, textureX, textureY); // Box 268
		bodyModel[193] = new ModelRendererTurbo(this, 71, 118, textureX, textureY); // Box 269
		bodyModel[194] = new ModelRendererTurbo(this, 84, 118, textureX, textureY); // Box 270
		bodyModel[195] = new ModelRendererTurbo(this, 84, 118, textureX, textureY); // Box 271
		bodyModel[196] = new ModelRendererTurbo(this, 67, 3, textureX, textureY); // Box 272 antenna (high trim)
		bodyModel[197] = new ModelRendererTurbo(this, 70, 2, textureX, textureY); // Box 273 antenna (low trim)
		bodyModel[198] = new ModelRendererTurbo(this, 1, 97, textureX, textureY, "ditch"); // Box 202 headlight RALLEY
		bodyModel[199] = new ModelRendererTurbo(this, 1, 97, textureX, textureY, "ditch"); // Box 203 headlight RALLEY
		bodyModel[200] = new ModelRendererTurbo(this, 8, 97, textureX, textureY, "ditch"); // Box 204 headlight RALLEY
		bodyModel[201] = new ModelRendererTurbo(this, 8, 97, textureX, textureY, "ditch"); // Box 205 headlight RALLEY
		bodyModel[202] = new ModelRendererTurbo(this, 51, 98, textureX, textureY, "ditch"); // Box 206 headlight RALLEY
		bodyModel[203] = new ModelRendererTurbo(this, 51, 98, textureX, textureY, "ditch"); // Box 207 headlight RALLEY
		bodyModel[204] = new ModelRendererTurbo(this, 64, 1, textureX, textureY); // Box 208 antenna RALLEY
		bodyModel[205] = new ModelRendererTurbo(this, 163, 35, textureX, textureY); // Box 223
		bodyModel[206] = new ModelRendererTurbo(this, 166, 24, textureX, textureY); // Box 224
		bodyModel[207] = new ModelRendererTurbo(this, 184, 35, textureX, textureY); // Box 211
		bodyModel[208] = new ModelRendererTurbo(this, 187, 24, textureX, textureY); // Box 212
		bodyModel[209] = new ModelRendererTurbo(this, 204, 43, textureX, textureY); // Box 218
		bodyModel[210] = new ModelRendererTurbo(this, 202, 49, textureX, textureY); // Box 219
		bodyModel[211] = new ModelRendererTurbo(this, 113, 69, textureX, textureY); // Box 215
		bodyModel[212] = new ModelRendererTurbo(this, 113, 66, textureX, textureY); // Box 216
		bodyModel[213] = new ModelRendererTurbo(this, 138, 63, textureX, textureY); // Box 217
		bodyModel[214] = new ModelRendererTurbo(this, 138, 63, textureX, textureY); // Box 218
		bodyModel[215] = new ModelRendererTurbo(this, 202, 54, textureX, textureY); // Box 219
		bodyModel[216] = new ModelRendererTurbo(this, 163, 43, textureX, textureY); // Box 220
		bodyModel[217] = new ModelRendererTurbo(this, 173, 68, textureX, textureY); // Box 226 steeringwhool
		bodyModel[218] = new ModelRendererTurbo(this, 173, 71, textureX, textureY); // Box 227 steering wheel supporter
		bodyModel[219] = new ModelRendererTurbo(this, 184, 43, textureX, textureY); // Box 223
		bodyModel[220] = new ModelRendererTurbo(this, 165, 81, textureX, textureY); // Box 224
		bodyModel[221] = new ModelRendererTurbo(this, 186, 79, textureX, textureY); // Box 226
		bodyModel[222] = new ModelRendererTurbo(this, 186, 75, textureX, textureY); // Box 227 holy shift
		bodyModel[223] = new ModelRendererTurbo(this, 167, 56, textureX, textureY); // Box 228
		bodyModel[224] = new ModelRendererTurbo(this, 191, 74, textureX, textureY); // Box 229
		bodyModel[225] = new ModelRendererTurbo(this, 104, 92, textureX, textureY); // Box 230
		bodyModel[226] = new ModelRendererTurbo(this, 167, 28, textureX, textureY, "lamp"); // Box 231 GAUGES N DETAILS
		bodyModel[227] = new ModelRendererTurbo(this, 167, 66, textureX, textureY, "cull"); // Box 232 cull gauge cover
		bodyModel[228] = new ModelRendererTurbo(this, 183, 64, textureX, textureY); // Box 233
		bodyModel[229] = new ModelRendererTurbo(this, 176, 64, textureX, textureY); // Box 234
		bodyModel[230] = new ModelRendererTurbo(this, 145, 86, textureX, textureY); // Box 235
		bodyModel[231] = new ModelRendererTurbo(this, 5, 93, textureX, textureY, "ditch"); // Box 236 foglight
		bodyModel[232] = new ModelRendererTurbo(this, 5, 93, textureX, textureY, "ditch"); // Box 237 foglight
		bodyModel[233] = new ModelRendererTurbo(this, 22, 97, textureX, textureY); // Box 238 bumper square
		bodyModel[234] = new ModelRendererTurbo(this, 39, 98, textureX, textureY); // Box 240 bumper square
		bodyModel[235] = new ModelRendererTurbo(this, 34, 98, textureX, textureY, "leftTurnLight"); // Box 241 bumper orange light square
		bodyModel[236] = new ModelRendererTurbo(this, 34, 98, textureX, textureY, "rightTurnLight"); // Box 242 bumper orange light square
		bodyModel[237] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 241
		bodyModel[238] = new ModelRendererTurbo(this, 62, 51, textureX, textureY); // Box 242
		bodyModel[239] = new ModelRendererTurbo(this, 150, 44, textureX, textureY); // Box 239 4wd turbo logo

		bodyModel[0].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[0].setRotationPoint(-10.5F, 7F, -8F);

		bodyModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[1].setRotationPoint(-10.5F, 7F, -8F);

		bodyModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[2].setRotationPoint(-10.5F, 7F, -8F);

		bodyModel[3].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[3].setRotationPoint(-10.5F, 7F, -8F);

		bodyModel[4].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[4].setRotationPoint(-10.5F, 7F, 8F);

		bodyModel[5].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[5].setRotationPoint(-10.5F, 7F, 8F);

		bodyModel[6].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[6].setRotationPoint(-10.5F, 7F, 8F);

		bodyModel[7].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[7].setRotationPoint(-10.5F, 7F, 8F);

		bodyModel[8].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle 1-2
		bodyModel[8].setRotationPoint(-10.5F, 7F, 0F);

		bodyModel[9].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
		bodyModel[9].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[10].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
		bodyModel[10].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[11].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
		bodyModel[11].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[12].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel3
		bodyModel[12].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[13].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
		bodyModel[13].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[14].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
		bodyModel[14].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[15].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
		bodyModel[15].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[16].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel4
		bodyModel[16].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[17].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle 3-4
		bodyModel[17].setRotationPoint(12.5F, 7F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[18].setRotationPoint(-6F, 6F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 22
		bodyModel[19].setRotationPoint(-6F, 3.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
		bodyModel[20].setRotationPoint(-17F, 1.75F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 31 bumper center
		bodyModel[21].setRotationPoint(-19F, 4.75F, -3.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 32 bumper curved
		bodyModel[22].setRotationPoint(-19F, 4.75F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, -1F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -1F, -0.25F, 0.25F); // Box 34 bumper curved
		bodyModel[23].setRotationPoint(-19F, 4.75F, -9.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 37 bumper rear
		bodyModel[24].setRotationPoint(21F, 4.25F, -9F);

		bodyModel[25].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 106 plate front
		bodyModel[25].setRotationPoint(-19.26F, 6.75F, 2F);
		bodyModel[25].rotateAngleY = -3.14159265F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, -0.25F, -0.25F); // Box 41 bumper curved
		bodyModel[26].setRotationPoint(-19F, 4.75F, 3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,-0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -0.25F, -2F, -0.25F); // Box 42 grille
		bodyModel[27].setRotationPoint(-18.5F, 2.5F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, -1F, 8, 1, 1, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 43
		bodyModel[28].setRotationPoint(-18.25F, 3.75F, -4F);
		bodyModel[28].rotateAngleY = 1.57079633F;

		bodyModel[29].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0.75F, -0.75F, -0.25F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.5F, -0.75F, -0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, -0.25F); // Box 45
		bodyModel[29].setRotationPoint(-18.25F, 3.75F, -8F);
		bodyModel[29].rotateAngleY = 1.57079633F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.375F); // Box 46
		bodyModel[30].setRotationPoint(-17F, 1.75F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 48
		bodyModel[31].setRotationPoint(-17F, 1.75F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, -1F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 49
		bodyModel[32].setRotationPoint(-18F, 1.75F, -4F);
		bodyModel[32].rotateAngleY = 1.57079633F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[33].setRotationPoint(-8F, -3.5F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[34].setRotationPoint(-3F, -4.5F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[35].setRotationPoint(-8F, -3.5F, 3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 72
		bodyModel[36].setRotationPoint(-3F, -4.5F, 3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[37].setRotationPoint(-3F, -4.5F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -1F, -0.5F, -0.5F, -0.75F, -0.625F, -0.5F, -0.25F, 0F, 0F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[38].setRotationPoint(-2.5F, -4.5F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-5.5F, 0F, 0F, 5.5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		bodyModel[39].setRotationPoint(-8F, -3.5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-5.5F, 0F, -0.5F, 5.5F, 0F, -0.5F, 5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 82
		bodyModel[40].setRotationPoint(-7.5F, -3.5F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[41].setRotationPoint(-1F, -4.5F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[42].setRotationPoint(-1F, -4.5F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[43].setRotationPoint(-1F, -4.5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[44].setRotationPoint(-1F, -4.5F, -8F);

		bodyModel[45].addBox(0F, 0F, -1F, 16, 2, 1, 0F); // Box 88
		bodyModel[45].setRotationPoint(-7F, 1.5F, -8F);
		bodyModel[45].rotateAngleY = 1.57079633F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 89
		bodyModel[46].setRotationPoint(16F, -3.5F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5.5F, 0F, 0F, 5.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[47].setRotationPoint(16F, -3.5F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 92
		bodyModel[48].setRotationPoint(15.5F, -3.5F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,5.5F, 0F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 93
		bodyModel[49].setRotationPoint(16F, -3.5F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[50].setRotationPoint(10F, -4.5F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[51].setRotationPoint(10F, -4.5F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[52].setRotationPoint(10F, -4.5F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.75F, -0.625F, -0.5F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 98
		bodyModel[53].setRotationPoint(9.5F, -4.5F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 99
		bodyModel[54].setRotationPoint(15F, 1.5F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[55].setRotationPoint(15F, 1.5F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 101
		bodyModel[56].setRotationPoint(15F, 1.5F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
		bodyModel[57].setRotationPoint(-17F, 1.75F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 105
		bodyModel[58].setRotationPoint(-17F, 1.75F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 121
		bodyModel[59].setRotationPoint(11F, 2.5F, -9.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -2.5F, 0F, 0.5F, -2.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F); // Box 122
		bodyModel[60].setRotationPoint(14F, 2.5F, -9.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2.75F, 0F, 0F, -1F, 0F, -0.25F, -0.5F, -0.5F, 0.25F, -2.25F, -0.5F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.75F, -0.5F); // Box 123
		bodyModel[61].setRotationPoint(9.5F, 2.5F, -9.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 124
		bodyModel[62].setRotationPoint(-12F, 2.5F, -9.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -2.5F, 0F, 0.5F, -2.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F); // Box 125
		bodyModel[63].setRotationPoint(-9F, 2.5F, -9.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, -3F, -4.5F, 0F, -3F, -4.5F, -1F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, -3F, 3.5F, 0F, -3F, 3.5F, -1F, 0F, 0F, -0.5F); // Box 131
		bodyModel[64].setRotationPoint(-7F, 4F, -9.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 133
		bodyModel[65].setRotationPoint(-8F, 5F, -8.75F);

		bodyModel[66].addShapeBox(0F, 0F, -1F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 135
		bodyModel[66].setRotationPoint(-7F, 4.5F, -9F);
		bodyModel[66].rotateAngleY = 1.57079633F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 136
		bodyModel[67].setRotationPoint(-7F, 6F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, -2F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 137
		bodyModel[68].setRotationPoint(-9F, 3.5F, -9F);
		bodyModel[68].rotateAngleY = 1.57079633F;

		bodyModel[69].addShapeBox(0F, 0F, -1F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 139
		bodyModel[69].setRotationPoint(-7F, 3.5F, -9F);
		bodyModel[69].rotateAngleY = 1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 140
		bodyModel[70].setRotationPoint(15F, 5F, -8.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, -3F, -4.5F, 0F, -3F, -4.5F, -1F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, -3F, 3.5F, 0F, -3F, 3.5F, -1F, 0F, 0F, -0.5F); // Box 141
		bodyModel[71].setRotationPoint(16F, 4F, -9.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2.5F, 0F, 0F, -1F, 0F, -0.25F, -0.5F, -0.5F, 0.5F, -2.25F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F); // Box 142
		bodyModel[72].setRotationPoint(-14F, 2.5F, -9.25F);

		bodyModel[73].addShapeBox(0F, 0F, -3F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 143
		bodyModel[73].setRotationPoint(-17F, 3.5F, -9F);
		bodyModel[73].rotateAngleY = 1.57079633F;

		bodyModel[74].addShapeBox(0F, 0F, -2F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 144
		bodyModel[74].setRotationPoint(-14F, 3.5F, -9F);
		bodyModel[74].rotateAngleY = 1.57079633F;

		bodyModel[75].addShapeBox(0F, 0F, -3F, 18, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F); // Box 145
		bodyModel[75].setRotationPoint(-17F, 4.5F, -9F);
		bodyModel[75].rotateAngleY = 1.57079633F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.5F, -2.5F, 0F, 0F, -1F, 0F, -0.5F, -0.75F, -0.5F, -1F, -2.25F, -0.5F, -1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 1.5F, -0.5F); // Box 146
		bodyModel[76].setRotationPoint(-16F, 4F, -9.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, -1F, 1F, 0F, -1F); // Box 147
		bodyModel[77].setRotationPoint(3.25F, -3.5F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, -1F, -1.75F, 0F, -1F); // Box 148
		bodyModel[78].setRotationPoint(8.25F, -3.5F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, -0.625F, -0.5F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[79].setRotationPoint(-2.5F, -4.5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 150
		bodyModel[80].setRotationPoint(-7.5F, -3.5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 151
		bodyModel[81].setRotationPoint(-1F, -4.5F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,5F, 0F, 0F, -5F, 0F, 0F, -5.5F, 0F, -0.5F, 5.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 152
		bodyModel[82].setRotationPoint(15.5F, -3.5F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -1F, 0F, -0.5F, -1F, -0.5F, -0.5F, -0.75F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 153
		bodyModel[83].setRotationPoint(9.5F, -4.5F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 154
		bodyModel[84].setRotationPoint(3.25F, -3.5F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.75F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0.5F, -1.75F, 0F, 0.5F); // Box 155
		bodyModel[85].setRotationPoint(8.25F, -3.5F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[86].setRotationPoint(8F, 6F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[87].setRotationPoint(9F, 4.5F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[88].setRotationPoint(9F, 3.5F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.5F, -2.5F, -0.25F, 0F, -1.25F, 0F, -0.25F, -0.75F, -0.5F, -1F, -2.25F, -0.5F, -1.5F, 1.5F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -1.5F, 1.5F, -0.5F); // Box 159
		bodyModel[89].setRotationPoint(7.5F, 4F, -9.25F);

		bodyModel[90].addShapeBox(0F, 0F, -1F, 18, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[90].setRotationPoint(9F, 5.5F, -9F);
		bodyModel[90].rotateAngleY = 1.57079633F;

		bodyModel[91].addShapeBox(0F, 0F, -2F, 18, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 162
		bodyModel[91].setRotationPoint(14.5F, 3.5F, -9F);
		bodyModel[91].rotateAngleY = 1.57079633F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[92].setRotationPoint(-12F, 2.5F, 8.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0.5F, -2.25F, -0.5F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[93].setRotationPoint(-9F, 2.5F, 8.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.75F, -0.5F, -3F, -4.5F, -1F, -3F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -3F, 3.5F, -1F, -3F, 3.5F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[94].setRotationPoint(-7F, 4F, 8.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0.5F, -2F, -0.5F, 0.5F); // Box 167
		bodyModel[95].setRotationPoint(-8F, 5F, 5.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, -2.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 168
		bodyModel[96].setRotationPoint(-14F, 2.5F, 8.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -2.25F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -1F, 0F, -1.5F, -2.5F, 0F, -1.5F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 1.5F, 0F); // Box 169
		bodyModel[97].setRotationPoint(-16F, 4F, 8.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 170
		bodyModel[98].setRotationPoint(11F, 2.5F, 8.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0.5F, -2.25F, -0.5F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[99].setRotationPoint(14F, 2.5F, 8.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, -2.25F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.75F, 0F); // Box 172
		bodyModel[100].setRotationPoint(9.5F, 2.5F, 8.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0.5F, -2F, -0.5F, 0.5F); // Box 173
		bodyModel[101].setRotationPoint(15F, 5F, 5.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.75F, -0.5F, -3F, -4.5F, -1F, -3F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, -3F, 3.5F, -1F, -3F, 3.5F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[102].setRotationPoint(16F, 4F, 8.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -2.25F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, -1.25F, 0F, -1.5F, -2.5F, -0.25F, -1.5F, 1.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -1.5F, 1.5F, -0.25F); // Box 175
		bodyModel[103].setRotationPoint(7.5F, 4F, 8.25F);

		bodyModel[104].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 176
		bodyModel[104].setRotationPoint(16F, 3.5F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 177
		bodyModel[105].setRotationPoint(17F, 4.5F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[106].setRotationPoint(17F, 5.5F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, -1F, 18, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 180
		bodyModel[107].setRotationPoint(15.5F, 4.5F, -9F);
		bodyModel[107].rotateAngleY = 1.57079633F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.625F, -0.5F, -1F, -0.625F, -0.5F, -1F, 0F, 0F, -0.25F, 0F); // Box 181
		bodyModel[108].setRotationPoint(17F, 6F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 182
		bodyModel[109].setRotationPoint(16F, 6F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.625F, 0F, -0.25F, -0.625F); // Box 183
		bodyModel[110].setRotationPoint(17F, 6F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -1F, -0.25F, -0.625F); // Box 184
		bodyModel[111].setRotationPoint(16F, 6F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[112].setRotationPoint(17F, 5.5F, 8F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 186
		bodyModel[113].setRotationPoint(17F, 4.5F, 8F);

		bodyModel[114].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 187
		bodyModel[114].setRotationPoint(16F, 3.5F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0.25F); // Box 190 bumper rear
		bodyModel[115].setRotationPoint(21F, 4.25F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 191 bumper rear
		bodyModel[116].setRotationPoint(21F, 4.25F, -2.5F);

		bodyModel[117].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 192 plate rear
		bodyModel[117].setRotationPoint(23.01F, 7F, -2F);

		bodyModel[118].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[118].setRotationPoint(22F, 5F, -2.5F);
		bodyModel[118].rotateAngleY = 1.57079633F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 194 exhausting fr this time
		bodyModel[119].setRotationPoint(20F, 6.75F, -4.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F); // Box 196 bumper rear
		bodyModel[120].setRotationPoint(21F, 4.25F, -8.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F); // Box 197 bumper rear
		bodyModel[121].setRotationPoint(21F, 4.25F, 2.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		bodyModel[122].setRotationPoint(21F, 6F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[123].setRotationPoint(21F, 6F, -8F);
		bodyModel[123].rotateAngleY = 1.57079633F;

		bodyModel[124].addShapeBox(0F, 0F, -1F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[124].setRotationPoint(21F, 6F, -3F);
		bodyModel[124].rotateAngleY = 1.57079633F;

		bodyModel[125].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 202 exhaust muffler system
		bodyModel[125].setRotationPoint(17F, 6.25F, -5.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 203
		bodyModel[126].setRotationPoint(-6F, 6F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -1F, 0F, -0.625F); // Box 204
		bodyModel[127].setRotationPoint(-7F, 6F, 8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 205
		bodyModel[128].setRotationPoint(8F, 6F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[129].setRotationPoint(-6F, 6.5F, -8F);

		bodyModel[130].addBox(0F, 0F, 0F, 15, 3, 1, 0F); // Box 207
		bodyModel[130].setRotationPoint(-6F, 3.5F, 8F);

		bodyModel[131].addBox(0F, 0F, -5F, 16, 1, 5, 0F); // Box 211
		bodyModel[131].setRotationPoint(17F, 5F, -8F);
		bodyModel[131].rotateAngleY = 1.57079633F;

		bodyModel[132].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 212
		bodyModel[132].setRotationPoint(11.25F, 3.51F, -9F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 0, 18, 0F); // Box 213
		bodyModel[133].setRotationPoint(-12F, 3.51F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[134].setRotationPoint(22F, 1.5F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[135].setRotationPoint(22F, 1.5F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[136].setRotationPoint(22F, 1.5F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[137].setRotationPoint(22F, 1.5F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201
		bodyModel[138].setRotationPoint(22F, 1.5F, 8F);

		bodyModel[139].addShapeBox(0F, 0F, -1F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[139].setRotationPoint(22F, 2.5F, -8F);
		bodyModel[139].rotateAngleY = 1.57079633F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 203 factory spoiler
		bodyModel[140].setRotationPoint(22F, 1F, -3F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 204 factory spoiler
		bodyModel[141].setRotationPoint(22F, 1F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 205 factory spoiler
		bodyModel[142].setRotationPoint(22F, 1F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 206 brake light
		bodyModel[143].setRotationPoint(22.05F, 2.5F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 207 brake light
		bodyModel[144].setRotationPoint(22.05F, 2.5F, 5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 208 brake light
		bodyModel[145].setRotationPoint(22.05F, 2.5F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 209 brake light
		bodyModel[146].setRotationPoint(22.05F, 2.5F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210 reverse light
		bodyModel[147].setRotationPoint(22.05F, 3F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211 reverse light
		bodyModel[148].setRotationPoint(22.05F, 3F, 4F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.625F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.05F, -0.625F, -0.5F, 0.05F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -0.5F, 0F, 0.05F); // Box 212 turn signal R
		bodyModel[149].setRotationPoint(21.05F, 3F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.875F, 0F, -0.2F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, -0.625F, 0F, 0.05F); // Box 213 turn signal R
		bodyModel[150].setRotationPoint(21.05F, 2.5F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.625F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 214 turn signal L
		bodyModel[151].setRotationPoint(21.05F, 3F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.625F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Box 214 turn signal L
		bodyModel[152].setRotationPoint(21.05F, 2.5F, -9F);

		bodyModel[153].addShapeBox(0F, -1F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 216
		bodyModel[153].setRotationPoint(-5.5F, 1F, 8.5F);
		bodyModel[153].rotateAngleX = 0.10471976F;

		bodyModel[154].addShapeBox(0F, -1F, -2F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 217
		bodyModel[154].setRotationPoint(-5.5F, 1F, -8.5F);
		bodyModel[154].rotateAngleX = -0.10471976F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 218 brake light
		bodyModel[155].setRotationPoint(15F, 0.5F, -1.5F);

		bodyModel[156].addShapeBox(0F, -0.5F, -1F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[156].setRotationPoint(-5.5F, 1F, 8.5F);
		bodyModel[156].rotateAngleX = 0.10471976F;

		bodyModel[157].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 220
		bodyModel[157].setRotationPoint(-5.5F, 1F, -8.5F);
		bodyModel[157].rotateAngleX = -0.10471976F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -4.75F, 0F, 0.5F, 4.5F, 0F, 0.5F, 5F, 0F, -1F, -4.75F, 0F, -1F); // Box 221
		bodyModel[158].setRotationPoint(9F, -3.5F, -8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -4.75F, 0F, -1F, 5F, 0F, -1F, 4.5F, 0F, 0.5F, -4.75F, 0F, 0.5F); // Box 222
		bodyModel[159].setRotationPoint(9F, -3.5F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 11, 5, 0, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 223
		bodyModel[160].setRotationPoint(-1F, -3.5F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-4.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, -4.5F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 224
		bodyModel[161].setRotationPoint(-6F, -3.5F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, -0.75F, -5F, 0F, -0.75F, -5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 225
		bodyModel[162].setRotationPoint(10F, -3.5F, -8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 11, 5, 0, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 226
		bodyModel[163].setRotationPoint(-1F, -3.5F, 8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-4.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -4.5F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 227
		bodyModel[164].setRotationPoint(-6F, -3.5F, 8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0.75F, -5F, 0F, 0.75F, -5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 228
		bodyModel[165].setRotationPoint(10F, -3.5F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0.375F, -0.75F, -0.5F, 0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0.375F, -0.25F, -0.5F); // Box 229
		bodyModel[166].setRotationPoint(-18F, 1.75F, -8F);
		bodyModel[166].rotateAngleY = 1.57079633F;

		bodyModel[167].addShapeBox(-5F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.75F, 0.375F, 0F, -1F, 0.625F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 230 headlight
		bodyModel[167].setRotationPoint(-18.5F, 2.5F, -9F);
		bodyModel[167].rotateAngleY = -1.57079633F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.375F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 232 FOLDED PART FIX IT STUPID
		bodyModel[168].setRotationPoint(-17F, 2.5F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.335F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[169].setRotationPoint(-14F, 2.5F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -0.25F, 0F, -1F, -1F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -1F, -0.25F, -1.25F); // Box 234 bumper curved
		bodyModel[170].setRotationPoint(-19F, 4.75F, 8.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.335F, 0F, 0F, -0.375F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.3F); // Box 235 FOLDED PART FIX IT STUPID
		bodyModel[171].setRotationPoint(-17F, 2.5F, 8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.335F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[172].setRotationPoint(-14F, 2.5F, 8F);

		bodyModel[173].addShapeBox(-5F, 0F, 0F, 4, 2, 1, 0F,0.375F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0.625F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 237 headlight
		bodyModel[173].setRotationPoint(-18.5F, 2.5F, 3F);
		bodyModel[173].rotateAngleY = -1.57079633F;

		bodyModel[174].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.375F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.25F, 0F, 0.625F, -0.25F, 0F, 0.375F, -0.25F, -0.5F, 0F, -0.25F, -0.25F); // Box 238
		bodyModel[174].setRotationPoint(-18F, 1.75F, 4F);
		bodyModel[174].rotateAngleY = 1.57079633F;

		bodyModel[175].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0.25F, -0.75F, 0F, 0.75F, -0.75F, -0.25F, 0.5F, -0.75F, -0.25F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.25F, 0F, 0F); // Box 239
		bodyModel[175].setRotationPoint(-18.25F, 3.75F, 4F);
		bodyModel[175].rotateAngleY = 1.57079633F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.3F, 0F, 0F, -0.35F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0.25F, 0F, -0.3F); // Box 240 turnlight R
		bodyModel[176].setRotationPoint(-17F, 2.5F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, 0F, 0F, -0.3F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0.25F, 0F, -0.25F); // Box 241 turnlight R
		bodyModel[177].setRotationPoint(-17.25F, 3.5F, 8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.35F, -0.25F, 0F, -0.3F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.3F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 244 turnlight L
		bodyModel[178].setRotationPoint(-17F, 2.5F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.3F, -0.25F, 0F, -0.15F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0.25F, 0F, 0F); // Box 245 turnlight L
		bodyModel[179].setRotationPoint(-17.25F, 3.5F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.1F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 251
		bodyModel[180].setRotationPoint(-17F, 7F, -4F);

		bodyModel[181].addShapeBox(0F, 0F, -1F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.625F, -1F, -0.5F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -0.625F, -1F, -0.5F); // Box 254
		bodyModel[181].setRotationPoint(-15.75F, 6F, -9F);
		bodyModel[181].rotateAngleY = 1.57079633F;

		bodyModel[182].addShapeBox(0F, 0F, -2F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 1.25F, -0.55F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.625F, 0F, -1.5F); // Box 258
		bodyModel[182].setRotationPoint(-16.75F, 6F, -9F);
		bodyModel[182].rotateAngleY = 1.57079633F;

		bodyModel[183].addShapeBox(0F, 0F, -1F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.625F, -1F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, -1F, -0.5F, 0F, -0.5F, 1F); // Box 259
		bodyModel[183].setRotationPoint(-15.75F, 6F, 4F);
		bodyModel[183].rotateAngleY = 1.57079633F;

		bodyModel[184].addShapeBox(0F, 0F, -2F, 5, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, -0.5F, 0.25F, -0.5F, -0.5F, 1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.625F, 0F, -1.5F, 0F, 0.5F, 0F); // Box 260
		bodyModel[184].setRotationPoint(-16.75F, 6F, 4F);
		bodyModel[184].rotateAngleY = 1.57079633F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[185].setRotationPoint(-15F, 3F, -4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[186].setRotationPoint(9F, 4.5F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.35F, -0.25F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263 bumper orange light curved
		bodyModel[187].setRotationPoint(-18.47F, 5F, -8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.35F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 264 bumper orange light curved
		bodyModel[188].setRotationPoint(-18.47F, 5F, 6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[189].setRotationPoint(-12F, 6F, -2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 266
		bodyModel[190].setRotationPoint(-4F, 6F, -1F);

		bodyModel[191].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 267
		bodyModel[191].setRotationPoint(11F, 6F, -1.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 5, 2, 7, 0F); // Box 268
		bodyModel[192].setRotationPoint(15F, 5.5F, -2F);

		bodyModel[193].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 269
		bodyModel[193].setRotationPoint(-8F, 6.75F, -3.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[194].setRotationPoint(9F, 6.75F, -3.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.75F, 0F); // Box 271
		bodyModel[195].setRotationPoint(13F, 6.75F, -3.5F);

		bodyModel[196].addShapeBox(-1F, -5F, 0.4F, 1, 5, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 272 antenna (high trim)
		bodyModel[196].setRotationPoint(-2F, -3F, -8F);
		bodyModel[196].rotateAngleZ = -1.09955743F;

		bodyModel[197].addShapeBox(-1F, 0F, 0F, 1, 6, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 273 antenna (low trim)
		bodyModel[197].setRotationPoint(-8F, -4F, 8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 202 headlight RALLEY
		bodyModel[198].setRotationPoint(-19.25F, 3F, 2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 203 headlight RALLEY
		bodyModel[199].setRotationPoint(-19.25F, 3F, -4F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 204 headlight RALLEY
		bodyModel[200].setRotationPoint(-19.5F, 5F, -5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 205 headlight RALLEY
		bodyModel[201].setRotationPoint(-19.5F, 5F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 206 headlight RALLEY
		bodyModel[202].setRotationPoint(-7.25F, -0.25F, 8F);
		bodyModel[202].rotateAngleY = -0.2268928F;

		bodyModel[203].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 207 headlight RALLEY
		bodyModel[203].setRotationPoint(-7.25F, -0.25F, -8F);
		bodyModel[203].rotateAngleY = 0.2268928F;

		bodyModel[204].addShapeBox(-1F, -9F, 0F, 1, 9, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 208 antenna RALLEY
		bodyModel[204].setRotationPoint(7F, -4F, 0F);
		bodyModel[204].rotateAngleZ = -0.55850536F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[205].setRotationPoint(-1F, 4F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 224
		bodyModel[206].setRotationPoint(3F, 0F, -7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[207].setRotationPoint(-1F, 4F, 1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 212
		bodyModel[208].setRotationPoint(3F, 0F, 1F);

		bodyModel[209].addShapeBox(0F, 0F, -1F, 14, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 218
		bodyModel[209].setRotationPoint(11.5F, 0F, -7F);
		bodyModel[209].rotateAngleY = 1.57079633F;

		bodyModel[210].addShapeBox(0F, 0F, -3F, 14, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[210].setRotationPoint(6.5F, 4F, -7F);
		bodyModel[210].rotateAngleY = 1.57079633F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[211].setRotationPoint(9F, 4.5F, 8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[212].setRotationPoint(9F, 3.5F, 8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 16, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 217
		bodyModel[213].setRotationPoint(11F, 3.5F, -8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F); // Box 218
		bodyModel[214].setRotationPoint(10F, 4.5F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, -3F, 14, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 219
		bodyModel[215].setRotationPoint(6.5F, 5F, -7F);
		bodyModel[215].rotateAngleY = 1.57079633F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 220
		bodyModel[216].setRotationPoint(-1F, 5F, -7F);

		bodyModel[217].addShapeBox(0F, -1.75F, -3.25F, 0, 6, 6, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F); // Box 226 steeringwhool
		bodyModel[217].setRotationPoint(-3.49F, 2F, -4F);
		bodyModel[217].rotateAngleZ = 0.29670597F;

		bodyModel[218].addBox(-4F, -0.5F, -0.5F, 4, 1, 1, 0F); // Box 227 steering wheel supporter
		bodyModel[218].setRotationPoint(-3.5F, 2F, -4F);
		bodyModel[218].rotateAngleZ = 0.29670597F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 223
		bodyModel[219].setRotationPoint(-1F, 5F, 1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[220].setRotationPoint(-6F, 4.5F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 226
		bodyModel[221].setRotationPoint(-3.5F, 3.5F, -1F);

		bodyModel[222].addShapeBox(-0.5F, -2F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 227 holy shift
		bodyModel[222].setRotationPoint(-2.5F, 4.1F, -0.5F);
		bodyModel[222].rotateAngleZ = -0.2268928F;

		bodyModel[223].addShapeBox(0F, 0F, -1F, 16, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[223].setRotationPoint(-6F, 1.5F, -8F);
		bodyModel[223].rotateAngleY = 1.57079633F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229
		bodyModel[224].setRotationPoint(-6F, 3F, -1F);

		bodyModel[225].addShapeBox(0F, 0F, -5F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 230
		bodyModel[225].setRotationPoint(10.5F, 3.5F, -6F);
		bodyModel[225].rotateAngleY = 1.57079633F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 0, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, -1F, -2.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, -16F, -1F, -2.5F, -16F); // Box 231 GAUGES N DETAILS
		bodyModel[226].setRotationPoint(-4.99F, 1.5F, -8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F); // Box 232 cull gauge cover
		bodyModel[227].setRotationPoint(-5F, 1F, -5.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 233
		bodyModel[228].setRotationPoint(-5F, 1F, -2.49F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 234
		bodyModel[229].setRotationPoint(-5F, 1F, -6.51F);

		bodyModel[230].addShapeBox(0F, 0F, -3F, 16, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 235
		bodyModel[230].setRotationPoint(12F, 1.5F, -8F);
		bodyModel[230].rotateAngleY = 1.57079633F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 236 foglight
		bodyModel[231].setRotationPoint(-18.5F, 6.5F, -5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 237 foglight
		bodyModel[232].setRotationPoint(-18.5F, 6.5F, 3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -0.25F, -0.25F); // Box 238 bumper square
		bodyModel[233].setRotationPoint(-19F, 4.75F, 3.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0.25F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 240 bumper square
		bodyModel[234].setRotationPoint(-19F, 4.75F, -8.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.35F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241 bumper orange light square
		bodyModel[235].setRotationPoint(-18.72F, 5F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.35F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242 bumper orange light square
		bodyModel[236].setRotationPoint(-18.72F, 5F, 6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[237].setRotationPoint(-7F, 1.5F, -9F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[238].setRotationPoint(-7F, 1.5F, 8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 239 4wd turbo logo
		bodyModel[239].setRotationPoint(23.01F, 2.9F, -3F);
	}
}