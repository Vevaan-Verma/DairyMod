package net.cheesestudios.dairymod.event;

import net.cheesestudios.dairymod.DairyMod;
import net.cheesestudios.dairymod.block.entity.ModBlockEntities;
import net.cheesestudios.dairymod.block.entity.renderer.DairyCondenserBlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DairyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {

        event.registerBlockEntityRenderer(ModBlockEntities.DAIRY_CONDENSER_BLOCK_ENTITY.get(), DairyCondenserBlockEntityRenderer::new);

        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN_BLOCK_ENTITY.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN_BLOCK_ENTITY.get(), HangingSignRenderer::new);

    }
}
