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

public class EngawaDangPiLinFangKuaiGengXinShiProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        int n;
        int n2;
        int n3;
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
            int n4;
            int n5;
            int n6;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n7;
                int n8;
                Property _value2;
                int n9;
                Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip9 = (IntegerProperty)property;
                    n9 = (Integer)blockstate.m_61143_((Property)_getip9);
                } else {
                    n9 = -1;
                }
                if (n9 >= 1) {
                    int n10;
                    property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty) {
                        IntegerProperty _getip11 = (IntegerProperty)property;
                        n10 = (Integer)blockstate.m_61143_((Property)_getip11);
                    } else {
                        n10 = -1;
                    }
                    if (n10 <= 5) {
                        int _value2 = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property2 instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property2;
                        if (!_integerProp.m_6908_().contains(_value2)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip14 = (IntegerProperty)_value2;
                    n8 = (Integer)blockstate.m_61143_((Property)_getip14);
                } else {
                    n8 = -1;
                }
                if (n8 < 6) return;
                _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip16 = (IntegerProperty)_value2;
                    n7 = (Integer)blockstate.m_61143_((Property)_getip16);
                } else {
                    n7 = -1;
                }
                if (n7 > 10) return;
                int _value2 = 6;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property3 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property3;
                if (!_integerProp.m_6908_().contains(_value2)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n11;
                int n12;
                int n13;
                Property _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip24 = (IntegerProperty)_value2;
                    n13 = (Integer)blockstate.m_61143_((Property)_getip24);
                } else {
                    n13 = -1;
                }
                if (n13 >= 1) {
                    int n14;
                    _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value2 instanceof IntegerProperty) {
                        IntegerProperty _getip26 = (IntegerProperty)_value2;
                        n14 = (Integer)blockstate.m_61143_((Property)_getip26);
                    } else {
                        n14 = -1;
                    }
                    if (n14 <= 5) {
                        int _value = 2;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip29 = (IntegerProperty)_value2;
                    n12 = (Integer)blockstate.m_61143_((Property)_getip29);
                } else {
                    n12 = -1;
                }
                if (n12 < 6) return;
                _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip31 = (IntegerProperty)_value2;
                    n11 = (Integer)blockstate.m_61143_((Property)_getip31);
                } else {
                    n11 = -1;
                }
                if (n11 > 10) return;
                int _value = 7;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n15;
                int n16;
                int n17;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip39 = (IntegerProperty)_value;
                    n17 = (Integer)blockstate.m_61143_((Property)_getip39);
                } else {
                    n17 = -1;
                }
                if (n17 >= 1) {
                    int n18;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip41 = (IntegerProperty)_value;
                        n18 = (Integer)blockstate.m_61143_((Property)_getip41);
                    } else {
                        n18 = -1;
                    }
                    if (n18 <= 5) {
                        int _value3 = 3;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value3)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip44 = (IntegerProperty)_value;
                    n16 = (Integer)blockstate.m_61143_((Property)_getip44);
                } else {
                    n16 = -1;
                }
                if (n16 < 6) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip46 = (IntegerProperty)_value;
                    n15 = (Integer)blockstate.m_61143_((Property)_getip46);
                } else {
                    n15 = -1;
                }
                if (n15 > 10) return;
                int _value3 = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value3)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n19;
                int n20;
                int n21;
                Property _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value3 instanceof IntegerProperty) {
                    IntegerProperty _getip54 = (IntegerProperty)_value3;
                    n21 = (Integer)blockstate.m_61143_((Property)_getip54);
                } else {
                    n21 = -1;
                }
                if (n21 >= 1) {
                    int n22;
                    _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value3 instanceof IntegerProperty) {
                        IntegerProperty _getip56 = (IntegerProperty)_value3;
                        n22 = (Integer)blockstate.m_61143_((Property)_getip56);
                    } else {
                        n22 = -1;
                    }
                    if (n22 <= 5) {
                        int _value = 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip59 = (IntegerProperty)_value3;
                    n20 = (Integer)blockstate.m_61143_((Property)_getip59);
                } else {
                    n20 = -1;
                }
                if (n20 < 6) return;
                _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value3 instanceof IntegerProperty) {
                    IntegerProperty _getip61 = (IntegerProperty)_value3;
                    n19 = (Integer)blockstate.m_61143_((Property)_getip61);
                } else {
                    n19 = -1;
                }
                if (n19 > 10) return;
                int _value = 9;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip64 = (IntegerProperty)_value;
                n6 = (Integer)blockstate.m_61143_((Property)_getip64);
            } else {
                n6 = -1;
            }
            if (n6 >= 1) {
                int n23;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip66 = (IntegerProperty)_value;
                    n23 = (Integer)blockstate.m_61143_((Property)_getip66);
                } else {
                    n23 = -1;
                }
                if (n23 <= 5) {
                    int _value4 = 5;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value4)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip69 = (IntegerProperty)_value;
                n5 = (Integer)blockstate.m_61143_((Property)_getip69);
            } else {
                n5 = -1;
            }
            if (n5 < 6) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip71 = (IntegerProperty)_value;
                n4 = (Integer)blockstate.m_61143_((Property)_getip71);
            } else {
                n4 = -1;
            }
            if (n4 > 10) return;
            int _value4 = 10;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
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
        }.getDirection(blockstate) == Direction.EAST) {
            int n24;
            int n25;
            int n26;
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n27;
                int n28;
                int n29;
                Property _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip82 = (IntegerProperty)_value4;
                    n29 = (Integer)blockstate.m_61143_((Property)_getip82);
                } else {
                    n29 = -1;
                }
                if (n29 >= 1) {
                    int n30;
                    _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value4 instanceof IntegerProperty) {
                        IntegerProperty _getip84 = (IntegerProperty)_value4;
                        n30 = (Integer)blockstate.m_61143_((Property)_getip84);
                    } else {
                        n30 = -1;
                    }
                    if (n30 <= 5) {
                        int _value = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip87 = (IntegerProperty)_value4;
                    n28 = (Integer)blockstate.m_61143_((Property)_getip87);
                } else {
                    n28 = -1;
                }
                if (n28 < 6) return;
                _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip89 = (IntegerProperty)_value4;
                    n27 = (Integer)blockstate.m_61143_((Property)_getip89);
                } else {
                    n27 = -1;
                }
                if (n27 > 10) return;
                int _value = 6;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n31;
                int n32;
                int n33;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip97 = (IntegerProperty)_value;
                    n33 = (Integer)blockstate.m_61143_((Property)_getip97);
                } else {
                    n33 = -1;
                }
                if (n33 >= 1) {
                    int n34;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip99 = (IntegerProperty)_value;
                        n34 = (Integer)blockstate.m_61143_((Property)_getip99);
                    } else {
                        n34 = -1;
                    }
                    if (n34 <= 5) {
                        int _value5 = 2;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value5)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip102 = (IntegerProperty)_value;
                    n32 = (Integer)blockstate.m_61143_((Property)_getip102);
                } else {
                    n32 = -1;
                }
                if (n32 < 6) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip104 = (IntegerProperty)_value;
                    n31 = (Integer)blockstate.m_61143_((Property)_getip104);
                } else {
                    n31 = -1;
                }
                if (n31 > 10) return;
                int _value5 = 7;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value5)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n35;
                int n36;
                int n37;
                Property _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value5 instanceof IntegerProperty) {
                    IntegerProperty _getip112 = (IntegerProperty)_value5;
                    n37 = (Integer)blockstate.m_61143_((Property)_getip112);
                } else {
                    n37 = -1;
                }
                if (n37 >= 1) {
                    int n38;
                    _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value5 instanceof IntegerProperty) {
                        IntegerProperty _getip114 = (IntegerProperty)_value5;
                        n38 = (Integer)blockstate.m_61143_((Property)_getip114);
                    } else {
                        n38 = -1;
                    }
                    if (n38 <= 5) {
                        int _value = 3;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip117 = (IntegerProperty)_value5;
                    n36 = (Integer)blockstate.m_61143_((Property)_getip117);
                } else {
                    n36 = -1;
                }
                if (n36 < 6) return;
                _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value5 instanceof IntegerProperty) {
                    IntegerProperty _getip119 = (IntegerProperty)_value5;
                    n35 = (Integer)blockstate.m_61143_((Property)_getip119);
                } else {
                    n35 = -1;
                }
                if (n35 > 10) return;
                int _value = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n39;
                int n40;
                int n41;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip127 = (IntegerProperty)_value;
                    n41 = (Integer)blockstate.m_61143_((Property)_getip127);
                } else {
                    n41 = -1;
                }
                if (n41 >= 1) {
                    int n42;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip129 = (IntegerProperty)_value;
                        n42 = (Integer)blockstate.m_61143_((Property)_getip129);
                    } else {
                        n42 = -1;
                    }
                    if (n42 <= 5) {
                        int _value6 = 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value6)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip132 = (IntegerProperty)_value;
                    n40 = (Integer)blockstate.m_61143_((Property)_getip132);
                } else {
                    n40 = -1;
                }
                if (n40 < 6) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip134 = (IntegerProperty)_value;
                    n39 = (Integer)blockstate.m_61143_((Property)_getip134);
                } else {
                    n39 = -1;
                }
                if (n39 > 10) return;
                int _value6 = 9;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value6)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                return;
            }
            Property _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value6 instanceof IntegerProperty) {
                IntegerProperty _getip137 = (IntegerProperty)_value6;
                n26 = (Integer)blockstate.m_61143_((Property)_getip137);
            } else {
                n26 = -1;
            }
            if (n26 >= 1) {
                int n43;
                _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value6 instanceof IntegerProperty) {
                    IntegerProperty _getip139 = (IntegerProperty)_value6;
                    n43 = (Integer)blockstate.m_61143_((Property)_getip139);
                } else {
                    n43 = -1;
                }
                if (n43 <= 5) {
                    int _value = 5;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip142 = (IntegerProperty)_value6;
                n25 = (Integer)blockstate.m_61143_((Property)_getip142);
            } else {
                n25 = -1;
            }
            if (n25 < 6) return;
            _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value6 instanceof IntegerProperty) {
                IntegerProperty _getip144 = (IntegerProperty)_value6;
                n24 = (Integer)blockstate.m_61143_((Property)_getip144);
            } else {
                n24 = -1;
            }
            if (n24 > 10) return;
            int _value = 10;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
        }.getDirection(blockstate) == Direction.NORTH) {
            int n44;
            int n45;
            int n46;
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n47;
                int n48;
                int n49;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip155 = (IntegerProperty)_value;
                    n49 = (Integer)blockstate.m_61143_((Property)_getip155);
                } else {
                    n49 = -1;
                }
                if (n49 >= 1) {
                    int n50;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip157 = (IntegerProperty)_value;
                        n50 = (Integer)blockstate.m_61143_((Property)_getip157);
                    } else {
                        n50 = -1;
                    }
                    if (n50 <= 5) {
                        int _value7 = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value7)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip160 = (IntegerProperty)_value;
                    n48 = (Integer)blockstate.m_61143_((Property)_getip160);
                } else {
                    n48 = -1;
                }
                if (n48 < 6) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip162 = (IntegerProperty)_value;
                    n47 = (Integer)blockstate.m_61143_((Property)_getip162);
                } else {
                    n47 = -1;
                }
                if (n47 > 10) return;
                int _value7 = 6;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value7)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n51;
                int n52;
                int n53;
                Property _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value7 instanceof IntegerProperty) {
                    IntegerProperty _getip170 = (IntegerProperty)_value7;
                    n53 = (Integer)blockstate.m_61143_((Property)_getip170);
                } else {
                    n53 = -1;
                }
                if (n53 >= 1) {
                    int n54;
                    _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value7 instanceof IntegerProperty) {
                        IntegerProperty _getip172 = (IntegerProperty)_value7;
                        n54 = (Integer)blockstate.m_61143_((Property)_getip172);
                    } else {
                        n54 = -1;
                    }
                    if (n54 <= 5) {
                        int _value = 2;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip175 = (IntegerProperty)_value7;
                    n52 = (Integer)blockstate.m_61143_((Property)_getip175);
                } else {
                    n52 = -1;
                }
                if (n52 < 6) return;
                _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value7 instanceof IntegerProperty) {
                    IntegerProperty _getip177 = (IntegerProperty)_value7;
                    n51 = (Integer)blockstate.m_61143_((Property)_getip177);
                } else {
                    n51 = -1;
                }
                if (n51 > 10) return;
                int _value = 7;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n55;
                int n56;
                int n57;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip185 = (IntegerProperty)_value;
                    n57 = (Integer)blockstate.m_61143_((Property)_getip185);
                } else {
                    n57 = -1;
                }
                if (n57 >= 1) {
                    int n58;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip187 = (IntegerProperty)_value;
                        n58 = (Integer)blockstate.m_61143_((Property)_getip187);
                    } else {
                        n58 = -1;
                    }
                    if (n58 <= 5) {
                        int _value8 = 3;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value8)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip190 = (IntegerProperty)_value;
                    n56 = (Integer)blockstate.m_61143_((Property)_getip190);
                } else {
                    n56 = -1;
                }
                if (n56 < 6) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip192 = (IntegerProperty)_value;
                    n55 = (Integer)blockstate.m_61143_((Property)_getip192);
                } else {
                    n55 = -1;
                }
                if (n55 > 10) return;
                int _value8 = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value8)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
                int n59;
                int n60;
                int n61;
                Property _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip200 = (IntegerProperty)_value8;
                    n61 = (Integer)blockstate.m_61143_((Property)_getip200);
                } else {
                    n61 = -1;
                }
                if (n61 >= 1) {
                    int n62;
                    _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value8 instanceof IntegerProperty) {
                        IntegerProperty _getip202 = (IntegerProperty)_value8;
                        n62 = (Integer)blockstate.m_61143_((Property)_getip202);
                    } else {
                        n62 = -1;
                    }
                    if (n62 <= 5) {
                        int _value = 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip205 = (IntegerProperty)_value8;
                    n60 = (Integer)blockstate.m_61143_((Property)_getip205);
                } else {
                    n60 = -1;
                }
                if (n60 < 6) return;
                _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip207 = (IntegerProperty)_value8;
                    n59 = (Integer)blockstate.m_61143_((Property)_getip207);
                } else {
                    n59 = -1;
                }
                if (n59 > 10) return;
                int _value = 9;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip210 = (IntegerProperty)_value;
                n46 = (Integer)blockstate.m_61143_((Property)_getip210);
            } else {
                n46 = -1;
            }
            if (n46 >= 1) {
                int n63;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip212 = (IntegerProperty)_value;
                    n63 = (Integer)blockstate.m_61143_((Property)_getip212);
                } else {
                    n63 = -1;
                }
                if (n63 <= 5) {
                    int _value9 = 5;
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
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip215 = (IntegerProperty)_value;
                n45 = (Integer)blockstate.m_61143_((Property)_getip215);
            } else {
                n45 = -1;
            }
            if (n45 < 6) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip217 = (IntegerProperty)_value;
                n44 = (Integer)blockstate.m_61143_((Property)_getip217);
            } else {
                n44 = -1;
            }
            if (n44 > 10) return;
            int _value9 = 10;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value9)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value9)), 3);
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
        }.getDirection(blockstate) != Direction.SOUTH) return;
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
            int n64;
            int n65;
            int n66;
            Property _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value9 instanceof IntegerProperty) {
                IntegerProperty _getip228 = (IntegerProperty)_value9;
                n66 = (Integer)blockstate.m_61143_((Property)_getip228);
            } else {
                n66 = -1;
            }
            if (n66 >= 1) {
                int n67;
                _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value9 instanceof IntegerProperty) {
                    IntegerProperty _getip230 = (IntegerProperty)_value9;
                    n67 = (Integer)blockstate.m_61143_((Property)_getip230);
                } else {
                    n67 = -1;
                }
                if (n67 <= 5) {
                    int _value = 1;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip233 = (IntegerProperty)_value9;
                n65 = (Integer)blockstate.m_61143_((Property)_getip233);
            } else {
                n65 = -1;
            }
            if (n65 < 6) return;
            _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value9 instanceof IntegerProperty) {
                IntegerProperty _getip235 = (IntegerProperty)_value9;
                n64 = (Integer)blockstate.m_61143_((Property)_getip235);
            } else {
                n64 = -1;
            }
            if (n64 > 10) return;
            int _value = 6;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
            int n68;
            int n69;
            int n70;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip243 = (IntegerProperty)_value;
                n70 = (Integer)blockstate.m_61143_((Property)_getip243);
            } else {
                n70 = -1;
            }
            if (n70 >= 1) {
                int n71;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip245 = (IntegerProperty)_value;
                    n71 = (Integer)blockstate.m_61143_((Property)_getip245);
                } else {
                    n71 = -1;
                }
                if (n71 <= 5) {
                    int _value10 = 2;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value10)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip248 = (IntegerProperty)_value;
                n69 = (Integer)blockstate.m_61143_((Property)_getip248);
            } else {
                n69 = -1;
            }
            if (n69 < 6) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip250 = (IntegerProperty)_value;
                n68 = (Integer)blockstate.m_61143_((Property)_getip250);
            } else {
                n68 = -1;
            }
            if (n68 > 10) return;
            int _value10 = 7;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value10)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
            int n72;
            int n73;
            int n74;
            Property _value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value10 instanceof IntegerProperty) {
                IntegerProperty _getip258 = (IntegerProperty)_value10;
                n74 = (Integer)blockstate.m_61143_((Property)_getip258);
            } else {
                n74 = -1;
            }
            if (n74 >= 1) {
                int n75;
                _value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value10 instanceof IntegerProperty) {
                    IntegerProperty _getip260 = (IntegerProperty)_value10;
                    n75 = (Integer)blockstate.m_61143_((Property)_getip260);
                } else {
                    n75 = -1;
                }
                if (n75 <= 5) {
                    int _value = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip263 = (IntegerProperty)_value10;
                n73 = (Integer)blockstate.m_61143_((Property)_getip263);
            } else {
                n73 = -1;
            }
            if (n73 < 6) return;
            _value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value10 instanceof IntegerProperty) {
                IntegerProperty _getip265 = (IntegerProperty)_value10;
                n72 = (Integer)blockstate.m_61143_((Property)_getip265);
            } else {
                n72 = -1;
            }
            if (n72 > 10) return;
            int _value = 8;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ENGAWA.get() && new Object(){

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
            int n76;
            int n77;
            int n78;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip273 = (IntegerProperty)_value;
                n78 = (Integer)blockstate.m_61143_((Property)_getip273);
            } else {
                n78 = -1;
            }
            if (n78 >= 1) {
                int n79;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip275 = (IntegerProperty)_value;
                    n79 = (Integer)blockstate.m_61143_((Property)_getip275);
                } else {
                    n79 = -1;
                }
                if (n79 <= 5) {
                    int _value11 = 4;
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
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip278 = (IntegerProperty)_value;
                n77 = (Integer)blockstate.m_61143_((Property)_getip278);
            } else {
                n77 = -1;
            }
            if (n77 < 6) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip280 = (IntegerProperty)_value;
                n76 = (Integer)blockstate.m_61143_((Property)_getip280);
            } else {
                n76 = -1;
            }
            if (n76 > 10) return;
            int _value11 = 9;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value11)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
            return;
        }
        Property _value11 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value11 instanceof IntegerProperty) {
            IntegerProperty _getip283 = (IntegerProperty)_value11;
            n3 = (Integer)blockstate.m_61143_((Property)_getip283);
        } else {
            n3 = -1;
        }
        if (n3 >= 1) {
            int n80;
            _value11 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value11 instanceof IntegerProperty) {
                IntegerProperty _getip285 = (IntegerProperty)_value11;
                n80 = (Integer)blockstate.m_61143_((Property)_getip285);
            } else {
                n80 = -1;
            }
            if (n80 <= 5) {
                int _value = 5;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
        }
        if ((_value11 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip288 = (IntegerProperty)_value11;
            n2 = (Integer)blockstate.m_61143_((Property)_getip288);
        } else {
            n2 = -1;
        }
        if (n2 < 6) return;
        _value11 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value11 instanceof IntegerProperty) {
            IntegerProperty _getip290 = (IntegerProperty)_value11;
            n = (Integer)blockstate.m_61143_((Property)_getip290);
        } else {
            n = -1;
        }
        if (n > 10) return;
        int _value = 10;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs = world.m_8055_(_pos);
        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property;
        if (!_integerProp.m_6908_().contains(_value)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
    }
}

