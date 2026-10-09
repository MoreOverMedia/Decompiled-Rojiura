/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Direction$Axis
 *  net.minecraft.core.Direction$AxisDirection
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.tags.BlockTags
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class Totan815Procedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        Property _value49;
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
            Property _value22;
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                Property property = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip6 = (IntegerProperty)property;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip6);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n2;
                    property = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty) {
                        IntegerProperty _getip8 = (IntegerProperty)property;
                        n2 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip8);
                    } else {
                        n2 = -1;
                    }
                    if (n2 <= 23 && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) != new Object(){

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
                    }.getDirection(blockstate) && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) != new Object(){

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
                    }.getDirection(blockstate).m_122424_()) {
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
                        }.getDirection(blockstate).m_175364_(Direction.Axis.Y) == new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))))) {
                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                int _value3 = 12;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property2 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property2;
                                if (!_integerProp.m_6908_().contains(_value3)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                                return;
                            }
                            int _value4 = 20;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property3 instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property3;
                            if (!_integerProp.m_6908_().contains(_value4)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                            return;
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
                        }.getDirection(blockstate).m_175362_(Direction.Axis.Y) != new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))))) return;
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value5 = 13;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property4 instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property4;
                            if (!_integerProp.m_6908_().contains(_value5)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                            return;
                        }
                        int _value22 = 21;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property5 instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property5;
                        if (!_integerProp.m_6908_().contains(_value22)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value22)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value22 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value22 instanceof IntegerProperty) {
                    IntegerProperty _getip41 = (IntegerProperty)_value22;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip41);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n3;
                    _value22 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value22 instanceof IntegerProperty) {
                        IntegerProperty _getip43 = (IntegerProperty)_value22;
                        n3 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip43);
                    } else {
                        n3 = -1;
                    }
                    if (n3 <= 23 && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) != new Object(){

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
                    }.getDirection(blockstate) && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) != new Object(){

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
                    }.getDirection(blockstate).m_122424_()) {
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
                        }.getDirection(blockstate).m_175362_(Direction.Axis.Y) == new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))))) {
                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                int _value6 = 14;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value6)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                                return;
                            }
                            int _value7 = 22;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value7)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                            return;
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
                        }.getDirection(blockstate).m_175364_(Direction.Axis.Y) != new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))))) return;
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value8 = 15;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value8)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
                            return;
                        }
                        int _value9 = 23;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value9)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value9)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value22 instanceof IntegerProperty) {
                    IntegerProperty _getip76 = (IntegerProperty)_value22;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip76);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n4;
                    _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value22 instanceof IntegerProperty) {
                        IntegerProperty _getip78 = (IntegerProperty)_value22;
                        n4 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip78);
                    } else {
                        n4 = -1;
                    }
                    if (n4 <= 23 && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n5;
                        _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value22 instanceof IntegerProperty) {
                            IntegerProperty _getip82 = (IntegerProperty)_value22;
                            n5 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip82);
                        } else {
                            n5 = -1;
                        }
                        if (n5 >= 8) {
                            int n6;
                            _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value22 instanceof IntegerProperty) {
                                IntegerProperty _getip84 = (IntegerProperty)_value22;
                                n6 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip84);
                            } else {
                                n6 = -1;
                            }
                            if (n6 <= 23) {
                                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                    int _value10 = 10;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property;
                                    if (!_integerProp.m_6908_().contains(_value10)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
                                    return;
                                }
                                int _value11 = 18;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value11)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
                                return;
                            }
                        }
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value22 instanceof IntegerProperty) {
                    IntegerProperty _getip91 = (IntegerProperty)_value22;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip91);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n7;
                    _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value22 instanceof IntegerProperty) {
                        IntegerProperty _getip93 = (IntegerProperty)_value22;
                        n7 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip93);
                    } else {
                        n7 = -1;
                    }
                    if (n7 <= 23) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value12 = 9;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value12)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
                            return;
                        }
                        int _value13 = 17;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value13)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value13)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value22 instanceof IntegerProperty) {
                    IntegerProperty _getip100 = (IntegerProperty)_value22;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip100);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n8;
                    _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value22 instanceof IntegerProperty) {
                        IntegerProperty _getip102 = (IntegerProperty)_value22;
                        n8 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip102);
                    } else {
                        n8 = -1;
                    }
                    if (n8 <= 23) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value14 = 11;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value14)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
                            return;
                        }
                        int _value15 = 19;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value15)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value15)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                int _value16 = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value16)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value16)), 3);
                return;
            }
            int _value17 = 16;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value17)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value17)), 3);
            return;
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
        }.getDirection(blockstate) == Direction.SOUTH) {
            Property _value17;
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value17 instanceof IntegerProperty) {
                    IntegerProperty _getip115 = (IntegerProperty)_value17;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip115);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n9;
                    _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value17 instanceof IntegerProperty) {
                        IntegerProperty _getip117 = (IntegerProperty)_value17;
                        n9 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip117);
                    } else {
                        n9 = -1;
                    }
                    if (n9 <= 23 && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) != new Object(){

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
                    }.getDirection(blockstate) && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) != new Object(){

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
                    }.getDirection(blockstate).m_122424_()) {
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
                        }.getDirection(blockstate).m_175364_(Direction.Axis.Y) == new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))))) {
                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                int _value18 = 12;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value18)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value18)), 3);
                                return;
                            }
                            int _value19 = 20;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value19)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value19)), 3);
                            return;
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
                        }.getDirection(blockstate).m_175362_(Direction.Axis.Y) != new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))))) return;
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value20 = 13;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value20)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value20)), 3);
                            return;
                        }
                        int _value21 = 21;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value21)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value21)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value17 instanceof IntegerProperty) {
                    IntegerProperty _getip150 = (IntegerProperty)_value17;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip150);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n10;
                    _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value17 instanceof IntegerProperty) {
                        IntegerProperty _getip152 = (IntegerProperty)_value17;
                        n10 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip152);
                    } else {
                        n10 = -1;
                    }
                    if (n10 <= 23 && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) != new Object(){

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
                    }.getDirection(blockstate) && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) != new Object(){

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
                    }.getDirection(blockstate).m_122424_()) {
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
                        }.getDirection(blockstate).m_175362_(Direction.Axis.Y) == new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))))) {
                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                int _value22 = 14;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value22)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value22)), 3);
                                return;
                            }
                            int _value23 = 22;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value23)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value23)), 3);
                            return;
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
                        }.getDirection(blockstate).m_175364_(Direction.Axis.Y) != new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))))) return;
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value24 = 15;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value24)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value24)), 3);
                            return;
                        }
                        int _value25 = 23;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value25)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value25)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value17 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value17 instanceof IntegerProperty) {
                    IntegerProperty _getip185 = (IntegerProperty)_value17;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip185);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n11;
                    _value17 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value17 instanceof IntegerProperty) {
                        IntegerProperty _getip187 = (IntegerProperty)_value17;
                        n11 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip187);
                    } else {
                        n11 = -1;
                    }
                    if (n11 <= 23 && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n12;
                        _value17 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value17 instanceof IntegerProperty) {
                            IntegerProperty _getip191 = (IntegerProperty)_value17;
                            n12 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip191);
                        } else {
                            n12 = -1;
                        }
                        if (n12 >= 8) {
                            int n13;
                            _value17 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value17 instanceof IntegerProperty) {
                                IntegerProperty _getip193 = (IntegerProperty)_value17;
                                n13 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip193);
                            } else {
                                n13 = -1;
                            }
                            if (n13 <= 23) {
                                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                    int _value26 = 10;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property;
                                    if (!_integerProp.m_6908_().contains(_value26)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value26)), 3);
                                    return;
                                }
                                int _value27 = 18;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value27)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value27)), 3);
                                return;
                            }
                        }
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value17 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value17 instanceof IntegerProperty) {
                    IntegerProperty _getip200 = (IntegerProperty)_value17;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip200);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n14;
                    _value17 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value17 instanceof IntegerProperty) {
                        IntegerProperty _getip202 = (IntegerProperty)_value17;
                        n14 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip202);
                    } else {
                        n14 = -1;
                    }
                    if (n14 <= 23) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value28 = 9;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value28)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value28)), 3);
                            return;
                        }
                        int _value29 = 17;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value29)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value29)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value17 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value17 instanceof IntegerProperty) {
                    IntegerProperty _getip209 = (IntegerProperty)_value17;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip209);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n15;
                    _value17 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value17 instanceof IntegerProperty) {
                        IntegerProperty _getip211 = (IntegerProperty)_value17;
                        n15 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip211);
                    } else {
                        n15 = -1;
                    }
                    if (n15 <= 23) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value30 = 11;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value30)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value30)), 3);
                            return;
                        }
                        int _value31 = 19;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value31)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value31)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                int _value32 = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value32)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value32)), 3);
                return;
            }
            int _value33 = 16;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value33)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value33)), 3);
            return;
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
        }.getDirection(blockstate) == Direction.WEST) {
            Property _value33;
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value33 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value33 instanceof IntegerProperty) {
                    IntegerProperty _getip224 = (IntegerProperty)_value33;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip224);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n16;
                    _value33 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value33 instanceof IntegerProperty) {
                        IntegerProperty _getip226 = (IntegerProperty)_value33;
                        n16 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip226);
                    } else {
                        n16 = -1;
                    }
                    if (n16 <= 23 && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) != new Object(){

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
                    }.getDirection(blockstate) && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) != new Object(){

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
                    }.getDirection(blockstate).m_122424_()) {
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
                        }.getDirection(blockstate).m_175364_(Direction.Axis.Y) == new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)))) {
                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                int _value34 = 12;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value34)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value34)), 3);
                                return;
                            }
                            int _value35 = 20;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value35)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value35)), 3);
                            return;
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
                        }.getDirection(blockstate).m_175362_(Direction.Axis.Y) != new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)))) return;
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value36 = 13;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value36)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value36)), 3);
                            return;
                        }
                        int _value37 = 21;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value37)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value37)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value33 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value33 instanceof IntegerProperty) {
                    IntegerProperty _getip259 = (IntegerProperty)_value33;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip259);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n17;
                    _value33 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value33 instanceof IntegerProperty) {
                        IntegerProperty _getip261 = (IntegerProperty)_value33;
                        n17 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip261);
                    } else {
                        n17 = -1;
                    }
                    if (n17 <= 23 && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) != new Object(){

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
                    }.getDirection(blockstate) && new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) != new Object(){

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
                    }.getDirection(blockstate).m_122424_()) {
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
                        }.getDirection(blockstate).m_175362_(Direction.Axis.Y) == new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)))) {
                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                int _value38 = 14;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value38)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value38)), 3);
                                return;
                            }
                            int _value39 = 22;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value39)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value39)), 3);
                            return;
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
                        }.getDirection(blockstate).m_175364_(Direction.Axis.Y) != new Object(){

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
                        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)))) return;
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value40 = 15;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value40)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value40)), 3);
                            return;
                        }
                        int _value41 = 23;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value41)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value41)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value33 instanceof IntegerProperty) {
                    IntegerProperty _getip294 = (IntegerProperty)_value33;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip294);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n18;
                    _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value33 instanceof IntegerProperty) {
                        IntegerProperty _getip296 = (IntegerProperty)_value33;
                        n18 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip296);
                    } else {
                        n18 = -1;
                    }
                    if (n18 <= 23 && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n19;
                        _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value33 instanceof IntegerProperty) {
                            IntegerProperty _getip300 = (IntegerProperty)_value33;
                            n19 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip300);
                        } else {
                            n19 = -1;
                        }
                        if (n19 >= 8) {
                            int n20;
                            _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value33 instanceof IntegerProperty) {
                                IntegerProperty _getip302 = (IntegerProperty)_value33;
                                n20 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip302);
                            } else {
                                n20 = -1;
                            }
                            if (n20 <= 23) {
                                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                    int _value42 = 10;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property;
                                    if (!_integerProp.m_6908_().contains(_value42)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value42)), 3);
                                    return;
                                }
                                int _value43 = 18;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value43)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value43)), 3);
                                return;
                            }
                        }
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value33 instanceof IntegerProperty) {
                    IntegerProperty _getip309 = (IntegerProperty)_value33;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip309);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n21;
                    _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value33 instanceof IntegerProperty) {
                        IntegerProperty _getip311 = (IntegerProperty)_value33;
                        n21 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip311);
                    } else {
                        n21 = -1;
                    }
                    if (n21 <= 23) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value44 = 9;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value44)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value44)), 3);
                            return;
                        }
                        int _value45 = 17;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value45)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value45)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                int n;
                _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value33 instanceof IntegerProperty) {
                    IntegerProperty _getip318 = (IntegerProperty)_value33;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip318);
                } else {
                    n = -1;
                }
                if (n >= 8) {
                    int n22;
                    _value33 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value33 instanceof IntegerProperty) {
                        IntegerProperty _getip320 = (IntegerProperty)_value33;
                        n22 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip320);
                    } else {
                        n22 = -1;
                    }
                    if (n22 <= 23) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value46 = 11;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value46)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value46)), 3);
                            return;
                        }
                        int _value47 = 19;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value47)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value47)), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                int _value48 = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value48)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value48)), 3);
                return;
            }
            int _value49 = 16;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value49)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value49)), 3);
            return;
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
        }.getDirection(blockstate) != Direction.EAST) return;
        if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
            int n;
            _value49 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
            if (_value49 instanceof IntegerProperty) {
                IntegerProperty _getip333 = (IntegerProperty)_value49;
                n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip333);
            } else {
                n = -1;
            }
            if (n >= 8) {
                int n23;
                _value49 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value49 instanceof IntegerProperty) {
                    IntegerProperty _getip335 = (IntegerProperty)_value49;
                    n23 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip335);
                } else {
                    n23 = -1;
                }
                if (n23 <= 23 && new Object(){

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
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) != new Object(){

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
                }.getDirection(blockstate) && new Object(){

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
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) != new Object(){

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
                }.getDirection(blockstate).m_122424_()) {
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
                    }.getDirection(blockstate).m_175364_(Direction.Axis.Y) == new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)))) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value50 = 12;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value50)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value50)), 3);
                            return;
                        }
                        int _value51 = 20;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value51)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value51)), 3);
                        return;
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
                    }.getDirection(blockstate).m_175362_(Direction.Axis.Y) != new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)))) return;
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                        int _value52 = 13;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value52)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value52)), 3);
                        return;
                    }
                    int _value53 = 21;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value53)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value53)), 3);
                    return;
                }
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
            int n;
            _value49 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
            if (_value49 instanceof IntegerProperty) {
                IntegerProperty _getip368 = (IntegerProperty)_value49;
                n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip368);
            } else {
                n = -1;
            }
            if (n >= 8) {
                int n24;
                _value49 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value49 instanceof IntegerProperty) {
                    IntegerProperty _getip370 = (IntegerProperty)_value49;
                    n24 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip370);
                } else {
                    n24 = -1;
                }
                if (n24 <= 23 && new Object(){

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
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) != new Object(){

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
                }.getDirection(blockstate) && new Object(){

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
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) != new Object(){

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
                }.getDirection(blockstate).m_122424_()) {
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
                    }.getDirection(blockstate).m_175362_(Direction.Axis.Y) == new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)))) {
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                            int _value54 = 14;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value54)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value54)), 3);
                            return;
                        }
                        int _value55 = 22;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value55)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value55)), 3);
                        return;
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
                    }.getDirection(blockstate).m_175364_(Direction.Axis.Y) != new Object(){

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
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)))) return;
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                        int _value56 = 15;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value56)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value56)), 3);
                        return;
                    }
                    int _value57 = 23;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value57)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value57)), 3);
                    return;
                }
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
            int n;
            _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
            if (_value49 instanceof IntegerProperty) {
                IntegerProperty _getip403 = (IntegerProperty)_value49;
                n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip403);
            } else {
                n = -1;
            }
            if (n >= 8) {
                int n25;
                _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value49 instanceof IntegerProperty) {
                    IntegerProperty _getip405 = (IntegerProperty)_value49;
                    n25 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip405);
                } else {
                    n25 = -1;
                }
                if (n25 <= 23 && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                    int n26;
                    _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value49 instanceof IntegerProperty) {
                        IntegerProperty _getip409 = (IntegerProperty)_value49;
                        n26 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip409);
                    } else {
                        n26 = -1;
                    }
                    if (n26 >= 8) {
                        int n27;
                        _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value49 instanceof IntegerProperty) {
                            IntegerProperty _getip411 = (IntegerProperty)_value49;
                            n27 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip411);
                        } else {
                            n27 = -1;
                        }
                        if (n27 <= 23) {
                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                                int _value58 = 10;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property;
                                if (!_integerProp.m_6908_().contains(_value58)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value58)), 3);
                                return;
                            }
                            int _value59 = 18;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property;
                            if (!_integerProp.m_6908_().contains(_value59)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value59)), 3);
                            return;
                        }
                    }
                }
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
            int n;
            _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
            if (_value49 instanceof IntegerProperty) {
                IntegerProperty _getip418 = (IntegerProperty)_value49;
                n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip418);
            } else {
                n = -1;
            }
            if (n >= 8) {
                int n28;
                _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value49 instanceof IntegerProperty) {
                    IntegerProperty _getip420 = (IntegerProperty)_value49;
                    n28 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip420);
                } else {
                    n28 = -1;
                }
                if (n28 <= 23) {
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                        int _value60 = 9;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value60)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value60)), 3);
                        return;
                    }
                    int _value61 = 17;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value61)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value61)), 3);
                    return;
                }
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
            int n;
            _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
            if (_value49 instanceof IntegerProperty) {
                IntegerProperty _getip427 = (IntegerProperty)_value49;
                n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip427);
            } else {
                n = -1;
            }
            if (n >= 8) {
                int n29;
                _value49 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value49 instanceof IntegerProperty) {
                    IntegerProperty _getip429 = (IntegerProperty)_value49;
                    n29 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip429);
                } else {
                    n29 = -1;
                }
                if (n29 <= 23) {
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                        int _value62 = 11;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value62)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value62)), 3);
                        return;
                    }
                    int _value63 = 19;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value63)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value63)), 3);
                    return;
                }
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
            int _value64 = 8;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value64)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value64)), 3);
            return;
        }
        int _value65 = 16;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs = world.m_8055_(_pos);
        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property;
        if (!_integerProp.m_6908_().contains(_value65)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value65)), 3);
    }
}

