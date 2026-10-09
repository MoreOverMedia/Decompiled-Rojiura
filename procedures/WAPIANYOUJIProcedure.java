/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.tags.ItemTags
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
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
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModItems;

@Mod.EventBusSubscriber
public class WAPIANYOUJIProcedure {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getEntity().m_7655_()) {
            return;
        }
        WAPIANYOUJIProcedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), (Entity)event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        WAPIANYOUJIProcedure.execute(null, world, x, y, z, entity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
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
        if (!itemStack2.m_204117_(ItemTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) return;
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            itemStack = _livEnt.m_21205_();
        } else {
            itemStack = ItemStack.f_41583_;
        }
        if (itemStack.m_41720_() != RojiuramodModItems.TOTAN_ROOF_BLUE.get()) {
            ItemStack itemStack3;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                itemStack3 = _livEnt.m_21205_();
            } else {
                itemStack3 = ItemStack.f_41583_;
            }
            if (itemStack3.m_41720_() != RojiuramodModItems.TOTAN_ROOF_RED.get()) {
                ItemStack itemStack4;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    itemStack4 = _livEnt.m_21205_();
                } else {
                    itemStack4 = ItemStack.f_41583_;
                }
                if (itemStack4.m_41720_() != RojiuramodModItems.TOTAN_ROOF_GRAY.get()) {
                    if (!(world instanceof Level)) return;
                    ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    return;
                }
            }
        }
        if (!(world instanceof Level)) return;
        ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
    }
}

