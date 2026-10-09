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

public class ElectricFanDangYouJiFangKuaiShiProcedure {
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
                IntegerProperty _getip4 = (IntegerProperty)_value;
                n2 = (Integer)blockstate.m_61143_((Property)_getip4);
            } else {
                n2 = -1;
            }
            if (n2 == 1) {
                IntegerProperty _integerProp;
                int _value2 = 2;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property3 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property3).m_6908_().contains(_value2)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                }
            } else {
                int n3;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip7 = (IntegerProperty)_value;
                    n3 = (Integer)blockstate.m_61143_((Property)_getip7);
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
                } else {
                    int n4;
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip10 = (IntegerProperty)_value;
                        n4 = (Integer)blockstate.m_61143_((Property)_getip10);
                    } else {
                        n4 = -1;
                    }
                    if (n4 == 3) {
                        IntegerProperty _integerProp;
                        int _value4 = 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property5 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property5).m_6908_().contains(_value4)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                        }
                    } else {
                        IntegerProperty _integerProp;
                        int _value5 = 0;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property6 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property6 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property6).m_6908_().contains(_value5)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                        }
                    }
                }
            }
        }
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.fall")), SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }
}

