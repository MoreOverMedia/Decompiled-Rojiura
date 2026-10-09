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

public class GUARDRAILWHITEFANGKUAIZHUANGTAIProcedure {
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
        }.getDirection(blockstate) == Direction.NORTH) {
            int n4;
            int n5;
            int n6;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
                int n7;
                int n8;
                Property _value2;
                int n9;
                Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip14 = (IntegerProperty)property;
                    n9 = (Integer)blockstate.m_61143_((Property)_getip14);
                } else {
                    n9 = -1;
                }
                if (n9 >= 1) {
                    int n10;
                    property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty) {
                        IntegerProperty _getip16 = (IntegerProperty)property;
                        n10 = (Integer)blockstate.m_61143_((Property)_getip16);
                    } else {
                        n10 = -1;
                    }
                    if (n10 <= 7) {
                        int _value2 = 6;
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
                    IntegerProperty _getip19 = (IntegerProperty)_value2;
                    n8 = (Integer)blockstate.m_61143_((Property)_getip19);
                } else {
                    n8 = -1;
                }
                if (n8 < 8) return;
                _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip21 = (IntegerProperty)_value2;
                    n7 = (Integer)blockstate.m_61143_((Property)_getip21);
                } else {
                    n7 = -1;
                }
                if (n7 > 14) return;
                int _value2 = 13;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property3 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property3;
                if (!_integerProp.m_6908_().contains(_value2)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
                int n11;
                int n12;
                int n13;
                Property _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip34 = (IntegerProperty)_value2;
                    n13 = (Integer)blockstate.m_61143_((Property)_getip34);
                } else {
                    n13 = -1;
                }
                if (n13 >= 1) {
                    int n14;
                    _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value2 instanceof IntegerProperty) {
                        IntegerProperty _getip36 = (IntegerProperty)_value2;
                        n14 = (Integer)blockstate.m_61143_((Property)_getip36);
                    } else {
                        n14 = -1;
                    }
                    if (n14 <= 7) {
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
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip39 = (IntegerProperty)_value2;
                    n12 = (Integer)blockstate.m_61143_((Property)_getip39);
                } else {
                    n12 = -1;
                }
                if (n12 < 8) return;
                _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip41 = (IntegerProperty)_value2;
                    n11 = (Integer)blockstate.m_61143_((Property)_getip41);
                } else {
                    n11 = -1;
                }
                if (n11 > 14) return;
                int _value = 14;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
                int n15;
                int n16;
                int n17;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip54 = (IntegerProperty)_value;
                    n17 = (Integer)blockstate.m_61143_((Property)_getip54);
                } else {
                    n17 = -1;
                }
                if (n17 >= 1) {
                    int n18;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip56 = (IntegerProperty)_value;
                        n18 = (Integer)blockstate.m_61143_((Property)_getip56);
                    } else {
                        n18 = -1;
                    }
                    if (n18 <= 7) {
                        int _value3 = 5;
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
                    IntegerProperty _getip59 = (IntegerProperty)_value;
                    n16 = (Integer)blockstate.m_61143_((Property)_getip59);
                } else {
                    n16 = -1;
                }
                if (n16 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip61 = (IntegerProperty)_value;
                    n15 = (Integer)blockstate.m_61143_((Property)_getip61);
                } else {
                    n15 = -1;
                }
                if (n15 > 14) return;
                int _value3 = 12;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value3)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
                int n19;
                int n20;
                int n21;
                Property _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value3 instanceof IntegerProperty) {
                    IntegerProperty _getip74 = (IntegerProperty)_value3;
                    n21 = (Integer)blockstate.m_61143_((Property)_getip74);
                } else {
                    n21 = -1;
                }
                if (n21 >= 1) {
                    int n22;
                    _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value3 instanceof IntegerProperty) {
                        IntegerProperty _getip76 = (IntegerProperty)_value3;
                        n22 = (Integer)blockstate.m_61143_((Property)_getip76);
                    } else {
                        n22 = -1;
                    }
                    if (n22 <= 7) {
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
                    IntegerProperty _getip79 = (IntegerProperty)_value3;
                    n20 = (Integer)blockstate.m_61143_((Property)_getip79);
                } else {
                    n20 = -1;
                }
                if (n20 < 8) return;
                _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value3 instanceof IntegerProperty) {
                    IntegerProperty _getip81 = (IntegerProperty)_value3;
                    n19 = (Integer)blockstate.m_61143_((Property)_getip81);
                } else {
                    n19 = -1;
                }
                if (n19 > 14) return;
                int _value = 11;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n23;
                int n24;
                int n25;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip88 = (IntegerProperty)_value;
                    n25 = (Integer)blockstate.m_61143_((Property)_getip88);
                } else {
                    n25 = -1;
                }
                if (n25 >= 1) {
                    int n26;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip90 = (IntegerProperty)_value;
                        n26 = (Integer)blockstate.m_61143_((Property)_getip90);
                    } else {
                        n26 = -1;
                    }
                    if (n26 <= 7) {
                        int _value4 = 1;
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
                    IntegerProperty _getip93 = (IntegerProperty)_value;
                    n24 = (Integer)blockstate.m_61143_((Property)_getip93);
                } else {
                    n24 = -1;
                }
                if (n24 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip95 = (IntegerProperty)_value;
                    n23 = (Integer)blockstate.m_61143_((Property)_getip95);
                } else {
                    n23 = -1;
                }
                if (n23 > 14) return;
                int _value4 = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value4)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n27;
                int n28;
                int n29;
                Property _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip100 = (IntegerProperty)_value4;
                    n29 = (Integer)blockstate.m_61143_((Property)_getip100);
                } else {
                    n29 = -1;
                }
                if (n29 >= 1) {
                    int n30;
                    _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value4 instanceof IntegerProperty) {
                        IntegerProperty _getip102 = (IntegerProperty)_value4;
                        n30 = (Integer)blockstate.m_61143_((Property)_getip102);
                    } else {
                        n30 = -1;
                    }
                    if (n30 <= 7) {
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
                if ((_value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip105 = (IntegerProperty)_value4;
                    n28 = (Integer)blockstate.m_61143_((Property)_getip105);
                } else {
                    n28 = -1;
                }
                if (n28 < 8) return;
                _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip107 = (IntegerProperty)_value4;
                    n27 = (Integer)blockstate.m_61143_((Property)_getip107);
                } else {
                    n27 = -1;
                }
                if (n27 > 14) return;
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
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n31;
                int n32;
                int n33;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip112 = (IntegerProperty)_value;
                    n33 = (Integer)blockstate.m_61143_((Property)_getip112);
                } else {
                    n33 = -1;
                }
                if (n33 >= 1) {
                    int n34;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip114 = (IntegerProperty)_value;
                        n34 = (Integer)blockstate.m_61143_((Property)_getip114);
                    } else {
                        n34 = -1;
                    }
                    if (n34 <= 7) {
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
                    IntegerProperty _getip117 = (IntegerProperty)_value;
                    n32 = (Integer)blockstate.m_61143_((Property)_getip117);
                } else {
                    n32 = -1;
                }
                if (n32 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip119 = (IntegerProperty)_value;
                    n31 = (Integer)blockstate.m_61143_((Property)_getip119);
                } else {
                    n31 = -1;
                }
                if (n31 > 14) return;
                int _value5 = 9;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value5)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                return;
            }
            Property _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value5 instanceof IntegerProperty) {
                IntegerProperty _getip122 = (IntegerProperty)_value5;
                n6 = (Integer)blockstate.m_61143_((Property)_getip122);
            } else {
                n6 = -1;
            }
            if (n6 >= 1) {
                int n35;
                _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value5 instanceof IntegerProperty) {
                    IntegerProperty _getip124 = (IntegerProperty)_value5;
                    n35 = (Integer)blockstate.m_61143_((Property)_getip124);
                } else {
                    n35 = -1;
                }
                if (n35 <= 7) {
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
            if ((_value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip127 = (IntegerProperty)_value5;
                n5 = (Integer)blockstate.m_61143_((Property)_getip127);
            } else {
                n5 = -1;
            }
            if (n5 < 8) return;
            _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value5 instanceof IntegerProperty) {
                IntegerProperty _getip129 = (IntegerProperty)_value5;
                n4 = (Integer)blockstate.m_61143_((Property)_getip129);
            } else {
                n4 = -1;
            }
            if (n4 > 14) return;
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
            int n36;
            int n37;
            int n38;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
                int n39;
                int n40;
                int n41;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip145 = (IntegerProperty)_value;
                    n41 = (Integer)blockstate.m_61143_((Property)_getip145);
                } else {
                    n41 = -1;
                }
                if (n41 >= 1) {
                    int n42;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip147 = (IntegerProperty)_value;
                        n42 = (Integer)blockstate.m_61143_((Property)_getip147);
                    } else {
                        n42 = -1;
                    }
                    if (n42 <= 7) {
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
                    IntegerProperty _getip150 = (IntegerProperty)_value;
                    n40 = (Integer)blockstate.m_61143_((Property)_getip150);
                } else {
                    n40 = -1;
                }
                if (n40 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip152 = (IntegerProperty)_value;
                    n39 = (Integer)blockstate.m_61143_((Property)_getip152);
                } else {
                    n39 = -1;
                }
                if (n39 > 14) return;
                int _value6 = 11;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value6)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
                int n43;
                int n44;
                int n45;
                Property _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value6 instanceof IntegerProperty) {
                    IntegerProperty _getip165 = (IntegerProperty)_value6;
                    n45 = (Integer)blockstate.m_61143_((Property)_getip165);
                } else {
                    n45 = -1;
                }
                if (n45 >= 1) {
                    int n46;
                    _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value6 instanceof IntegerProperty) {
                        IntegerProperty _getip167 = (IntegerProperty)_value6;
                        n46 = (Integer)blockstate.m_61143_((Property)_getip167);
                    } else {
                        n46 = -1;
                    }
                    if (n46 <= 7) {
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
                    IntegerProperty _getip170 = (IntegerProperty)_value6;
                    n44 = (Integer)blockstate.m_61143_((Property)_getip170);
                } else {
                    n44 = -1;
                }
                if (n44 < 8) return;
                _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value6 instanceof IntegerProperty) {
                    IntegerProperty _getip172 = (IntegerProperty)_value6;
                    n43 = (Integer)blockstate.m_61143_((Property)_getip172);
                } else {
                    n43 = -1;
                }
                if (n43 > 14) return;
                int _value = 12;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
                int n47;
                int n48;
                int n49;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip185 = (IntegerProperty)_value;
                    n49 = (Integer)blockstate.m_61143_((Property)_getip185);
                } else {
                    n49 = -1;
                }
                if (n49 >= 1) {
                    int n50;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip187 = (IntegerProperty)_value;
                        n50 = (Integer)blockstate.m_61143_((Property)_getip187);
                    } else {
                        n50 = -1;
                    }
                    if (n50 <= 7) {
                        int _value7 = 7;
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
                    IntegerProperty _getip190 = (IntegerProperty)_value;
                    n48 = (Integer)blockstate.m_61143_((Property)_getip190);
                } else {
                    n48 = -1;
                }
                if (n48 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip192 = (IntegerProperty)_value;
                    n47 = (Integer)blockstate.m_61143_((Property)_getip192);
                } else {
                    n47 = -1;
                }
                if (n47 > 14) return;
                int _value7 = 14;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value7)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
                int n51;
                int n52;
                int n53;
                Property _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value7 instanceof IntegerProperty) {
                    IntegerProperty _getip205 = (IntegerProperty)_value7;
                    n53 = (Integer)blockstate.m_61143_((Property)_getip205);
                } else {
                    n53 = -1;
                }
                if (n53 >= 1) {
                    int n54;
                    _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value7 instanceof IntegerProperty) {
                        IntegerProperty _getip207 = (IntegerProperty)_value7;
                        n54 = (Integer)blockstate.m_61143_((Property)_getip207);
                    } else {
                        n54 = -1;
                    }
                    if (n54 <= 7) {
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
                }
                if ((_value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip210 = (IntegerProperty)_value7;
                    n52 = (Integer)blockstate.m_61143_((Property)_getip210);
                } else {
                    n52 = -1;
                }
                if (n52 < 8) return;
                _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value7 instanceof IntegerProperty) {
                    IntegerProperty _getip212 = (IntegerProperty)_value7;
                    n51 = (Integer)blockstate.m_61143_((Property)_getip212);
                } else {
                    n51 = -1;
                }
                if (n51 > 14) return;
                int _value = 13;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n55;
                int n56;
                int n57;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip219 = (IntegerProperty)_value;
                    n57 = (Integer)blockstate.m_61143_((Property)_getip219);
                } else {
                    n57 = -1;
                }
                if (n57 >= 1) {
                    int n58;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip221 = (IntegerProperty)_value;
                        n58 = (Integer)blockstate.m_61143_((Property)_getip221);
                    } else {
                        n58 = -1;
                    }
                    if (n58 <= 7) {
                        int _value8 = 1;
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
                    IntegerProperty _getip224 = (IntegerProperty)_value;
                    n56 = (Integer)blockstate.m_61143_((Property)_getip224);
                } else {
                    n56 = -1;
                }
                if (n56 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip226 = (IntegerProperty)_value;
                    n55 = (Integer)blockstate.m_61143_((Property)_getip226);
                } else {
                    n55 = -1;
                }
                if (n55 > 14) return;
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
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n59;
                int n60;
                int n61;
                Property _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip231 = (IntegerProperty)_value8;
                    n61 = (Integer)blockstate.m_61143_((Property)_getip231);
                } else {
                    n61 = -1;
                }
                if (n61 >= 1) {
                    int n62;
                    _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value8 instanceof IntegerProperty) {
                        IntegerProperty _getip233 = (IntegerProperty)_value8;
                        n62 = (Integer)blockstate.m_61143_((Property)_getip233);
                    } else {
                        n62 = -1;
                    }
                    if (n62 <= 7) {
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
                if ((_value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip236 = (IntegerProperty)_value8;
                    n60 = (Integer)blockstate.m_61143_((Property)_getip236);
                } else {
                    n60 = -1;
                }
                if (n60 < 8) return;
                _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip238 = (IntegerProperty)_value8;
                    n59 = (Integer)blockstate.m_61143_((Property)_getip238);
                } else {
                    n59 = -1;
                }
                if (n59 > 14) return;
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
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n63;
                int n64;
                int n65;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip243 = (IntegerProperty)_value;
                    n65 = (Integer)blockstate.m_61143_((Property)_getip243);
                } else {
                    n65 = -1;
                }
                if (n65 >= 1) {
                    int n66;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip245 = (IntegerProperty)_value;
                        n66 = (Integer)blockstate.m_61143_((Property)_getip245);
                    } else {
                        n66 = -1;
                    }
                    if (n66 <= 7) {
                        int _value9 = 3;
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
                    IntegerProperty _getip248 = (IntegerProperty)_value;
                    n64 = (Integer)blockstate.m_61143_((Property)_getip248);
                } else {
                    n64 = -1;
                }
                if (n64 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip250 = (IntegerProperty)_value;
                    n63 = (Integer)blockstate.m_61143_((Property)_getip250);
                } else {
                    n63 = -1;
                }
                if (n63 > 14) return;
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
            Property _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value9 instanceof IntegerProperty) {
                IntegerProperty _getip253 = (IntegerProperty)_value9;
                n38 = (Integer)blockstate.m_61143_((Property)_getip253);
            } else {
                n38 = -1;
            }
            if (n38 >= 1) {
                int n67;
                _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value9 instanceof IntegerProperty) {
                    IntegerProperty _getip255 = (IntegerProperty)_value9;
                    n67 = (Integer)blockstate.m_61143_((Property)_getip255);
                } else {
                    n67 = -1;
                }
                if (n67 <= 7) {
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
                IntegerProperty _getip258 = (IntegerProperty)_value9;
                n37 = (Integer)blockstate.m_61143_((Property)_getip258);
            } else {
                n37 = -1;
            }
            if (n37 < 8) return;
            _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value9 instanceof IntegerProperty) {
                IntegerProperty _getip260 = (IntegerProperty)_value9;
                n36 = (Integer)blockstate.m_61143_((Property)_getip260);
            } else {
                n36 = -1;
            }
            if (n36 > 14) return;
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
            int n68;
            int n69;
            int n70;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
                int n71;
                int n72;
                int n73;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip276 = (IntegerProperty)_value;
                    n73 = (Integer)blockstate.m_61143_((Property)_getip276);
                } else {
                    n73 = -1;
                }
                if (n73 >= 1) {
                    int n74;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip278 = (IntegerProperty)_value;
                        n74 = (Integer)blockstate.m_61143_((Property)_getip278);
                    } else {
                        n74 = -1;
                    }
                    if (n74 <= 7) {
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
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip281 = (IntegerProperty)_value;
                    n72 = (Integer)blockstate.m_61143_((Property)_getip281);
                } else {
                    n72 = -1;
                }
                if (n72 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip283 = (IntegerProperty)_value;
                    n71 = (Integer)blockstate.m_61143_((Property)_getip283);
                } else {
                    n71 = -1;
                }
                if (n71 > 14) return;
                int _value10 = 14;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value10)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
                int n75;
                int n76;
                int n77;
                Property _value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value10 instanceof IntegerProperty) {
                    IntegerProperty _getip296 = (IntegerProperty)_value10;
                    n77 = (Integer)blockstate.m_61143_((Property)_getip296);
                } else {
                    n77 = -1;
                }
                if (n77 >= 1) {
                    int n78;
                    _value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value10 instanceof IntegerProperty) {
                        IntegerProperty _getip298 = (IntegerProperty)_value10;
                        n78 = (Integer)blockstate.m_61143_((Property)_getip298);
                    } else {
                        n78 = -1;
                    }
                    if (n78 <= 7) {
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
                if ((_value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip301 = (IntegerProperty)_value10;
                    n76 = (Integer)blockstate.m_61143_((Property)_getip301);
                } else {
                    n76 = -1;
                }
                if (n76 < 8) return;
                _value10 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value10 instanceof IntegerProperty) {
                    IntegerProperty _getip303 = (IntegerProperty)_value10;
                    n75 = (Integer)blockstate.m_61143_((Property)_getip303);
                } else {
                    n75 = -1;
                }
                if (n75 > 14) return;
                int _value = 11;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
                int n79;
                int n80;
                int n81;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip316 = (IntegerProperty)_value;
                    n81 = (Integer)blockstate.m_61143_((Property)_getip316);
                } else {
                    n81 = -1;
                }
                if (n81 >= 1) {
                    int n82;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip318 = (IntegerProperty)_value;
                        n82 = (Integer)blockstate.m_61143_((Property)_getip318);
                    } else {
                        n82 = -1;
                    }
                    if (n82 <= 7) {
                        int _value11 = 6;
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
                    IntegerProperty _getip321 = (IntegerProperty)_value;
                    n80 = (Integer)blockstate.m_61143_((Property)_getip321);
                } else {
                    n80 = -1;
                }
                if (n80 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip323 = (IntegerProperty)_value;
                    n79 = (Integer)blockstate.m_61143_((Property)_getip323);
                } else {
                    n79 = -1;
                }
                if (n79 > 14) return;
                int _value11 = 13;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value11)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
                int n83;
                int n84;
                int n85;
                Property _value11 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value11 instanceof IntegerProperty) {
                    IntegerProperty _getip336 = (IntegerProperty)_value11;
                    n85 = (Integer)blockstate.m_61143_((Property)_getip336);
                } else {
                    n85 = -1;
                }
                if (n85 >= 1) {
                    int n86;
                    _value11 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value11 instanceof IntegerProperty) {
                        IntegerProperty _getip338 = (IntegerProperty)_value11;
                        n86 = (Integer)blockstate.m_61143_((Property)_getip338);
                    } else {
                        n86 = -1;
                    }
                    if (n86 <= 7) {
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
                    IntegerProperty _getip341 = (IntegerProperty)_value11;
                    n84 = (Integer)blockstate.m_61143_((Property)_getip341);
                } else {
                    n84 = -1;
                }
                if (n84 < 8) return;
                _value11 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value11 instanceof IntegerProperty) {
                    IntegerProperty _getip343 = (IntegerProperty)_value11;
                    n83 = (Integer)blockstate.m_61143_((Property)_getip343);
                } else {
                    n83 = -1;
                }
                if (n83 > 14) return;
                int _value = 12;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n87;
                int n88;
                int n89;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip350 = (IntegerProperty)_value;
                    n89 = (Integer)blockstate.m_61143_((Property)_getip350);
                } else {
                    n89 = -1;
                }
                if (n89 >= 1) {
                    int n90;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip352 = (IntegerProperty)_value;
                        n90 = (Integer)blockstate.m_61143_((Property)_getip352);
                    } else {
                        n90 = -1;
                    }
                    if (n90 <= 7) {
                        int _value12 = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value12)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip355 = (IntegerProperty)_value;
                    n88 = (Integer)blockstate.m_61143_((Property)_getip355);
                } else {
                    n88 = -1;
                }
                if (n88 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip357 = (IntegerProperty)_value;
                    n87 = (Integer)blockstate.m_61143_((Property)_getip357);
                } else {
                    n87 = -1;
                }
                if (n87 > 14) return;
                int _value12 = 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value12)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n91;
                int n92;
                int n93;
                Property _value12 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value12 instanceof IntegerProperty) {
                    IntegerProperty _getip362 = (IntegerProperty)_value12;
                    n93 = (Integer)blockstate.m_61143_((Property)_getip362);
                } else {
                    n93 = -1;
                }
                if (n93 >= 1) {
                    int n94;
                    _value12 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value12 instanceof IntegerProperty) {
                        IntegerProperty _getip364 = (IntegerProperty)_value12;
                        n94 = (Integer)blockstate.m_61143_((Property)_getip364);
                    } else {
                        n94 = -1;
                    }
                    if (n94 <= 7) {
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
                if ((_value12 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip367 = (IntegerProperty)_value12;
                    n92 = (Integer)blockstate.m_61143_((Property)_getip367);
                } else {
                    n92 = -1;
                }
                if (n92 < 8) return;
                _value12 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value12 instanceof IntegerProperty) {
                    IntegerProperty _getip369 = (IntegerProperty)_value12;
                    n91 = (Integer)blockstate.m_61143_((Property)_getip369);
                } else {
                    n91 = -1;
                }
                if (n91 > 14) return;
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
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
                int n95;
                int n96;
                int n97;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip374 = (IntegerProperty)_value;
                    n97 = (Integer)blockstate.m_61143_((Property)_getip374);
                } else {
                    n97 = -1;
                }
                if (n97 >= 1) {
                    int n98;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip376 = (IntegerProperty)_value;
                        n98 = (Integer)blockstate.m_61143_((Property)_getip376);
                    } else {
                        n98 = -1;
                    }
                    if (n98 <= 7) {
                        int _value13 = 3;
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
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip379 = (IntegerProperty)_value;
                    n96 = (Integer)blockstate.m_61143_((Property)_getip379);
                } else {
                    n96 = -1;
                }
                if (n96 < 8) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip381 = (IntegerProperty)_value;
                    n95 = (Integer)blockstate.m_61143_((Property)_getip381);
                } else {
                    n95 = -1;
                }
                if (n95 > 14) return;
                int _value13 = 10;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value13)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value13)), 3);
                return;
            }
            Property _value13 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value13 instanceof IntegerProperty) {
                IntegerProperty _getip384 = (IntegerProperty)_value13;
                n70 = (Integer)blockstate.m_61143_((Property)_getip384);
            } else {
                n70 = -1;
            }
            if (n70 >= 1) {
                int n99;
                _value13 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value13 instanceof IntegerProperty) {
                    IntegerProperty _getip386 = (IntegerProperty)_value13;
                    n99 = (Integer)blockstate.m_61143_((Property)_getip386);
                } else {
                    n99 = -1;
                }
                if (n99 <= 7) {
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
            if ((_value13 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip389 = (IntegerProperty)_value13;
                n69 = (Integer)blockstate.m_61143_((Property)_getip389);
            } else {
                n69 = -1;
            }
            if (n69 < 8) return;
            _value13 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value13 instanceof IntegerProperty) {
                IntegerProperty _getip391 = (IntegerProperty)_value13;
                n68 = (Integer)blockstate.m_61143_((Property)_getip391);
            } else {
                n68 = -1;
            }
            if (n68 > 14) return;
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
        if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
            int n100;
            int n101;
            int n102;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip407 = (IntegerProperty)_value;
                n102 = (Integer)blockstate.m_61143_((Property)_getip407);
            } else {
                n102 = -1;
            }
            if (n102 >= 1) {
                int n103;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip409 = (IntegerProperty)_value;
                    n103 = (Integer)blockstate.m_61143_((Property)_getip409);
                } else {
                    n103 = -1;
                }
                if (n103 <= 7) {
                    int _value14 = 5;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value14)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip412 = (IntegerProperty)_value;
                n101 = (Integer)blockstate.m_61143_((Property)_getip412);
            } else {
                n101 = -1;
            }
            if (n101 < 8) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip414 = (IntegerProperty)_value;
                n100 = (Integer)blockstate.m_61143_((Property)_getip414);
            } else {
                n100 = -1;
            }
            if (n100 > 14) return;
            int _value14 = 12;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value14)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
            int n104;
            int n105;
            int n106;
            Property _value14 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value14 instanceof IntegerProperty) {
                IntegerProperty _getip427 = (IntegerProperty)_value14;
                n106 = (Integer)blockstate.m_61143_((Property)_getip427);
            } else {
                n106 = -1;
            }
            if (n106 >= 1) {
                int n107;
                _value14 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value14 instanceof IntegerProperty) {
                    IntegerProperty _getip429 = (IntegerProperty)_value14;
                    n107 = (Integer)blockstate.m_61143_((Property)_getip429);
                } else {
                    n107 = -1;
                }
                if (n107 <= 7) {
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
            }
            if ((_value14 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip432 = (IntegerProperty)_value14;
                n105 = (Integer)blockstate.m_61143_((Property)_getip432);
            } else {
                n105 = -1;
            }
            if (n105 < 8) return;
            _value14 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value14 instanceof IntegerProperty) {
                IntegerProperty _getip434 = (IntegerProperty)_value14;
                n104 = (Integer)blockstate.m_61143_((Property)_getip434);
            } else {
                n104 = -1;
            }
            if (n104 > 14) return;
            int _value = 13;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.NORTH && new Object(){

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
            int n108;
            int n109;
            int n110;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip447 = (IntegerProperty)_value;
                n110 = (Integer)blockstate.m_61143_((Property)_getip447);
            } else {
                n110 = -1;
            }
            if (n110 >= 1) {
                int n111;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip449 = (IntegerProperty)_value;
                    n111 = (Integer)blockstate.m_61143_((Property)_getip449);
                } else {
                    n111 = -1;
                }
                if (n111 <= 7) {
                    int _value15 = 4;
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
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip452 = (IntegerProperty)_value;
                n109 = (Integer)blockstate.m_61143_((Property)_getip452);
            } else {
                n109 = -1;
            }
            if (n109 < 8) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip454 = (IntegerProperty)_value;
                n108 = (Integer)blockstate.m_61143_((Property)_getip454);
            } else {
                n108 = -1;
            }
            if (n108 > 14) return;
            int _value15 = 11;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value15)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value15)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.SOUTH && new Object(){

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
            int n112;
            int n113;
            int n114;
            Property _value15 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value15 instanceof IntegerProperty) {
                IntegerProperty _getip467 = (IntegerProperty)_value15;
                n114 = (Integer)blockstate.m_61143_((Property)_getip467);
            } else {
                n114 = -1;
            }
            if (n114 >= 1) {
                int n115;
                _value15 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value15 instanceof IntegerProperty) {
                    IntegerProperty _getip469 = (IntegerProperty)_value15;
                    n115 = (Integer)blockstate.m_61143_((Property)_getip469);
                } else {
                    n115 = -1;
                }
                if (n115 <= 7) {
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
            }
            if ((_value15 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip472 = (IntegerProperty)_value15;
                n113 = (Integer)blockstate.m_61143_((Property)_getip472);
            } else {
                n113 = -1;
            }
            if (n113 < 8) return;
            _value15 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value15 instanceof IntegerProperty) {
                IntegerProperty _getip474 = (IntegerProperty)_value15;
                n112 = (Integer)blockstate.m_61143_((Property)_getip474);
            } else {
                n112 = -1;
            }
            if (n112 > 14) return;
            int _value = 14;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
            int n116;
            int n117;
            int n118;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip481 = (IntegerProperty)_value;
                n118 = (Integer)blockstate.m_61143_((Property)_getip481);
            } else {
                n118 = -1;
            }
            if (n118 >= 1) {
                int n119;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip483 = (IntegerProperty)_value;
                    n119 = (Integer)blockstate.m_61143_((Property)_getip483);
                } else {
                    n119 = -1;
                }
                if (n119 <= 7) {
                    int _value16 = 1;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value16)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value16)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip486 = (IntegerProperty)_value;
                n117 = (Integer)blockstate.m_61143_((Property)_getip486);
            } else {
                n117 = -1;
            }
            if (n117 < 8) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip488 = (IntegerProperty)_value;
                n116 = (Integer)blockstate.m_61143_((Property)_getip488);
            } else {
                n116 = -1;
            }
            if (n116 > 14) return;
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
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
            int n120;
            int n121;
            int n122;
            Property _value16 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value16 instanceof IntegerProperty) {
                IntegerProperty _getip493 = (IntegerProperty)_value16;
                n122 = (Integer)blockstate.m_61143_((Property)_getip493);
            } else {
                n122 = -1;
            }
            if (n122 >= 1) {
                int n123;
                _value16 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value16 instanceof IntegerProperty) {
                    IntegerProperty _getip495 = (IntegerProperty)_value16;
                    n123 = (Integer)blockstate.m_61143_((Property)_getip495);
                } else {
                    n123 = -1;
                }
                if (n123 <= 7) {
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
            if ((_value16 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip498 = (IntegerProperty)_value16;
                n121 = (Integer)blockstate.m_61143_((Property)_getip498);
            } else {
                n121 = -1;
            }
            if (n121 < 8) return;
            _value16 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value16 instanceof IntegerProperty) {
                IntegerProperty _getip500 = (IntegerProperty)_value16;
                n120 = (Integer)blockstate.m_61143_((Property)_getip500);
            } else {
                n120 = -1;
            }
            if (n120 > 14) return;
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
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.GUARDRAIL_WHITE.get()) {
            int n124;
            int n125;
            int n126;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip505 = (IntegerProperty)_value;
                n126 = (Integer)blockstate.m_61143_((Property)_getip505);
            } else {
                n126 = -1;
            }
            if (n126 >= 1) {
                int n127;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip507 = (IntegerProperty)_value;
                    n127 = (Integer)blockstate.m_61143_((Property)_getip507);
                } else {
                    n127 = -1;
                }
                if (n127 <= 7) {
                    int _value17 = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value17)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value17)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip510 = (IntegerProperty)_value;
                n125 = (Integer)blockstate.m_61143_((Property)_getip510);
            } else {
                n125 = -1;
            }
            if (n125 < 8) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip512 = (IntegerProperty)_value;
                n124 = (Integer)blockstate.m_61143_((Property)_getip512);
            } else {
                n124 = -1;
            }
            if (n124 > 14) return;
            int _value17 = 10;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value17)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value17)), 3);
            return;
        }
        Property _value17 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value17 instanceof IntegerProperty) {
            IntegerProperty _getip515 = (IntegerProperty)_value17;
            n3 = (Integer)blockstate.m_61143_((Property)_getip515);
        } else {
            n3 = -1;
        }
        if (n3 >= 1) {
            int n128;
            _value17 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value17 instanceof IntegerProperty) {
                IntegerProperty _getip517 = (IntegerProperty)_value17;
                n128 = (Integer)blockstate.m_61143_((Property)_getip517);
            } else {
                n128 = -1;
            }
            if (n128 <= 7) {
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
        if ((_value17 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip520 = (IntegerProperty)_value17;
            n2 = (Integer)blockstate.m_61143_((Property)_getip520);
        } else {
            n2 = -1;
        }
        if (n2 < 8) return;
        _value17 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value17 instanceof IntegerProperty) {
            IntegerProperty _getip522 = (IntegerProperty)_value17;
            n = (Integer)blockstate.m_61143_((Property)_getip522);
        } else {
            n = -1;
        }
        if (n > 14) return;
        int _value = 8;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs = world.m_8055_(_pos);
        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property;
        if (!_integerProp.m_6908_().contains(_value)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
    }
}

