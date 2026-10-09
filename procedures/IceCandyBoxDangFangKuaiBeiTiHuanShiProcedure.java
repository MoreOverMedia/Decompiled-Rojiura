/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.entity.BlockEntity
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.event.level.BlockEvent$EntityPlaceEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package rojiuramod.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rojiuramod.init.RojiuramodModBlocks;

@Mod.EventBusSubscriber
public class IceCandyBoxDangFangKuaiBeiTiHuanShiProcedure {
    @SubscribeEvent
    public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
        IceCandyBoxDangFangKuaiBeiTiHuanShiProcedure.execute((Event)event, event.getLevel(), event.getPos().m_123341_(), event.getPos().m_123342_(), event.getPos().m_123343_());
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        IceCandyBoxDangFangKuaiBeiTiHuanShiProcedure.execute(null, world, x, y, z);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        Entity entity;
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() == RojiuramodModBlocks.ICE_CANDY_BOX.get() && (entity = (Entity)world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)9.0, (double)9.0, (double)9.0), e -> true).stream().sorted(new Object(){

            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player) {
            Player _plr = (Player)entity;
            if (_plr.m_150110_().f_35937_) {
                Level _level;
                BlockState _bs;
                BlockEntity _blockEntity;
                BlockPos _bp;
                if (!world.m_5776_()) {
                    _bp = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _blockEntity = world.m_7702_(_bp);
                    _bs = world.m_8055_(_bp);
                    if (_blockEntity != null) {
                        _blockEntity.getPersistentData().m_128347_("icecandy", 1.0);
                    }
                    if (world instanceof Level) {
                        _level = (Level)world;
                        _level.m_7260_(_bp, _bs, _bs, 3);
                    }
                }
                if (!world.m_5776_()) {
                    _bp = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _blockEntity = world.m_7702_(_bp);
                    _bs = world.m_8055_(_bp);
                    if (_blockEntity != null) {
                        _blockEntity.getPersistentData().m_128347_("cans", 1.0);
                    }
                    if (world instanceof Level) {
                        _level = (Level)world;
                        _level.m_7260_(_bp, _bs, _bs, 3);
                    }
                }
            }
        }
    }
}

