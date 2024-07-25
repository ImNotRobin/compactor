package net.robin.compactor.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.robin.compactor.Compactor;
import net.robin.compactor.common.blocks.blaze_block;
import net.robin.compactor.common.blocks.gunpowder_barrel;

public class modBlocks {
    public static Block registerBlock(String id, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Compactor.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, Identifier.of(Compactor.MOD_ID, id), block);
    }

    public static final Block gunpowder_barrel = registerBlock(
            "gunpowder_barrel",
            new gunpowder_barrel(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .solidBlock(Blocks::never)));
    public static final Block sugar_cane_bundle = registerBlock(
            "sugar_cane_bundle",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.BAMBOO_WOOD)
                            .burnable()));
    public static final Block blaze_block = registerBlock(
            "magma_block",
            new blaze_block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .luminance(state -> 7)
                            .strength(0.5F)
                            .allowsSpawning((state, world, pos, entityType) -> entityType.isFireImmune())
                            .postProcess(Blocks::always)
                            .emissiveLighting(Blocks::always)
            )
    );


    private static void addItemsToCombat(FabricItemGroupEntries entries) {
        entries.add(gunpowder_barrel.asItem());
    }

    private static void addItemToNatural(FabricItemGroupEntries entries) {
        entries.add(sugar_cane_bundle.asItem());
        entries.add(blaze_block.asItem());
    }

    public static void registerAll() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(modBlocks::addItemsToCombat);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(modBlocks::addItemToNatural);
    }

}

