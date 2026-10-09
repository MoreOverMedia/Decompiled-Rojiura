/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.tags.BlockTags
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Blocks
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModBlocks;

@Mod.EventBusSubscriber
public class UtilityPoleProcedure {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getEntity().m_7655_()) {
            return;
        }
        UtilityPoleProcedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), event.getLevel().m_8055_(event.getPos()), (Entity)event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        UtilityPoleProcedure.execute(null, world, x, y, z, blockstate, entity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        block79: {
            int n;
            Property _getip54;
            block81: {
                int n2;
                int n3;
                int n4;
                Property _getip44;
                block80: {
                    int n5;
                    int n6;
                    int n7;
                    Property _getip34;
                    block78: {
                        int n8;
                        int n9;
                        int n10;
                        Property property;
                        ItemStack itemStack;
                        if (entity == null) {
                            return;
                        }
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.UTILITY_POLE_BOTTOM.get()) {
                            int n11;
                            ItemStack itemStack2;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entity;
                                itemStack2 = _livEnt.m_21205_();
                            } else {
                                itemStack2 = ItemStack.f_41583_;
                            }
                            if (itemStack2.m_41720_() != Blocks.f_50016_.m_5456_()) return;
                            Property property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property2 instanceof IntegerProperty) {
                                IntegerProperty _getip5 = (IntegerProperty)property2;
                                n11 = (Integer)blockstate.m_61143_((Property)_getip5);
                            } else {
                                n11 = -1;
                            }
                            if (n11 != 3) {
                                IntegerProperty _integerProp;
                                int n12;
                                Property property3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property3 instanceof IntegerProperty) {
                                    IntegerProperty _getip7 = (IntegerProperty)property3;
                                    n12 = (Integer)blockstate.m_61143_((Property)_getip7);
                                } else {
                                    n12 = -1;
                                }
                                int _value = n12 + 1;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property4 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property4 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property4).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value = 0;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property5 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property5).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entity = (LivingEntity)entity;
                                _entity.m_21011_(InteractionHand.MAIN_HAND, true);
                            }
                            if (!(world instanceof Level)) return;
                            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.fall")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            return;
                        }
                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.UTILITY_POLE_MIDDLE.get()) {
                            int n13;
                            ItemStack itemStack3;
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entity;
                                itemStack3 = _livEnt.m_21205_();
                            } else {
                                itemStack3 = ItemStack.f_41583_;
                            }
                            if (itemStack3.m_41720_() != Blocks.f_50016_.m_5456_()) return;
                            Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                            if (_value instanceof IntegerProperty) {
                                IntegerProperty _getip17 = (IntegerProperty)_value;
                                n13 = (Integer)blockstate.m_61143_((Property)_getip17);
                            } else {
                                n13 = -1;
                            }
                            if (n13 != 3) {
                                IntegerProperty _integerProp;
                                int n14;
                                Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                if (_bs instanceof IntegerProperty) {
                                    IntegerProperty _getip19 = (IntegerProperty)_bs;
                                    n14 = (Integer)blockstate.m_61143_((Property)_getip19);
                                } else {
                                    n14 = -1;
                                }
                                int _value2 = n14 + 1;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                _bs = world.m_8055_(_pos);
                                Property property6 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property6 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property6).m_6908_().contains(_value2)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                                }
                            } else {
                                IntegerProperty _integerProp;
                                int _value3 = 0;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property7 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (property7 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property7).m_6908_().contains(_value3)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entity = (LivingEntity)entity;
                                _entity.m_21011_(InteractionHand.MAIN_HAND, true);
                            }
                            if (!(world instanceof Level)) return;
                            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.fall")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            return;
                        }
                        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:ranma")))) return;
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = (LivingEntity)entity;
                            itemStack = _livEnt.m_21205_();
                        } else {
                            itemStack = ItemStack.f_41583_;
                        }
                        if (itemStack.m_41720_() != Blocks.f_50016_.m_5456_()) return;
                        if (world instanceof Level) {
                            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.fall")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        }
                        if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                            IntegerProperty _getip30 = (IntegerProperty)property;
                            n10 = (Integer)blockstate.m_61143_((Property)_getip30);
                        } else {
                            n10 = -1;
                        }
                        if (n10 < 0) break block78;
                        property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty) {
                            IntegerProperty _getip32 = (IntegerProperty)property;
                            n9 = (Integer)blockstate.m_61143_((Property)_getip32);
                        } else {
                            n9 = -1;
                        }
                        if (n9 > 3) break block78;
                        Property property8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property8 instanceof IntegerProperty) {
                            _getip34 = (IntegerProperty)property8;
                            n8 = (Integer)blockstate.m_61143_(_getip34);
                        } else {
                            n8 = -1;
                        }
                        if (n8 != 3) {
                            IntegerProperty _integerProp;
                            int n15;
                            Property property9 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property9 instanceof IntegerProperty) {
                                IntegerProperty _getip36 = (IntegerProperty)property9;
                                n15 = (Integer)blockstate.m_61143_((Property)_getip36);
                            } else {
                                n15 = -1;
                            }
                            int _value = n15 + 1;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property10 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property10 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property10).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                            break block79;
                        } else {
                            IntegerProperty _integerProp;
                            int _value = 0;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            BlockState _bs = world.m_8055_(_pos);
                            Property property11 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property11 instanceof IntegerProperty && (_integerProp = (IntegerProperty)property11).m_6908_().contains(_value)) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                            }
                        }
                        break block79;
                    }
                    if ((_getip34 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                        IntegerProperty _getip40 = (IntegerProperty)_getip34;
                        n7 = (Integer)blockstate.m_61143_((Property)_getip40);
                    } else {
                        n7 = -1;
                    }
                    if (n7 < 4) break block80;
                    _getip34 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_getip34 instanceof IntegerProperty) {
                        IntegerProperty _getip42 = (IntegerProperty)_getip34;
                        n6 = (Integer)blockstate.m_61143_((Property)_getip42);
                    } else {
                        n6 = -1;
                    }
                    if (n6 > 7) break block80;
                    Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        _getip44 = (IntegerProperty)_value;
                        n5 = (Integer)blockstate.m_61143_(_getip44);
                    } else {
                        n5 = -1;
                    }
                    if (n5 != 7) {
                        IntegerProperty _integerProp;
                        int n16;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip46 = (IntegerProperty)_bs;
                            n16 = (Integer)blockstate.m_61143_((Property)_getip46);
                        } else {
                            n16 = -1;
                        }
                        int _value4 = n16 + 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value4)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                        }
                        break block79;
                    } else {
                        IntegerProperty _integerProp;
                        int _value5 = 4;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value5)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value5)), 3);
                        }
                    }
                    break block79;
                }
                if ((_getip44 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    IntegerProperty _getip50 = (IntegerProperty)_getip44;
                    n4 = (Integer)blockstate.m_61143_((Property)_getip50);
                } else {
                    n4 = -1;
                }
                if (n4 < 8) break block81;
                _getip44 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_getip44 instanceof IntegerProperty) {
                    IntegerProperty _getip52 = (IntegerProperty)_getip44;
                    n3 = (Integer)blockstate.m_61143_((Property)_getip52);
                } else {
                    n3 = -1;
                }
                if (n3 > 11) break block81;
                Property _value5 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value5 instanceof IntegerProperty) {
                    _getip54 = (IntegerProperty)_value5;
                    n2 = (Integer)blockstate.m_61143_(_getip54);
                } else {
                    n2 = -1;
                }
                if (n2 != 11) {
                    IntegerProperty _integerProp;
                    int n17;
                    Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip56 = (IntegerProperty)_bs;
                        n17 = (Integer)blockstate.m_61143_((Property)_getip56);
                    } else {
                        n17 = -1;
                    }
                    int _value = n17 + 1;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                    break block79;
                } else {
                    IntegerProperty _integerProp;
                    int _value = 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
                break block79;
            }
            if ((_getip54 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip60 = (IntegerProperty)_getip54;
                n = (Integer)blockstate.m_61143_((Property)_getip60);
            } else {
                n = -1;
            }
            if (n >= 12) {
                int n18;
                _getip54 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_getip54 instanceof IntegerProperty) {
                    IntegerProperty _getip62 = (IntegerProperty)_getip54;
                    n18 = (Integer)blockstate.m_61143_((Property)_getip62);
                } else {
                    n18 = -1;
                }
                if (n18 <= 15) {
                    int n19;
                    Property _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        IntegerProperty _getip64 = (IntegerProperty)_value;
                        n19 = (Integer)blockstate.m_61143_((Property)_getip64);
                    } else {
                        n19 = -1;
                    }
                    if (n19 != 15) {
                        IntegerProperty _integerProp;
                        int n20;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip66 = (IntegerProperty)_bs;
                            n20 = (Integer)blockstate.m_61143_((Property)_getip66);
                        } else {
                            n20 = -1;
                        }
                        int _value6 = n20 + 1;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value6)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                        }
                    } else {
                        IntegerProperty _integerProp;
                        int _value7 = 12;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value7)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
                        }
                    }
                }
            }
        }
        if (!(entity instanceof LivingEntity)) return;
        LivingEntity _entity = (LivingEntity)entity;
        _entity.m_21011_(InteractionHand.MAIN_HAND, true);
    }
}

