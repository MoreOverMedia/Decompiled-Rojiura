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
import rojiuramod.init.RojiuramodModBlocks;

public class EmergencyLightDangYouJiFangKuaiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        int n;
        Property property;
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.BLOCKS, 0.5f, 1.0f);
        }
        if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip2 = (IntegerProperty)property;
            n = (Integer)blockstate.m_61143_((Property)_getip2);
        } else {
            n = -1;
        }
        if (n == 0) {
            IntegerProperty _integerProp;
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property2 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property2).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        } else {
            int n2;
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip5 = (IntegerProperty)_value;
                n2 = (Integer)blockstate.m_61143_((Property)_getip5);
            } else {
                n2 = -1;
            }
            if (n2 == 1) {
                IntegerProperty _integerProp;
                int _value2 = 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property3 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property3).m_6908_().contains(_value2)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                }
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.FLUORESCENT_LIGHT.get()) {
                    _value2 = 2;
                    _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property3 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property3).m_6908_().contains(_value2)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                    }
                }
            } else {
                int n3;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip11 = (IntegerProperty)_value;
                    n3 = (Integer)blockstate.m_61143_((Property)_getip11);
                } else {
                    n3 = -1;
                }
                if (n3 == 2) {
                    IntegerProperty _integerProp;
                    int _value3 = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property4 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property4).m_6908_().contains(_value3)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                    }
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.FLUORESCENT_LIGHT.get()) {
                        _value3 = 0;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property4 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property4).m_6908_().contains(_value3)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                        }
                    }
                }
            }
        }
    }
}

