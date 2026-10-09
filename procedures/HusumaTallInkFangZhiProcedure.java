/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModBlocks;
import rojiuramod.procedures.DoorFangZhiProcedure;

public class HusumaTallInkFangZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
        if (direction == null || entity == null) {
            return;
        }
        if (direction == Direction.UP && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z)).m_60734_() == Blocks.f_50016_) {
            EnumProperty _ap;
            DirectionProperty _dp;
            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.HUSUMA_TALL_INK_BLOCK.get()).m_49966_(), 3);
            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z), ((Block)RojiuramodModBlocks.HUSUMA_TALL_INK_BLOCK.get()).m_49966_(), 3);
            Direction _dir = entity.m_6350_().m_122424_();
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
            if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
            } else {
                _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                }
            }
            _dir = entity.m_6350_().m_122424_();
            _pos = BlockPos.m_274561_((double)x, (double)(y + 2.0), (double)z);
            _bs = world.m_8055_(_pos);
            _property = _bs.m_60734_().m_49965_().m_61081_("facing");
            if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
            } else {
                _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                }
            }
            DoorFangZhiProcedure.execute(world, x, y, z, entity);
        }
    }
}

