package justfatlard.better_beehive.registry;

import justfatlard.better_beehive.BetterBeehive;
import justfatlard.better_beehive.item.HiveAnalyzerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeeItems {
	public static final Item HIVE_ANALYZER = register("hive_analyzer", new HiveAnalyzerItem(settings().maxCount(1)));

	private BeeItems(){}

	static Item register(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(BetterBeehive.MOD_ID, name), item);
	}

	static Item.Settings settings(){
		return new Item.Settings().group(ItemGroup.TOOLS);
	}

	public static void init(){}
}
