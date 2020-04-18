package justfatlard.better_beehive.entity;

import net.minecraft.block.BlockState;

import justfatlard.better_beehive.block.ApiaryBlock;
import justfatlard.better_beehive.registry.BetterBeehiveEntities;

public class ApiaryBlockEntity extends ModdedBeehiveBlockEntity {

	public ApiaryBlockEntity() {
		super(BetterBeehiveEntities.APIARY);
	}

	@Override
	public int getHoneyLevel(BlockState state) {
		return state.get(ApiaryBlock.HONEY_LEVEL);
	}

	@Override
	public int getMaxBees() {
		return 6;
	}
}
