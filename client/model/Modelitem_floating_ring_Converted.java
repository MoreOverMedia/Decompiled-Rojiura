/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.model.EntityModel
 *  net.minecraft.client.model.geom.ModelLayerLocation
 *  net.minecraft.client.model.geom.ModelPart
 *  net.minecraft.client.model.geom.PartPose
 *  net.minecraft.client.model.geom.builders.CubeDeformation
 *  net.minecraft.client.model.geom.builders.CubeListBuilder
 *  net.minecraft.client.model.geom.builders.LayerDefinition
 *  net.minecraft.client.model.geom.builders.MeshDefinition
 *  net.minecraft.client.model.geom.builders.PartDefinition
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.entity.Entity
 */
package rojiuramod.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modelitem_floating_ring_Converted<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("rojiuramod", "modelitem_floating_ring_converted"), "main");
    public final ModelPart bone;

    public Modelitem_floating_ring_Converted(ModelPart root) {
        this.bone = root.m_171324_("bone");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.m_171576_();
        PartDefinition bone = partdefinition.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(0, 11).m_171488_(-15.2f, -4.0f, 5.0f, 3.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).m_171514_(0, 1).m_171488_(-3.7147f, -4.0f, 5.0f, 3.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).m_171514_(0, 25).m_171488_(-10.9574f, -4.0f, 12.2426f, 6.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).m_171514_(24, 0).m_171488_(-10.9574f, -4.0f, 0.7574f, 6.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.m_171419_((float)8.0f, (float)24.0f, (float)-8.0f));
        PartDefinition cube_r1 = bone.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(24, 0).m_171488_(-11.0f, -4.0f, 1.0f, 6.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.m_171423_((float)-7.7858f, (float)0.0f, (float)19.4853f, (float)0.0f, (float)-2.3562f, (float)0.0f));
        PartDefinition cube_r2 = bone.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(0, 25).m_171488_(-11.0f, -4.0f, 12.0f, 6.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.m_171423_((float)-8.1289f, (float)0.0f, (float)19.1421f, (float)0.0f, (float)-2.3562f, (float)0.0f));
        PartDefinition cube_r3 = bone.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-4.0f, -4.0f, 5.0f, 3.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.m_171423_((float)-8.1289f, (float)0.0f, (float)19.4853f, (float)0.0f, (float)-2.3562f, (float)0.0f));
        PartDefinition cube_r4 = bone.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(0, 11).m_171488_(-15.0f, -4.0f, 5.0f, 3.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.m_171423_((float)-7.7858f, (float)0.0f, (float)19.1421f, (float)0.0f, (float)-2.3562f, (float)0.0f));
        return LayerDefinition.m_171565_((MeshDefinition)meshdefinition, (int)48, (int)48);
    }

    public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.bone.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}

