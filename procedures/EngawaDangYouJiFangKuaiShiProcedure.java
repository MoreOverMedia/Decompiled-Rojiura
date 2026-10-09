/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
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
public class EngawaDangYouJiFangKuaiShiProcedure {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getEntity().m_7655_()) {
            return;
        }
        EngawaDangYouJiFangKuaiShiProcedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), event.getLevel().m_8055_(event.getPos()), (Entity)event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        EngawaDangYouJiFangKuaiShiProcedure.execute(null, world, x, y, z, blockstate, entity);
    }

    /*
     * Unable to fully structure code
     */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        block23: {
            if (entity == null) {
                return;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != RojiuramodModBlocks.ENGAWA.get()) break block23;
            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                v0 = _livEnt.m_21205_();
            } else {
                v0 = ItemStack.f_41583_;
            }
            if (v0.m_41720_() != Blocks.f_50016_.m_5456_()) break block23;
            if (world instanceof Level) {
                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.fall")), SoundSource.BLOCKS, 1.0f, 1.0f);
            }
            if ((var15_8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                _getip6 = (IntegerProperty)var15_8;
                v1 = (Integer)blockstate.m_61143_((Property)_getip6);
            } else {
                v1 = -1;
            }
            if (v1 < 1) ** GOTO lbl-1000
            var15_8 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (var15_8 instanceof IntegerProperty) {
                _getip8 = (IntegerProperty)var15_8;
                v2 = (Integer)blockstate.m_61143_((Property)_getip8);
            } else {
                v2 = -1;
            }
            if (v2 <= 5) {
                var17_13 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (var17_13 instanceof IntegerProperty) {
                    _getip10 = (IntegerProperty)var17_13;
                    v3 = (Integer)blockstate.m_61143_((Property)_getip10);
                } else {
                    v3 = -1;
                }
                _value = v3 + 5;
                _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                var19_17 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (var19_17 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var19_17).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            } else lbl-1000:
            // 2 sources

            {
                if ((_value = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                    _getip13 = (IntegerProperty)_value;
                    v4 = (Integer)blockstate.m_61143_((Property)_getip13);
                } else {
                    v4 = -1;
                }
                if (v4 >= 6) {
                    _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (_value instanceof IntegerProperty) {
                        _getip15 = (IntegerProperty)_value;
                        v5 = (Integer)blockstate.m_61143_((Property)_getip15);
                    } else {
                        v5 = -1;
                    }
                    if (v5 <= 10) {
                        _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            _getip17 = (IntegerProperty)_bs;
                            v6 = (Integer)blockstate.m_61143_((Property)_getip17);
                        } else {
                            v6 = -1;
                        }
                        _value = v6 - 5;
                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        var19_18 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (var19_18 instanceof IntegerProperty && (_integerProp = (IntegerProperty)var19_18).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                }
            }
            if (entity instanceof LivingEntity) {
                _entity = (LivingEntity)entity;
                _entity.m_21011_(InteractionHand.MAIN_HAND, true);
            }
        }
    }
}

