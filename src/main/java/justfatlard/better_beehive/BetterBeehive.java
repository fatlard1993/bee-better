package justfatlard.better_beehive;

import justfatlard.better_beehive.registry.*;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.DispenserBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import justfatlard.better_beehive.dispenser.GlassBottleDispenserBehavior;
import justfatlard.better_beehive.dispenser.ShearsDispenserBehavior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BetterBeehive implements ModInitializer {

	public static final String MOD_ID = "better-beehive-justfatlard";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}
	public static final ItemGroup GROUP = ItemGroup.DECORATIONS;

	@Override
	public void onInitialize(){
		BeeBlocks.init();
		BeeItems.init();
		BetterBeehiveTags.init();
		BetterBeehiveItems.init();
		BeePOI.init();
		BeeBlocks.init();
		BetterBeehiveEntities.init();
		BeePOI.init();

		// shitty hack but it's infinitely easier than mixin-ing into this
		DispenserBlock.registerBehavior(Items.GLASS_BOTTLE.asItem(), new GlassBottleDispenserBehavior());
		DispenserBlock.registerBehavior(Items.SHEARS.asItem(), new ShearsDispenserBehavior());
	}

	public static void log(String log) {
		LOGGER.info("["+ MOD_ID +"] "+ log);
	}
}
