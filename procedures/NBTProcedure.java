/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.entity.BlockEntity
 *  net.minecraftforge.event.level.BlockEvent$BreakEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package rojiuramod.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rojiuramod.init.RojiuramodModBlocks;
import rojiuramod.init.RojiuramodModItems;

@Mod.EventBusSubscriber
public class NBTProcedure {
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        NBTProcedure.execute((Event)event, event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_(), (Entity)event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        NBTProcedure.execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        block8: {
            block7: {
                if (entity == null) {
                    return;
                }
                if (!(entity instanceof Player)) break block7;
                Player _plr = (Player)entity;
                if (_plr.m_150110_().f_35937_) break block8;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ICE_CANDY_BOX.get()) {
                ItemEntity entityToSpawn;
                ServerLevel _level;
                for (int index0 = 0; index0 < (int)new Object(){

                    public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                        BlockEntity blockEntity = world.m_7702_(pos);
                        if (blockEntity != null) {
                            return blockEntity.getPersistentData().m_128459_(tag);
                        }
                        return -1.0;
                    }
                }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "icecandy"); ++index0) {
                    if (!(world instanceof ServerLevel)) continue;
                    _level = (ServerLevel)world;
                    entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ICE_CANDY.get()));
                    entityToSpawn.m_32010_(10);
                    _level.m_7967_((Entity)entityToSpawn);
                }
                for (int index1 = 0; index1 < (int)new Object(){

                    public double getValue(LevelAccessor world, BlockPos pos, String tag) {
                        BlockEntity blockEntity = world.m_7702_(pos);
                        if (blockEntity != null) {
                            return blockEntity.getPersistentData().m_128459_(tag);
                        }
                        return -1.0;
                    }
                }.getValue(world, BlockPos.m_274561_((double)x, (double)y, (double)z), "cans"); ++index1) {
                    if (!(world instanceof ServerLevel)) continue;
                    _level = (ServerLevel)world;
                    entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.CANS.get()));
                    entityToSpawn.m_32010_(10);
                    _level.m_7967_((Entity)entityToSpawn);
                }
            }
        }
    }
}

