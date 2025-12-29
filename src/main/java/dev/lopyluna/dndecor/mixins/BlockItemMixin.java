package dev.lopyluna.dndecor.mixins;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(BlockItem.class)
public class BlockItemMixin {
    
    @Inject(
        method = "m_7373_",  // getTooltipLines - obfuscated name
        at = @At("HEAD"),
        cancellable = true,
        remap = false
    )
    private void onGetTooltipLines(ItemStack pStack, Level pLevel, List<Component> pTooltip, TooltipFlag pFlag, CallbackInfo ci) {
        BlockItem self = (BlockItem) (Object) this;
        // Check if block is null before Minecraft tries to use it
        // This prevents the NPE that blocks recipe synchronization
        if (self.getBlock() == null) {
            // Cancel the method execution to prevent the NPE
            // The tooltip list will remain as-is (without block tooltips)
            ci.cancel();
        }
    }
}

