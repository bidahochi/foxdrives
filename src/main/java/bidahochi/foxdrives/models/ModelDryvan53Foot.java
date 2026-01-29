//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 53ft_reefer
// Model Creator: Bidahochi
// Created on: 27.12.2024 - 13:48:40
// Last changed on: 27.12.2024 - 13:48:40

package bidahochi.foxdrives.models; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelDryvan53Foot extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelDryvan53Foot() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[110];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 192, 52, textureX, textureY); // Box 124 axle 3-4
		bodyModel[1] = new ModelRendererTurbo(this, 241, 53, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[2] = new ModelRendererTurbo(this, 230, 53, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[3] = new ModelRendererTurbo(this, 230, 64, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[4] = new ModelRendererTurbo(this, 231, 59, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[5] = new ModelRendererTurbo(this, 241, 64, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[6] = new ModelRendererTurbo(this, 218, 47, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[7] = new ModelRendererTurbo(this, 218, 53, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[8] = new ModelRendererTurbo(this, 218, 64, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[9] = new ModelRendererTurbo(this, 218, 47, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[10] = new ModelRendererTurbo(this, 218, 53, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[11] = new ModelRendererTurbo(this, 218, 64, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[12] = new ModelRendererTurbo(this, 241, 53, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[13] = new ModelRendererTurbo(this, 230, 53, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[14] = new ModelRendererTurbo(this, 230, 64, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[15] = new ModelRendererTurbo(this, 241, 64, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[16] = new ModelRendererTurbo(this, 231, 59, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[17] = new ModelRendererTurbo(this, 192, 52, textureX, textureY); // Box 124 axle 3-4
		bodyModel[18] = new ModelRendererTurbo(this, 241, 53, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[19] = new ModelRendererTurbo(this, 230, 53, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[20] = new ModelRendererTurbo(this, 230, 64, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[21] = new ModelRendererTurbo(this, 231, 59, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[22] = new ModelRendererTurbo(this, 241, 64, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[23] = new ModelRendererTurbo(this, 218, 47, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[24] = new ModelRendererTurbo(this, 218, 53, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[25] = new ModelRendererTurbo(this, 218, 64, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[26] = new ModelRendererTurbo(this, 218, 47, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[27] = new ModelRendererTurbo(this, 218, 53, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[28] = new ModelRendererTurbo(this, 218, 64, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[29] = new ModelRendererTurbo(this, 241, 53, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[30] = new ModelRendererTurbo(this, 230, 53, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[31] = new ModelRendererTurbo(this, 230, 64, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[32] = new ModelRendererTurbo(this, 241, 64, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[33] = new ModelRendererTurbo(this, 231, 59, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[34] = new ModelRendererTurbo(this, 19, 34, textureX, textureY); // Box 31
		bodyModel[35] = new ModelRendererTurbo(this, 19, 60, textureX, textureY); // Box 145
		bodyModel[36] = new ModelRendererTurbo(this, 252, 78, textureX, textureY); // Box 146
		bodyModel[37] = new ModelRendererTurbo(this, 1, 86, textureX, textureY); // Box 147
		bodyModel[38] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 148
		bodyModel[39] = new ModelRendererTurbo(this, 229, 95, textureX, textureY); // Box 314 door swing right
		bodyModel[40] = new ModelRendererTurbo(this, 206, 95, textureX, textureY); // Box 182 door swing left
		bodyModel[41] = new ModelRendererTurbo(this, 220, 81, textureX, textureY); // Box 176
		bodyModel[42] = new ModelRendererTurbo(this, 220, 81, textureX, textureY); // Box 177
		bodyModel[43] = new ModelRendererTurbo(this, 217, 87, textureX, textureY); // Box 178
		bodyModel[44] = new ModelRendererTurbo(this, 215, 81, textureX, textureY); // Box 179
		bodyModel[45] = new ModelRendererTurbo(this, 215, 81, textureX, textureY); // Box 180
		bodyModel[46] = new ModelRendererTurbo(this, 234, 82, textureX, textureY); // Box 183
		bodyModel[47] = new ModelRendererTurbo(this, 204, 76, textureX, textureY); // Box 184
		bodyModel[48] = new ModelRendererTurbo(this, 201, 81, textureX, textureY, "leftTurnLight"); // Box 247 turnlight L
		bodyModel[49] = new ModelRendererTurbo(this, 208, 81, textureX, textureY, "brakeLight"); // Box 186 taillight
		bodyModel[50] = new ModelRendererTurbo(this, 201, 81, textureX, textureY, "rightTurnLight"); // Box 187 turnlight R
		bodyModel[51] = new ModelRendererTurbo(this, 208, 81, textureX, textureY, "brakeLight"); // Box 188 taillight
		bodyModel[52] = new ModelRendererTurbo(this, 229, 81, textureX, textureY); // Box 1961
		bodyModel[53] = new ModelRendererTurbo(this, 216, 82, textureX, textureY); // Box 1962
		bodyModel[54] = new ModelRendererTurbo(this, 193, 63, textureX, textureY); // Box 153
		bodyModel[55] = new ModelRendererTurbo(this, 193, 63, textureX, textureY); // Box 154
		bodyModel[56] = new ModelRendererTurbo(this, 193, 63, textureX, textureY); // Box 157
		bodyModel[57] = new ModelRendererTurbo(this, 193, 63, textureX, textureY); // Box 158
		bodyModel[58] = new ModelRendererTurbo(this, 194, 37, textureX, textureY); // Box 1967
		bodyModel[59] = new ModelRendererTurbo(this, 194, 42, textureX, textureY); // Box 193
		bodyModel[60] = new ModelRendererTurbo(this, 194, 42, textureX, textureY); // Box 194
		bodyModel[61] = new ModelRendererTurbo(this, 198, 34, textureX, textureY); // Box 1970
		bodyModel[62] = new ModelRendererTurbo(this, 190, 98, textureX, textureY); // Box 352 i am KING PIN
		bodyModel[63] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 161
		bodyModel[64] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 162
		bodyModel[65] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 163
		bodyModel[66] = new ModelRendererTurbo(this, 198, 91, textureX, textureY); // Box 164
		bodyModel[67] = new ModelRendererTurbo(this, 189, 94, textureX, textureY); // Box 165
		bodyModel[68] = new ModelRendererTurbo(this, 189, 94, textureX, textureY); // Box 166
		bodyModel[69] = new ModelRendererTurbo(this, 205, 97, textureX, textureY); // Box 168
		bodyModel[70] = new ModelRendererTurbo(this, 205, 97, textureX, textureY); // Box 169
		bodyModel[71] = new ModelRendererTurbo(this, 189, 91, textureX, textureY); // Box 172
		bodyModel[72] = new ModelRendererTurbo(this, 189, 91, textureX, textureY); // Box 173
		bodyModel[73] = new ModelRendererTurbo(this, 203, 91, textureX, textureY); // Box 200
		bodyModel[74] = new ModelRendererTurbo(this, 203, 91, textureX, textureY); // Box 201
		bodyModel[75] = new ModelRendererTurbo(this, 189, 87, textureX, textureY); // Box 174
		bodyModel[76] = new ModelRendererTurbo(this, 189, 87, textureX, textureY); // Box 2735
		bodyModel[77] = new ModelRendererTurbo(this, 296, 110, textureX, textureY); // Box 110
		bodyModel[78] = new ModelRendererTurbo(this, 325, 111, textureX, textureY); // Box 111
		bodyModel[79] = new ModelRendererTurbo(this, 296, 91, textureX, textureY); // Box 112
		bodyModel[80] = new ModelRendererTurbo(this, 316, 91, textureX, textureY); // Box 113
		bodyModel[81] = new ModelRendererTurbo(this, 305, 90, textureX, textureY); // Box 114
		bodyModel[82] = new ModelRendererTurbo(this, 326, 101, textureX, textureY); // Box 115
		bodyModel[83] = new ModelRendererTurbo(this, 326, 96, textureX, textureY); // Box 116
		bodyModel[84] = new ModelRendererTurbo(this, 326, 96, textureX, textureY); // Box 117
		bodyModel[85] = new ModelRendererTurbo(this, 300, 83, textureX, textureY); // Box 202
		bodyModel[86] = new ModelRendererTurbo(this, 300, 76, textureX, textureY); // Box 203
		bodyModel[87] = new ModelRendererTurbo(this, 295, 76, textureX, textureY); // Box 204
		bodyModel[88] = new ModelRendererTurbo(this, 295, 83, textureX, textureY); // Box 205
		bodyModel[89] = new ModelRendererTurbo(this, 252, 104, textureX, textureY); // Box 2748 rollup door
		bodyModel[90] = new ModelRendererTurbo(this, 349, 117, textureX, textureY); // Box 2750 spare tire
		bodyModel[91] = new ModelRendererTurbo(this, 354, 111, textureX, textureY); // Box 2751 spare tire
		bodyModel[92] = new ModelRendererTurbo(this, 354, 111, textureX, textureY); // Box 2752 spare tire
		bodyModel[93] = new ModelRendererTurbo(this, 373, 110, textureX, textureY); // Box 2753 spare holder
		bodyModel[94] = new ModelRendererTurbo(this, 372, 123, textureX, textureY); // Box 2754 spare holder
		bodyModel[95] = new ModelRendererTurbo(this, 200, 101, textureX, textureY); // Box 170
		bodyModel[96] = new ModelRendererTurbo(this, 200, 101, textureX, textureY); // Box 171
		bodyModel[97] = new ModelRendererTurbo(this, 205, 46, textureX, textureY, "wheel"); // Box 101 wheel 3 cover
		bodyModel[98] = new ModelRendererTurbo(this, 205, 46, textureX, textureY, "wheel"); // Box 102 wheel 3 cover
		bodyModel[99] = new ModelRendererTurbo(this, 205, 46, textureX, textureY, "wheel"); // Box 103 wheel 4 cover
		bodyModel[100] = new ModelRendererTurbo(this, 205, 46, textureX, textureY, "wheel"); // Box 104 wheel 4 cover
		bodyModel[101] = new ModelRendererTurbo(this, 20, 7, textureX, textureY, "lamp"); // Box 105 glow lights
		bodyModel[102] = new ModelRendererTurbo(this, 20, 29, textureX, textureY, "lamp"); // Box 106 glow lights
		bodyModel[103] = new ModelRendererTurbo(this, 20, 29, textureX, textureY, "lamp"); // Box 107 glow lights
		bodyModel[104] = new ModelRendererTurbo(this, 20, 31, textureX, textureY, "lamp"); // Box 106 glow lights
		bodyModel[105] = new ModelRendererTurbo(this, 20, 31, textureX, textureY, "lamp"); // Box 107 glow lights
		bodyModel[106] = new ModelRendererTurbo(this, 193, 54, textureX, textureY); // Box 108 hazmat plac
		bodyModel[107] = new ModelRendererTurbo(this, 193, 54, textureX, textureY); // Box 111 hazmat placc
		bodyModel[108] = new ModelRendererTurbo(this, 193, 54, textureX, textureY); // Box 108 hazmat plac
		bodyModel[109] = new ModelRendererTurbo(this, 193, 54, textureX, textureY); // Box 113 hazmat plac

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

		bodyModel[34].addBox(0F, 0F, 0F, 84, 24, 1, 0F); // Box 31
		bodyModel[34].setRotationPoint(-64F, -23F, -10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 84, 24, 1, 0F); // Box 145
		bodyModel[35].setRotationPoint(-64F, -23F, 9.5F);

		bodyModel[36].addBox(-19F, 0F, 0F, 19, 24, 1, 0F); // Box 146
		bodyModel[36].setRotationPoint(-64F, -23F, -9.5F);
		bodyModel[36].rotateAngleY = -1.57079633F;

		bodyModel[37].addBox(0F, 0F, 0F, 83, 1, 19, 0F); // Box 147
		bodyModel[37].setRotationPoint(-63F, 0F, -9.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 83, 1, 19, 0F); // Box 148
		bodyModel[38].setRotationPoint(-63F, -23F, -9.5F);

		bodyModel[39].addBox(-0.5F, 0F, -9F, 1, 22, 10, 0F); // Box 314 door swing right
		bodyModel[39].setRotationPoint(19.3F, -22F, 9F);

		bodyModel[40].addBox(-0.5F, 0F, -1F, 1, 22, 10, 0F); // Box 182 door swing left
		bodyModel[40].setRotationPoint(19.3F, -22F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 176
		bodyModel[41].setRotationPoint(16F, 3F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 177
		bodyModel[42].setRotationPoint(16F, 3F, -4F);

		bodyModel[43].addBox(0F, 0F, -1F, 16, 1, 1, 0F); // Box 178
		bodyModel[43].setRotationPoint(19F, 6F, -8F);
		bodyModel[43].rotateAngleY = 1.57079633F;

		bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 179
		bodyModel[44].setRotationPoint(19F, 3F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 180
		bodyModel[45].setRotationPoint(19F, 3F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183
		bodyModel[46].setRotationPoint(19.5F, 3F, -2F);

		bodyModel[47].addBox(0F, 0F, -1F, 21, 2, 1, 0F); // Box 184
		bodyModel[47].setRotationPoint(19F, 1F, -10.5F);
		bodyModel[47].rotateAngleY = 1.57079633F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 turnlight L
		bodyModel[48].setRotationPoint(19.1F, 1F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 taillight
		bodyModel[49].setRotationPoint(19.1F, 1F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 187 turnlight R
		bodyModel[50].setRotationPoint(19.1F, 1F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 188 taillight
		bodyModel[51].setRotationPoint(19.1F, 1F, 5F);

		bodyModel[52].addBox(0F, 0F, -3F, 8, 2, 3, 0F); // Box 1961
		bodyModel[52].setRotationPoint(16F, 1F, -4F);
		bodyModel[52].rotateAngleY = 1.57079633F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 1962
		bodyModel[53].setRotationPoint(19.5F, 3F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 153
		bodyModel[54].setRotationPoint(-7.5F, 3F, -4F);

		bodyModel[55].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 154
		bodyModel[55].setRotationPoint(-7.5F, 3F, 2F);

		bodyModel[56].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 157
		bodyModel[56].setRotationPoint(2.5F, 3F, 2F);

		bodyModel[57].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 158
		bodyModel[57].setRotationPoint(2.5F, 3F, -4F);

		bodyModel[58].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 1967
		bodyModel[58].setRotationPoint(-8.5F, 1F, -3F);

		bodyModel[59].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 193
		bodyModel[59].setRotationPoint(10.5F, 3F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 194
		bodyModel[60].setRotationPoint(10.5F, 3F, 5F);

		bodyModel[61].addBox(-20F, 0F, 0F, 20, 1, 1, 0F); // Box 1970
		bodyModel[61].setRotationPoint(9.5F, 2F, -10F);
		bodyModel[61].rotateAngleY = -1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352 i am KING PIN
		bodyModel[62].setRotationPoint(-57.5F, 0.5F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[63].setRotationPoint(-46F, 2F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 162
		bodyModel[64].setRotationPoint(-46F, 2F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 163
		bodyModel[65].setRotationPoint(-39F, 2F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 164
		bodyModel[66].setRotationPoint(-39F, 2F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[67].setRotationPoint(-43F, 6F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[68].setRotationPoint(-43F, 6F, 4F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 168
		bodyModel[69].setRotationPoint(-42.5F, 1.55F, -4.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		bodyModel[70].setRotationPoint(-42.5F, 1.55F, 3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
		bodyModel[71].setRotationPoint(-43.5F, 3F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 173
		bodyModel[72].setRotationPoint(-43.5F, 3F, 4F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 200
		bodyModel[73].setRotationPoint(-43F, 2F, -4.75F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 201
		bodyModel[74].setRotationPoint(-43F, 2F, 2.75F);

		bodyModel[75].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 174
		bodyModel[75].setRotationPoint(-46F, 1F, -5F);

		bodyModel[76].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 2735
		bodyModel[76].setRotationPoint(-46F, 1F, 3F);

		bodyModel[77].addBox(0F, 0F, -2F, 12, 15, 2, 0F); // Box 110
		bodyModel[77].setRotationPoint(-66F, -21F, -6F);
		bodyModel[77].rotateAngleY = 1.57079633F;

		bodyModel[78].addShapeBox(-10F, 0F, 0F, 10, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 111
		bodyModel[78].setRotationPoint(-67F, -21F, -5F);
		bodyModel[78].rotateAngleY = -1.57079633F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[79].setRotationPoint(-68F, -21F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[80].setRotationPoint(-68F, -21F, 2F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 15, 4, 0F); // Box 114
		bodyModel[81].setRotationPoint(-68F, -21F, -2F);

		bodyModel[82].addBox(0F, 0F, 0F, 13, 6, 2, 0F); // Box 115
		bodyModel[82].setRotationPoint(-32F, 1F, -6.5F);
		bodyModel[82].rotateAngleY = 1.57079633F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[83].setRotationPoint(-34F, 3F, -6.5F);
		bodyModel[83].rotateAngleY = 1.57079633F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 117
		bodyModel[84].setRotationPoint(-30F, 3F, -6.5F);
		bodyModel[84].rotateAngleY = 1.57079633F;

		bodyModel[85].addBox(0F, 0F, 0F, 25, 6, 0, 0F); // Box 202
		bodyModel[85].setRotationPoint(-35F, 1F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 25, 6, 0, 0F); // Box 203
		bodyModel[86].setRotationPoint(-35F, 1F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 204
		bodyModel[87].setRotationPoint(-37F, 1F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 205
		bodyModel[88].setRotationPoint(-37F, 1F, -10F);

		bodyModel[89].addBox(0F, 0F, -1F, 19, 22, 1, 0F); // Box 2748 rollup door
		bodyModel[89].setRotationPoint(18.8F, -22F, -9.5F);
		bodyModel[89].rotateAngleY = 1.57079633F;

		bodyModel[90].addShapeBox(0F, 0F, 0.5F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2750 spare tire
		bodyModel[90].setRotationPoint(-21F, 1.25F, -9.5F);

		bodyModel[91].addShapeBox(0F, 0F, 3F, 3, 2, 3, 0F,-0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F); // Box 2751 spare tire
		bodyModel[91].setRotationPoint(-18.5F, 1.25F, -9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 3F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0F); // Box 2752 spare tire
		bodyModel[92].setRotationPoint(-23.5F, 1.25F, -9.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 2753 spare holder
		bodyModel[93].setRotationPoint(-20F, 0.75F, -9F);

		bodyModel[94].addBox(0F, 0F, 0F, 10, 3, 1, 0F); // Box 2754 spare holder
		bodyModel[94].setRotationPoint(-24.5F, 0.77F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 170
		bodyModel[95].setRotationPoint(-42.5F, 6.05F, -4.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 171
		bodyModel[96].setRotationPoint(-42.5F, 6.05F, 3.5F);

		bodyModel[97].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 101 wheel 3 cover
		bodyModel[97].setRotationPoint(5.5F, 6F, -9F);

		bodyModel[98].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 102 wheel 3 cover
		bodyModel[98].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[99].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 103 wheel 4 cover
		bodyModel[99].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[100].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 104 wheel 4 cover
		bodyModel[100].setRotationPoint(5.5F, 6F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 105 glow lights
		bodyModel[101].setRotationPoint(20.01F, -23F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 83, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 106 glow lights
		bodyModel[102].setRotationPoint(-63.5F, -23F, -10.51F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 83, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 107 glow lights
		bodyModel[103].setRotationPoint(-63.5F, -23F, 10.51F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 83, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 106 glow lights
		bodyModel[104].setRotationPoint(-63.5F, 0F, -10.51F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 83, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 107 glow lights
		bodyModel[105].setRotationPoint(-63.5F, 0F, 10.51F);

		bodyModel[106].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[106].setRotationPoint(19.81F, -3F, 6.5F);
		bodyModel[106].rotateAngleY = 1.57079633F;
		bodyModel[106].rotateAngleZ = -0.78539816F;

		bodyModel[107].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 111 hazmat placc
		bodyModel[107].setRotationPoint(-64.01F, -3F, 6.5F);
		bodyModel[107].rotateAngleY = 1.57079633F;
		bodyModel[107].rotateAngleZ = -0.78539816F;

		bodyModel[108].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[108].setRotationPoint(-20F, -2.25F, 10.51F);
		bodyModel[108].rotateAngleY = -3.14159265F;
		bodyModel[108].rotateAngleZ = -0.78539816F;

		bodyModel[109].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 113 hazmat plac
		bodyModel[109].setRotationPoint(-20F, -2.25F, -10.51F);
		bodyModel[109].rotateAngleY = -3.14159265F;
		bodyModel[109].rotateAngleZ = -0.78539816F;
	}
}