/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModBlocks;

public class BuoyBlockDangPiLinFangKuaiGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 13;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 9;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 10;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 11;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 12;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 14;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 15;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 5;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 6;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 7;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 8;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 3;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.BUOY_BLOCK.get()) {
            IntegerProperty _integerProp;
            int _value = 4;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else {
            IntegerProperty _integerProp;
            int _value = 0;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        }
    }
}

