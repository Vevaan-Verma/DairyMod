package net.cheesestudios.dairymod.datagen;

import net.cheesestudios.dairymod.DairyMod;
import net.cheesestudios.dairymod.worldgen.ModBiomeModifiers;
import net.cheesestudios.dairymod.worldgen.ModConfiguredFeatures;
import net.cheesestudios.dairymod.worldgen.ModPlacedFeatures;
import net.cheesestudios.dairymod.worldgen.biome.ModBiomes;
import net.cheesestudios.dairymod.worldgen.dimension.ModDimensions;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType) // can throw error if not placed at top
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap)
            .add(Registries.BIOME, ModBiomes::bootstrap)
            .add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {

        super(output, registries, BUILDER, Set.of(DairyMod.MOD_ID));

    }
}
