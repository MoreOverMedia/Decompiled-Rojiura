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
import rojiuramod.procedures.Totan815Procedure;

public class TotanRoofBlueBlockDangPiLinFangKuaiGengXinShiProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        int n;
        int n2;
        int n3;
        Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (property instanceof IntegerProperty) {
            IntegerProperty _getip1 = (IntegerProperty)property;
            n3 = (Integer)blockstate.m_61143_((Property)_getip1);
        } else {
            n3 = -1;
        }
        if (n3 >= 0) {
            int n4;
            property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty) {
                IntegerProperty _getip3 = (IntegerProperty)property;
                n4 = (Integer)blockstate.m_61143_((Property)_getip3);
            } else {
                n4 = -1;
            }
            if (n4 <= 7) {
                Property _value25;
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
                        int n5;
                        Property property2 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (property2 instanceof IntegerProperty) {
                            IntegerProperty _getip10 = (IntegerProperty)property2;
                            n5 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip10);
                        } else {
                            n5 = -1;
                        }
                        if (n5 >= 0) {
                            int n6;
                            property2 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (property2 instanceof IntegerProperty) {
                                IntegerProperty _getip12 = (IntegerProperty)property2;
                                n6 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip12);
                            } else {
                                n6 = -1;
                            }
                            if (n6 <= 7 && new Object(){

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
                                    int _value3 = 4;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property3 instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property3;
                                    if (!_integerProp.m_6908_().contains(_value3)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
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
                                int _value22 = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property4 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property4;
                                if (!_integerProp.m_6908_().contains(_value22)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value22)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n7;
                        _value22 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value22 instanceof IntegerProperty) {
                            IntegerProperty _getip41 = (IntegerProperty)_value22;
                            n7 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip41);
                        } else {
                            n7 = -1;
                        }
                        if (n7 >= 0) {
                            int n8;
                            _value22 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value22 instanceof IntegerProperty) {
                                IntegerProperty _getip43 = (IntegerProperty)_value22;
                                n8 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip43);
                            } else {
                                n8 = -1;
                            }
                            if (n8 <= 7 && new Object(){

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
                                    int _value4 = 6;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property5 instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property5;
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
                                int _value5 = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property6 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property6 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property6;
                                if (!_integerProp.m_6908_().contains(_value5)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n9;
                        _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value22 instanceof IntegerProperty) {
                            IntegerProperty _getip72 = (IntegerProperty)_value22;
                            n9 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip72);
                        } else {
                            n9 = -1;
                        }
                        if (n9 >= 0) {
                            int n10;
                            _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value22 instanceof IntegerProperty) {
                                IntegerProperty _getip74 = (IntegerProperty)_value22;
                                n10 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip74);
                            } else {
                                n10 = -1;
                            }
                            if (n10 <= 7 && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                                int n11;
                                _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value22 instanceof IntegerProperty) {
                                    IntegerProperty _getip78 = (IntegerProperty)_value22;
                                    n11 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip78);
                                } else {
                                    n11 = -1;
                                }
                                if (n11 >= 0) {
                                    int n12;
                                    _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                    if (_value22 instanceof IntegerProperty) {
                                        IntegerProperty _getip80 = (IntegerProperty)_value22;
                                        n12 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip80);
                                    } else {
                                        n12 = -1;
                                    }
                                    if (n12 <= 7) {
                                        int _value6 = 2;
                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                        BlockState _bs = world.m_8055_(_pos);
                                        Property property7 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                        if (!(property7 instanceof IntegerProperty)) return;
                                        IntegerProperty _integerProp = (IntegerProperty)property7;
                                        if (!_integerProp.m_6908_().contains(_value6)) return;
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n13;
                        _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value22 instanceof IntegerProperty) {
                            IntegerProperty _getip85 = (IntegerProperty)_value22;
                            n13 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip85);
                        } else {
                            n13 = -1;
                        }
                        if (n13 >= 0) {
                            int n14;
                            _value22 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value22 instanceof IntegerProperty) {
                                IntegerProperty _getip87 = (IntegerProperty)_value22;
                                n14 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip87);
                            } else {
                                n14 = -1;
                            }
                            if (n14 <= 7) {
                                int _value7 = 1;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property8 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property8 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property8;
                                if (!_integerProp.m_6908_().contains(_value7)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n15;
                        _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value22 instanceof IntegerProperty) {
                            IntegerProperty _getip92 = (IntegerProperty)_value22;
                            n15 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip92);
                        } else {
                            n15 = -1;
                        }
                        if (n15 >= 0) {
                            int n16;
                            _value22 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value22 instanceof IntegerProperty) {
                                IntegerProperty _getip94 = (IntegerProperty)_value22;
                                n16 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip94);
                            } else {
                                n16 = -1;
                            }
                            if (n16 <= 7) {
                                int _value8 = 3;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property9 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property9 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property9;
                                if (!_integerProp.m_6908_().contains(_value8)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
                                return;
                            }
                        }
                    }
                    int _value9 = 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property10 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property10 instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property10;
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
                }.getDirection(blockstate) == Direction.SOUTH) {
                    Property _value9;
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n17;
                        _value9 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value9 instanceof IntegerProperty) {
                            IntegerProperty _getip103 = (IntegerProperty)_value9;
                            n17 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip103);
                        } else {
                            n17 = -1;
                        }
                        if (n17 >= 0) {
                            int n18;
                            _value9 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value9 instanceof IntegerProperty) {
                                IntegerProperty _getip105 = (IntegerProperty)_value9;
                                n18 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip105);
                            } else {
                                n18 = -1;
                            }
                            if (n18 <= 7 && new Object(){

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
                                    int _value10 = 4;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property11 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property11 instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property11;
                                    if (!_integerProp.m_6908_().contains(_value10)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
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
                                int _value11 = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property12 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property12 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property12;
                                if (!_integerProp.m_6908_().contains(_value11)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n19;
                        _value9 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value9 instanceof IntegerProperty) {
                            IntegerProperty _getip134 = (IntegerProperty)_value9;
                            n19 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip134);
                        } else {
                            n19 = -1;
                        }
                        if (n19 >= 0) {
                            int n20;
                            _value9 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value9 instanceof IntegerProperty) {
                                IntegerProperty _getip136 = (IntegerProperty)_value9;
                                n20 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip136);
                            } else {
                                n20 = -1;
                            }
                            if (n20 <= 7 && new Object(){

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
                                    int _value12 = 6;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property13 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property13 instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property13;
                                    if (!_integerProp.m_6908_().contains(_value12)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
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
                                int _value13 = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property14 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property14 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property14;
                                if (!_integerProp.m_6908_().contains(_value13)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value13)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n21;
                        _value9 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value9 instanceof IntegerProperty) {
                            IntegerProperty _getip165 = (IntegerProperty)_value9;
                            n21 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip165);
                        } else {
                            n21 = -1;
                        }
                        if (n21 >= 0) {
                            int n22;
                            _value9 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value9 instanceof IntegerProperty) {
                                IntegerProperty _getip167 = (IntegerProperty)_value9;
                                n22 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip167);
                            } else {
                                n22 = -1;
                            }
                            if (n22 <= 7 && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                                int n23;
                                _value9 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value9 instanceof IntegerProperty) {
                                    IntegerProperty _getip171 = (IntegerProperty)_value9;
                                    n23 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip171);
                                } else {
                                    n23 = -1;
                                }
                                if (n23 >= 0) {
                                    int n24;
                                    _value9 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                                    if (_value9 instanceof IntegerProperty) {
                                        IntegerProperty _getip173 = (IntegerProperty)_value9;
                                        n24 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip173);
                                    } else {
                                        n24 = -1;
                                    }
                                    if (n24 <= 7) {
                                        int _value14 = 2;
                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                        BlockState _bs = world.m_8055_(_pos);
                                        Property property15 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                        if (!(property15 instanceof IntegerProperty)) return;
                                        IntegerProperty _integerProp = (IntegerProperty)property15;
                                        if (!_integerProp.m_6908_().contains(_value14)) return;
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n25;
                        _value9 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value9 instanceof IntegerProperty) {
                            IntegerProperty _getip178 = (IntegerProperty)_value9;
                            n25 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip178);
                        } else {
                            n25 = -1;
                        }
                        if (n25 >= 0) {
                            int n26;
                            _value9 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value9 instanceof IntegerProperty) {
                                IntegerProperty _getip180 = (IntegerProperty)_value9;
                                n26 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip180);
                            } else {
                                n26 = -1;
                            }
                            if (n26 <= 7) {
                                int _value15 = 1;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property16 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property16 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property16;
                                if (!_integerProp.m_6908_().contains(_value15)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value15)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n27;
                        _value9 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value9 instanceof IntegerProperty) {
                            IntegerProperty _getip185 = (IntegerProperty)_value9;
                            n27 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip185);
                        } else {
                            n27 = -1;
                        }
                        if (n27 >= 0) {
                            int n28;
                            _value9 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value9 instanceof IntegerProperty) {
                                IntegerProperty _getip187 = (IntegerProperty)_value9;
                                n28 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip187);
                            } else {
                                n28 = -1;
                            }
                            if (n28 <= 7) {
                                int _value16 = 3;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property17 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property17 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property17;
                                if (!_integerProp.m_6908_().contains(_value16)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value16)), 3);
                                return;
                            }
                        }
                    }
                    int _value17 = 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property18 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property18 instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property18;
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
                }.getDirection(blockstate) == Direction.WEST) {
                    Property _value17;
                    if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n29;
                        _value17 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value17 instanceof IntegerProperty) {
                            IntegerProperty _getip196 = (IntegerProperty)_value17;
                            n29 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip196);
                        } else {
                            n29 = -1;
                        }
                        if (n29 >= 0) {
                            int n30;
                            _value17 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value17 instanceof IntegerProperty) {
                                IntegerProperty _getip198 = (IntegerProperty)_value17;
                                n30 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip198);
                            } else {
                                n30 = -1;
                            }
                            if (n30 <= 7 && new Object(){

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
                                    int _value18 = 4;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property19 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property19 instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property19;
                                    if (!_integerProp.m_6908_().contains(_value18)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value18)), 3);
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
                                int _value19 = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property20 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property20 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property20;
                                if (!_integerProp.m_6908_().contains(_value19)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value19)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n31;
                        _value17 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value17 instanceof IntegerProperty) {
                            IntegerProperty _getip227 = (IntegerProperty)_value17;
                            n31 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip227);
                        } else {
                            n31 = -1;
                        }
                        if (n31 >= 0) {
                            int n32;
                            _value17 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value17 instanceof IntegerProperty) {
                                IntegerProperty _getip229 = (IntegerProperty)_value17;
                                n32 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip229);
                            } else {
                                n32 = -1;
                            }
                            if (n32 <= 7 && new Object(){

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
                                    int _value20 = 6;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property21 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property21 instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property21;
                                    if (!_integerProp.m_6908_().contains(_value20)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value20)), 3);
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
                                int _value21 = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property22 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property22 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property22;
                                if (!_integerProp.m_6908_().contains(_value21)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value21)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n33;
                        _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value17 instanceof IntegerProperty) {
                            IntegerProperty _getip258 = (IntegerProperty)_value17;
                            n33 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip258);
                        } else {
                            n33 = -1;
                        }
                        if (n33 >= 0) {
                            int n34;
                            _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value17 instanceof IntegerProperty) {
                                IntegerProperty _getip260 = (IntegerProperty)_value17;
                                n34 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip260);
                            } else {
                                n34 = -1;
                            }
                            if (n34 <= 7 && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                                int n35;
                                _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value17 instanceof IntegerProperty) {
                                    IntegerProperty _getip264 = (IntegerProperty)_value17;
                                    n35 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip264);
                                } else {
                                    n35 = -1;
                                }
                                if (n35 >= 0) {
                                    int n36;
                                    _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                                    if (_value17 instanceof IntegerProperty) {
                                        IntegerProperty _getip266 = (IntegerProperty)_value17;
                                        n36 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip266);
                                    } else {
                                        n36 = -1;
                                    }
                                    if (n36 <= 7) {
                                        int _value22 = 2;
                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                        BlockState _bs = world.m_8055_(_pos);
                                        Property property23 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                        if (!(property23 instanceof IntegerProperty)) return;
                                        IntegerProperty _integerProp = (IntegerProperty)property23;
                                        if (!_integerProp.m_6908_().contains(_value22)) return;
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value22)), 3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n37;
                        _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value17 instanceof IntegerProperty) {
                            IntegerProperty _getip271 = (IntegerProperty)_value17;
                            n37 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip271);
                        } else {
                            n37 = -1;
                        }
                        if (n37 >= 0) {
                            int n38;
                            _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value17 instanceof IntegerProperty) {
                                IntegerProperty _getip273 = (IntegerProperty)_value17;
                                n38 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip273);
                            } else {
                                n38 = -1;
                            }
                            if (n38 <= 7) {
                                int _value23 = 1;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property24 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property24 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property24;
                                if (!_integerProp.m_6908_().contains(_value23)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value23)), 3);
                                return;
                            }
                        }
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                        int n39;
                        _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value17 instanceof IntegerProperty) {
                            IntegerProperty _getip278 = (IntegerProperty)_value17;
                            n39 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip278);
                        } else {
                            n39 = -1;
                        }
                        if (n39 >= 0) {
                            int n40;
                            _value17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value17 instanceof IntegerProperty) {
                                IntegerProperty _getip280 = (IntegerProperty)_value17;
                                n40 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip280);
                            } else {
                                n40 = -1;
                            }
                            if (n40 <= 7) {
                                int _value24 = 3;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property25 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property25 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property25;
                                if (!_integerProp.m_6908_().contains(_value24)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value24)), 3);
                                return;
                            }
                        }
                    }
                    int _value25 = 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property26 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property26 instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property26;
                    if (!_integerProp.m_6908_().contains(_value25)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value25)), 3);
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
                    int n41;
                    _value25 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value25 instanceof IntegerProperty) {
                        IntegerProperty _getip289 = (IntegerProperty)_value25;
                        n41 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip289);
                    } else {
                        n41 = -1;
                    }
                    if (n41 >= 0) {
                        int n42;
                        _value25 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value25 instanceof IntegerProperty) {
                            IntegerProperty _getip291 = (IntegerProperty)_value25;
                            n42 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip291);
                        } else {
                            n42 = -1;
                        }
                        if (n42 <= 7 && new Object(){

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
                                int _value26 = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property27 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property27 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property27;
                                if (!_integerProp.m_6908_().contains(_value26)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value26)), 3);
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
                            int _value27 = 5;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property28 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property28 instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property28;
                            if (!_integerProp.m_6908_().contains(_value27)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value27)), 3);
                            return;
                        }
                    }
                }
                if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                    int n43;
                    _value25 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value25 instanceof IntegerProperty) {
                        IntegerProperty _getip320 = (IntegerProperty)_value25;
                        n43 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip320);
                    } else {
                        n43 = -1;
                    }
                    if (n43 >= 0) {
                        int n44;
                        _value25 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value25 instanceof IntegerProperty) {
                            IntegerProperty _getip322 = (IntegerProperty)_value25;
                            n44 = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip322);
                        } else {
                            n44 = -1;
                        }
                        if (n44 <= 7 && new Object(){

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
                                int _value28 = 6;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property29 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (!(property29 instanceof IntegerProperty)) return;
                                IntegerProperty _integerProp = (IntegerProperty)property29;
                                if (!_integerProp.m_6908_().contains(_value28)) return;
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value28)), 3);
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
                            int _value29 = 7;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property30 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property30 instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property30;
                            if (!_integerProp.m_6908_().contains(_value29)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value29)), 3);
                            return;
                        }
                    }
                }
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                    int n45;
                    _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value25 instanceof IntegerProperty) {
                        IntegerProperty _getip351 = (IntegerProperty)_value25;
                        n45 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip351);
                    } else {
                        n45 = -1;
                    }
                    if (n45 >= 0) {
                        int n46;
                        _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value25 instanceof IntegerProperty) {
                            IntegerProperty _getip353 = (IntegerProperty)_value25;
                            n46 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip353);
                        } else {
                            n46 = -1;
                        }
                        if (n46 <= 7 && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                            int n47;
                            _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value25 instanceof IntegerProperty) {
                                IntegerProperty _getip357 = (IntegerProperty)_value25;
                                n47 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip357);
                            } else {
                                n47 = -1;
                            }
                            if (n47 >= 0) {
                                int n48;
                                _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value25 instanceof IntegerProperty) {
                                    IntegerProperty _getip359 = (IntegerProperty)_value25;
                                    n48 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip359);
                                } else {
                                    n48 = -1;
                                }
                                if (n48 <= 7) {
                                    int _value30 = 2;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property31 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (!(property31 instanceof IntegerProperty)) return;
                                    IntegerProperty _integerProp = (IntegerProperty)property31;
                                    if (!_integerProp.m_6908_().contains(_value30)) return;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value30)), 3);
                                    return;
                                }
                            }
                        }
                    }
                }
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                    int n49;
                    _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value25 instanceof IntegerProperty) {
                        IntegerProperty _getip364 = (IntegerProperty)_value25;
                        n49 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip364);
                    } else {
                        n49 = -1;
                    }
                    if (n49 >= 0) {
                        int n50;
                        _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value25 instanceof IntegerProperty) {
                            IntegerProperty _getip366 = (IntegerProperty)_value25;
                            n50 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip366);
                        } else {
                            n50 = -1;
                        }
                        if (n50 <= 7) {
                            int _value31 = 1;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property32 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property32 instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property32;
                            if (!_integerProp.m_6908_().contains(_value31)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value31)), 3);
                            return;
                        }
                    }
                }
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) {
                    int n51;
                    _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value25 instanceof IntegerProperty) {
                        IntegerProperty _getip371 = (IntegerProperty)_value25;
                        n51 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip371);
                    } else {
                        n51 = -1;
                    }
                    if (n51 >= 0) {
                        int n52;
                        _value25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value25 instanceof IntegerProperty) {
                            IntegerProperty _getip373 = (IntegerProperty)_value25;
                            n52 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip373);
                        } else {
                            n52 = -1;
                        }
                        if (n52 <= 7) {
                            int _value32 = 3;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property33 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (!(property33 instanceof IntegerProperty)) return;
                            IntegerProperty _integerProp = (IntegerProperty)property33;
                            if (!_integerProp.m_6908_().contains(_value32)) return;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value32)), 3);
                            return;
                        }
                    }
                }
                int _value33 = 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property34 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property34 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property34;
                if (!_integerProp.m_6908_().contains(_value33)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value33)), 3);
                return;
            }
        }
        if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip377 = (IntegerProperty)property;
            n2 = (Integer)blockstate.m_61143_((Property)_getip377);
        } else {
            n2 = -1;
        }
        if (n2 < 8) return;
        property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (property instanceof IntegerProperty) {
            IntegerProperty _getip379 = (IntegerProperty)property;
            n = (Integer)blockstate.m_61143_((Property)_getip379);
        } else {
            n = -1;
        }
        if (n > 23) return;
        Totan815Procedure.execute(world, x, y, z, blockstate);
    }
}

