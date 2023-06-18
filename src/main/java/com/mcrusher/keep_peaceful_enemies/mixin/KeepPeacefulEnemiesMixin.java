package com.mcrusher.keep_peaceful_enemies.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.entity.mob.HostileEntity;

@Mixin(HostileEntity.class)
public class KeepPeacefulEnemiesMixin {
    @Inject(method = "isDisallowedInPeaceful", at = @At("HEAD"), cancellable = true)
    protected void disallowed(CallbackInfoReturnable<Boolean> cir) {
		HostileEntity m = (HostileEntity) (Object) this;
		if (m.hasCustomName()) {
			cir.setReturnValue(false);
			cir.cancel();
		}
    }
}