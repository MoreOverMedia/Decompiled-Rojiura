/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.EntityType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterRenderers
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package rojiuramod.init;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rojiuramod.client.renderer.FloatingRingEntityRenderer;
import rojiuramod.client.renderer.Sitting1Renderer;
import rojiuramod.client.renderer.Sitting2Renderer;
import rojiuramod.init.RojiuramodModEntities;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
public class RojiuramodModEntityRenderers {
    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType)RojiuramodModEntities.SITTING1.get(), Sitting1Renderer::new);
        event.registerEntityRenderer((EntityType)RojiuramodModEntities.SITTING_2.get(), Sitting2Renderer::new);
        event.registerEntityRenderer((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get(), FloatingRingEntityRenderer::new);
    }
}

