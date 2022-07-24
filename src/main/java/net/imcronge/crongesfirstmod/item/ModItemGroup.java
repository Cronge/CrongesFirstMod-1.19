package net.imcronge.crongesfirstmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.imcronge.crongesfirstmod.CrongesFirstMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GEMSTONES = FabricItemGroupBuilder.build(
            new Identifier(CrongesFirstMod.MOD_ID, "gemstones"), () -> new ItemStack(ModItems.RUBY_GEMSTONE));

}
