/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import rojiuramod.init.RojiuramodModBlocks;

public class BamBooDangPiLinFangKuaiGengXinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == RojiuramodModBlocks.BAM_BOO.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z)).m_60734_() == Blocks.f_50016_) {
            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), Blocks.f_50016_.m_49966_(), 3);
            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z), ((Block)RojiuramodModBlocks.BAM_BOO.get()).m_49966_(), 3);
        } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == RojiuramodModBlocks.BAM_BOO.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z)).m_60734_() == RojiuramodModBlocks.BAM_BOO.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 3.0), (double)z)).m_60734_() == Blocks.f_50016_) {
            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), Blocks.f_50016_.m_49966_(), 3);
            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 3.0), (double)z), ((Block)RojiuramodModBlocks.BAM_BOO.get()).m_49966_(), 3);
        } else if (!(world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 2.0), (double)z)).m_60734_() == RojiuramodModBlocks.BAM_BOO.get()) && !world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
            ServerLevel _level;
            world.m_46961_(BlockPos.m_274561_((double)x, (double)y, (double)z), false);
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)RojiuramodModBlocks.BAM_BOO.get()));
                entityToSpawn.m_32010_(10);
                _level.m_7967_((Entity)entityToSpawn);
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z)).m_60734_() == RojiuramodModBlocks.BAM_BOO.get() && world instanceof Level) {
                _level = (Level)world;
                _level.m_46672_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), _level.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_());
            }
        }
    }
}

