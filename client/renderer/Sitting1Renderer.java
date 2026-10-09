/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.model.EntityModel
 *  net.minecraft.client.model.SlimeModel
 *  net.minecraft.client.model.geom.ModelLayers
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package rojiuramod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.SlimeModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import rojiuramod.entity.Sitting1Entity;

public class Sitting1Renderer
extends MobRenderer<Sitting1Entity, SlimeModel<Sitting1Entity>> {
    public Sitting1Renderer(EntityRendererProvider.Context context) {
        super(context, (EntityModel)new SlimeModel(context.m_174023_(ModelLayers.f_171241_)), 0.0f);
    }

    protected void scale(Sitting1Entity entity, PoseStack poseStack, float f) {
        poseStack.m_85841_(2.0f, 2.0f, 2.0f);
    }

    public ResourceLocation getTextureLocation(Sitting1Entity entity) {
        return new ResourceLocation("rojiuramod:textures/entities/air.png");
    }
}

