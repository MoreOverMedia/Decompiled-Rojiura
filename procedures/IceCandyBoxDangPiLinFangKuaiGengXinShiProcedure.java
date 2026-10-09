/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.entity.BlockEntity
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class IceCandyBoxDangPiLinFangKuaiGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (new Object(){

            public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                BlockEntity blockEntity = world.m_7702_(pos);
                if (blockEntity != null) {
                    return blockEntity.getPersistentData().m_128459_(tag);
                }
                return -1.0;
            }
        }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") == 0.0 && new Object(){

            public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                BlockEntity blockEntity = world.m_7702_(pos);
                if (blockEntity != null) {
                    return blockEntity.getPersistentData().m_128459_(tag);
                }
                return -1.0;
            }
        }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") == 0.0) {
            IntegerProperty _integerProp;
            int _value = 1;
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

