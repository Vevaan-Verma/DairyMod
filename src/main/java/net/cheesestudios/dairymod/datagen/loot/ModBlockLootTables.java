package net.cheesestudios.dairymod.datagen.loot;

import net.cheesestudios.dairymod.block.ModBlocks;
import net.cheesestudios.dairymod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags());

    }

    @Override
    protected void generate() {

        // blocks
        this.dropSelf(ModBlocks.CHEESE_BLOCK.get());
        this.dropSelf(ModBlocks.SALT_BLOCK.get());

        // advanced blocks
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        // ores
        this.add(ModBlocks.SALT_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.SALT_ORE.get(), ModItems.SALT.get()));

        // stairs
        this.dropSelf(ModBlocks.CHEESE_STAIRS.get());

        // slabs
        this.add(ModBlocks.CHEESE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHEESE_SLAB.get()));

        // buttons & pressure plates
        this.dropSelf(ModBlocks.CHEESE_BUTTON.get());
        this.dropSelf(ModBlocks.CHEESE_PRESSURE_PLATE.get());

        // fences & walls
        this.dropSelf(ModBlocks.CHEESE_FENCE.get());
        this.dropSelf(ModBlocks.CHEESE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHEESE_WALL.get());

        // doors
        this.add(ModBlocks.CHEESE_DOOR.get(),
                block -> createDoorTable(ModBlocks.CHEESE_DOOR.get()));
        this.dropSelf(ModBlocks.CHEESE_TRAPDOOR.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {

        // all known blocks with loot tables
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {

        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));

    }

    protected LootTable.Builder createLapisLikeOreDrops(Block pBlock, Item item) {

        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 9.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));

    }

    protected LootTable.Builder createRedstoneLikeOreDrops(Block pBlock, Item item) {

        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 5.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));

    }
}
