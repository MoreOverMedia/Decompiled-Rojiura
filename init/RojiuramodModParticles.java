/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.RegisterParticleProvidersEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package rojiuramod.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rojiuramod.client.particle.Invisiblelight1Particle;
import rojiuramod.init.RojiuramodModParticleTypes;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
public class RojiuramodModParticles {
    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet((ParticleType)RojiuramodModParticleTypes.INVISIBLELIGHT_1.get(), Invisiblelight1Particle::provider);
    }
}

