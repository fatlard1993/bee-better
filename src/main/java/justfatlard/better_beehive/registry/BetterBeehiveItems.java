package justfatlard.better_beehive.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import justfatlard.better_beehive.BetterBeehive;

public class BetterBeehiveItems {
	private BetterBeehiveItems(){}
	public static void init(){}

	static Item register(String name, Item item){ return Registry.register(Registry.ITEM, new Identifier(BetterBeehive.MOD_ID, name), item); }

	static Item.Settings settings(){
		return new Item.Settings().group(BetterBeehive.GROUP);
	}
}
