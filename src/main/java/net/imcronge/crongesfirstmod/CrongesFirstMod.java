package net.imcronge.crongesfirstmod;

import net.fabricmc.api.ModInitializer;
import net.imcronge.crongesfirstmod.block.ModBlocks;
import net.imcronge.crongesfirstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrongesFirstMod implements ModInitializer {
	public static final String MOD_ID = "crongesfirstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
