/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.particle.ParticleProvider
 *  net.minecraft.client.particle.ParticleRenderType
 *  net.minecraft.client.particle.SpriteSet
 *  net.minecraft.client.particle.TextureSheetParticle
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package rojiuramod.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(value=Dist.CLIENT)
public class Invisiblelight1Particle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    public static Invisiblelight1ParticleProvider provider(SpriteSet spriteSet) {
        return new Invisiblelight1ParticleProvider(spriteSet);
    }

    protected Invisiblelight1Particle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.m_107250_(1.0f, 1.0f);
        this.f_107225_ = Math.max(1, 26 + (this.f_107223_.m_188503_(12) - 6));
        this.f_107226_ = 0.0f;
        this.f_107219_ = false;
        this.f_107215_ = vx * 0.0;
        this.f_107216_ = vy * 0.0;
        this.f_107217_ = vz * 0.0;
        this.m_108335_(spriteSet);
    }

    public int m_6355_(float partialTick) {
        return 0xF000F0;
    }

    public ParticleRenderType m_7556_() {
        return ParticleRenderType.f_107432_;
    }

    public void m_5989_() {
        super.m_5989_();
    }

    public static class Invisiblelight1ParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Invisiblelight1ParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new Invisiblelight1Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}

