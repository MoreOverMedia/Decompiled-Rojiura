/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemStack
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
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModItems;

public class TatamiYellwoDangYouJiFangKuaiShiProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        block44: {
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            Property property;
            block43: {
                ItemStack itemStack;
                ItemStack itemStack2;
                if (entity == null) {
                    return;
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack2 = _livEnt.m_21205_();
                } else {
                    itemStack2 = ItemStack.f_41583_;
                }
                if (itemStack2.m_41720_() == RojiuramodModItems.TATAMI_YELLOW.get()) break block43;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack = _livEnt.m_21205_();
                } else {
                    itemStack = ItemStack.f_41583_;
                }
                if (itemStack.m_41720_() != RojiuramodModItems.TATAMI_GREEN.get()) break block44;
            }
            if (world instanceof Level) {
                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
            }
            if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip6 = (IntegerProperty)property;
                n12 = (Integer)blockstate.m_61143_((Property)_getip6);
            } else {
                n12 = -1;
            }
            if (n12 == 0) {
                int _value = 3;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property2 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property2;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip9 = (IntegerProperty)_value;
                n11 = (Integer)blockstate.m_61143_((Property)_getip9);
            } else {
                n11 = -1;
            }
            if (n11 == 1) {
                int _value2 = 4;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property3 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property3;
                if (!_integerProp.m_6908_().contains(_value2)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                return;
            }
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip12 = (IntegerProperty)_value;
                n10 = (Integer)blockstate.m_61143_((Property)_getip12);
            } else {
                n10 = -1;
            }
            if (n10 == 2) {
                int _value3 = 5;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property4 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property4;
                if (!_integerProp.m_6908_().contains(_value3)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                return;
            }
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip15 = (IntegerProperty)_value;
                n9 = (Integer)blockstate.m_61143_((Property)_getip15);
            } else {
                n9 = -1;
            }
            if (n9 == 3) {
                int _value4 = 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property5 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property5;
                if (!_integerProp.m_6908_().contains(_value4)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                return;
            }
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip18 = (IntegerProperty)_value;
                n8 = (Integer)blockstate.m_61143_((Property)_getip18);
            } else {
                n8 = -1;
            }
            if (n8 == 4) {
                int _value5 = 1;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property6 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property6 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property6;
                if (!_integerProp.m_6908_().contains(_value5)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                return;
            }
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip21 = (IntegerProperty)_value;
                n7 = (Integer)blockstate.m_61143_((Property)_getip21);
            } else {
                n7 = -1;
            }
            if (n7 != 5) return;
            int _value2 = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property7 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property7 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property7;
            if (!_integerProp.m_6908_().contains(_value2)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
            return;
        }
        Property _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value2 instanceof IntegerProperty) {
            IntegerProperty _getip24 = (IntegerProperty)_value2;
            n6 = (Integer)blockstate.m_61143_((Property)_getip24);
        } else {
            n6 = -1;
        }
        if (n6 == 0) {
            int _value = 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value2 instanceof IntegerProperty) {
            IntegerProperty _getip27 = (IntegerProperty)_value2;
            n5 = (Integer)blockstate.m_61143_((Property)_getip27);
        } else {
            n5 = -1;
        }
        if (n5 == 1) {
            int _value = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value2 instanceof IntegerProperty) {
            IntegerProperty _getip30 = (IntegerProperty)_value2;
            n4 = (Integer)blockstate.m_61143_((Property)_getip30);
        } else {
            n4 = -1;
        }
        if (n4 == 2) {
            int _value = 0;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value2 instanceof IntegerProperty) {
            IntegerProperty _getip33 = (IntegerProperty)_value2;
            n3 = (Integer)blockstate.m_61143_((Property)_getip33);
        } else {
            n3 = -1;
        }
        if (n3 == 3) {
            int _value = 4;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value2 instanceof IntegerProperty) {
            IntegerProperty _getip36 = (IntegerProperty)_value2;
            n2 = (Integer)blockstate.m_61143_((Property)_getip36);
        } else {
            n2 = -1;
        }
        if (n2 == 4) {
            int _value = 5;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        _value2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value2 instanceof IntegerProperty) {
            IntegerProperty _getip39 = (IntegerProperty)_value2;
            n = (Integer)blockstate.m_61143_((Property)_getip39);
        } else {
            n = -1;
        }
        if (n != 5) return;
        int _value = 3;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs = world.m_8055_(_pos);
        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property;
        if (!_integerProp.m_6908_().contains(_value)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
    }
}

