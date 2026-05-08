//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 53ft_reefer
// Model Creator: Bidahochi
// Created on: 27.12.2024 - 13:48:40
// Last changed on: 27.12.2024 - 13:48:40

package bidahochi.foxdrives.models.trailers; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modelfueltanker53ft extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Modelfueltanker53ft() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[206];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 315, 15, textureX, textureY); // Box 124 axle 3-4
		bodyModel[1] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[2] = new ModelRendererTurbo(this, 339, 22, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[3] = new ModelRendererTurbo(this, 339, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[4] = new ModelRendererTurbo(this, 313, 17, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[5] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[6] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[7] = new ModelRendererTurbo(this, 339, 11, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[8] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[9] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[10] = new ModelRendererTurbo(this, 339, 11, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[11] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[12] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[13] = new ModelRendererTurbo(this, 339, 22, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[14] = new ModelRendererTurbo(this, 339, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[15] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[16] = new ModelRendererTurbo(this, 313, 29, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[17] = new ModelRendererTurbo(this, 315, 15, textureX, textureY); // Box 124 axle 3-4
		bodyModel[18] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[19] = new ModelRendererTurbo(this, 339, 22, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[20] = new ModelRendererTurbo(this, 339, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[21] = new ModelRendererTurbo(this, 313, 17, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[22] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[23] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[24] = new ModelRendererTurbo(this, 339, 11, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[25] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[26] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[27] = new ModelRendererTurbo(this, 339, 11, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[28] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[29] = new ModelRendererTurbo(this, 323, 22, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[30] = new ModelRendererTurbo(this, 339, 22, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[31] = new ModelRendererTurbo(this, 339, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[32] = new ModelRendererTurbo(this, 323, 16, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[33] = new ModelRendererTurbo(this, 313, 29, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[34] = new ModelRendererTurbo(this, 180, 38, textureX, textureY); // Box 147
		bodyModel[35] = new ModelRendererTurbo(this, 194, 15, textureX, textureY); // Box 176
		bodyModel[36] = new ModelRendererTurbo(this, 194, 15, textureX, textureY); // Box 177
		bodyModel[37] = new ModelRendererTurbo(this, 186, 12, textureX, textureY); // Box 178
		bodyModel[38] = new ModelRendererTurbo(this, 204, 15, textureX, textureY); // Box 179
		bodyModel[39] = new ModelRendererTurbo(this, 204, 15, textureX, textureY); // Box 180
		bodyModel[40] = new ModelRendererTurbo(this, 93, 9, textureX, textureY); // Box 183
		bodyModel[41] = new ModelRendererTurbo(this, 186, 8, textureX, textureY); // Box 184
		bodyModel[42] = new ModelRendererTurbo(this, 76, 13, textureX, textureY, "brakeLight"); // Box 247 taillight
		bodyModel[43] = new ModelRendererTurbo(this, 76, 13, textureX, textureY, "brakeLight"); // Box 186 taillight
		bodyModel[44] = new ModelRendererTurbo(this, 76, 13, textureX, textureY, "brakeLight"); // Box 187 taillight
		bodyModel[45] = new ModelRendererTurbo(this, 76, 13, textureX, textureY, "brakeLight"); // Box 188 taillight
		bodyModel[46] = new ModelRendererTurbo(this, 210, 15, textureX, textureY); // Box 1961
		bodyModel[47] = new ModelRendererTurbo(this, 93, 14, textureX, textureY); // Box 1962
		bodyModel[48] = new ModelRendererTurbo(this, 293, 30, textureX, textureY); // Box 153
		bodyModel[49] = new ModelRendererTurbo(this, 293, 30, textureX, textureY); // Box 154
		bodyModel[50] = new ModelRendererTurbo(this, 293, 30, textureX, textureY); // Box 157
		bodyModel[51] = new ModelRendererTurbo(this, 293, 30, textureX, textureY); // Box 158
		bodyModel[52] = new ModelRendererTurbo(this, 313, 2, textureX, textureY); // Box 1967
		bodyModel[53] = new ModelRendererTurbo(this, 169, 20, textureX, textureY); // Box 352 i am KING PIN
		bodyModel[54] = new ModelRendererTurbo(this, 164, 19, textureX, textureY); // Box 161
		bodyModel[55] = new ModelRendererTurbo(this, 164, 19, textureX, textureY); // Box 162
		bodyModel[56] = new ModelRendererTurbo(this, 164, 19, textureX, textureY); // Box 163
		bodyModel[57] = new ModelRendererTurbo(this, 164, 19, textureX, textureY); // Box 164
		bodyModel[58] = new ModelRendererTurbo(this, 168, 32, textureX, textureY); // Box 165
		bodyModel[59] = new ModelRendererTurbo(this, 168, 32, textureX, textureY); // Box 166
		bodyModel[60] = new ModelRendererTurbo(this, 159, 18, textureX, textureY); // Box 168
		bodyModel[61] = new ModelRendererTurbo(this, 159, 18, textureX, textureY); // Box 169
		bodyModel[62] = new ModelRendererTurbo(this, 167, 29, textureX, textureY); // Box 172
		bodyModel[63] = new ModelRendererTurbo(this, 167, 29, textureX, textureY); // Box 173
		bodyModel[64] = new ModelRendererTurbo(this, 157, 29, textureX, textureY); // Box 200
		bodyModel[65] = new ModelRendererTurbo(this, 157, 29, textureX, textureY); // Box 201
		bodyModel[66] = new ModelRendererTurbo(this, 155, 25, textureX, textureY); // Box 174
		bodyModel[67] = new ModelRendererTurbo(this, 155, 25, textureX, textureY); // Box 2735
		bodyModel[68] = new ModelRendererTurbo(this, 280, 2, textureX, textureY); // Box 2750 spare tire
		bodyModel[69] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 2751 spare tire
		bodyModel[70] = new ModelRendererTurbo(this, 296, 3, textureX, textureY); // Box 2752 spare tire
		bodyModel[71] = new ModelRendererTurbo(this, 268, 9, textureX, textureY, "cull"); // Box 2753 spare holder
		bodyModel[72] = new ModelRendererTurbo(this, 281, 13, textureX, textureY, "cull"); // Box 2754 spare holder
		bodyModel[73] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 170
		bodyModel[74] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 171
		bodyModel[75] = new ModelRendererTurbo(this, 323, 28, textureX, textureY); // Box 101 wheel 3 cover
		bodyModel[76] = new ModelRendererTurbo(this, 323, 28, textureX, textureY); // Box 102 wheel 3 cover
		bodyModel[77] = new ModelRendererTurbo(this, 323, 28, textureX, textureY); // Box 103 wheel 4 cover
		bodyModel[78] = new ModelRendererTurbo(this, 323, 28, textureX, textureY); // Box 104 wheel 4 cover
		bodyModel[79] = new ModelRendererTurbo(this, 93, 7, textureX, textureY); // Box 108 hazmat plac
		bodyModel[80] = new ModelRendererTurbo(this, 93, 7, textureX, textureY); // Box 111 hazmat placc
		bodyModel[81] = new ModelRendererTurbo(this, 93, 7, textureX, textureY); // Box 113 hazmat plac
		bodyModel[82] = new ModelRendererTurbo(this, 180, 24, textureX, textureY); // Box 110
		bodyModel[83] = new ModelRendererTurbo(this, 180, 31, textureX, textureY); // Box 110
		bodyModel[84] = new ModelRendererTurbo(this, 110, 19, textureX, textureY); // Box 119
		bodyModel[85] = new ModelRendererTurbo(this, 81, 8, textureX, textureY, "lamp"); // Box 122 cullbox glow
		bodyModel[86] = new ModelRendererTurbo(this, 81, 8, textureX, textureY, "lamp"); // Box 123 cullbox glow
		bodyModel[87] = new ModelRendererTurbo(this, 83, 13, textureX, textureY); // Box 124
		bodyModel[88] = new ModelRendererTurbo(this, 226, 31, textureX, textureY); // Box 129
		bodyModel[89] = new ModelRendererTurbo(this, 226, 24, textureX, textureY); // Box 130
		bodyModel[90] = new ModelRendererTurbo(this, 68, 13, textureX, textureY, "leftTurnLight"); // Box 131 turnlight L
		bodyModel[91] = new ModelRendererTurbo(this, 68, 13, textureX, textureY, "rightTurnLight"); // Box 132 turnlight R
		bodyModel[92] = new ModelRendererTurbo(this, 4, 36, textureX, textureY); // Box 104
		bodyModel[93] = new ModelRendererTurbo(this, 68, 3, textureX, textureY, "lamp"); // Box 105 marker lights L
		bodyModel[94] = new ModelRendererTurbo(this, 180, 52, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 4, 73, textureX, textureY); // Box 107
		bodyModel[96] = new ModelRendererTurbo(this, 68, 5, textureX, textureY, "lamp"); // Box 108 marker lights R
		bodyModel[97] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 107 cull
		bodyModel[98] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 110 cull
		bodyModel[99] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 111 cull
		bodyModel[100] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 112 cull
		bodyModel[101] = new ModelRendererTurbo(this, 4, 51, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 116 cull
		bodyModel[103] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 117 cull
		bodyModel[104] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 118 cull
		bodyModel[105] = new ModelRendererTurbo(this, 69, 19, textureX, textureY, "cull"); // Box 119 cull
		bodyModel[106] = new ModelRendererTurbo(this, 144, 19, textureX, textureY, "cull"); // Box 120 rear ladder cullbox
		bodyModel[107] = new ModelRendererTurbo(this, 131, 20, textureX, textureY, "cull"); // Box 121 rear ladder cullbox
		bodyModel[108] = new ModelRendererTurbo(this, 247, 13, textureX, textureY); // Box 123 gabe newell from valve
		bodyModel[109] = new ModelRendererTurbo(this, 4, 88, textureX, textureY, "cull"); // Box 124 cullbox
		bodyModel[110] = new ModelRendererTurbo(this, 247, 13, textureX, textureY); // Box 125 gabe newell from valve
		bodyModel[111] = new ModelRendererTurbo(this, 247, 13, textureX, textureY); // Box 126 gabe newell from valve
		bodyModel[112] = new ModelRendererTurbo(this, 68, 7, textureX, textureY, "lamp"); // Box 127 rear taillight top
		bodyModel[113] = new ModelRendererTurbo(this, 71, 101, textureX, textureY); // Box 128 rear dickbutt hose
		bodyModel[114] = new ModelRendererTurbo(this, 64, 29, textureX, textureY); // Box 129 hose holder L
		bodyModel[115] = new ModelRendererTurbo(this, 64, 29, textureX, textureY); // Box 131 hose holder R
		bodyModel[116] = new ModelRendererTurbo(this, 186, 15, textureX, textureY, "cull"); // Box 132 cullbox
		bodyModel[117] = new ModelRendererTurbo(this, 75, 8, textureX, textureY, "lamp"); // Box 134 cullbox glow
		bodyModel[118] = new ModelRendererTurbo(this, 28, -15, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 28, 2, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 83, 12, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 93, 7, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 83, 12, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 110, 10, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 110, 10, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 180, 65, textureX, textureY); // Box 142 Toolbox R
		bodyModel[126] = new ModelRendererTurbo(this, 180, 77, textureX, textureY); // Box 143 Toolbox L
		bodyModel[127] = new ModelRendererTurbo(this, 236, 12, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 236, 12, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 235, 5, textureX, textureY); // Box 146 fuel hatch
		bodyModel[130] = new ModelRendererTurbo(this, 43, 113, textureX, textureY); // Box 250 air intake
		bodyModel[131] = new ModelRendererTurbo(this, 43, 113, textureX, textureY); // Box 234 exhaust or air intake
		bodyModel[132] = new ModelRendererTurbo(this, 43, 113, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 54, 109, textureX, textureY); // Box 197 exhaust
		bodyModel[134] = new ModelRendererTurbo(this, 18, 101, textureX, textureY); // Box 198 exhaust
		bodyModel[135] = new ModelRendererTurbo(this, 51, 101, textureX, textureY); // Box 249 air intake
		bodyModel[136] = new ModelRendererTurbo(this, 43, 107, textureX, textureY); // Box 198 exhaust
		bodyModel[137] = new ModelRendererTurbo(this, 55, 101, textureX, textureY); // Box 154
		bodyModel[138] = new ModelRendererTurbo(this, 51, 101, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 23, 108, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 51, 101, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 75, 109, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 70, 109, textureX, textureY); // Box 159
		bodyModel[143] = new ModelRendererTurbo(this, 2, 101, textureX, textureY, "cull"); // Box 160 cullbox
		bodyModel[144] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 161 pressure tank
		bodyModel[145] = new ModelRendererTurbo(this, 1, 9, textureX, textureY, "cull"); // Box 162 cullbox
		bodyModel[146] = new ModelRendererTurbo(this, 110, 2, textureX, textureY); // Box 163
		bodyModel[147] = new ModelRendererTurbo(this, 110, 2, textureX, textureY); // Box 164
		bodyModel[148] = new ModelRendererTurbo(this, 65, 109, textureX, textureY); // Box 165
		bodyModel[149] = new ModelRendererTurbo(this, 70, 21, textureX, textureY); // Box 167
		bodyModel[150] = new ModelRendererTurbo(this, 70, 21, textureX, textureY); // Box 168
		bodyModel[151] = new ModelRendererTurbo(this, 70, 21, textureX, textureY); // Box 169
		bodyModel[152] = new ModelRendererTurbo(this, 70, 21, textureX, textureY); // Box 170
		bodyModel[153] = new ModelRendererTurbo(this, 110, 6, textureX, textureY); // Box 153
		bodyModel[154] = new ModelRendererTurbo(this, 110, 6, textureX, textureY); // Box 154
		bodyModel[155] = new ModelRendererTurbo(this, 389, 58, textureX, textureY); // Box 124 axle 3-4
		bodyModel[156] = new ModelRendererTurbo(this, 393, 22, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[157] = new ModelRendererTurbo(this, 393, 34, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[158] = new ModelRendererTurbo(this, 393, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[159] = new ModelRendererTurbo(this, 393, 16, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[160] = new ModelRendererTurbo(this, 393, 22, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[161] = new ModelRendererTurbo(this, 393, 40, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[162] = new ModelRendererTurbo(this, 393, 16, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[163] = new ModelRendererTurbo(this, 393, 22, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[164] = new ModelRendererTurbo(this, 393, 40, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[165] = new ModelRendererTurbo(this, 393, 16, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[166] = new ModelRendererTurbo(this, 393, 22, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[167] = new ModelRendererTurbo(this, 393, 34, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[168] = new ModelRendererTurbo(this, 393, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[169] = new ModelRendererTurbo(this, 393, 16, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[170] = new ModelRendererTurbo(this, 390, 62, textureX, textureY); // Box 153
		bodyModel[171] = new ModelRendererTurbo(this, 390, 62, textureX, textureY); // Box 154
		bodyModel[172] = new ModelRendererTurbo(this, 393, 56, textureX, textureY, "wheel"); // Box 102 wheel 3 cover
		bodyModel[173] = new ModelRendererTurbo(this, 393, 56, textureX, textureY, "wheel"); // Box 103 wheel 4 cover
		bodyModel[174] = new ModelRendererTurbo(this, 394, 51, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[175] = new ModelRendererTurbo(this, 403, 51, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[176] = new ModelRendererTurbo(this, 223, 78, textureX, textureY); // Box 176
		bodyModel[177] = new ModelRendererTurbo(this, 223, 78, textureX, textureY); // Box 177
		bodyModel[178] = new ModelRendererTurbo(this, 346, 58, textureX, textureY); // Box 124 axle 3-4 MIDLIFT
		bodyModel[179] = new ModelRendererTurbo(this, 376, 22, textureX, textureY); // Box 71 wheel 3 MIDLIFT
		bodyModel[180] = new ModelRendererTurbo(this, 376, 34, textureX, textureY); // Box 74 wheel 3 MIDLIFT
		bodyModel[181] = new ModelRendererTurbo(this, 376, 28, textureX, textureY); // Box 76 wheel 3 MIDLIFT
		bodyModel[182] = new ModelRendererTurbo(this, 376, 16, textureX, textureY); // Box 71 wheel 3 MIDLIFT
		bodyModel[183] = new ModelRendererTurbo(this, 376, 22, textureX, textureY); // Box 71 wheel 4 MIDLIFT
		bodyModel[184] = new ModelRendererTurbo(this, 376, 34, textureX, textureY); // Box 74 wheel 4 MIDLIFT
		bodyModel[185] = new ModelRendererTurbo(this, 376, 28, textureX, textureY); // Box 76 wheel 4 MIDLIFT
		bodyModel[186] = new ModelRendererTurbo(this, 376, 16, textureX, textureY); // Box 71 wheel 4 MIDLIFT
		bodyModel[187] = new ModelRendererTurbo(this, 373, 62, textureX, textureY); // Box 154
		bodyModel[188] = new ModelRendererTurbo(this, 376, 56, textureX, textureY); // Box 102 wheel 3 cover MIDLIFT
		bodyModel[189] = new ModelRendererTurbo(this, 376, 56, textureX, textureY); // Box 103 wheel 4 cover MIDLIFT
		bodyModel[190] = new ModelRendererTurbo(this, 394, 80, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 110, 2, textureX, textureY); // Box 153
		bodyModel[192] = new ModelRendererTurbo(this, 110, 2, textureX, textureY); // Box 154
		bodyModel[193] = new ModelRendererTurbo(this, 222, 70, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 222, 70, textureX, textureY); // Box 196
		bodyModel[195] = new ModelRendererTurbo(this, 353, 80, textureX, textureY); // Box 199
		bodyModel[196] = new ModelRendererTurbo(this, 377, 46, textureX, textureY); // Box 200
		bodyModel[197] = new ModelRendererTurbo(this, 377, 51, textureX, textureY); // Box 201
		bodyModel[198] = new ModelRendererTurbo(this, 13, 4, textureX, textureY); // Box 202
		bodyModel[199] = new ModelRendererTurbo(this, 13, 16, textureX, textureY); // Box 203
		bodyModel[200] = new ModelRendererTurbo(this, 23, 113, textureX, textureY); // Box 204
		bodyModel[201] = new ModelRendererTurbo(this, 373, 62, textureX, textureY); // Box 205
		bodyModel[202] = new ModelRendererTurbo(this, 154, -6, textureX, textureY); // Box 206
		bodyModel[203] = new ModelRendererTurbo(this, 302, 68, textureX, textureY); // Box 193
		bodyModel[204] = new ModelRendererTurbo(this, 334, 68, textureX, textureY); // Box 194
		bodyModel[205] = new ModelRendererTurbo(this, 302, 70, textureX, textureY); // Box 1970

		bodyModel[0].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[0].setRotationPoint(-4.5F, 6F, -9.5F);

		bodyModel[1].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[1].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[2].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[2].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[3].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[3].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[4].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[4].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[5].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[5].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[6].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[6].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[7].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[7].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[8].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[8].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[9].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[9].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[10].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[10].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[11].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[11].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[12].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[12].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[13].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[13].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[14].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[14].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[15].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[15].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[16].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[16].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[17].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[17].setRotationPoint(5.5F, 6F, -9.5F);

		bodyModel[18].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[18].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[19].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[19].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[20].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[20].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[21].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[21].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[22].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[22].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[23].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[23].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[24].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[24].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[25].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[25].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[26].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[26].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[27].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[27].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[28].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[28].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[29].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[29].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[30].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[30].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[31].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[31].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[32].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[32].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[33].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[33].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[34].addBox(0F, 0F, 0F, 83, 1, 11, 0F); // Box 147
		bodyModel[34].setRotationPoint(-70F, 0F, -5.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 176
		bodyModel[35].setRotationPoint(9F, 3F, 3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 177
		bodyModel[36].setRotationPoint(9F, 3F, -4F);

		bodyModel[37].addBox(0F, 0F, -1F, 16, 1, 1, 0F); // Box 178
		bodyModel[37].setRotationPoint(12F, 6F, -8F);
		bodyModel[37].rotateAngleY = 1.57079633F;

		bodyModel[38].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 179
		bodyModel[38].setRotationPoint(12F, 3F, -4F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 180
		bodyModel[39].setRotationPoint(12F, 3F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183
		bodyModel[40].setRotationPoint(12.5F, 3F, -2F);

		bodyModel[41].addBox(0F, 0F, -1F, 21, 2, 1, 0F); // Box 184
		bodyModel[41].setRotationPoint(12F, 1F, -10.5F);
		bodyModel[41].rotateAngleY = 1.57079633F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 taillight
		bodyModel[42].setRotationPoint(12.1F, 1F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 taillight
		bodyModel[43].setRotationPoint(12.1F, 1F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 187 taillight
		bodyModel[44].setRotationPoint(12.1F, 1F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 188 taillight
		bodyModel[45].setRotationPoint(12.1F, 1F, 4F);

		bodyModel[46].addBox(0F, 0F, -3F, 8, 2, 3, 0F); // Box 1961
		bodyModel[46].setRotationPoint(9F, 1F, -4F);
		bodyModel[46].rotateAngleY = 1.57079633F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 1962
		bodyModel[47].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 153
		bodyModel[48].setRotationPoint(-7.5F, 3F, -4F);

		bodyModel[49].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 154
		bodyModel[49].setRotationPoint(-7.5F, 3F, 2F);

		bodyModel[50].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 157
		bodyModel[50].setRotationPoint(2.5F, 3F, 2F);

		bodyModel[51].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 158
		bodyModel[51].setRotationPoint(2.5F, 3F, -4F);

		bodyModel[52].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 1967
		bodyModel[52].setRotationPoint(-8.5F, 1F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352 i am KING PIN
		bodyModel[53].setRotationPoint(-64.5F, 0.5F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[54].setRotationPoint(-53F, 2F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 162
		bodyModel[55].setRotationPoint(-53F, 2F, 4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 163
		bodyModel[56].setRotationPoint(-46F, 2F, 4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 164
		bodyModel[57].setRotationPoint(-46F, 2F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[58].setRotationPoint(-50F, 6F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[59].setRotationPoint(-50F, 6F, 4F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 168
		bodyModel[60].setRotationPoint(-49.5F, 2.5F, -4.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		bodyModel[61].setRotationPoint(-49.5F, 2.5F, 3.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
		bodyModel[62].setRotationPoint(-50.5F, 3F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 173
		bodyModel[63].setRotationPoint(-50.5F, 3F, 4F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 200
		bodyModel[64].setRotationPoint(-50F, 2F, -4.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 201
		bodyModel[65].setRotationPoint(-50F, 2F, 2.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 174
		bodyModel[66].setRotationPoint(-53F, 1F, -5F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 2735
		bodyModel[67].setRotationPoint(-53F, 1F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0.5F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2750 spare tire
		bodyModel[68].setRotationPoint(-28F, 1.25F, -4.5F);

		bodyModel[69].addShapeBox(0F, 0F, 3F, 3, 2, 3, 0F,-0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F); // Box 2751 spare tire
		bodyModel[69].setRotationPoint(-25.5F, 1.25F, -4.5F);

		bodyModel[70].addShapeBox(0F, 0F, 3F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F); // Box 2752 spare tire
		bodyModel[70].setRotationPoint(-30.5F, 1.25F, -4.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 2753 spare holder
		bodyModel[71].setRotationPoint(-27F, 0.75F, -4F);

		bodyModel[72].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // Box 2754 spare holder
		bodyModel[72].setRotationPoint(-31.5F, 0.77F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 170
		bodyModel[73].setRotationPoint(-49.5F, 7F, -4.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 171
		bodyModel[74].setRotationPoint(-49.5F, 7F, 3.5F);

		bodyModel[75].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 101 wheel 3 cover
		bodyModel[75].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[76].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover
		bodyModel[76].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[77].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover
		bodyModel[77].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[78].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 104 wheel 4 cover
		bodyModel[78].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[79].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[79].setRotationPoint(11.02F, -6F, 6.25F);
		bodyModel[79].rotateAngleY = 1.57079633F;
		bodyModel[79].rotateAngleZ = -0.78539816F;

		bodyModel[80].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 111 hazmat placc
		bodyModel[80].setRotationPoint(-69.02F, -1F, -8F);
		bodyModel[80].rotateAngleY = 1.57079633F;
		bodyModel[80].rotateAngleZ = -0.78539816F;

		bodyModel[81].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 113 hazmat plac
		bodyModel[81].setRotationPoint(-3F, -2.25F, -8.76F);
		bodyModel[81].rotateAngleY = -3.14159265F;
		bodyModel[81].rotateAngleZ = -0.78539816F;

		bodyModel[82].addBox(0F, 0F, 0F, 17, 1, 5, 0F); // Box 110
		bodyModel[82].setRotationPoint(-69F, 0F, 5.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 17, 1, 5, 0F); // Box 110
		bodyModel[83].setRotationPoint(-69F, 0F, -10.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 119
		bodyModel[84].setRotationPoint(-70.5F, -10.5F, -2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122 cullbox glow
		bodyModel[85].setRotationPoint(-68.5F, -1F, 9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 123 cullbox glow
		bodyModel[86].setRotationPoint(-68.5F, -1F, -10.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[87].setRotationPoint(-69.01F, -2F, -10F);

		bodyModel[88].addBox(0F, 0F, 0F, 25, 1, 5, 0F); // Box 129
		bodyModel[88].setRotationPoint(-12F, 0F, 5.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 25, 1, 5, 0F); // Box 130
		bodyModel[89].setRotationPoint(-12F, 0F, -10.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 131 turnlight L
		bodyModel[90].setRotationPoint(12.1F, 1F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 132 turnlight R
		bodyModel[91].setRotationPoint(12.1F, 1F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 81, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 104
		bodyModel[92].setRotationPoint(-70F, -12F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 80, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105 marker lights L
		bodyModel[93].setRotationPoint(-69.5F, -4F, -8.51F);
		bodyModel[93].rotateAngleX = 0.98611103F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 81, 2, 9, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 106
		bodyModel[94].setRotationPoint(-70F, -2F, -4.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 81, 8, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[95].setRotationPoint(-70F, -12F, 2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 80, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 marker lights R
		bodyModel[96].setRotationPoint(-69.5F, -4F, 8.51F);
		bodyModel[96].rotateAngleX = -0.98611103F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 8F, -2F, 0F, 8F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.5F, 0F, 8F, 2.5F, 0F, 8F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 107 cull
		bodyModel[97].setRotationPoint(-61F, -3F, 4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 8F, -2F, 0F, 8F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.5F, 0F, 8F, 2.5F, 0F, 8F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 110 cull
		bodyModel[98].setRotationPoint(-43F, -3F, 4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 8F, -2F, 0F, 8F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.5F, 0F, 8F, 2.5F, 0F, 8F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 111 cull
		bodyModel[99].setRotationPoint(-25F, -3F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -2F, 0F, 8F, -2F, 0F, 8F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.5F, 0F, 8F, 2.5F, 0F, 8F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 112 cull
		bodyModel[100].setRotationPoint(-7F, -3F, 4F);

		bodyModel[101].addBox(0F, 0F, 0F, 81, 16, 5, 0F); // Box 115
		bodyModel[101].setRotationPoint(-70F, -16.01F, -2.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.75F, 0F, 8F, 0.75F, 0F, 8F, -2F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 8F, -0.75F, 0F, 8F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 116 cull
		bodyModel[102].setRotationPoint(-61F, -3F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.75F, 0F, 8F, 0.75F, 0F, 8F, -2F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 8F, -0.75F, 0F, 8F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 117 cull
		bodyModel[103].setRotationPoint(-43F, -3F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.75F, 0F, 8F, 0.75F, 0F, 8F, -2F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 8F, -0.75F, 0F, 8F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 118 cull
		bodyModel[104].setRotationPoint(-25F, -3F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.75F, 0F, 8F, 0.75F, 0F, 8F, -2F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 8F, -0.75F, 0F, 8F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 119 cull
		bodyModel[105].setRotationPoint(-7F, -3F, -8F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Box 120 rear ladder cullbox
		bodyModel[106].setRotationPoint(11F, -12F, -2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121 rear ladder cullbox
		bodyModel[107].setRotationPoint(11F, -15F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 123 gabe newell from valve
		bodyModel[108].setRotationPoint(8F, -16.75F, 2.5F);
		bodyModel[108].rotateAngleX = 0.34906585F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 81, 3, 7, 0F,-0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, -0.5F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Box 124 cullbox
		bodyModel[109].setRotationPoint(-70F, -17.5F, -3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 125 gabe newell from valve
		bodyModel[110].setRotationPoint(5F, -16.75F, 2.5F);
		bodyModel[110].rotateAngleX = 0.34906585F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 126 gabe newell from valve
		bodyModel[111].setRotationPoint(3F, -16.75F, 2.5F);
		bodyModel[111].rotateAngleX = 0.34906585F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 127 rear taillight top
		bodyModel[112].setRotationPoint(10.15F, -17F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 128 rear dickbutt hose
		bodyModel[113].setRotationPoint(10.1F, -2F, -1F);

		bodyModel[114].addShapeBox(0F, -1F, -1F, 37, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129 hose holder L
		bodyModel[114].setRotationPoint(-27F, -0.75F, -7.25F);
		bodyModel[114].rotateAngleX = 0.87266463F;

		bodyModel[115].addShapeBox(0F, -1F, -1F, 37, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131 hose holder R
		bodyModel[115].setRotationPoint(-27F, -0.75F, 7.25F);
		bodyModel[115].rotateAngleX = -0.87266463F;

		bodyModel[116].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, -2F, 20F); // Box 132 cullbox
		bodyModel[116].setRotationPoint(10F, 1F, -9.5F);

		bodyModel[117].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 20.05F, 0F, 0F, 20.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 20.05F, 0F, 0F, 20.05F); // Box 134 cullbox glow
		bodyModel[117].setRotationPoint(11.25F, 0.75F, -9.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 16, 17, 0F); // Box 135
		bodyModel[118].setRotationPoint(-70.01F, -16F, -8.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 0, 16, 17, 0F); // Box 136
		bodyModel[119].setRotationPoint(11.01F, -16F, -8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[120].setRotationPoint(-5F, -4F, -8.75F);

		bodyModel[121].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 138
		bodyModel[121].setRotationPoint(-3F, -2.25F, 8.76F);
		bodyModel[121].rotateAngleY = -3.14159265F;
		bodyModel[121].rotateAngleZ = -0.78539816F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(-5F, -4F, 8.75F);

		bodyModel[123].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 140
		bodyModel[123].setRotationPoint(-12F, 1F, 5.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 141
		bodyModel[124].setRotationPoint(-12F, 1F, -10.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 14, 5, 6, 0F); // Box 142 Toolbox R
		bodyModel[125].setRotationPoint(-29F, 1F, 2.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 14, 5, 6, 0F); // Box 143 Toolbox L
		bodyModel[126].setRotationPoint(-29F, 1F, -8.5F);

		bodyModel[127].addShapeBox(0F, 1F, 0F, 1, 2, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 144
		bodyModel[127].setRotationPoint(-51F, -18F, -3.5F);

		bodyModel[128].addShapeBox(0F, 1F, 0F, 1, 2, 7, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 145
		bodyModel[128].setRotationPoint(-10F, -18F, -3.5F);

		bodyModel[129].addShapeBox(0F, 1F, 0F, 4, 1, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 146 fuel hatch
		bodyModel[129].setRotationPoint(-32F, -18F, -2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 250 air intake
		bodyModel[130].setRotationPoint(-10.5F, 0.5F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F); // Box 234 exhaust or air intake
		bodyModel[131].setRotationPoint(-12.5F, 4F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -1.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1.75F, 0F, -0.25F); // Box 149
		bodyModel[132].setRotationPoint(-12.5F, 1F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 197 exhaust
		bodyModel[133].setRotationPoint(-12.5F, 3F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, -0.5F, -2.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, 1.75F, 0F, 0F, -2.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 1.75F); // Box 198 exhaust
		bodyModel[134].setRotationPoint(-26.5F, 4F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 249 air intake
		bodyModel[135].setRotationPoint(-28.5F, 4.25F, 1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 198 exhaust
		bodyModel[136].setRotationPoint(-28.5F, 4.25F, 3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 154
		bodyModel[137].setRotationPoint(-30.5F, 4.25F, 1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 155
		bodyModel[138].setRotationPoint(-30.5F, 4.25F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 3.75F, -0.25F, 0F, 3.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -4.25F, -0.25F, 0F, -4.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 156
		bodyModel[139].setRotationPoint(-28.5F, 4.25F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.25F, -0.25F); // Box 157
		bodyModel[140].setRotationPoint(-21.5F, 0.25F, -1F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 158
		bodyModel[141].setRotationPoint(-17F, 1F, -0.35F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 159
		bodyModel[142].setRotationPoint(-23F, 1F, 0.55F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 6, 5, 0F); // Box 160 cullbox
		bodyModel[143].setRotationPoint(-31F, 0.5F, 2F);

		bodyModel[144].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 161 pressure tank
		bodyModel[144].setRotationPoint(-10F, 5F, -2.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 162 cullbox
		bodyModel[145].setRotationPoint(-9.5F, 0.5F, -3F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 163
		bodyModel[146].setRotationPoint(-52F, 1F, 5.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 164
		bodyModel[147].setRotationPoint(-52F, 1F, -10.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 165
		bodyModel[148].setRotationPoint(-25F, -0.5F, -1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[149].setRotationPoint(-69.98F, -3F, 4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 168
		bodyModel[150].setRotationPoint(-69.98F, -3F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 169
		bodyModel[151].setRotationPoint(10.98F, -3F, 4F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 170
		bodyModel[152].setRotationPoint(10.98F, -3F, -8F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 153
		bodyModel[153].setRotationPoint(-20F, 1F, 5.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 154
		bodyModel[154].setRotationPoint(-20F, 1F, -10.5F);

		bodyModel[155].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[155].setRotationPoint(-14.5F, 6F, -9.5F);

		bodyModel[156].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[156].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[157].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[157].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[158].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[158].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[159].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[159].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[160].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[160].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[161].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[161].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[162].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[162].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[163].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[163].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[164].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[164].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[165].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[165].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[166].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[166].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[167].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[167].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[168].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[168].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[169].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[169].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[170].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 153
		bodyModel[170].setRotationPoint(-17.5F, 3F, -4F);

		bodyModel[171].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 154
		bodyModel[171].setRotationPoint(-17.5F, 3F, 2F);

		bodyModel[172].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover
		bodyModel[172].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[173].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover
		bodyModel[173].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[174].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[174].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[175].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[175].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[176].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 176
		bodyModel[176].setRotationPoint(-20F, 0F, 5.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 8, 1, 5, 0F); // Box 177
		bodyModel[177].setRotationPoint(-20F, 0F, -10.5F);

		bodyModel[178].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4 MIDLIFT
		bodyModel[178].setRotationPoint(-35.5F, 5.25F, -9.5F);

		bodyModel[179].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3 MIDLIFT
		bodyModel[179].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[180].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3 MIDLIFT
		bodyModel[180].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[181].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3 MIDLIFT
		bodyModel[181].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[182].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3 MIDLIFT
		bodyModel[182].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[183].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4 MIDLIFT
		bodyModel[183].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[184].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 MIDLIFT
		bodyModel[184].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[185].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4 MIDLIFT
		bodyModel[185].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[186].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4 MIDLIFT
		bodyModel[186].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[187].setRotationPoint(-38.5F, 2.25F, 2F);

		bodyModel[188].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover MIDLIFT
		bodyModel[188].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[189].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover MIDLIFT
		bodyModel[189].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[190].addBox(0F, 0F, 0F, 10, 2, 6, 0F); // Box 191
		bodyModel[190].setRotationPoint(-18.5F, 1F, -3F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 153
		bodyModel[191].setRotationPoint(-41F, 1F, 5.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 0, 3, 5, 0F); // Box 154
		bodyModel[192].setRotationPoint(-41F, 1F, -10.5F);

		bodyModel[193].addBox(-2F, 0F, 0F, 11, 1, 5, 0F); // Box 194
		bodyModel[193].setRotationPoint(-39F, 0F, 5.5F);

		bodyModel[194].addBox(-2F, 0F, 0F, 11, 1, 5, 0F); // Box 196
		bodyModel[194].setRotationPoint(-39F, 0F, -10.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 8, 2, 6, 0F); // Box 199
		bodyModel[195].setRotationPoint(-39.5F, 1F, -3F);

		bodyModel[196].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[196].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[197].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[197].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 202
		bodyModel[198].setRotationPoint(-21F, 5F, -2.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 203
		bodyModel[199].setRotationPoint(-20.5F, 0.5F, -3F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 4.75F, -0.25F, 0F, 4.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -5.25F, -0.25F, 0F, -5.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 204
		bodyModel[200].setRotationPoint(-26.5F, 4.25F, 1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[201].setRotationPoint(-38.5F, 2.25F, -4F);

		bodyModel[202].addBox(0F, 0F, 0F, 0, 4, 15, 0F); // Box 206
		bodyModel[202].setRotationPoint(13.01F, 3F, -7.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 193
		bodyModel[203].setRotationPoint(10.5F, 2F, -10F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 194
		bodyModel[204].setRotationPoint(10.5F, 2F, 5F);

		bodyModel[205].addBox(-20F, 0F, 0F, 20, 1, 1, 0F); // Box 1970
		bodyModel[205].setRotationPoint(9.5F, 1F, -10F);
		bodyModel[205].rotateAngleY = -1.57079633F;
	}
}