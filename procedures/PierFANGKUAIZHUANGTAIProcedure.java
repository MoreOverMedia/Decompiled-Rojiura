/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Direction$Axis
 *  net.minecraft.core.Direction$AxisDirection
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
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModBlocks;

public class PierFANGKUAIZHUANGTAIProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
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
            IntegerProperty _integerProp;
            Property property;
            BlockState _bs;
            BlockPos _pos;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.NORTH) {
                int n;
                Property property2 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (property2 instanceof IntegerProperty) {
                    IntegerProperty _getip9 = (IntegerProperty)property2;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip9);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 3;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n2;
                    Property _value = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip13 = (IntegerProperty)_value;
                        n2 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip13);
                    } else {
                        n2 = -1;
                    }
                    if (n2 == 0) {
                        int _value2 = 2;
                        _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value2)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                        }
                        _value2 = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value2)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.NORTH)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip22 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip22);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value3 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value3)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                    }
                } else {
                    int n3;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip25 = (IntegerProperty)_value;
                        n3 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip25);
                    } else {
                        n3 = -1;
                    }
                    if (n3 == 1) {
                        int _value4 = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value4)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                        }
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.NORTH) {
                int n;
                Property _value4 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip33 = (IntegerProperty)_value4;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip33);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 2;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n4;
                    _value4 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value4 instanceof IntegerProperty) {
                        IntegerProperty _getip37 = (IntegerProperty)_value4;
                        n4 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip37);
                    } else {
                        n4 = -1;
                    }
                    if (n4 == 0) {
                        int _value = 3;
                        _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        _value = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.NORTH)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip46 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip46);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value5 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value5)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                    }
                } else {
                    int n5;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip49 = (IntegerProperty)_value;
                        n5 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip49);
                    } else {
                        n5 = -1;
                    }
                    if (n5 == 1) {
                        int _value6 = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value6)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                        }
                    }
                }
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
            IntegerProperty _integerProp;
            Property property;
            BlockState _bs;
            BlockPos _pos;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.SOUTH) {
                int n;
                Property _value6 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value6 instanceof IntegerProperty) {
                    IntegerProperty _getip60 = (IntegerProperty)_value6;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip60);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 2;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n6;
                    _value6 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value6 instanceof IntegerProperty) {
                        IntegerProperty _getip64 = (IntegerProperty)_value6;
                        n6 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip64);
                    } else {
                        n6 = -1;
                    }
                    if (n6 == 0) {
                        int _value = 3;
                        _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        _value = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.SOUTH)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip73 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip73);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value7 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value7)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                    }
                } else {
                    int n7;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip76 = (IntegerProperty)_value;
                        n7 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip76);
                    } else {
                        n7 = -1;
                    }
                    if (n7 == 1) {
                        int _value8 = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value8)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
                        }
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.SOUTH) {
                int n;
                Property _value8 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip84 = (IntegerProperty)_value8;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip84);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 3;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n8;
                    _value8 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value8 instanceof IntegerProperty) {
                        IntegerProperty _getip88 = (IntegerProperty)_value8;
                        n8 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip88);
                    } else {
                        n8 = -1;
                    }
                    if (n8 == 0) {
                        int _value = 2;
                        _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        _value = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.SOUTH)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip97 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip97);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value9 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value9)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value9)), 3);
                    }
                } else {
                    int n9;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip100 = (IntegerProperty)_value;
                        n9 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip100);
                    } else {
                        n9 = -1;
                    }
                    if (n9 == 1) {
                        int _value10 = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value10)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
                        }
                    }
                }
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
            IntegerProperty _integerProp;
            Property property;
            BlockState _bs;
            BlockPos _pos;
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == Direction.WEST) {
                int n;
                Property _value10 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value10 instanceof IntegerProperty) {
                    IntegerProperty _getip111 = (IntegerProperty)_value10;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip111);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 2;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n10;
                    _value10 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value10 instanceof IntegerProperty) {
                        IntegerProperty _getip115 = (IntegerProperty)_value10;
                        n10 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip115);
                    } else {
                        n10 = -1;
                    }
                    if (n10 == 0) {
                        int _value = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        _value = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == Direction.WEST)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip124 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip124);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value11 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value11)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
                    }
                } else {
                    int n11;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip127 = (IntegerProperty)_value;
                        n11 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip127);
                    } else {
                        n11 = -1;
                    }
                    if (n11 == 1) {
                        int _value12 = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value12)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
                        }
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == Direction.WEST) {
                int n;
                Property _value12 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value12 instanceof IntegerProperty) {
                    IntegerProperty _getip135 = (IntegerProperty)_value12;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip135);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 3;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n12;
                    _value12 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value12 instanceof IntegerProperty) {
                        IntegerProperty _getip139 = (IntegerProperty)_value12;
                        n12 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip139);
                    } else {
                        n12 = -1;
                    }
                    if (n12 == 0) {
                        int _value = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        _value = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == Direction.WEST)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip148 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip148);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value13 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value13)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value13)), 3);
                    }
                } else {
                    int n13;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip151 = (IntegerProperty)_value;
                        n13 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip151);
                    } else {
                        n13 = -1;
                    }
                    if (n13 == 1) {
                        int _value14 = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value14)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
                        }
                    }
                }
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
            IntegerProperty _integerProp;
            Property property;
            BlockState _bs;
            BlockPos _pos;
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == Direction.EAST) {
                int n;
                Property _value14 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value14 instanceof IntegerProperty) {
                    IntegerProperty _getip162 = (IntegerProperty)_value14;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip162);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 3;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n14;
                    _value14 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value14 instanceof IntegerProperty) {
                        IntegerProperty _getip166 = (IntegerProperty)_value14;
                        n14 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip166);
                    } else {
                        n14 = -1;
                    }
                    if (n14 == 0) {
                        int _value = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        _value = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == Direction.EAST)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip175 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip175);
                } else {
                    n = -1;
                }
                if (n == 3) {
                    int _value15 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value15)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value15)), 3);
                    }
                } else {
                    int n15;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip178 = (IntegerProperty)_value;
                        n15 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip178);
                    } else {
                        n15 = -1;
                    }
                    if (n15 == 1) {
                        int _value16 = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value16)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value16)), 3);
                        }
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == Direction.EAST) {
                int n;
                Property _value16 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value16 instanceof IntegerProperty) {
                    IntegerProperty _getip186 = (IntegerProperty)_value16;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip186);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value = 1;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    _value = 2;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    int n16;
                    _value16 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value16 instanceof IntegerProperty) {
                        IntegerProperty _getip190 = (IntegerProperty)_value16;
                        n16 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip190);
                    } else {
                        n16 = -1;
                    }
                    if (n16 == 0) {
                        int _value = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        _value = 2;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            } else if (!(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.PIER.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == Direction.EAST)) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip199 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip199);
                } else {
                    n = -1;
                }
                if (n == 2) {
                    int _value17 = 0;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value17)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value17)), 3);
                    }
                } else {
                    int n17;
                    _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip202 = (IntegerProperty)_value;
                        n17 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip202);
                    } else {
                        n17 = -1;
                    }
                    if (n17 == 1) {
                        int _value18 = 3;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value18)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value18)), 3);
                        }
                    }
                }
            }
        }
    }
}

