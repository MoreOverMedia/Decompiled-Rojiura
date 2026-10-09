/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package rojiuramod.procedures;

import java.util.Comparator;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import rojiuramod.RojiuramodMod;
import rojiuramod.init.RojiuramodModEntities;

public class FloatingRingEntityZaiShiTiKeGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.m_20160_()) {
            if (entity.m_20069_() || entity.m_5842_() || entity.m_5830_() || entity.m_20077_()) {
                if (!world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)1.3, (double)1.3, (double)1.3), e -> true).isEmpty() && !((Entity)world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)1.3, (double)1.3, (double)1.3), e -> true).stream().sorted(new Object(){

                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null)).m_20159_()) {
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                } else {
                    LivingEntity _livingEntity9;
                    if (entity instanceof LivingEntity && (_livingEntity9 = (LivingEntity)entity).m_21204_().m_22171_(Attributes.f_22279_)) {
                        _livingEntity9.m_21051_(Attributes.f_22279_).m_22100_(3.0);
                    }
                    entity.m_5997_(0.0, 0.003, 0.0);
                }
            } else if (!entity.m_20069_() && !entity.m_5842_()) {
                LivingEntity _livingEntity13;
                if (entity instanceof LivingEntity && (_livingEntity13 = (LivingEntity)entity).m_21204_().m_22171_(Attributes.f_22279_)) {
                    _livingEntity13.m_21051_(Attributes.f_22279_).m_22100_(0.2);
                }
                RojiuramodMod.queueServerWork(2, () -> entity.m_5997_(0.0, -0.01, 0.0));
            }
        } else if (entity.m_20160_()) {
            RojiuramodMod.queueServerWork(1, () -> {
                if (!entity.m_20160_() && !entity.m_20096_() && (entity.m_5842_() || entity.m_20069_())) {
                    if (!entity.m_9236_().m_5776_()) {
                        entity.m_146870_();
                    }
                    if (!(world instanceof ServerLevel)) return;
                    ServerLevel _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)entity.m_20185_(), (double)entity.m_20186_(), (double)entity.m_20189_()), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn == null) return;
                }
                if (entity.m_20069_() || entity.m_5842_() || entity.m_5830_() || entity.m_20077_()) {
                    LivingEntity _livingEntity30;
                    if (entity instanceof LivingEntity && (_livingEntity30 = (LivingEntity)entity).m_21204_().m_22171_(Attributes.f_22279_)) {
                        _livingEntity30.m_21051_(Attributes.f_22279_).m_22100_(3.0);
                    }
                    entity.m_5997_(0.0, 0.003, 0.0);
                    return;
                } else {
                    LivingEntity _livingEntity34;
                    if (entity.m_20069_() || entity.m_5842_()) return;
                    if (entity instanceof LivingEntity && (_livingEntity34 = (LivingEntity)entity).m_21204_().m_22171_(Attributes.f_22279_)) {
                        _livingEntity34.m_21051_(Attributes.f_22279_).m_22100_(0.2);
                    }
                    RojiuramodMod.queueServerWork(2, () -> entity.m_5997_(0.0, -0.01, 0.0));
                }
            });
        }
    }
}

