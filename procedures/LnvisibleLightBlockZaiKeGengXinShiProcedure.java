/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package rojiuramod.procedures;

import java.util.Comparator;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import rojiuramod.init.RojiuramodModItems;
import rojiuramod.init.RojiuramodModParticleTypes;

public class LnvisibleLightBlockZaiKeGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        block24: {
            ServerLevel _level;
            block31: {
                ItemStack itemStack;
                ItemStack itemStack2;
                block30: {
                    block29: {
                        ItemStack itemStack3;
                        ItemStack itemStack4;
                        block28: {
                            block27: {
                                ItemStack itemStack5;
                                ItemStack itemStack6;
                                block26: {
                                    block25: {
                                        ItemStack itemStack7;
                                        ItemStack itemStack8;
                                        if (world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).isEmpty()) break block24;
                                        Entity entity = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                                return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                                            }
                                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt = (LivingEntity)entity;
                                            itemStack8 = _livEnt.m_21205_();
                                        } else {
                                            itemStack8 = ItemStack.f_41583_;
                                        }
                                        if (itemStack8.m_41720_() == RojiuramodModItems.INVISIBLE_LIGHT.get()) break block25;
                                        entity = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                                return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                                            }
                                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt = (LivingEntity)entity;
                                            itemStack7 = _livEnt.m_21206_();
                                        } else {
                                            itemStack7 = ItemStack.f_41583_;
                                        }
                                        if (itemStack7.m_41720_() != RojiuramodModItems.INVISIBLE_LIGHT.get()) break block26;
                                    }
                                    if (world instanceof ServerLevel) {
                                        _level = (ServerLevel)world;
                                        _level.m_8767_((ParticleOptions)((SimpleParticleType)RojiuramodModParticleTypes.INVISIBLELIGHT_1.get()), x + 0.5, y + 0.5, z + 0.5, 1, 0.0, 0.0, 0.0, 0.0);
                                    }
                                    break block24;
                                }
                                _level = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                        return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                                    }
                                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                                if (_level instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)_level;
                                    itemStack6 = _livEnt.m_21205_();
                                } else {
                                    itemStack6 = ItemStack.f_41583_;
                                }
                                if (itemStack6.m_41720_() == RojiuramodModItems.INVISIBLE_LIGHT_4.get()) break block27;
                                _level = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                        return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                                    }
                                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                                if (_level instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)_level;
                                    itemStack5 = _livEnt.m_21206_();
                                } else {
                                    itemStack5 = ItemStack.f_41583_;
                                }
                                if (itemStack5.m_41720_() != RojiuramodModItems.INVISIBLE_LIGHT_4.get()) break block28;
                            }
                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                _level.m_8767_((ParticleOptions)((SimpleParticleType)RojiuramodModParticleTypes.INVISIBLELIGHT_1.get()), x + 0.5, y + 0.5, z + 0.5, 1, 0.0, 0.0, 0.0, 0.0);
                            }
                            break block24;
                        }
                        _level = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        if (_level instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)_level;
                            itemStack4 = _livEnt.m_21205_();
                        } else {
                            itemStack4 = ItemStack.f_41583_;
                        }
                        if (itemStack4.m_41720_() == RojiuramodModItems.INVISIBLE_LIGHT_8.get()) break block29;
                        _level = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        if (_level instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)_level;
                            itemStack3 = _livEnt.m_21206_();
                        } else {
                            itemStack3 = ItemStack.f_41583_;
                        }
                        if (itemStack3.m_41720_() != RojiuramodModItems.INVISIBLE_LIGHT_8.get()) break block30;
                    }
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        _level.m_8767_((ParticleOptions)((SimpleParticleType)RojiuramodModParticleTypes.INVISIBLELIGHT_1.get()), x + 0.5, y + 0.5, z + 0.5, 1, 0.0, 0.0, 0.0, 0.0);
                    }
                    break block24;
                }
                _level = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (_level instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)_level;
                    itemStack2 = _livEnt.m_21205_();
                } else {
                    itemStack2 = ItemStack.f_41583_;
                }
                if (itemStack2.m_41720_() == RojiuramodModItems.INVISIBLE_LIGHT_12.get()) break block31;
                _level = world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)27.0, (double)27.0, (double)27.0), e -> true).stream().sorted(new Object(){

                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (_level instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)_level;
                    itemStack = _livEnt.m_21206_();
                } else {
                    itemStack = ItemStack.f_41583_;
                }
                if (itemStack.m_41720_() != RojiuramodModItems.INVISIBLE_LIGHT_12.get()) break block24;
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_8767_((ParticleOptions)((SimpleParticleType)RojiuramodModParticleTypes.INVISIBLELIGHT_1.get()), x + 0.5, y + 0.5, z + 0.5, 1, 0.0, 0.0, 0.0, 0.0);
            }
        }
    }
}

