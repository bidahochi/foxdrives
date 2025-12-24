package bidahochi.foxdrives.models;

import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelToyotaPickup1992 extends ModelConverter //Same as Filename
{
    int textureX = 512;
    int textureY = 128;

    public ModelToyotaPickup1992() //Same as Filename
    {
        bodyModel = new ModelRendererTurbo[216];

        initbodyModel_1();

        translateAll(0F, 0F, 0F);


        flipAll();
    }

    private void initbodyModel_1()
    {
        bodyModel[0] = new ModelRendererTurbo(this, 228, 65, textureX, textureY, "wheel front"); // Box 136 Wheel1
        bodyModel[1] = new ModelRendererTurbo(this, 219, 69, textureX, textureY, "wheel front"); // Box 9 Wheel1
        bodyModel[2] = new ModelRendererTurbo(this, 237, 69, textureX, textureY, "wheel front"); // Box 12 Wheel1
        bodyModel[3] = new ModelRendererTurbo(this, 256, 58, textureX, textureY, "wheel front"); // Box 17 Wheel1
        bodyModel[4] = new ModelRendererTurbo(this, 258, 65, textureX, textureY, "wheel front"); // Box 136 Wheel2
        bodyModel[5] = new ModelRendererTurbo(this, 267, 69, textureX, textureY, "wheel front"); // Box 9 Wheel2
        bodyModel[6] = new ModelRendererTurbo(this, 249, 69, textureX, textureY, "wheel front"); // Box 12 Wheel2
        bodyModel[7] = new ModelRendererTurbo(this, 226, 58, textureX, textureY, "wheel front"); // Box 17 Wheel2
        bodyModel[8] = new ModelRendererTurbo(this, 2, 66, textureX, textureY, "wheel"); // Box 23 axle
        bodyModel[9] = new ModelRendererTurbo(this, 228, 65, textureX, textureY, "wheel"); // Box 136 Wheel3
        bodyModel[10] = new ModelRendererTurbo(this, 219, 69, textureX, textureY, "wheel"); // Box 9 Wheel3
        bodyModel[11] = new ModelRendererTurbo(this, 237, 69, textureX, textureY, "wheel"); // Box 12 Wheel3
        bodyModel[12] = new ModelRendererTurbo(this, 256, 58, textureX, textureY, "wheel"); // Box 17 Wheel3
        bodyModel[13] = new ModelRendererTurbo(this, 258, 65, textureX, textureY, "wheel"); // Box 136 Wheel4
        bodyModel[14] = new ModelRendererTurbo(this, 267, 69, textureX, textureY, "wheel"); // Box 9 Wheel4
        bodyModel[15] = new ModelRendererTurbo(this, 249, 69, textureX, textureY, "wheel"); // Box 12 Wheel4
        bodyModel[16] = new ModelRendererTurbo(this, 226, 58, textureX, textureY, "wheel"); // Box 17 Wheel4
        bodyModel[17] = new ModelRendererTurbo(this, 36, 66, textureX, textureY, "wheel"); // Box 23 axle
        bodyModel[18] = new ModelRendererTurbo(this, 130, 41, textureX, textureY); // Box 19
        bodyModel[19] = new ModelRendererTurbo(this, 94, 17, textureX, textureY); // Box 20
        bodyModel[20] = new ModelRendererTurbo(this, 110, 15, textureX, textureY); // Box 21
        bodyModel[21] = new ModelRendererTurbo(this, 148, 52, textureX, textureY); // Box 22
        bodyModel[22] = new ModelRendererTurbo(this, 209, 39, textureX, textureY); // Box 23
        bodyModel[23] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 24
        bodyModel[24] = new ModelRendererTurbo(this, 234, 46, textureX, textureY); // Box 26
        bodyModel[25] = new ModelRendererTurbo(this, 146, 49, textureX, textureY); // Box 29
        bodyModel[26] = new ModelRendererTurbo(this, 83, 17, textureX, textureY); // Box 30
        bodyModel[27] = new ModelRendererTurbo(this, 26, 13, textureX, textureY); // Box 31
        bodyModel[28] = new ModelRendererTurbo(this, 48, 11, textureX, textureY); // Box 32
        bodyModel[29] = new ModelRendererTurbo(this, 12, 11, textureX, textureY); // Box 33
        bodyModel[30] = new ModelRendererTurbo(this, 26, 33, textureX, textureY); // Box 34
        bodyModel[31] = new ModelRendererTurbo(this, 21, 40, textureX, textureY); // Box 35
        bodyModel[32] = new ModelRendererTurbo(this, 45, 40, textureX, textureY); // Box 36
        bodyModel[33] = new ModelRendererTurbo(this, 46, 27, textureX, textureY); // Box 37
        bodyModel[34] = new ModelRendererTurbo(this, 24, 47, textureX, textureY); // Box 38
        bodyModel[35] = new ModelRendererTurbo(this, 38, 47, textureX, textureY); // Box 39
        bodyModel[36] = new ModelRendererTurbo(this, 229, 26, textureX, textureY); // Box 41
        bodyModel[37] = new ModelRendererTurbo(this, 39, 64, textureX, textureY); // Box 42
        bodyModel[38] = new ModelRendererTurbo(this, 49, 53, textureX, textureY); // Box 43
        bodyModel[39] = new ModelRendererTurbo(this, 56, 46, textureX, textureY); // Box 44
        bodyModel[40] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 45
        bodyModel[41] = new ModelRendererTurbo(this, 47, 44, textureX, textureY); // Box 46
        bodyModel[42] = new ModelRendererTurbo(this, 46, 33, textureX, textureY); // Box 47
        bodyModel[43] = new ModelRendererTurbo(this, 46, 30, textureX, textureY); // Box 48
        bodyModel[44] = new ModelRendererTurbo(this, 37, 34, textureX, textureY); // Box 49
        bodyModel[45] = new ModelRendererTurbo(this, 63, 33, textureX, textureY, BoxName.headLight); // Box 247 headlight
        bodyModel[46] = new ModelRendererTurbo(this, 22, 47, textureX, textureY); // Box 51
        bodyModel[47] = new ModelRendererTurbo(this, 23, 64, textureX, textureY); // Box 52
        bodyModel[48] = new ModelRendererTurbo(this, 15, 53, textureX, textureY); // Box 53
        bodyModel[49] = new ModelRendererTurbo(this, 15, 49, textureX, textureY); // Box 54
        bodyModel[50] = new ModelRendererTurbo(this, 25, 34, textureX, textureY); // Box 58
        bodyModel[51] = new ModelRendererTurbo(this, 63, 33, textureX, textureY, BoxName.headLight); // Box 59 headlight
        bodyModel[52] = new ModelRendererTurbo(this, 2, 50, textureX, textureY); // Box 60
        bodyModel[53] = new ModelRendererTurbo(this, 37, 59, textureX, textureY); // Box 61
        bodyModel[54] = new ModelRendererTurbo(this, 29, 59, textureX, textureY); // Box 62
        bodyModel[55] = new ModelRendererTurbo(this, 24, 60, textureX, textureY); // Box 63
        bodyModel[56] = new ModelRendererTurbo(this, 46, 50, textureX, textureY); // Box 64
        bodyModel[57] = new ModelRendererTurbo(this, 29, 62, textureX, textureY); // Box 66
        bodyModel[58] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 67
        bodyModel[59] = new ModelRendererTurbo(this, 64, 28, textureX, textureY, BoxName.leftTurnLight); // Box 68 glowey
        bodyModel[60] = new ModelRendererTurbo(this, 64, 28, textureX, textureY, BoxName.rightTurnLight); // Box 69 glowey
        bodyModel[61] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Box 70
        bodyModel[62] = new ModelRendererTurbo(this, 44, 5, textureX, textureY); // Box 71
        bodyModel[63] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 72
        bodyModel[64] = new ModelRendererTurbo(this, 105, 15, textureX, textureY); // Box 73
        bodyModel[65] = new ModelRendererTurbo(this, 20, 30, textureX, textureY); // Box 74
        bodyModel[66] = new ModelRendererTurbo(this, 20, 33, textureX, textureY); // Box 75
        bodyModel[67] = new ModelRendererTurbo(this, 20, 27, textureX, textureY); // Box 76
        bodyModel[68] = new ModelRendererTurbo(this, 130, 14, textureX, textureY); // Box 77
        bodyModel[69] = new ModelRendererTurbo(this, 10, 46, textureX, textureY); // Box 78
        bodyModel[70] = new ModelRendererTurbo(this, 83, 10, textureX, textureY); // Box 79
        bodyModel[71] = new ModelRendererTurbo(this, 15, 44, textureX, textureY); // Box 80
        bodyModel[72] = new ModelRendererTurbo(this, 148, 2, textureX, textureY); // Box 81
        bodyModel[73] = new ModelRendererTurbo(this, 209, 13, textureX, textureY); // Box 82
        bodyModel[74] = new ModelRendererTurbo(this, 146, 7, textureX, textureY); // Box 83
        bodyModel[75] = new ModelRendererTurbo(this, 94, 10, textureX, textureY); // Box 84
        bodyModel[76] = new ModelRendererTurbo(this, 208, 8, textureX, textureY); // Box 85
        bodyModel[77] = new ModelRendererTurbo(this, 110, 8, textureX, textureY); // Box 86
        bodyModel[78] = new ModelRendererTurbo(this, 105, 8, textureX, textureY); // Box 87
        bodyModel[79] = new ModelRendererTurbo(this, 47, 2, textureX, textureY); // Box 88
        bodyModel[80] = new ModelRendererTurbo(this, 5, 2, textureX, textureY); // Box 89
        bodyModel[81] = new ModelRendererTurbo(this, 129, 50, textureX, textureY); // Box 90
        bodyModel[82] = new ModelRendererTurbo(this, 100, 22, textureX, textureY); // Box 91
        bodyModel[83] = new ModelRendererTurbo(this, 76, 16, textureX, textureY); // Box 92
        bodyModel[84] = new ModelRendererTurbo(this, 100, 2, textureX, textureY); // Box 93
        bodyModel[85] = new ModelRendererTurbo(this, 127, 6, textureX, textureY); // Box 94
        bodyModel[86] = new ModelRendererTurbo(this, 76, 9, textureX, textureY); // Box 95
        bodyModel[87] = new ModelRendererTurbo(this, 349, 46, textureX, textureY); // Box 96
        bodyModel[88] = new ModelRendererTurbo(this, 349, 32, textureX, textureY); // Box 97
        bodyModel[89] = new ModelRendererTurbo(this, 341, 30, textureX, textureY); // Box 98
        bodyModel[90] = new ModelRendererTurbo(this, 348, 22, textureX, textureY); // Box 100
        bodyModel[91] = new ModelRendererTurbo(this, 343, 24, textureX, textureY); // Box 102
        bodyModel[92] = new ModelRendererTurbo(this, 345, 12, textureX, textureY); // Box 103
        bodyModel[93] = new ModelRendererTurbo(this, 334, 14, textureX, textureY); // Box 104
        bodyModel[94] = new ModelRendererTurbo(this, 336, 22, textureX, textureY); // Box 105
        bodyModel[95] = new ModelRendererTurbo(this, 364, 14, textureX, textureY); // Box 106
        bodyModel[96] = new ModelRendererTurbo(this, 361, 24, textureX, textureY); // Box 107
        bodyModel[97] = new ModelRendererTurbo(this, 370, 22, textureX, textureY); // Box 108
        bodyModel[98] = new ModelRendererTurbo(this, 365, 30, textureX, textureY); // Box 109
        bodyModel[99] = new ModelRendererTurbo(this, 368, 40, textureX, textureY); // Box 110
        bodyModel[100] = new ModelRendererTurbo(this, 338, 40, textureX, textureY); // Box 111
        bodyModel[101] = new ModelRendererTurbo(this, 72, 37, textureX, textureY); // Box 112
        bodyModel[102] = new ModelRendererTurbo(this, 349, 2, textureX, textureY); // Box 113
        bodyModel[103] = new ModelRendererTurbo(this, 346, 4, textureX, textureY); // Box 114
        bodyModel[104] = new ModelRendererTurbo(this, 166, 31, textureX, textureY); // Box 116
        bodyModel[105] = new ModelRendererTurbo(this, 146, 38, textureX, textureY); // Box 117
        bodyModel[106] = new ModelRendererTurbo(this, 376, 33, textureX, textureY); // Box 118
        bodyModel[107] = new ModelRendererTurbo(this, 141, 38, textureX, textureY); // Box 119
        bodyModel[108] = new ModelRendererTurbo(this, 91, 28, textureX, textureY); // Box 120
        bodyModel[109] = new ModelRendererTurbo(this, 101, 62, textureX, textureY); // Box 121
        bodyModel[110] = new ModelRendererTurbo(this, 72, 64, textureX, textureY); // Box 122
        bodyModel[111] = new ModelRendererTurbo(this, 171, 40, textureX, textureY); // Box 123
        bodyModel[112] = new ModelRendererTurbo(this, 171, 45, textureX, textureY); // Box 124
        bodyModel[113] = new ModelRendererTurbo(this, 171, 53, textureX, textureY); // Box 125
        bodyModel[114] = new ModelRendererTurbo(this, 197, 45, textureX, textureY); // Box 126
        bodyModel[115] = new ModelRendererTurbo(this, 235, 40, textureX, textureY); // Box 127
        bodyModel[116] = new ModelRendererTurbo(this, 199, 41, textureX, textureY); // Box 128
        bodyModel[117] = new ModelRendererTurbo(this, 207, 26, textureX, textureY); // Box 129
        bodyModel[118] = new ModelRendererTurbo(this, 171, 11, textureX, textureY); // Box 133
        bodyModel[119] = new ModelRendererTurbo(this, 171, 14, textureX, textureY); // Box 134
        bodyModel[120] = new ModelRendererTurbo(this, 233, 13, textureX, textureY); // Box 135
        bodyModel[121] = new ModelRendererTurbo(this, 232, 8, textureX, textureY); // Box 136
        bodyModel[122] = new ModelRendererTurbo(this, 138, 60, textureX, textureY); // Box 139
        bodyModel[123] = new ModelRendererTurbo(this, 192, 60, textureX, textureY); // Box 140
        bodyModel[124] = new ModelRendererTurbo(this, 174, 14, textureX, textureY); // Box 141 tailgate
        bodyModel[125] = new ModelRendererTurbo(this, 368, 6, textureX, textureY); // Box 143
        bodyModel[126] = new ModelRendererTurbo(this, 360, 4, textureX, textureY); // Box 144
        bodyModel[127] = new ModelRendererTurbo(this, 338, 6, textureX, textureY); // Box 145
        bodyModel[128] = new ModelRendererTurbo(this, 244, 41, textureX, textureY); // Box 146
        bodyModel[129] = new ModelRendererTurbo(this, 242, 3, textureX, textureY); // Box 147
        bodyModel[130] = new ModelRendererTurbo(this, 218, 21, textureX, textureY); // Box 148
        bodyModel[131] = new ModelRendererTurbo(this, 219, 29, textureX, textureY); // Box 149
        bodyModel[132] = new ModelRendererTurbo(this, 165, 62, textureX, textureY); // Box 151
        bodyModel[133] = new ModelRendererTurbo(this, 216, 1, textureX, textureY); // Box 152
        bodyModel[134] = new ModelRendererTurbo(this, 233, 2, textureX, textureY); // Box 153
        bodyModel[135] = new ModelRendererTurbo(this, 209, 2, textureX, textureY); // Box 154
        bodyModel[136] = new ModelRendererTurbo(this, 217, 7, textureX, textureY); // Box 155
        bodyModel[137] = new ModelRendererTurbo(this, 215, 13, textureX, textureY); // Box 156
        bodyModel[138] = new ModelRendererTurbo(this, 216, 39, textureX, textureY); // Box 157
        bodyModel[139] = new ModelRendererTurbo(this, 218, 45, textureX, textureY); // Box 158
        bodyModel[140] = new ModelRendererTurbo(this, 217, 50, textureX, textureY); // Box 159
        bodyModel[141] = new ModelRendererTurbo(this, 235, 51, textureX, textureY); // Box 160
        bodyModel[142] = new ModelRendererTurbo(this, 209, 51, textureX, textureY); // Box 161
        bodyModel[143] = new ModelRendererTurbo(this, 171, 2, textureX, textureY); // Box 162
        bodyModel[144] = new ModelRendererTurbo(this, 197, 11, textureX, textureY); // Box 163
        bodyModel[145] = new ModelRendererTurbo(this, 199, 14, textureX, textureY); // Box 164
        bodyModel[146] = new ModelRendererTurbo(this, 11, 83, textureX, textureY); // Box 165
        bodyModel[147] = new ModelRendererTurbo(this, 229, 22, textureX, textureY); // Box 166
        bodyModel[148] = new ModelRendererTurbo(this, 217, 22, textureX, textureY); // Box 167
        bodyModel[149] = new ModelRendererTurbo(this, 208, 28, textureX, textureY); // Box 168
        bodyModel[150] = new ModelRendererTurbo(this, 240, 28, textureX, textureY); // Box 169
        bodyModel[151] = new ModelRendererTurbo(this, 222, 17, textureX, textureY); // Box 351 sandcap
        bodyModel[152] = new ModelRendererTurbo(this, 66, 42, textureX, textureY, BoxName.brakeLight); // Box 171 taillight
        bodyModel[153] = new ModelRendererTurbo(this, 146, 18, textureX, textureY); // Box 172
        bodyModel[154] = new ModelRendererTurbo(this, 141, 18, textureX, textureY); // Box 173
        bodyModel[155] = new ModelRendererTurbo(this, 130, 45, textureX, textureY); // Box 174
        bodyModel[156] = new ModelRendererTurbo(this, 171, 48, textureX, textureY); // Box 175
        bodyModel[157] = new ModelRendererTurbo(this, 46, 36, textureX, textureY); // Box 176
        bodyModel[158] = new ModelRendererTurbo(this, 171, 6, textureX, textureY); // Box 177
        bodyModel[159] = new ModelRendererTurbo(this, 130, 10, textureX, textureY); // Box 178
        bodyModel[160] = new ModelRendererTurbo(this, 20, 36, textureX, textureY); // Box 179
        bodyModel[161] = new ModelRendererTurbo(this, 191, 19, textureX, textureY); // Box 180
        bodyModel[162] = new ModelRendererTurbo(this, 183, 19, textureX, textureY); // Box 183
        bodyModel[163] = new ModelRendererTurbo(this, 66, 42, textureX, textureY, BoxName.brakeLight); // Box 171 taillight
        bodyModel[164] = new ModelRendererTurbo(this, 66, 42, textureX, textureY, BoxName.brakeLight); // Box 185 taillight
        bodyModel[165] = new ModelRendererTurbo(this, 66, 42, textureX, textureY, BoxName.brakeLight); // Box 185 taillight
        bodyModel[166] = new ModelRendererTurbo(this, 21, 72, textureX, textureY); // Box 187
        bodyModel[167] = new ModelRendererTurbo(this, 37, 72, textureX, textureY); // Box 188
        bodyModel[168] = new ModelRendererTurbo(this, 30, 76, textureX, textureY); // Box 189
        bodyModel[169] = new ModelRendererTurbo(this, 30, 76, textureX, textureY); // Box 190
        bodyModel[170] = new ModelRendererTurbo(this, 21, 72, textureX, textureY); // Box 191
        bodyModel[171] = new ModelRendererTurbo(this, 37, 72, textureX, textureY); // Box 192
        bodyModel[172] = new ModelRendererTurbo(this, 66, 40, textureX, textureY, BoxName.reverseLight); // Box 193 reverse light
        bodyModel[173] = new ModelRendererTurbo(this, 66, 40, textureX, textureY, BoxName.reverseLight); // Box 194 reverse light
        bodyModel[174] = new ModelRendererTurbo(this, 66, 40, textureX, textureY, BoxName.reverseLight); // Box 193 reverse light
        bodyModel[175] = new ModelRendererTurbo(this, 66, 40, textureX, textureY, BoxName.reverseLight); // Box 194 reverse light
        bodyModel[176] = new ModelRendererTurbo(this, 66, 38, textureX, textureY, BoxName.leftTurnLight); // Box 197 turnlight L
        bodyModel[177] = new ModelRendererTurbo(this, 66, 38, textureX, textureY, BoxName.leftTurnLight); // Box 198 turnlight L
        bodyModel[178] = new ModelRendererTurbo(this, 66, 38, textureX, textureY, BoxName.rightTurnLight); // Box 199 turnlight R
        bodyModel[179] = new ModelRendererTurbo(this, 66, 38, textureX, textureY, BoxName.rightTurnLight); // Box 200 turnlight R
        bodyModel[180] = new ModelRendererTurbo(this, 66, 27, textureX, textureY, BoxName.leftTurnLight); // Box 201 turnlight L
        bodyModel[181] = new ModelRendererTurbo(this, 66, 27, textureX, textureY, BoxName.rightTurnLight); // Box 201 turnlight R
        bodyModel[182] = new ModelRendererTurbo(this, 130, 37, textureX, textureY); // Box 203
        bodyModel[183] = new ModelRendererTurbo(this, 130, 33, textureX, textureY); // Box 204
        bodyModel[184] = new ModelRendererTurbo(this, 130, 22, textureX, textureY); // Box 205
        bodyModel[185] = new ModelRendererTurbo(this, 130, 18, textureX, textureY); // Box 206
        bodyModel[186] = new ModelRendererTurbo(this, 166, 21, textureX, textureY); // Box 207
        bodyModel[187] = new ModelRendererTurbo(this, 336, 33, textureX, textureY); // Box 208
        bodyModel[188] = new ModelRendererTurbo(this, 26, 23, textureX, textureY); // Box 209
        bodyModel[189] = new ModelRendererTurbo(this, 41, 19, textureX, textureY); // Box 210
        bodyModel[190] = new ModelRendererTurbo(this, 19, 19, textureX, textureY); // Box 211
        bodyModel[191] = new ModelRendererTurbo(this, 110, 38, textureX, textureY); // Box 212
        bodyModel[192] = new ModelRendererTurbo(this, 255, 34, textureX, textureY); // Box 213
        bodyModel[193] = new ModelRendererTurbo(this, 284, 29, textureX, textureY); // Box 214
        bodyModel[194] = new ModelRendererTurbo(this, 303, 38, textureX, textureY); // Box 215
        bodyModel[195] = new ModelRendererTurbo(this, 289, 38, textureX, textureY); // Box 216
        bodyModel[196] = new ModelRendererTurbo(this, 264, 11, textureX, textureY); // Box 217
        bodyModel[197] = new ModelRendererTurbo(this, 284, 12, textureX, textureY); // Box 218
        bodyModel[198] = new ModelRendererTurbo(this, 283, 18, textureX, textureY); // Box 219
        bodyModel[199] = new ModelRendererTurbo(this, 272, 1, textureX, textureY); // Box 220
        bodyModel[200] = new ModelRendererTurbo(this, 283, 3, textureX, textureY); // Box 221
        bodyModel[201] = new ModelRendererTurbo(this, 269, 3, textureX, textureY); // Box 222
        bodyModel[202] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 223
        bodyModel[203] = new ModelRendererTurbo(this, 274, 18, textureX, textureY); // Box 224
        bodyModel[204] = new ModelRendererTurbo(this, 266, 18, textureX, textureY); // Box 225
        bodyModel[205] = new ModelRendererTurbo(this, 269, 6, textureX, textureY); // Box 226 steeringwhool
        bodyModel[206] = new ModelRendererTurbo(this, 264, 13, textureX, textureY); // Box 227
        bodyModel[207] = new ModelRendererTurbo(this, 155, 31, textureX, textureY); // Box 228 window
        bodyModel[208] = new ModelRendererTurbo(this, 144, 31, textureX, textureY); // Box 230 window
        bodyModel[209] = new ModelRendererTurbo(this, 155, 22, textureX, textureY); // Box 231
        bodyModel[210] = new ModelRendererTurbo(this, 144, 22, textureX, textureY); // Box 232
        bodyModel[211] = new ModelRendererTurbo(this, 63, 24, textureX, textureY); // Box 364 prime base
        bodyModel[212] = new ModelRendererTurbo(this, 63, 20, textureX, textureY, BoxName.prime1); // Box 6 PRIME1-1
        bodyModel[213] = new ModelRendererTurbo(this, 63, 20, textureX, textureY, BoxName.prime3); // Box 7 PRIME1-3
        bodyModel[214] = new ModelRendererTurbo(this, 63, 20, textureX, textureY, BoxName.prime2); // Box 8 PRIME1-2
        bodyModel[215] = new ModelRendererTurbo(this, 63, 20, textureX, textureY, BoxName.prime4); // Box 9 PRIME1-4

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

        bodyModel[8].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
        bodyModel[8].setRotationPoint(-13.5F, 7F, 0F);

        bodyModel[9].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
        bodyModel[9].setRotationPoint(10.5F, 7F, -8F);

        bodyModel[10].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
        bodyModel[10].setRotationPoint(10.5F, 7F, -8F);

        bodyModel[11].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
        bodyModel[11].setRotationPoint(10.5F, 7F, -8F);

        bodyModel[12].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel3
        bodyModel[12].setRotationPoint(10.5F, 7F, -8F);

        bodyModel[13].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
        bodyModel[13].setRotationPoint(10.5F, 7F, 8F);

        bodyModel[14].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
        bodyModel[14].setRotationPoint(10.5F, 7F, 8F);

        bodyModel[15].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
        bodyModel[15].setRotationPoint(10.5F, 7F, 8F);

        bodyModel[16].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel4
        bodyModel[16].setRotationPoint(10.5F, 7F, 8F);

        bodyModel[17].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
        bodyModel[17].setRotationPoint(10.5F, 7F, 0F);

        bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
        bodyModel[18].setRotationPoint(-18F, -1F, -9F);

        bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 20
        bodyModel[19].setRotationPoint(-11.5F, 3F, -9F);

        bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
        bodyModel[20].setRotationPoint(-10F, 4F, -9F);

        bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
        bodyModel[21].setRotationPoint(-9F, 4F, -9F);

        bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 23
        bodyModel[22].setRotationPoint(6F, 4F, -9F);

        bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 24
        bodyModel[23].setRotationPoint(6.5F, 3F, -9F);

        bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 26
        bodyModel[24].setRotationPoint(12.5F, 3F, -9F);

        bodyModel[25].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 29
        bodyModel[25].setRotationPoint(-10F, 3F, -9F);

        bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 30
        bodyModel[26].setRotationPoint(-17.5F, 3F, -9F);

        bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
        bodyModel[27].setRotationPoint(-20.5F, -1F, -4F);

        bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
        bodyModel[28].setRotationPoint(-20.5F, -1F, -8F);

        bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 33
        bodyModel[29].setRotationPoint(-20.5F, -1F, 4F);

        bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 34
        bodyModel[30].setRotationPoint(-20.5F, 0.5F, -4F);

        bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F); // Box 35
        bodyModel[31].setRotationPoint(-20.5F, 0.5F, 4F);

        bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2.5F, 0F, 0.25F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 36
        bodyModel[32].setRotationPoint(-20.5F, 0.5F, -5F);

        bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
        bodyModel[33].setRotationPoint(-19F, -1F, -9F);

        bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 38
        bodyModel[34].setRotationPoint(-21F, 3F, -5F);

        bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
        bodyModel[35].setRotationPoint(-21F, 3F, -8F);

        bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 41
        bodyModel[36].setRotationPoint(19F, 5F, -8F);

        bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
        bodyModel[37].setRotationPoint(-21F, 5F, -8F);

        bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 43
        bodyModel[38].setRotationPoint(-19.5F, 5F, -9F);

        bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 44
        bodyModel[39].setRotationPoint(-18F, 4F, -9F);

        bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 45
        bodyModel[40].setRotationPoint(-19.5F, 3F, -9F);

        bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
        bodyModel[41].setRotationPoint(-18F, 3F, -9F);

        bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
        bodyModel[42].setRotationPoint(-20F, 0F, -9F);

        bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
        bodyModel[43].setRotationPoint(-19F, 0F, -9F);

        bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 49
        bodyModel[44].setRotationPoint(-19.5F, 0F, -8F);

        bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight
        bodyModel[45].setRotationPoint(-20.5F, 1F, -8F);

        bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 51
        bodyModel[46].setRotationPoint(-21F, 3F, 5F);

        bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 52
        bodyModel[47].setRotationPoint(-21F, 5F, 5F);

        bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 53
        bodyModel[48].setRotationPoint(-19.5F, 5F, 8F);

        bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
        bodyModel[49].setRotationPoint(-19.5F, 3F, 8F);

        bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 58
        bodyModel[50].setRotationPoint(-19.5F, 0F, 5F);

        bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 59 headlight
        bodyModel[51].setRotationPoint(-20.5F, 1F, 5F);

        bodyModel[52].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 60
        bodyModel[52].setRotationPoint(-20F, 3F, -5F);

        bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
        bodyModel[53].setRotationPoint(-21F, 4F, -2F);

        bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
        bodyModel[54].setRotationPoint(-21F, 4F, 1F);

        bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 63
        bodyModel[55].setRotationPoint(-21F, 5F, -5F);

        bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, 0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 64
        bodyModel[56].setRotationPoint(-20.63F, 6.5F, -5F);

        bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 66
        bodyModel[57].setRotationPoint(-20.88F, 5.5F, 1F);

        bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 67
        bodyModel[58].setRotationPoint(-20.88F, 5.5F, -2F);

        bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68 glowey
        bodyModel[59].setRotationPoint(-21.01F, 3.5F, -8F);

        bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 69 glowey
        bodyModel[60].setRotationPoint(-21.01F, 3.5F, 5F);

        bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
        bodyModel[61].setRotationPoint(-19.5F, -2F, -4F);

        bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
        bodyModel[62].setRotationPoint(-19.5F, -2F, -8F);

        bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 72
        bodyModel[63].setRotationPoint(-19.5F, -2F, 4F);

        bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 73
        bodyModel[64].setRotationPoint(-10F, 4F, -9F);

        bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 74
        bodyModel[65].setRotationPoint(-19F, 0F, 8F);

        bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F); // Box 75
        bodyModel[66].setRotationPoint(-20F, 0F, 8F);

        bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F); // Box 76
        bodyModel[67].setRotationPoint(-19F, -1F, 8F);

        bodyModel[68].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
        bodyModel[68].setRotationPoint(-18F, -1F, 8F);

        bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 78
        bodyModel[69].setRotationPoint(-18F, 4F, 8F);

        bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 79
        bodyModel[70].setRotationPoint(-17.5F, 3F, 6F);

        bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 80
        bodyModel[71].setRotationPoint(-18F, 3F, 6F);

        bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81
        bodyModel[72].setRotationPoint(-9F, 4F, 8F);

        bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
        bodyModel[73].setRotationPoint(6F, 4F, 6F);

        bodyModel[74].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 83
        bodyModel[74].setRotationPoint(-10F, 3F, 8F);

        bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 84
        bodyModel[75].setRotationPoint(-11.5F, 3F, 6F);

        bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 85
        bodyModel[76].setRotationPoint(6.5F, 3F, 6F);

        bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 86
        bodyModel[77].setRotationPoint(-10F, 4F, 6F);

        bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 87
        bodyModel[78].setRotationPoint(-10F, 4F, 7F);

        bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, -1F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
        bodyModel[79].setRotationPoint(-19F, -2F, -9F);

        bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 89
        bodyModel[80].setRotationPoint(-19F, -2F, 8F);

        bodyModel[81].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 90
        bodyModel[81].setRotationPoint(-17F, 2F, -8F);

        bodyModel[82].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 91
        bodyModel[82].setRotationPoint(-18F, 2F, -6F);

        bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 92
        bodyModel[83].setRotationPoint(-18F, 4F, -8F);

        bodyModel[84].addBox(0F, 0F, 0F, 8, 4, 1, 0F); // Box 93
        bodyModel[84].setRotationPoint(-18F, 2F, 5F);

        bodyModel[85].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 94
        bodyModel[85].setRotationPoint(-17F, 2F, 6F);

        bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 95
        bodyModel[86].setRotationPoint(-18F, 4F, 6F);

        bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 96
        bodyModel[87].setRotationPoint(-11.5F, -2F, -4F);

        bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
        bodyModel[88].setRotationPoint(-11.5F, -7F, -4F);

        bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 98
        bodyModel[89].setRotationPoint(-11.5F, -7F, 4F);

        bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
        bodyModel[90].setRotationPoint(-6.5F, -8F, -4F);

        bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 102
        bodyModel[91].setRotationPoint(-6.5F, -8F, 4F);

        bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
        bodyModel[92].setRotationPoint(-4.5F, -8F, -4F);

        bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 104
        bodyModel[93].setRotationPoint(-4.5F, -8F, 4F);

        bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 105
        bodyModel[94].setRotationPoint(-4.5F, -8F, 4F);

        bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
        bodyModel[95].setRotationPoint(-4.5F, -8F, -8F);

        bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
        bodyModel[96].setRotationPoint(-6.5F, -8F, -8F);

        bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 108
        bodyModel[97].setRotationPoint(-4.5F, -8F, -8F);

        bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
        bodyModel[98].setRotationPoint(-11.5F, -7F, -8F);

        bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
        bodyModel[99].setRotationPoint(-11.5F, -2F, -8F);

        bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
        bodyModel[100].setRotationPoint(-11.5F, -2F, 4F);

        bodyModel[101].addBox(0F, 0F, 0F, 1, 5, 16, 0F); // Box 112
        bodyModel[101].setRotationPoint(0F, -7F, -8F);

        bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
        bodyModel[102].setRotationPoint(0F, -8F, -4F);

        bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 114
        bodyModel[103].setRotationPoint(0F, -8F, 4F);

        bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
        bodyModel[104].setRotationPoint(0F, -7F, -9F);

        bodyModel[105].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
        bodyModel[105].setRotationPoint(-10F, -2F, -9F);

        bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-5.5F, 0F, -1F, 5.5F, 0F, -1F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
        bodyModel[106].setRotationPoint(-11F, -7F, -9F);

        bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
        bodyModel[107].setRotationPoint(-11F, -2F, -9F);

        bodyModel[108].addBox(0F, 0F, 0F, 1, 7, 16, 0F); // Box 120
        bodyModel[108].setRotationPoint(0F, -2F, -8F);

        bodyModel[109].addBox(0F, 0F, 0F, 10, 1, 16, 0F); // Box 121
        bodyModel[109].setRotationPoint(-9F, 5F, -8F);

        bodyModel[110].addBox(0F, 0F, 0F, 10, 1, 12, 0F); // Box 122
        bodyModel[110].setRotationPoint(-19F, 6F, -6F);

        bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
        bodyModel[111].setRotationPoint(1F, 4F, -9F);

        bodyModel[112].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 124
        bodyModel[112].setRotationPoint(1F, 3F, -9F);

        bodyModel[113].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 125
        bodyModel[113].setRotationPoint(1F, -2F, -9F);

        bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 126
        bodyModel[114].setRotationPoint(14F, 3F, -9F);

        bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 127
        bodyModel[115].setRotationPoint(14F, 4F, -9F);

        bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 128
        bodyModel[116].setRotationPoint(15F, 4F, -9F);

        bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 129
        bodyModel[117].setRotationPoint(19F, 5F, 2F);

        bodyModel[118].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 133
        bodyModel[118].setRotationPoint(1F, 3F, 8F);

        bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 134
        bodyModel[119].setRotationPoint(1F, 4F, 8F);

        bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 135
        bodyModel[120].setRotationPoint(14F, 4F, 6F);

        bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 136
        bodyModel[121].setRotationPoint(12.5F, 3F, 6F);

        bodyModel[122].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Box 139
        bodyModel[122].setRotationPoint(1F, 5F, -8F);

        bodyModel[123].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 140
        bodyModel[123].setRotationPoint(15F, 5F, -8F);

        bodyModel[124].addBox(-0.5F, -6F, 0F, 1, 7, 14, 0F); // Box 141 tailgate
        bodyModel[124].setRotationPoint(18.5F, 4F, -7F);

        bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 143
        bodyModel[125].setRotationPoint(0F, -8F, -8F);

        bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
        bodyModel[126].setRotationPoint(0F, -8F, -8F);

        bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
        bodyModel[127].setRotationPoint(0F, -8F, 4F);

        bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 146
        bodyModel[128].setRotationPoint(14F, 4F, -9F);

        bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 147
        bodyModel[129].setRotationPoint(14F, 4F, 7F);

        bodyModel[130].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 148
        bodyModel[130].setRotationPoint(18.5F, 6.5F, -3F);

        bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 149
        bodyModel[131].setRotationPoint(17.5F, 5.5F, -3F);

        bodyModel[132].addBox(0F, 0F, 0F, 9, 1, 12, 0F); // Box 151
        bodyModel[132].setRotationPoint(6F, 5F, -6F);

        bodyModel[133].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 152
        bodyModel[133].setRotationPoint(7F, 2F, 6F);

        bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
        bodyModel[134].setRotationPoint(14F, 2F, 5F);

        bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
        bodyModel[135].setRotationPoint(6F, 2F, 5F);

        bodyModel[136].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 155
        bodyModel[136].setRotationPoint(7F, 2F, 5F);

        bodyModel[137].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 156
        bodyModel[137].setRotationPoint(6F, 4F, 5F);

        bodyModel[138].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 157
        bodyModel[138].setRotationPoint(6F, 4F, -6F);

        bodyModel[139].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 158
        bodyModel[139].setRotationPoint(7F, 2F, -6F);

        bodyModel[140].addBox(0F, 0F, 0F, 7, 1, 2, 0F); // Box 159
        bodyModel[140].setRotationPoint(7F, 2F, -8F);

        bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
        bodyModel[141].setRotationPoint(14F, 2F, -8F);

        bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
        bodyModel[142].setRotationPoint(6F, 2F, -8F);

        bodyModel[143].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
        bodyModel[143].setRotationPoint(1F, -2F, 8F);

        bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
        bodyModel[144].setRotationPoint(14F, 3F, 8F);

        bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 164
        bodyModel[145].setRotationPoint(15F, 4F, 8F);

        bodyModel[146].addShapeBox(-1F, -1F, -7F, 22, 2, 2, 0F,0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 165
        bodyModel[146].setRotationPoint(-11.75F, 7F, 6F);

        bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 166
        bodyModel[147].setRotationPoint(19F, 5F, -9F);

        bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F); // Box 167
        bodyModel[148].setRotationPoint(19F, 5F, 8F);

        bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 168
        bodyModel[149].setRotationPoint(17.5F, 5F, 8F);

        bodyModel[150].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 169
        bodyModel[150].setRotationPoint(17.5F, 5F, -9F);

        bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351 sandcap
        bodyModel[151].setRotationPoint(18.75F, 5.5F, -1F);

        bodyModel[152].addShapeBox(-1F, 0F, 0F, 0, 2, 1, 0F,-1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171 taillight
        bodyModel[152].setRotationPoint(19.01F, 2F, 8F);

        bodyModel[153].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 172
        bodyModel[153].setRotationPoint(-10F, -2F, 8F);

        bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 173
        bodyModel[154].setRotationPoint(-11F, -2F, 8F);

        bodyModel[155].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 174
        bodyModel[155].setRotationPoint(-18F, 1F, -9F);

        bodyModel[156].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 175
        bodyModel[156].setRotationPoint(1F, 0F, -9F);

        bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 176
        bodyModel[157].setRotationPoint(-20F, 1F, -9F);

        bodyModel[158].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
        bodyModel[158].setRotationPoint(1F, 0F, 8F);

        bodyModel[159].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 178
        bodyModel[159].setRotationPoint(-18F, 1F, 8F);

        bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, 0F); // Box 179
        bodyModel[160].setRotationPoint(-20F, 1F, 8F);

        bodyModel[161].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 180
        bodyModel[161].setRotationPoint(18F, -2F, -8F);

        bodyModel[162].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 183
        bodyModel[162].setRotationPoint(18F, -2F, 7F);

        bodyModel[163].addShapeBox(-1F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 171 taillight
        bodyModel[163].setRotationPoint(19.01F, 2F, -9F);

        bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185 taillight
        bodyModel[164].setRotationPoint(19.01F, 2F, -8F);

        bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185 taillight
        bodyModel[165].setRotationPoint(19.01F, 2F, 7F);

        bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 187
        bodyModel[166].setRotationPoint(5F, 6F, -5.5F);

        bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 188
        bodyModel[167].setRotationPoint(12F, 6F, -5.5F);

        bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 189
        bodyModel[168].setRotationPoint(9F, 7F, -5.5F);

        bodyModel[169].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 190
        bodyModel[169].setRotationPoint(9F, 7F, 3.5F);

        bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 191
        bodyModel[170].setRotationPoint(5F, 6F, 3.5F);

        bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 192
        bodyModel[171].setRotationPoint(12F, 6F, 3.5F);

        bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193 reverse light
        bodyModel[172].setRotationPoint(19.01F, 2F, 7F);

        bodyModel[173].addShapeBox(-1F, 0F, 0F, 0, 1, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194 reverse light
        bodyModel[173].setRotationPoint(19.01F, 2F, 8F);

        bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 193 reverse light
        bodyModel[174].setRotationPoint(19.01F, 2F, -8F);

        bodyModel[175].addShapeBox(-1F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 194 reverse light
        bodyModel[175].setRotationPoint(19.01F, 2F, -9F);

        bodyModel[176].addShapeBox(-1F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 197 turnlight L
        bodyModel[176].setRotationPoint(19.01F, 1F, -9F);

        bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198 turnlight L
        bodyModel[177].setRotationPoint(19.01F, 1F, -8F);

        bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 turnlight R
        bodyModel[178].setRotationPoint(19.01F, 1F, 7F);

        bodyModel[179].addShapeBox(-1F, 0F, 0F, 0, 1, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200 turnlight R
        bodyModel[179].setRotationPoint(19.01F, 1F, 8F);

        bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,-0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 201 turnlight L
        bodyModel[180].setRotationPoint(-19.01F, 0.5F, -9F);

        bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 201 turnlight R
        bodyModel[181].setRotationPoint(-19.01F, 0.5F, 8F);

        bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
        bodyModel[182].setRotationPoint(-10F, -2F, -10.5F);

        bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
        bodyModel[183].setRotationPoint(-10F, -3F, -10.5F);

        bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 205
        bodyModel[184].setRotationPoint(-10F, -3F, 8.5F);

        bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 206
        bodyModel[185].setRotationPoint(-10F, -2F, 8.5F);

        bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 207
        bodyModel[186].setRotationPoint(0F, -7F, 8F);

        bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-5.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, -1F, -5.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 208
        bodyModel[187].setRotationPoint(-11F, -7F, 8F);

        bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209
        bodyModel[188].setRotationPoint(-20.5F, 0F, -4F);

        bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
        bodyModel[189].setRotationPoint(-20.5F, 0F, -8F);

        bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F); // Box 211
        bodyModel[190].setRotationPoint(-20.5F, 0F, 4F);

        bodyModel[191].addBox(0F, 0F, 0F, 1, 7, 16, 0F); // Box 212
        bodyModel[191].setRotationPoint(1F, -2F, -8F);

        bodyModel[192].addBox(0F, 0F, 0F, 6, 3, 16, 0F); // Box 213
        bodyModel[192].setRotationPoint(-6F, 2F, -8F);

        bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 214
        bodyModel[193].setRotationPoint(-1F, -2F, -8F);

        bodyModel[194].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 215
        bodyModel[194].setRotationPoint(-1F, -4F, -6F);

        bodyModel[195].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 216
        bodyModel[195].setRotationPoint(-1F, -4F, 2F);

        bodyModel[196].addBox(0F, 0F, 0F, 1, 6, 16, 0F); // Box 217
        bodyModel[196].setRotationPoint(-10F, -2F, -8F);

        bodyModel[197].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Box 218
        bodyModel[197].setRotationPoint(-10F, 4F, -6F);

        bodyModel[198].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 219
        bodyModel[198].setRotationPoint(-9F, 3F, -1.5F);

        bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 220
        bodyModel[199].setRotationPoint(-10.5F, -2F, -4F);

        bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 221
        bodyModel[200].setRotationPoint(-10.5F, -2F, 4F);

        bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 222
        bodyModel[201].setRotationPoint(-10.5F, -2F, -8F);

        bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
        bodyModel[202].setRotationPoint(-9F, -2F, -7F);

        bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
        bodyModel[203].setRotationPoint(-9F, -2F, -1F);

        bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
        bodyModel[204].setRotationPoint(-9F, -2F, -8F);

        bodyModel[205].addShapeBox(0F, 0F, -1F, 0, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 226 steeringwhool
        bodyModel[205].setRotationPoint(-7.99F, -2F, -6F);

        bodyModel[206].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 227
        bodyModel[206].setRotationPoint(-9F, -0.5F, -4.5F);

        bodyModel[207].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228 window
        bodyModel[207].setRotationPoint(-5F, -7F, -8.25F);

        bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230 window
        bodyModel[208].setRotationPoint(-10F, -7F, -8.25F);

        bodyModel[209].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
        bodyModel[209].setRotationPoint(-5F, -7F, 8.25F);

        bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
        bodyModel[210].setRotationPoint(-10F, -7F, 8.25F);

        bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
        bodyModel[211].setRotationPoint(-4F, -9F, -1F);

        bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
        bodyModel[212].setRotationPoint(-4F, -9.5F, -1F);

        bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
        bodyModel[213].setRotationPoint(-4F, -9.5F, -1F);

        bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
        bodyModel[214].setRotationPoint(-4F, -9.5F, -1F);

        bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
        bodyModel[215].setRotationPoint(-4F, -9.5F, -1F);
    }
}
