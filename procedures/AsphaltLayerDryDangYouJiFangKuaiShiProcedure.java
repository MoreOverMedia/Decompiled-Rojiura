/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.RojiuramodMod;
import rojiuramod.init.RojiuramodModBlocks;
import rojiuramod.init.RojiuramodModItems;

@Mod.EventBusSubscriber
public class AsphaltLayerDryDangYouJiFangKuaiShiProcedure {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getEntity().m_7655_()) {
            return;
        }
        AsphaltLayerDryDangYouJiFangKuaiShiProcedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), event.getLevel().m_8055_(event.getPos()), event.getFace(), (Entity)event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity) {
        AsphaltLayerDryDangYouJiFangKuaiShiProcedure.execute(null, world, x, y, z, blockstate, direction, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity) {
        block55: {
            int n;
            Property property;
            boolean bl;
            block56: {
                ItemStack itemStack;
                ItemStack itemStack2;
                ItemStack itemStack3;
                ItemStack itemStack4;
                ItemStack itemStack5;
                ItemStack itemStack6;
                if (direction == null || entity == null) {
                    return;
                }
                if (direction != Direction.UP) break block55;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack6 = _livEnt.m_21205_();
                } else {
                    itemStack6 = ItemStack.f_41583_;
                }
                if (itemStack6.m_41720_() == RojiuramodModItems.ASPHALT_LAYER_DRY.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ASPHALT_LAYER_DRY_BLOCK.get()) break block56;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack5 = _livEnt.m_21205_();
                } else {
                    itemStack5 = ItemStack.f_41583_;
                }
                if (itemStack5.m_41720_() == RojiuramodModItems.ASPHALT_LAYER_LINE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ASPHALT_LAYER_LINE_BLOCK.get()) break block56;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack4 = _livEnt.m_21205_();
                } else {
                    itemStack4 = ItemStack.f_41583_;
                }
                if (itemStack4.m_41720_() == RojiuramodModItems.ASPHALT_LAYER_WHITE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ASPHALT_LAYER_WHITE_BLOCK.get()) break block56;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack3 = _livEnt.m_21205_();
                } else {
                    itemStack3 = ItemStack.f_41583_;
                }
                if (itemStack3.m_41720_() == RojiuramodModItems.ASPHALT_LAYER_CRACK.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get()) break block56;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack2 = _livEnt.m_21205_();
                } else {
                    itemStack2 = ItemStack.f_41583_;
                }
                if (itemStack2.m_41720_() == RojiuramodModItems.ASPHALT_LAYER_HOLE.get() && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ASPHALT_LAYER_HOLE_BLOCK.get()) break block56;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack = _livEnt.m_21205_();
                } else {
                    itemStack = ItemStack.f_41583_;
                }
                if (itemStack.m_41720_() != RojiuramodModItems.ASPHALT_LAYER_WET.get() || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != RojiuramodModBlocks.ASPHALT_LAYER_WET_BLOCK.get()) break block55;
            }
            if (entity instanceof Player) {
                Player _plr = (Player)entity;
                bl = _plr.m_150110_().f_35937_;
            } else {
                bl = false;
            }
            if (!bl) {
                ItemStack itemStack;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack = _livEnt.m_21205_();
                } else {
                    itemStack = ItemStack.f_41583_;
                }
                itemStack.m_41774_(1);
            }
            if (world instanceof Level) {
                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
            }
            if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip30 = (IntegerProperty)property;
                n = (Integer)blockstate.m_61143_((Property)_getip30);
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
                    IntegerProperty _getip33 = (IntegerProperty)_value;
                    n2 = (Integer)blockstate.m_61143_((Property)_getip33);
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
                        IntegerProperty _getip36 = (IntegerProperty)_value;
                        n3 = (Integer)blockstate.m_61143_((Property)_getip36);
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
                            IntegerProperty _getip39 = (IntegerProperty)_value;
                            n4 = (Integer)blockstate.m_61143_((Property)_getip39);
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
                            int n5;
                            _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value instanceof IntegerProperty) {
                                IntegerProperty _getip42 = (IntegerProperty)_value;
                                n5 = (Integer)blockstate.m_61143_((Property)_getip42);
                            } else {
                                n5 = -1;
                            }
                            if (n5 == 4) {
                                IntegerProperty _integerProp;
                                int _value5 = 5;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property6 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property6 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property6).m_6908_().contains(_value5)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                                }
                            } else {
                                int n6;
                                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value instanceof IntegerProperty) {
                                    IntegerProperty _getip45 = (IntegerProperty)_value;
                                    n6 = (Integer)blockstate.m_61143_((Property)_getip45);
                                } else {
                                    n6 = -1;
                                }
                                if (n6 == 5) {
                                    IntegerProperty _integerProp;
                                    int _value6 = 6;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs = world.m_8055_(_pos);
                                    Property property7 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property7 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property7).m_6908_().contains(_value6)) {
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                                    }
                                } else {
                                    int n7;
                                    property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property instanceof IntegerProperty) {
                                        IntegerProperty _getip48 = (IntegerProperty)property;
                                        n7 = (Integer)blockstate.m_61143_((Property)_getip48);
                                    } else {
                                        n7 = -1;
                                    }
                                    if (n7 == 6) {
                                        RojiuramodMod.queueServerWork(1, () -> {
                                            IntegerProperty _integerProp;
                                            int _value = 7;
                                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                            BlockState _bs = world.m_8055_(_pos);
                                            Property patt7777$temp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                            if (patt7777$temp instanceof IntegerProperty && (_integerProp = (IntegerProperty)patt7777$temp).m_6908_().contains(_value)) {
                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                            }
                                        });
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

