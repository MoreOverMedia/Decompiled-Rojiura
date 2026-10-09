/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Direction$Axis
 *  net.minecraft.core.Direction$AxisDirection
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.tags.BlockTags
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModItems;

public class DoorFangZhiProcedure {
    /*
     * Unable to fully structure code
     */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block117: {
            block129: {
                block127: {
                    block128: {
                        block123: {
                            block126: {
                                block124: {
                                    block125: {
                                        block119: {
                                            block122: {
                                                block120: {
                                                    block121: {
                                                        block114: {
                                                            block118: {
                                                                block115: {
                                                                    block116: {
                                                                        block113: {
                                                                            block112: {
                                                                                if (entity == null) {
                                                                                    return;
                                                                                }
                                                                                if (entity instanceof LivingEntity) {
                                                                                    _livEnt = (LivingEntity)entity;
                                                                                    v0 = _livEnt.m_21205_();
                                                                                } else {
                                                                                    v0 = ItemStack.f_41583_;
                                                                                }
                                                                                if (v0.m_41720_() == RojiuramodModItems.OLD_DOOR.get()) ** GOTO lbl-1000
                                                                                if (entity instanceof LivingEntity) {
                                                                                    _livEnt = (LivingEntity)entity;
                                                                                    v1 = _livEnt.m_21205_();
                                                                                } else {
                                                                                    v1 = ItemStack.f_41583_;
                                                                                }
                                                                                if (v1.m_41720_() == RojiuramodModItems.OLD_DOOR_TALL.get()) ** GOTO lbl-1000
                                                                                if (entity instanceof LivingEntity) {
                                                                                    _livEnt = (LivingEntity)entity;
                                                                                    v2 = _livEnt.m_21205_();
                                                                                } else {
                                                                                    v2 = ItemStack.f_41583_;
                                                                                }
                                                                                if (v2.m_41720_() == RojiuramodModItems.ALM_DOOR.get()) lbl-1000:
                                                                                // 3 sources

                                                                                {
                                                                                    if (world instanceof Level) {
                                                                                        ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                                                    }
                                                                                } else if (world instanceof Level) {
                                                                                    ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                                                }
                                                                                if (!(entity instanceof Player)) break block112;
                                                                                _plr = (Player)entity;
                                                                                if (_plr.m_150110_().f_35937_) break block113;
                                                                            }
                                                                            if (entity instanceof LivingEntity) {
                                                                                _livEnt = (LivingEntity)entity;
                                                                                v3 = _livEnt.m_21205_();
                                                                            } else {
                                                                                v3 = ItemStack.f_41583_;
                                                                            }
                                                                            v3.m_41774_(1);
                                                                        }
                                                                        if (entity.m_6350_() == Direction.NORTH) {
                                                                            if (entity.m_20154_().f_82479_ >= -1.0 && entity.m_20154_().f_82479_ <= 0.0) {
                                                                                _value = 4;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                                _value = 5;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            } else {
                                                                                _value = 1;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            }
                                                                        } else if (entity.m_6350_() == Direction.SOUTH) {
                                                                            if (entity.m_20154_().f_82479_ >= 0.0 && entity.m_20154_().f_82479_ <= 1.0) {
                                                                                _value = 4;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                                _value = 5;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            } else {
                                                                                _value = 1;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            }
                                                                        } else if (entity.m_6350_() == Direction.WEST) {
                                                                            if (entity.m_20154_().f_82481_ >= 0.0 && entity.m_20154_().f_82481_ <= 1.0) {
                                                                                _value = 4;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                                _value = 5;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            } else {
                                                                                _value = 1;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            }
                                                                        } else if (entity.m_6350_() == Direction.EAST) {
                                                                            if (entity.m_20154_().f_82481_ >= -1.0 && entity.m_20154_().f_82481_ <= 0.0) {
                                                                                _value = 4;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                                _value = 5;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            } else {
                                                                                _value = 1;
                                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                                _bs = world.m_8055_(_pos);
                                                                                var12_32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (var12_32 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var12_32).m_6908_().contains(_value)) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                                }
                                                                            }
                                                                        }
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
                                                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z))) != Direction.NORTH) break block114;
                                                                        if (!world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                                                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z))) != new Object(){

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
                                                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block115;
                                                                        _bs = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                                        if (_bs instanceof IntegerProperty) {
                                                                            _getip50 = (IntegerProperty)_bs;
                                                                            v4 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip50);
                                                                        } else {
                                                                            v4 = -1;
                                                                        }
                                                                        if (v4 == 0) break block116;
                                                                        _bs = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                                        if (_bs instanceof IntegerProperty) {
                                                                            _getip52 = (IntegerProperty)_bs;
                                                                            v5 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip52);
                                                                        } else {
                                                                            v5 = -1;
                                                                        }
                                                                        if (v5 != 2) break block117;
                                                                    }
                                                                    _value = 4;
                                                                    _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                                    _bs = world.m_8055_(_pos);
                                                                    var14_34 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                    if (var14_34 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_34).m_6908_().contains(_value)) {
                                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                    }
                                                                    _value = 5;
                                                                    _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                                    _bs = world.m_8055_(_pos);
                                                                    var14_34 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                                    if (var14_34 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_34).m_6908_().contains(_value)) {
                                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                                    }
                                                                    break block117;
                                                                }
                                                                if (!world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                                                                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z))) != new Object(){

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
                                                                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block117;
                                                                _value = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                                if (_value instanceof IntegerProperty) {
                                                                    _getip63 = (IntegerProperty)_value;
                                                                    v6 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip63);
                                                                } else {
                                                                    v6 = -1;
                                                                }
                                                                if (v6 == 4) break block118;
                                                                _value = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                                if (_value instanceof IntegerProperty) {
                                                                    _getip65 = (IntegerProperty)_value;
                                                                    v7 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip65);
                                                                } else {
                                                                    v7 = -1;
                                                                }
                                                                if (v7 != 6) break block117;
                                                            }
                                                            _value = 0;
                                                            _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                            _bs = world.m_8055_(_pos);
                                                            var14_35 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                            if (var14_35 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_35).m_6908_().contains(_value)) {
                                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                            }
                                                            _value = 1;
                                                            _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                            _bs = world.m_8055_(_pos);
                                                            var14_35 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                            if (var14_35 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_35).m_6908_().contains(_value)) {
                                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                            }
                                                            break block117;
                                                        }
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
                                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z))) != Direction.SOUTH) break block119;
                                                        if (!world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z))) != new Object(){

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
                                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block120;
                                                        _value = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                        if (_value instanceof IntegerProperty) {
                                                            _getip79 = (IntegerProperty)_value;
                                                            v8 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip79);
                                                        } else {
                                                            v8 = -1;
                                                        }
                                                        if (v8 == 0) break block121;
                                                        _value = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                        if (_value instanceof IntegerProperty) {
                                                            _getip81 = (IntegerProperty)_value;
                                                            v9 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip81);
                                                        } else {
                                                            v9 = -1;
                                                        }
                                                        if (v9 != 2) break block117;
                                                    }
                                                    _value = 4;
                                                    _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                    _bs = world.m_8055_(_pos);
                                                    var14_36 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                    if (var14_36 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_36).m_6908_().contains(_value)) {
                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                    }
                                                    _value = 5;
                                                    _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                                    _bs = world.m_8055_(_pos);
                                                    var14_36 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                    if (var14_36 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_36).m_6908_().contains(_value)) {
                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                    }
                                                    break block117;
                                                }
                                                if (!world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                                                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z))) != new Object(){

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
                                                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block117;
                                                _value = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                if (_value instanceof IntegerProperty) {
                                                    _getip92 = (IntegerProperty)_value;
                                                    v10 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip92);
                                                } else {
                                                    v10 = -1;
                                                }
                                                if (v10 == 4) break block122;
                                                _value = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                                if (_value instanceof IntegerProperty) {
                                                    _getip94 = (IntegerProperty)_value;
                                                    v11 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_61143_((Property)_getip94);
                                                } else {
                                                    v11 = -1;
                                                }
                                                if (v11 != 6) break block117;
                                            }
                                            _value = 0;
                                            _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                            _bs = world.m_8055_(_pos);
                                            var14_37 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                            if (var14_37 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_37).m_6908_().contains(_value)) {
                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                            }
                                            _value = 1;
                                            _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                            _bs = world.m_8055_(_pos);
                                            var14_37 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                            if (var14_37 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_37).m_6908_().contains(_value)) {
                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                            }
                                            break block117;
                                        }
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
                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z))) != Direction.WEST) break block123;
                                        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0)))) != new Object(){

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
                                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block124;
                                        _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                                        if (_value instanceof IntegerProperty) {
                                            _getip108 = (IntegerProperty)_value;
                                            v12 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_61143_((Property)_getip108);
                                        } else {
                                            v12 = -1;
                                        }
                                        if (v12 == 0) break block125;
                                        _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                                        if (_value instanceof IntegerProperty) {
                                            _getip110 = (IntegerProperty)_value;
                                            v13 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_61143_((Property)_getip110);
                                        } else {
                                            v13 = -1;
                                        }
                                        if (v13 != 2) break block117;
                                    }
                                    _value = 4;
                                    _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                    _bs = world.m_8055_(_pos);
                                    var14_38 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (var14_38 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_38).m_6908_().contains(_value)) {
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                    }
                                    _value = 5;
                                    _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                                    _bs = world.m_8055_(_pos);
                                    var14_38 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (var14_38 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_38).m_6908_().contains(_value)) {
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                    }
                                    break block117;
                                }
                                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0)))) != new Object(){

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
                                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block117;
                                _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value instanceof IntegerProperty) {
                                    _getip121 = (IntegerProperty)_value;
                                    v14 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_61143_((Property)_getip121);
                                } else {
                                    v14 = -1;
                                }
                                if (v14 == 4) break block126;
                                _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value instanceof IntegerProperty) {
                                    _getip123 = (IntegerProperty)_value;
                                    v15 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_61143_((Property)_getip123);
                                } else {
                                    v15 = -1;
                                }
                                if (v15 != 6) break block117;
                            }
                            _value = 0;
                            _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                            _bs = world.m_8055_(_pos);
                            var14_39 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var14_39 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_39).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                            _value = 1;
                            _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                            _bs = world.m_8055_(_pos);
                            var14_39 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var14_39 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_39).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                            break block117;
                        }
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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z))) != Direction.EAST) break block117;
                        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0)))) != new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block127;
                        _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value instanceof IntegerProperty) {
                            _getip137 = (IntegerProperty)_value;
                            v16 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_61143_((Property)_getip137);
                        } else {
                            v16 = -1;
                        }
                        if (v16 == 0) break block128;
                        _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value instanceof IntegerProperty) {
                            _getip139 = (IntegerProperty)_value;
                            v17 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_61143_((Property)_getip139);
                        } else {
                            v17 = -1;
                        }
                        if (v17 != 2) break block117;
                    }
                    _value = 4;
                    _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                    _bs = world.m_8055_(_pos);
                    var14_40 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (var14_40 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_40).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 5;
                    _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
                    _bs = world.m_8055_(_pos);
                    var14_40 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (var14_40 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_40).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    break block117;
                }
                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:door"))) || new Object(){

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
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0)))) != new Object(){

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
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)))) break block117;
                _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    _getip150 = (IntegerProperty)_value;
                    v18 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_61143_((Property)_getip150);
                } else {
                    v18 = -1;
                }
                if (v18 == 4) break block129;
                _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    _getip152 = (IntegerProperty)_value;
                    v19 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_61143_((Property)_getip152);
                } else {
                    v19 = -1;
                }
                if (v19 != 6) break block117;
            }
            _value = 0;
            _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
            _bs = world.m_8055_(_pos);
            var14_41 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (var14_41 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_41).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            _value = 1;
            _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
            _bs = world.m_8055_(_pos);
            var14_41 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (var14_41 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var14_41).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        }
    }
}

