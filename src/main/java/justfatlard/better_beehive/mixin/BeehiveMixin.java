package justfatlard.better_beehive.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;

@Mixin(BeehiveBlock.class)
public abstract class BeehiveMixin extends Block {
	public BeehiveMixin(Settings settings){
		super(settings);
	}
}
