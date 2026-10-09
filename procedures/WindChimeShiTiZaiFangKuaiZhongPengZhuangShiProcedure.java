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
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.RojiuramodMod;

public class WindChimeShiTiZaiFangKuaiZhongPengZhuangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        int n;
        Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (property instanceof IntegerProperty) {
            IntegerProperty _getip1 = (IntegerProperty)property;
            n = (Integer)blockstate.m_61143_((Property)_getip1);
        } else {
            n = -1;
        }
        if (n == 0) {
            IntegerProperty _integerProp;
            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:wind_chime.ogg")), SoundSource.BLOCKS, 0.7f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:wind_chime.ogg")), SoundSource.BLOCKS, 0.7f, 1.0f, false);
                }
            }
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property2).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            RojiuramodMod.queueServerWork(150, () -> {
                IntegerProperty _integerProp;
                int _value = 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property patt1885$temp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (patt1885$temp instanceof IntegerProperty && (_integerProp = (IntegerProperty)patt1885$temp).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            });
        }
    }
}

