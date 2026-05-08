//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 53ft_flat
// Model Creator: RileyCoyote
// Created on: 27.12.2024 - 13:48:40
// Last changed on: 27.12.2024 - 13:48:40

package bidahochi.foxdrives.models.trailers; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modelflatbed53Foot extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modelflatbed53Foot() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[152];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 147
		bodyModel[1] = new ModelRendererTurbo(this, 102, 83, textureX, textureY); // Box 177
		bodyModel[2] = new ModelRendererTurbo(this, 96, 87, textureX, textureY); // Box 178
		bodyModel[3] = new ModelRendererTurbo(this, 111, 82, textureX, textureY); // Box 179
		bodyModel[4] = new ModelRendererTurbo(this, 72, 65, textureX, textureY); // Box 183
		bodyModel[5] = new ModelRendererTurbo(this, 91, 78, textureX, textureY); // Box 184
		bodyModel[6] = new ModelRendererTurbo(this, 24, 65, textureX, textureY); // Box 1962
		bodyModel[7] = new ModelRendererTurbo(this, 42, 78, textureX, textureY); // Box 193
		bodyModel[8] = new ModelRendererTurbo(this, 60, 78, textureX, textureY); // Box 194
		bodyModel[9] = new ModelRendererTurbo(this, 35, 80, textureX, textureY); // Box 1970
		bodyModel[10] = new ModelRendererTurbo(this, 5, 37, textureX, textureY); // Box 352 i am KING PIN
		bodyModel[11] = new ModelRendererTurbo(this, 11, 46, textureX, textureY); // Box 161
		bodyModel[12] = new ModelRendererTurbo(this, 11, 46, textureX, textureY); // Box 162
		bodyModel[13] = new ModelRendererTurbo(this, 21, 46, textureX, textureY); // Box 163
		bodyModel[14] = new ModelRendererTurbo(this, 21, 46, textureX, textureY); // Box 164
		bodyModel[15] = new ModelRendererTurbo(this, 15, 42, textureX, textureY); // Box 165
		bodyModel[16] = new ModelRendererTurbo(this, 15, 42, textureX, textureY); // Box 166
		bodyModel[17] = new ModelRendererTurbo(this, 16, 45, textureX, textureY); // Box 168 landing leg
		bodyModel[18] = new ModelRendererTurbo(this, 16, 45, textureX, textureY); // Box 169 landing leg
		bodyModel[19] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 172
		bodyModel[20] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 173
		bodyModel[21] = new ModelRendererTurbo(this, 14, 36, textureX, textureY); // Box 200
		bodyModel[22] = new ModelRendererTurbo(this, 14, 36, textureX, textureY); // Box 201
		bodyModel[23] = new ModelRendererTurbo(this, 8, 29, textureX, textureY); // Box 174
		bodyModel[24] = new ModelRendererTurbo(this, 8, 29, textureX, textureY); // Box 2735
		bodyModel[25] = new ModelRendererTurbo(this, 16, 52, textureX, textureY); // Box 170 landing leg foot
		bodyModel[26] = new ModelRendererTurbo(this, 16, 52, textureX, textureY); // Box 171 landing leg foot
		bodyModel[27] = new ModelRendererTurbo(this, 23, 109, textureX, textureY); // Box 106
		bodyModel[28] = new ModelRendererTurbo(this, 23, 107, textureX, textureY); // Box 107
		bodyModel[29] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box 108 hazmat plac
		bodyModel[30] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box 111 hazmat placc
		bodyModel[31] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box 108 hazmat plac
		bodyModel[32] = new ModelRendererTurbo(this, 50, 7, textureX, textureY); // Box 113 hazmat plac
		bodyModel[33] = new ModelRendererTurbo(this, 36, 66, textureX, textureY, "brakeLight"); // Box 247 taillight
		bodyModel[34] = new ModelRendererTurbo(this, 36, 66, textureX, textureY, "brakeLight"); // Box 186 taillight
		bodyModel[35] = new ModelRendererTurbo(this, 36, 66, textureX, textureY, "brakeLight"); // Box 187 taillight
		bodyModel[36] = new ModelRendererTurbo(this, 36, 66, textureX, textureY, "brakeLight"); // Box 188 taillight
		bodyModel[37] = new ModelRendererTurbo(this, 43, 66, textureX, textureY, "leftTurnLight"); // Box 131 turnlight L
		bodyModel[38] = new ModelRendererTurbo(this, 43, 66, textureX, textureY, "rightTurnLight"); // Box 132 turnlight R
		bodyModel[39] = new ModelRendererTurbo(this, 41, 58, textureX, textureY); // Box 206
		bodyModel[40] = new ModelRendererTurbo(this, 187, 46, textureX, textureY); // Box 124 axle 3-4
		bodyModel[41] = new ModelRendererTurbo(this, 192, 28, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[42] = new ModelRendererTurbo(this, 203, 22, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[43] = new ModelRendererTurbo(this, 203, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[44] = new ModelRendererTurbo(this, 192, 34, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[45] = new ModelRendererTurbo(this, 192, 28, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[46] = new ModelRendererTurbo(this, 203, 11, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[47] = new ModelRendererTurbo(this, 192, 34, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[48] = new ModelRendererTurbo(this, 214, 28, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[49] = new ModelRendererTurbo(this, 203, 11, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[50] = new ModelRendererTurbo(this, 214, 34, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[51] = new ModelRendererTurbo(this, 214, 28, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[52] = new ModelRendererTurbo(this, 203, 22, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[53] = new ModelRendererTurbo(this, 203, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[54] = new ModelRendererTurbo(this, 214, 34, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[55] = new ModelRendererTurbo(this, 143, 46, textureX, textureY); // Box 124 axle 3-4
		bodyModel[56] = new ModelRendererTurbo(this, 148, 28, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[57] = new ModelRendererTurbo(this, 159, 22, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[58] = new ModelRendererTurbo(this, 159, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[59] = new ModelRendererTurbo(this, 148, 34, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[60] = new ModelRendererTurbo(this, 148, 28, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[61] = new ModelRendererTurbo(this, 159, 11, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[62] = new ModelRendererTurbo(this, 148, 34, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[63] = new ModelRendererTurbo(this, 170, 28, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[64] = new ModelRendererTurbo(this, 159, 11, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[65] = new ModelRendererTurbo(this, 170, 34, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[66] = new ModelRendererTurbo(this, 170, 28, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[67] = new ModelRendererTurbo(this, 159, 22, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[68] = new ModelRendererTurbo(this, 159, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[69] = new ModelRendererTurbo(this, 170, 34, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[70] = new ModelRendererTurbo(this, 189, 58, textureX, textureY); // Box 153
		bodyModel[71] = new ModelRendererTurbo(this, 145, 58, textureX, textureY); // Box 158
		bodyModel[72] = new ModelRendererTurbo(this, 159, 34, textureX, textureY, "wheel"); // Box 101 wheel 3 cover
		bodyModel[73] = new ModelRendererTurbo(this, 203, 34, textureX, textureY, "wheel"); // Box 102 wheel 3 cover
		bodyModel[74] = new ModelRendererTurbo(this, 203, 40, textureX, textureY, "wheel"); // Box 103 wheel 4 cover
		bodyModel[75] = new ModelRendererTurbo(this, 159, 40, textureX, textureY, "wheel"); // Box 104 wheel 4 cover
		bodyModel[76] = new ModelRendererTurbo(this, 192, 107, textureX, textureY); // Box 124 axle 3-4
		bodyModel[77] = new ModelRendererTurbo(this, 192, 89, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[78] = new ModelRendererTurbo(this, 203, 83, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[79] = new ModelRendererTurbo(this, 203, 89, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[80] = new ModelRendererTurbo(this, 192, 95, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[81] = new ModelRendererTurbo(this, 192, 89, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[82] = new ModelRendererTurbo(this, 203, 72, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[83] = new ModelRendererTurbo(this, 192, 95, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[84] = new ModelRendererTurbo(this, 214, 89, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[85] = new ModelRendererTurbo(this, 203, 72, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[86] = new ModelRendererTurbo(this, 214, 95, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[87] = new ModelRendererTurbo(this, 214, 89, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[88] = new ModelRendererTurbo(this, 203, 83, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[89] = new ModelRendererTurbo(this, 203, 89, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[90] = new ModelRendererTurbo(this, 214, 95, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[91] = new ModelRendererTurbo(this, 194, 119, textureX, textureY); // Box 153
		bodyModel[92] = new ModelRendererTurbo(this, 216, 119, textureX, textureY); // Box 154
		bodyModel[93] = new ModelRendererTurbo(this, 203, 95, textureX, textureY); // Box 102 wheel 3 cover
		bodyModel[94] = new ModelRendererTurbo(this, 203, 101, textureX, textureY); // Box 103 wheel 4 cover
		bodyModel[95] = new ModelRendererTurbo(this, 194, 41, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[96] = new ModelRendererTurbo(this, 214, 41, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[97] = new ModelRendererTurbo(this, 150, 41, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[98] = new ModelRendererTurbo(this, 170, 41, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[99] = new ModelRendererTurbo(this, 194, 102, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[100] = new ModelRendererTurbo(this, 214, 102, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[101] = new ModelRendererTurbo(this, 140, 69, textureX, textureY); // Box 1967
		bodyModel[102] = new ModelRendererTurbo(this, 233, 46, textureX, textureY); // Box 124 axle 3-4 MIDLIFT
		bodyModel[103] = new ModelRendererTurbo(this, 238, 28, textureX, textureY); // Box 71 wheel 3 MIDLIFT
		bodyModel[104] = new ModelRendererTurbo(this, 249, 22, textureX, textureY); // Box 74 wheel 3 MIDLIFT
		bodyModel[105] = new ModelRendererTurbo(this, 249, 28, textureX, textureY); // Box 76 wheel 3 MIDLIFT
		bodyModel[106] = new ModelRendererTurbo(this, 238, 34, textureX, textureY); // Box 71 wheel 3 MIDLIFT
		bodyModel[107] = new ModelRendererTurbo(this, 260, 28, textureX, textureY); // Box 71 wheel 4 MIDLIFT
		bodyModel[108] = new ModelRendererTurbo(this, 249, 22, textureX, textureY); // Box 74 wheel 4 MIDLIFT
		bodyModel[109] = new ModelRendererTurbo(this, 249, 28, textureX, textureY); // Box 76 wheel 4 MIDLIFT
		bodyModel[110] = new ModelRendererTurbo(this, 260, 34, textureX, textureY); // Box 71 wheel 4 MIDLIFT
		bodyModel[111] = new ModelRendererTurbo(this, 257, 58, textureX, textureY); // Box 154
		bodyModel[112] = new ModelRendererTurbo(this, 249, 34, textureX, textureY); // Box 102 wheel 3 cover MIDLIFT
		bodyModel[113] = new ModelRendererTurbo(this, 249, 40, textureX, textureY); // Box 103 wheel 4 cover MIDLIFT
		bodyModel[114] = new ModelRendererTurbo(this, 148, 78, textureX, textureY); // Box 191
		bodyModel[115] = new ModelRendererTurbo(this, 150, 87, textureX, textureY); // Box 199
		bodyModel[116] = new ModelRendererTurbo(this, 260, 41, textureX, textureY); // Box 200
		bodyModel[117] = new ModelRendererTurbo(this, 240, 41, textureX, textureY); // Box 201
		bodyModel[118] = new ModelRendererTurbo(this, 235, 58, textureX, textureY); // Box 205
		bodyModel[119] = new ModelRendererTurbo(this, 2, 4, textureX, textureY); // Box 142 Toolbox R
		bodyModel[120] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 143 Toolbox L
		bodyModel[121] = new ModelRendererTurbo(this, 65, 15, textureX, textureY); // Box 198
		bodyModel[122] = new ModelRendererTurbo(this, 118, 55, textureX, textureY); // Box 199
		bodyModel[123] = new ModelRendererTurbo(this, 73, 24, textureX, textureY); // Box 200
		bodyModel[124] = new ModelRendererTurbo(this, 70, 28, textureX, textureY); // Box 201
		bodyModel[125] = new ModelRendererTurbo(this, 73, 24, textureX, textureY); // Box 202
		bodyModel[126] = new ModelRendererTurbo(this, 70, 28, textureX, textureY); // Box 203
		bodyModel[127] = new ModelRendererTurbo(this, 40, 34, textureX, textureY); // Box 204
		bodyModel[128] = new ModelRendererTurbo(this, 64, 40, textureX, textureY); // Box 205
		bodyModel[129] = new ModelRendererTurbo(this, 40, 34, textureX, textureY); // Box 206
		bodyModel[130] = new ModelRendererTurbo(this, 64, 40, textureX, textureY); // Box 207
		bodyModel[131] = new ModelRendererTurbo(this, 102, 83, textureX, textureY); // Box 208
		bodyModel[132] = new ModelRendererTurbo(this, 111, 82, textureX, textureY); // Box 209
		bodyModel[133] = new ModelRendererTurbo(this, 211, 58, textureX, textureY); // Box 210
		bodyModel[134] = new ModelRendererTurbo(this, 167, 58, textureX, textureY); // Box 211
		bodyModel[135] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Box 212
		bodyModel[136] = new ModelRendererTurbo(this, 42, 64, textureX, textureY); // Box 213
		bodyModel[137] = new ModelRendererTurbo(this, 116, 84, textureX, textureY); // Box 214
		bodyModel[138] = new ModelRendererTurbo(this, 116, 84, textureX, textureY); // Box 215
		bodyModel[139] = new ModelRendererTurbo(this, 107, 61, textureX, textureY); // Box 218
		bodyModel[140] = new ModelRendererTurbo(this, 107, 61, textureX, textureY); // Box 218
		bodyModel[141] = new ModelRendererTurbo(this, 107, 61, textureX, textureY); // Box 220
		bodyModel[142] = new ModelRendererTurbo(this, 107, 61, textureX, textureY); // Box 221
		bodyModel[143] = new ModelRendererTurbo(this, 93, 45, textureX, textureY); // Box 222
		bodyModel[144] = new ModelRendererTurbo(this, 115, 62, textureX, textureY, "lamp"); // Box 223 L indicator front GLOW
		bodyModel[145] = new ModelRendererTurbo(this, 115, 62, textureX, textureY, "lamp"); // Box 224 R indicator front GLOW
		bodyModel[146] = new ModelRendererTurbo(this, 107, 58, textureX, textureY); // Box 146
		bodyModel[147] = new ModelRendererTurbo(this, 107, 58, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 57, 16, textureX, textureY); // Box 139
		bodyModel[149] = new ModelRendererTurbo(this, 57, 16, textureX, textureY); // Box 149
		bodyModel[150] = new ModelRendererTurbo(this, 50, 13, textureX, textureY); // Box 150
		bodyModel[151] = new ModelRendererTurbo(this, 50, 13, textureX, textureY); // Box 151

		bodyModel[0].addBox(0F, 0F, 0F, 83, 1, 21, 0F); // Box 147
		bodyModel[0].setRotationPoint(-70F, 0F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 177
		bodyModel[1].setRotationPoint(9F, 4F, -3.5F);

		bodyModel[2].addBox(0F, 0F, -1F, 16, 1, 1, 0F); // Box 178
		bodyModel[2].setRotationPoint(12F, 6F, -8F);
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 179
		bodyModel[3].setRotationPoint(12F, 3F, -3.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183
		bodyModel[4].setRotationPoint(12.5F, 3F, -2F);

		bodyModel[5].addBox(0F, 0F, -1F, 21, 2, 1, 0F); // Box 184
		bodyModel[5].setRotationPoint(12F, 1F, -10.5F);
		bodyModel[5].rotateAngleY = 1.57079633F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 1962
		bodyModel[6].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 193
		bodyModel[7].setRotationPoint(10.5F, 2F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 194
		bodyModel[8].setRotationPoint(10.5F, 2F, 5F);

		bodyModel[9].addBox(-20F, 0F, 0F, 20, 1, 1, 0F); // Box 1970
		bodyModel[9].setRotationPoint(9.5F, 1F, -10F);
		bodyModel[9].rotateAngleY = -1.57079633F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352 i am KING PIN
		bodyModel[10].setRotationPoint(-64.5F, 0.5F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[11].setRotationPoint(-53F, 2F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 162
		bodyModel[12].setRotationPoint(-53F, 2F, 4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 163
		bodyModel[13].setRotationPoint(-46F, 2F, 4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 164
		bodyModel[14].setRotationPoint(-46F, 2F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[15].setRotationPoint(-50F, 6F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[16].setRotationPoint(-50F, 6F, 4F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 168
		bodyModel[17].setRotationPoint(-49.5F, 2.5F, -4.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		bodyModel[18].setRotationPoint(-49.5F, 2.5F, 3.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
		bodyModel[19].setRotationPoint(-50.5F, 3F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 173
		bodyModel[20].setRotationPoint(-50.5F, 3F, 4F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 200
		bodyModel[21].setRotationPoint(-50F, 2F, -4.75F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 201
		bodyModel[22].setRotationPoint(-50F, 2F, 2.75F);

		bodyModel[23].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 174
		bodyModel[23].setRotationPoint(-53F, 1F, -5F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 2735
		bodyModel[24].setRotationPoint(-53F, 1F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 170
		bodyModel[25].setRotationPoint(-49.5F, 7F, -4.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 171
		bodyModel[26].setRotationPoint(-49.5F, 7F, 3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 82, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 106
		bodyModel[27].setRotationPoint(-69.5F, 0F, -10.51F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 82, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 107
		bodyModel[28].setRotationPoint(-69.5F, 0F, 10.51F);

		bodyModel[29].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[29].setRotationPoint(13.02F, -1F, 6F);
		bodyModel[29].rotateAngleY = 1.57079633F;
		bodyModel[29].rotateAngleZ = -0.78539816F;

		bodyModel[30].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 111 hazmat placc
		bodyModel[30].setRotationPoint(-71.01F, -1F, 6F);
		bodyModel[30].rotateAngleY = 1.57079633F;
		bodyModel[30].rotateAngleZ = -0.78539816F;

		bodyModel[31].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[31].setRotationPoint(-27F, -1F, 10.52F);
		bodyModel[31].rotateAngleY = -3.14159265F;
		bodyModel[31].rotateAngleZ = -0.78539816F;

		bodyModel[32].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 113 hazmat plac
		bodyModel[32].setRotationPoint(-27F, -1F, -10.52F);
		bodyModel[32].rotateAngleY = -3.14159265F;
		bodyModel[32].rotateAngleZ = -0.78539816F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 taillight
		bodyModel[33].setRotationPoint(12.1F, 1F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 taillight
		bodyModel[34].setRotationPoint(12.1F, 1F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 187 taillight
		bodyModel[35].setRotationPoint(12.1F, 1F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 188 taillight
		bodyModel[36].setRotationPoint(12.1F, 1F, 4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 131 turnlight L
		bodyModel[37].setRotationPoint(12.1F, 1F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 132 turnlight R
		bodyModel[38].setRotationPoint(12.1F, 1F, 8F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 4, 15, 0F); // Box 206
		bodyModel[39].setRotationPoint(13.02F, 3F, -7.5F);

		bodyModel[40].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[40].setRotationPoint(-4.5F, 6F, -9.5F);

		bodyModel[41].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[41].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[42].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[42].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[43].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[43].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[44].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[44].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[45].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[45].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[46].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[46].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[47].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[47].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[48].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[48].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[49].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[49].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[50].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[50].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[51].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[51].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[52].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[52].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[53].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[53].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[54].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[54].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[55].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[55].setRotationPoint(5.5F, 6F, -9.5F);

		bodyModel[56].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[56].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[57].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[57].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[58].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[58].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[59].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[59].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[60].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[60].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[61].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[61].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[62].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[62].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[63].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[63].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[64].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[64].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[65].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[65].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[66].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[66].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[67].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[67].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[68].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[68].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[69].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[69].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[70].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 153
		bodyModel[70].setRotationPoint(-7.5F, 3F, -4F);

		bodyModel[71].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 158
		bodyModel[71].setRotationPoint(2.5F, 3F, -4F);

		bodyModel[72].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 101 wheel 3 cover
		bodyModel[72].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[73].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover
		bodyModel[73].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[74].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover
		bodyModel[74].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[75].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 104 wheel 4 cover
		bodyModel[75].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[76].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[76].setRotationPoint(-14.5F, 6F, -9.5F);

		bodyModel[77].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[77].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[78].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[78].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[79].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[79].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[80].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[80].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[81].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[81].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[82].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[82].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[83].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[83].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[84].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[84].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[85].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[85].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[86].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[86].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[87].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[87].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[88].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[88].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[89].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[89].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[90].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[90].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[91].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 153
		bodyModel[91].setRotationPoint(-17.5F, 3F, -4F);

		bodyModel[92].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 154
		bodyModel[92].setRotationPoint(-17.5F, 3F, 2F);

		bodyModel[93].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover
		bodyModel[93].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[94].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover
		bodyModel[94].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[95].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[95].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[96].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[96].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[97].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[97].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[98].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[98].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[99].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[99].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[100].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[100].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[101].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 1967
		bodyModel[101].setRotationPoint(-8.5F, 1F, -3F);

		bodyModel[102].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4 MIDLIFT
		bodyModel[102].setRotationPoint(-35.5F, 5.25F, -9.5F);

		bodyModel[103].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3 MIDLIFT
		bodyModel[103].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[104].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3 MIDLIFT
		bodyModel[104].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[105].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3 MIDLIFT
		bodyModel[105].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[106].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3 MIDLIFT
		bodyModel[106].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[107].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4 MIDLIFT
		bodyModel[107].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[108].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 MIDLIFT
		bodyModel[108].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[109].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4 MIDLIFT
		bodyModel[109].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[110].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4 MIDLIFT
		bodyModel[110].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[111].setRotationPoint(-38.5F, 2.25F, 2F);

		bodyModel[112].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover MIDLIFT
		bodyModel[112].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[113].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover MIDLIFT
		bodyModel[113].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 10, 2, 6, 0F); // Box 191
		bodyModel[114].setRotationPoint(-18.5F, 1F, -3F);

		bodyModel[115].addBox(0F, 0F, 0F, 8, 2, 6, 0F); // Box 199
		bodyModel[115].setRotationPoint(-39.5F, 1F, -3F);

		bodyModel[116].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[116].setRotationPoint(-35.5F, 5.25F, 9F);

		bodyModel[117].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[117].setRotationPoint(-35.5F, 5.25F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[118].setRotationPoint(-38.5F, 2.25F, -4F);

		bodyModel[119].addBox(0F, 0F, 0F, 14, 5, 6, 0F); // Box 142 Toolbox R
		bodyModel[119].setRotationPoint(-29F, 1F, 2.55F);

		bodyModel[120].addBox(0F, 0F, 0F, 14, 5, 6, 0F); // Box 143 Toolbox L
		bodyModel[120].setRotationPoint(-29F, 1F, -8.55F);

		bodyModel[121].addShapeBox(0F, -1F, 0F, 9, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[121].setRotationPoint(-70F, 2F, -3.5F);

		bodyModel[122].addShapeBox(0F, -1F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 199
		bodyModel[122].setRotationPoint(-71F, 2F, -3.5F);

		bodyModel[123].addShapeBox(0F, -1F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 200
		bodyModel[123].setRotationPoint(-61F, 2F, -3.5F);

		bodyModel[124].addShapeBox(0F, -1F, 0F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 201
		bodyModel[124].setRotationPoint(-54F, 2F, -3.5F);

		bodyModel[125].addShapeBox(0F, -1F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 202
		bodyModel[125].setRotationPoint(-61F, 2F, 2.5F);

		bodyModel[126].addShapeBox(0F, -1F, 0F, 10, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 203
		bodyModel[126].setRotationPoint(-54F, 2F, 2.5F);

		bodyModel[127].addShapeBox(0F, -1F, 0F, 40, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[127].setRotationPoint(-44F, 2F, 2.5F);

		bodyModel[128].addShapeBox(0F, -1F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[128].setRotationPoint(-4F, 2F, 2.5F);

		bodyModel[129].addShapeBox(0F, -1F, 0F, 40, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[129].setRotationPoint(-44F, 2F, -3.5F);

		bodyModel[130].addShapeBox(0F, -1F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[130].setRotationPoint(-4F, 2F, -3.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 208
		bodyModel[131].setRotationPoint(9F, 4F, 2.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 209
		bodyModel[132].setRotationPoint(12F, 3F, 2.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 210
		bodyModel[133].setRotationPoint(-7.5F, 3F, 2F);

		bodyModel[134].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 211
		bodyModel[134].setRotationPoint(2.5F, 3F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 212
		bodyModel[135].setRotationPoint(13.01F, 0F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 14, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 213
		bodyModel[136].setRotationPoint(13.01F, 6F, -7F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 214
		bodyModel[137].setRotationPoint(12.5F, 1.75F, 3F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 215
		bodyModel[138].setRotationPoint(12.5F, 1.75F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 218
		bodyModel[139].setRotationPoint(-71.5F, 0F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 218
		bodyModel[140].setRotationPoint(-71.5F, 0F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 220
		bodyModel[141].setRotationPoint(-71.5F, 0F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 221
		bodyModel[142].setRotationPoint(-71.5F, 0F, 4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[143].setRotationPoint(-71F, 0F, -9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F); // Box 223 L indicator front GLOW
		bodyModel[144].setRotationPoint(-71.01F, 0F, -9.51F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, 1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, 1F, 0F, -0.125F, 0F); // Box 224 R indicator front GLOW
		bodyModel[145].setRotationPoint(-71.01F, 0F, 9.51F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[146].setRotationPoint(-71F, 0F, -10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 147
		bodyModel[147].setRotationPoint(-71F, 0F, 9.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[148].setRotationPoint(-29F, -2F, 10.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[149].setRotationPoint(-29F, -2F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[150].setRotationPoint(-71F, -2F, 4.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[151].setRotationPoint(13F, -2F, 4.5F);
	}
}