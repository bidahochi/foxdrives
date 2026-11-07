//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model:
// Model Creator: me
// Created on: 01.01.2026 - 00:02:45
// Last changed on: 01.01.2026 - 00:02:45

package bidahochi.foxdrives.models; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelD350 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelD350() //Same as Filename
	{
	bodyModel = new ModelRendererTurbo[313];

	initbodyModel_1();

	translateAll(0F, 0F, 0F);


	flipAll();
}

private void initbodyModel_1() {
	bodyModel[0] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // driving my shaft
	bodyModel[1] = new ModelRendererTurbo(this, 90, 187, textureX, textureY); // fueling my tank
	bodyModel[2] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 175
	bodyModel[3] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 176
	bodyModel[4] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 177
	bodyModel[5] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 327
	bodyModel[6] = new ModelRendererTurbo(this, 60, 190, textureX, textureY); // Box 494 BIG HOSS MUFFLER (SIZE OF TORSO)
	bodyModel[7] = new ModelRendererTurbo(this, 80, 187, textureX, textureY); // Complete power loss
	bodyModel[8] = new ModelRendererTurbo(this, 81, 190, textureX, textureY); // Complete power loss
	bodyModel[9] = new ModelRendererTurbo(this, 79, 190, textureX, textureY); // Complete power loss
	bodyModel[10] = new ModelRendererTurbo(this, 68, 184, textureX, textureY); // PIPE WITH NO CAT (unmodeled)
	bodyModel[11] = new ModelRendererTurbo(this, 59, 184, textureX, textureY); // PIPE WITH NO CAT (unmodeled)
	bodyModel[12] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 511
	bodyModel[13] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 797
	bodyModel[14] = new ModelRendererTurbo(this, 16, 120, textureX, textureY); // Box 832
	bodyModel[15] = new ModelRendererTurbo(this, 47, 193, textureX, textureY); // Box 455
	bodyModel[16] = new ModelRendererTurbo(this, 0, 156, textureX, textureY); // Box 552
	bodyModel[17] = new ModelRendererTurbo(this, 0, 156, textureX, textureY); // Box 553
	bodyModel[18] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 556
	bodyModel[19] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 557
	bodyModel[20] = new ModelRendererTurbo(this, 33, 181, textureX, textureY); // Box 558
	bodyModel[21] = new ModelRendererTurbo(this, 24, 181, textureX, textureY); // Box 561 engine cradle/suspension point or something
	bodyModel[22] = new ModelRendererTurbo(this, 24, 193, textureX, textureY,"cull"); // Box 566 CULL sus pension hangar
	bodyModel[23] = new ModelRendererTurbo(this, 24, 193, textureX, textureY,"cull"); // CULL sus pension hangar
	bodyModel[24] = new ModelRendererTurbo(this, 47, 193, textureX, textureY); // Box 273
	bodyModel[25] = new ModelRendererTurbo(this, 58, 196, textureX, textureY); // Box 275 The outcome will SHOCK you
	bodyModel[26] = new ModelRendererTurbo(this, 58, 196, textureX, textureY); // Box 275 The outcome will SHOCK you
	bodyModel[27] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 276
	bodyModel[28] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 277
	bodyModel[29] = new ModelRendererTurbo(this, 0, 176, textureX, textureY); // Box 339
	bodyModel[30] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 340
	bodyModel[31] = new ModelRendererTurbo(this, 26, 0, textureX, textureY,"brakeLight"); // Taillight L Utility Bed
	bodyModel[32] = new ModelRendererTurbo(this, 81, 14, textureX, textureY); // Box 157
	bodyModel[33] = new ModelRendererTurbo(this, 102, 14, textureX, textureY); // Box 158
	bodyModel[34] = new ModelRendererTurbo(this, 121, 14, textureX, textureY); // Box 159
	bodyModel[35] = new ModelRendererTurbo(this, 5, 26, textureX, textureY); // Box 164
	bodyModel[36] = new ModelRendererTurbo(this, 1, 56, textureX, textureY); // Stock Bumper
	bodyModel[37] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Stock Bumper
	bodyModel[38] = new ModelRendererTurbo(this, 1, 56, textureX, textureY); // Stock Bumper
	bodyModel[39] = new ModelRendererTurbo(this, 0, 56, textureX, textureY); // Stock Bumper
	bodyModel[40] = new ModelRendererTurbo(this, 6, 56, textureX, textureY); // Stock Bumper
	bodyModel[41] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Stock Bumper
	bodyModel[42] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Stock Bumper
	bodyModel[43] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Stock Bumper
	bodyModel[44] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Stock Bumper
	bodyModel[45] = new ModelRendererTurbo(this, 6, 68, textureX, textureY); // Stock Bumper
	bodyModel[46] = new ModelRendererTurbo(this, 21, 57, textureX, textureY); // Box 202
	bodyModel[47] = new ModelRendererTurbo(this, 15, 28, textureX, textureY); // Box 237
	bodyModel[48] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 253
	bodyModel[49] = new ModelRendererTurbo(this, 121, 19, textureX, textureY); // Box 254
	bodyModel[50] = new ModelRendererTurbo(this, 78, 38, textureX, textureY); // Box 255
	bodyModel[51] = new ModelRendererTurbo(this, 93, 26, textureX, textureY); // I can see my road from here!
	bodyModel[52] = new ModelRendererTurbo(this, 81, 18, textureX, textureY); // Box 247
	bodyModel[53] = new ModelRendererTurbo(this, 146, 33, textureX, textureY); // Box 274
	bodyModel[54] = new ModelRendererTurbo(this, 146, 33, textureX, textureY); // Box 275
	bodyModel[55] = new ModelRendererTurbo(this, 162, 26, textureX, textureY); // Box 276
	bodyModel[56] = new ModelRendererTurbo(this, 146, 27, textureX, textureY); // Box 278
	bodyModel[57] = new ModelRendererTurbo(this, 146, 27, textureX, textureY); // Box 279
	bodyModel[58] = new ModelRendererTurbo(this, 155, 27, textureX, textureY); // Box 281
	bodyModel[59] = new ModelRendererTurbo(this, 155, 34, textureX, textureY); // Box 282
	bodyModel[60] = new ModelRendererTurbo(this, 155, 27, textureX, textureY); // Box 283
	bodyModel[61] = new ModelRendererTurbo(this, 146, 30, textureX, textureY); // Box 284
	bodyModel[62] = new ModelRendererTurbo(this, 146, 30, textureX, textureY); // Box 285
	bodyModel[63] = new ModelRendererTurbo(this, 48, 48, textureX, textureY); // Box 840 meeror
	bodyModel[64] = new ModelRendererTurbo(this, 48, 48, textureX, textureY); // Box 841 meeror
	bodyModel[65] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Valence Piece
	bodyModel[66] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Valence Piece
	bodyModel[67] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Valence Piece
	bodyModel[68] = new ModelRendererTurbo(this, 0, 77, textureX, textureY); // Valence Piece
	bodyModel[69] = new ModelRendererTurbo(this, 0, 77, textureX, textureY); // Valence Piece
	bodyModel[70] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel front"); // Box 71 wheel 1
	bodyModel[71] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel front"); // Box 73 wheel 1
	bodyModel[72] = new ModelRendererTurbo(this, 55, 203, textureX, textureY,"wheel front"); // Box 77 wheel 1
	bodyModel[73] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel front"); // Box 84 wheel 2
	bodyModel[74] = new ModelRendererTurbo(this, 55, 203, textureX, textureY,"wheel front"); // Box 85 wheel 2
	bodyModel[75] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel front"); // Box 87 wheel 2
	bodyModel[76] = new ModelRendererTurbo(this, 29, 211, textureX, textureY,"wheel front"); // Box 89 wheel 1
	bodyModel[77] = new ModelRendererTurbo(this, 29, 211, textureX, textureY,"wheel front"); // Box 90 wheel 2
	bodyModel[78] = new ModelRendererTurbo(this, 56, 197, textureX, textureY); // Box 66 axle 1-2
	bodyModel[79] = new ModelRendererTurbo(this, 0, 181, textureX, textureY); // differing my entrials
	bodyModel[80] = new ModelRendererTurbo(this, 24, 203, textureX, textureY); // Front Shocks
	bodyModel[81] = new ModelRendererTurbo(this, 0, 181, textureX, textureY); // Box 290
	bodyModel[82] = new ModelRendererTurbo(this, 2, 183, textureX, textureY); // Box 291 axle 1-2
	bodyModel[83] = new ModelRendererTurbo(this, 37, 144, textureX, textureY); // Box 367
	bodyModel[84] = new ModelRendererTurbo(this, 39, 124, textureX, textureY); // Dash that crumbles under UV radiation
	bodyModel[85] = new ModelRendererTurbo(this, 0, 111, textureX, textureY); // Aerodynamic Dash Profile
	bodyModel[86] = new ModelRendererTurbo(this, 6, 111, textureX, textureY); // non-telescopic steering shaft
	bodyModel[87] = new ModelRendererTurbo(this, 50, 173, textureX, textureY); // Zerman Ferman 5erman
	bodyModel[88] = new ModelRendererTurbo(this, 22, 111, textureX, textureY); // shifter
	bodyModel[89] = new ModelRendererTurbo(this, 31, 173, textureX, textureY); // Zerman Ferman 5erman
	bodyModel[90] = new ModelRendererTurbo(this, 71, 166, textureX, textureY); // SEVEN TREE POWER STROKER
	bodyModel[91] = new ModelRendererTurbo(this, 31, 166, textureX, textureY); // SEVEN TREE POWER STROKER
	bodyModel[92] = new ModelRendererTurbo(this, 31, 166, textureX, textureY); // SEVEN TREE POWER STROKER
	bodyModel[93] = new ModelRendererTurbo(this, 52, 166, textureX, textureY); // SEVEN TREE POWER STROKER
	bodyModel[94] = new ModelRendererTurbo(this, 59, 184, textureX, textureY); // Box 385
	bodyModel[95] = new ModelRendererTurbo(this, 68, 184, textureX, textureY); // Box 386
	bodyModel[96] = new ModelRendererTurbo(this, 59, 187, textureX, textureY); // Box 388
	bodyModel[97] = new ModelRendererTurbo(this, 59, 175, textureX, textureY); // trasnfer case
	bodyModel[98] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Box 833
	bodyModel[99] = new ModelRendererTurbo(this, 40, 0, textureX, textureY,"reverseLight"); // Reverse Light Utility Bed
	bodyModel[100] = new ModelRendererTurbo(this, 58, 48, textureX, textureY,"cull"); // Mirror Holder Cull
	bodyModel[101] = new ModelRendererTurbo(this, 55, 48, textureX, textureY); // Box 381
	bodyModel[102] = new ModelRendererTurbo(this, 58, 48, textureX, textureY,"cull"); // Mirror Holder CUll
	bodyModel[103] = new ModelRendererTurbo(this, 55, 48, textureX, textureY); // Box 385
	bodyModel[104] = new ModelRendererTurbo(this, 160, 20, textureX, textureY); // Box 389
	bodyModel[105] = new ModelRendererTurbo(this, 165, 19, textureX, textureY); // Box 390
	bodyModel[106] = new ModelRendererTurbo(this, 155, 18, textureX, textureY); // Box 391
	bodyModel[107] = new ModelRendererTurbo(this, 160, 14, textureX, textureY); // Box 392
	bodyModel[108] = new ModelRendererTurbo(this, 155, 14, textureX, textureY); // Box 393
	bodyModel[109] = new ModelRendererTurbo(this, 165, 14, textureX, textureY); // Box 394
	bodyModel[110] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 395
	bodyModel[111] = new ModelRendererTurbo(this, 0, 171, textureX, textureY); // Box 396
	bodyModel[112] = new ModelRendererTurbo(this, 66, 223, textureX, textureY,"wheel"); // Box 71 wheel 3
	bodyModel[113] = new ModelRendererTurbo(this, 77, 223, textureX, textureY,"wheel"); // Box 73 wheel 3
	bodyModel[114] = new ModelRendererTurbo(this, 66, 219, textureX, textureY,"wheel"); // Box 74 wheel 3
	bodyModel[115] = new ModelRendererTurbo(this, 75, 219, textureX, textureY,"wheel"); // Box 76 wheel 3
	bodyModel[116] = new ModelRendererTurbo(this, 66, 203, textureX, textureY,"wheel"); // Box 77 wheel 3
	bodyModel[117] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel"); // Box 78 wheel 3b
	bodyModel[118] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel"); // Box 79 wheel 3b
	bodyModel[119] = new ModelRendererTurbo(this, 55, 203, textureX, textureY,"wheel"); // Box 80 wheel 3b
	bodyModel[120] = new ModelRendererTurbo(this, 55, 203, textureX, textureY,"wheel"); // Box 81 wheel 4b
	bodyModel[121] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel"); // Box 82 wheel 4b
	bodyModel[122] = new ModelRendererTurbo(this, 44, 203, textureX, textureY,"wheel"); // Box 83 wheel 4b
	bodyModel[123] = new ModelRendererTurbo(this, 77, 223, textureX, textureY,"wheel"); // Box 84 wheel 4
	bodyModel[124] = new ModelRendererTurbo(this, 66, 203, textureX, textureY,"wheel"); // Box 85 wheel 4
	bodyModel[125] = new ModelRendererTurbo(this, 66, 219, textureX, textureY,"wheel"); // Box 86 wheel 4
	bodyModel[126] = new ModelRendererTurbo(this, 66, 223, textureX, textureY,"wheel"); // Box 87 wheel 4
	bodyModel[127] = new ModelRendererTurbo(this, 75, 219, textureX, textureY,"wheel"); // Box 88 wheel 4
	bodyModel[128] = new ModelRendererTurbo(this, 29, 203, textureX, textureY,"wheel"); // Box 89 wheel 3
	bodyModel[129] = new ModelRendererTurbo(this, 29, 203, textureX, textureY,"wheel"); // Box 90 wheel 4
	bodyModel[130] = new ModelRendererTurbo(this, 9, 203, textureX, textureY); // Box 415
	bodyModel[131] = new ModelRendererTurbo(this, 9, 203, textureX, textureY); // Box 416
	bodyModel[132] = new ModelRendererTurbo(this, 0, 199, textureX, textureY); // Box 417
	bodyModel[133] = new ModelRendererTurbo(this, 0, 199, textureX, textureY); // Box 418
	bodyModel[134] = new ModelRendererTurbo(this, 90, 187, textureX, textureY); // rear fuel tank
	bodyModel[135] = new ModelRendererTurbo(this, 3, 156, textureX, textureY); // Box 420
	bodyModel[136] = new ModelRendererTurbo(this, 67, 187, textureX, textureY); // Box 421
	bodyModel[137] = new ModelRendererTurbo(this, 60, 187, textureX, textureY); // Box 422
	bodyModel[138] = new ModelRendererTurbo(this, 51, 86, textureX, textureY); // Flatbed
	bodyModel[139] = new ModelRendererTurbo(this, 6, 211, textureX, textureY); // Bumper
	bodyModel[140] = new ModelRendererTurbo(this, 0, 211, textureX, textureY); // Bumper
	bodyModel[141] = new ModelRendererTurbo(this, 0, 211, textureX, textureY); // Bumper
	bodyModel[142] = new ModelRendererTurbo(this, 31, 5, textureX, textureY,"lamp"); // Clearance Lights
	bodyModel[143] = new ModelRendererTurbo(this, 31, 5, textureX, textureY,"lamp"); // Clearance Lights
	bodyModel[144] = new ModelRendererTurbo(this, 31, 5, textureX, textureY,"lamp"); // Clearance Lights
	bodyModel[145] = new ModelRendererTurbo(this, 31, 5, textureX, textureY,"lamp"); // Clearance Lights
	bodyModel[146] = new ModelRendererTurbo(this, 31, 5, textureX, textureY,"lamp"); // Clearance Lights
	bodyModel[147] = new ModelRendererTurbo(this, 93, 75, textureX, textureY); // Box 465
	bodyModel[148] = new ModelRendererTurbo(this, 146, 87, textureX, textureY); // Box 466
	bodyModel[149] = new ModelRendererTurbo(this, 93, 80, textureX, textureY); // Box 467
	bodyModel[150] = new ModelRendererTurbo(this, 93, 83, textureX, textureY); // Box 468
	bodyModel[151] = new ModelRendererTurbo(this, 84, 71, textureX, textureY,"cull"); // Box 477 Cull Sideboard Hanger
	bodyModel[152] = new ModelRendererTurbo(this, 91, 70, textureX, textureY); // Box 481
	bodyModel[153] = new ModelRendererTurbo(this, 75, 65, textureX, textureY); // Box 483
	bodyModel[154] = new ModelRendererTurbo(this, 75, 65, textureX, textureY); // Box 484
	bodyModel[155] = new ModelRendererTurbo(this, 93, 83, textureX, textureY); // Box 486
	bodyModel[156] = new ModelRendererTurbo(this, 75, 65, textureX, textureY); // Box 489
	bodyModel[157] = new ModelRendererTurbo(this, 75, 65, textureX, textureY); // Box 490
	bodyModel[158] = new ModelRendererTurbo(this, 93, 75, textureX, textureY); // Box 491
	bodyModel[159] = new ModelRendererTurbo(this, 91, 70, textureX, textureY); // Box 494
	bodyModel[160] = new ModelRendererTurbo(this, 76, 126, textureX, textureY); // Box 496
	bodyModel[161] = new ModelRendererTurbo(this, 165, 93, textureX, textureY); // Box 499
	bodyModel[162] = new ModelRendererTurbo(this, 165, 71, textureX, textureY); // Box 500
	bodyModel[163] = new ModelRendererTurbo(this, 165, 71, textureX, textureY); // Box 501
	bodyModel[164] = new ModelRendererTurbo(this, 104, 193, textureX, textureY); // Box 504
	bodyModel[165] = new ModelRendererTurbo(this, 104, 193, textureX, textureY); // Box 507
	bodyModel[166] = new ModelRendererTurbo(this, 110, 199, textureX, textureY); // Box 508
	bodyModel[167] = new ModelRendererTurbo(this, 108, 26, textureX, textureY); // Box 242
	bodyModel[168] = new ModelRendererTurbo(this, 121, 26, textureX, textureY); // Box 429
	bodyModel[169] = new ModelRendererTurbo(this, 108, 26, textureX, textureY); // Box 409
	bodyModel[170] = new ModelRendererTurbo(this, 126, 34, textureX, textureY); // Box 410
	bodyModel[171] = new ModelRendererTurbo(this, 126, 26, textureX, textureY); // Box 411
	bodyModel[172] = new ModelRendererTurbo(this, 121, 26, textureX, textureY); // Box 412
	bodyModel[173] = new ModelRendererTurbo(this, 128, 27, textureX, textureY); // Box 304
	bodyModel[174] = new ModelRendererTurbo(this, 137, 26, textureX, textureY); // Box 413
	bodyModel[175] = new ModelRendererTurbo(this, 178, 24, textureX, textureY); // Box 414
	bodyModel[176] = new ModelRendererTurbo(this, 33, 5, textureX, textureY,"brakeLight"); // Box 809 brake light
	bodyModel[177] = new ModelRendererTurbo(this, 104, 198, textureX, textureY); // Box 503
	bodyModel[178] = new ModelRendererTurbo(this, 104, 198, textureX, textureY); // Box 506
	bodyModel[179] = new ModelRendererTurbo(this, 104, 198, textureX, textureY); // Plow Components
	bodyModel[180] = new ModelRendererTurbo(this, 104, 198, textureX, textureY); // Plow Components
	bodyModel[181] = new ModelRendererTurbo(this, 109, 193, textureX, textureY); // Plow Components
	bodyModel[182] = new ModelRendererTurbo(this, 109, 193, textureX, textureY); // Plow Components
	bodyModel[183] = new ModelRendererTurbo(this, 121, 196, textureX, textureY); // Plow Components
	bodyModel[184] = new ModelRendererTurbo(this, 168, 192, textureX, textureY); // Plow Components
	bodyModel[185] = new ModelRendererTurbo(this, 191, 196, textureX, textureY); // Plow Components
	bodyModel[186] = new ModelRendererTurbo(this, 145, 189, textureX, textureY); // Plow Components
	bodyModel[187] = new ModelRendererTurbo(this, 138, 195, textureX, textureY); // Plow Components
	bodyModel[188] = new ModelRendererTurbo(this, 117, 196, textureX, textureY); // Plow Components
	bodyModel[189] = new ModelRendererTurbo(this, 122, 193, textureX, textureY); // Box 390
	bodyModel[190] = new ModelRendererTurbo(this, 129, 196, textureX, textureY); // Box 391
	bodyModel[191] = new ModelRendererTurbo(this, 122, 196, textureX, textureY); // Box 392
	bodyModel[192] = new ModelRendererTurbo(this, 122, 193, textureX, textureY); // Box 393
	bodyModel[193] = new ModelRendererTurbo(this, 104, 198, textureX, textureY); // Box 395
	bodyModel[194] = new ModelRendererTurbo(this, 117, 196, textureX, textureY); // Box 396
	bodyModel[195] = new ModelRendererTurbo(this, 104, 198, textureX, textureY); // Box 397
	bodyModel[196] = new ModelRendererTurbo(this, 138, 195, textureX, textureY); // Box 398
	bodyModel[197] = new ModelRendererTurbo(this, 114, 193, textureX, textureY); // Box 399
	bodyModel[198] = new ModelRendererTurbo(this, 117, 193, textureX, textureY); // Box 400
	bodyModel[199] = new ModelRendererTurbo(this, 10, 20, textureX, textureY); // Box 160
	bodyModel[200] = new ModelRendererTurbo(this, 0, 26, textureX, textureY); // Box 161
	bodyModel[201] = new ModelRendererTurbo(this, 9, 15, textureX, textureY); // Box 162
	bodyModel[202] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 163
	bodyModel[203] = new ModelRendererTurbo(this, 5, 26, textureX, textureY); // Box 164
	bodyModel[204] = new ModelRendererTurbo(this, 130, 53, textureX, textureY); // Box 165
	bodyModel[205] = new ModelRendererTurbo(this, 14, 25, textureX, textureY); // Box 166
	bodyModel[206] = new ModelRendererTurbo(this, 18, 15, textureX, textureY); // Box 167
	bodyModel[207] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 168
	bodyModel[208] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 170
	bodyModel[209] = new ModelRendererTurbo(this, 37, 29, textureX, textureY); // Box 176
	bodyModel[210] = new ModelRendererTurbo(this, 5, 20, textureX, textureY); // Box 197
	bodyModel[211] = new ModelRendererTurbo(this, 66, 14, textureX, textureY); // Box 203
	bodyModel[212] = new ModelRendererTurbo(this, 50, 21, textureX, textureY); // Box 208
	bodyModel[213] = new ModelRendererTurbo(this, 37, 35, textureX, textureY); // Box 226
	bodyModel[214] = new ModelRendererTurbo(this, 50, 21, textureX, textureY); // Box 227
	bodyModel[215] = new ModelRendererTurbo(this, 10, 20, textureX, textureY); // Box 228
	bodyModel[216] = new ModelRendererTurbo(this, 0, 26, textureX, textureY); // Box 229
	bodyModel[217] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 230
	bodyModel[218] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 231
	bodyModel[219] = new ModelRendererTurbo(this, 130, 53, textureX, textureY); // Box 232
	bodyModel[220] = new ModelRendererTurbo(this, 14, 25, textureX, textureY); // Box 233
	bodyModel[221] = new ModelRendererTurbo(this, 19, 20, textureX, textureY); // Box 234
	bodyModel[222] = new ModelRendererTurbo(this, 10, 29, textureX, textureY); // Box 235
	bodyModel[223] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 236
	bodyModel[224] = new ModelRendererTurbo(this, 5, 26, textureX, textureY); // Box 241
	bodyModel[225] = new ModelRendererTurbo(this, 50, 32, textureX, textureY); // Box 242
	bodyModel[226] = new ModelRendererTurbo(this, 37, 14, textureX, textureY); // Box 246
	bodyModel[227] = new ModelRendererTurbo(this, 37, 14, textureX, textureY); // Box 248
	bodyModel[228] = new ModelRendererTurbo(this, 95, 48, textureX, textureY); // Box 366
	bodyModel[229] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 399
	bodyModel[230] = new ModelRendererTurbo(this, 5, 29, textureX, textureY); // Box 400
	bodyModel[231] = new ModelRendererTurbo(this, 5, 29, textureX, textureY); // Box 401
	bodyModel[232] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 196
	bodyModel[233] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 200
	bodyModel[234] = new ModelRendererTurbo(this, 13, 0, textureX, textureY,"lamp"); // headlight
	bodyModel[235] = new ModelRendererTurbo(this, 13, 7, textureX, textureY,"leftTurnLight"); // turn signal L
	bodyModel[236] = new ModelRendererTurbo(this, 0, 0, textureX, textureY,"lamp"); // headlight
	bodyModel[237] = new ModelRendererTurbo(this, 0, 7, textureX, textureY,"rightTurnLight"); // turn signal r
	bodyModel[238] = new ModelRendererTurbo(this, 37, 29, textureX, textureY); // Box 393
	bodyModel[239] = new ModelRendererTurbo(this, 50, 27, textureX, textureY); // Box 352
	bodyModel[240] = new ModelRendererTurbo(this, 50, 27, textureX, textureY); // Box 353
	bodyModel[241] = new ModelRendererTurbo(this, 37, 35, textureX, textureY); // Box 354
	bodyModel[242] = new ModelRendererTurbo(this, 36, 12, textureX, textureY); // Grill Surround (ALL TRIMS)
	bodyModel[243] = new ModelRendererTurbo(this, 36, 12, textureX, textureY); // Box 264
	bodyModel[244] = new ModelRendererTurbo(this, 37, 49, textureX, textureY); // Box 819 emblem
	bodyModel[245] = new ModelRendererTurbo(this, 11, 33, textureX, textureY); // Box 268
	bodyModel[246] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 269
	bodyModel[247] = new ModelRendererTurbo(this, 0, 112, textureX, textureY); // Steering wheel
	bodyModel[248] = new ModelRendererTurbo(this, 75, 71, textureX, textureY); // Box 372
	bodyModel[249] = new ModelRendererTurbo(this, 146, 46, textureX, textureY,"cull"); // Box 376 CULL
	bodyModel[250] = new ModelRendererTurbo(this, 45, 96, textureX, textureY); // Box 378 toolbox
	bodyModel[251] = new ModelRendererTurbo(this, 93, 80, textureX, textureY); // Box 379
	bodyModel[252] = new ModelRendererTurbo(this, 75, 71, textureX, textureY); // Box 382
	bodyModel[253] = new ModelRendererTurbo(this, 80, 65, textureX, textureY); // Box 383
	bodyModel[254] = new ModelRendererTurbo(this, 80, 65, textureX, textureY); // Box 384
	bodyModel[255] = new ModelRendererTurbo(this, 180, 96, textureX, textureY); // Box 385
	bodyModel[256] = new ModelRendererTurbo(this, 80, 65, textureX, textureY); // Box 386
	bodyModel[257] = new ModelRendererTurbo(this, 80, 65, textureX, textureY); // Box 387
	bodyModel[258] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 388 "enhanced stiffness"
	bodyModel[259] = new ModelRendererTurbo(this, 0, 211, textureX, textureY); // Box 389 strange cover plate
	bodyModel[260] = new ModelRendererTurbo(this, 26, 0, textureX, textureY,"brakeLight"); // Taillight R Utility Bed
	bodyModel[261] = new ModelRendererTurbo(this, 40, 0, textureX, textureY,"reverselight"); // Revrse Light Utility Bed
	bodyModel[262] = new ModelRendererTurbo(this, 33, 0, textureX, textureY,"leftTurnLight"); // Turn Signal L Utility Bed
	bodyModel[263] = new ModelRendererTurbo(this, 33, 0, textureX, textureY,"rightTurnLight"); // Turn Signal R Utility Bed
	bodyModel[264] = new ModelRendererTurbo(this, 26, 5, textureX, textureY,"brakeLight"); // Brake Light
	bodyModel[265] = new ModelRendererTurbo(this, 26, 5, textureX, textureY,"brakeLight"); // Brake Light
	bodyModel[266] = new ModelRendererTurbo(this, 26, 5, textureX, textureY,"brakeLight"); // Brake Light
	bodyModel[267] = new ModelRendererTurbo(this, 26, 5, textureX, textureY,"rightTurnLight"); // Turn Signal R Utility Bed
	bodyModel[268] = new ModelRendererTurbo(this, 26, 5, textureX, textureY,"leftTurnLight"); // Turn Signal L Utility Bed
	bodyModel[269] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Hinge Gear
	bodyModel[270] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Hinge Gear
	bodyModel[271] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Latch Gear
	bodyModel[272] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Latch Gear
	bodyModel[273] = new ModelRendererTurbo(this, 51, 107, textureX, textureY); // Box 405 some release lever
	bodyModel[274] = new ModelRendererTurbo(this, 54, 107, textureX, textureY); // Box 405 some release lever
	bodyModel[275] = new ModelRendererTurbo(this, 54, 109, textureX, textureY); // Box 408
	bodyModel[276] = new ModelRendererTurbo(this, 51, 114, textureX, textureY); // Box 409 hudraulic motor
	bodyModel[277] = new ModelRendererTurbo(this, 42, 113, textureX, textureY); // Box 410 gas tube
	bodyModel[278] = new ModelRendererTurbo(this, 126, 34, textureX, textureY); // Box 411
	bodyModel[279] = new ModelRendererTurbo(this, 126, 26, textureX, textureY); // Box 412
	bodyModel[280] = new ModelRendererTurbo(this, 15, 111, textureX, textureY); // 4x4 Shifter
	bodyModel[281] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 414
	bodyModel[282] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 415
	bodyModel[283] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 416
	bodyModel[284] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 417
	bodyModel[285] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 418
	bodyModel[286] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 420
	bodyModel[287] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 421
	bodyModel[288] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 422
	bodyModel[289] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 423
	bodyModel[290] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 424
	bodyModel[291] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 425
	bodyModel[292] = new ModelRendererTurbo(this, 84, 71, textureX, textureY); // Box 426
	bodyModel[293] = new ModelRendererTurbo(this, 84, 75, textureX, textureY); // Box 427
	bodyModel[294] = new ModelRendererTurbo(this, 84, 75, textureX, textureY); // Box 428
	bodyModel[295] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Box 273 grille
	bodyModel[296] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 836
	bodyModel[297] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 400
	bodyModel[298] = new ModelRendererTurbo(this, 24, 196, textureX, textureY); // Box 432 bigass leaf spring
	bodyModel[299] = new ModelRendererTurbo(this, 24, 196, textureX, textureY); // Box 432 bigass leaf spring
	bodyModel[300] = new ModelRendererTurbo(this, 24, 203, textureX, textureY); // Front Shocks
	bodyModel[301] = new ModelRendererTurbo(this, 184, 73, textureX, textureY,"cull"); // Box 436 CULL
	bodyModel[302] = new ModelRendererTurbo(this, 50, 65, textureX, textureY,"cull"); // Box 436 CULL
	bodyModel[303] = new ModelRendererTurbo(this, 0, 190, textureX, textureY,"wheel front"); // Box 104 wheel 1
	bodyModel[304] = new ModelRendererTurbo(this, 0, 190, textureX, textureY,"wheel front"); // Box 439 wheel 2
	bodyModel[305] = new ModelRendererTurbo(this, 140, 14, textureX, textureY); // Box 154
	bodyModel[306] = new ModelRendererTurbo(this, 145, 14, textureX, textureY); // Box 155
	bodyModel[307] = new ModelRendererTurbo(this, 150, 14, textureX, textureY); // Box 156
	bodyModel[308] = new ModelRendererTurbo(this, 140, 18, textureX, textureY); // Box 249
	bodyModel[309] = new ModelRendererTurbo(this, 145, 20, textureX, textureY); // Box 250
	bodyModel[310] = new ModelRendererTurbo(this, 150, 19, textureX, textureY); // Box 251
	bodyModel[311] = new ModelRendererTurbo(this, 18, 226, textureX, textureY); // Box 446
	bodyModel[312] = new ModelRendererTurbo(this, 60, 116, textureX, textureY); // plate

	bodyModel[0].addShapeBox(0F, -1F, 0F, 13, 2, 2, 0F, 0F, 0.75F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, -1.25F, -0.25F); // driving my shaft
	bodyModel[0].setRotationPoint(0.5F, 5F, -1F);

	bodyModel[1].addShapeBox(0F, -1F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // fueling my tank
	bodyModel[1].setRotationPoint(6F, 3F, -3F);

	bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
	bodyModel[2].setRotationPoint(-8.5F, 2.5F, -6F);

	bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
	bodyModel[3].setRotationPoint(-8.5F, 2.5F, 5F);

	bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
	bodyModel[4].setRotationPoint(10F, 2F, -4F);

	bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
	bodyModel[5].setRotationPoint(10F, 2F, 3F);

	bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 494 BIG HOSS MUFFLER (SIZE OF TORSO)
	bodyModel[6].setRotationPoint(5.5F, 2F, 0.5F);

	bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Complete power loss
	bodyModel[7].setRotationPoint(10.5F, 2F, 1.5F);

	bodyModel[8].addShapeBox(-2F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Complete power loss
	bodyModel[8].setRotationPoint(20.5F, 4.5F, 3.5F);

	bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, -2.5F, 0F, -3F, -2.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2.5F, 0F, -3F, 2.5F, 0F); // Complete power loss
	bodyModel[9].setRotationPoint(15.5F, 2F, 1.5F);

	bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // PIPE WITH NO CAT (unmodeled)
	bodyModel[10].setRotationPoint(-8.5F, 2F, 2.5F);

	bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // PIPE WITH NO CAT (unmodeled)
	bodyModel[11].setRotationPoint(-11.5F, 2F, 2.5F);

	bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 511
	bodyModel[12].setRotationPoint(-12.5F, 2F, 5F);

	bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
	bodyModel[13].setRotationPoint(-9.5F, 1.5F, -8F);

	bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 832
	bodyModel[14].setRotationPoint(-5.5F, 0F, -7.5F);

	bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 1F, -0.5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -3.5F, 0F); // Box 455
	bodyModel[15].setRotationPoint(10.5F, 4F, 4.01F);

	bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
	bodyModel[16].setRotationPoint(19F, 1F, -3F);

	bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
	bodyModel[17].setRotationPoint(12F, 1F, -3F);

	bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
	bodyModel[18].setRotationPoint(-19.5F, 2F, 5F);

	bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
	bodyModel[19].setRotationPoint(-19.5F, 2F, -6F);

	bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
	bodyModel[20].setRotationPoint(-16.5F, 1.5F, -5F);

	bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561 engine cradle/suspension point or something
	bodyModel[21].setRotationPoint(-16.5F, 2.5F, -3F);

	bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 566 CULL sus pension hangar
	bodyModel[22].setRotationPoint(9.5F, 2F, 4.01F);

	bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // CULL sus pension hangar
	bodyModel[23].setRotationPoint(9.5F, 2F, -5.01F);

	bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 1F, -0.5F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -3.5F, 0F); // Box 273
	bodyModel[24].setRotationPoint(10.5F, 4F, -5.01F);

	bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 275 The outcome will SHOCK you
	bodyModel[25].setRotationPoint(11.5F, 1.5F, -5F);

	bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F); // Box 275 The outcome will SHOCK you
	bodyModel[26].setRotationPoint(17.5F, 1.5F, 4F);

	bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
	bodyModel[27].setRotationPoint(22F, 2F, -5F);

	bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
	bodyModel[28].setRotationPoint(22F, 2F, 4F);

	bodyModel[29].addShapeBox(0F, -1F, 0F, 11, 2, 2, 0F, 0F, -2F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -2F, -0.25F, 0F, 1.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 1.5F, -0.25F); // Box 339
	bodyModel[29].setRotationPoint(-13.5F, 5F, -4F);

	bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 340
	bodyModel[30].setRotationPoint(-12.5F, 2F, -6F);

	bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Taillight L Utility Bed
	bodyModel[31].setRotationPoint(23.01F, 2.75F, -6.25F);

	bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, -0.375F, -0.4F, 0F, -0.375F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, -0.125F, -0.4F, -0.25F, -0.125F, -0.4F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 157
	bodyModel[32].setRotationPoint(-9.5F, -3.5F, -9F);

	bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 1F, 0.125F, 0F, 1F, 0.125F); // Box 158
	bodyModel[33].setRotationPoint(-8.5F, -1.5F, -9F);

	bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 159
	bodyModel[34].setRotationPoint(-8.5F, 1.5F, -8.75F);

	bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -1F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 0.125F, -1F, 0F, 0.125F); // Box 164
	bodyModel[35].setRotationPoint(-11.5F, 2.5F, -9F);

	bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.875F, -0.5F, 0F); // Stock Bumper
	bodyModel[36].setRotationPoint(-21.5F, 2F, -8F);

	bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.125F, -0.5F, -0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0F, 0.875F, -0.5F, 0F); // Stock Bumper
	bodyModel[37].setRotationPoint(-20.5F, 2F, -9F);

	bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Stock Bumper
	bodyModel[38].setRotationPoint(-21.5F, 2F, 4F);

	bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0F, 0.875F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.125F, -0.125F, -0.5F, -0.125F); // Stock Bumper
	bodyModel[39].setRotationPoint(-20.5F, 2F, 8F);

	bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.375F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.375F, -0.5F, 0F); // Stock Bumper
	bodyModel[40].setRotationPoint(-22F, 2F, -4F);

	bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.125F, 0F, -0.125F, 0.375F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, -0.125F, -0.25F, -0.625F); // Stock Bumper
	bodyModel[41].setRotationPoint(-20.5F, 3.5F, 8F);

	bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.125F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0.875F, 0F, 0F, -0.125F, -0.25F, -0.625F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0F, 0.375F, -0.25F, 0F); // Stock Bumper
	bodyModel[42].setRotationPoint(-20.5F, 3.5F, -9F);

	bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, 0F, 0F, -0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.375F, -0.25F, 0F); // Stock Bumper
	bodyModel[43].setRotationPoint(-21.5F, 3.5F, -8F);

	bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0.375F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.625F, -0.25F, 0F); // Stock Bumper
	bodyModel[44].setRotationPoint(-21.5F, 3.5F, 4F);

	bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0.375F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.375F, 0F, 0F, -0.125F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Stock Bumper
	bodyModel[45].setRotationPoint(-22F, 3.5F, -4F);

	bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
	bodyModel[46].setRotationPoint(-20.5F, -1.5F, -5F);

	bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F); // Box 237
	bodyModel[47].setRotationPoint(-19.5F, 1.5F, -9F);

	bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 1F, 0.125F, -0.4F, 1F, 0.125F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, -0.4F, 1F, 0.125F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 253
	bodyModel[48].setRotationPoint(-8.5F, -1.5F, 8F);

	bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, -0.125F, -0.4F, 0F, -0.125F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 254
	bodyModel[49].setRotationPoint(-8.5F, 1.5F, 7.75F);

	bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, 0F, 0.01F, 0.125F, 0F, 0.01F, -0.375F, 0F, 0.01F, -0.375F, 0F, 0.01F, 0.125F); // Box 255
	bodyModel[50].setRotationPoint(-0.25F, -3.5F, -8F);

	bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F, -3F, 0.25F, 0F, 3F, 0.25F, 0F, 3F, 0.25F, 0F, -3F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // I can see my road from here!
	bodyModel[51].setRotationPoint(-10.5F, -8.5F, -3F);

	bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0.125F, -0.4F, 0F, 0.125F, -0.4F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 247
	bodyModel[52].setRotationPoint(-9.5F, -3.5F, 8F);

	bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
	bodyModel[53].setRotationPoint(-7F, -9.5F, 3F);

	bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 275
	bodyModel[54].setRotationPoint(-7F, -9.5F, -6F);

	bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F, 0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 276
	bodyModel[55].setRotationPoint(-7F, -9.5F, -3F);

	bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 278
	bodyModel[56].setRotationPoint(-7F, -9.5F, 6F);

	bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
	bodyModel[57].setRotationPoint(-7F, -9.5F, -7F);

	bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 281
	bodyModel[58].setRotationPoint(-3F, -9.5F, -6F);

	bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 282
	bodyModel[59].setRotationPoint(-3F, -9.5F, -3F);

	bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
	bodyModel[60].setRotationPoint(-3F, -9.5F, 3F);

	bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 284
	bodyModel[61].setRotationPoint(-3F, -9.5F, 6F);

	bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 285
	bodyModel[62].setRotationPoint(-3F, -9.5F, -7F);

	bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840 meeror
	bodyModel[63].setRotationPoint(-6.5F, -6F, -12.25F);

	bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 841 meeror
	bodyModel[64].setRotationPoint(-6.5F, -6F, 10.25F);

	bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Valence Piece
	bodyModel[65].setRotationPoint(-21.5F, 4F, -4F);

	bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Valence Piece
	bodyModel[66].setRotationPoint(-20.5F, 4F, -8F);

	bodyModel[67].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Valence Piece
	bodyModel[67].setRotationPoint(-20.5F, 4F, 4F);

	bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -1F, 0F, 0F, 1F, 0F, 0F); // Valence Piece
	bodyModel[68].setRotationPoint(-19.5F, 4F, -9F);

	bodyModel[69].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F); // Valence Piece
	bodyModel[69].setRotationPoint(-19.5F, 4F, 8F);

	bodyModel[70].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 71 wheel 1
	bodyModel[70].setRotationPoint(-15F, 6.5F, -8F);

	bodyModel[71].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 73 wheel 1
	bodyModel[71].setRotationPoint(-15F, 6.5F, -8F);

	bodyModel[72].addShapeBox(-1.5F, -3.5F, -1F, 3, 7, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 77 wheel 1
	bodyModel[72].setRotationPoint(-15F, 6.5F, -8F);

	bodyModel[73].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 84 wheel 2
	bodyModel[73].setRotationPoint(-15F, 6.5F, 8F);

	bodyModel[74].addShapeBox(-1.5F, -3.5F, -1F, 3, 7, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 85 wheel 2
	bodyModel[74].setRotationPoint(-15F, 6.5F, 8F);

	bodyModel[75].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 87 wheel 2
	bodyModel[75].setRotationPoint(-15F, 6.5F, 8F);

	bodyModel[76].addShapeBox(-3.5F, -3.5F, -1.01F, 7, 7, 0, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F); // Box 89 wheel 1
	bodyModel[76].setRotationPoint(-15F, 6.5F, -8.01F);

	bodyModel[77].addShapeBox(-3.5F, -3.5F, 1.01F, 7, 7, 0, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F); // Box 90 wheel 2
	bodyModel[77].setRotationPoint(-15F, 6.5F, 8F);

	bodyModel[78].addShapeBox(-1F, -1F, 0F, 2, 2, 19, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 66 axle 1-2
	bodyModel[78].setRotationPoint(14.5F, 6.5F, -9.5F);

	bodyModel[79].addShapeBox(0F, -1F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // differing my entrials
	bodyModel[79].setRotationPoint(13F, 6F, -1.5F);

	bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0.3F, 0F, -1F, 0.3F, 0.25F, -1F, 0.3F, 0F, 1.25F, 0.3F, -0.25F, 1.25F, 0.3F, -3.25F, 0F, 0.3F, -3.5F, 0F, 0.3F, -3.25F, 0.25F, 0.3F, -3F, 0.25F); // Front Shocks
	bodyModel[80].setRotationPoint(-15.5F, 0F, -7F);

	bodyModel[81].addShapeBox(0F, -1F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
	bodyModel[81].setRotationPoint(-16.5F, 6F, -4.5F);

	bodyModel[82].addShapeBox(-1F, -1F, 0F, 2, 2, 17, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 291 axle 1-2
	bodyModel[82].setRotationPoint(-15F, 6.5F, -8.5F);

	bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 367
	bodyModel[83].setRotationPoint(-10.5F, -1.5F, -8F);

	bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Dash that crumbles under UV radiation
	bodyModel[84].setRotationPoint(-9.5F, -3.5F, -8F);

	bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.49F, 1F, 0F, -1.49F, 1F, 0F, -1.5F, 0F); // Aerodynamic Dash Profile
	bodyModel[85].setRotationPoint(-9F, -4F, -6F);

	bodyModel[86].addShapeBox(-3F, -0.5F, -0.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // non-telescopic steering shaft
	bodyModel[86].setRotationPoint(-7F, -2.5F, -4.56F);
	bodyModel[86].rotateAngleZ = 0.48869219F;

	bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Zerman Ferman 5erman
	bodyModel[87].setRotationPoint(-6.5F, 1F, -1.5F);

	bodyModel[88].addShapeBox(-7.5F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // shifter
	bodyModel[88].setRotationPoint(-3.75F, -5.5F, -2F);
	bodyModel[88].rotateAngleX = 0.29670597F;
	bodyModel[88].rotateAngleY = -0.29670597F;
	bodyModel[88].rotateAngleZ = 1.01229097F;

	bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Zerman Ferman 5erman
	bodyModel[89].setRotationPoint(-11.5F, 1F, -2F);

	bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // SEVEN TREE POWER STROKER
	bodyModel[90].setRotationPoint(-18.5F, -1F, -2F);

	bodyModel[91].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // SEVEN TREE POWER STROKER
	bodyModel[91].setRotationPoint(-18.5F, -1F, -4.25F);
	bodyModel[91].rotateAngleX = 0.78539816F;

	bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // SEVEN TREE POWER STROKER
	bodyModel[92].setRotationPoint(-18.5F, -3F, 2.25F);
	bodyModel[92].rotateAngleX = -0.78539816F;

	bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // SEVEN TREE POWER STROKER
	bodyModel[93].setRotationPoint(-17.5F, -3F, -2F);

	bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 385
	bodyModel[94].setRotationPoint(-11.5F, 2F, -3.5F);

	bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
	bodyModel[95].setRotationPoint(-8.5F, 2F, -3.5F);

	bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, 4F, 1F, 0F, 0F); // Box 388
	bodyModel[96].setRotationPoint(-0.5F, 2F, -3.5F);

	bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // trasnfer case
	bodyModel[97].setRotationPoint(-2.5F, 2.5F, -4.5F);

	bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 833
	bodyModel[98].setRotationPoint(-2F, -5F, -7F);

	bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Reverse Light Utility Bed
	bodyModel[99].setRotationPoint(23.02F, 2.76F, -6F);

	bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 1F, 0F, -3F); // Mirror Holder Cull
	bodyModel[100].setRotationPoint(-6.63F, -3F, 8.75F);

	bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -3F, -1F, 0F, -3F); // Box 381
	bodyModel[101].setRotationPoint(-5.63F, -3F, 11.76F);

	bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 1F, 0F, 0F); // Mirror Holder CUll
	bodyModel[102].setRotationPoint(-6.63F, -3F, -11.75F);

	bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 3F, -1F, 0F, 3F); // Box 385
	bodyModel[103].setRotationPoint(-5.63F, -3F, -11.76F);

	bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 1F, 0.125F, -0.5F, 0.125F, 0.375F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, -0.5F, 0F, 0.375F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 389
	bodyModel[104].setRotationPoint(0.25F, -1.5F, 8F);

	bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.125F, -0.5F, -1F, 0.125F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.75F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 390
	bodyModel[105].setRotationPoint(0.25F, 1.5F, 7.75F);

	bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.375F, 0F, 0.375F, 0F, 0F, 0.375F, -0.625F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.5F, 0F, 0.125F, 0F, -0.125F, 0.375F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F); // Box 391
	bodyModel[106].setRotationPoint(-0.25F, -3.5F, 8F);

	bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.125F, 0.375F, 0F, 1F, 0.125F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0.375F, 0F, 1F, 0.125F); // Box 392
	bodyModel[107].setRotationPoint(0.25F, -1.5F, -9F);

	bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.375F, 0F, -0.375F, -0.625F, 0F, -0.375F, 0F, 0F, 0.375F, -0.375F, 0F, 0.375F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, 0F, -0.125F, 0.375F, -0.5F, 0F, 0.125F); // Box 393
	bodyModel[108].setRotationPoint(-0.25F, -3.5F, -9F);

	bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0.75F, 0F, 0F, 0.5F); // Box 394
	bodyModel[109].setRotationPoint(0.25F, 1.5F, -8.75F);

	bodyModel[110].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, 2F, 0F, 0F, 0F); // Box 395
	bodyModel[110].setRotationPoint(0.5F, 2.5F, -6F);

	bodyModel[111].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 2F, 0.5F, -0.5F, -2F, 0F, 0F, 0F); // Box 396
	bodyModel[111].setRotationPoint(0.5F, 2.5F, 5F);

	bodyModel[112].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 71 wheel 3
	bodyModel[112].setRotationPoint(14.5F, 6.5F, -9F);

	bodyModel[113].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 73 wheel 3
	bodyModel[113].setRotationPoint(14.5F, 6.5F, -9F);

	bodyModel[114].addShapeBox(-1.5F, -3.5F, -1F, 3, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 74 wheel 3
	bodyModel[114].setRotationPoint(14.5F, 6.5F, -9F);

	bodyModel[115].addShapeBox(-1.5F, 1.5F, -1F, 3, 2, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 76 wheel 3
	bodyModel[115].setRotationPoint(14.5F, 6.5F, -9F);

	bodyModel[116].addShapeBox(-1.5F, -3.5F, 0F, 3, 7, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 77 wheel 3
	bodyModel[116].setRotationPoint(14.5F, 6.5F, -9F);

	bodyModel[117].addShapeBox(-3.5F, -1.5F, 0F, 3, 3, 2, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 78 wheel 3b
	bodyModel[117].setRotationPoint(14.5F, 6.5F, -7.5F);

	bodyModel[118].addShapeBox(1.5F, -1.5F, 0F, 3, 3, 2, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 79 wheel 3b
	bodyModel[118].setRotationPoint(14.5F, 6.5F, -7.5F);

	bodyModel[119].addShapeBox(-1.5F, -3.5F, 0F, 3, 7, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 80 wheel 3b
	bodyModel[119].setRotationPoint(14.5F, 6.5F, -7.5F);

	bodyModel[120].addShapeBox(-1.5F, -3.5F, 0F, 3, 7, 2, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 81 wheel 4b
	bodyModel[120].setRotationPoint(14.5F, 6.5F, 5.5F);

	bodyModel[121].addShapeBox(1.5F, -1.5F, 0F, 3, 3, 2, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 82 wheel 4b
	bodyModel[121].setRotationPoint(14.5F, 6.5F, 5.5F);

	bodyModel[122].addShapeBox(-3.5F, -1.5F, 0F, 3, 3, 2, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 83 wheel 4b
	bodyModel[122].setRotationPoint(14.5F, 6.5F, 5.5F);

	bodyModel[123].addShapeBox(1.5F, -1.5F, -1F, 3, 3, 2, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 2F, 0F); // Box 84 wheel 4
	bodyModel[123].setRotationPoint(14.5F, 6.5F, 9F);

	bodyModel[124].addShapeBox(-1.5F, -3.5F, -1F, 3, 7, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 85 wheel 4
	bodyModel[124].setRotationPoint(14.5F, 6.5F, 9F);

	bodyModel[125].addShapeBox(-1.5F, -3.5F, 0F, 3, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 86 wheel 4
	bodyModel[125].setRotationPoint(14.5F, 6.5F, 9F);

	bodyModel[126].addShapeBox(-3.5F, -1.5F, -1F, 3, 3, 2, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 2F, 0F, -0.75F, 2F, 0F, 0F, -0.25F, 0F); // Box 87 wheel 4
	bodyModel[126].setRotationPoint(14.5F, 6.5F, 9F);

	bodyModel[127].addShapeBox(-1.5F, 1.5F, 0F, 3, 2, 1, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 88 wheel 4
	bodyModel[127].setRotationPoint(14.5F, 6.5F, 9F);

	bodyModel[128].addShapeBox(-3.5F, -3.5F, -1.01F, 7, 7, 0, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F); // Box 89 wheel 3
	bodyModel[128].setRotationPoint(14.5F, 6.5F, -9.01F);

	bodyModel[129].addShapeBox(-3.5F, -3.5F, 1.01F, 7, 7, 0, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F); // Box 90 wheel 4
	bodyModel[129].setRotationPoint(14.5F, 6.5F, 9F);

	bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 415
	bodyModel[130].setRotationPoint(19.25F, 2F, -9.5F);

	bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 416
	bodyModel[131].setRotationPoint(19.25F, 2F, 3.5F);

	bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
	bodyModel[132].setRotationPoint(20F, 2F, -9.5F);

	bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
	bodyModel[133].setRotationPoint(20F, 2F, 5.5F);

	bodyModel[134].addShapeBox(0F, -1F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // rear fuel tank
	bodyModel[134].setRotationPoint(13F, 3F, -3F);

	bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
	bodyModel[135].setRotationPoint(4F, 1F, -6F);

	bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
	bodyModel[136].setRotationPoint(0.5F, 2F, 1.5F);

	bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 422
	bodyModel[137].setRotationPoint(-1.5F, 2F, 2.5F);

	bodyModel[138].addShapeBox(0F, 0F, 0F, 24, 1, 19, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Flatbed
	bodyModel[138].setRotationPoint(1F, -0.5F, -9.5F);

	bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Bumper
	bodyModel[139].setRotationPoint(23F, 6F, -6.5F);

	bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.375F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.375F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Bumper
	bodyModel[140].setRotationPoint(23F, 2F, -4.5F);

	bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.375F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.375F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Bumper
	bodyModel[141].setRotationPoint(23F, 2F, 3.5F);

	bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
	bodyModel[142].setRotationPoint(-5.5F, -9.5F, -5F);

	bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
	bodyModel[143].setRotationPoint(-5.5F, -9.5F, 4F);

	bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
	bodyModel[144].setRotationPoint(-5.5F, -9.75F, 1.5F);

	bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
	bodyModel[145].setRotationPoint(-5.5F, -9.75F, -0.5F);

	bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Clearance Lights
	bodyModel[146].setRotationPoint(-5.5F, -9.75F, -2.5F);

	bodyModel[147].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
	bodyModel[147].setRotationPoint(1F, -3.5F, -9F);

	bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
	bodyModel[148].setRotationPoint(1F, -5.5F, -8F);

	bodyModel[149].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, -0.01F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.05F, 0F, 0F); // Box 467
	bodyModel[149].setRotationPoint(1F, -3.5F, -10F);

	bodyModel[150].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
	bodyModel[150].setRotationPoint(1F, -0.5F, -10.5F);

	bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, 0.5F, -0.01F, 0F, 0.5F, -0.01F, 0F, -0.01F, -1F, 0F, -0.01F, 1F, 0F, 0.5F, -0.01F, 0F, 0.5F, -0.01F, 0F, -0.01F, 1F, 0F, -0.01F); // Box 477 Cull Sideboard Hanger
	bodyModel[151].setRotationPoint(22F, -5.5F, -9F);

	bodyModel[152].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
	bodyModel[152].setRotationPoint(1.5F, -6.5F, -9.25F);

	bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 483
	bodyModel[153].setRotationPoint(15F, -3F, -10.5F);

	bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 484
	bodyModel[154].setRotationPoint(7F, -3F, -10.5F);

	bodyModel[155].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 486
	bodyModel[155].setRotationPoint(1F, -0.5F, 9.5F);

	bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 489
	bodyModel[156].setRotationPoint(15F, -3F, 9.5F);

	bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 490
	bodyModel[157].setRotationPoint(7F, -3F, 9.5F);

	bodyModel[158].addShapeBox(0F, 0F, 0F, 22, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 491
	bodyModel[158].setRotationPoint(1F, -3.5F, 8F);

	bodyModel[159].addShapeBox(0F, 0F, 0F, 21, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
	bodyModel[159].setRotationPoint(2F, -6.5F, 8.25F);

	bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F); // Box 496
	bodyModel[160].setRotationPoint(-3F, -10.5F, -8F);

	bodyModel[161].addShapeBox(-0.5F, 0F, 0F, 1, 6, 16, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 499
	bodyModel[161].setRotationPoint(24F, -5.5F, -8F);
	bodyModel[161].rotateAngleZ = 0.15707963F;

	bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 500
	bodyModel[162].setRotationPoint(24F, -5.5F, -8F);
	bodyModel[162].rotateAngleZ = 0.15707963F;

	bodyModel[163].addShapeBox(0F, 5F, 0F, 1, 1, 16, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 501
	bodyModel[163].setRotationPoint(24F, -5.5F, -8F);
	bodyModel[163].rotateAngleZ = 0.15707963F;

	bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, -0.5F, 0F); // Box 504
	bodyModel[164].setRotationPoint(-19.5F, 3F, -5F);

	bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, -0.5F, 0F); // Box 507
	bodyModel[165].setRotationPoint(-19.5F, 3F, 4F);

	bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
	bodyModel[166].setRotationPoint(-21.5F, 5.5F, -4F);

	bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, -2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 3F, 0F, -2F, -3F, 0F, -2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0.125F, -0.375F); // Box 242
	bodyModel[167].setRotationPoint(-10F, -8.5F, 3F);

	bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -3F, 0F, 1F, 3F, 0F, 1F, 3.25F, -0.5F, -1F, -3.25F, -0.5F, -1F, 0F, 0.125F, -0.625F, 0F, 0F, -0.625F, 0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F); // Box 429
	bodyModel[168].setRotationPoint(-10F, -8.5F, 7F);

	bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F, -3F, 0F, -2F, 3F, 0F, -2F, 2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, 0F, 0.125F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 409
	bodyModel[169].setRotationPoint(-10F, -8.5F, -8F);

	bodyModel[170].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0.25F, -0.85F, 0F, 0.125F, -0.85F); // Box 410
	bodyModel[170].setRotationPoint(-6F, -8.5F, -9F);

	bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, -3F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0F, 0.75F, -3F, 0F, 0.75F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0.125F, -0.85F, 0F, 0.125F, -0.85F); // Box 411
	bodyModel[171].setRotationPoint(-9F, -8.5F, -9F);

	bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -3.25F, -0.5F, -1F, 3.25F, -0.5F, -1F, 3F, 0F, 1F, -3F, 0F, 1F, -0.5F, 0F, 0.625F, 0.5F, 0F, 0.625F, 0F, 0F, -0.625F, 0F, 0.125F, -0.625F); // Box 412
	bodyModel[172].setRotationPoint(-10F, -8.5F, -8F);

	bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 5, 15, 0F, 0F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 304
	bodyModel[173].setRotationPoint(-0.25F, -8.5F, -7.5F);

	bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0.5F, 0F, 1F, 0F, 0F, 1F, -0.125F, 0F, 0.625F, 0.125F, 0F, 0.625F, 0.75F, 0F, -0.625F, -0.125F, 0.125F, -0.625F); // Box 413
	bodyModel[174].setRotationPoint(-1F, -8.5F, -8F);

	bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.125F, 0.125F, -0.625F, 0.75F, 0F, -0.625F, 0.125F, 0F, 0.625F, -0.125F, 0F, 0.625F); // Box 414
	bodyModel[175].setRotationPoint(-1F, -8.5F, 7F);

	bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 809 brake light
	bodyModel[176].setRotationPoint(-0.5F, -9.5F, -1.5F);

	bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 503
	bodyModel[177].setRotationPoint(-21.5F, 5.5F, -5F);

	bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 506
	bodyModel[178].setRotationPoint(-21.5F, 5.5F, 4F);

	bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Plow Components
	bodyModel[179].setRotationPoint(-22.5F, 5.5F, -5F);

	bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Plow Components
	bodyModel[180].setRotationPoint(-22.5F, 5.5F, 4F);

	bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, -0.5F, 0.625F, 0.5F, -0.5F, 0.625F, -1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Plow Components
	bodyModel[181].setRotationPoint(-23.5F, 2.5F, -5F);

	bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.5F, -0.5F, 0.625F, -0.5F, -0.5F, 0.625F, -0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Plow Components
	bodyModel[182].setRotationPoint(-23.5F, 2.5F, 4F);

	bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Plow Components
	bodyModel[183].setRotationPoint(-24F, 2F, -3.5F);

	bodyModel[184].addShapeBox(-0.5F, 0F, -10F, 1, 3, 20, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Plow Components
	bodyModel[184].setRotationPoint(-26.5F, 4.5F, 0F);
	bodyModel[184].rotateAngleY = 0.34906585F;

	bodyModel[185].addShapeBox(-1F, 0F, -10F, 1, 2, 20, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Plow Components
	bodyModel[185].setRotationPoint(-26.5F, 7.5F, 0F);
	bodyModel[185].rotateAngleY = 0.34906585F;

	bodyModel[186].addShapeBox(-1.5F, 0F, -10F, 1, 2, 20, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F); // Plow Components
	bodyModel[186].setRotationPoint(-26.5F, 2.5F, 0F);
	bodyModel[186].rotateAngleY = 0.34906585F;

	bodyModel[187].addShapeBox(-0.5F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Plow Components
	bodyModel[187].setRotationPoint(-26.5F, 6.5F, 0F);
	bodyModel[187].rotateAngleY = 0.34906585F;

	bodyModel[188].addShapeBox(0F, 0F, -5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Plow Components
	bodyModel[188].setRotationPoint(-26.5F, 5.5F, 0F);
	bodyModel[188].rotateAngleY = 0.34906585F;

	bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, -3F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0.25F, 0F); // Box 390
	bodyModel[189].setRotationPoint(-26F, 6F, -1F);

	bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
	bodyModel[190].setRotationPoint(-22F, 6F, -4.5F);

	bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0F); // Box 392
	bodyModel[191].setRotationPoint(-27F, 6F, -0.5F);

	bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 3F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0.25F, 0F); // Box 393
	bodyModel[192].setRotationPoint(-26F, 6F, 0F);

	bodyModel[193].addShapeBox(1F, 0F, -5F, 1, 1, 5, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 395
	bodyModel[193].setRotationPoint(-26.5F, 5.5F, 0F);
	bodyModel[193].rotateAngleY = 0.34906585F;

	bodyModel[194].addShapeBox(0F, 0F, 4F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
	bodyModel[194].setRotationPoint(-26.5F, 5.5F, 0F);
	bodyModel[194].rotateAngleY = 0.34906585F;

	bodyModel[195].addShapeBox(1F, 0F, 0F, 1, 1, 5, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -1F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 397
	bodyModel[195].setRotationPoint(-26.5F, 5.5F, 0F);
	bodyModel[195].rotateAngleY = 0.34906585F;

	bodyModel[196].addShapeBox(-0.5F, 0F, -6F, 1, 1, 12, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 398
	bodyModel[196].setRotationPoint(-26.5F, 4.5F, 0F);
	bodyModel[196].rotateAngleY = 0.34906585F;

	bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F); // Box 399
	bodyModel[197].setRotationPoint(-25F, 1.5F, 0F);

	bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
	bodyModel[198].setRotationPoint(-24F, 1F, -0.5F);
	bodyModel[198].rotateAngleZ = -0.78539816F;

	bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F); // Box 160
	bodyModel[199].setRotationPoint(-12.5F, 1.5F, -8.75F);

	bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 161
	bodyModel[200].setRotationPoint(-9.5F, 1.5F, -8.75F);

	bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 162
	bodyModel[201].setRotationPoint(-11.5F, -1.5F, -9F);

	bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 163
	bodyModel[202].setRotationPoint(-12.5F, 1.5F, -9F);

	bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -1F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, 0.125F, -1F, 0F, 0.125F); // Box 164
	bodyModel[203].setRotationPoint(-11.5F, 2.5F, -9F);

	bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 3F, 0F, 0.75F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.01F, 0F, 0.25F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0.01F, 0F, 0F); // Box 165
	bodyModel[204].setRotationPoint(-9.51F, 1.5F, -8F);

	bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 166
	bodyModel[205].setRotationPoint(-18F, 0.5F, -10F);

	bodyModel[206].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 167
	bodyModel[206].setRotationPoint(-18.5F, -1.5F, -9F);

	bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
	bodyModel[207].setRotationPoint(-18.5F, 1.5F, -9F);

	bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -2F, 0F, 0F, 2F, 0F, 0.75F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
	bodyModel[208].setRotationPoint(-20.49F, 1.5F, -8F);

	bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F); // Box 176
	bodyModel[209].setRotationPoint(-21.5F, 1.5F, -9F);

	bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 197
	bodyModel[210].setRotationPoint(-19.5F, -1.5F, -9F);

	bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F, -0.25F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
	bodyModel[211].setRotationPoint(-21.5F, -2.5F, -5F);

	bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.875F, -0.25F, -1.125F, 0F, 0.25F, -0.375F, -0.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, -2F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 208
	bodyModel[212].setRotationPoint(-21.5F, -2.5F, -9F);

	bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.25F, 0F, 0F, -0.5F, 0.75F, 0F, -1.125F, -0.25F, -1.125F, -0.875F, -0.25F, -1.125F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 226
	bodyModel[213].setRotationPoint(-21.5F, -2.5F, 5F);

	bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -1.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0.25F, -0.375F, -0.875F, -0.25F, -1.125F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -2F, 0F, -0.125F); // Box 227
	bodyModel[214].setRotationPoint(-21.5F, -2.5F, 5F);

	bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 228
	bodyModel[215].setRotationPoint(-12.5F, 1.5F, 7.75F);

	bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 229
	bodyModel[216].setRotationPoint(-9.5F, 1.5F, 7.75F);

	bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 1F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
	bodyModel[217].setRotationPoint(-11.5F, -1.5F, 8F);

	bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 231
	bodyModel[218].setRotationPoint(-12.5F, 1.5F, 8F);

	bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0.75F, 0.01F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.01F, -0.01F, 0.25F); // Box 232
	bodyModel[219].setRotationPoint(-9.51F, 1.5F, 6F);

	bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 233
	bodyModel[220].setRotationPoint(-18F, 0.5F, 9F);

	bodyModel[221].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0.75F, 0.125F, 0F, 1F, 0.125F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
	bodyModel[221].setRotationPoint(-18.5F, -1.5F, 8F);

	bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 235
	bodyModel[222].setRotationPoint(-18.5F, 1.5F, 8F);

	bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 236
	bodyModel[223].setRotationPoint(-20.49F, 1.5F, 6F);

	bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -1.125F, -1F, 0F, -1.125F); // Box 241
	bodyModel[224].setRotationPoint(-11.5F, 2.5F, 8F);

	bodyModel[225].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F, 0F, -0.25F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1F); // Box 242
	bodyModel[225].setRotationPoint(-20F, -3.5F, -5F);

	bodyModel[226].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0F, -0.75F, -0.375F, 0F, 0F, -0.375F, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 0F, 0.25F, 0.125F); // Box 246
	bodyModel[226].setRotationPoint(-19.5F, -3.5F, -9F);

	bodyModel[227].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F, 0.5F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.375F, 0F, -0.75F, -0.375F, 0F, 0.25F, 0.125F, 0F, 0F, 0.125F, 0F, -0.25F, -0.125F, 0F, 0F, -0.125F); // Box 248
	bodyModel[227].setRotationPoint(-19.5F, -3.5F, 5F);

	bodyModel[228].addShapeBox(0F, 0F, 0F, 9, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
	bodyModel[228].setRotationPoint(-19.5F, 0.5F, -8F);

	bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.75F, 0.125F, 0F, 0.75F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, -0.125F); // Box 399
	bodyModel[229].setRotationPoint(-19.5F, -1.5F, 8F);

	bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -1.125F, -1F, 0F, -1.125F, -1F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 400
	bodyModel[230].setRotationPoint(-19.5F, 2.5F, -9F);

	bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, -1F, 0F, 0.125F, -1F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 401
	bodyModel[231].setRotationPoint(-19.5F, 2.5F, 8F);

	bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 196
	bodyModel[232].setRotationPoint(-21.5F, -1.5F, -9F);

	bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.5F, 0F, -1F); // Box 200
	bodyModel[233].setRotationPoint(-21.5F, -1.5F, 5F);

	bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -0.5F, -0.125F, -1F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, -0.5F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.45F, 0F, 0F, 0.3F); // headlight
	bodyModel[234].setRotationPoint(-21.51F, -1.5F, -9.01F);

	bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.49F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.35F, 0.01F, 0F, 0.25F, -0.49F, 0F, -1F, 0F, 0F, -0.125F, 0F, 0F, 0.5F, 0.01F, 0F, 0.4F); // turn signal L
	bodyModel[235].setRotationPoint(-21.52F, 0F, -9.02F);

	bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, 0.1F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.45F, 0F, 0F, -0.125F, -0.5F, 0F, -1F); // headlight
	bodyModel[236].setRotationPoint(-21.51F, -1.5F, 5.01F);

	bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0.01F, 0F, 0.2F, 0F, 0F, 0.35F, 0F, 0F, -0.125F, -0.49F, 0F, -1F, 0.01F, 0F, 0.35F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.49F, 0F, -1F); // turn signal r
	bodyModel[237].setRotationPoint(-21.52F, 0F, 5.02F);

	bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.5F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.125F, -0.75F, 0F, -1F); // Box 393
	bodyModel[238].setRotationPoint(-21.5F, 1.5F, 5F);

	bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -1.125F, -0.25F, -0.125F, 0.125F, -0.25F, -0.125F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.875F, 0.5F, 0F, 0F); // Box 352
	bodyModel[239].setRotationPoint(-20.5F, -2.5F, 5F);

	bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0.125F, -0.25F, -0.125F, -1.125F, -0.25F, -0.125F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.875F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 353
	bodyModel[240].setRotationPoint(-20.5F, -2.5F, -8F);

	bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, -0.875F, -0.25F, -1.125F, -1.125F, -0.25F, -1.125F, -0.5F, 0.75F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 354
	bodyModel[241].setRotationPoint(-21.5F, -2.5F, -9F);

	bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0F, -0.5F, 0.03F, 0F, -0.5F, 0.03F, 0.5F, -0.5F, 0.03F, 0.5F, -0.5F, 0.03F, 0.5F, 0F, 0.03F, 0.5F, 0F); // Grill Surround (ALL TRIMS)
	bodyModel[242].setRotationPoint(-21.5F, -1.5F, -5F);

	bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.03F, 0F, -0.5F, 0.03F, 0F, -0.5F, 0.03F, 0F, 0F, 0.03F, 0F, 0F, 0.03F, 0.5F, 0F, 0.03F, 0.5F, 0F, 0.03F, 0.5F, -0.5F, 0.03F, 0.5F, -0.5F); // Box 264
	bodyModel[243].setRotationPoint(-21.5F, -1.5F, 4F);

	bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 819 emblem
	bodyModel[244].setRotationPoint(-21.51F, -1.25F, -2F);

	bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.08F, 0F, -0.25F, -0.08F, 0F, -0.25F, -0.08F, 0F, -0.25F, -0.08F); // Box 268
	bodyModel[245].setRotationPoint(-21.52F, -1.75F, -4.5F);

	bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.25F, 0.08F, 0F, -0.25F, 0.08F, 0F, -0.25F, 0.08F, 0F, -0.25F, 0.08F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269
	bodyModel[246].setRotationPoint(-21.52F, 1.24F, -4F);

	bodyModel[247].addShapeBox(0.01F, -1.5F, -1.5F, 0, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F); // Steering wheel
	bodyModel[247].setRotationPoint(-7F, -2.5F, -4.56F);
	bodyModel[247].rotateAngleZ = 0.48869219F;

	bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 372
	bodyModel[248].setRotationPoint(22F, -4.5F, -10F);

	bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 5, 17, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 376 CULL
	bodyModel[249].setRotationPoint(1F, -10.5F, -8.5F);

	bodyModel[250].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378 toolbox
	bodyModel[250].setRotationPoint(1F, 2F, 5.5F);

	bodyModel[251].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F, -0.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.01F, 0F, -1F); // Box 379
	bodyModel[251].setRotationPoint(1F, -3.5F, 9F);

	bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 382
	bodyModel[252].setRotationPoint(22F, -4.5F, 8F);

	bodyModel[253].addShapeBox(0F, 1F, 0F, 1, 4, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 383
	bodyModel[253].setRotationPoint(24F, -5.5F, -3F);
	bodyModel[253].rotateAngleZ = 0.15707963F;

	bodyModel[254].addShapeBox(0F, 1F, 0F, 1, 4, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 384
	bodyModel[254].setRotationPoint(24F, -5.5F, 2F);
	bodyModel[254].rotateAngleZ = 0.15707963F;

	bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F, 1F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 1F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
	bodyModel[255].setRotationPoint(23F, 0.5F, -10F);

	bodyModel[256].addShapeBox(0F, 1F, 0F, 1, 4, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 386
	bodyModel[256].setRotationPoint(24F, -5.5F, -8F);
	bodyModel[256].rotateAngleZ = 0.15707963F;

	bodyModel[257].addShapeBox(0F, 1F, 0F, 1, 4, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 387
	bodyModel[257].setRotationPoint(24F, -5.5F, 7F);
	bodyModel[257].rotateAngleZ = 0.15707963F;

	bodyModel[258].addShapeBox(0F, 0F, 0F, 22, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388 "enhanced stiffness"
	bodyModel[258].setRotationPoint(1F, 0.5F, -7.5F);

	bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 389 strange cover plate
	bodyModel[259].setRotationPoint(22.75F, 2F, -4F);

	bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Taillight R Utility Bed
	bodyModel[260].setRotationPoint(23.01F, 2.75F, 4.25F);

	bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Revrse Light Utility Bed
	bodyModel[261].setRotationPoint(23.02F, 2.76F, 5F);

	bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Turn Signal L Utility Bed
	bodyModel[262].setRotationPoint(24.01F, 0.75F, -9.25F);

	bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Turn Signal R Utility Bed
	bodyModel[263].setRotationPoint(24.01F, 0.75F, 7.25F);

	bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Brake Light
	bodyModel[264].setRotationPoint(24.01F, 1F, -2.5F);

	bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Brake Light
	bodyModel[265].setRotationPoint(24.01F, 1F, -0.5F);

	bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Brake Light
	bodyModel[266].setRotationPoint(24.01F, 1F, 1.5F);

	bodyModel[267].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turn Signal R Utility Bed
	bodyModel[267].setRotationPoint(23.01F, -4.5F, 8.25F);
	bodyModel[267].rotateAngleZ = 0.18325957F;

	bodyModel[268].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turn Signal L Utility Bed
	bodyModel[268].setRotationPoint(23.01F, -4.5F, -9.25F);
	bodyModel[268].rotateAngleZ = 0.18325957F;

	bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hinge Gear
	bodyModel[269].setRotationPoint(23.5F, -5.49F, -8.99F);

	bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Hinge Gear
	bodyModel[270].setRotationPoint(23.5F, -5.49F, 7.99F);

	bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Latch Gear
	bodyModel[271].setRotationPoint(24.5F, -0.49F, -8.99F);

	bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Latch Gear
	bodyModel[272].setRotationPoint(24.5F, -0.49F, 7.99F);

	bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, -1F, 0F, 0F); // Box 405 some release lever
	bodyModel[273].setRotationPoint(-0.5F, -2.25F, -9.5F);

	bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 405 some release lever
	bodyModel[274].setRotationPoint(1F, 0.75F, -9.5F);

	bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
	bodyModel[275].setRotationPoint(3F, 0.75F, -9.5F);

	bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409 hudraulic motor
	bodyModel[276].setRotationPoint(3F, 1.5F, -6.5F);

	bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410 gas tube
	bodyModel[277].setRotationPoint(7F, 1.5F, -8.5F);

	bodyModel[278].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, 0.125F, -0.85F, 0F, 0.25F, -0.85F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 411
	bodyModel[278].setRotationPoint(-6F, -8.5F, 7F);

	bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, -3F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, -2.25F, -3F, -0.5F, -2.25F, 0F, 0.125F, -0.85F, 0F, 0.125F, -0.85F, 0F, 0F, -0.65F, 0F, 0F, -0.65F); // Box 412
	bodyModel[279].setRotationPoint(-9F, -8.5F, 7F);

	bodyModel[280].addShapeBox(-7.5F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // 4x4 Shifter
	bodyModel[280].setRotationPoint(-4.25F, -4.5F, -4F);
	bodyModel[280].rotateAngleX = 0.29670597F;
	bodyModel[280].rotateAngleY = -0.29670597F;
	bodyModel[280].rotateAngleZ = 1.01229097F;

	bodyModel[281].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -1F, 4F); // Box 414
	bodyModel[281].setRotationPoint(7F, -8.5F, -4.5F);

	bodyModel[282].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
	bodyModel[282].setRotationPoint(18F, -8.5F, -4.5F);

	bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
	bodyModel[283].setRotationPoint(2F, -9.5F, -4.5F);

	bodyModel[284].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
	bodyModel[284].setRotationPoint(18F, -8.5F, -8.5F);

	bodyModel[285].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 418
	bodyModel[285].setRotationPoint(18F, -8.5F, 4.5F);

	bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, 0F, 0F, -6F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
	bodyModel[286].setRotationPoint(18F, -8.5F, 4.5F);

	bodyModel[287].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F, 0F, 0F, -4F, 0F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 421
	bodyModel[287].setRotationPoint(18F, -8.5F, -8.5F);

	bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 422
	bodyModel[288].setRotationPoint(2F, -9.5F, -8.5F);

	bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
	bodyModel[289].setRotationPoint(2F, -9.5F, -8.5F);

	bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 424
	bodyModel[290].setRotationPoint(2F, -9.5F, 4.5F);

	bodyModel[291].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
	bodyModel[291].setRotationPoint(2F, -9.5F, 4.5F);

	bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 426
	bodyModel[292].setRotationPoint(22F, -5.5F, 8F);

	bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.01F, 0F, -0.01F, -1F, 0F, -0.01F, -1F, 0F, 0.5F, -0.01F, 0F, 0.5F, -0.01F, 0F, -0.01F, 1F, 0F, -0.01F, 1F, 0F, 0.5F, -0.01F, 0F, 0.5F); // Box 427
	bodyModel[293].setRotationPoint(1F, -5.5F, 8F);

	bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, -0.01F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.01F, -0.01F, 0F, -0.01F, -0.01F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.01F, -0.01F, 0F, -0.01F); // Box 428
	bodyModel[294].setRotationPoint(1F, -5.5F, -9F);

	bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, 0F, -2F, -9F); // Box 273 grille
	bodyModel[295].setRotationPoint(-21.49F, -1.25F, -4.5F);

	bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 836
	bodyModel[296].setRotationPoint(-1F, -7F, -6F);

	bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 400
	bodyModel[297].setRotationPoint(-1F, -7F, 3F);

	bodyModel[298].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 432 bigass leaf spring
	bodyModel[298].setRotationPoint(9.5F, 3F, 4.01F);

	bodyModel[299].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 432 bigass leaf spring
	bodyModel[299].setRotationPoint(9.5F, 3F, -5.01F);

	bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, 0.3F, -0.25F, 1.25F, 0.3F, 0F, 1.25F, 0.3F, 0.25F, -1F, 0.3F, 0F, -1F, 0.3F, -3F, 0.25F, 0.3F, -3.25F, 0.25F, 0.3F, -3.5F, 0F, 0.3F, -3.25F, 0F); // Front Shocks
	bodyModel[300].setRotationPoint(-15.5F, 0F, 6F);

	bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 436 CULL
	bodyModel[301].setRotationPoint(1F, -11.5F, -8.5F);

	bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 436 CULL
	bodyModel[302].setRotationPoint(-3F, -11.5F, -8F);

	bodyModel[303].addShapeBox(-1.5F, -1.5F, -0.75F, 3, 3, 1, 0F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104 wheel 1
	bodyModel[303].setRotationPoint(-15F, 6.5F, -8F);

	bodyModel[304].addShapeBox(-1.5F, -1.5F, -0.25F, 3, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.625F, -0.625F, 0.5F, -0.625F, -0.625F, 0.5F); // Box 439 wheel 2
	bodyModel[304].setRotationPoint(-15F, 6.5F, 8F);

	bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.4F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.375F, 0.4F, 0F, 0.375F, 0.4F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, 0F, 0.125F, 0.4F, 0F, 0.125F); // Box 154
	bodyModel[305].setRotationPoint(-0.5F, -3.5F, -9F);

	bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0.125F, 0.4F, 1F, 0.125F, 0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0.125F, 0.4F, 1F, 0.125F); // Box 155
	bodyModel[306].setRotationPoint(-0.5F, -1.5F, -9F);

	bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0.4F, 0F, -0.125F, 0.4F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0.4F, 0F, 0.5F); // Box 156
	bodyModel[307].setRotationPoint(-0.5F, 1.5F, -8.75F);

	bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.4F, 0F, 0.375F, -0.375F, 0F, 0.375F, -0.375F, 0F, -0.375F, 0.4F, 0F, -0.375F, 0.4F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.25F, -0.125F, 0.4F, -0.25F, -0.125F); // Box 249
	bodyModel[308].setRotationPoint(-0.5F, -3.5F, 8F);

	bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.4F, 1F, 0.125F, -0.25F, 1F, 0.125F, -0.25F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 1F, 0.125F, -0.25F, 1F, 0.125F, -0.25F, 0F, 0F, 0.4F, 0F, 0F); // Box 250
	bodyModel[309].setRotationPoint(-0.5F, -1.5F, 8F);

	bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.4F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0.4F, 0F, -0.5F); // Box 251
	bodyModel[310].setRotationPoint(-0.5F, 1.5F, 7.75F);

	bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
	bodyModel[311].setRotationPoint(23.25F, 3.5F, -0.5F);

	bodyModel[312].addShapeBox(0F, 0F, 0F, 0, 4, 8, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // plate
	bodyModel[312].setRotationPoint(24.01F, 4.5F, -7F);
}
}