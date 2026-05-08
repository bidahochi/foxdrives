package bidahochi.foxdrives;

import bidahochi.foxdrives.common.inventory.enums.InventorySize;
import bidahochi.foxdrives.common.inventory.enums.InventoryStyle;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityTrailer;
import bidahochi.foxdrives.util.ConfigHandler;
import bidahochi.foxdrives.util.ItemTrailer;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TrailerType {

    public static LinkedHashMap<String, TrailerType> REGISTRY = new LinkedHashMap<>();
    public final Class<? extends EntityTrailer> clazz;
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

    public InventorySize inventorySize = InventorySize.STYLE_PROFILE_0x0;

    public InventoryStyle inventoryStyle = InventoryStyle.STYLE_1;

    public String country;
    public String year;
    public boolean isFictional;

    //
    public static TrailerType DRYVAN53FT;
    public static TrailerType FLATBED53FT;
    public static TrailerType FUELTANKER53FT;
    public static TrailerType TANDEMDRYVAN35FT;
    public static TrailerType DRYVAN40FT;
    public static TrailerType DRYVAN28FT;

    public TrailerType(String id, Class<? extends EntityTrailer> trailerClass){
        regname = id;
        clazz = trailerClass;
        item = new ItemTrailer(this, FoxDrives.MODID, FoxDrives.tab);
    }

    public static TrailerType register(String id, Class<? extends EntityTrailer> clazz){
        if (REGISTRY.containsKey(id)) {
            System.out.println("ERROR: CAR with ID '" + id + "' ALREADY exists!");
            FMLCommonHandler.instance().exitJava(1, true);
            return null;
        }
        TrailerType type = new TrailerType(id, clazz);
        REGISTRY.put(id, type);
        return type;
    }

    public TrailerType recipe(ItemStack... stacks){
        recipe = stacks;
        return this;
    }

    public TrailerType rearsteer(boolean bool){
        rear_steer = bool;
        return this;
    }

    public TrailerType riderscale(float scale){
        rider_scale = scale;
        return this;
    }

    public TrailerType passpos(float[]... positions){
        for(float[] pos : positions){
            passenger_pos.add(pos);
        }
        return this;
    }

    public TrailerType acceleration(float val){
        accel = val;
        return this;
    }

    public TrailerType maxspeed(float front, float back){
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

    public static Item getItemByClass(Class<? extends EntityTrailer> carclass){
        for(TrailerType type : REGISTRY.values()){
            if(type.clazz == carclass) return type.item;
        }
        return null;
    }

    public TrailerType riderScale(float scale) {
        rider_scale = scale;
        return this;
    }

    public TrailerType inventorySize(InventorySize size)
    {
        inventorySize = size;
        return this;
    }

    public TrailerType inventoryStyle(InventoryStyle style)
    {
        inventoryStyle = style;
        return this;
    }

    public TrailerType country(String country)
    {
        this.country = country;
        return this;
    }

    public TrailerType year(String year)
    {
        this.year = year;
        return this;
    }
}
