/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.LevelAccessor
 */
package rojiuramod.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import rojiuramod.RojiuramodMod;

public class Sitting1WanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null) {
            return;
        }
        if (sourceentity.m_20186_() == entity.m_20186_()) {
            sourceentity.m_20329_(entity);
        }
        RojiuramodMod.queueServerWork(1, () -> {
            if (!sourceentity.m_20159_()) {
                if (!entity.m_9236_().m_5776_()) {
                    entity.m_146870_();
                }
                Entity _ent = sourceentity;
                _ent.m_6021_(x, y + 0.5, z);
                if (_ent instanceof ServerPlayer) {
                    ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                    _serverPlayer.f_8906_.m_9774_(x, y + 0.5, z, _ent.m_146908_(), _ent.m_146909_());
                }
            }
        });
    }
}

