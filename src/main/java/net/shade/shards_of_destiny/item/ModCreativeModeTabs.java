package net.shade.shards_of_destiny.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shade.shards_of_destiny.ShardsOfDestiny;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShardsOfDestiny.MOD_ID);

    //Fire
    public static final RegistryObject<CreativeModeTab> FIRE_ELEMENT = CREATIVE_MODE_TABS.register("fire_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PYROCLASTITE.get()))
                    .title(Component.translatable("Fire Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PYROCLASTITE.get());
                        pOutput.accept(ModItems.EMBER_SHARD.get());
                        pOutput.accept(ModItems.INFERNO_SHARD.get());
                        pOutput.accept(ModItems.BLAZE_SHARD.get());
                        pOutput.accept(ModItems.SCORCH_SHARD.get());
                        pOutput.accept(ModItems.FLAMESTRIKE_SHARD.get());

                        pOutput.accept(ModItems.EMBERFORGE_BLADE.get());
                        pOutput.accept(ModItems.INFERNO_AMULET.get());
                        pOutput.accept(ModItems.PYROCLASM_GAUNTLET.get());
                    })
                    .build());

    //Water
    public static final RegistryObject<CreativeModeTab> WATER_ELEMENT = CREATIVE_MODE_TABS.register("water_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AQUABRISITE.get()))
                    .title(Component.translatable("Water Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AQUABRISITE.get());
                        pOutput.accept(ModItems.WAVE_SHARD.get());
                        pOutput.accept(ModItems.GLACIER_SHARD.get());
                        pOutput.accept(ModItems.TSUNAMI_SHARD.get());
                        pOutput.accept(ModItems.AQUAFOAM_SHARD.get());
                        pOutput.accept(ModItems.ICEBOUND_SHARD.get());

                        pOutput.accept(ModItems.AQUATIC_PEARL_NECKLACE.get());
                        pOutput.accept(ModItems.TIDAL_TRIDENT.get());
                        pOutput.accept(ModItems.FROSTBOUND_CHALICE.get());
                    })
                    .build());

    //Earth
    public static final RegistryObject<CreativeModeTab> EARTH_ELEMENT = CREATIVE_MODE_TABS.register("earth_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TERRANITE.get()))
                    .title(Component.translatable("Earth Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TERRANITE.get());
                        pOutput.accept(ModItems.GRANITE_SHARD.get());
                        pOutput.accept(ModItems.QUARTZ_SHARD.get());
                        pOutput.accept(ModItems.LAVAFLOW_SHARD.get());
                        pOutput.accept(ModItems.MOSSSTONE_SHARD.get());
                        pOutput.accept(ModItems.CRYSTALINE_SHARD.get());

                        pOutput.accept(ModItems.GAIAS_HEARTSTONE.get());
                        pOutput.accept(ModItems.TERRAQUAKE_HAMMER.get());
                        pOutput.accept(ModItems.CRYSTALINE_EARTHSHAKER.get());
                    })
                    .build());

    //Air
    public static final RegistryObject<CreativeModeTab> AIR_ELEMENT = CREATIVE_MODE_TABS.register("air_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ZEPHYRION.get()))
                    .title(Component.translatable("Air Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ZEPHYRION.get());
                        pOutput.accept(ModItems.BREEZE_SHARD.get());
                        pOutput.accept(ModItems.TYPHOON_SHARD.get());
                        pOutput.accept(ModItems.GUST_SHARD.get());
                        pOutput.accept(ModItems.TORNADO_SHARD.get());
                        pOutput.accept(ModItems.WHISPER_SHARD.get());

                        pOutput.accept(ModItems.ZEPHYR_WINGS.get());
                        pOutput.accept(ModItems.CYCLONE_CLOAK.get());
                        pOutput.accept(ModItems.AERIAL_WHISPERERS_STAFF.get());
                    })
                    .build());

    //Magma
    public static final RegistryObject<CreativeModeTab> MAGMA_ELEMENT = CREATIVE_MODE_TABS.register("magma_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VULCANIUM.get()))
                    .title(Component.translatable("Magma Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VULCANIUM.get());
                        pOutput.accept(ModItems.MOLTEN_SHARD.get());
                        pOutput.accept(ModItems.PYROCLASM_SHARD.get());
                        pOutput.accept(ModItems.OBSIDIAN_SHARD.get());
                        pOutput.accept(ModItems.LAVALINK_SHARD.get());
                        pOutput.accept(ModItems.EMBERFLOW_SHARD.get());

                        pOutput.accept(ModItems.VOLCANIC_ERUPTION_AXE.get());
                        pOutput.accept(ModItems.MOLTEN_CORE_TALISMAN.get());
                        pOutput.accept(ModItems.LAVAFLOW_ARMOR.get());
                    })
                    .build());

    //Ice
    public static final RegistryObject<CreativeModeTab> ICE_ELEMENT = CREATIVE_MODE_TABS.register("ice_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYOQUARTZ.get()))
                    .title(Component.translatable("Ice Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CRYOQUARTZ.get());
                        pOutput.accept(ModItems.FROST_SHARD.get());
                        pOutput.accept(ModItems.GLACIAL_SHARD.get());
                        pOutput.accept(ModItems.PERMAFROST_SHARD.get());
                        pOutput.accept(ModItems.FROSTBITE_SHARD.get());
                        pOutput.accept(ModItems.ARCTIC_SHARD.get());

                        pOutput.accept(ModItems.GLACIAL_SHARD_BOW.get());
                        pOutput.accept(ModItems.FROSTBITE_RING.get());
                        pOutput.accept(ModItems.ARCTIC_CROWN.get());
                    })
                    .build());

    //Storm
    public static final RegistryObject<CreativeModeTab> STORM_ELEMENT = CREATIVE_MODE_TABS.register("storm_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.THORUNITE.get()))
                    .title(Component.translatable("Storm Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.THORUNITE.get());
                        pOutput.accept(ModItems.LIGHTNING_SHARD.get());
                        pOutput.accept(ModItems.THUNDER_SHARD.get());
                        pOutput.accept(ModItems.TEMPEST_SHARD.get());
                        pOutput.accept(ModItems.GALE_SHARD.get());
                        pOutput.accept(ModItems.STORMRAGE_SHARD.get());
                    })
                    .build());

    //Sand
    public static final RegistryObject<CreativeModeTab> SAND_ELEMENT = CREATIVE_MODE_TABS.register("sand_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAHARITE.get()))
                    .title(Component.translatable("Sand Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAHARITE.get());
                        pOutput.accept(ModItems.DUNE_SHARD.get());
                        pOutput.accept(ModItems.MIRAGE_SHARD.get());
                        pOutput.accept(ModItems.DESERT_SHARD.get());
                        pOutput.accept(ModItems.OASIS_SHARD.get());
                        pOutput.accept(ModItems.SCORCHED_SHARD.get());
                    })
                    .build());

    //Wood
    public static final RegistryObject<CreativeModeTab> WOOD_ELEMENT = CREATIVE_MODE_TABS.register("wood_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SYLVANITE.get()))
                    .title(Component.translatable("Wood Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SYLVANITE.get());
                        pOutput.accept(ModItems.FOREST_SHARD.get());
                        pOutput.accept(ModItems.GROVE_SHARD.get());
                        pOutput.accept(ModItems.ARBOR_SHARD.get());
                        pOutput.accept(ModItems.THICKET_SHARD.get());
                        pOutput.accept(ModItems.VERDENT_SHARD.get());
                    })
                    .build());

    //Metal
    public static final RegistryObject<CreativeModeTab> METAL_ELEMENT = CREATIVE_MODE_TABS.register("metal_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FERRUMITE.get()))
                    .title(Component.translatable("Metal Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FERRUMITE.get());
                        pOutput.accept(ModItems.IRON_SHARD.get());
                        pOutput.accept(ModItems.STEEL_SHARD.get());
                        pOutput.accept(ModItems.BRONZE_SHARD.get());
                        pOutput.accept(ModItems.SILVER_SHARD.get());
                        pOutput.accept(ModItems.GOLD_SHARD.get());
                    })
                    .build());

    //Steam
    public static final RegistryObject<CreativeModeTab> STEAM_ELEMENT = CREATIVE_MODE_TABS.register("steam_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VAPORMYST.get()))
                    .title(Component.translatable("Steam Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VAPORMYST.get());
                        pOutput.accept(ModItems.VAPOR_SHARD.get());
                        pOutput.accept(ModItems.STEAM_SHARD.get());
                        pOutput.accept(ModItems.MIST_SHARD.get());
                        pOutput.accept(ModItems.BOIL_SHARD.get());
                        pOutput.accept(ModItems.GEYSER_SHARD.get());
                    })
                    .build());

    //Crystal
    public static final RegistryObject<CreativeModeTab> CRYSTAL_ELEMENT = CREATIVE_MODE_TABS.register("crystal_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GEMARITE.get()))
                    .title(Component.translatable("Crystal Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GEMARITE.get());
                        pOutput.accept(ModItems.PRISM_SHARD.get());
                        pOutput.accept(ModItems.LUSTRITE_SHARD.get());
                        pOutput.accept(ModItems.GEMCORE_SHARD.get());
                        pOutput.accept(ModItems.CRYSTALIS_SHARD.get());
                        pOutput.accept(ModItems.RADIANT_SHARD.get());
                    })
                    .build());

    //Smoke
    public static final RegistryObject<CreativeModeTab> SMOKE_ELEMENT = CREATIVE_MODE_TABS.register("smoke_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NEBULITH.get()))
                    .title(Component.translatable("Smoke Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.NEBULITH.get());
                        pOutput.accept(ModItems.SMOKE_SHARD.get());
                        pOutput.accept(ModItems.ASHEN_SHARD.get());
                        pOutput.accept(ModItems.OBSCURE_SHARD.get());
                        pOutput.accept(ModItems.GAS_SHARD.get());
                        pOutput.accept(ModItems.HAZE_SHARD.get());
                    })
                    .build());

    //Sound
    public static final RegistryObject<CreativeModeTab> SOUND_ELEMENT = CREATIVE_MODE_TABS.register("sound_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECHOQUARTZ.get()))
                    .title(Component.translatable("Sound Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ECHOQUARTZ.get());
                        pOutput.accept(ModItems.ECHO_SHARD.get());
                        pOutput.accept(ModItems.HARMONIC_SHARD.get());
                        pOutput.accept(ModItems.RESONANCE_SHARD.get());
                        pOutput.accept(ModItems.SONOROUS_SHARD.get());
                        pOutput.accept(ModItems.REVERB_SHARD.get());
                    })
                    .build());

    //Light
    public static final RegistryObject<CreativeModeTab> LIGHT_ELEMENT = CREATIVE_MODE_TABS.register("light_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LUXARITE.get()))
                    .title(Component.translatable("Light Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LUXARITE.get());
                        pOutput.accept(ModItems.RADIANCE_SHARD.get());
                        pOutput.accept(ModItems.LUMINOUS_SHARD.get());
                        pOutput.accept(ModItems.HALO_SHARD.get());
                        pOutput.accept(ModItems.GLOW_SHARD.get());
                        pOutput.accept(ModItems.DAYBREAK_SHARD.get());
                    })
                    .build());

    //Shadow
    public static final RegistryObject<CreativeModeTab> SHADOW_ELEMENT = CREATIVE_MODE_TABS.register("shadow_element",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.UMBRALEXIS.get()))
                    .title(Component.translatable("Shadow Element"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.UMBRALEXIS.get());
                        pOutput.accept(ModItems.SHADOW_SHARD.get());
                        pOutput.accept(ModItems.SHADE_SHARD.get());
                        pOutput.accept(ModItems.NIGHTMARE_SHARD.get());
                        pOutput.accept(ModItems.DUSK_SHARD.get());
                        pOutput.accept(ModItems.TWILIGHT_SHARD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}