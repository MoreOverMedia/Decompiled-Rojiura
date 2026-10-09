/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class DrainPipeDangFangKuaiBeiTiHuanShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level) {
            Level _level = (Level)world;
            _level.m_46672_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), _level.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_());
        }
    }
}

