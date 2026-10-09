/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
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

public class UtilityPoleTopDAMGPILINGFANGKUAIGENGXINSHIProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            DirectionProperty _dp;
            IntegerProperty _integerProp;
            int _value = 5;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.NORTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 4;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.NORTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 4;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.WEST;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 4;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.SOUTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 4;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.EAST;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 3;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.NORTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 3;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.WEST;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.NORTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.WEST;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.SOUTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.EAST;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.NORTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.WEST;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.SOUTH;
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
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ELECTRICAL_WIRE.get()) {
            IntegerProperty _integerProp;
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.EAST;
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
        } else {
            IntegerProperty _integerProp;
            int _value = 0;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            Direction _dir = Direction.NORTH;
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
        }
    }
}

