/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Direction$Axis
 *  net.minecraft.core.Direction$AxisDirection
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Blocks
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModBlocks;

public class BenchRedBlockDangPiLinFangKuaiGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        int n;
        Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (property instanceof IntegerProperty) {
            IntegerProperty _getip1 = (IntegerProperty)property;
            n = (Integer)blockstate.m_61143_((Property)_getip1);
        } else {
            n = -1;
        }
        if (n == 0) {
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
            }.getDirection(blockstate) == Direction.NORTH && !(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
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
            }.getDirection(blockstate) == Direction.SOUTH && !(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
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
            }.getDirection(blockstate) == Direction.WEST && !(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
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
            }.getDirection(blockstate) == Direction.EAST && !(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
            }
        } else {
            int n2;
            property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty) {
                IntegerProperty _getip27 = (IntegerProperty)property;
                n2 = (Integer)blockstate.m_61143_((Property)_getip27);
            } else {
                n2 = -1;
            }
            if (n2 == 1) {
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
                }.getDirection(blockstate) == Direction.NORTH && !(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                    world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
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
                }.getDirection(blockstate) == Direction.SOUTH && !(world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                    world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
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
                }.getDirection(blockstate) == Direction.WEST && !(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                    world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
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
                }.getDirection(blockstate) == Direction.EAST && !(world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BENCH_RED_BLOCK.get())) {
                    world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)z), Blocks.f_50016_.m_49966_(), 3);
                }
            }
        }
    }
}

