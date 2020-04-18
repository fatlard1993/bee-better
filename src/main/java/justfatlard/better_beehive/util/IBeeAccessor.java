package justfatlard.better_beehive.util;

import net.minecraft.util.math.BlockPos;

public interface IBeeAccessor {
	
	boolean canBeeEnterHive();
	
	BlockPos getHivePos();
	
	void setHivePos(BlockPos pos);
}
