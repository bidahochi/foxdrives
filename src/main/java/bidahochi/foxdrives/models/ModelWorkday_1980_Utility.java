//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Workday_1980
// Model Creator: Bida
// Created on: 19.01.2024 - 17:02:34
// Last changed on: 19.01.2024 - 17:02:34

package bidahochi.foxdrives.models; //Path where the model is located


import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelWorkday_1980_Utility extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelWorkday_1980_Utility() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[159];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, "wheel front"); // Box 17 Wheel1
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY, "wheel front"); // Box 17 Wheel2
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY, "wheel"); // Box 136 Wheel3
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY, "wheel"); // Box 9 Wheel3
		bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY, "wheel"); // Box 17 Wheel3
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY, "wheel"); // Box 136 Wheel4
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY, "wheel"); // Box 9 Wheel4
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY, "wheel"); // Box 12 Wheel4
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23 axle
		bodyModel[17] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 23 axle
		bodyModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		bodyModel[28] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 49
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 50
		bodyModel[30] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 346
		bodyModel[31] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 352
		bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 55
		bodyModel[35] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 56
		bodyModel[36] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 60
		bodyModel[40] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 70 door swing left
		bodyModel[44] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 72 door swing right
		bodyModel[45] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 73 door swing left
		bodyModel[46] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 74 door swing right
		bodyModel[47] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 165 driveline
		bodyModel[48] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 83 boy this geometry sure is exhausting
		bodyModel[49] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 84 boy this geometry sure is exhausting
		bodyModel[50] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 85 boy this geometry sure is exhausting
		bodyModel[51] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 226 steeringwhool
		bodyModel[52] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 227
		bodyModel[53] = new ModelRendererTurbo(this, 25, 17, textureX, textureY, BoxName.brakeLight); // Box 96 taillight
		bodyModel[54] = new ModelRendererTurbo(this, 65, 17, textureX, textureY, BoxName.brakeLight); // Box 97 taillight
		bodyModel[55] = new ModelRendererTurbo(this, 25, 9, textureX, textureY, BoxName.rightTurnLight); // Box 98 turnlight R
		bodyModel[56] = new ModelRendererTurbo(this, 73, 9, textureX, textureY, BoxName.leftTurnLight); // Box 99 turnlight L
		bodyModel[57] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 100 hitch ball
		bodyModel[58] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 101 hitch
		bodyModel[59] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 102
		bodyModel[60] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 103
		bodyModel[61] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 104
		bodyModel[62] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 183 plate
		bodyModel[63] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 106 plate
		bodyModel[64] = new ModelRendererTurbo(this, 41, 65, textureX, textureY, BoxName.headLight); // Box 59 headlight
		bodyModel[65] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, BoxName.rightTurnLight); // Box 201 turnlight R
		bodyModel[66] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 114
		bodyModel[67] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 115
		bodyModel[68] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 116
		bodyModel[69] = new ModelRendererTurbo(this, 153, 65, textureX, textureY, BoxName.headLight); // Box 59 headlight
		bodyModel[70] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 179
		bodyModel[71] = new ModelRendererTurbo(this, 209, 33, textureX, textureY, BoxName.leftTurnLight); // Box 201 turnlight L
		bodyModel[72] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 121
		bodyModel[73] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 122
		bodyModel[74] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 123
		bodyModel[75] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 124
		bodyModel[76] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 129
		bodyModel[78] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 130
		bodyModel[79] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 131
		bodyModel[80] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 132
		bodyModel[81] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 133
		bodyModel[82] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 134
		bodyModel[83] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 135
		bodyModel[84] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 136
		bodyModel[85] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 137
		bodyModel[86] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 138
		bodyModel[87] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 139
		bodyModel[88] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 140
		bodyModel[89] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 141
		bodyModel[90] = new ModelRendererTurbo(this, 57, 81, textureX, textureY, BoxName.rightTurnLight); // Box 142 front orangelight
		bodyModel[91] = new ModelRendererTurbo(this, 57, 89, textureX, textureY, BoxName.leftTurnLight); // Box 143 front orangelight
		bodyModel[92] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 144
		bodyModel[93] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 145
		bodyModel[94] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 146
		bodyModel[95] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 147
		bodyModel[96] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 148
		bodyModel[97] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 149
		bodyModel[98] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 73 door swing left
		bodyModel[99] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 74 door swing right
		bodyModel[100] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 152
		bodyModel[101] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 153
		bodyModel[102] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 154
		bodyModel[103] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 155
		bodyModel[104] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 156
		bodyModel[105] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 157
		bodyModel[106] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 158
		bodyModel[107] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 159
		bodyModel[108] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 160
		bodyModel[109] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 161
		bodyModel[110] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 162
		bodyModel[111] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 163
		bodyModel[112] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 164 frame bit
		bodyModel[113] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 165 frame bit
		bodyModel[114] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 166 boy this geometry sure is exhausting
		bodyModel[115] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 167 frame bit
		bodyModel[116] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 168 fueltank
		bodyModel[117] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 169 frame bit
		bodyModel[118] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 170 frame bit
		bodyModel[119] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 195 emblem
		bodyModel[120] = new ModelRendererTurbo(this, 13, 119, textureX, textureY); // Box 149
		bodyModel[121] = new ModelRendererTurbo(this, 3, 117, textureX, textureY); // Box 150
		bodyModel[122] = new ModelRendererTurbo(this, 2, 103, textureX, textureY); // Box 151
		bodyModel[123] = new ModelRendererTurbo(this, 12, 166, textureX, textureY); // Box 149
		bodyModel[124] = new ModelRendererTurbo(this, 26, 149, textureX, textureY); // Box 150
		bodyModel[125] = new ModelRendererTurbo(this, 6, 134, textureX, textureY); // Box 151
		bodyModel[126] = new ModelRendererTurbo(this, 33, 138, textureX, textureY); // Box 152
		bodyModel[127] = new ModelRendererTurbo(this, 86, 133, textureX, textureY); // Box 153
		bodyModel[128] = new ModelRendererTurbo(this, 60, 133, textureX, textureY); // Box 154
		bodyModel[129] = new ModelRendererTurbo(this, 54, 153, textureX, textureY); // Box 155
		bodyModel[130] = new ModelRendererTurbo(this, 3, 147, textureX, textureY); // Box 156
		bodyModel[131] = new ModelRendererTurbo(this, 28, 167, textureX, textureY); // Box 157
		bodyModel[132] = new ModelRendererTurbo(this, 84, 181, textureX, textureY); // Box 158
		bodyModel[133] = new ModelRendererTurbo(this, 53, 178, textureX, textureY); // Box 159
		bodyModel[134] = new ModelRendererTurbo(this, 53, 170, textureX, textureY); // Box 160
		bodyModel[135] = new ModelRendererTurbo(this, 62, 174, textureX, textureY); // Box 161
		bodyModel[136] = new ModelRendererTurbo(this, 126, 151, textureX, textureY); // Box 162
		bodyModel[137] = new ModelRendererTurbo(this, 73, 170, textureX, textureY); // Box 163
		bodyModel[138] = new ModelRendererTurbo(this, 112, 129, textureX, textureY); // Box 95 tailgate swing -90 z
		bodyModel[139] = new ModelRendererTurbo(this, 242, 125, textureX, textureY); // Box 364 prime base
		bodyModel[140] = new ModelRendererTurbo(this, 242, 121, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[141] = new ModelRendererTurbo(this, 242, 121, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[142] = new ModelRendererTurbo(this, 242, 121, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[143] = new ModelRendererTurbo(this, 242, 121, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[144] = new ModelRendererTurbo(this, 245, 182, textureX, textureY); // Box 194 hamburger
		bodyModel[145] = new ModelRendererTurbo(this, 8, 184, textureX, textureY); // Box 195 welder
		bodyModel[146] = new ModelRendererTurbo(this, 31, 188, textureX, textureY); // Box 196 gas bottle
		bodyModel[147] = new ModelRendererTurbo(this, 40, 188, textureX, textureY); // Box 197 gas bottle nozzle
		bodyModel[148] = new ModelRendererTurbo(this, 45, 189, textureX, textureY); // Box 198 water cooler
		bodyModel[149] = new ModelRendererTurbo(this, 51, 203, textureX, textureY); // Box 200 compressor tank
		bodyModel[150] = new ModelRendererTurbo(this, 68, 196, textureX, textureY); // Box 201 compressor motor
		bodyModel[151] = new ModelRendererTurbo(this, 55, 195, textureX, textureY); // Box 202 compressor compressy bit
		bodyModel[152] = new ModelRendererTurbo(this, 53, 212, textureX, textureY, "cull"); // Box 203 cull compressor feet
		bodyModel[153] = new ModelRendererTurbo(this, 60, 189, textureX, textureY, "cull"); // Box 204 cull compressor cage
		bodyModel[154] = new ModelRendererTurbo(this, 243, 175, textureX, textureY); // Box 177 wide prime base
		bodyModel[155] = new ModelRendererTurbo(this, 245, 171, textureX, textureY, BoxName.prime4); // Box 178 PRIME4
		bodyModel[156] = new ModelRendererTurbo(this, 245, 171, textureX, textureY, BoxName.prime2); // Box 179 PRIME2
		bodyModel[157] = new ModelRendererTurbo(this, 243, 169, textureX, textureY, BoxName.prime1); // Box 180 PRIME1
		bodyModel[158] = new ModelRendererTurbo(this, 243, 169, textureX, textureY, BoxName.prime3); // Box 181 PRIME3

		bodyModel[0].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[0].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[1].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[2].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[3].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[3].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[4].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[4].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[5].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[5].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[6].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[6].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[7].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[7].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[8].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
		bodyModel[8].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[9].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
		bodyModel[9].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[10].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
		bodyModel[10].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[11].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel3
		bodyModel[11].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[12].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
		bodyModel[12].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[13].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
		bodyModel[13].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[14].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
		bodyModel[14].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[15].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel4
		bodyModel[15].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[16].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[16].setRotationPoint(-13.5F, 7F, 0F);

		bodyModel[17].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[17].setRotationPoint(12.5F, 7F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[18].setRotationPoint(-18F, 5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-11F, 3F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 22
		bodyModel[20].setRotationPoint(-10F, 5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[21].setRotationPoint(-9F, 5F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(-18F, 3F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 31
		bodyModel[23].setRotationPoint(-20.75F, 5F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 9, 3, 18, 0F); // Box 34
		bodyModel[24].setRotationPoint(-18F, 0F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -2F, 1F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 1F, 1F, 0F); // Box 39
		bodyModel[25].setRotationPoint(-19F, -2F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 1F, 0F); // Box 41
		bodyModel[26].setRotationPoint(-19F, -2F, -4F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 48
		bodyModel[27].setRotationPoint(-9F, -1F, -8F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 3, 2, 0F); // Box 49
		bodyModel[28].setRotationPoint(-9F, 2F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[29].setRotationPoint(-9F, 0F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 346
		bodyModel[30].setRotationPoint(-5F, 2F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 352
		bodyModel[31].setRotationPoint(-1F, -3F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 53
		bodyModel[32].setRotationPoint(-1F, -3F, 1.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 54
		bodyModel[33].setRotationPoint(-5F, 2F, 1.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 55
		bodyModel[34].setRotationPoint(-4F, 3F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 56
		bodyModel[35].setRotationPoint(-9F, 0F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 57
		bodyModel[36].setRotationPoint(-9F, 0F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[37].setRotationPoint(-1F, -7F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[38].setRotationPoint(-1F, -7F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[39].setRotationPoint(-10.5F, -7F, -4F);

		bodyModel[40].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 61
		bodyModel[40].setRotationPoint(-6F, -8F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.55F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.55F, 0F, 0F); // Box 63
		bodyModel[41].setRotationPoint(-7F, -7F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 12, 16, 0F); // Box 66
		bodyModel[42].setRotationPoint(0F, -7F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, -0.5F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70 door swing left
		bodyModel[43].setRotationPoint(-8F, -1F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72 door swing right
		bodyModel[44].setRotationPoint(-8F, -1F, 8.5F);

		bodyModel[45].addShapeBox(2F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 73 door swing left
		bodyModel[45].setRotationPoint(-8F, -7F, -8.5F);

		bodyModel[46].addShapeBox(2F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74 door swing right
		bodyModel[46].setRotationPoint(-8F, -7F, 8.5F);

		bodyModel[47].addShapeBox(-1F, -1F, -7F, 24, 2, 2, 0F,0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 165 driveline
		bodyModel[47].setRotationPoint(-11.75F, 7F, 5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0F, 0F); // Box 83 boy this geometry sure is exhausting
		bodyModel[48].setRotationPoint(18.5F, 7F, -6F);
		bodyModel[48].rotateAngleY = -1.57079633F;

		bodyModel[49].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 84 boy this geometry sure is exhausting
		bodyModel[49].setRotationPoint(13.5F, 7F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 85 boy this geometry sure is exhausting
		bodyModel[50].setRotationPoint(18.5F, 7F, -5F);

		bodyModel[51].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[51].setRotationPoint(-6.49F, -0.75F, -5F);
		bodyModel[51].rotateAngleZ = 0.29670597F;

		bodyModel[52].addBox(-1F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 227
		bodyModel[52].setRotationPoint(-6.5F, -0.75F, -5F);
		bodyModel[52].rotateAngleZ = 0.29670597F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 96 taillight
		bodyModel[53].setRotationPoint(22.51F, -1.5F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 97 taillight
		bodyModel[54].setRotationPoint(22.51F, -1.5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 98 turnlight R
		bodyModel[55].setRotationPoint(22.51F, 1F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F); // Box 99 turnlight L
		bodyModel[56].setRotationPoint(22.51F, 1F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 100 hitch ball
		bodyModel[57].setRotationPoint(24.5F, 5.5F, -0.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 101 hitch
		bodyModel[58].setRotationPoint(21.5F, 6.5F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[59].setRotationPoint(-8.5F, -2.75F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
		bodyModel[60].setRotationPoint(-8.5F, -2.75F, 9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[61].setRotationPoint(-13F, -10F, 8.5F);

		bodyModel[62].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[62].setRotationPoint(22.51F, 5.5F, 5F);

		bodyModel[63].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 106 plate
		bodyModel[63].setRotationPoint(-20.26F, 8F, 2F);
		bodyModel[63].rotateAngleY = -3.14159265F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 59 headlight
		bodyModel[64].setRotationPoint(-20F, 1F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201 turnlight R
		bodyModel[65].setRotationPoint(-19.01F, 0.5F, 8.01F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[66].setRotationPoint(-20F, 0F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 115
		bodyModel[67].setRotationPoint(-20F, 0F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -2F, 1F, 1F, 1F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 116
		bodyModel[68].setRotationPoint(-19F, -2F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 59 headlight
		bodyModel[69].setRotationPoint(-20F, 1F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 179
		bodyModel[70].setRotationPoint(-20F, 0F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 201 turnlight L
		bodyModel[71].setRotationPoint(-19.01F, 0.5F, -9.01F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[72].setRotationPoint(-20F, 0F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 122
		bodyModel[73].setRotationPoint(-20F, 0F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 123
		bodyModel[74].setRotationPoint(-20F, 5F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 124
		bodyModel[75].setRotationPoint(-19F, 0F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(-20F, 0F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F); // Box 129
		bodyModel[77].setRotationPoint(-20F, 0F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[78].setRotationPoint(-19.75F, 1F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		bodyModel[79].setRotationPoint(-19.75F, 2F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[80].setRotationPoint(-20F, 3F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133
		bodyModel[81].setRotationPoint(-20F, 3F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, -0.5F, 0F); // Box 134
		bodyModel[82].setRotationPoint(-20F, 3F, 4F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 135
		bodyModel[83].setRotationPoint(-19.5F, 0.45F, -4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 136
		bodyModel[84].setRotationPoint(-20F, 3F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[85].setRotationPoint(-20F, 3F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[86].setRotationPoint(-20F, 3F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,1F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 139
		bodyModel[87].setRotationPoint(-18F, 4F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[88].setRotationPoint(-19F, 3F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[89].setRotationPoint(-18.75F, 3F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 142 front orangelight
		bodyModel[90].setRotationPoint(-20.01F, 4F, 4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 143 front orangelight
		bodyModel[91].setRotationPoint(-20.01F, 4F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[92].setRotationPoint(-10F, -7F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 145
		bodyModel[93].setRotationPoint(-10F, -7F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 146
		bodyModel[94].setRotationPoint(-19.7F, 0F, -0.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[95].setRotationPoint(-7.5F, -8F, -4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 148
		bodyModel[96].setRotationPoint(-6F, -8F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[97].setRotationPoint(-6F, -8F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, -0.5F, 2, 6, 1, 0F,-2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 73 door swing left
		bodyModel[98].setRotationPoint(-8F, -7F, -8.5F);

		bodyModel[99].addShapeBox(0F, 0F, -0.5F, 2, 6, 1, 0F,-2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74 door swing right
		bodyModel[99].setRotationPoint(-8F, -7F, 8.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[100].setRotationPoint(-7.5F, -8F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
		bodyModel[101].setRotationPoint(-10.5F, -7F, 4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-3.5F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[102].setRotationPoint(-10.5F, -7F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[103].setRotationPoint(-7.5F, -8F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[104].setRotationPoint(-6F, -8F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[105].setRotationPoint(-6F, -8F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[106].setRotationPoint(-9F, -1F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[107].setRotationPoint(-9F, -1F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.55F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.55F, 0F, 0F); // Box 160
		bodyModel[108].setRotationPoint(-7F, -7F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 161
		bodyModel[109].setRotationPoint(0F, 5F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 162
		bodyModel[110].setRotationPoint(0F, 5F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 163
		bodyModel[111].setRotationPoint(0F, 5F, -8F);

		bodyModel[112].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 164 frame bit
		bodyModel[112].setRotationPoint(-18F, 6.25F, 4F);

		bodyModel[113].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 165 frame bit
		bodyModel[113].setRotationPoint(-18F, 6.25F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166 boy this geometry sure is exhausting
		bodyModel[114].setRotationPoint(-10.5F, 7F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167 frame bit
		bodyModel[115].setRotationPoint(21F, 6.25F, -7F);

		bodyModel[116].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 168 fueltank
		bodyModel[116].setRotationPoint(-3F, 6F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 169 frame bit
		bodyModel[117].setRotationPoint(11F, 5.25F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 170 frame bit
		bodyModel[118].setRotationPoint(11F, 5.25F, 4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 195 emblem
		bodyModel[119].setRotationPoint(-19.76F, 1.5F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[120].setRotationPoint(-9F, -2F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[121].setRotationPoint(-9F, -2F, 3F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 151
		bodyModel[122].setRotationPoint(-9F, -2F, -3F);

		bodyModel[123].addBox(0F, 0F, 0F, 7, 9, 4, 0F); // Box 149
		bodyModel[123].setRotationPoint(1.5F, -2F, -9F);

		bodyModel[124].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 150
		bodyModel[124].setRotationPoint(16.5F, -2F, -9F);

		bodyModel[125].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 151
		bodyModel[125].setRotationPoint(8.5F, -2F, -9F);

		bodyModel[126].addBox(0F, 0F, 0F, 8, 5, 4, 0F); // Box 152
		bodyModel[126].setRotationPoint(8.5F, -2F, 5F);

		bodyModel[127].addBox(0F, 0F, 0F, 7, 9, 4, 0F); // Box 153
		bodyModel[127].setRotationPoint(1.5F, -2F, 5F);

		bodyModel[128].addBox(0F, 0F, 0F, 6, 9, 4, 0F); // Box 154
		bodyModel[128].setRotationPoint(16.5F, -2F, 5F);

		bodyModel[129].addBox(0F, 0F, 0F, 21, 1, 10, 0F); // Box 155
		bodyModel[129].setRotationPoint(1.5F, 5F, -5F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 7, 10, 0F); // Box 156
		bodyModel[130].setRotationPoint(1.5F, -2F, -5F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 1, 18, 0F); // Box 157
		bodyModel[131].setRotationPoint(22.5F, 6F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[132].setRotationPoint(8.5F, 3F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[133].setRotationPoint(8.5F, 3F, 6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 160
		bodyModel[134].setRotationPoint(14.5F, 3F, 6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 161
		bodyModel[135].setRotationPoint(14.5F, 3F, -9F);

		bodyModel[136].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 162
		bodyModel[136].setRotationPoint(8.5F, 3F, -6F);

		bodyModel[137].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 163
		bodyModel[137].setRotationPoint(8.5F, 3F, 5F);

		bodyModel[138].addShapeBox(-1F, -7F, 0F, 1, 7, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 95 tailgate swing -90 z
		bodyModel[138].setRotationPoint(22F, 5F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[139].setRotationPoint(-3.5F, -9F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[140].setRotationPoint(-3.5F, -9.5F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[141].setRotationPoint(-3.5F, -9.5F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[142].setRotationPoint(-3.5F, -9.5F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[143].setRotationPoint(-3.5F, -9.5F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -3F, -0.25F, -0.25F, -3F, -0.25F, -0.25F, -3F, -0.25F, -0.25F, -3F, -0.25F); // Box 194 hamburger
		bodyModel[144].setRotationPoint(-9F, -3F, -2F);
		bodyModel[144].rotateAngleY = -0.41887902F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 195 welder
		bodyModel[145].setRotationPoint(1.75F, -8F, -9F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 11, 4, 0F); // Box 196 gas bottle
		bodyModel[146].setRotationPoint(3F, -6F, -5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 197 gas bottle nozzle
		bodyModel[147].setRotationPoint(3.5F, -7F, -4F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Box 198 water cooler
		bodyModel[148].setRotationPoint(2F, -6F, 6F);

		bodyModel[149].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 200 compressor tank
		bodyModel[149].setRotationPoint(3.5F, 2.22044604925031E-16F, 0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 201 compressor motor
		bodyModel[150].setRotationPoint(3F, -3F, 0.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 202 compressor compressy bit
		bodyModel[151].setRotationPoint(8F, -4F, 0.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 203 cull compressor feet
		bodyModel[152].setRotationPoint(4.5F, 3.99F, 0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204 cull compressor cage
		bodyModel[153].setRotationPoint(4F, -4.25F, 3.01F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177 wide prime base
		bodyModel[154].setRotationPoint(-1.5F, -8.75F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 178 PRIME4
		bodyModel[155].setRotationPoint(-1.5F, -9.25F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 179 PRIME2
		bodyModel[156].setRotationPoint(-1.5F, -9.25F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 180 PRIME1
		bodyModel[157].setRotationPoint(-1.5F, -9.25F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 181 PRIME3
		bodyModel[158].setRotationPoint(-1.5F, -9.25F, -2F);
	}
}