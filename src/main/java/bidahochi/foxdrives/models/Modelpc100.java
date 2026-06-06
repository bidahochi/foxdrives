//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PC100
// Model Creator: bidahochi
// Created on: 26.02.2025 - 16:02:26
// Last changed on: 26.02.2025 - 16:02:26

package bidahochi.foxdrives.models; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modelpc100 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Modelpc100() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[342];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 12, 105, textureX, textureY); // Box 124 axle 1-2 dont spin
		bodyModel[1] = new ModelRendererTurbo(this, 12, 110, textureX, textureY, "wheel front"); // Box 125 wheel 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 122, textureX, textureY, "wheel front"); // Box 71 wheel 1
		bodyModel[3] = new ModelRendererTurbo(this, 12, 116, textureX, textureY, "wheel front"); // Box 74 wheel 1
		bodyModel[4] = new ModelRendererTurbo(this, 12, 122, textureX, textureY, "wheel front"); // Box 76 wheel 1
		bodyModel[5] = new ModelRendererTurbo(this, 2, 117, textureX, textureY, "wheel front"); // Box 77 wheel 1
		bodyModel[6] = new ModelRendererTurbo(this, 1, 122, textureX, textureY, "wheel front"); // Box 71 wheel 1
		bodyModel[7] = new ModelRendererTurbo(this, 24, 122, textureX, textureY, "wheel front"); // Box 71 wheel 2
		bodyModel[8] = new ModelRendererTurbo(this, 35, 116, textureX, textureY, "wheel front"); // Box 74 wheel 2
		bodyModel[9] = new ModelRendererTurbo(this, 35, 122, textureX, textureY, "wheel front"); // Box 76 wheel 2
		bodyModel[10] = new ModelRendererTurbo(this, 24, 122, textureX, textureY, "wheel front"); // Box 71 wheel 2
		bodyModel[11] = new ModelRendererTurbo(this, 25, 117, textureX, textureY, "wheel front"); // Box 77 wheel 2
		bodyModel[12] = new ModelRendererTurbo(this, 35, 110, textureX, textureY, "wheel front"); // Box 125 wheel 2
		bodyModel[13] = new ModelRendererTurbo(this, 2, 112, textureX, textureY, "wheel front"); // Box 104 wheel 1
		bodyModel[14] = new ModelRendererTurbo(this, 25, 112, textureX, textureY, "wheel front"); // Box 104 wheel 2
		bodyModel[15] = new ModelRendererTurbo(this, 158, 110, textureX, textureY, "wheel"); // Box 125 wheel 3
		bodyModel[16] = new ModelRendererTurbo(this, 147, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[17] = new ModelRendererTurbo(this, 158, 116, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[18] = new ModelRendererTurbo(this, 158, 122, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[19] = new ModelRendererTurbo(this, 147, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[20] = new ModelRendererTurbo(this, 158, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[21] = new ModelRendererTurbo(this, 147, 106, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[22] = new ModelRendererTurbo(this, 158, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[23] = new ModelRendererTurbo(this, 202, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[24] = new ModelRendererTurbo(this, 191, 106, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[25] = new ModelRendererTurbo(this, 202, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[26] = new ModelRendererTurbo(this, 191, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[27] = new ModelRendererTurbo(this, 202, 116, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[28] = new ModelRendererTurbo(this, 202, 122, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[29] = new ModelRendererTurbo(this, 191, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[30] = new ModelRendererTurbo(this, 202, 110, textureX, textureY, "wheel"); // Box 125 wheel 4
		bodyModel[31] = new ModelRendererTurbo(this, 180, 110, textureX, textureY, "wheel"); // Box 125 wheel 3
		bodyModel[32] = new ModelRendererTurbo(this, 169, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[33] = new ModelRendererTurbo(this, 180, 116, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[34] = new ModelRendererTurbo(this, 180, 122, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[35] = new ModelRendererTurbo(this, 169, 122, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[36] = new ModelRendererTurbo(this, 180, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[37] = new ModelRendererTurbo(this, 169, 106, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[38] = new ModelRendererTurbo(this, 180, 104, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[39] = new ModelRendererTurbo(this, 224, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[40] = new ModelRendererTurbo(this, 213, 106, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[41] = new ModelRendererTurbo(this, 224, 104, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[42] = new ModelRendererTurbo(this, 213, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[43] = new ModelRendererTurbo(this, 224, 116, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[44] = new ModelRendererTurbo(this, 224, 122, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[45] = new ModelRendererTurbo(this, 213, 122, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[46] = new ModelRendererTurbo(this, 224, 110, textureX, textureY, "wheel"); // Box 125 wheel 4
		bodyModel[47] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 64
		bodyModel[48] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 65
		bodyModel[49] = new ModelRendererTurbo(this, 137, 120, textureX, textureY); // Box 71
		bodyModel[50] = new ModelRendererTurbo(this, 137, 120, textureX, textureY); // Box 72
		bodyModel[51] = new ModelRendererTurbo(this, 137, 120, textureX, textureY); // Box 73
		bodyModel[52] = new ModelRendererTurbo(this, 137, 120, textureX, textureY); // Box 74
		bodyModel[53] = new ModelRendererTurbo(this, 48, 121, textureX, textureY); // Box 243
		bodyModel[54] = new ModelRendererTurbo(this, 48, 121, textureX, textureY); // Box 244
		bodyModel[55] = new ModelRendererTurbo(this, 147, 99, textureX, textureY); // Box 124 axle 3-4
		bodyModel[56] = new ModelRendererTurbo(this, 148, 117, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[57] = new ModelRendererTurbo(this, 192, 117, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[58] = new ModelRendererTurbo(this, 190, 99, textureX, textureY); // Box 124 axle 3-4
		bodyModel[59] = new ModelRendererTurbo(this, 170, 117, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[60] = new ModelRendererTurbo(this, 214, 117, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[61] = new ModelRendererTurbo(this, 47, 94, textureX, textureY); // Box 69 diffarential
		bodyModel[62] = new ModelRendererTurbo(this, 47, 94, textureX, textureY); // Box 70 diffarential
		bodyModel[63] = new ModelRendererTurbo(this, 25, 88, textureX, textureY); // Box 81 driveshaft 2
		bodyModel[64] = new ModelRendererTurbo(this, 201, 88, textureX, textureY); // Box 147
		bodyModel[65] = new ModelRendererTurbo(this, 205, 79, textureX, textureY); // Box 148
		bodyModel[66] = new ModelRendererTurbo(this, 217, 80, textureX, textureY); // Box 149
		bodyModel[67] = new ModelRendererTurbo(this, 185, 88, textureX, textureY); // Box 151
		bodyModel[68] = new ModelRendererTurbo(this, 217, 83, textureX, textureY); // Box 269
		bodyModel[69] = new ModelRendererTurbo(this, 137, 124, textureX, textureY); // Box 66
		bodyModel[70] = new ModelRendererTurbo(this, 137, 124, textureX, textureY); // Box 67
		bodyModel[71] = new ModelRendererTurbo(this, 235, 117, textureX, textureY); // Box 68
		bodyModel[72] = new ModelRendererTurbo(this, 245, 115, textureX, textureY, "brakeLight"); // Box 141 taillight L
		bodyModel[73] = new ModelRendererTurbo(this, 245, 115, textureX, textureY,"brakeLight"); // Box 142 taillight R
		bodyModel[74] = new ModelRendererTurbo(this, 236, 107, textureX, textureY); // Box 143
		bodyModel[75] = new ModelRendererTurbo(this, 245, 101, textureX, textureY); // Box 144
		bodyModel[76] = new ModelRendererTurbo(this, 236, 107, textureX, textureY); // Box 145
		bodyModel[77] = new ModelRendererTurbo(this, 245, 101, textureX, textureY); // Box 146
		bodyModel[78] = new ModelRendererTurbo(this, 30, 91, textureX, textureY); // Box 82 driveshaft
		bodyModel[79] = new ModelRendererTurbo(this, 1, 87, textureX, textureY); // Box 160 n gin
		bodyModel[80] = new ModelRendererTurbo(this, 47, 124, textureX, textureY); // Box 238
		bodyModel[81] = new ModelRendererTurbo(this, 47, 124, textureX, textureY); // Box 239
		bodyModel[82] = new ModelRendererTurbo(this, 184, 86, textureX, textureY); // Box 410 license plate
		bodyModel[83] = new ModelRendererTurbo(this, 43, 39, textureX, textureY); // Box 104
		bodyModel[84] = new ModelRendererTurbo(this, 1, 71, textureX, textureY); // Box 107 radiator
		bodyModel[85] = new ModelRendererTurbo(this, 2, 41, textureX, textureY); // Box 126 radiator mesh
		bodyModel[86] = new ModelRendererTurbo(this, 20, 71, textureX, textureY); // Box 98 radiator bit
		bodyModel[87] = new ModelRendererTurbo(this, 20, 71, textureX, textureY); // Box 99 radiator bit
		bodyModel[88] = new ModelRendererTurbo(this, 66, 28, textureX, textureY); // Box 95
		bodyModel[89] = new ModelRendererTurbo(this, 40, 28, textureX, textureY); // Box 96
		bodyModel[90] = new ModelRendererTurbo(this, 61, 28, textureX, textureY); // Box 129
		bodyModel[91] = new ModelRendererTurbo(this, 40, 17, textureX, textureY); // Box 97 cab regulah
		bodyModel[92] = new ModelRendererTurbo(this, 40, 3, textureX, textureY); // Box 111 cab regulah
		bodyModel[93] = new ModelRendererTurbo(this, 48, 14, textureX, textureY); // Box 112 cab regulah
		bodyModel[94] = new ModelRendererTurbo(this, 124, 33, textureX, textureY); // Box 113
		bodyModel[95] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 112
		bodyModel[96] = new ModelRendererTurbo(this, 84, 39, textureX, textureY); // Box 118
		bodyModel[97] = new ModelRendererTurbo(this, 104, 86, textureX, textureY); // Box 119
		bodyModel[98] = new ModelRendererTurbo(this, 148, 88, textureX, textureY); // Box 120
		bodyModel[99] = new ModelRendererTurbo(this, 66, 31, textureX, textureY); // Box 122
		bodyModel[100] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Box 124
		bodyModel[101] = new ModelRendererTurbo(this, 87, 31, textureX, textureY); // Box 126
		bodyModel[102] = new ModelRendererTurbo(this, 61, 31, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 35, 31, textureX, textureY); // Box 135
		bodyModel[104] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 136
		bodyModel[105] = new ModelRendererTurbo(this, 28, 4, textureX, textureY); // Box 137
		bodyModel[106] = new ModelRendererTurbo(this, 92, 31, textureX, textureY); // Box 138
		bodyModel[107] = new ModelRendererTurbo(this, 30, 31, textureX, textureY); // Box 139
		bodyModel[108] = new ModelRendererTurbo(this, 31, 83, textureX, textureY,"lamp"); // Box 143 headlight early
		bodyModel[109] = new ModelRendererTurbo(this, 31, 83, textureX, textureY,"lamp"); // Box 144 headlight early
		bodyModel[110] = new ModelRendererTurbo(this, 140, 56, textureX, textureY); // Box 197 exhaust
		bodyModel[111] = new ModelRendererTurbo(this, 177, 56, textureX, textureY); // Box 202 exhaust or air intake
		bodyModel[112] = new ModelRendererTurbo(this, 105, 94, textureX, textureY); // Box 208
		bodyModel[113] = new ModelRendererTurbo(this, 103, 96, textureX, textureY); // Box 161
		bodyModel[114] = new ModelRendererTurbo(this, 54, 104, textureX, textureY); // Box 219 fueltank L
		bodyModel[115] = new ModelRendererTurbo(this, 54, 104, textureX, textureY); // Box 220 fueltank L
		bodyModel[116] = new ModelRendererTurbo(this, 54, 104, textureX, textureY); // Box 221 fueltank L
		bodyModel[117] = new ModelRendererTurbo(this, 51, 113, textureX, textureY); // Box 222 fueltank R big
		bodyModel[118] = new ModelRendererTurbo(this, 51, 113, textureX, textureY); // Box 223 fueltank R big
		bodyModel[119] = new ModelRendererTurbo(this, 51, 113, textureX, textureY); // Box 224 fueltank R big
		bodyModel[120] = new ModelRendererTurbo(this, 46, 115, textureX, textureY); // Box 225
		bodyModel[121] = new ModelRendererTurbo(this, 46, 118, textureX, textureY); // Box 227
		bodyModel[122] = new ModelRendererTurbo(this, 38, 83, textureX, textureY,"lamp"); // Box 161 headlight late
		bodyModel[123] = new ModelRendererTurbo(this, 38, 83, textureX, textureY,"lamp"); // Box 162 headlight late
		bodyModel[124] = new ModelRendererTurbo(this, 105, 94, textureX, textureY); // Box 163
		bodyModel[125] = new ModelRendererTurbo(this, 31, 78, textureX, textureY, "leftTurnLight"); // Box 164 trun light L
		bodyModel[126] = new ModelRendererTurbo(this, 31, 78, textureX, textureY, "rightTurnLight"); // Box 165 turn light R
		bodyModel[127] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "cull"); // Box 166 cull handrails
		bodyModel[128] = new ModelRendererTurbo(this, 26, 17, textureX, textureY, "cull"); // Box 168 cull handrails
		bodyModel[129] = new ModelRendererTurbo(this, 26, 20, textureX, textureY, "cull"); // Box 169 cull handrails
		bodyModel[130] = new ModelRendererTurbo(this, 97, 51, textureX, textureY, "cull"); // Box 170 cull step
		bodyModel[131] = new ModelRendererTurbo(this, 42, 17, textureX, textureY); // Box 163 markerlight housing
		bodyModel[132] = new ModelRendererTurbo(this, 42, 20, textureX, textureY); // Box 164 markerlight housing
		bodyModel[133] = new ModelRendererTurbo(this, 42, 23, textureX, textureY); // Box 165 markerlight housing
		bodyModel[134] = new ModelRendererTurbo(this, 42, 20, textureX, textureY); // Box 166 markerlight housing
		bodyModel[135] = new ModelRendererTurbo(this, 42, 23, textureX, textureY); // Box 167 markerlight housing
		bodyModel[136] = new ModelRendererTurbo(this, 39, 17, textureX, textureY, "lamp"); // Box 168 glowey markerlight
		bodyModel[137] = new ModelRendererTurbo(this, 39, 20, textureX, textureY, "lamp"); // Box 169 glowey markerlight
		bodyModel[138] = new ModelRendererTurbo(this, 39, 23, textureX, textureY, "lamp"); // Box 170 glowey markerlight
		bodyModel[139] = new ModelRendererTurbo(this, 39, 20, textureX, textureY, "lamp"); // Box 171 glowey markerlight
		bodyModel[140] = new ModelRendererTurbo(this, 39, 23, textureX, textureY, "lamp"); // Box 172 glowey markerlight
		bodyModel[141] = new ModelRendererTurbo(this, 123, 89, textureX, textureY); // Box 185
		bodyModel[142] = new ModelRendererTurbo(this, 122, 89, textureX, textureY); // Box 186
		bodyModel[143] = new ModelRendererTurbo(this, 128, 97, textureX, textureY); // Box 187
		bodyModel[144] = new ModelRendererTurbo(this, 128, 97, textureX, textureY); // Box 188
		bodyModel[145] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "cull"); // Box 189 cull handrails
		bodyModel[146] = new ModelRendererTurbo(this, 17, 17, textureX, textureY, "cull"); // Box 190 cull handrails
		bodyModel[147] = new ModelRendererTurbo(this, 18, 20, textureX, textureY, "cull"); // Box 191 cull handrails
		bodyModel[148] = new ModelRendererTurbo(this, 3, 33, textureX, textureY); // Box 192
		bodyModel[149] = new ModelRendererTurbo(this, 36, 39, textureX, textureY); // Box 193
		bodyModel[150] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 194
		bodyModel[151] = new ModelRendererTurbo(this, 19, 51, textureX, textureY, "cull"); // Box 195 cull step
		bodyModel[152] = new ModelRendererTurbo(this, 56, 74, textureX, textureY); // Box 308
		bodyModel[153] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 311
		bodyModel[154] = new ModelRendererTurbo(this, 49, 77, textureX, textureY); // Box 312
		bodyModel[155] = new ModelRendererTurbo(this, 56, 74, textureX, textureY); // Box 138
		bodyModel[156] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 140
		bodyModel[157] = new ModelRendererTurbo(this, 49, 77, textureX, textureY); // Box 141
		bodyModel[158] = new ModelRendererTurbo(this, 56, 81, textureX, textureY); // Box 236
		bodyModel[159] = new ModelRendererTurbo(this, 56, 86, textureX, textureY); // Box 237
		bodyModel[160] = new ModelRendererTurbo(this, 145, 91, textureX, textureY, "cull"); // Box 204 bumper cull
		bodyModel[161] = new ModelRendererTurbo(this, 145, 92, textureX, textureY); // Box 205 bumper bit
		bodyModel[162] = new ModelRendererTurbo(this, 145, 92, textureX, textureY); // Box 206 bumper bit
		bodyModel[163] = new ModelRendererTurbo(this, 156, 95, textureX, textureY); // Box 207 bumper bit
		bodyModel[164] = new ModelRendererTurbo(this, 156, 95, textureX, textureY); // Box 208 bumper bit
		bodyModel[165] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 209 axle 1-2 dont spin
		bodyModel[166] = new ModelRendererTurbo(this, 1, 104, textureX, textureY); // Box 210 axle 1-2 dont spin
		bodyModel[167] = new ModelRendererTurbo(this, 79, 112, textureX, textureY); // Box 211 quarter fender
		bodyModel[168] = new ModelRendererTurbo(this, 79, 108, textureX, textureY); // Box 212 quarter fender
		bodyModel[169] = new ModelRendererTurbo(this, 58, 103, textureX, textureY); // Box 213 quarter fender holder (dont texture mid section)
		bodyModel[170] = new ModelRendererTurbo(this, 79, 112, textureX, textureY); // Box 214 quarter fender
		bodyModel[171] = new ModelRendererTurbo(this, 79, 108, textureX, textureY); // Box 215 quarter fender
		bodyModel[172] = new ModelRendererTurbo(this, 63, 92, textureX, textureY); // Box 154 fueltank support
		bodyModel[173] = new ModelRendererTurbo(this, 72, 91, textureX, textureY); // Box 155 fueltank support
		bodyModel[174] = new ModelRendererTurbo(this, 63, 92, textureX, textureY); // Box 219 fueltank support
		bodyModel[175] = new ModelRendererTurbo(this, 72, 91, textureX, textureY); // Box 220 fueltank support
		bodyModel[176] = new ModelRendererTurbo(this, 63, 77, textureX, textureY); // Box 221 fueltank support big R
		bodyModel[177] = new ModelRendererTurbo(this, 72, 76, textureX, textureY); // Box 222 fueltank support big R
		bodyModel[178] = new ModelRendererTurbo(this, 63, 87, textureX, textureY); // Box 223 fueltank support
		bodyModel[179] = new ModelRendererTurbo(this, 72, 86, textureX, textureY); // Box 224 fueltank support
		bodyModel[180] = new ModelRendererTurbo(this, 43, 105, textureX, textureY, "cull"); // Box 215 cull fuel tank step
		bodyModel[181] = new ModelRendererTurbo(this, 43, 103, textureX, textureY); // Box 216 fuel tank step
		bodyModel[182] = new ModelRendererTurbo(this, 68, 99, textureX, textureY, "cull"); // Box 227 cull fule tank step
		bodyModel[183] = new ModelRendererTurbo(this, 68, 97, textureX, textureY); // Box 228 fuel tank step
		bodyModel[184] = new ModelRendererTurbo(this, 127, 67, textureX, textureY, "cull"); // Box 229 CULL exhaust heat sheild
		bodyModel[185] = new ModelRendererTurbo(this, 164, 67, textureX, textureY, "cull"); // Box 230 CULL exhaust heat sheild
		bodyModel[186] = new ModelRendererTurbo(this, 2, 83, textureX, textureY); // Box 231 this is part of the radiator
		bodyModel[187] = new ModelRendererTurbo(this, 78, 14, textureX, textureY); // Box 247 airhorn flattop
		bodyModel[188] = new ModelRendererTurbo(this, 78, 17, textureX, textureY); // Box 248 airhorn flattop
		bodyModel[189] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 249 airhorn flattop
		bodyModel[190] = new ModelRendererTurbo(this, 89, 14, textureX, textureY); // Box 250 airhorn flattop
		bodyModel[191] = new ModelRendererTurbo(this, 245, 120, textureX, textureY, "leftTurnLight"); // Box 236 turn light L
		bodyModel[192] = new ModelRendererTurbo(this, 245, 120, textureX, textureY, "rightTurnLight"); // Box 237 turn light R
		bodyModel[193] = new ModelRendererTurbo(this, 235, 120, textureX, textureY); // Box 198 that other kind of hitch that comes in handy in the hit game Beam.NG Drive
		bodyModel[194] = new ModelRendererTurbo(this, 112, 13, textureX, textureY); // Box 199 cab aeromatic
		bodyModel[195] = new ModelRendererTurbo(this, 136, 13, textureX, textureY); // Box 200 cab aeromatic
		bodyModel[196] = new ModelRendererTurbo(this, 155, 20, textureX, textureY); // Box 201 cab aeromatic
		bodyModel[197] = new ModelRendererTurbo(this, 135, 9, textureX, textureY); // Box 202 cab aeromatic
		bodyModel[198] = new ModelRendererTurbo(this, 111, 9, textureX, textureY); // Box 203 cab aeromatic
		bodyModel[199] = new ModelRendererTurbo(this, 131, 13, textureX, textureY); // Box 204 cab aeromatic
		bodyModel[200] = new ModelRendererTurbo(this, 130, 8, textureX, textureY); // Box 205 cab aeromatic
		bodyModel[201] = new ModelRendererTurbo(this, 155, 7, textureX, textureY); // Box 206 cab aeromatic
		bodyModel[202] = new ModelRendererTurbo(this, 162, 17, textureX, textureY); // Box 207 cab aeromatic
		bodyModel[203] = new ModelRendererTurbo(this, 184, 7, textureX, textureY); // Box 209 cab aeromatic
		bodyModel[204] = new ModelRendererTurbo(this, 191, 7, textureX, textureY); // Box 210 cab aeromatic
		bodyModel[205] = new ModelRendererTurbo(this, 196, 7, textureX, textureY); // Box 211 cab aeromatic
		bodyModel[206] = new ModelRendererTurbo(this, 72, 9, textureX, textureY); // Box 212 cab
		bodyModel[207] = new ModelRendererTurbo(this, 143, 1, textureX, textureY); // Box 213 cab aeromatic
		bodyModel[208] = new ModelRendererTurbo(this, 102, 1, textureX, textureY); // Box 214 cab aeromatic
		bodyModel[209] = new ModelRendererTurbo(this, 108, 28, textureX, textureY); // Box 215 cab aeromatic
		bodyModel[210] = new ModelRendererTurbo(this, 72, 3, textureX, textureY); // Box 216
		bodyModel[211] = new ModelRendererTurbo(this, 131, 26, textureX, textureY); // Box 217 cab aeromatic
		bodyModel[212] = new ModelRendererTurbo(this, 184, 1, textureX, textureY); // Box 218 cab aeromatic
		bodyModel[213] = new ModelRendererTurbo(this, 191, 1, textureX, textureY); // Box 219 cab aeromatic
		bodyModel[214] = new ModelRendererTurbo(this, 196, 1, textureX, textureY); // Box 220 cab aeromatic
		bodyModel[215] = new ModelRendererTurbo(this, 72, 6, textureX, textureY); // Box 221 cab
		bodyModel[216] = new ModelRendererTurbo(this, 108, 21, textureX, textureY); // Box 222 cab aeromatic
		bodyModel[217] = new ModelRendererTurbo(this, 72, 3, textureX, textureY); // Box 223
		bodyModel[218] = new ModelRendererTurbo(this, 131, 19, textureX, textureY); // Box 224 cab aeromatic
		bodyModel[219] = new ModelRendererTurbo(this, 108, 25, textureX, textureY); // Box 225 cab aeromatic
		bodyModel[220] = new ModelRendererTurbo(this, 72, 23, textureX, textureY); // Box 226 cab regulah
		bodyModel[221] = new ModelRendererTurbo(this, 72, 17, textureX, textureY); // Box 227 cab regulah
		bodyModel[222] = new ModelRendererTurbo(this, 72, 20, textureX, textureY); // Box 228 cab regulah
		bodyModel[223] = new ModelRendererTurbo(this, 131, 81, textureX, textureY); // Box 198 exhaust
		bodyModel[224] = new ModelRendererTurbo(this, 140, 81, textureX, textureY); // Box 200 exhaust
		bodyModel[225] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 231 exhaust
		bodyModel[226] = new ModelRendererTurbo(this, 151, 81, textureX, textureY); // Box 232 exhaust
		bodyModel[227] = new ModelRendererTurbo(this, 168, 81, textureX, textureY); // Box 233 exhaust or air intake
		bodyModel[228] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 234 exhaust or air intake
		bodyModel[229] = new ModelRendererTurbo(this, 158, 86, textureX, textureY); // Box 235 air intake
		bodyModel[230] = new ModelRendererTurbo(this, 167, 86, textureX, textureY); // Box 236 air intake
		bodyModel[231] = new ModelRendererTurbo(this, 20, 80, textureX, textureY); // Box 237 air filter
		bodyModel[232] = new ModelRendererTurbo(this, 158, 86, textureX, textureY); // Box 238 air intake
		bodyModel[233] = new ModelRendererTurbo(this, 21, 81, textureX, textureY); // Box 239 air filter
		bodyModel[234] = new ModelRendererTurbo(this, 21, 81, textureX, textureY); // Box 240 air filter
		bodyModel[235] = new ModelRendererTurbo(this, 168, 58, textureX, textureY); // Box 241 air intake air ram
		bodyModel[236] = new ModelRendererTurbo(this, 168, 63, textureX, textureY); // Box 242 air intake cap
		bodyModel[237] = new ModelRendererTurbo(this, 140, 51, textureX, textureY); // Box 243 exhaust tip
		bodyModel[238] = new ModelRendererTurbo(this, 177, 51, textureX, textureY); // Box 244 exhaust tip
		bodyModel[239] = new ModelRendererTurbo(this, 199, 59, textureX, textureY); // Box 202 air intake
		bodyModel[240] = new ModelRendererTurbo(this, 190, 59, textureX, textureY); // Box 241 air intake air ram
		bodyModel[241] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 242 air intake cap
		bodyModel[242] = new ModelRendererTurbo(this, 191, 76, textureX, textureY); // Box 248 air intake
		bodyModel[243] = new ModelRendererTurbo(this, 199, 81, textureX, textureY); // Box 249 air intake
		bodyModel[244] = new ModelRendererTurbo(this, 188, 81, textureX, textureY); // Box 250 air intake
		bodyModel[245] = new ModelRendererTurbo(this, 98, 100, textureX, textureY); // Box 251 trailer cable holder
		bodyModel[246] = new ModelRendererTurbo(this, 79, 90, textureX, textureY, "cull"); // Box 252 cull trailer cables
		bodyModel[247] = new ModelRendererTurbo(this, 98, 105, textureX, textureY, "cull"); // Box 253 cull full fender
		bodyModel[248] = new ModelRendererTurbo(this, 98, 105, textureX, textureY, "cull"); // Box 254 cull full fender
		bodyModel[249] = new ModelRendererTurbo(this, 98, 120, textureX, textureY); // Box 255 full fender holder (dont texture mid section)
		bodyModel[250] = new ModelRendererTurbo(this, 98, 117, textureX, textureY); // Box 256 full fender holder (dont texture mid section)
		bodyModel[251] = new ModelRendererTurbo(this, 92, 28, textureX, textureY); // Box 257 airhorn raised top
		bodyModel[252] = new ModelRendererTurbo(this, 101, 28, textureX, textureY); // Box 258 airhorn raised top
		bodyModel[253] = new ModelRendererTurbo(this, 92, 25, textureX, textureY); // Box 259 airhorn raised top
		bodyModel[254] = new ModelRendererTurbo(this, 101, 25, textureX, textureY); // Box 260 airhorn raised top
		bodyModel[255] = new ModelRendererTurbo(this, 92, 67, textureX, textureY); // Box 176
		bodyModel[256] = new ModelRendererTurbo(this, 102, 56, textureX, textureY); // Box 177
		bodyModel[257] = new ModelRendererTurbo(this, 50, 58, textureX, textureY); // Box 226 steeringwhool
		bodyModel[258] = new ModelRendererTurbo(this, 48, 71, textureX, textureY); // Box 227 steering collumn
		bodyModel[259] = new ModelRendererTurbo(this, 63, 50, textureX, textureY, "lamp"); // Box 181 dashboard GLOW
		bodyModel[260] = new ModelRendererTurbo(this, 219, 91, textureX, textureY); // Box 260
		bodyModel[261] = new ModelRendererTurbo(this, 30, 94, textureX, textureY); // Box 261 the TRANS mission
		bodyModel[262] = new ModelRendererTurbo(this, 30, 52, textureX, textureY); // Box 262 floor
		bodyModel[263] = new ModelRendererTurbo(this, 92, 61, textureX, textureY); // Box 263
		bodyModel[264] = new ModelRendererTurbo(this, 30, 52, textureX, textureY); // Box 264 floor
		bodyModel[265] = new ModelRendererTurbo(this, 61, 52, textureX, textureY); // Box 49 seat
		bodyModel[266] = new ModelRendererTurbo(this, 70, 56, textureX, textureY); // Box 51 seat
		bodyModel[267] = new ModelRendererTurbo(this, 61, 52, textureX, textureY); // Box 268 seat
		bodyModel[268] = new ModelRendererTurbo(this, 70, 56, textureX, textureY); // Box 269 seat
		bodyModel[269] = new ModelRendererTurbo(this, 29, 71, textureX, textureY); // Box 270 cab engine cover
		bodyModel[270] = new ModelRendererTurbo(this, 31, 66, textureX, textureY); // Box 271 cab engine cover
		bodyModel[271] = new ModelRendererTurbo(this, 31, 61, textureX, textureY); // Box 272 cab engine cover
		bodyModel[272] = new ModelRendererTurbo(this, 85, 53, textureX, textureY); // Box 273 seat holdy
		bodyModel[273] = new ModelRendererTurbo(this, 85, 53, textureX, textureY); // Box 274 seat holdy
		bodyModel[274] = new ModelRendererTurbo(this, 76, 53, textureX, textureY); // Box 275 holy SHIFT
		bodyModel[275] = new ModelRendererTurbo(this, 84, 51, textureX, textureY); // Box 276 the shitft holder
		bodyModel[276] = new ModelRendererTurbo(this, 165, 42, textureX, textureY); // Box 189 this is a bed
		bodyModel[277] = new ModelRendererTurbo(this, 121, 54, textureX, textureY); // Box 278
		bodyModel[278] = new ModelRendererTurbo(this, 95, 73, textureX, textureY); // Box 280
		bodyModel[279] = new ModelRendererTurbo(this, 106, 73, textureX, textureY); // Box 282
		bodyModel[280] = new ModelRendererTurbo(this, 116, 70, textureX, textureY); // Box 283
		bodyModel[281] = new ModelRendererTurbo(this, 117, 66, textureX, textureY); // Box 284
		bodyModel[282] = new ModelRendererTurbo(this, 63, 63, textureX, textureY, "lamp"); // Box 285 dashboard2 GLOW
		bodyModel[283] = new ModelRendererTurbo(this, 149, 49, textureX, textureY); // Box 286
		bodyModel[284] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 287
		bodyModel[285] = new ModelRendererTurbo(this, 166, 36, textureX, textureY); // Box 288 this is the high rise sleeper bed
		bodyModel[286] = new ModelRendererTurbo(this, 209, 53, textureX, textureY); // Box 289 cabin shelf thing
		bodyModel[287] = new ModelRendererTurbo(this, 210, 45, textureX, textureY); // Box 290 high roof shelf thing
		bodyModel[288] = new ModelRendererTurbo(this, 91, 39, textureX, textureY); // Box 142 door frame
		bodyModel[289] = new ModelRendererTurbo(this, 31, 39, textureX, textureY); // Box 292 door frame
		bodyModel[290] = new ModelRendererTurbo(this, 63, 82, textureX, textureY); // Box 290 fueltank support small R
		bodyModel[291] = new ModelRendererTurbo(this, 72, 81, textureX, textureY); // Box 291 fueltank support small R
		bodyModel[292] = new ModelRendererTurbo(this, 85, 82, textureX, textureY); // Box 292 fueltank R small
		bodyModel[293] = new ModelRendererTurbo(this, 85, 82, textureX, textureY); // Box 293 fueltank R small
		bodyModel[294] = new ModelRendererTurbo(this, 85, 82, textureX, textureY); // Box 294 fueltank R small
		bodyModel[295] = new ModelRendererTurbo(this, 20, 74, textureX, textureY); // Box 195 emblem
		bodyModel[296] = new ModelRendererTurbo(this, 102, 4, textureX, textureY, "lamp"); // Box 298 glowey markerlights
		bodyModel[297] = new ModelRendererTurbo(this, 102, 4, textureX, textureY, "lamp"); // Box 299 glowey markerlights
		bodyModel[298] = new ModelRendererTurbo(this, 239, 93, textureX, textureY); // Box 300 license plate
		bodyModel[299] = new ModelRendererTurbo(this, 102, 6, textureX, textureY, "lamp"); // Box 301 glowey markerlights
		bodyModel[300] = new ModelRendererTurbo(this, 209, 68, textureX, textureY, "cull"); // Box 302 bumper bullbar CULL
		bodyModel[301] = new ModelRendererTurbo(this, 229, 74, textureX, textureY); // Box 303 bullbar bit
		bodyModel[302] = new ModelRendererTurbo(this, 229, 74, textureX, textureY); // Box 304 bullbar bit
		bodyModel[303] = new ModelRendererTurbo(this, 224, 74, textureX, textureY); // Box 305 bullbar bit
		bodyModel[304] = new ModelRendererTurbo(this, 224, 74, textureX, textureY); // Box 306 bullbar bit
		bodyModel[305] = new ModelRendererTurbo(this, 211, 49, textureX, textureY); // Box 307 bullbar bit
		bodyModel[306] = new ModelRendererTurbo(this, 30, 46, textureX, textureY); // Box 104 long antenna
		bodyModel[307] = new ModelRendererTurbo(this, 33, 46, textureX, textureY); // Box 307 long antenna
		bodyModel[308] = new ModelRendererTurbo(this, 80, 71, textureX, textureY, "reverseLight"); // Box 308 reverse light
		bodyModel[309] = new ModelRendererTurbo(this, 80, 71, textureX, textureY,"reverseLight"); // Box 309 reverse light
		bodyModel[310] = new ModelRendererTurbo(this, 166, 35, textureX, textureY); // Box 310
		bodyModel[311] = new ModelRendererTurbo(this, 38, 83, textureX, textureY, "lamp"); // Box 311 headlight late
		bodyModel[312] = new ModelRendererTurbo(this, 38, 83, textureX, textureY, "lamp"); // Box 312 headlight late
		bodyModel[313] = new ModelRendererTurbo(this, 239, 88, textureX, textureY); // Box 313 license plate front 2
		bodyModel[314] = new ModelRendererTurbo(this, 87, 72, textureX, textureY); // Box 314 cb radio
		bodyModel[315] = new ModelRendererTurbo(this, 98, 90, textureX, textureY); // Box 315 cb radio cord
		bodyModel[316] = new ModelRendererTurbo(this, 19, 28, textureX, textureY, "cull"); // Box 316 cull sunshield
		bodyModel[317] = new ModelRendererTurbo(this, 14, 28, textureX, textureY, "cull"); // Box 317 cull sunshield
		bodyModel[318] = new ModelRendererTurbo(this, 19, 28, textureX, textureY, "cull"); // Box 318 cull sunshield
		bodyModel[319] = new ModelRendererTurbo(this, 41, 14, textureX, textureY, "lamp"); // Box markerlight2
		bodyModel[320] = new ModelRendererTurbo(this, 41, 14, textureX, textureY, "lamp"); // Box 320 markerlight2
		bodyModel[321] = new ModelRendererTurbo(this, 41, 9, textureX, textureY, "lamp"); // Box 321 markerlight2
		bodyModel[322] = new ModelRendererTurbo(this, 41, 9, textureX, textureY, "lamp"); // Box 322 markerlight2
		bodyModel[323] = new ModelRendererTurbo(this, 41, 9, textureX, textureY, "lamp"); // Box 323 markerlight2
		bodyModel[324] = new ModelRendererTurbo(this, 168, 17, textureX, textureY); // Box 324 sleeper bit
		bodyModel[325] = new ModelRendererTurbo(this, 168, 17, textureX, textureY); // Box 325 sleeper bit
		bodyModel[326] = new ModelRendererTurbo(this, 158, 22, textureX, textureY); // Box 409 commander base
		bodyModel[327] = new ModelRendererTurbo(this, 157, 18, textureX, textureY, "commander"); // Box 410 commander beacon
		bodyModel[328] = new ModelRendererTurbo(this, 156, 25, textureX, textureY, "cull"); // Box 328 cull beacon holder
		bodyModel[329] = new ModelRendererTurbo(this, 36, 18, textureX, textureY); // Box 329 antenna 2
		bodyModel[330] = new ModelRendererTurbo(this, 36, 8, textureX, textureY); // Box 330 antenna 2
		bodyModel[331] = new ModelRendererTurbo(this, 85, 76, textureX, textureY,"reverseLight"); // Box 331 reverselight 2
		bodyModel[332] = new ModelRendererTurbo(this, 85, 76, textureX, textureY,"reverseLight"); // Box 332 reverselight 2
		bodyModel[333] = new ModelRendererTurbo(this, 136, 105, textureX, textureY); // Box 333 suspension bit
		bodyModel[334] = new ModelRendererTurbo(this, 136, 105, textureX, textureY); // Box 334 suspension bit
		bodyModel[335] = new ModelRendererTurbo(this, 136, 105, textureX, textureY); // Box 335 suspension bit
		bodyModel[336] = new ModelRendererTurbo(this, 136, 105, textureX, textureY); // Box 336 suspension bit
		bodyModel[337] = new ModelRendererTurbo(this, 106, 89, textureX, textureY, "cull"); // Box 337 cull suspension bit
		bodyModel[338] = new ModelRendererTurbo(this, 106, 89, textureX, textureY, "cull"); // Box 338 cull suspension bit
		bodyModel[339] = new ModelRendererTurbo(this, 205, 1, textureX, textureY); // Box 339 roof ac box thing idk
		bodyModel[340] = new ModelRendererTurbo(this, 202, 10, textureX, textureY); // Box 340 roof ac box mount
		bodyModel[341] = new ModelRendererTurbo(this, 217, 0, textureX, textureY); // Box 341 roof ac box mesh

		bodyModel[0].addShapeBox(0F, -1F, -1F, 11, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 axle 1-2 dont spin
		bodyModel[0].setRotationPoint(-14.5F, 7F, -5.5F);
		bodyModel[0].rotateAngleY = 1.57079633F;

		bodyModel[1].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 125 wheel 1
		bodyModel[1].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[2].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 1
		bodyModel[2].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[3].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 1
		bodyModel[3].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[4].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 1
		bodyModel[4].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[5].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 1
		bodyModel[5].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[6].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 1
		bodyModel[6].setRotationPoint(-14.5F, 6F, -9F);
		bodyModel[6].rotateAngleZ = 3.14159265F;

		bodyModel[7].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 2
		bodyModel[7].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[8].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 2
		bodyModel[8].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[9].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 2
		bodyModel[9].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[10].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 2
		bodyModel[10].setRotationPoint(-14.5F, 6F, 9F);
		bodyModel[10].rotateAngleZ = 3.14159265F;

		bodyModel[11].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 2
		bodyModel[11].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[12].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 125 wheel 2
		bodyModel[12].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[13].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,-0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104 wheel 1
		bodyModel[13].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[14].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F); // Box 104 wheel 2
		bodyModel[14].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[15].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 125 wheel 3
		bodyModel[15].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[16].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[16].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[17].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[17].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[18].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[18].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[19].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[19].setRotationPoint(7.5F, 6F, -9F);
		bodyModel[19].rotateAngleZ = 3.14159265F;

		bodyModel[20].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[20].setRotationPoint(7.5F, 6F, -7.5F);

		bodyModel[21].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[21].setRotationPoint(7.5F, 6F, -7.5F);

		bodyModel[22].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[22].setRotationPoint(7.5F, 6F, -7.5F);

		bodyModel[23].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[23].setRotationPoint(7.5F, 6F, 5.5F);

		bodyModel[24].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[24].setRotationPoint(7.5F, 6F, 5.5F);

		bodyModel[25].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[25].setRotationPoint(7.5F, 6F, 5.5F);

		bodyModel[26].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[26].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[27].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[27].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[28].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[28].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[29].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[29].setRotationPoint(7.5F, 6F, 9F);
		bodyModel[29].rotateAngleZ = 3.14159265F;

		bodyModel[30].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 125 wheel 4
		bodyModel[30].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[31].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 125 wheel 3
		bodyModel[31].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[32].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[32].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[33].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[33].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[34].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[34].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[35].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[35].setRotationPoint(17.5F, 6F, -9F);
		bodyModel[35].rotateAngleZ = 3.14159265F;

		bodyModel[36].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[36].setRotationPoint(17.5F, 6F, -7.5F);

		bodyModel[37].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[37].setRotationPoint(17.5F, 6F, -7.5F);

		bodyModel[38].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[38].setRotationPoint(17.5F, 6F, -7.5F);

		bodyModel[39].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[39].setRotationPoint(17.5F, 6F, 5.5F);

		bodyModel[40].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[40].setRotationPoint(17.5F, 6F, 5.5F);

		bodyModel[41].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[41].setRotationPoint(17.5F, 6F, 5.5F);

		bodyModel[42].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[42].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[43].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[43].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[44].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[44].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[45].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[45].setRotationPoint(17.5F, 6F, 9F);
		bodyModel[45].rotateAngleZ = 3.14159265F;

		bodyModel[46].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 125 wheel 4
		bodyModel[46].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[47].addBox(0F, 0F, 0F, 38, 3, 1, 0F); // Box 64
		bodyModel[47].setRotationPoint(-17F, 2F, 3.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 38, 3, 1, 0F); // Box 65
		bodyModel[48].setRotationPoint(-17F, 2F, -4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[49].setRotationPoint(6F, 5F, 3.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[50].setRotationPoint(6F, 5F, -4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[51].setRotationPoint(16F, 5F, 3.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[52].setRotationPoint(16F, 5F, -4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 243
		bodyModel[53].setRotationPoint(-16F, 5F, -4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 244
		bodyModel[54].setRotationPoint(-16F, 5F, 3.5F);

		bodyModel[55].addShapeBox(0F, -1F, -1F, 19, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 axle 3-4
		bodyModel[55].setRotationPoint(7.5F, 6F, -9.5F);
		bodyModel[55].rotateAngleY = 1.57079633F;

		bodyModel[56].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[56].setRotationPoint(7.5F, 6F, -9F);

		bodyModel[57].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[57].setRotationPoint(7.5F, 6F, 9F);

		bodyModel[58].addShapeBox(0F, -1F, -1F, 19, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 axle 3-4
		bodyModel[58].setRotationPoint(17.5F, 6F, -9.5F);
		bodyModel[58].rotateAngleY = 1.57079633F;

		bodyModel[59].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[59].setRotationPoint(17.5F, 6F, -9F);

		bodyModel[60].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[60].setRotationPoint(17.5F, 6F, 9F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 69 diffarential
		bodyModel[61].setRotationPoint(15.5F, 4F, -2F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 70 diffarential
		bodyModel[62].setRotationPoint(5.5F, 4F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 81 driveshaft 2
		bodyModel[63].setRotationPoint(8F, 5.5F, 0.5F);

		bodyModel[64].addBox(-4F, 0F, 0F, 4, 1, 9, 0F); // Box 147
		bodyModel[64].setRotationPoint(13F, 1F, -4.5F);
		bodyModel[64].rotateAngleZ = -0.08726646F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 148
		bodyModel[65].setRotationPoint(13F, 1F, -3.5F);
		bodyModel[65].rotateAngleZ = -0.08726646F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 149
		bodyModel[66].setRotationPoint(13F, 1F, -4.5F);
		bodyModel[66].rotateAngleZ = -0.08726646F;

		bodyModel[67].addBox(0F, 0F, -3.5F, 8, 1, 4, 0F); // Box 151
		bodyModel[67].setRotationPoint(10F, 2.5F, -4F);
		bodyModel[67].rotateAngleY = 1.57079633F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 269
		bodyModel[68].setRotationPoint(13F, 1F, 3.5F);
		bodyModel[68].rotateAngleZ = -0.08726646F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 66
		bodyModel[69].setRotationPoint(21F, 2F, -4.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 67
		bodyModel[70].setRotationPoint(21F, 2F, 3.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 3, 7, 0F); // Box 68
		bodyModel[71].setRotationPoint(22F, 2.75F, -3.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 141 taillight L
		bodyModel[72].setRotationPoint(22.01F, 3.25F, -3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 142 taillight R
		bodyModel[73].setRotationPoint(22.01F, 3.25F, 1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[74].setRotationPoint(22F, 2.75F, 4F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 144
		bodyModel[75].setRotationPoint(22.5F, 3.5F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[76].setRotationPoint(22F, 2.75F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 146
		bodyModel[77].setRotationPoint(22.5F, 3.5F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, -2.125F, -0.375F, 0F, -2.125F, 0.625F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 2.125F, -0.375F, 0F, 2.125F, 0.625F, 0F, 0.125F, 0.125F); // Box 82 driveshaft
		bodyModel[78].setRotationPoint(-6F, 3.5F, 0F);

		bodyModel[79].addBox(0F, 0F, 0F, 9, 10, 5, 0F); // Box 160 n gin
		bodyModel[79].setRotationPoint(-19F, -4F, -2.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[80].setRotationPoint(-21F, 3F, -4.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[81].setRotationPoint(-21F, 3F, 3.5F);

		bodyModel[82].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 410 license plate
		bodyModel[82].setRotationPoint(-21.02F, 7.5F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, -1F, 19, 11, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[83].setRotationPoint(-20.5F, -8.5F, -9.5F);
		bodyModel[83].rotateAngleY = 1.57079633F;

		bodyModel[84].addBox(0F, 0F, -2F, 7, 9, 2, 0F); // Box 107 radiator
		bodyModel[84].setRotationPoint(-20.75F, -6.45F, -3.5F);
		bodyModel[84].rotateAngleY = 1.57079633F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 16, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -7F, 0F, -8F, -7F); // Box 126 radiator mesh
		bodyModel[85].setRotationPoint(-20.77F, -5.45F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 98 radiator bit
		bodyModel[86].setRotationPoint(-20.75F, -7.45F, -3.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99 radiator bit
		bodyModel[87].setRotationPoint(-20.75F, -7.45F, 0.5F);

		bodyModel[88].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 95
		bodyModel[88].setRotationPoint(-19.5F, -15.5F, -9.5F);
		bodyModel[88].rotateAngleY = 1.57079633F;

		bodyModel[89].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 96
		bodyModel[89].setRotationPoint(-19.5F, -15.5F, 0.5F);
		bodyModel[89].rotateAngleY = 1.57079633F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[90].setRotationPoint(-19.5F, -15.5F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 97 cab regulah
		bodyModel[91].setRotationPoint(-17.5F, -15.5F, -9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111 cab regulah
		bodyModel[92].setRotationPoint(-17.5F, -15.5F, 0.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112 cab regulah
		bodyModel[93].setRotationPoint(-17.5F, -16F, -0.5F);

		bodyModel[94].addBox(0F, 0F, -1F, 19, 14, 1, 0F); // Box 113
		bodyModel[94].setRotationPoint(-6.5F, -14.5F, -9.5F);
		bodyModel[94].rotateAngleY = 1.57079633F;

		bodyModel[95].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 112
		bodyModel[95].setRotationPoint(-17.5F, -14.5F, -10.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 118
		bodyModel[96].setRotationPoint(-19.5F, -8.5F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, -1F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[97].setRotationPoint(-19.5F, 1.5F, -10.5F);
		bodyModel[97].rotateAngleY = 1.57079633F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[98].setRotationPoint(-18.5F, 1.5F, -10.5F);

		bodyModel[99].addShapeBox(0F, 0F, -1F, 9, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 122
		bodyModel[99].setRotationPoint(-20F, -14.5F, -9.5F);
		bodyModel[99].rotateAngleY = 1.57079633F;

		bodyModel[100].addShapeBox(0F, 0F, -1F, 9, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 124
		bodyModel[100].setRotationPoint(-20F, -14.5F, 0.5F);
		bodyModel[100].rotateAngleY = 1.57079633F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 126
		bodyModel[101].setRotationPoint(-18.5F, -14.5F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(-20F, -14.5F, -0.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 135
		bodyModel[103].setRotationPoint(-18.5F, -14.5F, 9.5F);

		bodyModel[104].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 136
		bodyModel[104].setRotationPoint(-18.5F, -15.5F, -9.5F);
		bodyModel[104].rotateAngleY = 1.57079633F;

		bodyModel[105].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 137
		bodyModel[105].setRotationPoint(-18.5F, -15.5F, 0.5F);
		bodyModel[105].rotateAngleY = 1.57079633F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 138
		bodyModel[106].setRotationPoint(-18.5F, -14.5F, -10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 139
		bodyModel[107].setRotationPoint(-18.5F, -14.5F, 9.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 143 headlight early
		bodyModel[108].setRotationPoint(-20.75F, 0.45F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 144 headlight early
		bodyModel[109].setRotationPoint(-20.75F, 0.45F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 197 exhaust
		bodyModel[110].setRotationPoint(-5F, -21.5F, 6.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 202 exhaust or air intake
		bodyModel[111].setRotationPoint(-5F, -21.5F, -8.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.75F, -0.75F, 0F, -1.75F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 208
		bodyModel[112].setRotationPoint(-4.5F, -5F, -7.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 161
		bodyModel[113].setRotationPoint(-3F, 2F, -3.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 7, 5, 2, 0F); // Box 219 fueltank L
		bodyModel[114].setRotationPoint(-5.5F, 2.75F, -8.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 220 fueltank L
		bodyModel[115].setRotationPoint(-5.5F, 4.25F, -10.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 221 fueltank L
		bodyModel[116].setRotationPoint(-5.5F, 4.25F, -6.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 222 fueltank R big
		bodyModel[117].setRotationPoint(-8.5F, 4.25F, 4.75F);

		bodyModel[118].addBox(0F, 0F, 0F, 10, 5, 2, 0F); // Box 223 fueltank R big
		bodyModel[118].setRotationPoint(-8.5F, 2.75F, 6.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 224 fueltank R big
		bodyModel[119].setRotationPoint(-8.5F, 4.25F, 8.75F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 225
		bodyModel[120].setRotationPoint(-4.25F, 3.5F, -10F);
		bodyModel[120].rotateAngleX = 0.78539816F;

		bodyModel[121].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 227
		bodyModel[121].setRotationPoint(-4.25F, 3.5F, 10F);
		bodyModel[121].rotateAngleX = -0.78539816F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 161 headlight late
		bodyModel[122].setRotationPoint(-20.55F, 0.45F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 headlight late
		bodyModel[123].setRotationPoint(-20.55F, 0.45F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, -0.75F, 0F, -1.75F, -0.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 163
		bodyModel[124].setRotationPoint(-4.5F, -5F, 6.5F);

		bodyModel[125].addShapeBox(0F, -2F, -2.5F, 1, 2, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 164 trun light L
		bodyModel[125].setRotationPoint(-19F, -5F, -12.25F);
		bodyModel[125].rotateAngleX = -3.14159265F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 165 turn light R
		bodyModel[126].setRotationPoint(-19F, -5F, 10.25F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 166 cull handrails
		bodyModel[127].setRotationPoint(-12F, -12.5F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 168 cull handrails
		bodyModel[128].setRotationPoint(-12F, 1.5F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 169 cull handrails
		bodyModel[129].setRotationPoint(-10F, 2.5F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 170 cull step
		bodyModel[130].setRotationPoint(-16.5F, -0.5F, -10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 163 markerlight housing
		bodyModel[131].setRotationPoint(-18.25F, -17F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 164 markerlight housing
		bodyModel[132].setRotationPoint(-18.1F, -16.86F, -3.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 165 markerlight housing
		bodyModel[133].setRotationPoint(-18F, -16.55F, -8.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 166 markerlight housing
		bodyModel[134].setRotationPoint(-18.1F, -16.86F, 2.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 167 markerlight housing
		bodyModel[135].setRotationPoint(-18F, -16.55F, 7.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 168 glowey markerlight
		bodyModel[136].setRotationPoint(-18.26F, -17F, -0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 169 glowey markerlight
		bodyModel[137].setRotationPoint(-18.11F, -16.86F, -3.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 170 glowey markerlight
		bodyModel[138].setRotationPoint(-18.01F, -16.55F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 171 glowey markerlight
		bodyModel[139].setRotationPoint(-18.11F, -16.86F, 2.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 172 glowey markerlight
		bodyModel[140].setRotationPoint(-18.01F, -16.55F, 7.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[141].setRotationPoint(-10F, 2F, -9.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[142].setRotationPoint(-10F, 3F, -10.5F);

		bodyModel[143].addShapeBox(-1F, -1F, 0F, 2, 2, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 187
		bodyModel[143].setRotationPoint(-9F, 4.75F, -10F);
		bodyModel[143].rotateAngleZ = 0.78539816F;

		bodyModel[144].addShapeBox(-1F, -1F, 0F, 2, 2, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 188
		bodyModel[144].setRotationPoint(-7F, 4.75F, -10.01F);
		bodyModel[144].rotateAngleZ = 0.78539816F;

		bodyModel[145].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 189 cull handrails
		bodyModel[145].setRotationPoint(-12F, -12.5F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 190 cull handrails
		bodyModel[146].setRotationPoint(-12F, 1.5F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191 cull handrails
		bodyModel[147].setRotationPoint(-10F, 2.5F, 10F);

		bodyModel[148].addBox(0F, 0F, 0F, 12, 16, 1, 0F); // Box 192
		bodyModel[148].setRotationPoint(-17.5F, -14.5F, 9.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 10, 1, 0F); // Box 193
		bodyModel[149].setRotationPoint(-19.5F, -8.5F, 9.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[150].setRotationPoint(-18.5F, 1.5F, 9.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195 cull step
		bodyModel[151].setRotationPoint(-16.5F, -0.5F, 9.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 308
		bodyModel[152].setRotationPoint(-18F, -13F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 311
		bodyModel[153].setRotationPoint(-18F, -9F, 10.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 312
		bodyModel[154].setRotationPoint(-18F, -13.5F, 10.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[155].setRotationPoint(-18F, -13F, -13F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[156].setRotationPoint(-18F, -9F, -12.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 141
		bodyModel[157].setRotationPoint(-18F, -13.5F, -12.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 236
		bodyModel[158].setRotationPoint(-18F, -8.5F, -13F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F); // Box 237
		bodyModel[159].setRotationPoint(-18F, -8.5F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, -1F, 18, 4, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204 bumper cull
		bodyModel[160].setRotationPoint(-21.01F, 3F, -9F);
		bodyModel[160].rotateAngleY = 1.57079633F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205 bumper bit
		bodyModel[161].setRotationPoint(-21.01F, 6F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 206 bumper bit
		bodyModel[162].setRotationPoint(-21.01F, 6F, 4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 bumper bit
		bodyModel[163].setRotationPoint(-21.01F, 3F, -5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208 bumper bit
		bodyModel[164].setRotationPoint(-21.01F, 3F, 3F);

		bodyModel[165].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F); // Box 209 axle 1-2 dont spin
		bodyModel[165].setRotationPoint(-14.5F, 7F, 5.5F);

		bodyModel[166].addShapeBox(-1F, -1F, 0F, 2, 2, 3, 0F,-0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 210 axle 1-2 dont spin
		bodyModel[166].setRotationPoint(-14.5F, 7F, -8.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 211 quarter fender
		bodyModel[167].setRotationPoint(2.51F, 4F, -10F);

		bodyModel[168].addBox(0F, -3F, 0F, 0, 3, 5, 0F); // Box 212 quarter fender
		bodyModel[168].setRotationPoint(2.51F, 4F, -10F);
		bodyModel[168].rotateAngleZ = -0.43633231F;

		bodyModel[169].addShapeBox(-1F, -1F, 0F, 1, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 213 quarter fender holder (dont texture mid section)
		bodyModel[169].setRotationPoint(2.5F, 4F, -9F);
		bodyModel[169].rotateAngleZ = -0.43633231F;

		bodyModel[170].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 214 quarter fender
		bodyModel[170].setRotationPoint(2.51F, 4F, 5F);

		bodyModel[171].addBox(0F, -3F, 0F, 0, 3, 5, 0F); // Box 215 quarter fender
		bodyModel[171].setRotationPoint(2.51F, 4F, 5F);
		bodyModel[171].rotateAngleZ = -0.43633231F;

		bodyModel[172].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F); // Box 154 fueltank support
		bodyModel[172].setRotationPoint(-4.5F, 5.5F, -6.75F);
		bodyModel[172].rotateAngleY = 1.57079633F;

		bodyModel[173].addShapeBox(0F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155 fueltank support
		bodyModel[173].setRotationPoint(-4.5F, 2.5F, -8.75F);
		bodyModel[173].rotateAngleY = 1.57079633F;

		bodyModel[174].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F); // Box 219 fueltank support
		bodyModel[174].setRotationPoint(-0.5F, 5.5F, -6.75F);
		bodyModel[174].rotateAngleY = 1.57079633F;

		bodyModel[175].addShapeBox(0F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220 fueltank support
		bodyModel[175].setRotationPoint(-0.5F, 2.5F, -8.75F);
		bodyModel[175].rotateAngleY = 1.57079633F;

		bodyModel[176].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F); // Box 221 fueltank support big R
		bodyModel[176].setRotationPoint(-7.5F, 5.5F, 3.75F);
		bodyModel[176].rotateAngleY = 1.57079633F;

		bodyModel[177].addShapeBox(0F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222 fueltank support big R
		bodyModel[177].setRotationPoint(-7.5F, 2.5F, 3.75F);
		bodyModel[177].rotateAngleY = 1.57079633F;

		bodyModel[178].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F); // Box 223 fueltank support
		bodyModel[178].setRotationPoint(-0.5F, 5.5F, 3.75F);
		bodyModel[178].rotateAngleY = 1.57079633F;

		bodyModel[179].addShapeBox(0F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224 fueltank support
		bodyModel[179].setRotationPoint(-0.5F, 2.5F, 3.75F);
		bodyModel[179].rotateAngleY = 1.57079633F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 215 cull fuel tank step
		bodyModel[180].setRotationPoint(-2.75F, 3.5F, -10.25F);

		bodyModel[181].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 216 fuel tank step
		bodyModel[181].setRotationPoint(-2.75F, 5.5F, -10.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 227 cull fule tank step
		bodyModel[182].setRotationPoint(-2.75F, 3.5F, 9.25F);

		bodyModel[183].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 228 fuel tank step
		bodyModel[183].setRotationPoint(-2.75F, 5.5F, 9.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F); // Box 229 CULL exhaust heat sheild
		bodyModel[184].setRotationPoint(-5F, -10.5F, 6.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F); // Box 230 CULL exhaust heat sheild
		bodyModel[185].setRotationPoint(-5F, -10.5F, -8.5F);

		bodyModel[186].addBox(0F, 0F, -1F, 7, 2, 1, 0F); // Box 231 this is part of the radiator
		bodyModel[186].setRotationPoint(-19.75F, 2.55F, -3.5F);
		bodyModel[186].rotateAngleY = 1.57079633F;

		bodyModel[187].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 247 airhorn flattop
		bodyModel[187].setRotationPoint(-18F, -17F, -6F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 248 airhorn flattop
		bodyModel[188].setRotationPoint(-18F, -17F, 5F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 249 airhorn flattop
		bodyModel[189].setRotationPoint(-15F, -16F, 5F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 250 airhorn flattop
		bodyModel[190].setRotationPoint(-15F, -16F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 236 turn light L
		bodyModel[191].setRotationPoint(22.01F, 4.75F, -3.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 237 turn light R
		bodyModel[192].setRotationPoint(22.01F, 4.75F, 1.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 198 that other kind of hitch that comes in handy in the hit game Beam.NG Drive
		bodyModel[193].setRotationPoint(22.5F, 4.75F, -0.5F);

		bodyModel[194].addShapeBox(0F, 0F, -1F, 8, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 199 cab aeromatic
		bodyModel[194].setRotationPoint(-16.5F, -19F, 0.5F);
		bodyModel[194].rotateAngleY = 1.57079633F;

		bodyModel[195].addShapeBox(0F, 0F, -1F, 8, 4, 1, 0F,0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 200 cab aeromatic
		bodyModel[195].setRotationPoint(-16.5F, -19F, -8.5F);
		bodyModel[195].rotateAngleY = 1.57079633F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201 cab aeromatic
		bodyModel[196].setRotationPoint(-11.5F, -20F, -8.5F);

		bodyModel[197].addShapeBox(0F, 0F, -2F, 8, 1, 2, 0F,-0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 202 cab aeromatic
		bodyModel[197].setRotationPoint(-12.5F, -20F, -8.5F);
		bodyModel[197].rotateAngleY = 1.57079633F;

		bodyModel[198].addShapeBox(0F, 0F, -2F, 8, 1, 2, 0F,0F, 0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 203 cab aeromatic
		bodyModel[198].setRotationPoint(-12.5F, -20F, 0.5F);
		bodyModel[198].rotateAngleY = 1.57079633F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204 cab aeromatic
		bodyModel[199].setRotationPoint(-16.5F, -19F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 205 cab aeromatic
		bodyModel[200].setRotationPoint(-12.5F, -20F, -0.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206 cab aeromatic
		bodyModel[201].setRotationPoint(-11.5F, -20F, 0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207 cab aeromatic
		bodyModel[202].setRotationPoint(-11.5F, -20F, -0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 209 cab aeromatic
		bodyModel[203].setRotationPoint(-11.5F, -19F, -9.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 210 cab aeromatic
		bodyModel[204].setRotationPoint(-10.5F, -19F, -9.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 211 cab aeromatic
		bodyModel[205].setRotationPoint(-9.5F, -19F, -9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212 cab
		bodyModel[206].setRotationPoint(-17.5F, -15.5F, -10.5F);

		bodyModel[207].addBox(0F, 0F, -1F, 19, 4, 1, 0F); // Box 213 cab aeromatic
		bodyModel[207].setRotationPoint(-6.5F, -19F, -9.5F);
		bodyModel[207].rotateAngleY = 1.57079633F;

		bodyModel[208].addShapeBox(0F, 0F, -1F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 214 cab aeromatic
		bodyModel[208].setRotationPoint(-6.5F, -15F, -9.5F);
		bodyModel[208].rotateAngleY = 1.57079633F;

		bodyModel[209].addShapeBox(0F, 0F, -2F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 215 cab aeromatic
		bodyModel[209].setRotationPoint(-17.5F, -15.5F, -9.5F);
		bodyModel[209].rotateAngleY = 1.57079633F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 216
		bodyModel[210].setRotationPoint(-18.5F, -15.5F, -9.5F);

		bodyModel[211].addShapeBox(0F, 0F, -4F, 9, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 217 cab aeromatic
		bodyModel[211].setRotationPoint(-15.5F, -15.5F, -9.5F);
		bodyModel[211].rotateAngleY = 1.57079633F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F); // Box 218 cab aeromatic
		bodyModel[212].setRotationPoint(-11.5F, -19F, 8.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 219 cab aeromatic
		bodyModel[213].setRotationPoint(-10.5F, -19F, 8.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 220 cab aeromatic
		bodyModel[214].setRotationPoint(-9.5F, -19F, 8.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221 cab
		bodyModel[215].setRotationPoint(-17.5F, -15.5F, 9.5F);

		bodyModel[216].addShapeBox(0F, 0F, -2F, 9, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 222 cab aeromatic
		bodyModel[216].setRotationPoint(-17.5F, -15.5F, 0.5F);
		bodyModel[216].rotateAngleY = 1.57079633F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F); // Box 223
		bodyModel[217].setRotationPoint(-18.5F, -15.5F, 8.5F);

		bodyModel[218].addShapeBox(0F, 0F, -4F, 9, 1, 4, 0F,0F, 0.5F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 224 cab aeromatic
		bodyModel[218].setRotationPoint(-15.5F, -15.5F, 0.5F);
		bodyModel[218].rotateAngleY = 1.57079633F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 225 cab aeromatic
		bodyModel[219].setRotationPoint(-17.5F, -16F, -0.5F);

		bodyModel[220].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226 cab regulah
		bodyModel[220].setRotationPoint(-6.5F, -15.5F, -9.5F);
		bodyModel[220].rotateAngleY = 1.57079633F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227 cab regulah
		bodyModel[221].setRotationPoint(-6.5F, -15.5F, -0.5F);

		bodyModel[222].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228 cab regulah
		bodyModel[222].setRotationPoint(-6.5F, -15.5F, 0.5F);
		bodyModel[222].rotateAngleY = 1.57079633F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 198 exhaust
		bodyModel[223].setRotationPoint(-7F, 0.5F, 6.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F); // Box 200 exhaust
		bodyModel[224].setRotationPoint(-5F, 0.5F, 6.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0.75F, 4.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -5.25F, 0F, -1.25F, 4.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -5.25F); // Box 231 exhaust
		bodyModel[225].setRotationPoint(-13F, 0.5F, 6.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0.75F, -5.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, 4.75F, 0F, -1.25F, -5.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, 4.75F); // Box 232 exhaust
		bodyModel[226].setRotationPoint(-13F, 0.5F, -8.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 233 exhaust or air intake
		bodyModel[227].setRotationPoint(-7F, 0.5F, -8.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F); // Box 234 exhaust or air intake
		bodyModel[228].setRotationPoint(-5F, 0.5F, -8.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 235 air intake
		bodyModel[229].setRotationPoint(-8F, 0.5F, -8.5F);

		bodyModel[230].addShapeBox(0F, 0F, -2F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 2.25F, -0.25F, 0F, 2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, -0.25F, 0F, -0.25F, -0.25F); // Box 236 air intake
		bodyModel[230].setRotationPoint(-8F, 0.5F, -6.5F);
		bodyModel[230].rotateAngleY = 1.57079633F;

		bodyModel[231].addBox(0F, -2F, -1F, 3, 4, 2, 0F); // Box 237 air filter
		bodyModel[231].setRotationPoint(-11F, -1F, 1.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F); // Box 238 air intake
		bodyModel[232].setRotationPoint(-8F, -2F, 0.5F);

		bodyModel[233].addShapeBox(0F, -1F, -2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 239 air filter
		bodyModel[233].setRotationPoint(-11F, -1F, 1.5F);

		bodyModel[234].addShapeBox(0F, -1F, 1F, 3, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240 air filter
		bodyModel[234].setRotationPoint(-11F, -1F, 1.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.75F, -0.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 241 air intake air ram
		bodyModel[235].setRotationPoint(-5F, -21.5F, -8.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 242 air intake cap
		bodyModel[236].setRotationPoint(-5F, -20.5F, -8.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 243 exhaust tip
		bodyModel[237].setRotationPoint(-5F, -21.5F, 6.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F); // Box 244 exhaust tip
		bodyModel[238].setRotationPoint(-5F, -21.5F, -8.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 202 air intake
		bodyModel[239].setRotationPoint(-5F, -20F, -5.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.75F, -0.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 241 air intake air ram
		bodyModel[240].setRotationPoint(-5F, -22F, -5.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 242 air intake cap
		bodyModel[241].setRotationPoint(-5F, -21F, -5.5F);

		bodyModel[242].addShapeBox(0F, 0F, -2F, 6, 2, 2, 0F,-1.75F, 0.5F, -0.25F, 0F, -3.25F, -0.25F, 0F, -3.25F, -0.25F, -1.75F, 0.5F, -0.25F, -0.25F, -2.5F, -0.25F, 0F, 2.75F, -0.25F, 0F, 2.75F, -0.25F, -0.25F, -2.5F, -0.25F); // Box 248 air intake
		bodyModel[242].setRotationPoint(-5F, -5.5F, -5.5F);
		bodyModel[242].rotateAngleY = 1.57079633F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F); // Box 249 air intake
		bodyModel[243].setRotationPoint(-5F, -2.5F, 0.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 250 air intake
		bodyModel[244].setRotationPoint(-8F, -2.5F, 0.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 251 trailer cable holder
		bodyModel[245].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 16, 6, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, 0F, -1.5F, -8F, 0F, -1.5F, -8F, -3F, 0F, -8F, -3F); // Box 252 cull trailer cables
		bodyModel[246].setRotationPoint(-2.5F, -6F, -1.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 16, 3, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 253 cull full fender
		bodyModel[247].setRotationPoint(4.5F, 1.5F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 16, 3, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 254 cull full fender
		bodyModel[248].setRotationPoint(4.5F, 1.5F, 5F);

		bodyModel[249].addShapeBox(0F, 0F, -1F, 18, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0.35F, 0F, 0F, 0.35F); // Box 255 full fender holder (dont texture mid section)
		bodyModel[249].setRotationPoint(3.5F, 2.5F, -9F);
		bodyModel[249].rotateAngleY = 1.57079633F;

		bodyModel[250].addShapeBox(0F, 0F, -1F, 18, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.85F, 0F, 0F, -0.85F); // Box 256 full fender holder (dont texture mid section)
		bodyModel[250].setRotationPoint(20.5F, 2.5F, -9F);
		bodyModel[250].rotateAngleY = 1.57079633F;

		bodyModel[251].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 257 airhorn raised top
		bodyModel[251].setRotationPoint(-18F, -17F, -7F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 258 airhorn raised top
		bodyModel[252].setRotationPoint(-16F, -16F, -7F);

		bodyModel[253].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 259 airhorn raised top
		bodyModel[253].setRotationPoint(-18F, -17F, 6F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 260 airhorn raised top
		bodyModel[254].setRotationPoint(-16F, -16F, 6F);

		bodyModel[255].addShapeBox(0F, 0F, -1F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[255].setRotationPoint(-19.5F, -9F, -9.5F);
		bodyModel[255].rotateAngleY = 1.57079633F;

		bodyModel[256].addShapeBox(0F, 0F, -2F, 7, 2, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[256].setRotationPoint(-19.5F, -6F, -9.5F);
		bodyModel[256].rotateAngleY = 1.57079633F;

		bodyModel[257].addShapeBox(0F, -2.25F, -3.75F, 0, 6, 6, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 226 steeringwhool
		bodyModel[257].setRotationPoint(-16F, -8F, -6.25F);
		bodyModel[257].rotateAngleZ = 0.97738438F;

		bodyModel[258].addBox(-6F, -0.5F, -0.5F, 6, 1, 1, 0F); // Box 227 steering collumn
		bodyModel[258].setRotationPoint(-16.01F, -8F, -6.25F);
		bodyModel[258].rotateAngleZ = 0.97738438F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 0, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -1.25F, -3F, 0F, 1.25F, -3F, 0F, 1.25F, -3F, -7F, -1.25F, -3F, -7F); // Box 181 dashboard GLOW
		bodyModel[259].setRotationPoint(-18.49F, -9F, -9.5F);

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 260
		bodyModel[260].setRotationPoint(10F, 1.5F, -2F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 261 the TRANS mission
		bodyModel[261].setRotationPoint(-10F, 2F, -1.5F);

		bodyModel[262].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 262 floor
		bodyModel[262].setRotationPoint(-19.5F, -1.5F, -9.5F);

		bodyModel[263].addBox(0F, 0F, -1F, 19, 3, 1, 0F); // Box 263
		bodyModel[263].setRotationPoint(-19.5F, -4F, -9.5F);
		bodyModel[263].rotateAngleY = 1.57079633F;

		bodyModel[264].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 264 floor
		bodyModel[264].setRotationPoint(-19.5F, -1.5F, 2.5F);

		bodyModel[265].addShapeBox(0F, 0F, -1F, 6, 8, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49 seat
		bodyModel[265].setRotationPoint(-13F, -12.5F, -9.25F);
		bodyModel[265].rotateAngleY = 1.57079633F;

		bodyModel[266].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 51 seat
		bodyModel[266].setRotationPoint(-16F, -4.5F, -9.25F);

		bodyModel[267].addShapeBox(0F, 0F, -1F, 6, 8, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268 seat
		bodyModel[267].setRotationPoint(-13F, -12.5F, 3.25F);
		bodyModel[267].rotateAngleY = 1.57079633F;

		bodyModel[268].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 269 seat
		bodyModel[268].setRotationPoint(-16F, -4.5F, 3.25F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 270 cab engine cover
		bodyModel[269].setRotationPoint(-18.5F, -5F, -2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 271 cab engine cover
		bodyModel[270].setRotationPoint(-19.5F, -4F, -3.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 272 cab engine cover
		bodyModel[271].setRotationPoint(-19.5F, -4F, 2.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 273 seat holdy
		bodyModel[272].setRotationPoint(-15.5F, -3.5F, -8.75F);

		bodyModel[273].addBox(0F, 0F, 0F, 3, 2, 5, 0F); // Box 274 seat holdy
		bodyModel[273].setRotationPoint(-15.5F, -3.5F, 3.75F);

		bodyModel[274].addShapeBox(-3F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275 holy SHIFT
		bodyModel[274].setRotationPoint(-14.01F, -7.75F, -2.25F);
		bodyModel[274].rotateAngleZ = 1.37881011F;

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 276 the shitft holder
		bodyModel[275].setRotationPoint(-15.5F, -5F, -3F);

		bodyModel[276].addBox(0F, 0F, -5F, 19, 1, 5, 0F); // Box 189 this is a bed
		bodyModel[276].setRotationPoint(-11.5F, -5.5F, -9.5F);
		bodyModel[276].rotateAngleY = 1.57079633F;

		bodyModel[277].addShapeBox(0F, 0F, -1F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[277].setRotationPoint(-19.5F, -9F, 1.5F);
		bodyModel[277].rotateAngleY = 1.57079633F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[278].setRotationPoint(-19.4F, -9F, -1.5F);
		bodyModel[278].rotateAngleY = -0.57595865F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[279].setRotationPoint(-19.4F, -7F, -1.5F);
		bodyModel[279].rotateAngleY = -0.57595865F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[280].setRotationPoint(-18.5F, -8F, 1F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[281].setRotationPoint(-18.5F, -9F, 1F);

		bodyModel[282].addShapeBox(1.01F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1.25F, -2F, 0F, 1.25F, -2F, 0F, 1.25F, -2F, -4F, -1.25F, -2F, -4F); // Box 285 dashboard2 GLOW
		bodyModel[282].setRotationPoint(-19.4F, -9F, -1.5F);
		bodyModel[282].rotateAngleY = -0.57595865F;

		bodyModel[283].addBox(0F, 0F, -1F, 7, 4, 1, 0F); // Box 286
		bodyModel[283].setRotationPoint(-11.5F, -4.5F, -9.5F);
		bodyModel[283].rotateAngleY = 1.57079633F;

		bodyModel[284].addBox(0F, 0F, -1F, 7, 4, 1, 0F); // Box 287
		bodyModel[284].setRotationPoint(-11.5F, -4.5F, 2.5F);
		bodyModel[284].rotateAngleY = 1.57079633F;

		bodyModel[285].addBox(0F, 0F, -4F, 14, 1, 4, 0F); // Box 288 this is the high rise sleeper bed
		bodyModel[285].setRotationPoint(-10.5F, -12.5F, -9.5F);
		bodyModel[285].rotateAngleY = 1.57079633F;

		bodyModel[286].addBox(0F, 0F, 0F, 4, 9, 5, 0F); // Box 289 cabin shelf thing
		bodyModel[286].setRotationPoint(-10.5F, -14.5F, 4.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290 high roof shelf thing
		bodyModel[287].setRotationPoint(-10.5F, -17.5F, 5.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 142 door frame
		bodyModel[288].setRotationPoint(-18.5F, -13.5F, -10.5F);

		bodyModel[289].addShapeBox(0F, 0F, -1F, 1, 5, 1, 0F,-0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 292 door frame
		bodyModel[289].setRotationPoint(-18.5F, -13.5F, 10.5F);

		bodyModel[290].addShapeBox(0F, 0F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F); // Box 290 fueltank support small R
		bodyModel[290].setRotationPoint(-4.5F, 5.5F, 3.75F);
		bodyModel[290].rotateAngleY = 1.57079633F;

		bodyModel[291].addShapeBox(0F, 0F, -1F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291 fueltank support small R
		bodyModel[291].setRotationPoint(-4.5F, 2.5F, 3.75F);
		bodyModel[291].rotateAngleY = 1.57079633F;

		bodyModel[292].addBox(0F, 0F, 0F, 7, 5, 2, 0F); // Box 292 fueltank R small
		bodyModel[292].setRotationPoint(-5.5F, 2.75F, 6.75F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293 fueltank R small
		bodyModel[293].setRotationPoint(-5.5F, 4.25F, 8.75F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 294 fueltank R small
		bodyModel[294].setRotationPoint(-5.5F, 4.25F, 4.75F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F); // Box 195 emblem
		bodyModel[295].setRotationPoint(-20.76F, -7.15F, -0.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298 glowey markerlights
		bodyModel[296].setRotationPoint(-19F, 0.25F, -10.51F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299 glowey markerlights
		bodyModel[297].setRotationPoint(-19F, 0.25F, 10.51F);

		bodyModel[298].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 300 license plate
		bodyModel[298].setRotationPoint(22.51F, 7.75F, -2F);

		bodyModel[299].addShapeBox(0F, 0F, -1F, 18, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 301 glowey markerlights
		bodyModel[299].setRotationPoint(-22.02F, 6F, -9F);
		bodyModel[299].rotateAngleY = 1.57079633F;

		bodyModel[300].addShapeBox(0F, 0F, -2F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302 bumper bullbar CULL
		bodyModel[300].setRotationPoint(-21.01F, 3F, -10.5F);
		bodyModel[300].rotateAngleY = 1.57079633F;

		bodyModel[301].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 303 bullbar bit
		bodyModel[301].setRotationPoint(-21.75F, -1F, -10F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Box 304 bullbar bit
		bodyModel[302].setRotationPoint(-21.75F, -1F, 9F);

		bodyModel[303].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 305 bullbar bit
		bodyModel[303].setRotationPoint(-22F, -5F, -4F);

		bodyModel[304].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 306 bullbar bit
		bodyModel[304].setRotationPoint(-22F, -5F, 3F);

		bodyModel[305].addBox(0F, 0F, 0F, 13, 0, 18, 0F); // Box 307 bullbar bit
		bodyModel[305].setRotationPoint(-21.5F, -5F, -9F);
		bodyModel[305].rotateAngleZ = -1.57079633F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 104 long antenna
		bodyModel[306].setRotationPoint(-17.5F, -13.5F, 11.5F);
		bodyModel[306].rotateAngleZ = -3.14159265F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 307 long antenna
		bodyModel[307].setRotationPoint(-17.5F, -13.5F, -11.5F);
		bodyModel[307].rotateAngleZ = -3.14159265F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 308 reverse light
		bodyModel[308].setRotationPoint(-7F, -14.5F, -12F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 309 reverse light
		bodyModel[309].setRotationPoint(-7F, -14.5F, 10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 1, 14, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 310
		bodyModel[310].setRotationPoint(-4F, -8F, -7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 311 headlight late
		bodyModel[311].setRotationPoint(-20.55F, 0.45F, 7.25F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 312 headlight late
		bodyModel[312].setRotationPoint(-20.55F, 0.45F, -9.25F);

		bodyModel[313].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 313 license plate front 2
		bodyModel[313].setRotationPoint(-21.02F, 6.5F, -2F);

		bodyModel[314].addShapeBox(0F, 0F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 314 cb radio
		bodyModel[314].setRotationPoint(-18.5F, -14.5F, -1.5F);
		bodyModel[314].rotateAngleY = 1.57079633F;

		bodyModel[315].addShapeBox(0F, 0F, -1F, 3, 8, 0, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, -4F, 0F); // Box 315 cb radio cord
		bodyModel[315].setRotationPoint(-19F, -14F, -2F);
		bodyModel[315].rotateAngleY = 1.57079633F;

		bodyModel[316].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0.5F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0.5F, 1F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 316 cull sunshield
		bodyModel[316].setRotationPoint(-20.5F, -15.5F, 0.5F);
		bodyModel[316].rotateAngleY = 1.57079633F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 317 cull sunshield
		bodyModel[317].setRotationPoint(-20.5F, -15.5F, -0.5F);

		bodyModel[318].addShapeBox(0F, 0F, -1F, 9, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -2.5F, 1F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 318 cull sunshield
		bodyModel[318].setRotationPoint(-20.5F, -15.5F, -9.5F);
		bodyModel[318].rotateAngleY = 1.57079633F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box markerlight2
		bodyModel[319].setRotationPoint(-18F, -16F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 320 markerlight2
		bodyModel[320].setRotationPoint(-18F, -16F, 8F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 321 markerlight2
		bodyModel[321].setRotationPoint(-18.05F, -16.35F, -3F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 322 markerlight2
		bodyModel[322].setRotationPoint(-18.05F, -16.35F, 2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.02F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.02F, -0.5F, 0F); // Box 323 markerlight2
		bodyModel[323].setRotationPoint(-18.1F, -16.4F, -0.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 0, 9, 0F,0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -0.5F, 0F, -1.75F, -0.45F, -1.05F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0.5F, 0F, -1.75F, 0.45F, -1.05F); // Box 324 sleeper bit
		bodyModel[324].setRotationPoint(-15F, -16.01F, 0.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 0, 9, 0F,-1.75F, -0.45F, -1.05F, 2F, -0.5F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0.45F, -1.05F, 2F, 0.5F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 325 sleeper bit
		bodyModel[325].setRotationPoint(-15F, -16.01F, -9.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[326].setRotationPoint(-8.5F, -21F, -8.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[327].setRotationPoint(-8.5F, -22F, -8.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 328 cull beacon holder
		bodyModel[328].setRotationPoint(-9F, -20F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 329 antenna 2
		bodyModel[329].setRotationPoint(-12F, -14.5F, -10.5F);
		bodyModel[329].rotateAngleZ = -3.14159265F;

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 330 antenna 2
		bodyModel[330].setRotationPoint(-12F, -14.5F, 10.5F);
		bodyModel[330].rotateAngleZ = -3.14159265F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 331 reverselight 2
		bodyModel[331].setRotationPoint(-17F, -16F, -12F);
		bodyModel[331].rotateAngleZ = -0.13962634F;

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332 reverselight 2
		bodyModel[332].setRotationPoint(-17F, -16F, 10F);
		bodyModel[332].rotateAngleZ = -0.13962634F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 333 suspension bit
		bodyModel[333].setRotationPoint(18F, 7F, 2.5F);
		bodyModel[333].rotateAngleZ = 0.43633231F;

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 334 suspension bit
		bodyModel[334].setRotationPoint(18F, 7F, -4.5F);
		bodyModel[334].rotateAngleZ = 0.43633231F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 335 suspension bit
		bodyModel[335].setRotationPoint(8F, 7F, -4.5F);
		bodyModel[335].rotateAngleZ = 0.43633231F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 336 suspension bit
		bodyModel[336].setRotationPoint(8F, 7F, 2.5F);
		bodyModel[336].rotateAngleZ = 0.43633231F;

		bodyModel[337].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 337 cull suspension bit
		bodyModel[337].setRotationPoint(8F, 6.75F, -4.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 338 cull suspension bit
		bodyModel[338].setRotationPoint(8F, 6.75F, 3.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339 roof ac box thing idk
		bodyModel[339].setRotationPoint(-16F, -19.5F, -2.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340 roof ac box mount
		bodyModel[340].setRotationPoint(-15.5F, -16.5F, -1.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 0, 6, 10, 0F,0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -5.5F, 0.5F, -1F, -5.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -5.5F, 0F, -3F, -5.5F); // Box 341 roof ac box mesh
		bodyModel[341].setRotationPoint(-16.01F, -19.5F, -2.5F);
	}
}