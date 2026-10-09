/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.entity.BlockEntity
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.items.ItemHandlerHelper
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.RojiuramodMod;
import rojiuramod.init.RojiuramodModBlocks;
import rojiuramod.init.RojiuramodModItems;

public class IceCandyBoxDangYouJiFangKuaiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        block64: {
            block70: {
                ItemStack itemStack;
                block69: {
                    ItemStack itemStack2;
                    block68: {
                        Player _player;
                        ItemStack itemStack3;
                        ItemStack itemStack4;
                        ItemStack itemStack5;
                        block67: {
                            Player _player2;
                            ItemStack itemStack6;
                            IntegerProperty _integerProp;
                            BlockState _bs;
                            ItemStack itemStack7;
                            block66: {
                                Player _player3;
                                ItemStack itemStack8;
                                ItemStack itemStack9;
                                ItemStack itemStack10;
                                block65: {
                                    Player _player4;
                                    ItemStack itemStack11;
                                    IntegerProperty _integerProp2;
                                    BlockState _bs2;
                                    ItemStack itemStack12;
                                    if (entity == null) {
                                        return;
                                    }
                                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != RojiuramodModBlocks.ICE_CANDY_BOX.get()) break block64;
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt = (LivingEntity)entity;
                                        itemStack12 = _livEnt.m_21205_();
                                    } else {
                                        itemStack12 = ItemStack.f_41583_;
                                    }
                                    if (itemStack12.m_41720_() != RojiuramodModItems.ICE_CANDY.get() || entity.m_6144_()) break block65;
                                    if (!world.m_5776_()) {
                                        BlockPos _bp = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                        BlockEntity _blockEntity = world.m_7702_(_bp);
                                        _bs2 = world.m_8055_(_bp);
                                        if (_blockEntity != null) {
                                            _blockEntity.getPersistentData().m_128347_("icecandy", new Object(){

                                                public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                                    BlockEntity blockEntity = world.m_7702_(pos);
                                                    if (blockEntity != null) {
                                                        return blockEntity.getPersistentData().m_128459_(tag);
                                                    }
                                                    return -1.0;
                                                }
                                            }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") + 1.0);
                                        }
                                        if (world instanceof Level) {
                                            Level _level = (Level)world;
                                            _level.m_7260_(_bp, _bs2, _bs2, 3);
                                        }
                                    }
                                    int _value = 0;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    _bs2 = world.m_8055_(_pos);
                                    Property property = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty && (_integerProp2 = (IntegerProperty)property).m_6908_().contains(_value)) {
                                        world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp2, (Comparable)Integer.valueOf(_value)), 3);
                                    }
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt = (LivingEntity)entity;
                                        itemStack11 = _livEnt.m_21205_();
                                    } else {
                                        itemStack11 = ItemStack.f_41583_;
                                    }
                                    itemStack11.m_41774_(1);
                                    if (entity instanceof Player && !(_player4 = (Player)entity).m_9236_().m_5776_()) {
                                        _player4.m_5661_((Component)Component.m_237113_((String)("\u5df2\u5b58\u653e" + new Object(){

                                            public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                                BlockEntity blockEntity = world.m_7702_(pos);
                                                if (blockEntity != null) {
                                                    return blockEntity.getPersistentData().m_128459_(tag);
                                                }
                                                return -1.0;
                                            }
                                        }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") + "\u6839\u51b0\u68cd")), true);
                                    }
                                    if (world instanceof Level) {
                                        ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.stonecutter.take_result")), SoundSource.BLOCKS, 0.7f, 1.0f);
                                    }
                                    break block64;
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entity;
                                    itemStack10 = _livEnt.m_21205_();
                                } else {
                                    itemStack10 = ItemStack.f_41583_;
                                }
                                if (itemStack10.m_41720_() == RojiuramodModItems.COIN.get()) break block66;
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entity;
                                    itemStack9 = _livEnt.m_21205_();
                                } else {
                                    itemStack9 = ItemStack.f_41583_;
                                }
                                if (itemStack9.m_41720_() == RojiuramodModItems.ICE_CANDY.get()) break block66;
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entity;
                                    itemStack8 = _livEnt.m_21205_();
                                } else {
                                    itemStack8 = ItemStack.f_41583_;
                                }
                                if (itemStack8.m_41720_() == RojiuramodModItems.CANS.get() || entity.m_6144_()) break block66;
                                var v5 = new Object(){

                                    public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                        BlockEntity blockEntity = world.m_7702_(pos);
                                        if (blockEntity != null) {
                                            return blockEntity.getPersistentData().m_128459_(tag);
                                        }
                                        return -1.0;
                                    }
                                };
                                if (v5.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") >= 1.0) {
                                    Player _player5;
                                    BlockState _bs3;
                                    if (!world.m_5776_()) {
                                        BlockPos _bp = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                        BlockEntity _blockEntity = world.m_7702_(_bp);
                                        _bs3 = world.m_8055_(_bp);
                                        if (_blockEntity != null) {
                                            _blockEntity.getPersistentData().m_128347_("icecandy", new Object(){

                                                public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                                    BlockEntity blockEntity = world.m_7702_(pos);
                                                    if (blockEntity != null) {
                                                        return blockEntity.getPersistentData().m_128459_(tag);
                                                    }
                                                    return -1.0;
                                                }
                                            }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") - 1.0);
                                        }
                                        if (world instanceof Level) {
                                            Level _level = (Level)world;
                                            _level.m_7260_(_bp, _bs3, _bs3, 3);
                                        }
                                    }
                                    if (entity instanceof Player) {
                                        _player5 = (Player)entity;
                                        ItemStack _setstack = new ItemStack((ItemLike)RojiuramodModItems.ICE_CANDY.get()).m_41777_();
                                        _setstack.m_41764_(1);
                                        ItemHandlerHelper.giveItemToPlayer((Player)_player5, (ItemStack)_setstack);
                                    }
                                    if (entity instanceof Player && !(_player5 = (Player)entity).m_9236_().m_5776_()) {
                                        _player5.m_5661_((Component)Component.m_237113_((String)("\u51b0\u67dc\u91cc\u8fd8\u5269" + new Object(){

                                            public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                                BlockEntity blockEntity = world.m_7702_(pos);
                                                if (blockEntity != null) {
                                                    return blockEntity.getPersistentData().m_128459_(tag);
                                                }
                                                return -1.0;
                                            }
                                        }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") + "\u6839\u51b0\u68cd")), true);
                                    }
                                    if (world instanceof Level) {
                                        ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.stonecutter.take_result")), SoundSource.BLOCKS, 0.7f, 1.0f);
                                    }
                                    if (new Object(){

                                        public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                            BlockEntity blockEntity = world.m_7702_(pos);
                                            if (blockEntity != null) {
                                                return blockEntity.getPersistentData().m_128459_(tag);
                                            }
                                            return -1.0;
                                        }
                                    }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") == 0.0 && new Object(){

                                        public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                            BlockEntity blockEntity = world.m_7702_(pos);
                                            if (blockEntity != null) {
                                                return blockEntity.getPersistentData().m_128459_(tag);
                                            }
                                            return -1.0;
                                        }
                                    }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") == 0.0) {
                                        IntegerProperty _integerProp3;
                                        int _value = 1;
                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                        _bs3 = world.m_8055_(_pos);
                                        Property property = _bs3.m_60734_().m_49965_().m_61081_("blockstate");
                                        if (property instanceof IntegerProperty && (_integerProp3 = (IntegerProperty)property).m_6908_().contains(_value)) {
                                            world.m_7731_(_pos, (BlockState)_bs3.m_61124_((Property)_integerProp3, (Comparable)Integer.valueOf(_value)), 3);
                                        }
                                    }
                                } else if (new Object(){

                                    public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                        BlockEntity blockEntity = world.m_7702_(pos);
                                        if (blockEntity != null) {
                                            return blockEntity.getPersistentData().m_128459_(tag);
                                        }
                                        return -1.0;
                                    }
                                }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") == 0.0 && entity instanceof Player && !(_player3 = (Player)entity).m_9236_().m_5776_()) {
                                    _player3.m_5661_((Component)Component.m_237113_((String)"\u51b0\u67dc\u91cc\u6ca1\u6709\u51b0\u68cd\u4e86"), true);
                                }
                                break block64;
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entity;
                                itemStack7 = _livEnt.m_21205_();
                            } else {
                                itemStack7 = ItemStack.f_41583_;
                            }
                            if (itemStack7.m_41720_() != RojiuramodModItems.CANS.get() || entity.m_6144_()) break block67;
                            if (!world.m_5776_()) {
                                BlockPos _bp = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockEntity _blockEntity = world.m_7702_(_bp);
                                _bs = world.m_8055_(_bp);
                                if (_blockEntity != null) {
                                    _blockEntity.getPersistentData().m_128347_("cans", new Object(){

                                        public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                            BlockEntity blockEntity = world.m_7702_(pos);
                                            if (blockEntity != null) {
                                                return blockEntity.getPersistentData().m_128459_(tag);
                                            }
                                            return -1.0;
                                        }
                                    }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") + 1.0);
                                }
                                if (world instanceof Level) {
                                    Level _level = (Level)world;
                                    _level.m_7260_(_bp, _bs, _bs, 3);
                                }
                            }
                            int _value = 0;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs = world.m_8055_(_pos);
                            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entity;
                                itemStack6 = _livEnt.m_21205_();
                            } else {
                                itemStack6 = ItemStack.f_41583_;
                            }
                            itemStack6.m_41774_(1);
                            if (entity instanceof Player && !(_player2 = (Player)entity).m_9236_().m_5776_()) {
                                _player2.m_5661_((Component)Component.m_237113_((String)("\u5df2\u5b58\u653e" + new Object(){

                                    public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                        BlockEntity blockEntity = world.m_7702_(pos);
                                        if (blockEntity != null) {
                                            return blockEntity.getPersistentData().m_128459_(tag);
                                        }
                                        return -1.0;
                                    }
                                }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") + "\u74f6\u6c7d\u6c34")), true);
                            }
                            if (world instanceof Level) {
                                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.stonecutter.take_result")), SoundSource.BLOCKS, 0.7f, 1.0f);
                            }
                            break block64;
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)entity;
                            itemStack5 = _livEnt.m_21205_();
                        } else {
                            itemStack5 = ItemStack.f_41583_;
                        }
                        if (itemStack5.m_41720_() == RojiuramodModItems.COIN.get()) break block68;
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)entity;
                            itemStack4 = _livEnt.m_21205_();
                        } else {
                            itemStack4 = ItemStack.f_41583_;
                        }
                        if (itemStack4.m_41720_() == RojiuramodModItems.CANS.get()) break block68;
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)entity;
                            itemStack3 = _livEnt.m_21205_();
                        } else {
                            itemStack3 = ItemStack.f_41583_;
                        }
                        if (itemStack3.m_41720_() == RojiuramodModItems.ICE_CANDY.get() || !entity.m_6144_()) break block68;
                        var v11 = new Object(){

                            public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                BlockEntity blockEntity = world.m_7702_(pos);
                                if (blockEntity != null) {
                                    return blockEntity.getPersistentData().m_128459_(tag);
                                }
                                return -1.0;
                            }
                        };
                        if (v11.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") >= 1.0) {
                            Player _player6;
                            BlockState _bs;
                            if (!world.m_5776_()) {
                                BlockPos _bp = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockEntity _blockEntity = world.m_7702_(_bp);
                                _bs = world.m_8055_(_bp);
                                if (_blockEntity != null) {
                                    _blockEntity.getPersistentData().m_128347_("cans", new Object(){

                                        public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                            BlockEntity blockEntity = world.m_7702_(pos);
                                            if (blockEntity != null) {
                                                return blockEntity.getPersistentData().m_128459_(tag);
                                            }
                                            return -1.0;
                                        }
                                    }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") - 1.0);
                                }
                                if (world instanceof Level) {
                                    Level _level = (Level)world;
                                    _level.m_7260_(_bp, _bs, _bs, 3);
                                }
                            }
                            if (entity instanceof Player) {
                                _player6 = (Player)entity;
                                ItemStack _setstack = new ItemStack((ItemLike)RojiuramodModItems.CANS.get()).m_41777_();
                                _setstack.m_41764_(1);
                                ItemHandlerHelper.giveItemToPlayer((Player)_player6, (ItemStack)_setstack);
                            }
                            if (entity instanceof Player && !(_player6 = (Player)entity).m_9236_().m_5776_()) {
                                _player6.m_5661_((Component)Component.m_237113_((String)("\u51b0\u67dc\u91cc\u8fd8\u6709" + new Object(){

                                    public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                        BlockEntity blockEntity = world.m_7702_(pos);
                                        if (blockEntity != null) {
                                            return blockEntity.getPersistentData().m_128459_(tag);
                                        }
                                        return -1.0;
                                    }
                                }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") + "\u74f6\u6c7d\u6c34")), true);
                            }
                            if (world instanceof Level) {
                                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.stonecutter.take_result")), SoundSource.BLOCKS, 0.7f, 1.0f);
                            }
                            if (new Object(){

                                public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                    BlockEntity blockEntity = world.m_7702_(pos);
                                    if (blockEntity != null) {
                                        return blockEntity.getPersistentData().m_128459_(tag);
                                    }
                                    return -1.0;
                                }
                            }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy") == 0.0 && new Object(){

                                public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                    BlockEntity blockEntity = world.m_7702_(pos);
                                    if (blockEntity != null) {
                                        return blockEntity.getPersistentData().m_128459_(tag);
                                    }
                                    return -1.0;
                                }
                            }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") == 0.0) {
                                IntegerProperty _integerProp;
                                int _value = 1;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            }
                        } else if (new Object(){

                            public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                                BlockEntity blockEntity = world.m_7702_(pos);
                                if (blockEntity != null) {
                                    return blockEntity.getPersistentData().m_128459_(tag);
                                }
                                return -1.0;
                            }
                        }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans") == 0.0 && entity instanceof Player && !(_player = (Player)entity).m_9236_().m_5776_()) {
                            _player.m_5661_((Component)Component.m_237113_((String)"\u51b0\u67dc\u91cc\u6ca1\u6709\u6c7d\u6c34\u4e86"), true);
                        }
                        break block64;
                    }
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entity;
                        itemStack2 = _livEnt.m_21205_();
                    } else {
                        itemStack2 = ItemStack.f_41583_;
                    }
                    if (itemStack2.m_41720_() != RojiuramodModItems.COIN.get() || entity.m_6144_()) break block64;
                    if (world instanceof Level) {
                        ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rojiuramod:coin_into_a_machine.ogg")), SoundSource.BLOCKS, 0.6f, 1.0f);
                    }
                    if (!(entity instanceof Player)) break block69;
                    Player _plr = (Player)entity;
                    if (_plr.m_150110_().f_35937_) break block70;
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack = _livEnt.m_21205_();
                } else {
                    itemStack = ItemStack.f_41583_;
                }
                itemStack.m_41774_(1);
            }
            RojiuramodMod.queueServerWork(55, () -> {
                if (world instanceof Level) {
                    ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.pickup")), SoundSource.BLOCKS, 0.6f, 1.0f);
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    ItemEntity entityToSpawn = new ItemEntity((Level)_level, x + 5.0, y + 0.6, z + 5.0, new ItemStack((ItemLike)RojiuramodModItems.ICE_CANDY.get()));
                    entityToSpawn.m_32010_(10);
                    _level.m_7967_((Entity)entityToSpawn);
                }
            });
        }
    }
}

