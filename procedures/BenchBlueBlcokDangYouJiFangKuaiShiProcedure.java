/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import rojiuramod.init.RojiuramodModEntities;

public class BenchBlueBlcokDangYouJiFangKuaiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        Object Sitting1 = null;
        if (!entity.m_6144_()) {
            float f;
            Entity entity2 = entity.m_20202_();
            if (entity2 instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity2;
                f = _livEnt.m_21233_();
            } else {
                f = -1.0f;
            }
            if (f == 1.0f && !entity.m_20202_().m_9236_().m_5776_()) {
                entity.m_20202_().m_146870_();
            }
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                Entity entityToSpawn = ((EntityType)RojiuramodModEntities.SITTING1.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            Entity _ent = entity;
            _ent.m_6021_(x + 0.5, y, z + 0.5);
            if (_ent instanceof ServerPlayer) {
                ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                _serverPlayer.f_8906_.m_9774_(x + 0.5, y, z + 0.5, _ent.m_146908_(), _ent.m_146909_());
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        }
    }
}

