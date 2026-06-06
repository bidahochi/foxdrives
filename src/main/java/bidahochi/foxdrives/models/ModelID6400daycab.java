//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ID 6400
// Model Creator: bidahochi
// Created on: 16.07.2025 - 09:45:54
// Last changed on: 16.07.2025 - 09:45:54

package bidahochi.foxdrives.models; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelID6400daycab extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelID6400daycab() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[362];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 158, 110, textureX, textureY, "wheel"); // Box 125 wheel 3
		bodyModel[1] = new ModelRendererTurbo(this, 147, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[2] = new ModelRendererTurbo(this, 158, 116, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[3] = new ModelRendererTurbo(this, 158, 122, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[4] = new ModelRendererTurbo(this, 147, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[5] = new ModelRendererTurbo(this, 158, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[6] = new ModelRendererTurbo(this, 147, 106, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[7] = new ModelRendererTurbo(this, 158, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[8] = new ModelRendererTurbo(this, 202, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[9] = new ModelRendererTurbo(this, 191, 106, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[10] = new ModelRendererTurbo(this, 202, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[11] = new ModelRendererTurbo(this, 191, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[12] = new ModelRendererTurbo(this, 202, 116, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[13] = new ModelRendererTurbo(this, 202, 122, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[14] = new ModelRendererTurbo(this, 191, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[15] = new ModelRendererTurbo(this, 202, 110, textureX, textureY, "wheel"); // Box 125 wheel 4
		bodyModel[16] = new ModelRendererTurbo(this, 180, 110, textureX, textureY, "wheel"); // Box 125 wheel 3
		bodyModel[17] = new ModelRendererTurbo(this, 169, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[18] = new ModelRendererTurbo(this, 180, 116, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[19] = new ModelRendererTurbo(this, 180, 122, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[20] = new ModelRendererTurbo(this, 169, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[21] = new ModelRendererTurbo(this, 180, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[22] = new ModelRendererTurbo(this, 169, 106, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[23] = new ModelRendererTurbo(this, 180, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[24] = new ModelRendererTurbo(this, 224, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[25] = new ModelRendererTurbo(this, 213, 106, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[26] = new ModelRendererTurbo(this, 224, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[27] = new ModelRendererTurbo(this, 213, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[28] = new ModelRendererTurbo(this, 224, 116, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[29] = new ModelRendererTurbo(this, 224, 122, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[30] = new ModelRendererTurbo(this, 213, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[31] = new ModelRendererTurbo(this, 224, 110, textureX, textureY, "wheel"); // Box 125 wheel 4
		bodyModel[32] = new ModelRendererTurbo(this, 147, 99, textureX, textureY); // Box 124 axle 3-4
		bodyModel[33] = new ModelRendererTurbo(this, 148, 117, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[34] = new ModelRendererTurbo(this, 190, 99, textureX, textureY); // Box 124 axle 3-4
		bodyModel[35] = new ModelRendererTurbo(this, 170, 117, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[36] = new ModelRendererTurbo(this, 214, 117, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[37] = new ModelRendererTurbo(this, 188, 90, textureX, textureY); // Box 49 differing my rential
		bodyModel[38] = new ModelRendererTurbo(this, 188, 90, textureX, textureY); // Box 50 differing my rential
		bodyModel[39] = new ModelRendererTurbo(this, 192, 117, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[40] = new ModelRendererTurbo(this, 91, 123, textureX, textureY); // Box 64
		bodyModel[41] = new ModelRendererTurbo(this, 91, 123, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 138, 124, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 138, 124, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 245, 84, textureX, textureY); // Box 144 who up flappin they mud
		bodyModel[45] = new ModelRendererTurbo(this, 234, 84, textureX, textureY); // Box 146 who up flappin they mud
		bodyModel[46] = new ModelRendererTurbo(this, 201, 96, textureX, textureY); // Box 68
		bodyModel[47] = new ModelRendererTurbo(this, 248, 105, textureX, textureY, "brakeLight"); // Box 142 taillight R
		bodyModel[48] = new ModelRendererTurbo(this, 248, 105, textureX, textureY, "brakeLight"); // Box 141 taillight L
		bodyModel[49] = new ModelRendererTurbo(this, 253, 103, textureX, textureY, "leftTurnLight"); // Box 236 reverse light
		bodyModel[50] = new ModelRendererTurbo(this, 253, 103, textureX, textureY, "rightTurnLight"); // Box 237 reverse light
		bodyModel[51] = new ModelRendererTurbo(this, 30, 92, textureX, textureY); // Box 81 driveshaft 2
		bodyModel[52] = new ModelRendererTurbo(this, 259, 117, textureX, textureY); // Box 52 suspension airbag
		bodyModel[53] = new ModelRendererTurbo(this, 259, 117, textureX, textureY); // Box 53 suspension airbag
		bodyModel[54] = new ModelRendererTurbo(this, 254, 125, textureX, textureY, "cull"); // Box 55 cull suspension bit
		bodyModel[55] = new ModelRendererTurbo(this, 259, 123, textureX, textureY, "cull"); // Box 55 cull suspension bit
		bodyModel[56] = new ModelRendererTurbo(this, 254, 125, textureX, textureY, "cull"); // Box 56 cull suspension bit
		bodyModel[57] = new ModelRendererTurbo(this, 259, 123, textureX, textureY, "cull"); // Box 57 cull suspension bit
		bodyModel[58] = new ModelRendererTurbo(this, 259, 117, textureX, textureY); // Box 52 suspension airbag
		bodyModel[59] = new ModelRendererTurbo(this, 259, 117, textureX, textureY); // Box 53 suspension airbag
		bodyModel[60] = new ModelRendererTurbo(this, 254, 125, textureX, textureY, "cull"); // Box 55 cull suspension bit
		bodyModel[61] = new ModelRendererTurbo(this, 259, 123, textureX, textureY, "cull"); // Box 55 cull suspension bit
		bodyModel[62] = new ModelRendererTurbo(this, 254, 125, textureX, textureY, "cull"); // Box 56 cull suspension bit
		bodyModel[63] = new ModelRendererTurbo(this, 259, 123, textureX, textureY, "cull"); // Box 57 cull suspension bit
		bodyModel[64] = new ModelRendererTurbo(this, 201, 85, textureX, textureY); // Box 147 5th wheel
		bodyModel[65] = new ModelRendererTurbo(this, 205, 76, textureX, textureY); // Box 148 5th wheel
		bodyModel[66] = new ModelRendererTurbo(this, 217, 77, textureX, textureY); // Box 149 5th wheel
		bodyModel[67] = new ModelRendererTurbo(this, 217, 80, textureX, textureY); // Box 269 5th wheel
		bodyModel[68] = new ModelRendererTurbo(this, 219, 88, textureX, textureY); // Box 260
		bodyModel[69] = new ModelRendererTurbo(this, 221, 83, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 165 shafting my drive
		bodyModel[71] = new ModelRendererTurbo(this, 12, 105, textureX, textureY); // Box 124 axle 1-2 dont spin
		bodyModel[72] = new ModelRendererTurbo(this, 12, 110, textureX, textureY, "wheel front"); // Box 125 wheel 1
		bodyModel[73] = new ModelRendererTurbo(this, 1, 122, textureX, textureY, "wheel front"); // Box 71 wheel 1
		bodyModel[74] = new ModelRendererTurbo(this, 12, 116, textureX, textureY, "wheel front"); // Box 74 wheel 1
		bodyModel[75] = new ModelRendererTurbo(this, 12, 122, textureX, textureY, "wheel front"); // Box 76 wheel 1
		bodyModel[76] = new ModelRendererTurbo(this, 2, 117, textureX, textureY, "wheel front"); // Box 77 wheel 1
		bodyModel[77] = new ModelRendererTurbo(this, 1, 122, textureX, textureY, "wheel front"); // Box 71 wheel 1
		bodyModel[78] = new ModelRendererTurbo(this, 24, 122, textureX, textureY, "wheel front"); // Box 71 wheel 2
		bodyModel[79] = new ModelRendererTurbo(this, 35, 116, textureX, textureY, "wheel front"); // Box 74 wheel 2
		bodyModel[80] = new ModelRendererTurbo(this, 35, 122, textureX, textureY, "wheel front"); // Box 76 wheel 2
		bodyModel[81] = new ModelRendererTurbo(this, 24, 122, textureX, textureY, "wheel front"); // Box 71 wheel 2
		bodyModel[82] = new ModelRendererTurbo(this, 25, 117, textureX, textureY, "wheel front"); // Box 77 wheel 2
		bodyModel[83] = new ModelRendererTurbo(this, 35, 110, textureX, textureY, "wheel front"); // Box 125 wheel 2
		bodyModel[84] = new ModelRendererTurbo(this, 2, 112, textureX, textureY, "wheel front"); // Box 104 wheel 1
		bodyModel[85] = new ModelRendererTurbo(this, 25, 112, textureX, textureY, "wheel front"); // Box 104 wheel 2
		bodyModel[86] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 209 axle 1-2 dont spin
		bodyModel[87] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 210 axle 1-2 dont spin
		bodyModel[88] = new ModelRendererTurbo(this, 70, 121, textureX, textureY, "cull"); // Box 94 cull suspension leaf spring
		bodyModel[89] = new ModelRendererTurbo(this, 79, 121, textureX, textureY, "cull"); // Box 95 cull suspension leaf spring
		bodyModel[90] = new ModelRendererTurbo(this, 70, 121, textureX, textureY, "cull"); // Box 94 cull suspension leaf spring
		bodyModel[91] = new ModelRendererTurbo(this, 79, 121, textureX, textureY, "cull"); // Box 95 cull suspension leaf spring
		bodyModel[92] = new ModelRendererTurbo(this, 46, 107, textureX, textureY); // Box 219 fueltank L
		bodyModel[93] = new ModelRendererTurbo(this, 46, 115, textureX, textureY); // Box 220 fueltank L
		bodyModel[94] = new ModelRendererTurbo(this, 46, 115, textureX, textureY); // Box 221 fueltank L
		bodyModel[95] = new ModelRendererTurbo(this, 82, 107, textureX, textureY); // Box 292 fueltank R
		bodyModel[96] = new ModelRendererTurbo(this, 82, 115, textureX, textureY); // Box 293 fueltank R
		bodyModel[97] = new ModelRendererTurbo(this, 82, 115, textureX, textureY); // Box 294 fueltank R
		bodyModel[98] = new ModelRendererTurbo(this, 126, 73, textureX, textureY); // Box 211 quarter fender
		bodyModel[99] = new ModelRendererTurbo(this, 126, 70, textureX, textureY); // Box 212 quarter fender
		bodyModel[100] = new ModelRendererTurbo(this, 149, 79, textureX, textureY); // Box 213 quarter fender holder (dont texture mid section)
		bodyModel[101] = new ModelRendererTurbo(this, 1, 75, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 1, 87, textureX, textureY); // Box 160 engineer? yeah im engineering my fuckin limit
		bodyModel[104] = new ModelRendererTurbo(this, 30, 95, textureX, textureY); // Box 261 the TRANS mission
		bodyModel[105] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "cull"); // Box 110
		bodyModel[107] = new ModelRendererTurbo(this, 1, 81, textureX, textureY, "lamp"); // Box 312 headlight late
		bodyModel[108] = new ModelRendererTurbo(this, 10, 83, textureX, textureY, "leftTurnLight"); // Box 113 turnlight L late
		bodyModel[109] = new ModelRendererTurbo(this, 42, 48, textureX, textureY); // Box 115
		bodyModel[110] = new ModelRendererTurbo(this, 87, 23, textureX, textureY); // Box 122
		bodyModel[111] = new ModelRendererTurbo(this, 65, 23, textureX, textureY); // Box 124
		bodyModel[112] = new ModelRendererTurbo(this, 82, 23, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 104, 23, textureX, textureY); // Box 126
		bodyModel[114] = new ModelRendererTurbo(this, 60, 23, textureX, textureY); // Box 131
		bodyModel[115] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 137 late headlight mount
		bodyModel[116] = new ModelRendererTurbo(this, 46, 63, textureX, textureY); // Box 138
		bodyModel[117] = new ModelRendererTurbo(this, 64, 66, textureX, textureY); // Box 140
		bodyModel[118] = new ModelRendererTurbo(this, 59, 82, textureX, textureY); // Box 141 hood emblem
		bodyModel[119] = new ModelRendererTurbo(this, 55, 76, textureX, textureY, "lamp"); // Box 142 headlight
		bodyModel[120] = new ModelRendererTurbo(this, 48, 77, textureX, textureY); // Box 145 early headlight mount
		bodyModel[121] = new ModelRendererTurbo(this, 67, 80, textureX, textureY); // Box 147 early headlight mount
		bodyModel[122] = new ModelRendererTurbo(this, 30, 37, textureX, textureY); // Box 157
		bodyModel[123] = new ModelRendererTurbo(this, 70, 50, textureX, textureY); // Box 159
		bodyModel[124] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 160
		bodyModel[125] = new ModelRendererTurbo(this, 70, 47, textureX, textureY); // Box 161
		bodyModel[126] = new ModelRendererTurbo(this, 65, 50, textureX, textureY); // Box 162
		bodyModel[127] = new ModelRendererTurbo(this, 95, 47, textureX, textureY); // Box 165
		bodyModel[128] = new ModelRendererTurbo(this, 83, 44, textureX, textureY); // Box 166
		bodyModel[129] = new ModelRendererTurbo(this, 77, 57, textureX, textureY); // Box 168
		bodyModel[130] = new ModelRendererTurbo(this, 83, 31, textureX, textureY); // Box 170
		bodyModel[131] = new ModelRendererTurbo(this, 30, 29, textureX, textureY); // Box 171
		bodyModel[132] = new ModelRendererTurbo(this, 35, 26, textureX, textureY); // Box 172
		bodyModel[133] = new ModelRendererTurbo(this, 87, 20, textureX, textureY); // Box 159
		bodyModel[134] = new ModelRendererTurbo(this, 65, 20, textureX, textureY); // Box 160
		bodyModel[135] = new ModelRendererTurbo(this, 82, 20, textureX, textureY); // Box 161
		bodyModel[136] = new ModelRendererTurbo(this, 134, 44, textureX, textureY); // Box 162
		bodyModel[137] = new ModelRendererTurbo(this, 134, 32, textureX, textureY); // Box 163
		bodyModel[138] = new ModelRendererTurbo(this, 134, 41, textureX, textureY); // Box 164
		bodyModel[139] = new ModelRendererTurbo(this, 134, 53, textureX, textureY); // Box 165
		bodyModel[140] = new ModelRendererTurbo(this, 134, 29, textureX, textureY); // Box 166
		bodyModel[141] = new ModelRendererTurbo(this, 46, 120, textureX, textureY); // Box 167
		bodyModel[142] = new ModelRendererTurbo(this, 46, 120, textureX, textureY); // Box 168
		bodyModel[143] = new ModelRendererTurbo(this, 87, 17, textureX, textureY, "cull"); // Box 169 cull sunshield
		bodyModel[144] = new ModelRendererTurbo(this, 65, 17, textureX, textureY, "cull"); // Box 170 cull sunshield
		bodyModel[145] = new ModelRendererTurbo(this, 82, 17, textureX, textureY, "cull"); // Box 171 cull sunshield
		bodyModel[146] = new ModelRendererTurbo(this, 114, 48, textureX, textureY); // Box 172
		bodyModel[147] = new ModelRendererTurbo(this, 112, 56, textureX, textureY); // Box 173
		bodyModel[148] = new ModelRendererTurbo(this, 129, 48, textureX, textureY); // Box 174
		bodyModel[149] = new ModelRendererTurbo(this, 149, 53, textureX, textureY); // Box 175
		bodyModel[150] = new ModelRendererTurbo(this, 134, 56, textureX, textureY); // Box 176
		bodyModel[151] = new ModelRendererTurbo(this, 64, 78, textureX, textureY, "leftTurnLight"); // Box 181 turnlight L
		bodyModel[152] = new ModelRendererTurbo(this, 93, 82, textureX, textureY); // Box 182
		bodyModel[153] = new ModelRendererTurbo(this, 1, 61, textureX, textureY); // Box 184
		bodyModel[154] = new ModelRendererTurbo(this, 78, 80, textureX, textureY); // Box 185
		bodyModel[155] = new ModelRendererTurbo(this, 107, 80, textureX, textureY); // Box 186
		bodyModel[156] = new ModelRendererTurbo(this, 118, 78, textureX, textureY); // Box 188
		bodyModel[157] = new ModelRendererTurbo(this, 136, 78, textureX, textureY); // Box 189
		bodyModel[158] = new ModelRendererTurbo(this, 127, 81, textureX, textureY); // Box 190
		bodyModel[159] = new ModelRendererTurbo(this, 109, 48, textureX, textureY); // Box 191
		bodyModel[160] = new ModelRendererTurbo(this, 104, 17, textureX, textureY, "cull"); // Box 192 cull sunshade
		bodyModel[161] = new ModelRendererTurbo(this, 118, 18, textureX, textureY); // Box 193
		bodyModel[162] = new ModelRendererTurbo(this, 91, 89, textureX, textureY); // Box 196
		bodyModel[163] = new ModelRendererTurbo(this, 60, 17, textureX, textureY, "cull"); // Box 197 cull shunshade
		bodyModel[164] = new ModelRendererTurbo(this, 114, 27, textureX, textureY); // Box 198
		bodyModel[165] = new ModelRendererTurbo(this, 112, 35, textureX, textureY); // Box 199
		bodyModel[166] = new ModelRendererTurbo(this, 109, 27, textureX, textureY); // Box 200
		bodyModel[167] = new ModelRendererTurbo(this, 129, 27, textureX, textureY); // Box 201
		bodyModel[168] = new ModelRendererTurbo(this, 149, 29, textureX, textureY); // Box 202
		bodyModel[169] = new ModelRendererTurbo(this, 46, 57, textureX, textureY); // Box 203
		bodyModel[170] = new ModelRendererTurbo(this, 64, 60, textureX, textureY); // Box 204
		bodyModel[171] = new ModelRendererTurbo(this, 55, 69, textureX, textureY, "lamp"); // Box 205 headlight
		bodyModel[172] = new ModelRendererTurbo(this, 48, 70, textureX, textureY); // Box 206 early headlight mount
		bodyModel[173] = new ModelRendererTurbo(this, 67, 73, textureX, textureY); // Box 207 early headlight mount
		bodyModel[174] = new ModelRendererTurbo(this, 70, 37, textureX, textureY); // Box 208
		bodyModel[175] = new ModelRendererTurbo(this, 70, 34, textureX, textureY); // Box 209
		bodyModel[176] = new ModelRendererTurbo(this, 95, 34, textureX, textureY); // Box 210
		bodyModel[177] = new ModelRendererTurbo(this, 93, 75, textureX, textureY); // Box 211
		bodyModel[178] = new ModelRendererTurbo(this, 78, 73, textureX, textureY); // Box 213
		bodyModel[179] = new ModelRendererTurbo(this, 107, 73, textureX, textureY); // Box 214
		bodyModel[180] = new ModelRendererTurbo(this, 118, 71, textureX, textureY); // Box 215
		bodyModel[181] = new ModelRendererTurbo(this, 136, 71, textureX, textureY); // Box 216
		bodyModel[182] = new ModelRendererTurbo(this, 127, 74, textureX, textureY); // Box 217
		bodyModel[183] = new ModelRendererTurbo(this, 64, 71, textureX, textureY, "rightTurnLight"); // Box 218 turnlight R
		bodyModel[184] = new ModelRendererTurbo(this, 74, 6, textureX, textureY); // Box 308 mirror right
		bodyModel[185] = new ModelRendererTurbo(this, 74, 14, textureX, textureY); // Box 311
		bodyModel[186] = new ModelRendererTurbo(this, 74, 3, textureX, textureY); // Box 312
		bodyModel[187] = new ModelRendererTurbo(this, 60, 6, textureX, textureY); // Box 138 mirror left
		bodyModel[188] = new ModelRendererTurbo(this, 60, 14, textureX, textureY); // Box 140
		bodyModel[189] = new ModelRendererTurbo(this, 60, 3, textureX, textureY); // Box 141
		bodyModel[190] = new ModelRendererTurbo(this, 47, 97, textureX, textureY); // Box 225
		bodyModel[191] = new ModelRendererTurbo(this, 83, 97, textureX, textureY); // Box 227
		bodyModel[192] = new ModelRendererTurbo(this, 30, 81, textureX, textureY, "lamp"); // Box 228 headlight late
		bodyModel[193] = new ModelRendererTurbo(this, 39, 83, textureX, textureY, "rightTurnLight"); // Box 229 turnlight R late
		bodyModel[194] = new ModelRendererTurbo(this, 44, 82, textureX, textureY); // Box 230 late headlight mount
		bodyModel[195] = new ModelRendererTurbo(this, 147, 71, textureX, textureY); // Box 272 hood mirror left
		bodyModel[196] = new ModelRendererTurbo(this, 154, 71, textureX, textureY); // Box 274 hood mirror right
		bodyModel[197] = new ModelRendererTurbo(this, 42, 17, textureX, textureY); // Box 163 markerlight housing
		bodyModel[198] = new ModelRendererTurbo(this, 42, 20, textureX, textureY); // Box 164 markerlight housing
		bodyModel[199] = new ModelRendererTurbo(this, 42, 23, textureX, textureY); // Box 165 markerlight housing
		bodyModel[200] = new ModelRendererTurbo(this, 42, 14, textureX, textureY); // Box 166 markerlight housing
		bodyModel[201] = new ModelRendererTurbo(this, 42, 11, textureX, textureY); // Box 167 markerlight housing
		bodyModel[202] = new ModelRendererTurbo(this, 39, 17, textureX, textureY, "lamp"); // Box 168 glowey markerlight
		bodyModel[203] = new ModelRendererTurbo(this, 39, 20, textureX, textureY, "lamp"); // Box 169 glowey markerlight
		bodyModel[204] = new ModelRendererTurbo(this, 39, 23, textureX, textureY, "lamp"); // Box 170 glowey markerlight
		bodyModel[205] = new ModelRendererTurbo(this, 39, 14, textureX, textureY, "lamp"); // Box 171 glowey markerlight
		bodyModel[206] = new ModelRendererTurbo(this, 39, 11, textureX, textureY, "lamp"); // Box 172 glowey markerlight
		bodyModel[207] = new ModelRendererTurbo(this, 65, 37, textureX, textureY); // Box 247
		bodyModel[208] = new ModelRendererTurbo(this, 254, 120, textureX, textureY); // Box 215 rear shock
		bodyModel[209] = new ModelRendererTurbo(this, 254, 120, textureX, textureY); // Box 216 rear shock
		bodyModel[210] = new ModelRendererTurbo(this, 179, 72, textureX, textureY); // Box 197 exhaust
		bodyModel[211] = new ModelRendererTurbo(this, 163, 41, textureX, textureY, "cull"); // Box 229 CULL exhaust heat sheild
		bodyModel[212] = new ModelRendererTurbo(this, 198, 81, textureX, textureY); // Box 198 exhaust
		bodyModel[213] = new ModelRendererTurbo(this, 197, 76, textureX, textureY); // Box 200 exhaust
		bodyModel[214] = new ModelRendererTurbo(this, 179, 57, textureX, textureY, "cull"); // Box 243 exhaust tip
		bodyModel[215] = new ModelRendererTurbo(this, 46, 124, textureX, textureY); // Box 222
		bodyModel[216] = new ModelRendererTurbo(this, 46, 124, textureX, textureY); // Box 223
		bodyModel[217] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 224
		bodyModel[218] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 225
		bodyModel[219] = new ModelRendererTurbo(this, 179, 62, textureX, textureY, "cull"); // Box 226 exhaust tip
		bodyModel[220] = new ModelRendererTurbo(this, 112, 64, textureX, textureY); // Box 227
		bodyModel[221] = new ModelRendererTurbo(this, 112, 43, textureX, textureY); // Box 228
		bodyModel[222] = new ModelRendererTurbo(this, 197, 85, textureX, textureY); // Box 235 exhaust pipe
		bodyModel[223] = new ModelRendererTurbo(this, 188, 61, textureX, textureY); // Box 231 exhaust
		bodyModel[224] = new ModelRendererTurbo(this, 170, 72, textureX, textureY); // Box 232 exhaust
		bodyModel[225] = new ModelRendererTurbo(this, 176, 41, textureX, textureY, "cull"); // Box 233 CULL  exhaust heat shield
		bodyModel[226] = new ModelRendererTurbo(this, 189, 81, textureX, textureY); // Box 234 exhaust
		bodyModel[227] = new ModelRendererTurbo(this, 188, 76, textureX, textureY); // Box 235 exhaust
		bodyModel[228] = new ModelRendererTurbo(this, 170, 57, textureX, textureY, "cull"); // Box 236 exhaust tip
		bodyModel[229] = new ModelRendererTurbo(this, 170, 62, textureX, textureY, "cull"); // Box 237 exhaust tip
		bodyModel[230] = new ModelRendererTurbo(this, 188, 85, textureX, textureY); // Box 238 exhaust
		bodyModel[231] = new ModelRendererTurbo(this, 188, 66, textureX, textureY); // Box 239 exhaust
		bodyModel[232] = new ModelRendererTurbo(this, 236, 96, textureX, textureY); // Box 240
		bodyModel[233] = new ModelRendererTurbo(this, 62, 98, textureX, textureY); // Box 241 air tank
		bodyModel[234] = new ModelRendererTurbo(this, 77, 102, textureX, textureY, "cull"); // Box 242 cull air tank support
		bodyModel[235] = new ModelRendererTurbo(this, 188, 56, textureX, textureY); // Box 243 underneath exhaust
		bodyModel[236] = new ModelRendererTurbo(this, 188, 71, textureX, textureY); // Box 244 underneath exhaust
		bodyModel[237] = new ModelRendererTurbo(this, 51, 92, textureX, textureY); // Box 245 cab supporter
		bodyModel[238] = new ModelRendererTurbo(this, 147, 84, textureX, textureY); // Box 245
		bodyModel[239] = new ModelRendererTurbo(this, 147, 76, textureX, textureY); // Box 246
		bodyModel[240] = new ModelRendererTurbo(this, 147, 84, textureX, textureY); // Box 247
		bodyModel[241] = new ModelRendererTurbo(this, 154, 84, textureX, textureY); // Box 248
		bodyModel[242] = new ModelRendererTurbo(this, 154, 76, textureX, textureY); // Box 249
		bodyModel[243] = new ModelRendererTurbo(this, 154, 84, textureX, textureY); // Box 250
		bodyModel[244] = new ModelRendererTurbo(this, 236, 101, textureX, textureY); // Box 251 trailer cable holder
		bodyModel[245] = new ModelRendererTurbo(this, 235, 105, textureX, textureY, "cull"); // Box 252 cull trailer cables
		bodyModel[246] = new ModelRendererTurbo(this, 54, 17, textureX, textureY); // Box 323 markerlight2 housing
		bodyModel[247] = new ModelRendererTurbo(this, 49, 17, textureX, textureY, "lamp"); // Box 259 markerlight2 glowey
		bodyModel[248] = new ModelRendererTurbo(this, 54, 14, textureX, textureY); // Box 323 markerlight2 housing
		bodyModel[249] = new ModelRendererTurbo(this, 49, 14, textureX, textureY, "lamp"); // Box 259 markerlight2 glowey
		bodyModel[250] = new ModelRendererTurbo(this, 54, 20, textureX, textureY); // Box 323 markerlight2 housing
		bodyModel[251] = new ModelRendererTurbo(this, 49, 20, textureX, textureY, "lamp"); // Box 259 markerlight2 glowey
		bodyModel[252] = new ModelRendererTurbo(this, 54, 11, textureX, textureY); // Box 323 markerlight2 housing
		bodyModel[253] = new ModelRendererTurbo(this, 49, 11, textureX, textureY, "lamp"); // Box 259 markerlight2 glowey
		bodyModel[254] = new ModelRendererTurbo(this, 54, 23, textureX, textureY); // Box 323 markerlight2 housing
		bodyModel[255] = new ModelRendererTurbo(this, 49, 23, textureX, textureY, "lamp"); // Box 259 markerlight2 glowey
		bodyModel[256] = new ModelRendererTurbo(this, 67, 9, textureX, textureY); // Box 268 extra little mirror left
		bodyModel[257] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 269 extra little mirror right
		bodyModel[258] = new ModelRendererTurbo(this, 77, 67, textureX, textureY, "lamp"); // Box 270 markerlight L low
		bodyModel[259] = new ModelRendererTurbo(this, 77, 67, textureX, textureY, "lamp"); // Box 271 markerlight R low
		bodyModel[260] = new ModelRendererTurbo(this, 204, -5, textureX, textureY); // Box 277 aerofoil
		bodyModel[261] = new ModelRendererTurbo(this, 179, 11, textureX, textureY, "cull"); // Box 291 aerofoil cull
		bodyModel[262] = new ModelRendererTurbo(this, 211, -5, textureX, textureY); // Box 295 aerofoil backing
		bodyModel[263] = new ModelRendererTurbo(this, 210, 1, textureX, textureY); // Box 296 aerofoil backing
		bodyModel[264] = new ModelRendererTurbo(this, 185, 1, textureX, textureY, "cull"); // Box 298 aerofoil cull
		bodyModel[265] = new ModelRendererTurbo(this, 223, 1, textureX, textureY, "cull"); // Box 299 aerofoil cull
		bodyModel[266] = new ModelRendererTurbo(this, 201, 11, textureX, textureY); // Box 300 aerofoil bracket
		bodyModel[267] = new ModelRendererTurbo(this, 201, 11, textureX, textureY); // Box 301 aerofoil bracket
		bodyModel[268] = new ModelRendererTurbo(this, 46, 103, textureX, textureY); // Box 272 fueltank step
		bodyModel[269] = new ModelRendererTurbo(this, 46, 105, textureX, textureY); // Box 273 fueltank step
		bodyModel[270] = new ModelRendererTurbo(this, 82, 105, textureX, textureY); // Box 274 fueltank step
		bodyModel[271] = new ModelRendererTurbo(this, 82, 103, textureX, textureY); // Box 275 fueltank step
		bodyModel[272] = new ModelRendererTurbo(this, 179, 67, textureX, textureY, "cull"); // Box 226 exhaust tip
		bodyModel[273] = new ModelRendererTurbo(this, 170, 67, textureX, textureY, "cull"); // Box 237 exhaust tip
		bodyModel[274] = new ModelRendererTurbo(this, 189, 44, textureX, textureY, "cull"); // Box 278 cull exhaust grab irons
		bodyModel[275] = new ModelRendererTurbo(this, 196, 44, textureX, textureY, "cull"); // Box 279 cull exhaust grab irons
		bodyModel[276] = new ModelRendererTurbo(this, 94, 70, textureX, textureY, "cull"); // Box 280 CULL cab skirting
		bodyModel[277] = new ModelRendererTurbo(this, 95, 67, textureX, textureY, "lamp"); // Box 281 GLOW cab skirting RUNNING LIGHTS
		bodyModel[278] = new ModelRendererTurbo(this, 118, 116, textureX, textureY, "cull"); // Box 282 cull frame steps L
		bodyModel[279] = new ModelRendererTurbo(this, 122, 118, textureX, textureY); // Box 283 frame step L
		bodyModel[280] = new ModelRendererTurbo(this, 121, 120, textureX, textureY); // Box 284 frame step L
		bodyModel[281] = new ModelRendererTurbo(this, 118, 109, textureX, textureY, "cull"); // Box 285 cull frame steps R
		bodyModel[282] = new ModelRendererTurbo(this, 122, 111, textureX, textureY); // Box 286 frame step R
		bodyModel[283] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 287 frame step R
		bodyModel[284] = new ModelRendererTurbo(this, 247, 4, textureX, textureY); // Box 288 headache rack
		bodyModel[285] = new ModelRendererTurbo(this, 247, 1, textureX, textureY); // Box 289 headache rack
		bodyModel[286] = new ModelRendererTurbo(this, 260, 18, textureX, textureY); // Box 290 rack supporter (i support a nice rack)
		bodyModel[287] = new ModelRendererTurbo(this, 260, 18, textureX, textureY); // Box 291 rack supporter
		bodyModel[288] = new ModelRendererTurbo(this, 242, 3, textureX, textureY, "commander"); // Box 292 commander beacon headache rack
		bodyModel[289] = new ModelRendererTurbo(this, 242, 3, textureX, textureY, "commander"); // Box 294 commander beacon headache rack
		bodyModel[290] = new ModelRendererTurbo(this, 242, 6, textureX, textureY); // Box 295 beacon stick headache rack
		bodyModel[291] = new ModelRendererTurbo(this, 242, 6, textureX, textureY); // Box 296 beacon stick headache rack
		bodyModel[292] = new ModelRendererTurbo(this, 247, 18, textureX, textureY, "cull"); // Box 297 cull  headache rack storage box
		bodyModel[293] = new ModelRendererTurbo(this, 247, 18, textureX, textureY, "cull"); // Box 298 cull headache rack storage box
		bodyModel[294] = new ModelRendererTurbo(this, 43, 8, textureX, textureY); // Box 247 airhorn flattop
		bodyModel[295] = new ModelRendererTurbo(this, 43, 5, textureX, textureY); // Box 248 airhorn flattop
		bodyModel[296] = new ModelRendererTurbo(this, 54, 5, textureX, textureY); // Box 249 airhorn flattop
		bodyModel[297] = new ModelRendererTurbo(this, 54, 8, textureX, textureY); // Box 250 airhorn flattop
		bodyModel[298] = new ModelRendererTurbo(this, 88, 6, textureX, textureY); // Box 307 long antenna
		bodyModel[299] = new ModelRendererTurbo(this, 91, 6, textureX, textureY); // Box 304 long antenna
		bodyModel[300] = new ModelRendererTurbo(this, 72, 104, textureX, textureY); // Box 225 filler up please
		bodyModel[301] = new ModelRendererTurbo(this, 108, 104, textureX, textureY); // Box 227 fuel filler
		bodyModel[302] = new ModelRendererTurbo(this, 112, 10, textureX, textureY); // Box 226 steeringwhool
		bodyModel[303] = new ModelRendererTurbo(this, 125, 15, textureX, textureY); // Box 227 steering collumn
		bodyModel[304] = new ModelRendererTurbo(this, 160, 1, textureX, textureY); // Box 49 seat
		bodyModel[305] = new ModelRendererTurbo(this, 157, 10, textureX, textureY); // Box 51 seat
		bodyModel[306] = new ModelRendererTurbo(this, 157, 10, textureX, textureY); // Box 313 pass seat
		bodyModel[307] = new ModelRendererTurbo(this, 160, 1, textureX, textureY); // Box 314 pass seat
		bodyModel[308] = new ModelRendererTurbo(this, 145, 11, textureX, textureY); // Box 315 seat spring
		bodyModel[309] = new ModelRendererTurbo(this, 145, 11, textureX, textureY); // Box 316 seat spring
		bodyModel[310] = new ModelRendererTurbo(this, 111, 8, textureX, textureY); // Box 317
		bodyModel[311] = new ModelRendererTurbo(this, 137, 8, textureX, textureY); // Box 318
		bodyModel[312] = new ModelRendererTurbo(this, 126, 8, textureX, textureY); // Box 319
		bodyModel[313] = new ModelRendererTurbo(this, 111, -11, textureX, textureY, "lamp"); // Box 320
		bodyModel[314] = new ModelRendererTurbo(this, 136, -5, textureX, textureY, "lamp"); // Box 321
		bodyModel[315] = new ModelRendererTurbo(this, 111, 13, textureX, textureY); // Box 322
		bodyModel[316] = new ModelRendererTurbo(this, 149, 1, textureX, textureY); // Box 323
		bodyModel[317] = new ModelRendererTurbo(this, 143, 8, textureX, textureY); // Box 275 holy SHIFT
		bodyModel[318] = new ModelRendererTurbo(this, 162, 19, textureX, textureY); // Box 326
		bodyModel[319] = new ModelRendererTurbo(this, 162, 16, textureX, textureY); // Box 327
		bodyModel[320] = new ModelRendererTurbo(this, 160, 22, textureX, textureY); // Box 328
		bodyModel[321] = new ModelRendererTurbo(this, 174, 10, textureX, textureY); // Box 314 cb radio
		bodyModel[322] = new ModelRendererTurbo(this, 175, 1, textureX, textureY); // Box 315 cb radio cord
		bodyModel[323] = new ModelRendererTurbo(this, 77, 70, textureX, textureY, "lamp"); // Box 270 markerlight L high
		bodyModel[324] = new ModelRendererTurbo(this, 77, 70, textureX, textureY, "lamp"); // Box 271 markerlight R high
		bodyModel[325] = new ModelRendererTurbo(this, 84, 69, textureX, textureY); // Box 333 air thing
		bodyModel[326] = new ModelRendererTurbo(this, 89, 69, textureX, textureY); // Box 334 air thing
		bodyModel[327] = new ModelRendererTurbo(this, 69, 107, textureX, textureY); // Box 219 fueltank L extension
		bodyModel[328] = new ModelRendererTurbo(this, 69, 115, textureX, textureY); // Box 220 fueltank L extension
		bodyModel[329] = new ModelRendererTurbo(this, 69, 115, textureX, textureY); // Box 221 fueltank L extension
		bodyModel[330] = new ModelRendererTurbo(this, 105, 107, textureX, textureY); // Box 292 fueltank R extended
		bodyModel[331] = new ModelRendererTurbo(this, 105, 115, textureX, textureY); // Box 293 fueltank R extended
		bodyModel[332] = new ModelRendererTurbo(this, 105, 115, textureX, textureY); // Box 294 fueltank R extended
		bodyModel[333] = new ModelRendererTurbo(this, 136, 48, textureX, textureY); // Box 409 commander base
		bodyModel[334] = new ModelRendererTurbo(this, 136, 44, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[335] = new ModelRendererTurbo(this, 131, 45, textureX, textureY, "cull"); // Box 343 cull beacon holder
		bodyModel[336] = new ModelRendererTurbo(this, 156, 40, textureX, textureY); // Box 340 cab mounted grab iron
		bodyModel[337] = new ModelRendererTurbo(this, 159, 40, textureX, textureY); // Box 341 cab mounted grab iron
		bodyModel[338] = new ModelRendererTurbo(this, 63, 84, textureX, textureY); // Box 342 the ever inconspicous hood crease
		bodyModel[339] = new ModelRendererTurbo(this, 63, 84, textureX, textureY); // Box 343 the ever inconspicuous hood crease
		bodyModel[340] = new ModelRendererTurbo(this, 71, 84, textureX, textureY); // Box 344 hood latch
		bodyModel[341] = new ModelRendererTurbo(this, 71, 84, textureX, textureY); // Box 345 hood latch
		bodyModel[342] = new ModelRendererTurbo(this, 247, 107, textureX, textureY); // Box 346
		bodyModel[343] = new ModelRendererTurbo(this, 260, 106, textureX, textureY, "reverseLight"); // Box 347 reverselight frame
		bodyModel[344] = new ModelRendererTurbo(this, 260, 111, textureX, textureY, "reverseLight"); // Box 348 reverselight cab
		bodyModel[345] = new ModelRendererTurbo(this, 94, 2, textureX, textureY, "lamp"); // Box 349 markerlight sunshade
		bodyModel[346] = new ModelRendererTurbo(this, 94, 6, textureX, textureY, "lamp"); // Box 351 markerlight sunshade
		bodyModel[347] = new ModelRendererTurbo(this, 109, 15, textureX, textureY, "lamp"); // Box 352 markerlight sunshade
		bodyModel[348] = new ModelRendererTurbo(this, 260, 102, textureX, textureY, "cull"); // Box 198 that other kind of hitch that comes in handy in the hit game Beam.NG Drive
		bodyModel[349] = new ModelRendererTurbo(this, 255, 99, textureX, textureY); // Box 354 pintle support system
		bodyModel[350] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 350 egnine bit TWO
		bodyModel[351] = new ModelRendererTurbo(this, 272, 115, textureX, textureY); // Box 410 license plate
		bodyModel[352] = new ModelRendererTurbo(this, 272, 110, textureX, textureY); // Box 352 license plate 2
		bodyModel[353] = new ModelRendererTurbo(this, 272, 105, textureX, textureY); // Box 353 licenseplate rear
		bodyModel[354] = new ModelRendererTurbo(this, 122, 84, textureX, textureY); // Box 354 bugflector
		bodyModel[355] = new ModelRendererTurbo(this, 159, 84, textureX, textureY); // Box 355
		bodyModel[356] = new ModelRendererTurbo(this, 159, 80, textureX, textureY); // Box 356
		bodyModel[357] = new ModelRendererTurbo(this, 289, 118, textureX, textureY, "cull"); // Box 253 cull full fender
		bodyModel[358] = new ModelRendererTurbo(this, 289, 108, textureX, textureY, "cull"); // Box 358 cull full fender
		bodyModel[359] = new ModelRendererTurbo(this, 272, 104, textureX, textureY); // Box 108 hazmat plac
		bodyModel[360] = new ModelRendererTurbo(this, 256, 76, textureX, textureY); // Box 360 cull trailer cables 2
		bodyModel[361] = new ModelRendererTurbo(this, 257, 72, textureX, textureY); // Box cableholder farback

		bodyModel[0].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 125 wheel 3
		bodyModel[0].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[1].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[1].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[2].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[2].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[3].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[3].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[4].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[4].setRotationPoint(7.5F, 6F, -9F);
		bodyModel[4].rotateAngleZ = 3.14159265F;

		bodyModel[5].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[5].setRotationPoint(7.5F, 6F, -7.5F);

		bodyModel[6].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[6].setRotationPoint(7.5F, 6F, -7.5F);

		bodyModel[7].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[7].setRotationPoint(7.5F, 6F, -7.5F);

		bodyModel[8].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[8].setRotationPoint(7.5F, 6F, 5.5F);

		bodyModel[9].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[9].setRotationPoint(7.5F, 6F, 5.5F);

		bodyModel[10].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[10].setRotationPoint(7.5F, 6F, 5.5F);

		bodyModel[11].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[11].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[12].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[12].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[13].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[13].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[14].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[14].setRotationPoint(7.5F, 6F, 9F);
		bodyModel[14].rotateAngleZ = 3.14159265F;

		bodyModel[15].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 125 wheel 4
		bodyModel[15].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[16].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 125 wheel 3
		bodyModel[16].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[17].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[17].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[18].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[18].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[19].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[19].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[20].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[20].setRotationPoint(17.5F, 6F, -9F);
		bodyModel[20].rotateAngleZ = 3.14159265F;

		bodyModel[21].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[21].setRotationPoint(17.5F, 6F, -7.5F);

		bodyModel[22].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[22].setRotationPoint(17.5F, 6F, -7.5F);

		bodyModel[23].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[23].setRotationPoint(17.5F, 6F, -7.5F);

		bodyModel[24].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[24].setRotationPoint(17.5F, 6F, 5.5F);

		bodyModel[25].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[25].setRotationPoint(17.5F, 6F, 5.5F);

		bodyModel[26].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[26].setRotationPoint(17.5F, 6F, 5.5F);

		bodyModel[27].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[27].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[28].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[28].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[29].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[29].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[30].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[30].setRotationPoint(17.5F, 6F, 9F);
		bodyModel[30].rotateAngleZ = 3.14159265F;

		bodyModel[31].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 125 wheel 4
		bodyModel[31].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[32].addShapeBox(0F, -1F, -1F, 19, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 axle 3-4
		bodyModel[32].setRotationPoint(7.5F, 6F, -9.5F);
		bodyModel[32].rotateAngleY = 1.57079633F;

		bodyModel[33].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[33].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[34].addShapeBox(0F, -1F, -1F, 19, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 axle 3-4
		bodyModel[34].setRotationPoint(17.5F, 6F, -9.5F);
		bodyModel[34].rotateAngleY = 1.57079633F;

		bodyModel[35].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[35].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[36].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[36].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 49 differing my rential
		bodyModel[37].setRotationPoint(16.5F, 4F, -2F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 50 differing my rential
		bodyModel[38].setRotationPoint(6.5F, 4F, -2F);

		bodyModel[39].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[39].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[40].addBox(0F, 0F, 0F, 22, 3, 1, 0F); // Box 64
		bodyModel[40].setRotationPoint(-2F, 2F, 3.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 22, 3, 1, 0F); // Box 65
		bodyModel[41].setRotationPoint(-2F, 2F, -4.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[42].setRotationPoint(20F, 3F, -4.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(20F, 3F, 3.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 144 who up flappin they mud
		bodyModel[44].setRotationPoint(22.5F, 3.5F, 5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 146 who up flappin they mud
		bodyModel[45].setRotationPoint(22.5F, 3.5F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 68
		bodyModel[46].setRotationPoint(23F, 2.75F, -10F);
		bodyModel[46].rotateAngleY = 1.57079633F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 142 taillight R
		bodyModel[47].setRotationPoint(22.25F, 3.75F, 1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 141 taillight L
		bodyModel[48].setRotationPoint(22.25F, 3.75F, -3.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 236 reverse light
		bodyModel[49].setRotationPoint(22.25F, 3.25F, -3.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Box 237 reverse light
		bodyModel[50].setRotationPoint(22.25F, 3.25F, 1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 81 driveshaft 2
		bodyModel[51].setRotationPoint(8F, 5.5F, -1.5F);
		bodyModel[51].rotateAngleY = 0.2268928F;

		bodyModel[52].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 52 suspension airbag
		bodyModel[52].setRotationPoint(18F, 5F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 53 suspension airbag
		bodyModel[53].setRotationPoint(18F, 5F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55 cull suspension bit
		bodyModel[54].setRotationPoint(12F, 6.1F, -4F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 55 cull suspension bit
		bodyModel[55].setRotationPoint(13F, 5.1F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 56 cull suspension bit
		bodyModel[56].setRotationPoint(12F, 6.1F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 57 cull suspension bit
		bodyModel[57].setRotationPoint(13F, 5.1F, 3F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 52 suspension airbag
		bodyModel[58].setRotationPoint(8F, 5F, -5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 53 suspension airbag
		bodyModel[59].setRotationPoint(8F, 5F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55 cull suspension bit
		bodyModel[60].setRotationPoint(2F, 6.1F, -4F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 55 cull suspension bit
		bodyModel[61].setRotationPoint(3F, 5.1F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 56 cull suspension bit
		bodyModel[62].setRotationPoint(2F, 6.1F, 3F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 57 cull suspension bit
		bodyModel[63].setRotationPoint(3F, 5.1F, 3F);

		bodyModel[64].addBox(-4F, 0F, 0F, 4, 1, 9, 0F); // Box 147 5th wheel
		bodyModel[64].setRotationPoint(13F, 1F, -4.5F);
		bodyModel[64].rotateAngleZ = -0.08726646F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 148 5th wheel
		bodyModel[65].setRotationPoint(13F, 1F, -3.5F);
		bodyModel[65].rotateAngleZ = -0.08726646F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 149 5th wheel
		bodyModel[66].setRotationPoint(13F, 1F, -4.5F);
		bodyModel[66].rotateAngleZ = -0.08726646F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 269 5th wheel
		bodyModel[67].setRotationPoint(13F, 1F, 3.5F);
		bodyModel[67].rotateAngleZ = -0.08726646F;

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 260
		bodyModel[68].setRotationPoint(10F, 1.5F, -2F);

		bodyModel[69].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 69
		bodyModel[69].setRotationPoint(13F, 2.5F, -4F);
		bodyModel[69].rotateAngleY = 1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 165 shafting my drive
		bodyModel[70].setRotationPoint(-10F, 3.5F, -0.5F);
		bodyModel[70].rotateAngleY = 0.06108652F;
		bodyModel[70].rotateAngleZ = -0.17453293F;

		bodyModel[71].addShapeBox(0F, -1F, -1F, 11, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 124 axle 1-2 dont spin
		bodyModel[71].setRotationPoint(-18.5F, 7.25F, -5.5F);
		bodyModel[71].rotateAngleY = 1.57079633F;

		bodyModel[72].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 125 wheel 1
		bodyModel[72].setRotationPoint(-18.5F, 6F, -9F);

		bodyModel[73].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 1
		bodyModel[73].setRotationPoint(-18.5F, 6F, -9F);

		bodyModel[74].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 1
		bodyModel[74].setRotationPoint(-18.5F, 6F, -9F);

		bodyModel[75].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 1
		bodyModel[75].setRotationPoint(-18.5F, 6F, -9F);

		bodyModel[76].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 1
		bodyModel[76].setRotationPoint(-18.5F, 6F, -9F);

		bodyModel[77].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 1
		bodyModel[77].setRotationPoint(-18.5F, 6F, -9F);
		bodyModel[77].rotateAngleZ = 3.14159265F;

		bodyModel[78].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 2
		bodyModel[78].setRotationPoint(-18.5F, 6F, 9F);

		bodyModel[79].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 2
		bodyModel[79].setRotationPoint(-18.5F, 6F, 9F);

		bodyModel[80].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 2
		bodyModel[80].setRotationPoint(-18.5F, 6F, 9F);

		bodyModel[81].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 2
		bodyModel[81].setRotationPoint(-18.5F, 6F, 9F);
		bodyModel[81].rotateAngleZ = 3.14159265F;

		bodyModel[82].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 2
		bodyModel[82].setRotationPoint(-18.5F, 6F, 9F);

		bodyModel[83].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 125 wheel 2
		bodyModel[83].setRotationPoint(-18.5F, 6F, 9F);

		bodyModel[84].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,-0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104 wheel 1
		bodyModel[84].setRotationPoint(-18.5F, 6F, -9F);

		bodyModel[85].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F); // Box 104 wheel 2
		bodyModel[85].setRotationPoint(-18.5F, 6F, 9F);

		bodyModel[86].addShapeBox(-1F, -1F, 0F, 2, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 209 axle 1-2 dont spin
		bodyModel[86].setRotationPoint(-18.5F, 7F, 5.5F);

		bodyModel[87].addShapeBox(-1F, -1F, 0F, 2, 1, 3, 0F,-0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 210 axle 1-2 dont spin
		bodyModel[87].setRotationPoint(-18.5F, 7F, -8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 94 cull suspension leaf spring
		bodyModel[88].setRotationPoint(-21.5F, 5F, -4.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 95 cull suspension leaf spring
		bodyModel[89].setRotationPoint(-18.5F, 5F, -4.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 94 cull suspension leaf spring
		bodyModel[90].setRotationPoint(-21.5F, 5F, 3.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F); // Box 95 cull suspension leaf spring
		bodyModel[91].setRotationPoint(-18.5F, 5F, 3.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 9, 5, 2, 0F); // Box 219 fueltank L
		bodyModel[92].setRotationPoint(-12.75F, 2.75F, -8.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 220 fueltank L
		bodyModel[93].setRotationPoint(-12.75F, 4.25F, -10.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 221 fueltank L
		bodyModel[94].setRotationPoint(-12.75F, 4.25F, -6.75F);

		bodyModel[95].addBox(0F, 0F, 0F, 9, 5, 2, 0F); // Box 292 fueltank R
		bodyModel[95].setRotationPoint(-12.75F, 2.75F, 6.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293 fueltank R
		bodyModel[96].setRotationPoint(-12.75F, 4.25F, 8.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 294 fueltank R
		bodyModel[97].setRotationPoint(-12.75F, 4.25F, 4.75F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 3, 20, 0F); // Box 211 quarter fender
		bodyModel[98].setRotationPoint(2.51F, 4F, -10F);

		bodyModel[99].addBox(0F, -3F, 0F, 0, 3, 20, 0F); // Box 212 quarter fender
		bodyModel[99].setRotationPoint(2.51F, 4F, -10F);
		bodyModel[99].rotateAngleZ = -0.43633231F;

		bodyModel[100].addShapeBox(-1F, -1F, 0F, 1, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 213 quarter fender holder (dont texture mid section)
		bodyModel[100].setRotationPoint(2.5F, 4F, -9F);
		bodyModel[100].rotateAngleZ = -0.43633231F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[101].setRotationPoint(-25.01F, 4F, -9.5F);
		bodyModel[101].rotateAngleY = 1.57079633F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[102].setRotationPoint(-23.01F, 4F, -10.5F);
		bodyModel[102].rotateAngleY = 1.57079633F;

		bodyModel[103].addBox(0F, 0F, 0F, 9, 10, 5, 0F); // Box 160 engineer? yeah im engineering my fuckin limit
		bodyModel[103].setRotationPoint(-23F, -4F, -2.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 261 the TRANS mission
		bodyModel[104].setRotationPoint(-14F, 2F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[105].setRotationPoint(-24.75F, 3F, -9.5F);
		bodyModel[105].rotateAngleY = 1.57079633F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[106].setRotationPoint(-25.85F, -4F, -4.5F);
		bodyModel[106].rotateAngleY = 1.57079633F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 312 headlight late
		bodyModel[107].setRotationPoint(-26.75F, 1F, -9.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.25F, -1F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 113 turnlight L late
		bodyModel[108].setRotationPoint(-26.75F, 1F, -10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,1F, 0F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[109].setRotationPoint(-25.75F, -4F, -5F);
		bodyModel[109].rotateAngleY = 1.57079633F;

		bodyModel[110].addShapeBox(0F, 0F, -1F, 7, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 122
		bodyModel[110].setRotationPoint(-13.5F, -12F, -7.5F);
		bodyModel[110].rotateAngleY = 1.57079633F;

		bodyModel[111].addShapeBox(0F, 0F, -1F, 7, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 124
		bodyModel[111].setRotationPoint(-13.5F, -12F, 0.5F);
		bodyModel[111].rotateAngleY = 1.57079633F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128
		bodyModel[112].setRotationPoint(-13.5F, -12F, -0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 126
		bodyModel[113].setRotationPoint(-12F, -12F, -8.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 131
		bodyModel[114].setRotationPoint(-12F, -12F, 7.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137 late headlight mount
		bodyModel[115].setRotationPoint(-24.75F, 1F, -9.5F);
		bodyModel[115].rotateAngleY = 1.57079633F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-0.25F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, 0.5F); // Box 138
		bodyModel[116].setRotationPoint(-25F, 0F, -10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F); // Box 140
		bodyModel[117].setRotationPoint(-19F, -0.5F, -10.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 141 hood emblem
		bodyModel[118].setRotationPoint(-26.65F, -4.75F, 0F);
		bodyModel[118].rotateAngleX = -0.78539816F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 142 headlight
		bodyModel[119].setRotationPoint(-26.5F, 1.25F, -9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145 early headlight mount
		bodyModel[120].setRotationPoint(-26.6F, 1F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,1F, 0.5F, -0.15F, -0.5F, 0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147 early headlight mount
		bodyModel[121].setRotationPoint(-24.6F, 1F, -9.5F);
		bodyModel[121].rotateAngleY = 1.57079633F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,-0.5F, 0F, -0.5F, 1F, 1F, 1.5F, 1F, 1.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 1.5F, 1F, -1.25F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[122].setRotationPoint(-26.5F, -5F, -5.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 159
		bodyModel[123].setRotationPoint(-25.5F, -4F, -6.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0.5F, 0F, -1.5F, 0F, 1F, 0.5F, 0F, 1F, -1.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 1F, 0F, 0.5F); // Box 160
		bodyModel[124].setRotationPoint(-25.5F, -5F, -6.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 161
		bodyModel[125].setRotationPoint(-25.5F, -5F, -6.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 162
		bodyModel[126].setRotationPoint(-26.5F, -4F, -6F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 165
		bodyModel[127].setRotationPoint(-14.5F, -5F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1.5F, 0F, 0F); // Box 166
		bodyModel[128].setRotationPoint(-13.5F, -6F, -6.5F);
		bodyModel[128].rotateAngleY = 1.57079633F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 16, 8, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[129].setRotationPoint(-12.5F, -6F, -8F);
		bodyModel[129].rotateAngleY = 1.57079633F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.25F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 170
		bodyModel[130].setRotationPoint(-13.5F, -6F, -0.5F);
		bodyModel[130].rotateAngleY = 1.57079633F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,-0.5F, 0.25F, -0.5F, 1F, 1.25F, -0.5F, 1F, 1F, 1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1.25F, -0.5F, 1F, -1F, 1.5F, 0F, 0F, -0.5F); // Box 171
		bodyModel[131].setRotationPoint(-26.5F, -5F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0.5F, 0F, 0.5F, 0F, 1F, -1.5F, 0F, 1F, 0.5F, 0.5F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, -1F, -1.5F, 0F, -1F, 1.5F, 0F, 0F, -0.5F); // Box 172
		bodyModel[132].setRotationPoint(-25.5F, -5F, 5.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 159
		bodyModel[133].setRotationPoint(-11.5F, -13F, -7.5F);
		bodyModel[133].rotateAngleY = 1.57079633F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 160
		bodyModel[134].setRotationPoint(-11.5F, -13F, 0.5F);
		bodyModel[134].rotateAngleY = 1.57079633F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 161
		bodyModel[135].setRotationPoint(-12.5F, -13F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 162
		bodyModel[136].setRotationPoint(-11.5F, -13F, -7.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[137].setRotationPoint(-11.5F, -13F, 0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 164
		bodyModel[138].setRotationPoint(-11.5F, -13F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 165
		bodyModel[139].setRotationPoint(-11.5F, -13F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[140].setRotationPoint(-11.5F, -13F, 7.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 167
		bodyModel[141].setRotationPoint(-27F, 3F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 168
		bodyModel[142].setRotationPoint(-27F, 3F, 3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 169 cull sunshield
		bodyModel[143].setRotationPoint(-12F, -13F, -7.5F);
		bodyModel[143].rotateAngleY = 1.57079633F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 170 cull sunshield
		bodyModel[144].setRotationPoint(-12F, -13F, 0.5F);
		bodyModel[144].rotateAngleY = 1.57079633F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F); // Box 171 cull sunshield
		bodyModel[145].setRotationPoint(-13F, -13F, -0.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 172
		bodyModel[146].setRotationPoint(-11.5F, -12F, -8.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 173
		bodyModel[147].setRotationPoint(-12.5F, -6F, -8.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[148].setRotationPoint(-5.5F, -12F, -8.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[149].setRotationPoint(-5.5F, -13F, -8.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 15, 13, 1, 0F); // Box 176
		bodyModel[150].setRotationPoint(-4.5F, -12F, -7.5F);
		bodyModel[150].rotateAngleY = 1.57079633F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -1F, 0.75F, -0.25F, -0.125F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0.75F, -0.25F, -0.125F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 181 turnlight L
		bodyModel[151].setRotationPoint(-26.5F, 1.25F, -10.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 182
		bodyModel[152].setRotationPoint(-24.75F, 0.5F, -10.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 21, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 184
		bodyModel[153].setRotationPoint(-22.75F, 3F, -10.5F);
		bodyModel[153].rotateAngleY = 1.57079633F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[154].setRotationPoint(-20.75F, 1.5F, -10.5F);
		bodyModel[154].rotateAngleY = 1.57079633F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -1F, 0F, 0F, -0.5F); // Box 186
		bodyModel[155].setRotationPoint(-20.75F, 0.5F, -10.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -1.5F, 0F); // Box 188
		bodyModel[156].setRotationPoint(-18.25F, 0.5F, -10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[157].setRotationPoint(-14.25F, 1.5F, -10.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 190
		bodyModel[158].setRotationPoint(-16.25F, 1.5F, -10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[159].setRotationPoint(-12.5F, -12F, -8.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F); // Box 192 cull sunshade
		bodyModel[160].setRotationPoint(-12.5F, -13F, -8.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 17, 1, 7, 0F); // Box 193
		bodyModel[161].setRotationPoint(-5.5F, 0F, -8.5F);
		bodyModel[161].rotateAngleY = 1.57079633F;

		bodyModel[162].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 196
		bodyModel[162].setRotationPoint(-14.5F, 1F, -8F);
		bodyModel[162].rotateAngleY = 1.57079633F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 197 cull shunshade
		bodyModel[163].setRotationPoint(-12.5F, -13F, 7.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 198
		bodyModel[164].setRotationPoint(-11.5F, -12F, 7.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 199
		bodyModel[165].setRotationPoint(-12.5F, -6F, 7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[166].setRotationPoint(-12.5F, -12F, 7.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 201
		bodyModel[167].setRotationPoint(-5.5F, -12F, 7.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 202
		bodyModel[168].setRotationPoint(-5.5F, -13F, 7.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-0.25F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 203
		bodyModel[169].setRotationPoint(-25F, 0F, 6.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[170].setRotationPoint(-19F, -0.5F, 7.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205 headlight
		bodyModel[171].setRotationPoint(-26.5F, 1.25F, 6.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 early headlight mount
		bodyModel[172].setRotationPoint(-26.6F, 1F, 5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0.5F, -0.15F, 1F, 0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.15F, 1F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 207 early headlight mount
		bodyModel[173].setRotationPoint(-24.6F, 1F, 4.5F);
		bodyModel[173].rotateAngleY = 1.57079633F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F); // Box 208
		bodyModel[174].setRotationPoint(-25.5F, -4F, 5.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -1F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F); // Box 209
		bodyModel[175].setRotationPoint(-25.5F, -5F, 5.5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 210
		bodyModel[176].setRotationPoint(-14.5F, -5F, 7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[177].setRotationPoint(-24.75F, 0.5F, 5.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[178].setRotationPoint(-20.75F, 1.5F, 5.5F);
		bodyModel[178].rotateAngleY = 1.57079633F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[179].setRotationPoint(-20.75F, 0.5F, 5.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -1.5F, 0F); // Box 215
		bodyModel[180].setRotationPoint(-18.25F, 0.5F, 6.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[181].setRotationPoint(-14.25F, 1.5F, 6.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 217
		bodyModel[182].setRotationPoint(-16.25F, 1.5F, 6.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.75F, -0.25F, -0.125F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.75F, -0.25F, -0.125F, 0F, -0.25F, -1F); // Box 218 turnlight R
		bodyModel[183].setRotationPoint(-26.5F, 1.25F, 9.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 308 mirror right
		bodyModel[184].setRotationPoint(-12F, -11F, 11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 311
		bodyModel[185].setRotationPoint(-11F, -6F, 8.5F);
		bodyModel[185].rotateAngleY = 1.57079633F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 312
		bodyModel[186].setRotationPoint(-11F, -11.5F, 8.5F);
		bodyModel[186].rotateAngleY = 1.57079633F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138 mirror left
		bodyModel[187].setRotationPoint(-12F, -11F, -13F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 140
		bodyModel[188].setRotationPoint(-11F, -6F, -12.5F);
		bodyModel[188].rotateAngleY = 1.57079633F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F); // Box 141
		bodyModel[189].setRotationPoint(-11F, -11.5F, -12.5F);
		bodyModel[189].rotateAngleY = 1.57079633F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[190].setRotationPoint(-9.75F, 2.75F, -6.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[191].setRotationPoint(-9.75F, 2.75F, 3.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 228 headlight late
		bodyModel[192].setRotationPoint(-26.75F, 1F, 6.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.45F, 0F, -0.25F, -1F); // Box 229 turnlight R late
		bodyModel[193].setRotationPoint(-26.75F, 1F, 9.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230 late headlight mount
		bodyModel[194].setRotationPoint(-24.75F, 1F, 4.5F);
		bodyModel[194].rotateAngleY = 1.57079633F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 272 hood mirror left
		bodyModel[195].setRotationPoint(-24.5F, -6.5F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 274 hood mirror right
		bodyModel[196].setRotationPoint(-24.5F, -6.5F, 8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 163 markerlight housing
		bodyModel[197].setRotationPoint(-12.25F, -14F, -0.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 164 markerlight housing
		bodyModel[198].setRotationPoint(-12.1F, -13.9F, -3.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 165 markerlight housing
		bodyModel[199].setRotationPoint(-12F, -13.75F, -7.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 166 markerlight housing
		bodyModel[200].setRotationPoint(-12.1F, -13.9F, 2.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 167 markerlight housing
		bodyModel[201].setRotationPoint(-12F, -13.75F, 6.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 168 glowey markerlight
		bodyModel[202].setRotationPoint(-12.26F, -14F, -0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 169 glowey markerlight
		bodyModel[203].setRotationPoint(-12.11F, -13.9F, -3.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 170 glowey markerlight
		bodyModel[204].setRotationPoint(-12.01F, -13.75F, -7.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 171 glowey markerlight
		bodyModel[205].setRotationPoint(-12.11F, -13.9F, 2.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 172 glowey markerlight
		bodyModel[206].setRotationPoint(-12.01F, -13.75F, 6.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 247
		bodyModel[207].setRotationPoint(-26.5F, -4F, 5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 215 rear shock
		bodyModel[208].setRotationPoint(21F, 5F, 3.5F);
		bodyModel[208].rotateAngleZ = -0.54105207F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 216 rear shock
		bodyModel[209].setRotationPoint(21F, 5F, -4.5F);
		bodyModel[209].rotateAngleZ = -0.54105207F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 197 exhaust
		bodyModel[210].setRotationPoint(-4F, -21.5F, 7.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F); // Box 229 CULL exhaust heat sheild
		bodyModel[211].setRotationPoint(-4F, -11.5F, 7.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 198 exhaust
		bodyModel[212].setRotationPoint(-4F, 0.5F, 6.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F); // Box 200 exhaust
		bodyModel[213].setRotationPoint(-4F, 0.5F, 7.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 243 exhaust tip
		bodyModel[214].setRotationPoint(-4F, -21.5F, 7.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 222
		bodyModel[215].setRotationPoint(-23F, 3F, -4.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 21, 2, 1, 0F); // Box 223
		bodyModel[216].setRotationPoint(-23F, 3F, 3.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[217].setRotationPoint(-7F, 2F, 3.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[218].setRotationPoint(-7F, 2F, -4.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 226 exhaust tip
		bodyModel[219].setRotationPoint(-4F, -18.5F, 7.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[220].setRotationPoint(-12.5F, 1F, -8.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 228
		bodyModel[221].setRotationPoint(-12.5F, 1F, 7.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -1.75F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -2F, -1.75F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Box 235 exhaust pipe
		bodyModel[222].setRotationPoint(-4F, 0.5F, 4.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, -1.25F, 2.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -3.25F, 0F, 0.75F, 2.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -3.25F); // Box 231 exhaust
		bodyModel[223].setRotationPoint(-18F, 0.5F, 4.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 232 exhaust
		bodyModel[224].setRotationPoint(-4F, -21.5F, -9.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 233 CULL  exhaust heat shield
		bodyModel[225].setRotationPoint(-4F, -11.5F, -10.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 234 exhaust
		bodyModel[226].setRotationPoint(-4F, 0.5F, -7.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 235 exhaust
		bodyModel[227].setRotationPoint(-4F, 0.5F, -9.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F); // Box 236 exhaust tip
		bodyModel[228].setRotationPoint(-4F, -21.5F, -9.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F); // Box 237 exhaust tip
		bodyModel[229].setRotationPoint(-4F, -18.5F, -9.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, -2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, -2F, 0F, -0.25F, -0.25F); // Box 238 exhaust
		bodyModel[230].setRotationPoint(-4F, 0.5F, -6.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, -1.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, 2.75F, 0F, 0.75F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, 2.75F); // Box 239 exhaust
		bodyModel[231].setRotationPoint(-18F, 0.5F, -6.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 5, 0, 8, 0F); // Box 240
		bodyModel[232].setRotationPoint(-3F, 1.98F, -4F);

		bodyModel[233].addBox(0F, -1F, -1F, 7, 2, 2, 0F); // Box 241 air tank
		bodyModel[233].setRotationPoint(-6F, 6F, -2F);
		bodyModel[233].rotateAngleX = 0.78539816F;

		bodyModel[234].addShapeBox(0F, -3F, -0.5F, 1, 3, 1, 0F,0.02F, 0F, 0F, 6.02F, 0F, 0F, 6.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 6.02F, 0F, 0F, 6.02F, 0F, 0F, 0.02F, 0F, 0F); // Box 242 cull air tank support
		bodyModel[234].setRotationPoint(-6F, 6F, -2F);
		bodyModel[234].rotateAngleX = 0.78539816F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, -1.25F, 2.75F, 0F, -3.75F, 2.75F, 0F, -3.75F, -3.25F, 0F, -1.25F, -3.25F, 0F, 0.75F, 2.75F, 0F, 3.25F, 2.75F, 0F, 3.25F, -3.25F, 0F, 0.75F, -3.25F); // Box 243 underneath exhaust
		bodyModel[235].setRotationPoint(-18F, 0.5F, 4.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 244 underneath exhaust
		bodyModel[236].setRotationPoint(-2F, 4F, 1.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 245 cab supporter
		bodyModel[237].setRotationPoint(-6F, 1F, -4F);
		bodyModel[237].rotateAngleY = 1.57079633F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -3.25F, 0.5F, -0.25F, 2.75F, 0.5F, -0.25F, 2.75F, 0.5F, -0.25F, -3.25F, 0.5F, -0.25F); // Box 245
		bodyModel[238].setRotationPoint(-24.9F, -2.5F, -9.25F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 246
		bodyModel[239].setRotationPoint(-24.9F, -5.5F, -9.25F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, -3.25F, -0.25F, -0.5F, -3.25F, -0.25F, -0.75F, 2.75F, -0.25F, -0.75F, 2.75F); // Box 247
		bodyModel[240].setRotationPoint(-24.9F, -2.5F, -9.25F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -3.25F, 0.5F, -0.25F, 2.75F, 0.5F, -0.25F, 2.75F, 0.5F, -0.25F, -3.25F, 0.5F, -0.25F); // Box 248
		bodyModel[241].setRotationPoint(-24.9F, -2.5F, 8.25F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 249
		bodyModel[242].setRotationPoint(-24.9F, -5.5F, 8.25F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 2.75F, -0.25F, -0.75F, 2.75F, -0.25F, -0.5F, -3.25F, -0.25F, -0.5F, -3.25F); // Box 250
		bodyModel[243].setRotationPoint(-24.9F, -2.5F, 8.25F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 251 trailer cable holder
		bodyModel[244].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 16, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, 0F, -1.5F, -8F, 0F, -1.5F, -8F, -3F, 0F, -8F, -3F); // Box 252 cull trailer cables
		bodyModel[245].setRotationPoint(-2.5F, -6F, -1.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323 markerlight2 housing
		bodyModel[246].setRotationPoint(-11F, -13.5F, -0.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F); // Box 259 markerlight2 glowey
		bodyModel[247].setRotationPoint(-12.01F, -13.5F, -0.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323 markerlight2 housing
		bodyModel[248].setRotationPoint(-10.75F, -13.43F, 1.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F); // Box 259 markerlight2 glowey
		bodyModel[249].setRotationPoint(-11.76F, -13.43F, 1.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323 markerlight2 housing
		bodyModel[250].setRotationPoint(-10.75F, -13.43F, -2.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F); // Box 259 markerlight2 glowey
		bodyModel[251].setRotationPoint(-11.76F, -13.43F, -2.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323 markerlight2 housing
		bodyModel[252].setRotationPoint(-10.5F, -13.25F, 6.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F); // Box 259 markerlight2 glowey
		bodyModel[253].setRotationPoint(-11.51F, -13.25F, 6.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 323 markerlight2 housing
		bodyModel[254].setRotationPoint(-10.5F, -13.25F, -7.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, 0.02F, -0.5F, 0F, -0.02F, -0.5F, 0F); // Box 259 markerlight2 glowey
		bodyModel[255].setRotationPoint(-11.51F, -13.25F, -7.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 268 extra little mirror left
		bodyModel[256].setRotationPoint(-11F, -6.5F, -13F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 269 extra little mirror right
		bodyModel[257].setRotationPoint(-11F, -6.5F, 11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 270 markerlight L low
		bodyModel[258].setRotationPoint(-14.5F, -1F, -8.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 271 markerlight R low
		bodyModel[259].setRotationPoint(-14.5F, -1F, 7.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 0, 6, 9, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277 aerofoil
		bodyModel[260].setRotationPoint(-10F, -22F, -4.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,-1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 291 aerofoil cull
		bodyModel[261].setRotationPoint(-11F, -16F, -4.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 0, 6, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 295 aerofoil backing
		bodyModel[262].setRotationPoint(-4.99F, -22F, -8F);

		bodyModel[263].addBox(0F, 0F, 0F, 0, 3, 17, 0F); // Box 296 aerofoil backing
		bodyModel[263].setRotationPoint(-4.99F, -16F, -8.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 298 aerofoil cull
		bodyModel[264].setRotationPoint(-11F, -22F, -7.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -3F); // Box 299 aerofoil cull
		bodyModel[265].setRotationPoint(-11F, -22F, 4.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 300 aerofoil bracket
		bodyModel[266].setRotationPoint(-5.25F, -14F, -5.5F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 301 aerofoil bracket
		bodyModel[267].setRotationPoint(-5.25F, -14F, 4.5F);

		bodyModel[268].addBox(0F, 0F, 0F, 12, 0, 1, 0F); // Box 272 fueltank step
		bodyModel[268].setRotationPoint(-12.25F, 7F, -10.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 12, 0, 1, 0F); // Box 273 fueltank step
		bodyModel[269].setRotationPoint(-12.25F, 3.25F, -10F);

		bodyModel[270].addBox(0F, 0F, 0F, 12, 0, 1, 0F); // Box 274 fueltank step
		bodyModel[270].setRotationPoint(-12.25F, 7F, 9.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 12, 0, 1, 0F); // Box 275 fueltank step
		bodyModel[271].setRotationPoint(-12.25F, 3.25F, 9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 226 exhaust tip
		bodyModel[272].setRotationPoint(-4F, -15.5F, 7.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F); // Box 237 exhaust tip
		bodyModel[273].setRotationPoint(-4F, -15.5F, -9.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278 cull exhaust grab irons
		bodyModel[274].setRotationPoint(-3.5F, -10F, -11F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F); // Box 279 cull exhaust grab irons
		bodyModel[275].setRotationPoint(-3.5F, -10F, 9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 280 CULL cab skirting
		bodyModel[276].setRotationPoint(-12.5F, 1F, -8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.125F, 0.02F, 0F, -0.125F, 0.02F, 0F, -0.125F, 16.02F, 0F, -0.125F, 16.02F, 0F, -0.125F, 0.02F, 0F, -0.125F, 0.02F, 0F, -0.125F, 16.02F, 0F, -0.125F, 16.02F); // Box 281 GLOW cab skirting RUNNING LIGHTS
		bodyModel[277].setRotationPoint(-12F, 1F, -8.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 282 cull frame steps L
		bodyModel[278].setRotationPoint(-2.25F, 2F, -5.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 283 frame step L
		bodyModel[279].setRotationPoint(-2.25F, 4.5F, -5.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 284 frame step L
		bodyModel[280].setRotationPoint(-2.25F, 7.01F, -6.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 1F); // Box 285 cull frame steps R
		bodyModel[281].setRotationPoint(-2.25F, 2F, 4.5F);

		bodyModel[282].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 286 frame step R
		bodyModel[282].setRotationPoint(-2.25F, 4.5F, 4.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 287 frame step R
		bodyModel[283].setRotationPoint(-2.25F, 7.01F, 4.5F);

		bodyModel[284].addBox(0F, 0F, 0F, 18, 12, 1, 0F); // Box 288 headache rack
		bodyModel[284].setRotationPoint(-0.5F, -12F, -9F);
		bodyModel[284].rotateAngleY = 1.57079633F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 289 headache rack
		bodyModel[285].setRotationPoint(-0.5F, -13F, -8F);
		bodyModel[285].rotateAngleY = 1.57079633F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290 rack supporter (i support a nice rack)
		bodyModel[286].setRotationPoint(-1.5F, 0F, -4.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291 rack supporter
		bodyModel[287].setRotationPoint(-1.5F, 0F, 3.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 292 commander beacon headache rack
		bodyModel[288].setRotationPoint(-1.5F, -17F, -4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 294 commander beacon headache rack
		bodyModel[289].setRotationPoint(-1.5F, -17F, 3F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 295 beacon stick headache rack
		bodyModel[290].setRotationPoint(-1.5F, -16F, -4F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 296 beacon stick headache rack
		bodyModel[291].setRotationPoint(-1.5F, -16F, 3F);

		bodyModel[292].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 297 cull  headache rack storage box
		bodyModel[292].setRotationPoint(0.5F, -3F, -8F);
		bodyModel[292].rotateAngleY = 1.57079633F;

		bodyModel[293].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 298 cull headache rack storage box
		bodyModel[293].setRotationPoint(0.5F, -3F, 3F);
		bodyModel[293].rotateAngleY = 1.57079633F;

		bodyModel[294].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 247 airhorn flattop
		bodyModel[294].setRotationPoint(-11F, -14.1F, -6F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 248 airhorn flattop
		bodyModel[295].setRotationPoint(-11F, -14.1F, 5F);

		bodyModel[296].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 249 airhorn flattop
		bodyModel[296].setRotationPoint(-8F, -13.1F, 5F);

		bodyModel[297].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 250 airhorn flattop
		bodyModel[297].setRotationPoint(-8F, -13.1F, -6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 307 long antenna
		bodyModel[298].setRotationPoint(-11.5F, -11.5F, -11.5F);
		bodyModel[298].rotateAngleZ = -3.14159265F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 304 long antenna
		bodyModel[299].setRotationPoint(-11.5F, -11.5F, 11.5F);
		bodyModel[299].rotateAngleZ = -3.14159265F;

		bodyModel[300].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 225 filler up please
		bodyModel[300].setRotationPoint(-9.25F, 3F, -9.5F);
		bodyModel[300].rotateAngleX = 0.78539816F;

		bodyModel[301].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 227 fuel filler
		bodyModel[301].setRotationPoint(-9.25F, 3F, 9.5F);
		bodyModel[301].rotateAngleX = -0.78539816F;

		bodyModel[302].addShapeBox(0F, -2.25F, -3.75F, 0, 6, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 226 steeringwhool
		bodyModel[302].setRotationPoint(-10.5F, -5F, -4.25F);
		bodyModel[302].rotateAngleZ = 0.97738438F;

		bodyModel[303].addBox(-6F, -0.5F, -0.5F, 6, 1, 1, 0F); // Box 227 steering collumn
		bodyModel[303].setRotationPoint(-10.51F, -5F, -4.25F);
		bodyModel[303].rotateAngleZ = 0.97738438F;

		bodyModel[304].addShapeBox(0F, 0F, -1F, 6, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49 seat
		bodyModel[304].setRotationPoint(-7.5F, -8.5F, -7.25F);
		bodyModel[304].rotateAngleY = 1.57079633F;

		bodyModel[305].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 51 seat
		bodyModel[305].setRotationPoint(-6.5F, -1.5F, -7.25F);
		bodyModel[305].rotateAngleY = 1.57079633F;

		bodyModel[306].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 313 pass seat
		bodyModel[306].setRotationPoint(-6.5F, -1.5F, 1.25F);
		bodyModel[306].rotateAngleY = 1.57079633F;

		bodyModel[307].addShapeBox(0F, 0F, -1F, 6, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314 pass seat
		bodyModel[307].setRotationPoint(-7.5F, -8.5F, 1.25F);
		bodyModel[307].rotateAngleY = 1.57079633F;

		bodyModel[308].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 315 seat spring
		bodyModel[308].setRotationPoint(-10F, -1F, -7F);

		bodyModel[309].addBox(0F, 0F, 0F, 3, 1, 5, 0F); // Box 316 seat spring
		bodyModel[309].setRotationPoint(-10F, -1F, 2F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[310].setRotationPoint(-11.5F, -6.05F, -7.5F);
		bodyModel[310].rotateAngleY = 1.57079633F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[311].setRotationPoint(-12.5F, -6.05F, -1.5F);
		bodyModel[311].rotateAngleY = -0.54105207F;

		bodyModel[312].addShapeBox(-2F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[312].setRotationPoint(-12.5F, -6.05F, -1.5F);
		bodyModel[312].rotateAngleY = -0.54105207F;

		bodyModel[313].addShapeBox(0F, 0F, 0F, 0, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -0.75F, -3F, 0F, 0.75F, -3F, 0F, 0.75F, -3F, -6F, -0.75F, -3F, -6F); // Box 320
		bodyModel[313].setRotationPoint(-12.49F, -6.05F, -7.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.75F, -3F, 0F, 0.75F, -3F, 0F, 0.75F, -3F, -3F, -0.75F, -3F, -3F); // Box 321
		bodyModel[314].setRotationPoint(-12.49F, -6.05F, -1.5F);
		bodyModel[314].rotateAngleY = -0.54105207F;

		bodyModel[315].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[315].setRotationPoint(-11.5F, -3.05F, -7.5F);
		bodyModel[315].rotateAngleY = 1.57079633F;

		bodyModel[316].addShapeBox(-2F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[316].setRotationPoint(-10.5F, -3.05F, -1.5F);

		bodyModel[317].addShapeBox(-4F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F); // Box 275 holy SHIFT
		bodyModel[317].setRotationPoint(-9.01F, -3.75F, -0.25F);
		bodyModel[317].rotateAngleZ = 1.37881011F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 326
		bodyModel[318].setRotationPoint(-11.5F, -12.5F, -7.5F);
		bodyModel[318].rotateAngleY = 1.57079633F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 327
		bodyModel[319].setRotationPoint(-11.5F, -12.5F, 0.5F);
		bodyModel[319].rotateAngleY = 1.57079633F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 328
		bodyModel[320].setRotationPoint(-12.5F, -12.5F, -0.5F);

		bodyModel[321].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 314 cb radio
		bodyModel[321].setRotationPoint(-11.5F, -12F, -0.5F);
		bodyModel[321].rotateAngleY = 1.57079633F;

		bodyModel[322].addShapeBox(0F, 0F, -1F, 3, 8, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, -4F, 0F); // Box 315 cb radio cord
		bodyModel[322].setRotationPoint(-12F, -11.5F, -1F);
		bodyModel[322].rotateAngleY = 1.57079633F;

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 270 markerlight L high
		bodyModel[323].setRotationPoint(-14.5F, -4F, -8.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 271 markerlight R high
		bodyModel[324].setRotationPoint(-14.5F, -4F, 7.5F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 333 air thing
		bodyModel[325].setRotationPoint(-14F, -1.5F, -8.5F);
		bodyModel[325].rotateAngleY = -0.2443461F;

		bodyModel[326].addBox(0F, 0F, -1F, 1, 2, 1, 0F); // Box 334 air thing
		bodyModel[326].setRotationPoint(-14F, -1.5F, 8.5F);
		bodyModel[326].rotateAngleY = 0.2443461F;

		bodyModel[327].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Box 219 fueltank L extension
		bodyModel[327].setRotationPoint(-3.75F, 2.75F, -8.75F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 220 fueltank L extension
		bodyModel[328].setRotationPoint(-3.75F, 4.25F, -10.75F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 221 fueltank L extension
		bodyModel[329].setRotationPoint(-3.75F, 4.25F, -6.75F);

		bodyModel[330].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Box 292 fueltank R extended
		bodyModel[330].setRotationPoint(-3.75F, 2.75F, 6.75F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293 fueltank R extended
		bodyModel[331].setRotationPoint(-3.75F, 4.25F, 8.75F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 294 fueltank R extended
		bodyModel[332].setRotationPoint(-3.75F, 4.25F, 4.75F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[333].setRotationPoint(-5.5F, -14F, 7.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[334].setRotationPoint(-5.5F, -15F, 7.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 343 cull beacon holder
		bodyModel[335].setRotationPoint(-5.5F, -13F, 7.5F);

		bodyModel[336].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 340 cab mounted grab iron
		bodyModel[336].setRotationPoint(-5F, -10F, -9F);

		bodyModel[337].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 341 cab mounted grab iron
		bodyModel[337].setRotationPoint(-5F, -10F, 8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.01F, -0.5F, 0F, -0.575F, -0.5F, 0F, -0.575F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F); // Box 342 the ever inconspicous hood crease
		bodyModel[338].setRotationPoint(-16.24F, 0.5F, -10.51F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.01F, -0.5F, 0F, -0.575F, -0.5F, 0F, -0.575F, -0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0F); // Box 343 the ever inconspicuous hood crease
		bodyModel[339].setRotationPoint(-16.24F, 0.5F, 7.51F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 344 hood latch
		bodyModel[340].setRotationPoint(-15.25F, 0.5F, -9.5F);
		bodyModel[340].rotateAngleZ = -0.71558499F;

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 345 hood latch
		bodyModel[341].setRotationPoint(-15.25F, 0.5F, 8.5F);
		bodyModel[341].rotateAngleZ = -0.71558499F;

		bodyModel[342].addBox(0F, 0F, 0F, 2, 0, 8, 0F); // Box 346
		bodyModel[342].setRotationPoint(23.01F, 3.5F, -4F);
		bodyModel[342].rotateAngleZ = -1.57079633F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F); // Box 347 reverselight frame
		bodyModel[343].setRotationPoint(22.25F, 3.75F, 0F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F); // Box 348 reverselight cab
		bodyModel[344].setRotationPoint(-5F, -6.25F, 3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 0, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1F, -2F, 0F, 1F, -2F, 0F); // Box 349 markerlight sunshade
		bodyModel[345].setRotationPoint(-13F, -13.01F, 0.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 0, 3, 7, 0F,-0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, -1.5F, -2F, 0F, 1.5F, -2F, 0F); // Box 351 markerlight sunshade
		bodyModel[346].setRotationPoint(-13F, -13.01F, -7.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 1.5F, -2F, 0F); // Box 352 markerlight sunshade
		bodyModel[347].setRotationPoint(-13.01F, -13.01F, -0.5F);

		bodyModel[348].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 198 that other kind of hitch that comes in handy in the hit game Beam.NG Drive
		bodyModel[348].setRotationPoint(22F, 4.75F, -0.5F);

		bodyModel[349].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 354 pintle support system
		bodyModel[349].setRotationPoint(22F, 4.75F, -3.5F);
		bodyModel[349].rotateAngleY = 1.57079633F;

		bodyModel[350].addBox(0F, 0F, 0F, 8, 3, 9, 0F); // Box 350 egnine bit TWO
		bodyModel[350].setRotationPoint(-22.5F, -3F, -4.5F);

		bodyModel[351].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 410 license plate
		bodyModel[351].setRotationPoint(-27.02F, 7.5F, -2F);

		bodyModel[352].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 352 license plate 2
		bodyModel[352].setRotationPoint(-27.02F, 7F, -9F);

		bodyModel[353].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 353 licenseplate rear
		bodyModel[353].setRotationPoint(22.75F, 5.6F, -9F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 0, 3, 13, 0F,-0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354 bugflector
		bodyModel[354].setRotationPoint(-24F, -7F, -6.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 2.75F, -0.25F, -0.75F, 2.75F, -0.25F, -0.5F, -3.25F, -0.25F, -0.5F, -3.25F); // Box 355
		bodyModel[355].setRotationPoint(-24.9F, -5.5F, 8.4F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, -0.5F, -3.25F, -0.25F, -0.5F, -3.25F, -0.25F, -0.75F, 2.75F, -0.25F, -0.75F, 2.75F); // Box 356
		bodyModel[356].setRotationPoint(-24.9F, -5.5F, -9.4F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 253 cull full fender
		bodyModel[357].setRotationPoint(4.5F, 1.5F, -10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 16, 3, 6, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 358 cull full fender
		bodyModel[358].setRotationPoint(4.5F, 1.5F, 4F);

		bodyModel[359].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[359].setRotationPoint(-26.87F, 1.5F, 3F);
		bodyModel[359].rotateAngleY = -1.57079633F;
		bodyModel[359].rotateAngleZ = -0.78539816F;

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 16, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, 0F, -1.5F, -8F, 0F, -1.5F, -8F, -3F, 0F, -8F, -3F); // Box 360 cull trailer cables 2
		bodyModel[360].setRotationPoint(0F, -6F, -1.5F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box cableholder farback
		bodyModel[361].setRotationPoint(-0.5F, -6F, -0.5F);
	}
}