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

public class Modeldryvan28ft extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Modeldryvan28ft() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];

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
		bodyModel[7] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[8] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[9] = new ModelRendererTurbo(this, 143, 46, textureX, textureY); // Box 124 axle 3-4
		bodyModel[10] = new ModelRendererTurbo(this, 148, 28, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[11] = new ModelRendererTurbo(this, 159, 22, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[12] = new ModelRendererTurbo(this, 159, 28, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[13] = new ModelRendererTurbo(this, 148, 34, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[14] = new ModelRendererTurbo(this, 148, 28, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[15] = new ModelRendererTurbo(this, 159, 11, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[16] = new ModelRendererTurbo(this, 148, 34, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[17] = new ModelRendererTurbo(this, 145, 58, textureX, textureY); // Box 158
		bodyModel[18] = new ModelRendererTurbo(this, 159, 34, textureX, textureY, "wheel"); // Box 101 wheel 3 cover
		bodyModel[19] = new ModelRendererTurbo(this, 150, 41, textureX, textureY, "wheel"); // Box 77 wheel 3
		bodyModel[20] = new ModelRendererTurbo(this, 167, 58, textureX, textureY); // Box 211
		bodyModel[21] = new ModelRendererTurbo(this, 170, 28, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[22] = new ModelRendererTurbo(this, 159, 11, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[23] = new ModelRendererTurbo(this, 170, 34, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[24] = new ModelRendererTurbo(this, 170, 28, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[25] = new ModelRendererTurbo(this, 159, 22, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[26] = new ModelRendererTurbo(this, 159, 28, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[27] = new ModelRendererTurbo(this, 170, 34, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[28] = new ModelRendererTurbo(this, 159, 40, textureX, textureY, "wheel"); // Box 104 wheel 4 cover
		bodyModel[29] = new ModelRendererTurbo(this, 170, 41, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[30] = new ModelRendererTurbo(this, 246, 56, textureX, textureY); // Box 178
		bodyModel[31] = new ModelRendererTurbo(this, 244, 52, textureX, textureY); // Box 184
		bodyModel[32] = new ModelRendererTurbo(this, 248, 59, textureX, textureY); // Box 213
		bodyModel[33] = new ModelRendererTurbo(this, 109, 51, textureX, textureY); // Box 161
		bodyModel[34] = new ModelRendererTurbo(this, 119, 51, textureX, textureY); // Box 162
		bodyModel[35] = new ModelRendererTurbo(this, 119, 51, textureX, textureY); // Box 163
		bodyModel[36] = new ModelRendererTurbo(this, 109, 51, textureX, textureY); // Box 164
		bodyModel[37] = new ModelRendererTurbo(this, 113, 47, textureX, textureY); // Box 165
		bodyModel[38] = new ModelRendererTurbo(this, 113, 47, textureX, textureY); // Box 166
		bodyModel[39] = new ModelRendererTurbo(this, 114, 50, textureX, textureY); // Box 168
		bodyModel[40] = new ModelRendererTurbo(this, 114, 50, textureX, textureY); // Box 169
		bodyModel[41] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 172
		bodyModel[42] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 173
		bodyModel[43] = new ModelRendererTurbo(this, 112, 41, textureX, textureY); // Box 200
		bodyModel[44] = new ModelRendererTurbo(this, 112, 41, textureX, textureY); // Box 201
		bodyModel[45] = new ModelRendererTurbo(this, 106, 34, textureX, textureY); // Box 174
		bodyModel[46] = new ModelRendererTurbo(this, 106, 34, textureX, textureY); // Box 2735
		bodyModel[47] = new ModelRendererTurbo(this, 114, 57, textureX, textureY); // Box 170
		bodyModel[48] = new ModelRendererTurbo(this, 114, 57, textureX, textureY); // Box 171
		bodyModel[49] = new ModelRendererTurbo(this, 81, 20, textureX, textureY); // Box 193
		bodyModel[50] = new ModelRendererTurbo(this, 113, 20, textureX, textureY); // Box 194
		bodyModel[51] = new ModelRendererTurbo(this, 81, 22, textureX, textureY); // Box 1970
		bodyModel[52] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 145
		bodyModel[53] = new ModelRendererTurbo(this, 88, 52, textureX, textureY); // Box 146
		bodyModel[54] = new ModelRendererTurbo(this, 83, 52, textureX, textureY); // Box 147
		bodyModel[55] = new ModelRendererTurbo(this, 19, 160, textureX, textureY); // Box 148
		bodyModel[56] = new ModelRendererTurbo(this, 19, 133, textureX, textureY); // Box 141
		bodyModel[57] = new ModelRendererTurbo(this, 42, 36, textureX, textureY, "cull"); // Box 144 rollup door CULLBOX
		bodyModel[58] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 145
		bodyModel[59] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 146
		bodyModel[60] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 147
		bodyModel[61] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 148
		bodyModel[62] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 108 hazmat plac
		bodyModel[63] = new ModelRendererTurbo(this, 102, 2, textureX, textureY); // Box 145
		bodyModel[64] = new ModelRendererTurbo(this, 244, 5, textureX, textureY); // Box 151
		bodyModel[65] = new ModelRendererTurbo(this, 244, 26, textureX, textureY, "cull"); // Box 152 Rear lift CULLBOX
		bodyModel[66] = new ModelRendererTurbo(this, 38, -19, textureX, textureY, "cull"); // Box 153 side light mount CULLBOX
		bodyModel[67] = new ModelRendererTurbo(this, 64, 7, textureX, textureY, "lamp"); // Box 154 side light L
		bodyModel[68] = new ModelRendererTurbo(this, 64, 7, textureX, textureY, "lamp"); // Box 156 side light R
		bodyModel[69] = new ModelRendererTurbo(this, 68, 9, textureX, textureY, "rightTurnLight"); // Box 157 brake light LR
		bodyModel[70] = new ModelRendererTurbo(this, 68, 9, textureX, textureY, "brakeLight"); // Box 158 brake light UR
		bodyModel[71] = new ModelRendererTurbo(this, 63, 9, textureX, textureY, "leftTurnLight"); // Box 164 brake light LL
		bodyModel[72] = new ModelRendererTurbo(this, 63, 9, textureX, textureY, "brakeLight"); // Box 165 brake light UL
		bodyModel[73] = new ModelRendererTurbo(this, 98, 78, textureX, textureY); // Box 166
		bodyModel[74] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 127 rear light top
		bodyModel[75] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 128 rear light top
		bodyModel[76] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 129 rear light top
		bodyModel[77] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 130 rear light top
		bodyModel[78] = new ModelRendererTurbo(this, 58, 9, textureX, textureY, "lamp"); // Box 131 rear light top

		bodyModel[0].addBox(0F, 0F, 0F, 45, 1, 19, 0F); // Box 147
		bodyModel[0].setRotationPoint(-38F, 0F, -9.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 45, 1, 19, 0F); // Box 148
		bodyModel[1].setRotationPoint(-38F, -23F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 176
		bodyModel[2].setRotationPoint(3F, 3F, 3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 177
		bodyModel[3].setRotationPoint(3F, 3F, -4F);

		bodyModel[4].addBox(0F, 0F, -3F, 8, 2, 3, 0F); // Box 1961
		bodyModel[4].setRotationPoint(3F, 1F, -4F);
		bodyModel[4].rotateAngleY = 1.57079633F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 1962
		bodyModel[5].setRotationPoint(8.01F, 4F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352 i am KING PIN
		bodyModel[6].setRotationPoint(-31.5F, 0.5F, -0.5F);

		bodyModel[7].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[7].setRotationPoint(6.01F, -5F, 6.5F);
		bodyModel[7].rotateAngleY = 1.57079633F;
		bodyModel[7].rotateAngleZ = -0.78539816F;

		bodyModel[8].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[8].setRotationPoint(-2F, -4.25F, 10.51F);
		bodyModel[8].rotateAngleY = -3.14159265F;
		bodyModel[8].rotateAngleZ = -0.78539816F;

		bodyModel[9].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[9].setRotationPoint(-0.5F, 6F, -9.5F);

		bodyModel[10].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[10].setRotationPoint(-0.5F, 6F, -9F);

		bodyModel[11].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[11].setRotationPoint(-0.5F, 6F, -9F);

		bodyModel[12].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[12].setRotationPoint(-0.5F, 6F, -9F);

		bodyModel[13].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[13].setRotationPoint(-0.5F, 6F, -9F);

		bodyModel[14].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[14].setRotationPoint(-0.5F, 6F, -7.5F);

		bodyModel[15].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[15].setRotationPoint(-0.5F, 6F, -7.5F);

		bodyModel[16].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[16].setRotationPoint(-0.5F, 6F, -7.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 158
		bodyModel[17].setRotationPoint(-3.5F, 3F, -4F);

		bodyModel[18].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 101 wheel 3 cover
		bodyModel[18].setRotationPoint(-0.5F, 6F, -9F);

		bodyModel[19].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3
		bodyModel[19].setRotationPoint(-0.5F, 6F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 211
		bodyModel[20].setRotationPoint(-3.5F, 3F, 2F);

		bodyModel[21].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4b
		bodyModel[21].setRotationPoint(-0.5F, 6F, 5.5F);

		bodyModel[22].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4b
		bodyModel[22].setRotationPoint(-0.5F, 6F, 5.5F);

		bodyModel[23].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4b
		bodyModel[23].setRotationPoint(-0.5F, 6F, 5.5F);

		bodyModel[24].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 4
		bodyModel[24].setRotationPoint(-0.5F, 6F, 9F);

		bodyModel[25].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 4 
		bodyModel[25].setRotationPoint(-0.5F, 6F, 9F);

		bodyModel[26].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 4
		bodyModel[26].setRotationPoint(-0.5F, 6F, 9F);

		bodyModel[27].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 4
		bodyModel[27].setRotationPoint(-0.5F, 6F, 9F);

		bodyModel[28].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,-0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 104 wheel 4 cover
		bodyModel[28].setRotationPoint(-0.5F, 6F, 9F);

		bodyModel[29].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[29].setRotationPoint(-0.5F, 6F, 9F);

		bodyModel[30].addBox(0F, 0F, -1F, 1, 1, 19, 0F); // Box 178
		bodyModel[30].setRotationPoint(7F, 6F, -8.5F);

		bodyModel[31].addBox(0F, 0F, -1F, 21, 2, 1, 0F); // Box 184
		bodyModel[31].setRotationPoint(6F, 1F, -10.5F);
		bodyModel[31].rotateAngleY = 1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 213
		bodyModel[32].setRotationPoint(8.01F, 6F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[33].setRotationPoint(-20F, 2F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 162
		bodyModel[34].setRotationPoint(-20F, 2F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 163
		bodyModel[35].setRotationPoint(-13F, 2F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 164
		bodyModel[36].setRotationPoint(-13F, 2F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[37].setRotationPoint(-17F, 6F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[38].setRotationPoint(-17F, 6F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 168
		bodyModel[39].setRotationPoint(-16.5F, 2.5F, -6.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		bodyModel[40].setRotationPoint(-16.5F, 2.5F, 6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
		bodyModel[41].setRotationPoint(-17.5F, 3F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 173
		bodyModel[42].setRotationPoint(-17.5F, 3F, 7F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 200
		bodyModel[43].setRotationPoint(-17F, 2F, -6.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 201
		bodyModel[44].setRotationPoint(-17F, 2F, 5.75F);

		bodyModel[45].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 174
		bodyModel[45].setRotationPoint(-20F, 1F, -7F);

		bodyModel[46].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 2735
		bodyModel[46].setRotationPoint(-20F, 1F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 170
		bodyModel[47].setRotationPoint(-16.5F, 7F, -6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 171
		bodyModel[48].setRotationPoint(-16.5F, 7F, 6.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 193
		bodyModel[49].setRotationPoint(4.51F, 2F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 0, 6, 5, 0F); // Box 194
		bodyModel[50].setRotationPoint(4.51F, 2F, 5F);

		bodyModel[51].addBox(-20F, 0F, 0F, 20, 1, 1, 0F); // Box 1970
		bodyModel[51].setRotationPoint(3.51F, 1F, -10F);
		bodyModel[51].rotateAngleY = -1.57079633F;

		bodyModel[52].addBox(0F, 0F, 0F, 1, 24, 19, 0F); // Box 145
		bodyModel[52].setRotationPoint(-39F, -23F, -9.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 146
		bodyModel[53].setRotationPoint(-39F, -23F, 9.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[54].setRotationPoint(-39F, -23F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 45, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[55].setRotationPoint(-38F, -23F, -10.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 45, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[56].setRotationPoint(-38F, -23F, 9.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 22, 19, 0F); // Box 144 rollup door CULLBOX
		bodyModel[57].setRotationPoint(5F, -22F, -9.5F);

		bodyModel[58].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 145
		bodyModel[58].setRotationPoint(6.01F, -10F, 6.5F);
		bodyModel[58].rotateAngleY = 1.57079633F;
		bodyModel[58].rotateAngleZ = -0.78539816F;

		bodyModel[59].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 146
		bodyModel[59].setRotationPoint(3F, -4.25F, 10.51F);
		bodyModel[59].rotateAngleY = -3.14159265F;
		bodyModel[59].rotateAngleZ = -0.78539816F;

		bodyModel[60].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 147
		bodyModel[60].setRotationPoint(-2F, -4.25F, -10.51F);
		bodyModel[60].rotateAngleY = -3.14159265F;
		bodyModel[60].rotateAngleZ = -0.78539816F;

		bodyModel[61].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 148
		bodyModel[61].setRotationPoint(3F, -4.25F, -10.51F);
		bodyModel[61].rotateAngleY = -3.14159265F;
		bodyModel[61].rotateAngleZ = -0.78539816F;

		bodyModel[62].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 108 hazmat plac
		bodyModel[62].setRotationPoint(-39.01F, -5F, 6.5F);
		bodyModel[62].rotateAngleY = 1.57079633F;
		bodyModel[62].rotateAngleZ = -0.78539816F;

		bodyModel[63].addShapeBox(-2F, -2F, 0F, 8, 8, 0, 0F,-0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -4.5F, -4.5F, 0F, -0.5F, -4.5F, 0F); // Box 145
		bodyModel[63].setRotationPoint(-39.01F, -10F, 6.5F);
		bodyModel[63].rotateAngleY = 1.57079633F;
		bodyModel[63].rotateAngleZ = -0.78539816F;

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 19, 0F); // Box 151
		bodyModel[64].setRotationPoint(7F, 0F, -9.5F);

		bodyModel[65].addBox(0F, 0F, -1F, 3, 5, 19, 0F); // Box 152 Rear lift CULLBOX
		bodyModel[65].setRotationPoint(7.01F, 1F, -8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153 side light mount CULLBOX
		bodyModel[66].setRotationPoint(-17F, 1F, -10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 154 side light L
		bodyModel[67].setRotationPoint(-16.5F, 1F, -10.51F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 156 side light R
		bodyModel[68].setRotationPoint(-16.5F, 1F, 10.51F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 157 brake light LR
		bodyModel[69].setRotationPoint(6.1F, -3F, 9.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 158 brake light UR
		bodyModel[70].setRotationPoint(6.1F, -6F, 9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 164 brake light LL
		bodyModel[71].setRotationPoint(6.1F, -3F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 165 brake light UL
		bodyModel[72].setRotationPoint(6.1F, -6F, -10.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 166
		bodyModel[73].setRotationPoint(-5.5F, 1F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 127 rear light top
		bodyModel[74].setRotationPoint(6.1F, -23F, -0.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 128 rear light top
		bodyModel[75].setRotationPoint(6.1F, -23F, -2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 129 rear light top
		bodyModel[76].setRotationPoint(6.1F, -23F, 1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 130 rear light top
		bodyModel[77].setRotationPoint(6.1F, -23F, -10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 131 rear light top
		bodyModel[78].setRotationPoint(6.1F, -23F, 9.5F);
	}
}