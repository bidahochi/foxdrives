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

public class Modeldryvan40ft extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modeldryvan40ft() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[132];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 111, textureX, textureY); // Box 147
		bodyModel[1] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 148
		bodyModel[2] = new ModelRendererTurbo(this, 254, 69, textureX, textureY); // Box 176
		bodyModel[3] = new ModelRendererTurbo(this, 254, 69, textureX, textureY); // Box 177
		bodyModel[4] = new ModelRendererTurbo(this, 268, 69, textureX, textureY); // Box 1961
		bodyModel[5] = new ModelRendererTurbo(this, 61, 7, textureX, textureY); // Box 1962
		bodyModel[6] = new ModelRendererTurbo(this, 127, 42, textureX, textureY); // Box 352 i am KING PIN
		bodyModel[7] = new ModelRendererTurbo(this, 169, 140, textureX, textureY); // Box 2750 spare tire
		bodyModel[8] = new ModelRendererTurbo(this, 192, 145, textureX, textureY); // Box 2751 spare tire
		bodyModel[9] = new ModelRendererTurbo(this, 156, 145, textureX, textureY); // Box 2752 spare tire
		bodyModel[10] = new ModelRendererTurbo(this, 170, 161, textureX, textureY); // Box 2753 spare holder
		bodyModel[11] = new ModelRendererTurbo(this, 169, 154, textureX, textureY); // Box 2754 spare holder
		bodyModel[12] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[13] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[14] = new ModelRendererTurbo(this, 187, 46, textureX, textureY); // Box 124 axle 3-4
		bodyModel[15] = new ModelRendererTurbo(this, 192, 28, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[16] = new ModelRendererTurbo(this, 203, 22, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[17] = new ModelRendererTurbo(this, 203, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[18] = new ModelRendererTurbo(this, 192, 34, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[19] = new ModelRendererTurbo(this, 192, 28, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[20] = new ModelRendererTurbo(this, 203, 11, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[21] = new ModelRendererTurbo(this, 192, 34, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[22] = new ModelRendererTurbo(this, 143, 46, textureX, textureY); // Box 124 axle 3-4
		bodyModel[23] = new ModelRendererTurbo(this, 148, 28, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[24] = new ModelRendererTurbo(this, 159, 22, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[25] = new ModelRendererTurbo(this, 159, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[26] = new ModelRendererTurbo(this, 148, 34, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[27] = new ModelRendererTurbo(this, 148, 28, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[28] = new ModelRendererTurbo(this, 159, 11, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[29] = new ModelRendererTurbo(this, 148, 34, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[30] = new ModelRendererTurbo(this, 189, 58, textureX, textureY); // Box 153
		bodyModel[31] = new ModelRendererTurbo(this, 145, 58, textureX, textureY); // Box 158
		bodyModel[32] = new ModelRendererTurbo(this, 159, 34, textureX, textureY, "wheel"); // Box 101 wheel 3 cover
		bodyModel[33] = new ModelRendererTurbo(this, 203, 34, textureX, textureY, "wheel"); // Box 102 wheel 3 cover
		bodyModel[34] = new ModelRendererTurbo(this, 192, 107, textureX, textureY); // Box 124 axle 3-4
		bodyModel[35] = new ModelRendererTurbo(this, 192, 89, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[36] = new ModelRendererTurbo(this, 203, 89, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[37] = new ModelRendererTurbo(this, 192, 95, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[38] = new ModelRendererTurbo(this, 192, 89, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[39] = new ModelRendererTurbo(this, 203, 72, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[40] = new ModelRendererTurbo(this, 192, 95, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[41] = new ModelRendererTurbo(this, 214, 89, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[42] = new ModelRendererTurbo(this, 203, 72, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[43] = new ModelRendererTurbo(this, 214, 95, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[44] = new ModelRendererTurbo(this, 194, 119, textureX, textureY); // Box 153
		bodyModel[45] = new ModelRendererTurbo(this, 216, 119, textureX, textureY); // Box 154
		bodyModel[46] = new ModelRendererTurbo(this, 203, 95, textureX, textureY, "wheel"); // Box 102 wheel 3 cover
		bodyModel[47] = new ModelRendererTurbo(this, 194, 41, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[48] = new ModelRendererTurbo(this, 150, 41, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[49] = new ModelRendererTurbo(this, 194, 102, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[50] = new ModelRendererTurbo(this, 65, 78, textureX, textureY); // Box 1967
		bodyModel[51] = new ModelRendererTurbo(this, 34, 78, textureX, textureY); // Box 191
		bodyModel[52] = new ModelRendererTurbo(this, 211, 58, textureX, textureY); // Box 210
		bodyModel[53] = new ModelRendererTurbo(this, 167, 58, textureX, textureY); // Box 211
		bodyModel[54] = new ModelRendererTurbo(this, 203, 83, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[55] = new ModelRendererTurbo(this, 214, 28, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[56] = new ModelRendererTurbo(this, 203, 11, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[57] = new ModelRendererTurbo(this, 214, 34, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[58] = new ModelRendererTurbo(this, 214, 28, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[59] = new ModelRendererTurbo(this, 203, 22, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[60] = new ModelRendererTurbo(this, 203, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[61] = new ModelRendererTurbo(this, 214, 34, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[62] = new ModelRendererTurbo(this, 170, 28, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[63] = new ModelRendererTurbo(this, 159, 11, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[64] = new ModelRendererTurbo(this, 170, 34, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[65] = new ModelRendererTurbo(this, 170, 28, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[66] = new ModelRendererTurbo(this, 159, 22, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[67] = new ModelRendererTurbo(this, 159, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[68] = new ModelRendererTurbo(this, 170, 34, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[69] = new ModelRendererTurbo(this, 203, 40, textureX, textureY, "wheel"); // Box 103 wheel 4 cover
		bodyModel[70] = new ModelRendererTurbo(this, 159, 40, textureX, textureY, "wheel"); // Box 104 wheel 4 cover
		bodyModel[71] = new ModelRendererTurbo(this, 214, 89, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[72] = new ModelRendererTurbo(this, 203, 83, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[73] = new ModelRendererTurbo(this, 203, 89, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[74] = new ModelRendererTurbo(this, 214, 95, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[75] = new ModelRendererTurbo(this, 203, 101, textureX, textureY, "wheel"); // Box 103 wheel 4 cover
		bodyModel[76] = new ModelRendererTurbo(this, 214, 41, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[77] = new ModelRendererTurbo(this, 170, 41, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[78] = new ModelRendererTurbo(this, 214, 102, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[79] = new ModelRendererTurbo(this, 246, 56, textureX, textureY); // Box 178
		bodyModel[80] = new ModelRendererTurbo(this, 244, 52, textureX, textureY); // Box 184
		bodyModel[81] = new ModelRendererTurbo(this, 248, 59, textureX, textureY); // Box 213
		bodyModel[82] = new ModelRendererTurbo(this, 109, 51, textureX, textureY); // Box 161
		bodyModel[83] = new ModelRendererTurbo(this, 119, 51, textureX, textureY); // Box 162
		bodyModel[84] = new ModelRendererTurbo(this, 119, 51, textureX, textureY); // Box 163
		bodyModel[85] = new ModelRendererTurbo(this, 109, 51, textureX, textureY); // Box 164
		bodyModel[86] = new ModelRendererTurbo(this, 113, 47, textureX, textureY); // Box 165
		bodyModel[87] = new ModelRendererTurbo(this, 113, 47, textureX, textureY); // Box 166
		bodyModel[88] = new ModelRendererTurbo(this, 114, 50, textureX, textureY); // Box 168
		bodyModel[89] = new ModelRendererTurbo(this, 114, 50, textureX, textureY); // Box 169
		bodyModel[90] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 172
		bodyModel[91] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 173
		bodyModel[92] = new ModelRendererTurbo(this, 112, 41, textureX, textureY); // Box 200
		bodyModel[93] = new ModelRendererTurbo(this, 112, 41, textureX, textureY); // Box 201
		bodyModel[94] = new ModelRendererTurbo(this, 106, 34, textureX, textureY); // Box 174
		bodyModel[95] = new ModelRendererTurbo(this, 106, 34, textureX, textureY); // Box 2735
		bodyModel[96] = new ModelRendererTurbo(this, 114, 57, textureX, textureY); // Box 170
		bodyModel[97] = new ModelRendererTurbo(this, 114, 57, textureX, textureY); // Box 171
		bodyModel[98] = new ModelRendererTurbo(this, 81, 20, textureX, textureY); // Box 193
		bodyModel[99] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 194
		bodyModel[100] = new ModelRendererTurbo(this, 81, 22, textureX, textureY); // Box 1970
		bodyModel[101] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 145
		bodyModel[102] = new ModelRendererTurbo(this, 88, 52, textureX, textureY); // Box 146
		bodyModel[103] = new ModelRendererTurbo(this, 83, 52, textureX, textureY); // Box 147
		bodyModel[104] = new ModelRendererTurbo(this, 19, 160, textureX, textureY); // Box 148
		bodyModel[105] = new ModelRendererTurbo(this, 19, 133, textureX, textureY); // Box 141
		bodyModel[106] = new ModelRendererTurbo(this, 42, 36, textureX, textureY); // Box 144 rollup door CULLBOX
		bodyModel[107] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 145
		bodyModel[108] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 146
		bodyModel[109] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 147
		bodyModel[110] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 148
		bodyModel[111] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[112] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 145
		bodyModel[113] = new ModelRendererTurbo(this, 244, 5, textureX, textureY); // Box 151
		bodyModel[114] = new ModelRendererTurbo(this, 244, 26, textureX, textureY, "cull"); // Box 152 Rear lift CULLBOX
		bodyModel[115] = new ModelRendererTurbo(this, 38, -19, textureX, textureY, "cull"); // Box 153 side light mount CULLBOX
		bodyModel[116] = new ModelRendererTurbo(this, 64, 7, textureX, textureY, "lamp"); // Box 154 side light L
		bodyModel[117] = new ModelRendererTurbo(this, 64, 7, textureX, textureY, "lamp"); // Box 156 side light R
		bodyModel[118] = new ModelRendererTurbo(this, 68, 9, textureX, textureY, "rightTurnLight"); // Box 157 brake light LR
		bodyModel[119] = new ModelRendererTurbo(this, 68, 9, textureX, textureY, "brakeLight"); // Box 158 brake light UR
		bodyModel[120] = new ModelRendererTurbo(this, 81, 10, textureX, textureY); // Box 193
		bodyModel[121] = new ModelRendererTurbo(this, 113, 10, textureX, textureY); // Box 194
		bodyModel[122] = new ModelRendererTurbo(this, 81, 12, textureX, textureY); // Box 1970
		bodyModel[123] = new ModelRendererTurbo(this, 63, 9, textureX, textureY, "leftTurnLight"); // Box 164 brake light LL
		bodyModel[124] = new ModelRendererTurbo(this, 63, 9, textureX, textureY, "brakeLight"); // Box 165 brake light UL
		bodyModel[125] = new ModelRendererTurbo(this, 98, 78, textureX, textureY); // Box 166
		bodyModel[126] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "cull"); // Box 126 side ladder CULLBOX
		bodyModel[127] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 127 rear light top
		bodyModel[128] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 128 rear light top
		bodyModel[129] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 129 rear light top
		bodyModel[130] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 130 rear light top
		bodyModel[131] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 131 rear light top

		bodyModel[0].addBox(0F, 0F, 0F, 63, 1, 19, 0F); // Box 147
		bodyModel[0].setRotationPoint(-50F, 0F, -9.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 63, 1, 19, 0F); // Box 148
		bodyModel[1].setRotationPoint(-50F, -23F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 176
		bodyModel[2].setRotationPoint(9F, 3F, 3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 177
		bodyModel[3].setRotationPoint(9F, 3F, -4F);

		bodyModel[4].addBox(0F, 0F, -3F, 8, 2, 3, 0F); // Box 1961
		bodyModel[4].setRotationPoint(9F, 1F, -4F);
		bodyModel[4].rotateAngleY = 1.57079633F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 1962
		bodyModel[5].setRotationPoint(14.01F, 4F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352 i am KING PIN
		bodyModel[6].setRotationPoint(-45.5F, 0.5F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0.5F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2750 spare tire
		bodyModel[7].setRotationPoint(-26F, 1.25F, -4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 3F, 3, 4, 3, 0F,-0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F); // Box 2751 spare tire
		bodyModel[8].setRotationPoint(-23.5F, 1.25F, -4.5F);

		bodyModel[9].addShapeBox(0F, 0F, 3F, 3, 4, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F); // Box 2752 spare tire
		bodyModel[9].setRotationPoint(-28.5F, 1.25F, -4.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2753 spare holder
		bodyModel[10].setRotationPoint(-25F, 0.75F, -4F);

		bodyModel[11].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Box 2754 spare holder
		bodyModel[11].setRotationPoint(-29.5F, 0.77F, 0F);

		bodyModel[12].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[12].setRotationPoint(12.01F, -5F, 6.5F);
		bodyModel[12].rotateAngleY = 1.57079633F;
		bodyModel[12].rotateAngleZ = -0.78539816F;

		bodyModel[13].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[13].setRotationPoint(-5F, -4.25F, 10.51F);
		bodyModel[13].rotateAngleY = -3.14159265F;
		bodyModel[13].rotateAngleZ = -0.78539816F;

		bodyModel[14].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[14].setRotationPoint(-4.5F, 6F, -9.5F);

		bodyModel[15].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[15].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[16].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[16].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[17].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[17].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[18].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[18].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[19].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[19].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[20].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[20].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[21].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[21].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[22].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[22].setRotationPoint(5.5F, 6F, -9.5F);

		bodyModel[23].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[23].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[24].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[24].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[25].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[25].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[26].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[26].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[27].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[27].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[28].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[28].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[29].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[29].setRotationPoint(5.5F, 6F, -7.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 153
		bodyModel[30].setRotationPoint(-7.5F, 3F, -4F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 158
		bodyModel[31].setRotationPoint(2.5F, 3F, -4F);

		bodyModel[32].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 101 wheel 3 cover
		bodyModel[32].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[33].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover
		bodyModel[33].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[34].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[34].setRotationPoint(-14.5F, 6F, -9.5F);

		bodyModel[35].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[35].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[36].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[36].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[37].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[37].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[38].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[38].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[39].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[39].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[40].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[40].setRotationPoint(-14.5F, 6F, -7.5F);

		bodyModel[41].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[41].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[42].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[42].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[43].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[43].setRotationPoint(-14.5F, 6F, 5.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 153
		bodyModel[44].setRotationPoint(-17.5F, 3F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 154
		bodyModel[45].setRotationPoint(-17.5F, 3F, 2F);

		bodyModel[46].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover
		bodyModel[46].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[47].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[47].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[48].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[48].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[49].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[49].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[50].addBox(0F, 0F, 0F, 10, 2, 6, 0F); // Box 1967
		bodyModel[50].setRotationPoint(-9.5F, 1F, -3F);

		bodyModel[51].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 191
		bodyModel[51].setRotationPoint(-18.5F, 1F, -3F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 210
		bodyModel[52].setRotationPoint(-7.5F, 3F, 2F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 211
		bodyModel[53].setRotationPoint(2.5F, 3F, 2F);

		bodyModel[54].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[54].setRotationPoint(-14.5F, 6F, -9F);

		bodyModel[55].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[55].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[56].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[56].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[57].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[57].setRotationPoint(-4.5F, 6F, 5.5F);

		bodyModel[58].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[58].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[59].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[59].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[60].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[60].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[61].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[61].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[62].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[62].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[63].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[63].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[64].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[64].setRotationPoint(5.5F, 6F, 5.5F);

		bodyModel[65].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[65].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[66].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[66].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[67].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[67].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[68].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[68].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[69].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover
		bodyModel[69].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[70].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 104 wheel 4 cover
		bodyModel[70].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[71].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[71].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[72].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[72].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[73].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[73].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[74].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[74].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[75].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover
		bodyModel[75].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[76].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[76].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[77].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[77].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[78].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[78].setRotationPoint(-14.5F, 6F, 9F);

		bodyModel[79].addBox(0F, 0F, -1F, 1, 1, 19, 0F); // Box 178
		bodyModel[79].setRotationPoint(13F, 6F, -8.5F);

		bodyModel[80].addBox(0F, 0F, -1F, 21, 2, 1, 0F); // Box 184
		bodyModel[80].setRotationPoint(12F, 1F, -10.5F);
		bodyModel[80].rotateAngleY = 1.57079633F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 213
		bodyModel[81].setRotationPoint(14.01F, 6F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[82].setRotationPoint(-31F, 2F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 162
		bodyModel[83].setRotationPoint(-31F, 2F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 163
		bodyModel[84].setRotationPoint(-24F, 2F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 164
		bodyModel[85].setRotationPoint(-24F, 2F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[86].setRotationPoint(-28F, 6F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[87].setRotationPoint(-28F, 6F, 7F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 168
		bodyModel[88].setRotationPoint(-27.5F, 2.5F, -6.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		bodyModel[89].setRotationPoint(-27.5F, 2.5F, 6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
		bodyModel[90].setRotationPoint(-28.5F, 3F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 173
		bodyModel[91].setRotationPoint(-28.5F, 3F, 7F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 200
		bodyModel[92].setRotationPoint(-28F, 2F, -6.75F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 201
		bodyModel[93].setRotationPoint(-28F, 2F, 5.75F);

		bodyModel[94].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 174
		bodyModel[94].setRotationPoint(-31F, 1F, -7F);

		bodyModel[95].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 2735
		bodyModel[95].setRotationPoint(-31F, 1F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 170
		bodyModel[96].setRotationPoint(-27.5F, 7F, -6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 171
		bodyModel[97].setRotationPoint(-27.5F, 7F, 6.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 193
		bodyModel[98].setRotationPoint(10.51F, 2F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 194
		bodyModel[99].setRotationPoint(10.51F, 2F, 5F);

		bodyModel[100].addBox(-20F, 0F, 0F, 20, 1, 1, 0F); // Box 1970
		bodyModel[100].setRotationPoint(9.51F, 1F, -10F);
		bodyModel[100].rotateAngleY = -1.57079633F;

		bodyModel[101].addBox(0F, 0F, 0F, 1, 24, 19, 0F); // Box 145
		bodyModel[101].setRotationPoint(-51F, -23F, -9.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 146
		bodyModel[102].setRotationPoint(-51F, -23F, 9.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[103].setRotationPoint(-51F, -23F, -10.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 63, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[104].setRotationPoint(-50F, -23F, -10.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 63, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[105].setRotationPoint(-50F, -23F, 9.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 22, 19, 0F); // Box 144 rollup door CULLBOX
		bodyModel[106].setRotationPoint(11F, -22F, -9.5F);

		bodyModel[107].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 145
		bodyModel[107].setRotationPoint(12.01F, -10F, 6.5F);
		bodyModel[107].rotateAngleY = 1.57079633F;
		bodyModel[107].rotateAngleZ = -0.78539816F;

		bodyModel[108].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 146
		bodyModel[108].setRotationPoint(-1.77635683940025E-15F, -4.25F, 10.51F);
		bodyModel[108].rotateAngleY = -3.14159265F;
		bodyModel[108].rotateAngleZ = -0.78539816F;

		bodyModel[109].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 147
		bodyModel[109].setRotationPoint(-5F, -4.25F, -10.51F);
		bodyModel[109].rotateAngleY = -3.14159265F;
		bodyModel[109].rotateAngleZ = -0.78539816F;

		bodyModel[110].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 148
		bodyModel[110].setRotationPoint(-1.77635683940025E-15F, -4.25F, -10.51F);
		bodyModel[110].rotateAngleY = -3.14159265F;
		bodyModel[110].rotateAngleZ = -0.78539816F;

		bodyModel[111].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[111].setRotationPoint(-51.01F, -5F, 6.5F);
		bodyModel[111].rotateAngleY = 1.57079633F;
		bodyModel[111].rotateAngleZ = -0.78539816F;

		bodyModel[112].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 145
		bodyModel[112].setRotationPoint(-51.01F, -10F, 6.5F);
		bodyModel[112].rotateAngleY = 1.57079633F;
		bodyModel[112].rotateAngleZ = -0.78539816F;

		bodyModel[113].addBox(0F, 0F, 0F, 3, 1, 19, 0F); // Box 151
		bodyModel[113].setRotationPoint(13F, 0F, -9.5F);

		bodyModel[114].addBox(0F, 0F, -1F, 3, 5, 19, 0F); // Box 152 Rear lift CULLBOX
		bodyModel[114].setRotationPoint(13.01F, 1F, -8.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153 side light mount CULLBOX
		bodyModel[115].setRotationPoint(-23F, 1F, -10.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 154 side light L
		bodyModel[116].setRotationPoint(-22.5F, 1F, -10.51F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 156 side light R
		bodyModel[117].setRotationPoint(-22.5F, 1F, 10.51F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 157 brake light LR
		bodyModel[118].setRotationPoint(12.1F, -3F, 9.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 158 brake light UR
		bodyModel[119].setRotationPoint(12.1F, -6F, 9.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 193
		bodyModel[120].setRotationPoint(0.509999999999998F, 2F, -10F);

		bodyModel[121].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 194
		bodyModel[121].setRotationPoint(0.509999999999998F, 2F, 5F);

		bodyModel[122].addBox(-20F, 0F, 0F, 20, 1, 1, 0F); // Box 1970
		bodyModel[122].setRotationPoint(-0.490000000000002F, 1F, -10F);
		bodyModel[122].rotateAngleY = -1.57079633F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 164 brake light LL
		bodyModel[123].setRotationPoint(12.1F, -3F, -10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 165 brake light UL
		bodyModel[124].setRotationPoint(12.1F, -6F, -10.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 166
		bodyModel[125].setRotationPoint(0.499999999999998F, 1F, -3F);

		bodyModel[126].addBox(0F, 0F, 0F, 7, 5, 21, 0F); // Box 126 side ladder CULLBOX
		bodyModel[126].setRotationPoint(-31F, 1F, -10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 127 rear light top
		bodyModel[127].setRotationPoint(12.1F, -23F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 128 rear light top
		bodyModel[128].setRotationPoint(12.1F, -23F, -2.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 129 rear light top
		bodyModel[129].setRotationPoint(12.1F, -23F, 1.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 130 rear light top
		bodyModel[130].setRotationPoint(12.1F, -23F, -10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 131 rear light top
		bodyModel[131].setRotationPoint(12.1F, -23F, 9.5F);
	}
}