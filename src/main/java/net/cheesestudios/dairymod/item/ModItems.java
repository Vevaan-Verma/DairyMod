package net.cheesestudios.dairymod.item;

import net.cheesestudios.dairymod.DairyMod;
import net.cheesestudios.dairymod.block.ModBlocks;
import net.cheesestudios.dairymod.item.custom.CheeseDetectorItem;
import net.cheesestudios.dairymod.item.custom.FuelItem;
import net.cheesestudios.dairymod.item.custom.ModArmorItem;
import net.cheesestudios.dairymod.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DairyMod.MOD_ID);

    // items
    public static final RegistryObject<Item> CONCENTRATED_CHEESE = ITEMS.register("concentrated_cheese",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MILK_SOLIDS = ITEMS.register("milk_solids",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINECONE = ITEMS.register("pinecone",
            () -> new FuelItem(new Item.Properties(), 120));

    // music discs
    // length is in ticks (seconds * 20)
    public static final RegistryObject<Item> AFTER_HOURS_MUSIC_DISC = ITEMS.register("after_hours_music_disc",
            () -> new RecordItem(6, ModSounds.AFTER_HOURS, new Item.Properties().stacksTo(1), 7220));
    public static final RegistryObject<Item> GREEDY_MUSIC_DISC = ITEMS.register("greedy_music_disc",
            () -> new RecordItem(6, ModSounds.GREEDY, new Item.Properties().stacksTo(1), 4280));
    public static final RegistryObject<Item> HOUDINI_EXTENDED_MUSIC_DISC = ITEMS.register("houdini_extended_music_disc",
            () -> new RecordItem(6, ModSounds.HOUDINI_EXTENDED, new Item.Properties().stacksTo(1), 7080));
    public static final RegistryObject<Item> IN_THE_NIGHT_MUSIC_DISC = ITEMS.register("in_the_night_music_disc",
            () -> new RecordItem(6, ModSounds.IN_THE_NIGHT, new Item.Properties().stacksTo(1), 4700));
    public static final RegistryObject<Item> POPULAR_MUSIC_DISC = ITEMS.register("popular_music_disc",
            () -> new RecordItem(6, ModSounds.POPULAR, new Item.Properties().stacksTo(1), 4300));

    // advanced items
    public static final RegistryObject<Item> CHEESE_DETECTOR = ITEMS.register("cheese_detector",
            () -> new CheeseDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> CHEESE_STAFF = ITEMS.register("cheese_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    // tools
    public static final RegistryObject<Item> CHEESE_SWORD = ITEMS.register("cheese_sword",
            () -> new SwordItem(ModToolTiers.CHEESE, 1, 2f, new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_PICKAXE = ITEMS.register("cheese_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHEESE, 0, 0.75f, new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_AXE = ITEMS.register("cheese_axe",
            () -> new AxeItem(ModToolTiers.CHEESE, 2f, 0f, new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_SHOVEL = ITEMS.register("cheese_shovel",
            () -> new ShovelItem(ModToolTiers.CHEESE, 0f, 0f, new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_HOE = ITEMS.register("cheese_hoe",
            () -> new HoeItem(ModToolTiers.CHEESE, -2, 6f, new Item.Properties()));

    // armor
    public static final RegistryObject<Item> CHEESE_HELMET = ITEMS.register("cheese_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CHEESE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_CHESTPLATE = ITEMS.register("cheese_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.CHEESE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_LEGGINGS = ITEMS.register("cheese_leggings",
            () -> new ModArmorItem(ModArmorMaterials.CHEESE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHEESE_BOOTS = ITEMS.register("cheese_boots",
            () -> new ModArmorItem(ModArmorMaterials.CHEESE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // foods
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> ICE_CREAM = ITEMS.register("ice_cream",
            () -> new Item(new Item.Properties().food(ModFoods.ICE_CREAM)));
    public static final RegistryObject<Item> NACHOS = ITEMS.register("nachos",
            () -> new Item(new Item.Properties().food(ModFoods.NACHOS)));

    // snakcs (also foods)
    public static final RegistryObject<Item> CREEPER_SNAKC = ITEMS.register("creeper_snakc",
            () -> new Item(new Item.Properties().food(ModFoods.CREEPER_SNAKC)));
    public static final RegistryObject<Item> ENDERMAN_SNAKC = ITEMS.register("enderman_snakc",
            () -> new Item(new Item.Properties().food(ModFoods.ENDERMAN_SNAKC)));
    public static final RegistryObject<Item> PIGLIN_SNAKC = ITEMS.register("piglin_snakc",
            () -> new Item(new Item.Properties().food(ModFoods.PIGLIN_SNAKC)));
    public static final RegistryObject<Item> SKELETON_SNAKC = ITEMS.register("skeleton_snakc",
            () -> new Item(new Item.Properties().food(ModFoods.SKELETON_SNAKC)));
    public static final RegistryObject<Item> WITHER_SKELETON_SNAKC = ITEMS.register("wither_skeleton_snakc",
            () -> new Item(new Item.Properties().food(ModFoods.WITHER_SKELETON_SNAKC)));

    // crop seeds
    public static final RegistryObject<Item> CHEESE_SEEDS = ITEMS.register("cheese_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CHEESE_CROP.get(), new Item.Properties()));

    // signs
    public static final RegistryObject<Item> CHEESE_SIGN = ITEMS.register("cheese_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CHEESE_SIGN.get(), ModBlocks.CHEESE_WALL_SIGN.get()));
    public static final RegistryObject<Item> CHEESE_HANGING_SIGN = ITEMS.register("cheese_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CHEESE_HANGING_SIGN.get(), ModBlocks.CHEESE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }
}
