package net.shade.shards_of_destiny.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.shards_of_destiny.ShardsOfDestiny;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShardsOfDestiny.MOD_ID);

    //Fire
    public static final RegistryObject<Item> PYROCLASTITE = ITEMS.register("pyroclastite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMBER_SHARD = ITEMS.register("ember_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNO_SHARD = ITEMS.register("inferno_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_SHARD = ITEMS.register("blaze_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORCH_SHARD = ITEMS.register("scorch_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLAMESTRIKE_SHARD = ITEMS.register("flamestrike_shard",
            () -> new Item(new Item.Properties()));

    //Water
    public static final RegistryObject<Item> AQUABRISITE = ITEMS.register("aquabrisite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WAVE_SHARD = ITEMS.register("wave_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIER_SHARD = ITEMS.register("glacier_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSUNAMI_SHARD = ITEMS.register("tsunami_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAFOAM_SHARD = ITEMS.register("aquafoam_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICEBOUND_SHARD = ITEMS.register("icebound_shard",
            () -> new Item(new Item.Properties()));

    //Earth
    public static final RegistryObject<Item> TERRANITE = ITEMS.register("terranite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_SHARD = ITEMS.register("granite_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register("quartz_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAVAFLOW_SHARD = ITEMS.register("lavaflow_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOSSSTONE_SHARD = ITEMS.register("mossstone_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTALINE_SHARD = ITEMS.register("crystaline_shard",
            () -> new Item(new Item.Properties()));

    //Air
    public static final RegistryObject<Item> ZEPHYRION = ITEMS.register("zephyrion",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BREEZE_SHARD = ITEMS.register("breeze_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TYPHOON_SHARD = ITEMS.register("cyclone_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUST_SHARD = ITEMS.register("gust_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TORNADO_SHARD = ITEMS.register("tornado_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHISPER_SHARD = ITEMS.register("whisper_shard",
            () -> new Item(new Item.Properties()));

    //Magma
    public static final RegistryObject<Item> VULCANIUM = ITEMS.register("vulcanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLTEN_SHARD = ITEMS.register("molten_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROCLASM_SHARD = ITEMS.register("pyroclasm_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAVALINK_SHARD = ITEMS.register("lavalink_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMBERFLOW_SHARD = ITEMS.register("emberflow_shard",
            () -> new Item(new Item.Properties()));

    //Ice
    public static final RegistryObject<Item> CRYOQUARTZ = ITEMS.register("cryoquartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROST_SHARD = ITEMS.register("frost_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIAL_SHARD = ITEMS.register("glacial_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERMAFROST_SHARD = ITEMS.register("permafrost_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROSTBITE_SHARD = ITEMS.register("frostbite_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARCTIC_SHARD = ITEMS.register("arctic_shard",
            () -> new Item(new Item.Properties()));

    //Storm
    public static final RegistryObject<Item> THORUNITE = ITEMS.register("thorunite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHTNING_SHARD = ITEMS.register("lightning_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THUNDER_SHARD = ITEMS.register("thunder_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPEST_SHARD = ITEMS.register("tempest_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GALE_SHARD = ITEMS.register("gale_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STORMRAGE_SHARD = ITEMS.register("stormrage_shard",
            () -> new Item(new Item.Properties()));

    //Sand
    public static final RegistryObject<Item> SAHARITE = ITEMS.register("saharite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUNE_SHARD = ITEMS.register("dune_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIRAGE_SHARD = ITEMS.register("mirage_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DESERT_SHARD = ITEMS.register("desert_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OASIS_SHARD = ITEMS.register("oasis_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORCHED_SHARD = ITEMS.register("scorched_shard",
            () -> new Item(new Item.Properties()));

    //Wood
    public static final RegistryObject<Item> SYLVANITE = ITEMS.register("sylvanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOREST_SHARD = ITEMS.register("forest_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GROVE_SHARD = ITEMS.register("grove_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARBOR_SHARD = ITEMS.register("abor_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THICKET_SHARD = ITEMS.register("thicket_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VERDENT_SHARD = ITEMS.register("verdent_shard",
            () -> new Item(new Item.Properties()));

    //Metal
    public static final RegistryObject<Item> FERRUMITE = ITEMS.register("ferrumite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_SHARD = ITEMS.register("iron_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHARD = ITEMS.register("steel_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHARD = ITEMS.register("bronze_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHARD = ITEMS.register("silver_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_SHARD = ITEMS.register("gold_shard",
            () -> new Item(new Item.Properties()));

    //Steam
    public static final RegistryObject<Item> VAPORMYST = ITEMS.register("vapormyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VAPOR_SHARD = ITEMS.register("vapor_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEAM_SHARD = ITEMS.register("steam_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIST_SHARD = ITEMS.register("mist_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOIL_SHARD = ITEMS.register("boil_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEYSER_SHARD = ITEMS.register("geyser_shard",
            () -> new Item(new Item.Properties()));

    //Crystal
    public static final RegistryObject<Item> GEMARITE = ITEMS.register("gemarite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRISM_SHARD = ITEMS.register("prism_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUSTRITE_SHARD = ITEMS.register("lustrite_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEMCORE_SHARD = ITEMS.register("gemcore_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTALIS_SHARD = ITEMS.register("crystalis_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIANT_SHARD = ITEMS.register("radiant_shard",
            () -> new Item(new Item.Properties()));

    //Smoke
    public static final RegistryObject<Item> NEBULITH = ITEMS.register("nebulith",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMOKE_SHARD = ITEMS.register("smoke_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASHEN_SHARD = ITEMS.register("ashen_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSCURE_SHARD = ITEMS.register("obscure_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GAS_SHARD = ITEMS.register("gas_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAZE_SHARD = ITEMS.register("haze_shard",
            () -> new Item(new Item.Properties()));

    //Sound
    public static final RegistryObject<Item> ECHOQUARTZ = ITEMS.register("echoquartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECHO_SHARD = ITEMS.register("echo_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARMONIC_SHARD = ITEMS.register("harmonic_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RESONANCE_SHARD = ITEMS.register("resonance_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SONOROUS_SHARD = ITEMS.register("sonorous_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REVERB_SHARD = ITEMS.register("reverb_shard",
            () -> new Item(new Item.Properties()));

    //Light
    public static final RegistryObject<Item> LUXARITE = ITEMS.register("luxarite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIANCE_SHARD = ITEMS.register("radiance_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_SHARD = ITEMS.register("luminous_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HALO_SHARD = ITEMS.register("halo_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOW_SHARD = ITEMS.register("glow_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DAYBREAK_SHARD = ITEMS.register("daybreak_shard",
            () -> new Item(new Item.Properties()));

    //Shadow
    public static final RegistryObject<Item> UMBRALEXIS = ITEMS.register("umbralexis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHADOW_SHARD = ITEMS.register("shadow_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHADE_SHARD = ITEMS.register("shade_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MURK_SHARD = ITEMS.register("murk_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUSK_SHARD = ITEMS.register("dusk_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_SHARD = ITEMS.register("twilight_shard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
