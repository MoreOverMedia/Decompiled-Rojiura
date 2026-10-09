/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Direction$Axis
 *  net.minecraft.core.Direction$AxisDirection
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.RojiuramodMod;
import rojiuramod.init.RojiuramodModItems;

public class VendingmachineblockDangYouJiFangKuaiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        Player _player;
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() == RojiuramodModItems.COIN.get()) {
            boolean bl;
            if (world instanceof Level) {
                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:coin_into_a_machine.ogg")), SoundSource.BLOCKS, 1.0f, 1.0f);
            }
            if (entity instanceof Player) {
                Player _plr = (Player)entity;
                bl = _plr.m_150110_().f_35937_;
            } else {
                bl = false;
            }
            if (!bl) {
                ItemStack itemStack2;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack2 = _livEnt.m_21205_();
                } else {
                    itemStack2 = ItemStack.f_41583_;
                }
                itemStack2.m_41774_(1);
            }
            RojiuramodMod.queueServerWork(55, () -> {
                if (world instanceof Level) {
                    ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:can_from_a_machine.ogg")), SoundSource.BLOCKS, 1.0f, 1.0f);
                }
                RojiuramodMod.queueServerWork(40, () -> {
                    if (new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(blockstate) == Direction.NORTH) {
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 30) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 0.0, y - 0.5, z - 0.3, new ItemStack((ItemLike)RojiuramodModItems.CANS.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 43) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 0.0, y - 0.5, z - 0.3, new ItemStack((ItemLike)RojiuramodModItems.BEER.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 75 && world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 0.0, y - 0.5, z - 0.3, new ItemStack((ItemLike)RojiuramodModItems.ICE_CANDY.get()));
                            entityToSpawn.m_32010_(5);
                            _level.m_7967_((Entity)entityToSpawn);
                        }
                    } else if (new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(blockstate) == Direction.SOUTH) {
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 30) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 1.0, y - 0.5, z + 1.3, new ItemStack((ItemLike)RojiuramodModItems.CANS.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 43) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 1.0, y - 0.5, z + 1.3, new ItemStack((ItemLike)RojiuramodModItems.BEER.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 75 && world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 1.0, y - 0.5, z + 1.3, new ItemStack((ItemLike)RojiuramodModItems.ICE_CANDY.get()));
                            entityToSpawn.m_32010_(5);
                            _level.m_7967_((Entity)entityToSpawn);
                        }
                    } else if (new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(blockstate) == Direction.WEST) {
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 30) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x - 0.3, y - 0.5, z + 1.0, new ItemStack((ItemLike)RojiuramodModItems.CANS.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 43) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x - 0.3, y - 0.5, z + 1.0, new ItemStack((ItemLike)RojiuramodModItems.BEER.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 75 && world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            ItemEntity entityToSpawn = new ItemEntity((Level)_level, x - 0.3, y - 0.5, z + 1.0, new ItemStack((ItemLike)RojiuramodModItems.ICE_CANDY.get()));
                            entityToSpawn.m_32010_(5);
                            _level.m_7967_((Entity)entityToSpawn);
                        }
                    } else if (new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(blockstate) == Direction.EAST) {
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 30) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 1.3, y - 0.5, z + 0.0, new ItemStack((ItemLike)RojiuramodModItems.CANS.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 43) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 1.3, y - 0.5, z + 0.0, new ItemStack((ItemLike)RojiuramodModItems.BEER.get()));
                                entityToSpawn.m_32010_(5);
                                _level.m_7967_((Entity)entityToSpawn);
                            }
                        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)100) <= 75 && world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel)world;
                            ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 1.3, y - 0.5, z + 0.0, new ItemStack((ItemLike)RojiuramodModItems.ICE_CANDY.get()));
                            entityToSpawn.m_32010_(5);
                            _level.m_7967_((Entity)entityToSpawn);
                        }
                    }
                });
            });
        } else if (entity instanceof Player && !(_player = (Player)entity).m_9236_().m_5776_()) {
            _player.m_5661_((Component)Component.m_237113_((String)Component.m_237115_((String)"key.name.rojiuramod.3").getString()), true);
        }
    }
}

