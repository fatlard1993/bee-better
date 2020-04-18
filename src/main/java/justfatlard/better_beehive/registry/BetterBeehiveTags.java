package justfatlard.better_beehive.registry;

import net.fabricmc.fabric.api.tag.TagRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;

import justfatlard.better_beehive.BetterBeehive;

public class BetterBeehiveTags {
	public static final Tag<Block> WOODEN_BEEHIVES = registerBlock("wooden_beehives");
	public static final Tag<Item> WOODEN_BEEHIVES_ITEM = registerItem("wooden_beehives");

	private BetterBeehiveTags(){}
	public static void init(){}

	private static Tag<Block> registerBlock(String name){
		return TagRegistry.block(BetterBeehive.id(name));
	}
	private static Tag<Item> registerItem(String name){
		return TagRegistry.item(BetterBeehive.id(name));
	}
}
