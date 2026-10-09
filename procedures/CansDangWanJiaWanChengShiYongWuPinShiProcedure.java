/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 */
package rojiuramod.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class CansDangWanJiaWanChengShiYongWuPinShiProcedure {
    public static void execute(Entity entity) {
        LivingEntity _entity;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 1, 1, false, false));
        }
        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19607_, 600, 1, false, false));
        }
        if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
            _entity.m_7292_(new MobEffectInstance(MobEffects.f_19600_, 600, 1, false, false));
        }
    }
}

