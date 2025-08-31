package bidahochi.foxdrives;

import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.util.ConfigHandler;
import bidahochi.foxdrives.util.ItemCar;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Non-Enum Car Registry
 * replaces the previous EnumCars
 *
 * @author Ferdinand Calo' (FEX___96)
 */
public class CarType {

	public static LinkedHashMap<String, CarType> REGISTRY = new LinkedHashMap<>();
	public final Class<? extends EntityCar> clazz;
	public final String regname;
	private ItemStack[] recipe;
	private Item item;
	//
	public boolean rear_steer;
	/** default is 1, TC default is 0.65 */
	public float rider_scale = 0.65f;
	public List<float[]> passenger_pos = new ArrayList<>();
	/** acceleration speed in meters per tick */
	public float accel = 1;
	/** max forwards movement speed in meters per tick */
	public float max_forward_speed = 10;
	/** max backwards movement speed in meters per tick */
	public float max_backward_speed = 5;
 	//
	public static CarType TOYOTA_PICKUP_1992;
	public static CarType REDMUND_1972;
	public static CarType WORKDAY_1980;
	public static CarType WORKDAY_1980_Utility;
	public static CarType WORKDAY_1980_Utility_Hirail;
	public static CarType CAMPWAGON_1981;
	public static CarType CAMPWAGON_1981_V8;
	public static CarType CRUISEGOER;
	public static CarType GILLIG_PHANTOM;
	public static CarType HYSTER_H80FT;
	public static CarType MKDS_Standard;
	public static CarType WagonKart;
	public static CarType TurboToilet;
	public static CarType FORMULA_CAR;
	public static CarType BYRNE60S_SEDAN;
	public static CarType BYRNE60S_SEDAN_V8;
	public static CarType BYRNE60S_ESTATE;
	public static CarType BYRNE40S_SEDAN;
	public static CarType BYRNE40S_SEDAN_V8;
	public static CarType AWOOGA;

	public CarType(String id, Class<? extends EntityCar> carclass){
		regname = id;
		clazz = carclass;
		item = new ItemCar(this, FoxDrives.MODID, FoxDrives.tab);
	}

	public static CarType register(String id, Class<? extends EntityCar> clazz){
		if(REGISTRY.containsKey(id)){
			System.out.println("ERROR: CAR with ID '" + id + "' ALREADY exists!");
			FMLCommonHandler.instance().exitJava(1, true);
			return null;
		}
		CarType type = new CarType(id, clazz);
		REGISTRY.put(id, type);
		return type;
	}

	public CarType recipe(ItemStack... stacks){
		recipe = stacks;
		return this;
	}

	public CarType rearsteer(boolean bool){
		rear_steer = bool;
		return this;
	}

	public CarType riderscale(float scale){
		rider_scale = scale;
		return this;
	}

	public CarType passpos(float[]... positions){
		for(float[] pos : positions){
			passenger_pos.add(pos);
		}
		return this;
	}

	public CarType acceleration(float val){
		accel = val;
		return this;
	}

	public CarType maxspeed(float front, float back){
		max_forward_speed = front * ConfigHandler.SPEED_MULTIPLIER;
		max_backward_speed = back * ConfigHandler.SPEED_MULTIPLIER;
		return this;
	}

	public Item getItem(){
		return item;
	}

	public ItemStack[] getRecipe(){
		return recipe;
	}

	public static Item getItemByClass(Class<? extends EntityCar> carclass){
		for(CarType type : REGISTRY.values()){
			if(type.clazz == carclass) return type.item;
		}
		return null;
	}

	public CarType riderScale(float scale) {
		rider_scale = scale;
		return this;
	}

}
