/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package rojiuramod.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import rojiuramod.init.RojiuramodModItems;

public class FloatingRingEntityShiTiShouShangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
        if (damagesource == null || entity == null) {
            return;
        }
        if (damagesource.m_276093_(DamageTypes.f_268464_)) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (!damagesource.m_19390_() && world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.FLOATING_RING.get()));
                entityToSpawn.m_32010_(10);
                _level.m_7967_((Entity)entityToSpawn);
            }
        }
    }
}

