/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package rojiuramod.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import rojiuramod.client.model.Modelitem_floating_ring_Converted;
import rojiuramod.entity.FloatingRingEntityEntity;

public class FloatingRingEntityRenderer
extends MobRenderer<FloatingRingEntityEntity, Modelitem_floating_ring_Converted<FloatingRingEntityEntity>> {
    public FloatingRingEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelitem_floating_ring_Converted(context.m_174023_(Modelitem_floating_ring_Converted.LAYER_LOCATION)), 0.0f);
    }

    public ResourceLocation getTextureLocation(FloatingRingEntityEntity entity) {
        return new ResourceLocation("rojiuramod:textures/entities/floating_ring.png");
    }
}

