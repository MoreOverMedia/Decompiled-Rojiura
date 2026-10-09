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
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class RanmaOrangeBrownDangPiLinFangKuaiGengXinShiProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
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
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n13;
                int n14;
                int n15;
                int n16;
                int n17;
                Property _value2;
                int n18;
                Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip18 = (IntegerProperty)property;
                    n18 = (Integer)blockstate.m_61143_((Property)_getip18);
                } else {
                    n18 = -1;
                }
                if (n18 >= 0) {
                    int n19;
                    property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty) {
                        IntegerProperty _getip20 = (IntegerProperty)property;
                        n19 = (Integer)blockstate.m_61143_((Property)_getip20);
                    } else {
                        n19 = -1;
                    }
                    if (n19 <= 3) {
                        int n20;
                        Property property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property2 instanceof IntegerProperty) {
                            IntegerProperty _getip22 = (IntegerProperty)property2;
                            n20 = (Integer)blockstate.m_61143_((Property)_getip22);
                        } else {
                            n20 = -1;
                        }
                        int _value2 = n20 + 8;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property3 instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property3;
                        if (!_integerProp.m_6908_().contains(_value2)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip25 = (IntegerProperty)_value2;
                    n17 = (Integer)blockstate.m_61143_((Property)_getip25);
                } else {
                    n17 = -1;
                }
                if (n17 >= 4) {
                    int n21;
                    _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value2 instanceof IntegerProperty) {
                        IntegerProperty _getip27 = (IntegerProperty)_value2;
                        n21 = (Integer)blockstate.m_61143_((Property)_getip27);
                    } else {
                        n21 = -1;
                    }
                    if (n21 <= 7) {
                        int n22;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip29 = (IntegerProperty)_bs;
                            n22 = (Integer)blockstate.m_61143_((Property)_getip29);
                        } else {
                            n22 = -1;
                        }
                        int _value3 = n22 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property4 instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property4;
                        if (!_integerProp.m_6908_().contains(_value3)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip32 = (IntegerProperty)_value2;
                    n16 = (Integer)blockstate.m_61143_((Property)_getip32);
                } else {
                    n16 = -1;
                }
                if (n16 >= 8) {
                    int n23;
                    _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value2 instanceof IntegerProperty) {
                        IntegerProperty _getip34 = (IntegerProperty)_value2;
                        n23 = (Integer)blockstate.m_61143_((Property)_getip34);
                    } else {
                        n23 = -1;
                    }
                    if (n23 <= 11) {
                        int n24;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip36 = (IntegerProperty)_bs;
                            n24 = (Integer)blockstate.m_61143_((Property)_getip36);
                        } else {
                            n24 = -1;
                        }
                        int _value4 = n24 + 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property5 instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property5;
                        if (!_integerProp.m_6908_().contains(_value4)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip39 = (IntegerProperty)_value2;
                    n15 = (Integer)blockstate.m_61143_((Property)_getip39);
                } else {
                    n15 = -1;
                }
                if (n15 < 12) return;
                _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip41 = (IntegerProperty)_value2;
                    n14 = (Integer)blockstate.m_61143_((Property)_getip41);
                } else {
                    n14 = -1;
                }
                if (n14 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip43 = (IntegerProperty)_bs;
                    n13 = (Integer)blockstate.m_61143_((Property)_getip43);
                } else {
                    n13 = -1;
                }
                int _value2 = n13 - 4;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property6 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property6 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property6;
                if (!_integerProp.m_6908_().contains(_value2)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n25;
                int n26;
                int n27;
                int n28;
                int n29;
                int n30;
                Property _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip53 = (IntegerProperty)_value2;
                    n30 = (Integer)blockstate.m_61143_((Property)_getip53);
                } else {
                    n30 = -1;
                }
                if (n30 >= 0) {
                    int n31;
                    _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value2 instanceof IntegerProperty) {
                        IntegerProperty _getip55 = (IntegerProperty)_value2;
                        n31 = (Integer)blockstate.m_61143_((Property)_getip55);
                    } else {
                        n31 = -1;
                    }
                    if (n31 <= 3) {
                        int n32;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip57 = (IntegerProperty)_bs;
                            n32 = (Integer)blockstate.m_61143_((Property)_getip57);
                        } else {
                            n32 = -1;
                        }
                        int _value = n32 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip60 = (IntegerProperty)_value2;
                    n29 = (Integer)blockstate.m_61143_((Property)_getip60);
                } else {
                    n29 = -1;
                }
                if (n29 >= 4) {
                    int n33;
                    _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value2 instanceof IntegerProperty) {
                        IntegerProperty _getip62 = (IntegerProperty)_value2;
                        n33 = (Integer)blockstate.m_61143_((Property)_getip62);
                    } else {
                        n33 = -1;
                    }
                    if (n33 <= 7) {
                        int n34;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip64 = (IntegerProperty)_bs;
                            n34 = (Integer)blockstate.m_61143_((Property)_getip64);
                        } else {
                            n34 = -1;
                        }
                        int _value = n34 + 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip67 = (IntegerProperty)_value2;
                    n28 = (Integer)blockstate.m_61143_((Property)_getip67);
                } else {
                    n28 = -1;
                }
                if (n28 >= 8) {
                    int n35;
                    _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value2 instanceof IntegerProperty) {
                        IntegerProperty _getip69 = (IntegerProperty)_value2;
                        n35 = (Integer)blockstate.m_61143_((Property)_getip69);
                    } else {
                        n35 = -1;
                    }
                    if (n35 <= 11) {
                        int n36;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip71 = (IntegerProperty)_bs;
                            n36 = (Integer)blockstate.m_61143_((Property)_getip71);
                        } else {
                            n36 = -1;
                        }
                        int _value = n36 - 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip74 = (IntegerProperty)_value2;
                    n27 = (Integer)blockstate.m_61143_((Property)_getip74);
                } else {
                    n27 = -1;
                }
                if (n27 < 12) return;
                _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value2 instanceof IntegerProperty) {
                    IntegerProperty _getip76 = (IntegerProperty)_value2;
                    n26 = (Integer)blockstate.m_61143_((Property)_getip76);
                } else {
                    n26 = -1;
                }
                if (n26 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip78 = (IntegerProperty)_bs;
                    n25 = (Integer)blockstate.m_61143_((Property)_getip78);
                } else {
                    n25 = -1;
                }
                int _value = n25 - 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n37;
                int n38;
                int n39;
                int n40;
                int n41;
                int n42;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip88 = (IntegerProperty)_value;
                    n42 = (Integer)blockstate.m_61143_((Property)_getip88);
                } else {
                    n42 = -1;
                }
                if (n42 >= 0) {
                    int n43;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip90 = (IntegerProperty)_value;
                        n43 = (Integer)blockstate.m_61143_((Property)_getip90);
                    } else {
                        n43 = -1;
                    }
                    if (n43 <= 3) {
                        int n44;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip92 = (IntegerProperty)_bs;
                            n44 = (Integer)blockstate.m_61143_((Property)_getip92);
                        } else {
                            n44 = -1;
                        }
                        int _value5 = n44 + 12;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value5)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip95 = (IntegerProperty)_value;
                    n41 = (Integer)blockstate.m_61143_((Property)_getip95);
                } else {
                    n41 = -1;
                }
                if (n41 >= 4) {
                    int n45;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip97 = (IntegerProperty)_value;
                        n45 = (Integer)blockstate.m_61143_((Property)_getip97);
                    } else {
                        n45 = -1;
                    }
                    if (n45 <= 7) {
                        int n46;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip99 = (IntegerProperty)_bs;
                            n46 = (Integer)blockstate.m_61143_((Property)_getip99);
                        } else {
                            n46 = -1;
                        }
                        int _value6 = n46 + 8;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value6)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip102 = (IntegerProperty)_value;
                    n40 = (Integer)blockstate.m_61143_((Property)_getip102);
                } else {
                    n40 = -1;
                }
                if (n40 >= 8) {
                    int n47;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip104 = (IntegerProperty)_value;
                        n47 = (Integer)blockstate.m_61143_((Property)_getip104);
                    } else {
                        n47 = -1;
                    }
                    if (n47 <= 11) {
                        int n48;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip106 = (IntegerProperty)_bs;
                            n48 = (Integer)blockstate.m_61143_((Property)_getip106);
                        } else {
                            n48 = -1;
                        }
                        int _value7 = n48 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value7)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip109 = (IntegerProperty)_value;
                    n39 = (Integer)blockstate.m_61143_((Property)_getip109);
                } else {
                    n39 = -1;
                }
                if (n39 < 12) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip111 = (IntegerProperty)_value;
                    n38 = (Integer)blockstate.m_61143_((Property)_getip111);
                } else {
                    n38 = -1;
                }
                if (n38 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip113 = (IntegerProperty)_bs;
                    n37 = (Integer)blockstate.m_61143_((Property)_getip113);
                } else {
                    n37 = -1;
                }
                int _value3 = n37 + 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value3)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                return;
            }
            Property _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value3 instanceof IntegerProperty) {
                IntegerProperty _getip116 = (IntegerProperty)_value3;
                n12 = (Integer)blockstate.m_61143_((Property)_getip116);
            } else {
                n12 = -1;
            }
            if (n12 >= 0) {
                int n49;
                _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value3 instanceof IntegerProperty) {
                    IntegerProperty _getip118 = (IntegerProperty)_value3;
                    n49 = (Integer)blockstate.m_61143_((Property)_getip118);
                } else {
                    n49 = -1;
                }
                if (n49 <= 3) {
                    int n50;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip120 = (IntegerProperty)_bs;
                        n50 = (Integer)blockstate.m_61143_((Property)_getip120);
                    } else {
                        n50 = -1;
                    }
                    int _value = n50 + 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip123 = (IntegerProperty)_value3;
                n11 = (Integer)blockstate.m_61143_((Property)_getip123);
            } else {
                n11 = -1;
            }
            if (n11 >= 4) {
                int n51;
                _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value3 instanceof IntegerProperty) {
                    IntegerProperty _getip125 = (IntegerProperty)_value3;
                    n51 = (Integer)blockstate.m_61143_((Property)_getip125);
                } else {
                    n51 = -1;
                }
                if (n51 <= 7) {
                    int n52;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip127 = (IntegerProperty)_bs;
                        n52 = (Integer)blockstate.m_61143_((Property)_getip127);
                    } else {
                        n52 = -1;
                    }
                    int _value = n52 - 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip130 = (IntegerProperty)_value3;
                n10 = (Integer)blockstate.m_61143_((Property)_getip130);
            } else {
                n10 = -1;
            }
            if (n10 >= 8) {
                int n53;
                _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value3 instanceof IntegerProperty) {
                    IntegerProperty _getip132 = (IntegerProperty)_value3;
                    n53 = (Integer)blockstate.m_61143_((Property)_getip132);
                } else {
                    n53 = -1;
                }
                if (n53 <= 11) {
                    int n54;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip134 = (IntegerProperty)_bs;
                        n54 = (Integer)blockstate.m_61143_((Property)_getip134);
                    } else {
                        n54 = -1;
                    }
                    int _value = n54 - 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip137 = (IntegerProperty)_value3;
                n9 = (Integer)blockstate.m_61143_((Property)_getip137);
            } else {
                n9 = -1;
            }
            if (n9 < 12) return;
            _value3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value3 instanceof IntegerProperty) {
                IntegerProperty _getip139 = (IntegerProperty)_value3;
                n8 = (Integer)blockstate.m_61143_((Property)_getip139);
            } else {
                n8 = -1;
            }
            if (n8 > 15) return;
            Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip141 = (IntegerProperty)_bs;
                n7 = (Integer)blockstate.m_61143_((Property)_getip141);
            } else {
                n7 = -1;
            }
            int _value = n7 - 12;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
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
            int n55;
            int n56;
            int n57;
            int n58;
            int n59;
            int n60;
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n61;
                int n62;
                int n63;
                int n64;
                int n65;
                int n66;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip161 = (IntegerProperty)_value;
                    n66 = (Integer)blockstate.m_61143_((Property)_getip161);
                } else {
                    n66 = -1;
                }
                if (n66 >= 0) {
                    int n67;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip163 = (IntegerProperty)_value;
                        n67 = (Integer)blockstate.m_61143_((Property)_getip163);
                    } else {
                        n67 = -1;
                    }
                    if (n67 <= 3) {
                        int n68;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip165 = (IntegerProperty)_bs;
                            n68 = (Integer)blockstate.m_61143_((Property)_getip165);
                        } else {
                            n68 = -1;
                        }
                        int _value8 = n68 + 8;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value8)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip168 = (IntegerProperty)_value;
                    n65 = (Integer)blockstate.m_61143_((Property)_getip168);
                } else {
                    n65 = -1;
                }
                if (n65 >= 4) {
                    int n69;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip170 = (IntegerProperty)_value;
                        n69 = (Integer)blockstate.m_61143_((Property)_getip170);
                    } else {
                        n69 = -1;
                    }
                    if (n69 <= 7) {
                        int n70;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip172 = (IntegerProperty)_bs;
                            n70 = (Integer)blockstate.m_61143_((Property)_getip172);
                        } else {
                            n70 = -1;
                        }
                        int _value9 = n70 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value9)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value9)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip175 = (IntegerProperty)_value;
                    n64 = (Integer)blockstate.m_61143_((Property)_getip175);
                } else {
                    n64 = -1;
                }
                if (n64 >= 8) {
                    int n71;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip177 = (IntegerProperty)_value;
                        n71 = (Integer)blockstate.m_61143_((Property)_getip177);
                    } else {
                        n71 = -1;
                    }
                    if (n71 <= 11) {
                        int n72;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip179 = (IntegerProperty)_bs;
                            n72 = (Integer)blockstate.m_61143_((Property)_getip179);
                        } else {
                            n72 = -1;
                        }
                        int _value10 = n72 + 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value10)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip182 = (IntegerProperty)_value;
                    n63 = (Integer)blockstate.m_61143_((Property)_getip182);
                } else {
                    n63 = -1;
                }
                if (n63 < 12) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip184 = (IntegerProperty)_value;
                    n62 = (Integer)blockstate.m_61143_((Property)_getip184);
                } else {
                    n62 = -1;
                }
                if (n62 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip186 = (IntegerProperty)_bs;
                    n61 = (Integer)blockstate.m_61143_((Property)_getip186);
                } else {
                    n61 = -1;
                }
                int _value4 = n61 - 4;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value4)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n73;
                int n74;
                int n75;
                int n76;
                int n77;
                int n78;
                Property _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip196 = (IntegerProperty)_value4;
                    n78 = (Integer)blockstate.m_61143_((Property)_getip196);
                } else {
                    n78 = -1;
                }
                if (n78 >= 0) {
                    int n79;
                    _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value4 instanceof IntegerProperty) {
                        IntegerProperty _getip198 = (IntegerProperty)_value4;
                        n79 = (Integer)blockstate.m_61143_((Property)_getip198);
                    } else {
                        n79 = -1;
                    }
                    if (n79 <= 3) {
                        int n80;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip200 = (IntegerProperty)_bs;
                            n80 = (Integer)blockstate.m_61143_((Property)_getip200);
                        } else {
                            n80 = -1;
                        }
                        int _value = n80 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip203 = (IntegerProperty)_value4;
                    n77 = (Integer)blockstate.m_61143_((Property)_getip203);
                } else {
                    n77 = -1;
                }
                if (n77 >= 4) {
                    int n81;
                    _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value4 instanceof IntegerProperty) {
                        IntegerProperty _getip205 = (IntegerProperty)_value4;
                        n81 = (Integer)blockstate.m_61143_((Property)_getip205);
                    } else {
                        n81 = -1;
                    }
                    if (n81 <= 7) {
                        int n82;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip207 = (IntegerProperty)_bs;
                            n82 = (Integer)blockstate.m_61143_((Property)_getip207);
                        } else {
                            n82 = -1;
                        }
                        int _value = n82 + 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip210 = (IntegerProperty)_value4;
                    n76 = (Integer)blockstate.m_61143_((Property)_getip210);
                } else {
                    n76 = -1;
                }
                if (n76 >= 8) {
                    int n83;
                    _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value4 instanceof IntegerProperty) {
                        IntegerProperty _getip212 = (IntegerProperty)_value4;
                        n83 = (Integer)blockstate.m_61143_((Property)_getip212);
                    } else {
                        n83 = -1;
                    }
                    if (n83 <= 11) {
                        int n84;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip214 = (IntegerProperty)_bs;
                            n84 = (Integer)blockstate.m_61143_((Property)_getip214);
                        } else {
                            n84 = -1;
                        }
                        int _value = n84 - 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip217 = (IntegerProperty)_value4;
                    n75 = (Integer)blockstate.m_61143_((Property)_getip217);
                } else {
                    n75 = -1;
                }
                if (n75 < 12) return;
                _value4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip219 = (IntegerProperty)_value4;
                    n74 = (Integer)blockstate.m_61143_((Property)_getip219);
                } else {
                    n74 = -1;
                }
                if (n74 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip221 = (IntegerProperty)_bs;
                    n73 = (Integer)blockstate.m_61143_((Property)_getip221);
                } else {
                    n73 = -1;
                }
                int _value = n73 - 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n85;
                int n86;
                int n87;
                int n88;
                int n89;
                int n90;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip231 = (IntegerProperty)_value;
                    n90 = (Integer)blockstate.m_61143_((Property)_getip231);
                } else {
                    n90 = -1;
                }
                if (n90 >= 0) {
                    int n91;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip233 = (IntegerProperty)_value;
                        n91 = (Integer)blockstate.m_61143_((Property)_getip233);
                    } else {
                        n91 = -1;
                    }
                    if (n91 <= 3) {
                        int n92;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip235 = (IntegerProperty)_bs;
                            n92 = (Integer)blockstate.m_61143_((Property)_getip235);
                        } else {
                            n92 = -1;
                        }
                        int _value11 = n92 + 12;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value11)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip238 = (IntegerProperty)_value;
                    n89 = (Integer)blockstate.m_61143_((Property)_getip238);
                } else {
                    n89 = -1;
                }
                if (n89 >= 4) {
                    int n93;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip240 = (IntegerProperty)_value;
                        n93 = (Integer)blockstate.m_61143_((Property)_getip240);
                    } else {
                        n93 = -1;
                    }
                    if (n93 <= 7) {
                        int n94;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip242 = (IntegerProperty)_bs;
                            n94 = (Integer)blockstate.m_61143_((Property)_getip242);
                        } else {
                            n94 = -1;
                        }
                        int _value12 = n94 + 8;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value12)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip245 = (IntegerProperty)_value;
                    n88 = (Integer)blockstate.m_61143_((Property)_getip245);
                } else {
                    n88 = -1;
                }
                if (n88 >= 8) {
                    int n95;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip247 = (IntegerProperty)_value;
                        n95 = (Integer)blockstate.m_61143_((Property)_getip247);
                    } else {
                        n95 = -1;
                    }
                    if (n95 <= 11) {
                        int n96;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip249 = (IntegerProperty)_bs;
                            n96 = (Integer)blockstate.m_61143_((Property)_getip249);
                        } else {
                            n96 = -1;
                        }
                        int _value13 = n96 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value13)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value13)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip252 = (IntegerProperty)_value;
                    n87 = (Integer)blockstate.m_61143_((Property)_getip252);
                } else {
                    n87 = -1;
                }
                if (n87 < 12) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip254 = (IntegerProperty)_value;
                    n86 = (Integer)blockstate.m_61143_((Property)_getip254);
                } else {
                    n86 = -1;
                }
                if (n86 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip256 = (IntegerProperty)_bs;
                    n85 = (Integer)blockstate.m_61143_((Property)_getip256);
                } else {
                    n85 = -1;
                }
                int _value5 = n85 + 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value5)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                return;
            }
            Property _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value5 instanceof IntegerProperty) {
                IntegerProperty _getip259 = (IntegerProperty)_value5;
                n60 = (Integer)blockstate.m_61143_((Property)_getip259);
            } else {
                n60 = -1;
            }
            if (n60 >= 0) {
                int n97;
                _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value5 instanceof IntegerProperty) {
                    IntegerProperty _getip261 = (IntegerProperty)_value5;
                    n97 = (Integer)blockstate.m_61143_((Property)_getip261);
                } else {
                    n97 = -1;
                }
                if (n97 <= 3) {
                    int n98;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip263 = (IntegerProperty)_bs;
                        n98 = (Integer)blockstate.m_61143_((Property)_getip263);
                    } else {
                        n98 = -1;
                    }
                    int _value = n98 + 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip266 = (IntegerProperty)_value5;
                n59 = (Integer)blockstate.m_61143_((Property)_getip266);
            } else {
                n59 = -1;
            }
            if (n59 >= 4) {
                int n99;
                _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value5 instanceof IntegerProperty) {
                    IntegerProperty _getip268 = (IntegerProperty)_value5;
                    n99 = (Integer)blockstate.m_61143_((Property)_getip268);
                } else {
                    n99 = -1;
                }
                if (n99 <= 7) {
                    int n100;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip270 = (IntegerProperty)_bs;
                        n100 = (Integer)blockstate.m_61143_((Property)_getip270);
                    } else {
                        n100 = -1;
                    }
                    int _value = n100 - 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip273 = (IntegerProperty)_value5;
                n58 = (Integer)blockstate.m_61143_((Property)_getip273);
            } else {
                n58 = -1;
            }
            if (n58 >= 8) {
                int n101;
                _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value5 instanceof IntegerProperty) {
                    IntegerProperty _getip275 = (IntegerProperty)_value5;
                    n101 = (Integer)blockstate.m_61143_((Property)_getip275);
                } else {
                    n101 = -1;
                }
                if (n101 <= 11) {
                    int n102;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip277 = (IntegerProperty)_bs;
                        n102 = (Integer)blockstate.m_61143_((Property)_getip277);
                    } else {
                        n102 = -1;
                    }
                    int _value = n102 - 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip280 = (IntegerProperty)_value5;
                n57 = (Integer)blockstate.m_61143_((Property)_getip280);
            } else {
                n57 = -1;
            }
            if (n57 < 12) return;
            _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value5 instanceof IntegerProperty) {
                IntegerProperty _getip282 = (IntegerProperty)_value5;
                n56 = (Integer)blockstate.m_61143_((Property)_getip282);
            } else {
                n56 = -1;
            }
            if (n56 > 15) return;
            Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip284 = (IntegerProperty)_bs;
                n55 = (Integer)blockstate.m_61143_((Property)_getip284);
            } else {
                n55 = -1;
            }
            int _value = n55 - 12;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
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
            int n103;
            int n104;
            int n105;
            int n106;
            int n107;
            int n108;
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == new Object(){

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
            }.getDirection(blockstate) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n109;
                int n110;
                int n111;
                int n112;
                int n113;
                int n114;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip304 = (IntegerProperty)_value;
                    n114 = (Integer)blockstate.m_61143_((Property)_getip304);
                } else {
                    n114 = -1;
                }
                if (n114 >= 0) {
                    int n115;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip306 = (IntegerProperty)_value;
                        n115 = (Integer)blockstate.m_61143_((Property)_getip306);
                    } else {
                        n115 = -1;
                    }
                    if (n115 <= 3) {
                        int n116;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip308 = (IntegerProperty)_bs;
                            n116 = (Integer)blockstate.m_61143_((Property)_getip308);
                        } else {
                            n116 = -1;
                        }
                        int _value14 = n116 + 8;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value14)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip311 = (IntegerProperty)_value;
                    n113 = (Integer)blockstate.m_61143_((Property)_getip311);
                } else {
                    n113 = -1;
                }
                if (n113 >= 4) {
                    int n117;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip313 = (IntegerProperty)_value;
                        n117 = (Integer)blockstate.m_61143_((Property)_getip313);
                    } else {
                        n117 = -1;
                    }
                    if (n117 <= 7) {
                        int n118;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip315 = (IntegerProperty)_bs;
                            n118 = (Integer)blockstate.m_61143_((Property)_getip315);
                        } else {
                            n118 = -1;
                        }
                        int _value15 = n118 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value15)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value15)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip318 = (IntegerProperty)_value;
                    n112 = (Integer)blockstate.m_61143_((Property)_getip318);
                } else {
                    n112 = -1;
                }
                if (n112 >= 8) {
                    int n119;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip320 = (IntegerProperty)_value;
                        n119 = (Integer)blockstate.m_61143_((Property)_getip320);
                    } else {
                        n119 = -1;
                    }
                    if (n119 <= 11) {
                        int n120;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip322 = (IntegerProperty)_bs;
                            n120 = (Integer)blockstate.m_61143_((Property)_getip322);
                        } else {
                            n120 = -1;
                        }
                        int _value16 = n120 + 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value16)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value16)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip325 = (IntegerProperty)_value;
                    n111 = (Integer)blockstate.m_61143_((Property)_getip325);
                } else {
                    n111 = -1;
                }
                if (n111 < 12) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip327 = (IntegerProperty)_value;
                    n110 = (Integer)blockstate.m_61143_((Property)_getip327);
                } else {
                    n110 = -1;
                }
                if (n110 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip329 = (IntegerProperty)_bs;
                    n109 = (Integer)blockstate.m_61143_((Property)_getip329);
                } else {
                    n109 = -1;
                }
                int _value6 = n109 - 4;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value6)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n121;
                int n122;
                int n123;
                int n124;
                int n125;
                int n126;
                Property _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value6 instanceof IntegerProperty) {
                    IntegerProperty _getip339 = (IntegerProperty)_value6;
                    n126 = (Integer)blockstate.m_61143_((Property)_getip339);
                } else {
                    n126 = -1;
                }
                if (n126 >= 0) {
                    int n127;
                    _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value6 instanceof IntegerProperty) {
                        IntegerProperty _getip341 = (IntegerProperty)_value6;
                        n127 = (Integer)blockstate.m_61143_((Property)_getip341);
                    } else {
                        n127 = -1;
                    }
                    if (n127 <= 3) {
                        int n128;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip343 = (IntegerProperty)_bs;
                            n128 = (Integer)blockstate.m_61143_((Property)_getip343);
                        } else {
                            n128 = -1;
                        }
                        int _value = n128 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip346 = (IntegerProperty)_value6;
                    n125 = (Integer)blockstate.m_61143_((Property)_getip346);
                } else {
                    n125 = -1;
                }
                if (n125 >= 4) {
                    int n129;
                    _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value6 instanceof IntegerProperty) {
                        IntegerProperty _getip348 = (IntegerProperty)_value6;
                        n129 = (Integer)blockstate.m_61143_((Property)_getip348);
                    } else {
                        n129 = -1;
                    }
                    if (n129 <= 7) {
                        int n130;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip350 = (IntegerProperty)_bs;
                            n130 = (Integer)blockstate.m_61143_((Property)_getip350);
                        } else {
                            n130 = -1;
                        }
                        int _value = n130 + 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip353 = (IntegerProperty)_value6;
                    n124 = (Integer)blockstate.m_61143_((Property)_getip353);
                } else {
                    n124 = -1;
                }
                if (n124 >= 8) {
                    int n131;
                    _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value6 instanceof IntegerProperty) {
                        IntegerProperty _getip355 = (IntegerProperty)_value6;
                        n131 = (Integer)blockstate.m_61143_((Property)_getip355);
                    } else {
                        n131 = -1;
                    }
                    if (n131 <= 11) {
                        int n132;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip357 = (IntegerProperty)_bs;
                            n132 = (Integer)blockstate.m_61143_((Property)_getip357);
                        } else {
                            n132 = -1;
                        }
                        int _value = n132 - 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if ((_value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip360 = (IntegerProperty)_value6;
                    n123 = (Integer)blockstate.m_61143_((Property)_getip360);
                } else {
                    n123 = -1;
                }
                if (n123 < 12) return;
                _value6 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value6 instanceof IntegerProperty) {
                    IntegerProperty _getip362 = (IntegerProperty)_value6;
                    n122 = (Integer)blockstate.m_61143_((Property)_getip362);
                } else {
                    n122 = -1;
                }
                if (n122 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip364 = (IntegerProperty)_bs;
                    n121 = (Integer)blockstate.m_61143_((Property)_getip364);
                } else {
                    n121 = -1;
                }
                int _value = n121 - 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == new Object(){

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
            }.getDirection(blockstate)) {
                int n133;
                int n134;
                int n135;
                int n136;
                int n137;
                int n138;
                Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip374 = (IntegerProperty)_value;
                    n138 = (Integer)blockstate.m_61143_((Property)_getip374);
                } else {
                    n138 = -1;
                }
                if (n138 >= 0) {
                    int n139;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip376 = (IntegerProperty)_value;
                        n139 = (Integer)blockstate.m_61143_((Property)_getip376);
                    } else {
                        n139 = -1;
                    }
                    if (n139 <= 3) {
                        int n140;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip378 = (IntegerProperty)_bs;
                            n140 = (Integer)blockstate.m_61143_((Property)_getip378);
                        } else {
                            n140 = -1;
                        }
                        int _value17 = n140 + 12;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value17)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value17)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip381 = (IntegerProperty)_value;
                    n137 = (Integer)blockstate.m_61143_((Property)_getip381);
                } else {
                    n137 = -1;
                }
                if (n137 >= 4) {
                    int n141;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip383 = (IntegerProperty)_value;
                        n141 = (Integer)blockstate.m_61143_((Property)_getip383);
                    } else {
                        n141 = -1;
                    }
                    if (n141 <= 7) {
                        int n142;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip385 = (IntegerProperty)_bs;
                            n142 = (Integer)blockstate.m_61143_((Property)_getip385);
                        } else {
                            n142 = -1;
                        }
                        int _value18 = n142 + 8;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value18)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value18)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip388 = (IntegerProperty)_value;
                    n136 = (Integer)blockstate.m_61143_((Property)_getip388);
                } else {
                    n136 = -1;
                }
                if (n136 >= 8) {
                    int n143;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip390 = (IntegerProperty)_value;
                        n143 = (Integer)blockstate.m_61143_((Property)_getip390);
                    } else {
                        n143 = -1;
                    }
                    if (n143 <= 11) {
                        int n144;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip392 = (IntegerProperty)_bs;
                            n144 = (Integer)blockstate.m_61143_((Property)_getip392);
                        } else {
                            n144 = -1;
                        }
                        int _value19 = n144 + 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value19)) return;
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value19)), 3);
                        return;
                    }
                }
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip395 = (IntegerProperty)_value;
                    n135 = (Integer)blockstate.m_61143_((Property)_getip395);
                } else {
                    n135 = -1;
                }
                if (n135 < 12) return;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip397 = (IntegerProperty)_value;
                    n134 = (Integer)blockstate.m_61143_((Property)_getip397);
                } else {
                    n134 = -1;
                }
                if (n134 > 15) return;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip399 = (IntegerProperty)_bs;
                    n133 = (Integer)blockstate.m_61143_((Property)_getip399);
                } else {
                    n133 = -1;
                }
                int _value7 = n133 + 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value7)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                return;
            }
            Property _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value7 instanceof IntegerProperty) {
                IntegerProperty _getip402 = (IntegerProperty)_value7;
                n108 = (Integer)blockstate.m_61143_((Property)_getip402);
            } else {
                n108 = -1;
            }
            if (n108 >= 0) {
                int n145;
                _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value7 instanceof IntegerProperty) {
                    IntegerProperty _getip404 = (IntegerProperty)_value7;
                    n145 = (Integer)blockstate.m_61143_((Property)_getip404);
                } else {
                    n145 = -1;
                }
                if (n145 <= 3) {
                    int n146;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip406 = (IntegerProperty)_bs;
                        n146 = (Integer)blockstate.m_61143_((Property)_getip406);
                    } else {
                        n146 = -1;
                    }
                    int _value = n146 + 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip409 = (IntegerProperty)_value7;
                n107 = (Integer)blockstate.m_61143_((Property)_getip409);
            } else {
                n107 = -1;
            }
            if (n107 >= 4) {
                int n147;
                _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value7 instanceof IntegerProperty) {
                    IntegerProperty _getip411 = (IntegerProperty)_value7;
                    n147 = (Integer)blockstate.m_61143_((Property)_getip411);
                } else {
                    n147 = -1;
                }
                if (n147 <= 7) {
                    int n148;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip413 = (IntegerProperty)_bs;
                        n148 = (Integer)blockstate.m_61143_((Property)_getip413);
                    } else {
                        n148 = -1;
                    }
                    int _value = n148 - 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip416 = (IntegerProperty)_value7;
                n106 = (Integer)blockstate.m_61143_((Property)_getip416);
            } else {
                n106 = -1;
            }
            if (n106 >= 8) {
                int n149;
                _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value7 instanceof IntegerProperty) {
                    IntegerProperty _getip418 = (IntegerProperty)_value7;
                    n149 = (Integer)blockstate.m_61143_((Property)_getip418);
                } else {
                    n149 = -1;
                }
                if (n149 <= 11) {
                    int n150;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip420 = (IntegerProperty)_bs;
                        n150 = (Integer)blockstate.m_61143_((Property)_getip420);
                    } else {
                        n150 = -1;
                    }
                    int _value = n150 - 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip423 = (IntegerProperty)_value7;
                n105 = (Integer)blockstate.m_61143_((Property)_getip423);
            } else {
                n105 = -1;
            }
            if (n105 < 12) return;
            _value7 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value7 instanceof IntegerProperty) {
                IntegerProperty _getip425 = (IntegerProperty)_value7;
                n104 = (Integer)blockstate.m_61143_((Property)_getip425);
            } else {
                n104 = -1;
            }
            if (n104 > 15) return;
            Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip427 = (IntegerProperty)_bs;
                n103 = (Integer)blockstate.m_61143_((Property)_getip427);
            } else {
                n103 = -1;
            }
            int _value = n103 - 12;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
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
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == new Object(){

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
        }.getDirection(blockstate) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == new Object(){

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
        }.getDirection(blockstate)) {
            int n151;
            int n152;
            int n153;
            int n154;
            int n155;
            int n156;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip447 = (IntegerProperty)_value;
                n156 = (Integer)blockstate.m_61143_((Property)_getip447);
            } else {
                n156 = -1;
            }
            if (n156 >= 0) {
                int n157;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip449 = (IntegerProperty)_value;
                    n157 = (Integer)blockstate.m_61143_((Property)_getip449);
                } else {
                    n157 = -1;
                }
                if (n157 <= 3) {
                    int n158;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip451 = (IntegerProperty)_bs;
                        n158 = (Integer)blockstate.m_61143_((Property)_getip451);
                    } else {
                        n158 = -1;
                    }
                    int _value20 = n158 + 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value20)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value20)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip454 = (IntegerProperty)_value;
                n155 = (Integer)blockstate.m_61143_((Property)_getip454);
            } else {
                n155 = -1;
            }
            if (n155 >= 4) {
                int n159;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip456 = (IntegerProperty)_value;
                    n159 = (Integer)blockstate.m_61143_((Property)_getip456);
                } else {
                    n159 = -1;
                }
                if (n159 <= 7) {
                    int n160;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip458 = (IntegerProperty)_bs;
                        n160 = (Integer)blockstate.m_61143_((Property)_getip458);
                    } else {
                        n160 = -1;
                    }
                    int _value21 = n160 + 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value21)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value21)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip461 = (IntegerProperty)_value;
                n154 = (Integer)blockstate.m_61143_((Property)_getip461);
            } else {
                n154 = -1;
            }
            if (n154 >= 8) {
                int n161;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip463 = (IntegerProperty)_value;
                    n161 = (Integer)blockstate.m_61143_((Property)_getip463);
                } else {
                    n161 = -1;
                }
                if (n161 <= 11) {
                    int n162;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip465 = (IntegerProperty)_bs;
                        n162 = (Integer)blockstate.m_61143_((Property)_getip465);
                    } else {
                        n162 = -1;
                    }
                    int _value22 = n162 + 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value22)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value22)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip468 = (IntegerProperty)_value;
                n153 = (Integer)blockstate.m_61143_((Property)_getip468);
            } else {
                n153 = -1;
            }
            if (n153 < 12) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip470 = (IntegerProperty)_value;
                n152 = (Integer)blockstate.m_61143_((Property)_getip470);
            } else {
                n152 = -1;
            }
            if (n152 > 15) return;
            Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip472 = (IntegerProperty)_bs;
                n151 = (Integer)blockstate.m_61143_((Property)_getip472);
            } else {
                n151 = -1;
            }
            int _value8 = n151 - 4;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value8)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == new Object(){

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
        }.getDirection(blockstate)) {
            int n163;
            int n164;
            int n165;
            int n166;
            int n167;
            int n168;
            Property _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value8 instanceof IntegerProperty) {
                IntegerProperty _getip482 = (IntegerProperty)_value8;
                n168 = (Integer)blockstate.m_61143_((Property)_getip482);
            } else {
                n168 = -1;
            }
            if (n168 >= 0) {
                int n169;
                _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip484 = (IntegerProperty)_value8;
                    n169 = (Integer)blockstate.m_61143_((Property)_getip484);
                } else {
                    n169 = -1;
                }
                if (n169 <= 3) {
                    int n170;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip486 = (IntegerProperty)_bs;
                        n170 = (Integer)blockstate.m_61143_((Property)_getip486);
                    } else {
                        n170 = -1;
                    }
                    int _value = n170 + 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip489 = (IntegerProperty)_value8;
                n167 = (Integer)blockstate.m_61143_((Property)_getip489);
            } else {
                n167 = -1;
            }
            if (n167 >= 4) {
                int n171;
                _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip491 = (IntegerProperty)_value8;
                    n171 = (Integer)blockstate.m_61143_((Property)_getip491);
                } else {
                    n171 = -1;
                }
                if (n171 <= 7) {
                    int n172;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip493 = (IntegerProperty)_bs;
                        n172 = (Integer)blockstate.m_61143_((Property)_getip493);
                    } else {
                        n172 = -1;
                    }
                    int _value = n172 + 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip496 = (IntegerProperty)_value8;
                n166 = (Integer)blockstate.m_61143_((Property)_getip496);
            } else {
                n166 = -1;
            }
            if (n166 >= 8) {
                int n173;
                _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value8 instanceof IntegerProperty) {
                    IntegerProperty _getip498 = (IntegerProperty)_value8;
                    n173 = (Integer)blockstate.m_61143_((Property)_getip498);
                } else {
                    n173 = -1;
                }
                if (n173 <= 11) {
                    int n174;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip500 = (IntegerProperty)_bs;
                        n174 = (Integer)blockstate.m_61143_((Property)_getip500);
                    } else {
                        n174 = -1;
                    }
                    int _value = n174 - 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if ((_value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip503 = (IntegerProperty)_value8;
                n165 = (Integer)blockstate.m_61143_((Property)_getip503);
            } else {
                n165 = -1;
            }
            if (n165 < 12) return;
            _value8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value8 instanceof IntegerProperty) {
                IntegerProperty _getip505 = (IntegerProperty)_value8;
                n164 = (Integer)blockstate.m_61143_((Property)_getip505);
            } else {
                n164 = -1;
            }
            if (n164 > 15) return;
            Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip507 = (IntegerProperty)_bs;
                n163 = (Integer)blockstate.m_61143_((Property)_getip507);
            } else {
                n163 = -1;
            }
            int _value = n163 - 8;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma"))) && new Object(){

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
        }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == new Object(){

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
        }.getDirection(blockstate)) {
            int n175;
            int n176;
            int n177;
            int n178;
            int n179;
            int n180;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip517 = (IntegerProperty)_value;
                n180 = (Integer)blockstate.m_61143_((Property)_getip517);
            } else {
                n180 = -1;
            }
            if (n180 >= 0) {
                int n181;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip519 = (IntegerProperty)_value;
                    n181 = (Integer)blockstate.m_61143_((Property)_getip519);
                } else {
                    n181 = -1;
                }
                if (n181 <= 3) {
                    int n182;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip521 = (IntegerProperty)_bs;
                        n182 = (Integer)blockstate.m_61143_((Property)_getip521);
                    } else {
                        n182 = -1;
                    }
                    int _value23 = n182 + 12;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value23)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value23)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip524 = (IntegerProperty)_value;
                n179 = (Integer)blockstate.m_61143_((Property)_getip524);
            } else {
                n179 = -1;
            }
            if (n179 >= 4) {
                int n183;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip526 = (IntegerProperty)_value;
                    n183 = (Integer)blockstate.m_61143_((Property)_getip526);
                } else {
                    n183 = -1;
                }
                if (n183 <= 7) {
                    int n184;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip528 = (IntegerProperty)_bs;
                        n184 = (Integer)blockstate.m_61143_((Property)_getip528);
                    } else {
                        n184 = -1;
                    }
                    int _value24 = n184 + 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value24)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value24)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip531 = (IntegerProperty)_value;
                n178 = (Integer)blockstate.m_61143_((Property)_getip531);
            } else {
                n178 = -1;
            }
            if (n178 >= 8) {
                int n185;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip533 = (IntegerProperty)_value;
                    n185 = (Integer)blockstate.m_61143_((Property)_getip533);
                } else {
                    n185 = -1;
                }
                if (n185 <= 11) {
                    int n186;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip535 = (IntegerProperty)_bs;
                        n186 = (Integer)blockstate.m_61143_((Property)_getip535);
                    } else {
                        n186 = -1;
                    }
                    int _value25 = n186 + 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value25)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value25)), 3);
                    return;
                }
            }
            if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip538 = (IntegerProperty)_value;
                n177 = (Integer)blockstate.m_61143_((Property)_getip538);
            } else {
                n177 = -1;
            }
            if (n177 < 12) return;
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip540 = (IntegerProperty)_value;
                n176 = (Integer)blockstate.m_61143_((Property)_getip540);
            } else {
                n176 = -1;
            }
            if (n176 > 15) return;
            Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip542 = (IntegerProperty)_bs;
                n175 = (Integer)blockstate.m_61143_((Property)_getip542);
            } else {
                n175 = -1;
            }
            int _value9 = n175 + 0;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value9)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value9)), 3);
            return;
        }
        Property _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value9 instanceof IntegerProperty) {
            IntegerProperty _getip545 = (IntegerProperty)_value9;
            n6 = (Integer)blockstate.m_61143_((Property)_getip545);
        } else {
            n6 = -1;
        }
        if (n6 >= 0) {
            int n187;
            _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value9 instanceof IntegerProperty) {
                IntegerProperty _getip547 = (IntegerProperty)_value9;
                n187 = (Integer)blockstate.m_61143_((Property)_getip547);
            } else {
                n187 = -1;
            }
            if (n187 <= 3) {
                int n188;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip549 = (IntegerProperty)_bs;
                    n188 = (Integer)blockstate.m_61143_((Property)_getip549);
                } else {
                    n188 = -1;
                }
                int _value = n188 + 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
        }
        if ((_value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip552 = (IntegerProperty)_value9;
            n5 = (Integer)blockstate.m_61143_((Property)_getip552);
        } else {
            n5 = -1;
        }
        if (n5 >= 4) {
            int n189;
            _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value9 instanceof IntegerProperty) {
                IntegerProperty _getip554 = (IntegerProperty)_value9;
                n189 = (Integer)blockstate.m_61143_((Property)_getip554);
            } else {
                n189 = -1;
            }
            if (n189 <= 7) {
                int n190;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip556 = (IntegerProperty)_bs;
                    n190 = (Integer)blockstate.m_61143_((Property)_getip556);
                } else {
                    n190 = -1;
                }
                int _value = n190 - 4;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
        }
        if ((_value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip559 = (IntegerProperty)_value9;
            n4 = (Integer)blockstate.m_61143_((Property)_getip559);
        } else {
            n4 = -1;
        }
        if (n4 >= 8) {
            int n191;
            _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value9 instanceof IntegerProperty) {
                IntegerProperty _getip561 = (IntegerProperty)_value9;
                n191 = (Integer)blockstate.m_61143_((Property)_getip561);
            } else {
                n191 = -1;
            }
            if (n191 <= 11) {
                int n192;
                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip563 = (IntegerProperty)_bs;
                    n192 = (Integer)blockstate.m_61143_((Property)_getip563);
                } else {
                    n192 = -1;
                }
                int _value = n192 - 8;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
        }
        if ((_value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip566 = (IntegerProperty)_value9;
            n3 = (Integer)blockstate.m_61143_((Property)_getip566);
        } else {
            n3 = -1;
        }
        if (n3 < 12) return;
        _value9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value9 instanceof IntegerProperty) {
            IntegerProperty _getip568 = (IntegerProperty)_value9;
            n2 = (Integer)blockstate.m_61143_((Property)_getip568);
        } else {
            n2 = -1;
        }
        if (n2 > 15) return;
        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_bs instanceof IntegerProperty) {
            IntegerProperty _getip570 = (IntegerProperty)_bs;
            n = (Integer)blockstate.m_61143_((Property)_getip570);
        } else {
            n = -1;
        }
        int _value = n - 12;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        _bs = world.m_8055_(_pos);
        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property;
        if (!_integerProp.m_6908_().contains(_value)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
    }
}

