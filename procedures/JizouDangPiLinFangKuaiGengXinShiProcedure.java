/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package rojiuramod.procedures;

import java.util.Comparator;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class JizouDangPiLinFangKuaiGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (!world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)11.0, (double)11.0, (double)11.0), e -> true).isEmpty()) {
            LivingEntity _entity;
            Entity entity = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)11.0, (double)11.0, (double)11.0), e -> true).stream().sorted(new Object(){

                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19621_, 60, 1, false, false));
            }
            if ((entity = (Entity)world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)11.0, (double)11.0, (double)11.0), e -> true).stream().sorted(new Object(){

                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                _entity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 80, 1, false, false));
            }
        }
    }
}

