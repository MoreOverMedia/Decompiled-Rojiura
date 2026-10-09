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
import rojiuramod.init.RojiuramodModItems;

public class BeerCaseDangYouJiFangKuaiShiProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        int n;
        int n2;
        int n3;
        int n4;
        Property _value22;
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof Player) {
            Player _plr = (Player)entity;
            if (_plr.m_150110_().f_35937_) {
                int n5;
                int n6;
                int n7;
                Property property;
                if (world instanceof Level) {
                    ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:glass_bin.ogg")), SoundSource.BLOCKS, 0.5f, 1.0f);
                }
                if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip3 = (IntegerProperty)property;
                    n7 = (Integer)blockstate.m_61143_((Property)_getip3);
                } else {
                    n7 = -1;
                }
                if (n7 == 0) {
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
                    IntegerProperty _getip6 = (IntegerProperty)_value;
                    n6 = (Integer)blockstate.m_61143_((Property)_getip6);
                } else {
                    n6 = -1;
                }
                if (n6 == 1) {
                    int _value3 = 2;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property3 instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property3;
                    if (!_integerProp.m_6908_().contains(_value3)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                    return;
                }
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip9 = (IntegerProperty)_value;
                    n5 = (Integer)blockstate.m_61143_((Property)_getip9);
                } else {
                    n5 = -1;
                }
                if (n5 == 2) {
                    int _value4 = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property4 instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property4;
                    if (!_integerProp.m_6908_().contains(_value4)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                    return;
                }
                int _value5 = 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property5 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property5;
                if (!_integerProp.m_6908_().contains(_value5)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                return;
            }
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            itemStack2 = _livEnt.m_21205_();
        } else {
            itemStack2 = ItemStack.f_41583_;
        }
        if (itemStack2.m_41720_() == RojiuramodModItems.BEER.get()) {
            int n8;
            int n9;
            int n10;
            int n11;
            Property _pos;
            if (world instanceof Level) {
                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:glass_bin.ogg")), SoundSource.BLOCKS, 0.5f, 1.0f);
            }
            if ((_pos = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip16 = (IntegerProperty)_pos;
                n11 = (Integer)blockstate.m_61143_((Property)_getip16);
            } else {
                n11 = -1;
            }
            if (n11 == 0) {
                int _value = 1;
                BlockPos _pos2 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos2);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos2, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip19 = (IntegerProperty)_value;
                n10 = (Integer)blockstate.m_61143_((Property)_getip19);
            } else {
                n10 = -1;
            }
            if (n10 == 1) {
                int _value6 = 0;
                BlockPos _pos3 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos3);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value6)) return;
                world.m_7731_(_pos3, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                return;
            }
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip22 = (IntegerProperty)_value;
                n9 = (Integer)blockstate.m_61143_((Property)_getip22);
            } else {
                n9 = -1;
            }
            if (n9 == 2) {
                int _value7 = 3;
                BlockPos _pos4 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos4);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value7)) return;
                world.m_7731_(_pos4, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                return;
            }
            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip25 = (IntegerProperty)_value;
                n8 = (Integer)blockstate.m_61143_((Property)_getip25);
            } else {
                n8 = -1;
            }
            if (n8 != 3) return;
            int _value22 = 2;
            BlockPos _pos5 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos5);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value22)) return;
            world.m_7731_(_pos5, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value22)), 3);
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() != ((Block)RojiuramodModBlocks.BEER_CASE.get()).m_5456_()) {
            ItemStack itemStack3;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                itemStack3 = _livEnt.m_21205_();
            } else {
                itemStack3 = ItemStack.f_41583_;
            }
            if (itemStack3.m_41720_() != ((Block)RojiuramodModBlocks.BEER_CASE_RED.get()).m_5456_()) {
                if (!(entity instanceof Player)) return;
                Player _player = (Player)entity;
                if (_player.m_9236_().m_5776_()) return;
                _player.m_5661_((Component)Component.m_237113_((String)Component.m_237115_((String)"key.name.rojiuramod.2").getString()), true);
                return;
            }
        }
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:glass_bin.ogg")), SoundSource.BLOCKS, 0.5f, 1.0f);
        }
        if ((_value22 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip33 = (IntegerProperty)_value22;
            n4 = (Integer)blockstate.m_61143_((Property)_getip33);
        } else {
            n4 = -1;
        }
        if (n4 == 0) {
            int _value3 = 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value3)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
            return;
        }
        _value22 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value22 instanceof IntegerProperty) {
            IntegerProperty _getip36 = (IntegerProperty)_value22;
            n3 = (Integer)blockstate.m_61143_((Property)_getip36);
        } else {
            n3 = -1;
        }
        if (n3 == 1) {
            int _value4 = 3;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value4)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
            return;
        }
        _value22 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value22 instanceof IntegerProperty) {
            IntegerProperty _getip39 = (IntegerProperty)_value22;
            n2 = (Integer)blockstate.m_61143_((Property)_getip39);
        } else {
            n2 = -1;
        }
        if (n2 == 2) {
            int _value5 = 0;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value5)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
            return;
        }
        _value22 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
        if (_value22 instanceof IntegerProperty) {
            IntegerProperty _getip42 = (IntegerProperty)_value22;
            n = (Integer)blockstate.m_61143_((Property)_getip42);
        } else {
            n = -1;
        }
        if (n != 3) return;
        int _value = 1;
        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs = world.m_8055_(_pos);
        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property;
        if (!_integerProp.m_6908_().contains(_value)) return;
        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
    }
}

