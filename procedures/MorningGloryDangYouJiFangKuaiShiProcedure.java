/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModBlocks;

public class MorningGloryDangYouJiFangKuaiShiProcedure {
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
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        Property property;
        block54: {
            ItemStack itemStack;
            block53: {
                if (entity == null) {
                    return;
                }
                if (!(entity instanceof Player)) break block53;
                Player _plr = (Player)entity;
                if (_plr.m_150110_().f_35937_) break block54;
            }
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                itemStack = _livEnt.m_21205_();
            } else {
                itemStack = ItemStack.f_41583_;
            }
            if (itemStack.m_41720_() != ((Block)RojiuramodModBlocks.WATERING_POT.get()).m_5456_()) {
                if (!(entity instanceof Player)) return;
                Player _player = (Player)entity;
                if (_player.m_9236_().m_5776_()) return;
                _player.m_5661_((Component)Component.m_237113_((String)Component.m_237115_((String)"key.name.rojiuramod.1").getString()), true);
                return;
            }
        }
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")), SoundSource.BLOCKS, 0.6f, 1.3f);
        }
        if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip5 = (IntegerProperty)property;
            n15 = (Integer)blockstate.m_61143_((Property)_getip5);
        } else {
            n15 = -1;
        }
        if (n15 == 0) {
            int _value = 1;
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
            IntegerProperty _getip8 = (IntegerProperty)_value;
            n14 = (Integer)blockstate.m_61143_((Property)_getip8);
        } else {
            n14 = -1;
        }
        if (n14 == 1) {
            int _value2 = 2;
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
            IntegerProperty _getip11 = (IntegerProperty)_value;
            n13 = (Integer)blockstate.m_61143_((Property)_getip11);
        } else {
            n13 = -1;
        }
        if (n13 == 2) {
            int _value3 = 3;
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
            IntegerProperty _getip14 = (IntegerProperty)_value;
            n12 = (Integer)blockstate.m_61143_((Property)_getip14);
        } else {
            n12 = -1;
        }
        if (n12 == 3) {
            int _value4 = 4;
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
            IntegerProperty _getip17 = (IntegerProperty)_value;
            n11 = (Integer)blockstate.m_61143_((Property)_getip17);
        } else {
            n11 = -1;
        }
        if (n11 == 4) {
            int _value5 = 5;
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
            IntegerProperty _getip20 = (IntegerProperty)_value;
            n10 = (Integer)blockstate.m_61143_((Property)_getip20);
        } else {
            n10 = -1;
        }
        if (n10 == 5) {
            int _value6 = 6;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property7 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property7 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property7;
            if (!_integerProp.m_6908_().contains(_value6)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip23 = (IntegerProperty)_value;
            n9 = (Integer)blockstate.m_61143_((Property)_getip23);
        } else {
            n9 = -1;
        }
        if (n9 == 6) {
            int _value7 = 7;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property8 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property8 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property8;
            if (!_integerProp.m_6908_().contains(_value7)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip26 = (IntegerProperty)_value;
            n8 = (Integer)blockstate.m_61143_((Property)_getip26);
        } else {
            n8 = -1;
        }
        if (n8 == 7) {
            int _value8 = 8;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property9 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property9 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property9;
            if (!_integerProp.m_6908_().contains(_value8)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value8)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip29 = (IntegerProperty)_value;
            n7 = (Integer)blockstate.m_61143_((Property)_getip29);
        } else {
            n7 = -1;
        }
        if (n7 == 8) {
            int _value9 = 9;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property10 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property10 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property10;
            if (!_integerProp.m_6908_().contains(_value9)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value9)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip32 = (IntegerProperty)_value;
            n6 = (Integer)blockstate.m_61143_((Property)_getip32);
        } else {
            n6 = -1;
        }
        if (n6 == 9) {
            int _value10 = 10;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property11 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property11 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property11;
            if (!_integerProp.m_6908_().contains(_value10)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value10)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip35 = (IntegerProperty)_value;
            n5 = (Integer)blockstate.m_61143_((Property)_getip35);
        } else {
            n5 = -1;
        }
        if (n5 == 10) {
            int _value11 = 11;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property12 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property12 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property12;
            if (!_integerProp.m_6908_().contains(_value11)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value11)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip38 = (IntegerProperty)_value;
            n4 = (Integer)blockstate.m_61143_((Property)_getip38);
        } else {
            n4 = -1;
        }
        if (n4 == 11) {
            int _value12 = 12;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property13 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property13 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property13;
            if (!_integerProp.m_6908_().contains(_value12)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value12)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip41 = (IntegerProperty)_value;
            n3 = (Integer)blockstate.m_61143_((Property)_getip41);
        } else {
            n3 = -1;
        }
        if (n3 == 12) {
            int _value13 = 13;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property14 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property14 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property14;
            if (!_integerProp.m_6908_().contains(_value13)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value13)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip44 = (IntegerProperty)_value;
            n2 = (Integer)blockstate.m_61143_((Property)_getip44);
        } else {
            n2 = -1;
        }
        if (n2 == 13) {
            int _value14 = 14;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property15 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property15 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property15;
            if (!_integerProp.m_6908_().contains(_value14)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value14)), 3);
            return;
        }
        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip47 = (IntegerProperty)_value;
            n = (Integer)blockstate.m_61143_((Property)_getip47);
        } else {
            n = -1;
        }
        if (n == 14) {
            int _value15 = 15;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property16 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property16 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property16;
            if (!_integerProp.m_6908_().contains(_value15)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value15)), 3);
            return;
        }
        int _value16 = 0;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs = world.m_8055_(_pos);
        Property property17 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property17 instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property17;
        if (!_integerProp.m_6908_().contains(_value16)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value16)), 3);
    }
}

