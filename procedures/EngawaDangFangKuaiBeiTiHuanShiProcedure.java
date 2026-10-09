/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModBlocks;

public class EngawaDangFangKuaiBeiTiHuanShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        Level _level;
        if (blockstate.m_60734_() == RojiuramodModBlocks.ENGAWA.get()) {
            int n;
            Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty) {
                IntegerProperty _getip3 = (IntegerProperty)property;
                n = (Integer)blockstate.m_61143_((Property)_getip3);
            } else {
                n = -1;
            }
            if (n == 0) {
                IntegerProperty _integerProp;
                int _value = 5;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property2).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            }
        }
        if (world instanceof Level) {
            _level = (Level)world;
            _level.m_46672_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), _level.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_());
        }
        if (world instanceof Level) {
            _level = (Level)world;
            _level.m_46672_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), _level.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_());
        }
        if (world instanceof Level) {
            _level = (Level)world;
            _level.m_46672_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), _level.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_());
        }
        if (world instanceof Level) {
            _level = (Level)world;
            _level.m_46672_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), _level.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_());
        }
    }
}

