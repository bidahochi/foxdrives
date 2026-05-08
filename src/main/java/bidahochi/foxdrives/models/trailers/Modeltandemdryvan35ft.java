//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.03.2026 - 22:50:36
// Last changed on: 18.03.2026 - 22:50:36

package bidahochi.foxdrives.models.trailers; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modeltandemdryvan35ft extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public Modeltandemdryvan35ft() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[102];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 43, 10, textureX, textureY); // Box 124 axle 3-4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 101, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "wheel"); // Box 74 wheel 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 95, textureX, textureY, "wheel"); // Box 76 wheel 3
		bodyModel[4] = new ModelRendererTurbo(this, 23, 86, textureX, textureY, "wheel"); // Box 71 wheel 3
		bodyModel[5] = new ModelRendererTurbo(this, 1, 101, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[6] = new ModelRendererTurbo(this, 23, 96, textureX, textureY, "wheel"); // Box 77 wheel 3b
		bodyModel[7] = new ModelRendererTurbo(this, 23, 86, textureX, textureY, "wheel"); // Box 71 wheel 3b
		bodyModel[8] = new ModelRendererTurbo(this, 45, 84, textureX, textureY, "wheel"); // Box 101 wheel 3 cover
		bodyModel[9] = new ModelRendererTurbo(this, 1, 101, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[10] = new ModelRendererTurbo(this, 23, 96, textureX, textureY, "wheel"); // Box 77 wheel 4b
		bodyModel[11] = new ModelRendererTurbo(this, 23, 86, textureX, textureY, "wheel"); // Box 71 wheel 4b
		bodyModel[12] = new ModelRendererTurbo(this, 1, 101, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "wheel"); // Box 74 wheel 4
		bodyModel[14] = new ModelRendererTurbo(this, 1, 95, textureX, textureY, "wheel"); // Box 76 wheel 4
		bodyModel[15] = new ModelRendererTurbo(this, 23, 86, textureX, textureY, "wheel"); // Box 71 wheel 4
		bodyModel[16] = new ModelRendererTurbo(this, 34, 84, textureX, textureY, "wheel"); // Box 104 wheel 4 cover
		bodyModel[17] = new ModelRendererTurbo(this, 23, 86, textureX, textureY); // Box 296
		bodyModel[18] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 297
		bodyModel[19] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 298
		bodyModel[20] = new ModelRendererTurbo(this, 45, 90, textureX, textureY); // Box 299
		bodyModel[21] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 300
		bodyModel[22] = new ModelRendererTurbo(this, 23, 96, textureX, textureY); // Box 301
		bodyModel[23] = new ModelRendererTurbo(this, 23, 86, textureX, textureY); // Box 302
		bodyModel[24] = new ModelRendererTurbo(this, 1, 95, textureX, textureY); // Box 303
		bodyModel[25] = new ModelRendererTurbo(this, 23, 96, textureX, textureY); // Box 304
		bodyModel[26] = new ModelRendererTurbo(this, 23, 86, textureX, textureY); // Box 305
		bodyModel[27] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 306
		bodyModel[28] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 307
		bodyModel[29] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 308
		bodyModel[30] = new ModelRendererTurbo(this, 23, 86, textureX, textureY); // Box 309
		bodyModel[31] = new ModelRendererTurbo(this, 34, 90, textureX, textureY); // Box 310
		bodyModel[32] = new ModelRendererTurbo(this, 1, 95, textureX, textureY); // Box 311
		bodyModel[33] = new ModelRendererTurbo(this, 43, 10, textureX, textureY); // Box 312
		bodyModel[34] = new ModelRendererTurbo(this, 89, 39, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 110, 10, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 110, 14, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 42, 87, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 2, 62, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 129, 62, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 91, 18, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 104, 99, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 83, 99, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 54, 35, textureX, textureY, "cull"); // Box cull
		bodyModel[44] = new ModelRendererTurbo(this, 26, 32, textureX, textureY, "cull"); // Box cull
		bodyModel[45] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 83, 1, textureX, textureY, "leftTurnLight"); // glow taillights T
		bodyModel[47] = new ModelRendererTurbo(this, 76, 1, textureX, textureY, "rightTurnLight"); // glow taillights T
		bodyModel[48] = new ModelRendererTurbo(this, 69, 1, textureX, textureY, "brakeLight"); // glow taillights
		bodyModel[49] = new ModelRendererTurbo(this, 62, 1, textureX, textureY, "brakeLight"); // glow taillights
		bodyModel[50] = new ModelRendererTurbo(this, 110, 7, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 82, 92, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 82, 92, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 5, 17, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 82, 92, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 82, 92, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 168, 9, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 168, 9, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 34, 96, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 1, 88, textureX, textureY, "lamp"); // glow chicken lights
		bodyModel[61] = new ModelRendererTurbo(this, 125, 84, textureX, textureY, "lamp"); // glow chicken lights
		bodyModel[62] = new ModelRendererTurbo(this, 125, 106, textureX, textureY, "lamp"); // glow chicken lights
		bodyModel[63] = new ModelRendererTurbo(this, 1, 19, textureX, textureY, "lamp"); // glow rear chicken lights high
		bodyModel[64] = new ModelRendererTurbo(this, 37, 13, textureX, textureY, "cull"); // cull mansfield bar
		bodyModel[65] = new ModelRendererTurbo(this, 82, 88, textureX, textureY, "cull"); // cull mansfield bar
		bodyModel[66] = new ModelRendererTurbo(this, 95, 84, textureX, textureY, "cull"); // cull mansfield bar
		bodyModel[67] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 161, 8, textureX, textureY); // Box 73
		bodyModel[70] = new ModelRendererTurbo(this, 161, 8, textureX, textureY); // Box 74
		bodyModel[71] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 333
		bodyModel[72] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 161, 8, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 161, 8, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 45, 99, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 45, 99, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 91
		bodyModel[84] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 92
		bodyModel[85] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 93
		bodyModel[86] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 95
		bodyModel[87] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 96
		bodyModel[88] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 97
		bodyModel[89] = new ModelRendererTurbo(this, 45, 99, textureX, textureY); // Box 98
		bodyModel[90] = new ModelRendererTurbo(this, 168, 4, textureX, textureY); // Box 352 i am KING PIN
		bodyModel[91] = new ModelRendererTurbo(this, 110, 83, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 97, 94, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 65, 86, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 26, 48, textureX, textureY, "wheel"); // Box 77 wheel 4
		bodyModel[95] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 35, 48, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 35, 48, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 99
		bodyModel[99] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box rear lisenceplate
		bodyModel[101] = new ModelRendererTurbo(this, 4, 7, textureX, textureY); // Box 102

		bodyModel[0].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 124 axle 3-4
		bodyModel[0].setRotationPoint(-4.5F, 6F, -9.5F);

		bodyModel[1].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3
		bodyModel[1].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[2].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 74 wheel 3
		bodyModel[2].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[3].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76 wheel 3
		bodyModel[3].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[4].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3
		bodyModel[4].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[5].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 71 wheel 3b
		bodyModel[5].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[6].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 3b
		bodyModel[6].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[7].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 71 wheel 3b
		bodyModel[7].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[8].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101 wheel 3 cover
		bodyModel[8].setRotationPoint(-4.5F, 6F, -9F);

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

		bodyModel[16].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104 wheel 4 cover
		bodyModel[16].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[17].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 296
		bodyModel[17].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[18].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 297
		bodyModel[18].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[19].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[19].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[20].addShapeBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[20].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[21].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[21].setRotationPoint(4.5F, 6F, -7.5F);

		bodyModel[22].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[22].setRotationPoint(4.5F, 6F, -7.5F);

		bodyModel[23].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 302
		bodyModel[23].setRotationPoint(4.5F, 6F, -7.5F);

		bodyModel[24].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[24].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[25].addShapeBox(-1.5F, -4F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[25].setRotationPoint(4.5F, 6F, 5.5F);

		bodyModel[26].addShapeBox(1F, -1.5F, 0F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 305
		bodyModel[26].setRotationPoint(4.5F, 6F, 5.5F);

		bodyModel[27].addShapeBox(-4F, -1.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[27].setRotationPoint(4.5F, 6F, 5.5F);

		bodyModel[28].addShapeBox(-4F, -1.5F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[28].setRotationPoint(4.5F, 6F, 9F);

		bodyModel[29].addShapeBox(-1.5F, -4F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 308
		bodyModel[29].setRotationPoint(4.5F, 6F, 9F);

		bodyModel[30].addShapeBox(1F, -1.5F, -1F, 3, 3, 2, 0F,-0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F); // Box 309
		bodyModel[30].setRotationPoint(4.5F, 6F, 9F);

		bodyModel[31].addShapeBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[31].setRotationPoint(4.5F, 6F, 9F);

		bodyModel[32].addShapeBox(-1.5F, 1F, -1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[32].setRotationPoint(4.5F, 6F, 9F);

		bodyModel[33].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 312
		bodyModel[33].setRotationPoint(4.5F, 6F, -9.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 62, 1, 21, 0F); // Box 34
		bodyModel[34].setRotationPoint(-47F, 0F, -10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 35
		bodyModel[35].setRotationPoint(-8F, 1F, -3.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 36
		bodyModel[36].setRotationPoint(-8F, 1F, 2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 21, 19, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-48F, -20F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 62, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-47F, -20F, -10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 62, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-47F, -20F, 9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 62, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[40].setRotationPoint(-47F, -20F, -9.5F);

		bodyModel[41].addShapeBox(-0.5F, 0F, 0.5F, 1, 19, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 41
		bodyModel[41].setRotationPoint(14.5F, -19F, -10F);

		bodyModel[42].addShapeBox(-0.5F, 0F, -9.5F, 1, 19, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(14.5F, -19F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 21, 0F); // Box cull
		bodyModel[43].setRotationPoint(14F, 1F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box cull
		bodyModel[44].setRotationPoint(11F, 1F, -10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 0, 2, 21, 0F); // Box 46
		bodyModel[45].setRotationPoint(15.01F, 1F, -10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // glow taillights
		bodyModel[46].setRotationPoint(14.52F, 1F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // glow taillights
		bodyModel[47].setRotationPoint(14.52F, 1F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // glow taillights
		bodyModel[48].setRotationPoint(14.52F, 1F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // glow taillights
		bodyModel[49].setRotationPoint(14.52F, 1F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 2, 0, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[50].setRotationPoint(-29F, 1F, 10.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 54
		bodyModel[51].setRotationPoint(-28F, 5F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 55
		bodyModel[52].setRotationPoint(-28F, 5F, 8F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 56
		bodyModel[53].setRotationPoint(-27F, 6F, -8F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 57
		bodyModel[54].setRotationPoint(-28F, 5F, 5.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 58
		bodyModel[55].setRotationPoint(-28F, 5F, -6.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 59
		bodyModel[56].setRotationPoint(-27F, 1F, -7.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 60
		bodyModel[57].setRotationPoint(-27F, 1F, 6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0.5F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[58].setRotationPoint(-26.25F, 5F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 62
		bodyModel[59].setRotationPoint(-48.5F, -4.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 20, 19, 0F,0.05F, 0F, 0.05F, -0.05F, 0F, 1.05F, -0.05F, 0F, 1.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, -0.05F, 0F, 1.05F, -0.05F, 0F, 1.05F, 0.05F, 0F, 0.05F); // glow chicken lights
		bodyModel[60].setRotationPoint(-48F, -19.5F, -9.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 62, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // glow chicken lights
		bodyModel[61].setRotationPoint(-47F, -20F, -10.51F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 62, 21, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // glow chicken lights
		bodyModel[62].setRotationPoint(-47F, -20F, 10.51F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // glow rear chicken lights high
		bodyModel[63].setRotationPoint(15.01F, -20F, -10.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 4, 11, 0F); // cull mansfield bar
		bodyModel[64].setRotationPoint(15F, 1F, -5.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // cull mansfield bar
		bodyModel[65].setRotationPoint(15F, 5F, -4.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 5, 7, 0F); // cull mansfield bar
		bodyModel[66].setRotationPoint(16F, 1F, -3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 71
		bodyModel[67].setRotationPoint(-8F, 3F, -3.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 72
		bodyModel[68].setRotationPoint(-8F, 3F, 2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 73
		bodyModel[69].setRotationPoint(-3F, 3F, 2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 74
		bodyModel[70].setRotationPoint(-3F, 3F, -3.5F);

		bodyModel[71].addShapeBox(-4F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F); // Box 333
		bodyModel[71].setRotationPoint(-5F, 5.5F, -3.5F);
		bodyModel[71].rotateAngleZ = 0.34906585F;

		bodyModel[72].addShapeBox(-4F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F); // Box 78
		bodyModel[72].setRotationPoint(-5F, 5.5F, 2.5F);
		bodyModel[72].rotateAngleZ = 0.34906585F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F); // Box 79
		bodyModel[73].setRotationPoint(5F, 5.5F, 2.5F);
		bodyModel[73].rotateAngleZ = 0.34906585F;

		bodyModel[74].addShapeBox(-4F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F); // Box 80
		bodyModel[74].setRotationPoint(5F, 5.5F, 2.5F);
		bodyModel[74].rotateAngleZ = 0.34906585F;

		bodyModel[75].addShapeBox(-4F, 0F, 0F, 4, 4, 1, 0F,-0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F); // Box 81
		bodyModel[75].setRotationPoint(5F, 5.5F, -3.5F);
		bodyModel[75].rotateAngleZ = 0.34906585F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F); // Box 82
		bodyModel[76].setRotationPoint(5F, 5.5F, -3.5F);
		bodyModel[76].rotateAngleZ = 0.34906585F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
		bodyModel[77].setRotationPoint(7F, 3F, 2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 84
		bodyModel[78].setRotationPoint(2F, 3F, 2.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 85
		bodyModel[79].setRotationPoint(2F, 3F, -3.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 86
		bodyModel[80].setRotationPoint(7F, 3F, -3.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 87
		bodyModel[81].setRotationPoint(-8F, 5F, -2.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 88
		bodyModel[82].setRotationPoint(-7F, 2F, -2.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F); // Box 91
		bodyModel[83].setRotationPoint(-5F, 5.5F, -3.5F);
		bodyModel[83].rotateAngleZ = 0.34906585F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -0.75F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -2F, 0.1F, -0.5F, -3F, 0.1F, -0.5F, -3F, 0.1F, 0F, -2F, 0.1F); // Box 92
		bodyModel[84].setRotationPoint(-5F, 5.5F, 2.5F);
		bodyModel[84].rotateAngleZ = 0.34906585F;

		bodyModel[85].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 93
		bodyModel[85].setRotationPoint(-7F, 4.25F, -2F);
		bodyModel[85].rotateAngleZ = 0.89011792F;

		bodyModel[86].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 95
		bodyModel[86].setRotationPoint(-7F, 4.25F, 1F);
		bodyModel[86].rotateAngleZ = 0.89011792F;

		bodyModel[87].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 96
		bodyModel[87].setRotationPoint(3F, 4.25F, 1F);
		bodyModel[87].rotateAngleZ = 0.89011792F;

		bodyModel[88].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 97
		bodyModel[88].setRotationPoint(3F, 4.25F, -2F);
		bodyModel[88].rotateAngleZ = 0.89011792F;

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 98
		bodyModel[89].setRotationPoint(2F, 5F, -2.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352 i am KING PIN
		bodyModel[90].setRotationPoint(-40.5F, 0.5F, -0.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 92
		bodyModel[91].setRotationPoint(10F, 1F, -10.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 0, 8, 5, 0F); // Box 93
		bodyModel[92].setRotationPoint(10F, 1F, 5.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[93].setRotationPoint(-26F, -18F, 9.75F);

		bodyModel[94].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77 wheel 4
		bodyModel[94].setRotationPoint(-4.5F, 6F, 9F);

		bodyModel[95].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[95].setRotationPoint(4.5F, 6F, 9F);

		bodyModel[96].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[96].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[97].addShapeBox(-1.5F, -1.5F, -1F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[97].setRotationPoint(4.5F, 6F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.5F, 0F, -5F, 0.5F); // Box 99
		bodyModel[98].setRotationPoint(-26.25F, 5F, -6.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[99].setRotationPoint(-26.25F, 5F, 2.5F);

		bodyModel[100].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box rear lisenceplate
		bodyModel[100].setRotationPoint(15.05F, 4F, -2F);

		bodyModel[101].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 102
		bodyModel[101].setRotationPoint(15.05F, 5F, -10F);
	}
}