package cc.polyfrost.example.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * An example mixin.
 */
@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(method = "startGame", at = @At(value = "HEAD"))
    private void onStartGame(CallbackInfo ci) {
        System.out.println("This is a message from an example mod!");
    }
}
