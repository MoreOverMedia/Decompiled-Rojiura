/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.material.MapColor
 */
package rojiuramod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class TotansbrownBlock
extends Block {
    public TotansbrownBlock() {
        super(BlockBehaviour.Properties.m_284310_().m_284180_(MapColor.f_283748_).m_60918_(SoundType.f_56743_).m_60913_(1.5f, 10.0f).m_60999_());
    }

    public boolean m_6104_(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.m_60734_() == this ? true : super.m_6104_(state, adjacentBlockState, side);
    }

    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }
}

