/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class WindChimeDangYouJiFangKuaiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:wind_chime.ogg")), SoundSource.BLOCKS, 0.7f, 1.0f);
        }
    }
}

