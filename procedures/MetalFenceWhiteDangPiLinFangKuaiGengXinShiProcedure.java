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

public class MetalFenceWhiteDangPiLinFangKuaiGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs"))) && new Object(){

                public Direction getDirection(BlockState _bs) {
                    EnumProperty _ep;
                    Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_prop instanceof DirectionProperty) {
                        DirectionProperty _dp = (DirectionProperty)_prop;
                        return (Direction)_bs.m_61143_((Property)_dp);
                    }
                    _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                    return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                }
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))) == Direction.WEST) {
                int n;
                Property property = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip8 = (IntegerProperty)property;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getip8);
                } else {
                    n = -1;
                }
                if (n == 0) {
                    DirectionProperty _dp;
                    IntegerProperty _integerProp;
                    int _value = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property2).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    Direction _dir = new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))).m_175362_(Direction.Axis.Y);
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
                    } else {
                        EnumProperty _ap;
                        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))).m_175362_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp;
                    int _value = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z))).m_175364_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp;
                    int _value = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs"))) && new Object(){

                public Direction getDirection(BlockState _bs) {
                    EnumProperty _ep;
                    Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_prop instanceof DirectionProperty) {
                        DirectionProperty _dp = (DirectionProperty)_prop;
                        return (Direction)_bs.m_61143_((Property)_dp);
                    }
                    _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                    return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                }
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))) == Direction.EAST) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip34 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getip34);
                } else {
                    n = -1;
                }
                if (n == 0) {
                    IntegerProperty _integerProp;
                    int _value2 = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value2)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                    }
                    Direction _dir = new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))).m_175362_(Direction.Axis.Y);
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                    } else {
                        EnumProperty _ap;
                        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))).m_175362_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp;
                    int _value3 = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value3)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z))).m_175364_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp;
                    int _value4 = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value4)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs"))) && new Object(){

                public Direction getDirection(BlockState _bs) {
                    EnumProperty _ep;
                    Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_prop instanceof DirectionProperty) {
                        DirectionProperty _dp = (DirectionProperty)_prop;
                        return (Direction)_bs.m_61143_((Property)_dp);
                    }
                    _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                    return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                }
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))) == Direction.NORTH) {
                int n;
                Property _value4 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value4 instanceof IntegerProperty) {
                    IntegerProperty _getip60 = (IntegerProperty)_value4;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getip60);
                } else {
                    n = -1;
                }
                if (n == 0) {
                    IntegerProperty _integerProp;
                    int _value = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    Direction _dir = new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))).m_175362_(Direction.Axis.Y);
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                    } else {
                        EnumProperty _ap;
                        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))).m_175362_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp;
                    int _value = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)))).m_175364_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp;
                    int _value = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs"))) && new Object(){

                public Direction getDirection(BlockState _bs) {
                    EnumProperty _ep;
                    Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_prop instanceof DirectionProperty) {
                        DirectionProperty _dp = (DirectionProperty)_prop;
                        return (Direction)_bs.m_61143_((Property)_dp);
                    }
                    _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                    return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                }
            }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))) == Direction.SOUTH) {
                int n;
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip86 = (IntegerProperty)_value;
                    n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getip86);
                } else {
                    n = -1;
                }
                if (n == 0) {
                    IntegerProperty _integerProp;
                    int _value5 = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value5)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                    }
                    Direction _dir = new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))).m_175362_(Direction.Axis.Y);
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                    if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                    } else {
                        EnumProperty _ap;
                        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))).m_175362_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp;
                    int _value6 = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value6)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
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
                }.getDirection(blockstate) == new Object(){

                    public Direction getDirection(BlockState _bs) {
                        EnumProperty _ep;
                        Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_prop instanceof DirectionProperty) {
                            DirectionProperty _dp = (DirectionProperty)_prop;
                            return (Direction)_bs.m_61143_((Property)_dp);
                        }
                        _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                        return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                    }
                }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)))).m_175364_(Direction.Axis.Y)) {
                    IntegerProperty _integerProp2;
                    int _value7 = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_dp instanceof IntegerProperty && (_integerProp2 = (IntegerProperty)_dp).m_6908_().contains(_value7)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp2, (Comparable)Integer.valueOf(_value7)), 3);
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
            }.getDirection(blockstate) == Direction.NORTH) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalfence")))) {
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
                    }.getDirection(blockstate).m_175364_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                    }.getDirection(blockstate).m_175362_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 2;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    } else {
                        IntegerProperty _integerProp;
                        int _value = 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalfence")))) {
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
                    }.getDirection(blockstate).m_175364_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                    }.getDirection(blockstate).m_175362_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 2;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    } else {
                        IntegerProperty _integerProp;
                        int _value = 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalfence")))) {
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
                    }.getDirection(blockstate).m_175364_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                    }.getDirection(blockstate).m_175362_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 2;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    } else {
                        IntegerProperty _integerProp;
                        int _value = 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalfence")))) {
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
                    }.getDirection(blockstate).m_175364_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                    }.getDirection(blockstate).m_175362_(Direction.Axis.Y)) {
                        IntegerProperty _integerProp;
                        int _value = 2;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    } else {
                        IntegerProperty _integerProp;
                        int _value = 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 0;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property _integerProp2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_integerProp2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)_integerProp2).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
            int n;
            Property _bs = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip193 = (IntegerProperty)_bs;
                n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip193);
            } else {
                n = -1;
            }
            if (n != 2) {
                int n2;
                Property _dp = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_dp instanceof IntegerProperty) {
                    _getip195 = (IntegerProperty)_dp;
                    n2 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_(_getip195);
                } else {
                    n2 = -1;
                }
                if (n2 == 0) {
                    DirectionProperty _dp2;
                    Direction _dir = new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z))).m_175364_(Direction.Axis.Y);
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs2 = world.m_8055_(_pos);
                    Property _property = _bs2.m_60734_().m_49965_().m_61081_("facing");
                    if (_property instanceof DirectionProperty && (_dp2 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                        world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_dp2, (Comparable)_dir), 3);
                    } else {
                        EnumProperty _ap;
                        _property = _bs2.m_60734_().m_49965_().m_61081_("axis");
                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                            world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
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
                    }.getDirection(blockstate) == Direction.WEST) {
                        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                            int _value = 3;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                        } else {
                            int _value = 6;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                        if (!world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                            int _value = 3;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                        } else {
                            int _value = 6;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                            int _value = 3;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                        } else {
                            int _value = 6;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                    }.getDirection(blockstate) == Direction.NORTH) {
                        if (!world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                            int _value = 3;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                        } else {
                            int _value = 6;
                            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs2 = world.m_8055_(_pos);
                            var17_322 = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                            if (var17_322 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var17_322).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                        }
                    }
                } else {
                    int n3;
                    Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip229 = (IntegerProperty)_value;
                        n3 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip229);
                    } else {
                        n3 = -1;
                    }
                    if (n3 == 1) {
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value8 = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs3 = world.m_8055_(_pos);
                                Property property = _bs3.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value8)) {
                                    world.m_7731_(_pos, (BlockState)_bs3.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value9 = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs4 = world.m_8055_(_pos);
                                Property property = _bs4.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value9)) {
                                    world.m_7731_(_pos, (BlockState)_bs4.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value9)), 3);
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value10 = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs5 = world.m_8055_(_pos);
                                Property property = _bs5.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value10)) {
                                    world.m_7731_(_pos, (BlockState)_bs5.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value11 = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs6 = world.m_8055_(_pos);
                                Property property = _bs6.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value11)) {
                                    world.m_7731_(_pos, (BlockState)_bs6.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value12 = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs7 = world.m_8055_(_pos);
                                Property property = _bs7.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value12)) {
                                    world.m_7731_(_pos, (BlockState)_bs7.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value13 = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs8 = world.m_8055_(_pos);
                                Property property = _bs8.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value13)) {
                                    world.m_7731_(_pos, (BlockState)_bs8.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value13)), 3);
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
                        }.getDirection(blockstate) == Direction.NORTH) {
                            if (!world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value14 = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs9 = world.m_8055_(_pos);
                                Property property = _bs9.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value14)) {
                                    world.m_7731_(_pos, (BlockState)_bs9.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value15 = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs10 = world.m_8055_(_pos);
                                Property property = _bs10.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value15)) {
                                    world.m_7731_(_pos, (BlockState)_bs10.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value15)), 3);
                                }
                            }
                        }
                    } else {
                        int n4;
                        _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value instanceof IntegerProperty) {
                            IntegerProperty _getip259 = (IntegerProperty)_value;
                            n4 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip259);
                        } else {
                            n4 = -1;
                        }
                        if (n4 == 3) {
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
                                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                    IntegerProperty _integerProp;
                                    int _value16 = 5;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs11 = world.m_8055_(_pos);
                                    Property property = _bs11.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value16)) {
                                        world.m_7731_(_pos, (BlockState)_bs11.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value16)), 3);
                                    }
                                } else {
                                    IntegerProperty _integerProp;
                                    int _value17 = 8;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs12 = world.m_8055_(_pos);
                                    Property property = _bs12.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value17)) {
                                        world.m_7731_(_pos, (BlockState)_bs12.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value17)), 3);
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
                                if (!world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                    IntegerProperty _integerProp;
                                    int _value18 = 5;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs13 = world.m_8055_(_pos);
                                    Property property = _bs13.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value18)) {
                                        world.m_7731_(_pos, (BlockState)_bs13.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value18)), 3);
                                    }
                                } else {
                                    IntegerProperty _integerProp;
                                    int _value19 = 8;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs14 = world.m_8055_(_pos);
                                    Property property = _bs14.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value19)) {
                                        world.m_7731_(_pos, (BlockState)_bs14.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value19)), 3);
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
                                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                    IntegerProperty _integerProp;
                                    int _value20 = 5;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs15 = world.m_8055_(_pos);
                                    Property property = _bs15.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value20)) {
                                        world.m_7731_(_pos, (BlockState)_bs15.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value20)), 3);
                                    }
                                } else {
                                    IntegerProperty _integerProp;
                                    int _value21 = 8;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs16 = world.m_8055_(_pos);
                                    Property property = _bs16.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value21)) {
                                        world.m_7731_(_pos, (BlockState)_bs16.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value21)), 3);
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
                            }.getDirection(blockstate) == Direction.NORTH) {
                                if (!world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                    IntegerProperty _integerProp;
                                    int _value22 = 5;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs17 = world.m_8055_(_pos);
                                    Property property = _bs17.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value22)) {
                                        world.m_7731_(_pos, (BlockState)_bs17.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value22)), 3);
                                    }
                                } else {
                                    IntegerProperty _integerProp;
                                    int _value23 = 8;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs18 = world.m_8055_(_pos);
                                    Property property = _bs18.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value23)) {
                                        world.m_7731_(_pos, (BlockState)_bs18.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value23)), 3);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int n5;
                _getip195 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_getip195 instanceof IntegerProperty) {
                    IntegerProperty _getip289 = (IntegerProperty)_getip195;
                    n5 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip289);
                } else {
                    n5 = -1;
                }
                if (n5 == 2) {
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
                    }.getDirection(blockstate) == new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z))).m_175362_(Direction.Axis.Y)) {
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs19 = world.m_8055_(_pos);
                                Property property = _bs19.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs19.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 8;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs20 = world.m_8055_(_pos);
                                Property property = _bs20.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs20.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs21 = world.m_8055_(_pos);
                                Property property = _bs21.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs21.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 8;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs22 = world.m_8055_(_pos);
                                Property property = _bs22.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs22.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs23 = world.m_8055_(_pos);
                                Property property = _bs23.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs23.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 8;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs24 = world.m_8055_(_pos);
                                Property property = _bs24.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs24.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                        }.getDirection(blockstate) == Direction.NORTH) {
                            if (!world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs25 = world.m_8055_(_pos);
                                Property property = _bs25.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs25.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 8;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs26 = world.m_8055_(_pos);
                                Property property = _bs26.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs26.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                    }.getDirection(blockstate) == new Object(){

                        public Direction getDirection(BlockState _bs) {
                            EnumProperty _ep;
                            Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                            if (_prop instanceof DirectionProperty) {
                                DirectionProperty _dp = (DirectionProperty)_prop;
                                return (Direction)_bs.m_61143_((Property)_dp);
                            }
                            _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                            return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
                        }
                    }.getDirection(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z))).m_175364_(Direction.Axis.Y)) {
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs27 = world.m_8055_(_pos);
                                Property property = _bs27.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs27.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs28 = world.m_8055_(_pos);
                                Property property = _bs28.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs28.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs29 = world.m_8055_(_pos);
                                Property property = _bs29.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs29.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs30 = world.m_8055_(_pos);
                                Property property = _bs30.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs30.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                            if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs31 = world.m_8055_(_pos);
                                Property property = _bs31.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs31.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs32 = world.m_8055_(_pos);
                                Property property = _bs32.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs32.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
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
                        }.getDirection(blockstate) == Direction.NORTH) {
                            if (!world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:metalstairs")))) {
                                IntegerProperty _integerProp;
                                int _value = 4;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs33 = world.m_8055_(_pos);
                                Property property = _bs33.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs33.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 7;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs34 = world.m_8055_(_pos);
                                Property property = _bs34.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs34.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

