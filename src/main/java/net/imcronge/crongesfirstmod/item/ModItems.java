package net.imcronge.crongesfirstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.imcronge.crongesfirstmod.CrongesFirstMod;
import net.imcronge.crongesfirstmod.item.custom.EightBallItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RUBY_GEMSTONE =  registerItem("ruby_gemstone",
            new Item(new FabricItemSettings().group(ModItemGroup.GEMSTONES).maxCount(64)));

    public static final Item RAW_RUBY_GEMSTONE =  registerItem("raw_ruby_gemstone",
            new Item(new FabricItemSettings().group(ModItemGroup.GEMSTONES).maxCount(64)));


    public static final Item EIGHT_BALL =  registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CrongesFirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CrongesFirstMod.LOGGER.debug("Registering Mod Items for " + CrongesFirstMod.MOD_ID);
    }
}
