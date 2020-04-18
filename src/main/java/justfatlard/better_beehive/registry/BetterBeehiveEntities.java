package justfatlard.better_beehive.registry;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

import justfatlard.better_beehive.BetterBeehive;
import justfatlard.better_beehive.entity.ApiaryBlockEntity;

public class BetterBeehiveEntities {
	public static final BlockEntityType<ApiaryBlockEntity> APIARY = register("apiary", BlockEntityType.Builder.create(ApiaryBlockEntity::new, BeeBlocks.APIARY).build(null));

	private BetterBeehiveEntities(){}
	public static void init(){}

	private static <T extends BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> build) {
		return Registry.register(Registry.BLOCK_ENTITY_TYPE, BetterBeehive.id(name), build);
	}
}
