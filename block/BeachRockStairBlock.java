/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.StairBlock
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.material.MapColor
 *  net.minecraftforge.common.util.ForgeSoundType
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.registries.ForgeRegistries;

public class BeachRockStairBlock
extends StairBlock {
    public BeachRockStairBlock() {
        super(() -> Blocks.f_50016_.m_49966_(), BlockBehaviour.Properties.m_284310_().m_284180_(MapColor.f_283906_).m_60918_((SoundType)new ForgeSoundType(1.0f, 1.0f, () -> (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), () -> (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.step")), () -> (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), () -> (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.hit")), () -> (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")))).m_60913_(1.5f, 10.0f).m_60999_().m_60988_());
    }

    public float m_7325_() {
        return 10.0f;
    }

    public boolean m_6724_(BlockState state) {
        return false;
    }

    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }
}

