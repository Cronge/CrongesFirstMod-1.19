package net.imcronge.crongesfirstmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.imcronge.crongesfirstmod.CrongesFirstMod;
import net.imcronge.crongesfirstmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.GEMSTONES);
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.GEMSTONES);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4.f).requiresTool()), ModItemGroup.GEMSTONES);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {

        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CrongesFirstMod.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        return Registry.register(Registry.ITEM, new Identifier(CrongesFirstMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));

    }
    public static void registerModBlocks(){

        CrongesFirstMod.LOGGER.debug("Registering ModBlocks for " + CrongesFirstMod.MOD_ID);
    }

}
