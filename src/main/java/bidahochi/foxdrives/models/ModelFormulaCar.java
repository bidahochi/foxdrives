//FMT-Marker FVTM-1.5
package bidahochi.foxdrives.models;

import fdfexcraft.fvtm.FDTurboList;
import fdfexcraft.fvtm.RollingStockModel;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelFormulaCar extends RollingStockModel {

	public ModelFormulaCar(){
		super();
		textureX = 128;
		textureY = 128;
		addToCreators("broscolotos");
		//
		FDTurboList clipboard = new FDTurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 0, 0, -0.25f, 0, 0, -0.15625f, 0, 0, -0.15625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.15625f, 0, 0, -0.15625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-22.59375f, 7.1875f, -8.01f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 0, 0, -0.25f, 0, 0, -0.15625f, 0, 0, -0.15625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.15625f, 0, 0, -0.15625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-22.59375f, 7.1875f, 8.01f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.875f, -0.75f, 0, 0.53125f, -0.75f, 0, -0.65625f, -0.75f, 0.03125f, 0.03125f, -0.75f, 0.03125f, 0, 0, 0, -0.3125f, 0, 0, -2.25f, 0, 0.6875f, 1.625f, 0, 0.6875f)
			.setRotationPoint(-21.25f, 8.1875f, -8).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.40625f, -0.75f, 0, 0.09375f, -0.75f, 0, -1, -0.75f, -0.4375f, 0.34375f, -0.75f, -0.4375f, 0, 0, 0, -0.34375f, 0, 0, -1.53125f, 0, 0.03125f, 0.90625f, 0, 0.03125f)
			.setRotationPoint(-20.375f, 7.9375f, -8).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.4375f, -0.71875f, 0, 0.125f, -0.71875f, 0, -0.84375f, -0.71875f, 0.0625f, 0.1875f, -0.71875f, 0.0625f, 0, 0, 0, -0.3125f, 0, 0, -1.40625f, 0, 0.5625f, 0.75f, 0, 0.5625f)
			.setRotationPoint(-19.96875f, 7.6875f, -8).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.96875f, -0.0625f, 0, 0.65625f, -0.0625f, 0, -1.28125f, -1, 0.0625f, 0.625f, -1, 0.0625f, 0, 0, 0, -0.3125f, 0, 0, -1.28125f, 0, 0.0625f, 0.625f, 0, 0.0625f)
			.setRotationPoint(-19.53125f, 7.40625f, -8).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.03125f, -0.75f, 0.03125f, -0.65625f, -0.75f, 0.03125f, 0.53125f, -0.75f, 0, -0.875f, -0.75f, 0, 1.625f, 0, 0.6875f, -2.25f, 0, 0.6875f, -0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.25f, 8.1875f, 3).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.34375f, -0.75f, -0.4375f, -1, -0.75f, -0.4375f, 0.09375f, -0.75f, 0, -0.40625f, -0.75f, 0, 0.90625f, 0, 0.03125f, -1.53125f, 0, 0.03125f, -0.34375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.375f, 7.9375f, 3).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.1875f, -0.71875f, 0.0625f, -0.84375f, -0.71875f, 0.0625f, 0.125f, -0.71875f, 0, -0.4375f, -0.71875f, 0, 0.75f, 0, 0.5625f, -1.40625f, 0, 0.5625f, -0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.96875f, 7.6875f, 4).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.625f, -1, 0.0625f, -1.28125f, -1, 0.0625f, 0.65625f, -0.0625f, 0, -0.96875f, -0.0625f, 0, 0.625f, 0, 0.0625f, -1.28125f, 0, 0.0625f, -0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.53125f, 7.40625f, 4).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.3125f, 0, 0.3125f, 0.6875f, 0, 0.3125f, 0.375f, 0, 0, 0, 0, 0, -0.3125f, -0.75f, 0.3125f, 0.6875f, -0.75f, 0.3125f, 0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.78125f, 9.1875f, -2).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.375f, 0, 0, 0.6875f, 0, 0.3125f, -0.3125f, 0, 0.3125f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.6875f, -0.75f, 0.3125f, -0.3125f, -0.75f, 0.3125f)
			.setRotationPoint(-23.78125f, 9.1875f, 0).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, -1.21875f, 0, 0.21875f, 1, 0, 0.21875f, 0.375f, 0, 0, 0, 0, 0, -1.21875f, -0.75f, 0.21875f, 1, -0.75f, 0.21875f, 0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-23.46875f, 9.1875f, -8.3125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0.375f, 0, 0, 1, 0, 0.21875f, -1.21875f, 0, 0.21875f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 1, -0.75f, 0.21875f, -1.21875f, -0.75f, 0.21875f)
			.setRotationPoint(-23.46875f, 9.1875f, 2.3125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.09375f, 0, 0, -0.1875f, 0, -0.1875f, 0.09375f, 0.01f, -0.1875f, 0, -0.75f, 0, 0.09375f, -0.75f, 0, -0.1875f, -0.75f, -0.1875f, 0.09375f, -0.74f, -0.1875f)
			.setRotationPoint(-20.46875f, 9.1875f, -8.53125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.09375f, 0.01f, -0.1875f, -0.1875f, 0, -0.1875f, 0.09375f, 0, 0, 0, 0, 0, 0.09375f, -0.74f, -0.1875f, -0.1875f, -0.75f, -0.1875f, 0.09375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20.46875f, 9.1875f, 7.53125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.40625f, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, -0.5f, 0.40625f, 0, -0.5f, 0.46875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0.46875f, -0.75f, -0.5f)
			.setRotationPoint(-21.625f, 8.9375f, -1.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.40625f, 0, -0.5f, 0, 0.3125f, -0.5f, 0, 0.3125f, 0, 0.40625f, 0, 0, 0.46875f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0.46875f, -0.75f, 0)
			.setRotationPoint(-21.625f, 8.9375f, 0.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -1, 0, -0.1875f, -0.40625f, 0.3125f, -0.1875f, 0, 0.3125f, -0.1875f, 0, 0.3125f, -0.1875f, -0.40625f, 0.3125f, -0.1875f)
			.setRotationPoint(-13.5f, 4.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0.4375f, 0, -0.1875f, 0, 0.25f, 0.9375f, 0, 0.25f, 0.9375f, 0.4375f, 0, -0.1875f, 0.4375f, 0.3125f, -0.1875f, 0, 0, 0.9375f, 0, 0, 0.9375f, 0.4375f, 0.3125f, -0.1875f)
			.setRotationPoint(-12.0625f, 4.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0.40625f, -3.75f, -0.0625f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0.40625f, -3.75f, -0.0625f, 0.59375f, 1.9375f, -0.0625f, -0.59375f, 0.3125f, -0.1875f, -0.59375f, 0.3125f, -0.1875f, 0.59375f, 1.9375f, -0.0625f)
			.setRotationPoint(-21.5f, 4.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamed")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.28125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.28125f, 0, 0, -0.28125f, -0.5f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.28125f, -0.5f, 0)
			.setRotationPoint(-17.125f, 6.46875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.125f, 0, -0.28125f, 0, 0, -0.28125f, 0, 0, 0, -0.125f, 0, 0, -0.625f, 0, -0.28125f, -0.5f, 0, -0.28125f, -0.5f, 0, 0, -0.625f, 0)
			.setRotationPoint(-17.5625f, 6.46875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 70, textureX, textureY)
			.addShapeBox(-1, -3, -3, 2, 2, 3, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 2, -0.125f, 0.125f, 2, -0.125f, 0.125f, 2, -0.125f, 0, 2, -0.125f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 69, textureX, textureY)
			.addShapeBox(-3, -1, -3, 2, 2, 3, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 69, textureX, textureY)
			.addShapeBox(-1, 1, -3, 2, 2, 3, 0, 2, -0.125f, 0.125f, 2, -0.125f, 0.125f, 2, -0.125f, 0, 2, -0.125f, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 29, textureX, textureY)
			.addShapeBox(-2.875f, -1, -3.13f, 12, 2, 0, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 29, textureX, textureY)
			.addShapeBox(-2.875f, -1, -3.13f, 12, 2, 0, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1975f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 81, textureX, textureY)
			.addShapeBox(-1, -2.875f, -3.13f, 2, 12, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 81, textureX, textureY)
			.addShapeBox(-1, -2.875f, -3.13f, 2, 12, 0, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1975f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 78, textureX, textureY)
			.addShapeBox(-1, -1, -2, 2, 2, 2, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 69, textureX, textureY)
			.addShapeBox(1.125f, -1, -3, 2, 2, 3, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 78, textureX, textureY)
			.addShapeBox(-1, -1, -2.875f, 4, 4, 0, 0, 0.125f, 0.125f, 0, -1.875f, 0.125f, 0, -1.875f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, -1.875f, 0, -1.875f, -1.875f, 0, -1.875f, -1.875f, 0, 0.125f, -1.875f, 0)
			.setRotationPoint(-13.1875f, 7, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 69, textureX, textureY)
			.addShapeBox(-1, -3, 0, 2, 2, 3, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 2, -0.125f, 0, 2, -0.125f, 0, 2, -0.125f, 0.125f, 2, -0.125f, 0.125f)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 67, textureX, textureY)
			.addShapeBox(-3, -1, 0, 2, 2, 3, 0, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 66, textureX, textureY)
			.addShapeBox(-1, 1, 0, 2, 2, 3, 0, 2, -0.125f, 0, 2, -0.125f, 0, 2, -0.125f, 0.125f, 2, -0.125f, 0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 66, textureX, textureY)
			.addShapeBox(1, -1, 0, 2, 2, 3, 0, -0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 77, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 2, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 1, 0.6875f, 0, -1.375f, 0.6875f, 0, 0, 0, 0, -0.375f, 0, 0, 1, -1.375f, 0, -1.375f, -1.375f, 0, 0, -0.6875f, 0, -0.375f, -0.6875f, 0)
			.setRotationPoint(-14.4375f, 7.125f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -1.375f, 0.3125f, 0, 1, 0.3125f, 0, -0.375f, 0, 0, 0, 0, 0, -1.375f, -1, 0, 1, -1, 0, -0.375f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-12.8125f, 6.6875f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.4375f, 0.6875f, 0, -0.9375f, 0.6875f, 0, 0, 0, 0, -0.5f, 0, 0, 0.4375f, -1.375f, 0, -0.9375f, -1.375f, 0, 0, -0.6875f, 0, -0.5f, -0.6875f, 0)
			.setRotationPoint(-14.625f, 6, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -2.375f, 0.375f, 0, 2.0625f, 0.375f, 0, -0.3125f, 0, 0, 0, 0, 0, -2.375f, -1, 0, 2.0625f, -1, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-12.875f, 5.625f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.3125f, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.375f, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, -0.6875f, -0.8125f, 0, -0.375f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-13.4375f, 6.625f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.1875f, -0.8125f, 0, 0.1875f, -0.8125f, 0, 0.1875f, 0, -0.3125f, 0.1875f, 0)
			.setRotationPoint(-13.875f, 6.4375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, 0, 0, 0, 0, 0, -1.375f, 0.6875f, 0, 1, 0.6875f, 0, -0.375f, -0.6875f, 0, 0, -0.6875f, 0, -1.375f, -1.375f, 0, 1, -1.375f, 0)
			.setRotationPoint(-14.4375f, 7.125f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.375f, 0, 0, 1, 0.3125f, 0, -1.375f, 0.3125f, 0, 0, -0.6875f, 0, -0.375f, -0.6875f, 0, 1, -1, 0, -1.375f, -1, 0)
			.setRotationPoint(-12.8125f, 6.6875f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0, 0, 0, 0, -0.9375f, 0.6875f, 0, 0.4375f, 0.6875f, 0, -0.5f, -0.6875f, 0, 0, -0.6875f, 0, -0.9375f, -1.375f, 0, 0.4375f, -1.375f, 0)
			.setRotationPoint(-14.625f, 6, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.3125f, 0, 0, 2.0625f, 0.375f, 0, -2.375f, 0.375f, 0, 0, -0.625f, 0, -0.3125f, -0.625f, 0, 2.0625f, -1, 0, -2.375f, -1, 0)
			.setRotationPoint(-12.875f, 5.625f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.375f, 0, 0, -0.6875f, 0.1875f, 0, 0.3125f, 0.1875f, 0, 0, -0.625f, 0, -0.375f, -0.625f, 0, -0.6875f, -0.8125f, 0, 0.3125f, -0.8125f, 0)
			.setRotationPoint(-13.4375f, 6.625f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0.1875f, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.8125f, -0.3125f, 0.1875f, -0.8125f)
			.setRotationPoint(-13.875f, 6.4375f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 24, textureX, textureY)
			.addShapeBox(-2.875f, -1, 3.13f, 12, 2, 0, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 23, textureX, textureY)
			.addShapeBox(-2.875f, -1, 3.13f, 12, 2, 0, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0)
			.setRotationPoint(-13.1875f, 7, 5.1975f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 80, textureX, textureY)
			.addShapeBox(-1, -2.875f, 3.13f, 2, 12, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 79, textureX, textureY)
			.addShapeBox(-1, -2.875f, 3.13f, 2, 12, 0, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0)
			.setRotationPoint(-13.1875f, 7, 5.1975f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 78, textureX, textureY)
			.addShapeBox(-1, -1, 2.875f, 4, 4, 0, 0, 0.125f, 0.125f, 0, -1.875f, 0.125f, 0, -1.875f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, -1.875f, 0, -1.875f, -1.875f, 0, -1.875f, -1.875f, 0, 0.125f, -1.875f, 0)
			.setRotationPoint(-13.1875f, 7, 5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.15625f, 0, 0.1875f, 0.1875f, 0.375f, -1.59375f, 0.125f, 0.375f, 2, 0.09375f, 0.375f, -0.0625f, 0, 0, 0.21875f, 0, 0.375f, -1.5625f, 0, 0.375f, 1.96875f, 0.0625f, 0.375f)
			.setRotationPoint(-5.84375f, 6.6875f, -4).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -1.53125f, 0, -0.28125f, 1.125f, 0, -0.1875f, 0.1875f, 0, 0, 0, -0.03125f, 0.375f, -1.5625f, 0.125f, -0.28125f, 1.15625f, 0.09375f, -0.1875f, 0.21875f, 0.125f, 0, -0.0625f, 0.1875f, 0.375f)
			.setRotationPoint(-5.84375f, 6.5f, -6.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 3, 0, -0.34375f, 0.01f, 0.25f, 0, 0.01f, 0.25f, 0, 0.01f, 0, -0.34375f, 0.01f, 0, -0.34375f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.34375f, 0, 0)
			.setRotationPoint(-4.1875f, 3.9375f, -4.84375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 3, 0, -0.34375f, 0.01f, 0, 0, 0.01f, 0, 0, 0.01f, 0.25f, -0.34375f, 0.01f, 0.25f, -0.34375f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.34375f, 0, 0.25f)
			.setRotationPoint(-4.1875f, 3.9375f, 1.84375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 0, 0, -0.28125f, -0.65625f, 0, 0, -0.65625f, 0, 0, -0.65625f, 0, -0.28125f, -0.65625f, 0, -0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.28125f, 0, 0)
			.setRotationPoint(-4.1875f, 3.40625f, -5.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 3, 0, -0.28125f, 0, 0, 0, 0, 0, -1, 0, 0, 0.71875f, 0, 0, -0.28125f, 0, 0, 0, 0, 0, -1, 0, 0, 0.71875f, 0, 0)
			.setRotationPoint(-4.1875f, 6.15625f, -5.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 0, 0, -0.28125f, -0.65625f, 0, 0, -0.65625f, 0, 0, -0.65625f, 0, -0.28125f, -0.65625f, 0, -0.28125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.28125f, 0, 0)
			.setRotationPoint(-4.1875f, 3.40625f, 5.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 0, 3, 0, 0.71875f, 0, 0, -1, 0, 0, 0, 0, 0, -0.28125f, 0, 0, 0.71875f, 0, 0, -1, 0, 0, 0, 0, 0, -0.28125f, 0, 0)
			.setRotationPoint(-4.1875f, 6.15625f, 2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 2, 0.09375f, 0.375f, -1.59375f, 0.125f, 0.375f, 0.1875f, 0.1875f, 0.375f, 0, 0.15625f, 0, 1.96875f, 0.0625f, 0.375f, -1.5625f, 0, 0.375f, 0.21875f, 0, 0.375f, -0.0625f, 0, 0)
			.setRotationPoint(-5.84375f, 6.6875f, 3).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.03125f, 0.375f, 0.1875f, 0, 0, 1.125f, 0, -0.1875f, -1.53125f, 0, -0.28125f, -0.0625f, 0.1875f, 0.375f, 0.21875f, 0.125f, 0, 1.15625f, 0.09375f, -0.1875f, -1.5625f, 0.125f, -0.28125f)
			.setRotationPoint(-5.84375f, 6.5f, 4.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.53125f, 0, 0, -0.53125f, 0, 0, -0.53125f, -0.65625f, -0.4375f, -0.53125f, -0.65625f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.65625f, -0.4375f, 0, -0.65625f)
			.setRotationPoint(-5.09375f, 2.96875f, -2.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.75f, -0.28125f, 0, -0.75f, -0.28125f, 0, -0.75f, 0, -0.4375f, -0.75f, 0, -0.4375f, 0, -0.28125f, 0, 0, -0.28125f, 0, 0, 0, -0.4375f, 0, 0)
			.setRotationPoint(-5.09375f, 2.75f, -4.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.375f, -0.125f, 0, -0.375f, -0.0625f, 0, -0.375f, 0.28125f, -0.25f, -0.375f, 0.28125f, -0.25f, 0, -0.125f, 0, 0, -0.0625f, 0, 0, 0.28125f, -0.25f, 0, 0.28125f)
			.setRotationPoint(-4.90625f, 2.75f, -5.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.53125f, -0.65625f, 0, -0.53125f, -0.65625f, 0, -0.53125f, 0, -0.4375f, -0.53125f, 0, -0.4375f, 0, -0.65625f, 0, 0, -0.65625f, 0, 0, 0, -0.4375f, 0, 0)
			.setRotationPoint(-5.09375f, 2.96875f, 1.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.28125f, -0.4375f, -0.75f, -0.28125f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.28125f, -0.4375f, 0, -0.28125f)
			.setRotationPoint(-5.09375f, 2.75f, 2.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.375f, 0.28125f, 0, -0.375f, 0.28125f, 0, -0.375f, -0.0625f, -0.25f, -0.375f, -0.125f, -0.25f, 0, 0.28125f, 0, 0, 0.28125f, 0, 0, -0.0625f, -0.25f, 0, -0.125f)
			.setRotationPoint(-4.90625f, 2.75f, 4.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 3, 0, -0.1875f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, -0.4375f, 0.0625f, 0, -0.4375f, 0.0625f, 0, -0.4375f, 0.0625f, -0.1875f, -0.4375f, 0.0625f)
			.setRotationPoint(-7.6875f, 7.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 14, 0, 0.4375f, -0.625f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0.4375f, -0.625f, -0.0625f, 0.4375f, 0.125f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0.4375f, 0.125f, -0.0625f)
			.setRotationPoint(-3.28125f, 7.96875f, -7).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, -0.21875f, -0.0625f, -0.0625f, 0, 0, -0.03125f, 0, 0, 0.53125f, -0.21875f, -0.0625f, 0.5f, -0.21875f, -0.4375f, -0.0625f, 0, -0.5f, -0.03125f, 0, -0.5f, 0.53125f, -0.21875f, -0.4375f, 0.5f)
			.setRotationPoint(15.5f, 7.90625f, -4.78125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0.0625f, -0.0625f, -2.8125f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0.0625f, -0.0625f, -2.8125f, 0.0625f, -0.4375f, -2.8125f, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0.0625f, -0.4375f, -2.8125f)
			.setRotationPoint(-5.71875f, 8.59375f, -7).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, -0.40625f, -0.0625f, -2.0625f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.40625f, -0.0625f, -2.0625f, -0.40625f, -0.4375f, -2.0625f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, -0.40625f, -0.4375f, -2.0625f)
			.setRotationPoint(-8.78125f, 8.65625f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 26, textureX, textureY)
			.addShapeBox(-2.875f, -1, -3.13f, 12, 2, 0, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(19.125f, 7, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 26, textureX, textureY)
			.addShapeBox(-2.875f, -1, -3.13f, 12, 2, 0, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0)
			.setRotationPoint(19.125f, 7, -5.4475f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 81, textureX, textureY)
			.addShapeBox(-1, -2.875f, -3.13f, 2, 12, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0)
			.setRotationPoint(19.125f, 7, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 80, textureX, textureY)
			.addShapeBox(-1, -2.875f, -3.13f, 2, 12, 0, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0)
			.setRotationPoint(19.125f, 7, -5.4475f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 66, textureX, textureY)
			.addShapeBox(-1, -3, 0, 2, 2, 3, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 2, -0.125f, 0.125f, 2, -0.125f, 0.125f, 2, -0.125f, 0, 2, -0.125f, 0)
			.setRotationPoint(19.125f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 65, textureX, textureY)
			.addShapeBox(-3, -1, 0, 2, 2, 3, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(19.125f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 64, textureX, textureY)
			.addShapeBox(-1, 1, 0, 2, 2, 3, 0, 2, -0.125f, 0.125f, 2, -0.125f, 0.125f, 2, -0.125f, 0, 2, -0.125f, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(19.125f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 64, textureX, textureY)
			.addShapeBox(1.125f, -1, 0, 2, 2, 3, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(19.125f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 77, textureX, textureY)
			.addShapeBox(-1, -1, -1.5f, 4, 4, 0, 0, 0.125f, 0.125f, 0, -1.875f, 0.125f, 0, -1.875f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, -1.875f, 0, -1.875f, -1.875f, 0, -1.875f, -1.875f, 0, 0.125f, -1.875f, 0)
			.setRotationPoint(19.125f, 7, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 77, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 2, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0)
			.setRotationPoint(19.125f, 7, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, -1.96875f, -2.5f, 0, 0, -0.75f, 0, 0, 0, 0, -1.96875f, 1.75f, 0, 1.96875f, -2.5f, 0, 0, -0.75f, 0, 0, 0, 0, 1.96875f, 1.75f)
			.setRotationPoint(14.46875f, 5.90625f, -4.84375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, -1.96875f, 1.75f, 0, 0, 0, 0, 0, -0.75f, 0, -1.96875f, -2.5f, 0, 1.96875f, 1.75f, 0, 0, 0, 0, 0, -0.75f, 0, 1.96875f, -2.5f)
			.setRotationPoint(14.46875f, 5.90625f, 3.84375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.625f, -0.59375f, 0, -1.03125f, -0.59375f, 0, 0, -0.75f, -0.25f, -0.4375f, -0.71875f, -0.25f, 0.625f, -0.15625f, 0, -1.03125f, -0.15625f, 0, 0, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(19.78125f, 5.15625f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -2.15625f, -0.59375f, 0.1875f, 2.09375f, -0.59375f, 0.1875f, -0.09375f, 0, 0, 0, 0, 0, -2.15625f, -0.03125f, 0.1875f, 2.09375f, -0.03125f, 0.1875f, -0.09375f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(16.21875f, 5.375f, -5.25f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.78125f, 0, 0.3125f, 0.4375f, 0, 0.3125f, -0.34375f, 0, 0, 0, 0, 0, -0.78125f, -0.59375f, 0.3125f, 0.4375f, -0.59375f, 0.3125f, -0.34375f, -0.59375f, 0, 0, -0.59375f, 0)
			.setRotationPoint(17.40625f, 6.5625f, -5.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.0625f, 0, -0.125f, -0.0625f, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, -0.125f, -0.0625f, -0.4375f, -0.125f)
			.setRotationPoint(18.3125f, 6.5f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.28125f, 0, 0, 0, 0, 0, 0, 0, -0.5625f, -0.28125f, 0, -0.5625f, -0.28125f, 0.15625f, 0, 0, 0.15625f, 0, 0, 0.15625f, -0.5625f, -0.28125f, 0.15625f, -0.5625f)
			.setRotationPoint(18.46875f, 6.4375f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0.1875f, -0.03125f, 0, 0, 0, 0, 0, 0, 0.5f, 0.1875f, -0.03125f, 0.5f, 0.1875f, -0.46875f, 0, 0, -0.34375f, 0, 0, -0.34375f, 0.5f, 0.1875f, -0.46875f, 0.5f)
			.setRotationPoint(18.6875f, 7.875f, -4.75f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, -0.125f, 0, 0, 0, 0.34375f, 0, 0, 0.34375f, 0.5f, -0.125f, 0, 0.5f, -0.125f, -0.34375f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.125f, -0.34375f, 0.5f)
			.setRotationPoint(19.5625f, 7.875f, -4.75f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0.3125f, 0.15625f, 0, 0, 0.34375f, 0, 0, 0.34375f, 0.5f, 0.3125f, 0.15625f, 0.5f, 0.3125f, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0.5f, 0.3125f, -0.0625f, 0.5f)
			.setRotationPoint(20.875f, 7.6875f, -4.75f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.4375f, -0.71875f, -0.25f, 0, -0.75f, -0.25f, -1.03125f, -0.59375f, 0, 0.625f, -0.59375f, 0, -0.4375f, 0, -0.25f, 0, 0, -0.25f, -1.03125f, -0.15625f, 0, 0.625f, -0.15625f, 0)
			.setRotationPoint(19.78125f, 5.15625f, 0.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 63, textureX, textureY)
			.addShapeBox(-1, -3, 0, 2, 2, 3, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 2, -0.125f, 0, 2, -0.125f, 0, 2, -0.125f, 0.125f, 2, -0.125f, 0.125f)
			.setRotationPoint(19.125f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 63, textureX, textureY)
			.addShapeBox(-1, 1.125f, 0, 2, 2, 3, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0.125f, 2, 0, 0.125f, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0, 0.125f, -0.125f, 0.125f, 0.125f, -0.125f, 0.125f)
			.setRotationPoint(19.125f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 23, textureX, textureY)
			.addShapeBox(-2.875f, -1, 3.13f, 12, 2, 0, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -6.25f, 0.125f, 0, -6.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(19.125f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 16, textureX, textureY)
			.addShapeBox(-2.875f, -1, 3.13f, 12, 2, 0, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, -6.3125f, 0.25f, 0, -6.3125f, 0.25f, 0, -0.0625f, 0.25f, 0)
			.setRotationPoint(19.125f, 7, 5.4475f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 79, textureX, textureY)
			.addShapeBox(-1, -2.875f, 3.13f, 2, 12, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0, 0.125f, -6.25f, 0)
			.setRotationPoint(19.125f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 79, textureX, textureY)
			.addShapeBox(-1, -2.875f, 3.13f, 2, 12, 0, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0, 0.25f, -6.3125f, 0)
			.setRotationPoint(19.125f, 7, 5.4475f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 63, textureX, textureY)
			.addShapeBox(-3, -1, 0, 2, 2, 3, 0, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(19.125f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.09375f, 0, 0, 2.09375f, -0.59375f, 0.1875f, -2.15625f, -0.59375f, 0.1875f, 0, -0.625f, 0, -0.09375f, -0.625f, 0, 2.09375f, -0.03125f, 0.1875f, -2.15625f, -0.03125f, 0.1875f)
			.setRotationPoint(16.21875f, 5.375f, 2.25f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.34375f, 0, 0, 0.4375f, 0, 0.3125f, -0.78125f, 0, 0.3125f, 0, -0.59375f, 0, -0.34375f, -0.59375f, 0, 0.4375f, -0.59375f, 0.3125f, -0.78125f, -0.59375f, 0.3125f)
			.setRotationPoint(17.40625f, 6.5625f, 2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 60, textureX, textureY)
			.addShapeBox(1.125f, -1, 0, 2, 2, 3, 0, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(19.125f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 63, textureX, textureY)
			.addShapeBox(-1, -1, 0, 2, 2, 2, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0)
			.setRotationPoint(19.125f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 76, textureX, textureY)
			.addShapeBox(-1, -1, 0.875f, 4, 4, 0, 0, 0.125f, 0.125f, 0, -1.875f, 0.125f, 0, -1.875f, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, -1.875f, 0, -1.875f, -1.875f, 0, -1.875f, -1.875f, 0, 0.125f, -1.875f, 0)
			.setRotationPoint(19.125f, 7, 7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.28125f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, -0.28125f, 0, 0, -0.28125f, 0.15625f, -0.5625f, 0, 0.15625f, -0.5625f, 0, 0.15625f, 0, -0.28125f, 0.15625f, 0)
			.setRotationPoint(18.46875f, 6.4375f, 4.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, -0.03125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.03125f, 0, 0, -0.03125f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.03125f, -0.6875f, 0)
			.setRotationPoint(19.4375f, 1.65625f, 3.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.65625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.65625f, 0, 0, -0.65625f, -0.53125f, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.65625f, -0.53125f, 0)
			.setRotationPoint(21.78125f, 2.5f, 3.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 0, 0, 0.09375f, 0, 0, 1.03125f, 0, 0, 1.03125f, 0, 0, 0.09375f, 0, 0, 0.09375f, -0.59375f, 0, 0, -0.59375f, 0, 0, -0.59375f, 0, 0.09375f, -0.59375f, 0)
			.setRotationPoint(19.5625f, 4.6875f, 2.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, -1.28125f, 0.84375f, 0, -1.28125f, 0.84375f, 0, -1.28125f, -0.84375f, 0.3125f, -1.28125f, -0.84375f)
			.setRotationPoint(19.78125f, 3.96875f, 3.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0.25f, -0.34375f, -0.34375f, 0.25f, -0.34375f, -0.34375f, 0.25f, -0.34375f, -0.34375f, 0.25f, -0.34375f)
			.setRotationPoint(18.75f, 2.8125f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.4375f, 0, -0.34375f, -0.34375f, -0.5625f, -0.34375f, -0.34375f, -0.5625f, -0.34375f, -0.34375f, -0.5625f, -0.34375f, -0.34375f, -0.5625f, -0.34375f)
			.setRotationPoint(18.75f, 2.375f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.4375f, -0.34375f, -0.34375f, -0.4375f, -0.34375f, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f)
			.setRotationPoint(18.84375f, 1.71875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15625f, -0.3125f, -0.34375f, -0.28125f, -0.5f, -0.34375f, -0.28125f, -0.5f, -0.34375f, -0.15625f, -0.3125f, -0.34375f, -0.15625f, -0.46875f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.15625f, -0.46875f, -0.34375f)
			.setRotationPoint(19.34375f, 1.84375f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 7, 0, 0.0625f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.0625f, 0, 0.0625f)
			.setRotationPoint(20.09375f, 2.46875f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 7, 0, -0.625f, 0.125f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.625f, 0.125f, 0.0625f, -0.625f, -0.125f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.625f, -0.125f, 0.0625f)
			.setRotationPoint(19.03125f, 2.46875f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 7, 0, 0.0625f, 0, 0.0625f, 0, 0.625f, 0.0625f, 0, 0.625f, 0.0625f, 0.0625f, 0, 0.0625f, 0.0625f, 0, 0.0625f, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f, 0.0625f, 0, 0.0625f)
			.setRotationPoint(21.15625f, 2.46875f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 0, 0, -0.03125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.03125f, 0, 0, -0.03125f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.03125f, -0.6875f, 0)
			.setRotationPoint(19.4375f, 1.65625f, -3.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 0, 0, -0.65625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.65625f, 0, 0, -0.65625f, -0.53125f, 0, 0, -0.53125f, 0, 0, -0.53125f, 0, -0.65625f, -0.53125f, 0)
			.setRotationPoint(21.78125f, 2.5f, -3.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, -1.28125f, -0.84375f, 0, -1.28125f, -0.84375f, 0, -1.28125f, 0.84375f, 0.3125f, -1.28125f, 0.84375f)
			.setRotationPoint(19.78125f, 3.96875f, -3.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 0, 0, 0.09375f, 0, 0, 1.03125f, 0, 0, 1.03125f, 0, 0, 0.09375f, 0, 0, 0.09375f, -0.59375f, 0, 0, -0.59375f, 0, 0, -0.59375f, 0, 0.09375f, -0.59375f, 0)
			.setRotationPoint(19.5625f, 4.6875f, -2.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(18.375f, 5.65625f, -0.6875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 72, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 3, 1, 1, 0, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f)
			.setRotationPoint(17.8125f, 5.4375f, -0.6875f).setRotationAngle(45, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 72, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 3, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(17.8125f, 5.21875f, 0).setRotationAngle(45, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 48, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 3, 1, 1, 0, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f)
			.setRotationPoint(17.8125f, 5.4375f, 0.6875f).setRotationAngle(45, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0.03125f, -0.25f, -0.5f, 0.03125f, -0.25f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.1875f, 0.03125f, -0.25f, -0.1875f, 0.03125f)
			.setRotationPoint(21.03125f, 5.21875f, -2.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.5f, 0.03125f, 0, -0.5f, 0.03125f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, 0.03125f, 0, -0.1875f, 0.03125f, 0, -0.6875f, 0, -0.25f, -0.6875f, 0)
			.setRotationPoint(21.03125f, 5.21875f, 0.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 5, 0, -0.75f, 0, -0.15625f, 0, 0, -0.15625f, 0, 0, -0.15625f, -0.75f, 0, -0.15625f, -0.75f, 0, -0.15625f, 0, 0, -0.15625f, 0, 0, -0.15625f, -0.75f, 0, -0.15625f)
			.setRotationPoint(17.4375f, 3.25f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(17.4375f, 2.5f, -2.34375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(17.4375f, 2.5f, 1.34375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.40625f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.40625f, 0, -0.75f, 0.0625f, -0.65625f, 0, 0, -0.65625f, 0, 0, -0.65625f, -0.75f, 0.0625f, -0.65625f, -0.75f)
			.setRotationPoint(-6.625f, 3.6875f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.0625f, 0, -0.75f, 1.03125f, -0.15625f, 0, -0.90625f, -0.15625f, 0, -0.90625f, -0.15625f, -0.75f, 1.03125f, -0.15625f, -0.75f)
			.setRotationPoint(-5.1875f, 2.84375f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.3125f, 0, -0.75f, 0.0625f, -0.65625f, 0, -0.34375f, -0.65625f, 0, -0.34375f, -0.65625f, -0.75f, 0.0625f, -0.65625f, -0.75f)
			.setRotationPoint(-5.1875f, 2.5f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0.15625f, 0, 0, 0.15625f, 0, 0, -0.59375f, -1, 0, -0.59375f, -0.5625f, -0.59375f, 0, 0, -0.59375f, 0, 0, -0.59375f, -0.75f, -0.5625f, -0.59375f, -0.75f)
			.setRotationPoint(-5.4375f, 2.09375f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.65625f, 0, 0, -0.65625f, 0, 0, -0.65625f, -0.75f, 0, -0.65625f, -0.75f)
			.setRotationPoint(-4.4375f, 2.15625f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.28125f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.71875f, -0.03125f, -0.75f, -0.71875f, -0.09375f, 0.28125f, 0, -0.5f, 0, 0.09375f, -0.5f, 0, 0.09375f, -0.03125f, -0.75f, 0.09375f, -0.09375f)
			.setRotationPoint(-2.78125f, 1.53125f, 1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0.09375f, -0.5f, 0, -1, -0.5f, 0, -1, -0.03125f, 0, 0, -0.03125f, 0, -0.625f, -0.5f, -1.875f, 0, -0.5f, -1.875f, 0, -0.03125f, 0, -0.625f, -0.03125f)
			.setRotationPoint(-1.78125f, 2.25f, 1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.03125f, 0, -1, -0.03125f, 0, -1, -0.5f, 0, 0.09375f, -0.5f, 0, -0.625f, -0.03125f, -1.875f, 0, -0.03125f, -1.875f, 0, -0.5f, 0, -0.625f, -0.5f)
			.setRotationPoint(-1.78125f, 2.25f, -2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, -0.3125f, -0.09375f, 0, -0.3125f, -0.09375f, 0, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.78125f, 0, -0.09375f, 1.3125f, 0, -0.09375f, 1.3125f, 0, 0, 0.78125f, 0, 0)
			.setRotationPoint(0.71875f, 2.9375f, -2.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.25f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.09375f, 0.25f, -0.3125f, -0.09375f, 0.78125f, 0, 0, 1.3125f, 0, 0, 1.3125f, 0, -0.09375f, 0.78125f, 0, -0.09375f)
			.setRotationPoint(0.71875f, 2.9375f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0.125f, 0.40625f, -0.5625f, 0.125f, 0.40625f, -0.5625f, 0.125f, 0, -0.625f, 0.125f, 0, 0, 0.125f, 0.40625f, 0.0625f, 0.125f, 0.40625f, 0.0625f, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-4.4375f, 1.46875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, 0, 0.78125f, -0.625f, 0, 0.40625f, -0.5625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, 0, 0.78125f, 0.09375f, 0, 0.40625f, 0.0625f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-4.4375f, 1.46875f, -1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.6875f, 0, 1.03125f, -0.6875f, 0, 0.15625f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.75f, 0.0625f, 0, 1.03125f, 0.15625f, 0, 0.15625f, 0.09375f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-3.8125f, 1.46875f, -1.625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, -0.5f, 0.40625f, -0.5625f, -0.5f, 0.78125f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, -0.5f, 0.40625f, 0.0625f, -0.5f, 0.78125f, 0.09375f, 0, -0.625f, 0, 0)
			.setRotationPoint(-4.4375f, 1.46875f, 0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, -0.5f, 0.15625f, -0.625f, -0.5f, 1.03125f, -0.6875f, 0, -0.75f, -0.6875f, 0, 0, 0, -0.5f, 0.15625f, 0.09375f, -0.5f, 1.03125f, 0.15625f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(-3.8125f, 1.46875f, 0.625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.71875f, -0.09375f, 0, -0.71875f, -0.03125f, 0, -0.625f, -0.5f, 0.28125f, -0.625f, -0.5f, -0.75f, 0.09375f, -0.09375f, 0, 0.09375f, -0.03125f, 0, 0.09375f, -0.5f, 0.28125f, 0, -0.5f)
			.setRotationPoint(-2.78125f, 1.53125f, -2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.21875f, -0.65625f, -0.25f, 0.53125f, -0.65625f, -0.25f, 0.53125f, -0.65625f, -0.25f, -0.21875f, -0.65625f, -0.25f, 0, 0, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(3.03125f, -0.3125f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0, 0.3125f, -0.625f, -0.03125f, 0.3125f, -0.625f, 0.53125f, 0, -0.625f, 0.5625f, 0, 0, 0, 0.3125f, 0, -0.03125f, 0.3125f, 0, 0.53125f, 0, 0, 0.5625f)
			.setRotationPoint(3.25f, -0.65625f, -0.78125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f)
			.setRotationPoint(3.015625f, 0.6875f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f)
			.setRotationPoint(3.578125f, 0.6875f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, -0.53125f, 0, 0, -0.53125f, 0, 0, -0.53125f, -0.5f, 0, -0.53125f, -0.5f, 0.40625f, 0.197f, 0, 0.40625f, 0.197f, 0, 0.40625f, 0.197f, -0.5f, 0.40625f, 0.197f)
			.setRotationPoint(2.03125f, 0.6875f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.125f, 0, -0.59375f, 0, -0.40625f, -0.625f, 0, -0.40625f, -0.625f, 0.125f, 0, -0.59375f, 0.125f, 0.09375f, 0.0625f, 0, 0.21875f, 0, 0, 0.21875f, 0, 0.125f, 0.09375f, 0.0625f)
			.setRotationPoint(6.9375f, 0.6875f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 3, 0, 0.46875f, -0.1875f, -1.125f, 0, -2.59375f, -1.21875f, 0, -2.59375f, -1.21875f, 0.46875f, -0.1875f, -1.125f, 0.46875f, 0, -0.5f, 0, 0.59375f, -1.21875f, 0, 0.59375f, -1.21875f, 0.46875f, 0, -0.5f)
			.setRotationPoint(9.40625f, 0.90625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0.4375f, 0, -0.3125f, 0, 0.0625f, -0.3125f, 0, 0.0625f, -0.3125f, 0.4375f, 0, -0.3125f, 0.4375f, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0, 0.3125f, -0.3125f, 0.4375f, 0.3125f, -0.3125f)
			.setRotationPoint(7.25f, 0.6875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0.21875f, 0.0625f, -0.3125f, 0, -2.21875f, -0.34375f, 0, -2.21875f, -0.34375f, 0.21875f, 0.0625f, -0.3125f, 0.21875f, 0.3125f, -0.3125f, 0, 1.3125f, -0.34375f, 0, 1.3125f, -0.34375f, 0.21875f, 0.3125f, -0.3125f)
			.setRotationPoint(12.46875f, 0.6875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, -0.25f, 0, -0.53125f, 0.03125f, 0, -0.59375f, 0.03125f, 0, -0.59375f, -0.25f, 0, -0.53125f, -0.25f, 0.03125f, 0.52f, 0.03125f, 0.09375f, 0.0625f, 0.03125f, 0.09375f, 0.0625f, -0.25f, 0.03125f, 0.52f)
			.setRotationPoint(2.78125f, 0.6875f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.03125f, -0.78125f, 0.03125f, 0.03125f, 0.02f, 0.03125f, 0.03125f, 0.02f, 0, 0.03125f, -0.78125f, 0, 0, 0.0625f, 0.03125f, 0, 0.02f, 0.03125f, 0, 0.02f, 0, 0, 0.0625f)
			.setRotationPoint(2, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, -0.25f, 0.03125f, 0.02f, 0.03125f, -0.03125f, -0.4375f, 0.03125f, -0.03125f, -0.4375f, -0.25f, 0.03125f, 0.02f, -0.25f, 0, 0.02f, 0.03125f, 0, -0.129f, 0.03125f, 0, -0.129f, -0.25f, 0, 0.02f)
			.setRotationPoint(2.78125f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.03125f, -0.4375f, 0.125f, -0.15625f, -0.5f, 0.125f, -0.15625f, -0.5f, 0, -0.03125f, -0.4375f, 0, 0, -0.129f, 0.125f, 0, -0.213f, 0.125f, 0, -0.213f, 0, 0, -0.129f)
			.setRotationPoint(6.8125f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.75f, -0.71875f, 0.09375f, -0.875f, -0.71875f, 0.09375f, -0.875f, -0.71875f, 0, -0.75f, -0.71875f, 0, 0, -0.01f, 0.09375f, 0, -0.09375f, 0.09375f, 0, -0.09375f, 0, 0, -0.01f)
			.setRotationPoint(16.40625f, 2.75f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0.46875f, -0.15625f, -0.5f, 0, -0.75f, -1.21875f, 0, -0.75f, -1.21875f, 0.46875f, -0.15625f, -0.5f, 0.46875f, 0, -0.213f, 0, 0, -0.51f, 0, 0, -0.51f, 0.46875f, 0, -0.213f)
			.setRotationPoint(9.40625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 2, 0, 0.5f, -0.8125f, 0.65625f, 0, -0.8125f, 0, 0, -0.8125f, -0.1875f, 0.5f, -0.8125f, 0.46875f, 0.5f, 0, 0.65625f, 0, 0, 0, 0, 0, -0.1875f, 0.5f, 0, 0.46875f)
			.setRotationPoint(2.5f, 2.9375f, -0.90625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 9, 0, 0.15625f, 0, -1.21875f, 0.3125f, 0, -2.3125f, 0.3125f, 0, -2.3125f, 0.15625f, 0, -1.21875f, 0.15625f, -0.40625f, 0.78125f, 0.3125f, -0.40625f, -1, 0.3125f, -0.40625f, -1, 0.15625f, -0.40625f, 0.78125f)
			.setRotationPoint(2.15625f, 3.9375f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 5, 0, 0.03125f, 0, -0.3125f, 0, 0, -1.1875f, 0, 0, -1.1875f, 0.03125f, 0, -0.3125f, 0.03125f, -0.40625f, 1, 0, -0.40625f, -0.40625f, 0, -0.40625f, -0.40625f, 0.03125f, -0.40625f, 1)
			.setRotationPoint(10.5f, 3.9375f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 5, 0, 0.03125f, 0, 1, 0, 0, -0.40625f, 0, 0, -0.40625f, 0.03125f, 0, 1, 0.03125f, -0.375f, 0.9375f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0.03125f, -0.375f, 0.9375f)
			.setRotationPoint(10.5f, 5.53125f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 9, 0, 0.15625f, 0.03125f, 0.78125f, 0.3125f, 0.03125f, -1, 0.3125f, 0.03125f, -1, 0.15625f, 0.03125f, 0.78125f, 0.15625f, -0.4375f, 0.6875f, 0.3125f, -0.40625f, -1.0625f, 0.3125f, -0.40625f, -1.0625f, 0.15625f, -0.4375f, 0.6875f)
			.setRotationPoint(2.15625f, 5.5625f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 9, 0, 0.15625f, 0.03125f, 0.6875f, 0.3125f, 0, -1.0625f, 0.3125f, 0, -1.0625f, 0.15625f, 0.03125f, 0.6875f, 0.15625f, 0.25f, 0.875f, 0.3125f, 0, -0.90625f, 0.3125f, 0, -0.90625f, 0.15625f, 0.25f, 0.875f)
			.setRotationPoint(2.15625f, 7.15625f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 5, 0, 0.03125f, 0, 0.9375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.03125f, 0, 0.9375f, 0.03125f, 0, 1.09375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0.03125f, 0, 1.09375f)
			.setRotationPoint(10.5f, 7.15625f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -1, 0, -0.15625f, 0, 0, -0.15625f, 0, 0, 0, -0.40625f, 0, 0, -1, -0.40625f, -0.25f, 0, -0.40625f, -0.25f, 0, -0.40625f, 0, -0.40625f, -0.40625f, 0)
			.setRotationPoint(-3.125f, 5.53125f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.40625f, 0, 0, -1, 0.4375f, -0.0625f, 0, 0.4375f, -0.0625f, 0, 0.4375f, 0, -0.40625f, 0.4375f, 0)
			.setRotationPoint(-3.125f, 7.125f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.40625f, 0, 0, 0, 0, 0, 0, 0, -0.15625f, -1, 0, -0.15625f, -0.40625f, -0.40625f, 0, 0, -0.40625f, 0, 0, -0.40625f, -0.25f, -1, -0.40625f, -0.25f)
			.setRotationPoint(-3.125f, 5.53125f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.40625f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -1, 0, -0.25f, -0.40625f, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, -0.0625f, -1, 0.4375f, -0.0625f)
			.setRotationPoint(-3.125f, 7.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, -0.40625f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.40625f, 0, -0.125f, -0.40625f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.125f, -0.40625f, 0.0625f, -0.125f)
			.setRotationPoint(-3.125f, 5.53125f, -2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -1, 0, -2.15625f, 0, 0, -2.15625f, 0, 0, 0, -0.40625f, 0, 0, -1, -0.40625f, -0.15625f, 0, -0.40625f, -0.15625f, 0, -0.40625f, 0, -0.40625f, -0.40625f, 0)
			.setRotationPoint(-3.125f, 3.9375f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.40625f, 0, 0, 0, 0, 0, 0, 0, -2.15625f, -1, 0, -2.15625f, -0.40625f, -0.40625f, 0, 0, -0.40625f, 0, 0, -0.40625f, -0.15625f, -1, -0.40625f, -0.15625f)
			.setRotationPoint(-3.125f, 3.9375f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, -0.0625f, 0.25f, -0.0625f, 0, 0.21875f, -0.0625f, 0, 0.21875f, -0.0625f, -0.0625f, 0.25f, -0.0625f, -0.0625f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.0625f, 0, -0.0625f)
			.setRotationPoint(-3.125f, 4.15625f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0.125f, 0, -2.28125f, 0, 0, -2.28125f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.40625f, -0.28125f, 0, -0.40625f, -0.28125f, 0, -0.40625f, 0, 0.125f, -0.40625f, 0)
			.setRotationPoint(-2, 3.9375f, -5.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -2.28125f, 0.125f, 0, -2.28125f, 0.125f, -0.40625f, 0, 0, -0.40625f, 0, 0, -0.40625f, -0.28125f, 0.125f, -0.40625f, -0.28125f)
			.setRotationPoint(-2, 3.9375f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0.125f, 0, -0.28125f, 0, 0, -0.28125f, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.40625f, -0.375f, 0, -0.40625f, -0.375f, 0, -0.40625f, 0, 0.125f, -0.40625f, 0)
			.setRotationPoint(-2, 5.53125f, -5.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.28125f, 0.125f, 0, -0.28125f, 0.125f, -0.40625f, 0, 0, -0.40625f, 0, 0, -0.40625f, -0.375f, 0.125f, -0.40625f, -0.375f)
			.setRotationPoint(-2, 5.53125f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0.125f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0.4375f, -0.1875f, 0, 0.28125f, -0.1875f, 0, 0.28125f, 0, 0.125f, 0.4375f, 0)
			.setRotationPoint(-2, 7.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0.4375f, 0, 0, 0.28125f, 0, 0, 0.28125f, -0.1875f, 0.125f, 0.4375f, -0.1875f)
			.setRotationPoint(-2, 7.125f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 2.25f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 2.25f, 0, 0.0625f)
			.setRotationPoint(1, 7.5625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, -1.875f, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -1.875f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f)
			.setRotationPoint(1, 5.6875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
		//
	}

}
