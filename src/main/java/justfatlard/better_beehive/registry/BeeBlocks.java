package justfatlard.better_beehive.registry;

import justfatlard.better_beehive.block.ApiaryBlock;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

import justfatlard.better_beehive.BetterBeehive;

public class BeeBlocks {
	public static final ArrayList<Block> WOODEN_BEEHIVES = new ArrayList<>();

	public static final Block APIARY = register("apiary", new ApiaryBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).build()));

	public static final Block SPRUCE_BEEHIVE = registerWoodenHive("spruce_beehive", new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE).materialColor(MaterialColor.SPRUCE).build()));
	public static final Block BIRCH_BEEHIVE = registerWoodenHive("birch_beehive", new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE).materialColor(MaterialColor.SAND).build()));
	public static final Block JUNGLE_BEEHIVE = registerWoodenHive("jungle_beehive", new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE).materialColor(MaterialColor.DIRT).build()));
	public static final Block ACACIA_BEEHIVE = registerWoodenHive("acacia_beehive", new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE).materialColor(MaterialColor.ORANGE).build()));
	public static final Block DARK_OAK_BEEHIVE = registerWoodenHive("dark_oak_beehive", new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE).materialColor(MaterialColor.BROWN).build()));

	private BeeBlocks(){}
	static <T extends Block> T registerWoodenHive(String name, T block) {
		T b = register(name, block);
		WOODEN_BEEHIVES.add(b);
		return b;
	}

	static <T extends Block> T register(String name, T block, Item.Settings settings){
		return register(name, block, new BlockItem(block, settings));
	}

	static <T extends Block> T register(String name, T block){
		return register(name, block, BetterBeehiveItems.settings());
	}

	static <T extends Block> T register(String name, T block, BlockItem item){
		T b = Registry.register(Registry.BLOCK, BetterBeehive.id(name), block);

		if(item != null){
			BetterBeehiveItems.register(name, item);
			Item.BLOCK_ITEMS.put(item.getBlock(), item);
		}
		return b;
	}

	protected static void setFlammable(int burnChance, int spreadChance, Block... blocks) {
		for (Block block:blocks) {
			FlammableBlockRegistry.getDefaultInstance().add(block, burnChance, spreadChance);
		}
	}

	public static void init(){
		setFlammable(5, 20, WOODEN_BEEHIVES.toArray(new Block[0]));
	}
}
