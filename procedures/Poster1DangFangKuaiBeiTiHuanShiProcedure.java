/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.event.level.BlockEvent$EntityPlaceEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package rojiuramod.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rojiuramod.init.RojiuramodModBlocks;
import rojiuramod.init.RojiuramodModItems;

@Mod.EventBusSubscriber
public class Poster1DangFangKuaiBeiTiHuanShiProcedure {
    @SubscribeEvent
    public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
        Poster1DangFangKuaiBeiTiHuanShiProcedure.execute((Event)event, event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        Poster1DangFangKuaiBeiTiHuanShiProcedure.execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.POSTERS.get()) {
            ItemStack itemStack;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                itemStack = _livEnt.m_21205_();
            } else {
                itemStack = ItemStack.f_41583_;
            }
            if (itemStack.m_41720_() == ((Block)RojiuramodModBlocks.POSTERS.get()).m_5456_()) {
                IntegerProperty _integerProp;
                int _value = Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)0, (int)18);
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            } else {
                ItemStack itemStack2;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack2 = _livEnt.m_21205_();
                } else {
                    itemStack2 = ItemStack.f_41583_;
                }
                if (itemStack2.m_41720_() == RojiuramodModItems.POSTER_1X1.get()) {
                    IntegerProperty _integerProp;
                    int _value = Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)0, (int)7);
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    ItemStack itemStack3;
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entity;
                        itemStack3 = _livEnt.m_21205_();
                    } else {
                        itemStack3 = ItemStack.f_41583_;
                    }
                    if (itemStack3.m_41720_() == RojiuramodModItems.POSTER_1X2.get()) {
                        IntegerProperty _integerProp;
                        int _value = Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)8, (int)9);
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    } else {
                        ItemStack itemStack4;
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)entity;
                            itemStack4 = _livEnt.m_21205_();
                        } else {
                            itemStack4 = ItemStack.f_41583_;
                        }
                        if (itemStack4.m_41720_() == RojiuramodModItems.POSTER_2X1.get()) {
                            IntegerProperty _integerProp;
                            int _value = Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)10, (int)11);
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                        } else {
                            ItemStack itemStack5;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entity;
                                itemStack5 = _livEnt.m_21205_();
                            } else {
                                itemStack5 = ItemStack.f_41583_;
                            }
                            if (itemStack5.m_41720_() == RojiuramodModItems.POSTER_2X2.get()) {
                                IntegerProperty _integerProp;
                                int _value = 12;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                ItemStack itemStack6;
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entity;
                                    itemStack6 = _livEnt.m_21205_();
                                } else {
                                    itemStack6 = ItemStack.f_41583_;
                                }
                                if (itemStack6.m_41720_() == RojiuramodModItems.POSTER_2X3.get()) {
                                    IntegerProperty _integerProp;
                                    int _value = 13;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                    }
                                } else {
                                    ItemStack itemStack7;
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt = (LivingEntity)entity;
                                        itemStack7 = _livEnt.m_21205_();
                                    } else {
                                        itemStack7 = ItemStack.f_41583_;
                                    }
                                    if (itemStack7.m_41720_() == RojiuramodModItems.POSTER_1X4.get()) {
                                        IntegerProperty _integerProp;
                                        int _value = 14;
                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                        BlockState _bs = world.m_8055_(_pos);
                                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                        }
                                    } else {
                                        ItemStack itemStack8;
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt = (LivingEntity)entity;
                                            itemStack8 = _livEnt.m_21205_();
                                        } else {
                                            itemStack8 = ItemStack.f_41583_;
                                        }
                                        if (itemStack8.m_41720_() == RojiuramodModItems.POSTER_1X5.get()) {
                                            IntegerProperty _integerProp;
                                            int _value = Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)15, (int)16);
                                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                            BlockState _bs = world.m_8055_(_pos);
                                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                            }
                                        } else {
                                            ItemStack itemStack9;
                                            if (entity instanceof LivingEntity) {
                                                LivingEntity _livEnt = (LivingEntity)entity;
                                                itemStack9 = _livEnt.m_21205_();
                                            } else {
                                                itemStack9 = ItemStack.f_41583_;
                                            }
                                            if (itemStack9.m_41720_() == RojiuramodModItems.POSTER_4X4.get()) {
                                                IntegerProperty _integerProp;
                                                int _value = 17;
                                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                                BlockState _bs = world.m_8055_(_pos);
                                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                }
                                            } else {
                                                ItemStack itemStack10;
                                                if (entity instanceof LivingEntity) {
                                                    LivingEntity _livEnt = (LivingEntity)entity;
                                                    itemStack10 = _livEnt.m_21205_();
                                                } else {
                                                    itemStack10 = ItemStack.f_41583_;
                                                }
                                                if (itemStack10.m_41720_() == RojiuramodModItems.POSTER_2X6.get()) {
                                                    IntegerProperty _integerProp;
                                                    int _value = 18;
                                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                                    BlockState _bs = world.m_8055_(_pos);
                                                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

