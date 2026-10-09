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

public class SeaweedDangYouJiFangKuaiShiProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        int n;
        int n2;
        int n3;
        Property _value2;
        int n4;
        Property property;
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.place")), SoundSource.BLOCKS, 0.5f, 1.0f);
        }
        if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip2 = (IntegerProperty)property;
            n4 = (Integer)blockstate.m_61143_((Property)_getip2);
        } else {
            n4 = -1;
        }
        if (n4 >= 0) {
            int n5;
            property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty) {
                IntegerProperty _getip4 = (IntegerProperty)property;
                n5 = (Integer)blockstate.m_61143_((Property)_getip4);
            } else {
                n5 = -1;
            }
            if (n5 <= 8) {
                int n6;
                Property property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property2 instanceof IntegerProperty) {
                    IntegerProperty _getip6 = (IntegerProperty)property2;
                    n6 = (Integer)blockstate.m_61143_((Property)_getip6);
                } else {
                    n6 = -1;
                }
                int _value2 = n6 + 9;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property3 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property3;
                if (!_integerProp.m_6908_().contains(_value2)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                return;
            }
        }
        if ((_value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip9 = (IntegerProperty)_value2;
            n3 = (Integer)blockstate.m_61143_((Property)_getip9);
        } else {
            n3 = -1;
        }
        if (n3 < 9) return;
        _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value2 instanceof IntegerProperty) {
            IntegerProperty _getip11 = (IntegerProperty)_value2;
            n2 = (Integer)blockstate.m_61143_((Property)_getip11);
        } else {
            n2 = -1;
        }
        if (n2 > 17) return;
        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_bs instanceof IntegerProperty) {
            IntegerProperty _getip13 = (IntegerProperty)_bs;
            n = (Integer)blockstate.m_61143_((Property)_getip13);
        } else {
            n = -1;
        }
        int _value2 = n - 9;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        _bs = world.m_8055_(_pos);
        Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property4 instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property4;
        if (!_integerProp.m_6908_().contains(_value2)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
    }
}

