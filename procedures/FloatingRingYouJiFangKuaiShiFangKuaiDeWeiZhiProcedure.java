/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ClipContext
 *  net.minecraft.world.level.ClipContext$Block
 *  net.minecraft.world.level.ClipContext$Fluid
 *  net.minecraft.world.level.GameType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.phys.HitResult$Type
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModEntities;

public class FloatingRingYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
        block35: {
            block36: {
                double raytrace_z;
                double raytrace_x;
                double raytrace_y;
                block34: {
                    if (direction == null || entity == null) {
                        return;
                    }
                    raytrace_y = 0.0;
                    raytrace_x = 0.0;
                    raytrace_z = 0.0;
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != Blocks.f_49990_ && world.m_6425_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_76188_().m_60734_() != Blocks.f_49990_) break block34;
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel)world;
                        Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                    break block35;
                }
                if (entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_6662_() != HitResult.Type.BLOCK || new Object(){

                    public boolean checkGamemode(Entity _ent) {
                        if (_ent instanceof ServerPlayer) {
                            ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                            return _serverPlayer.f_8941_.m_9290_() == GameType.ADVENTURE;
                        }
                        if (_ent.m_9236_().m_5776_() && _ent instanceof Player) {
                            Player _player = (Player)_ent;
                            return Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.ADVENTURE;
                        }
                        return false;
                    }
                }.checkGamemode(entity)) break block35;
                raytrace_x = entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_82425_().m_123341_();
                if (world.m_6425_(BlockPos.m_274561_((double)raytrace_x, (double)(raytrace_y = (double)entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_82425_().m_123342_()), (double)(raytrace_z = (double)entity.m_9236_().m_45547_(new ClipContext(entity.m_20299_(1.0f), entity.m_20299_(1.0f).m_82549_(entity.m_20252_(1.0f).m_82490_(5.0)), ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).m_82425_().m_123343_()))).m_76188_().m_60734_() == Blocks.f_49990_ && world.m_46859_(BlockPos.m_274561_((double)raytrace_x, (double)(raytrace_y + 1.0), (double)raytrace_z))) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)raytrace_x, (double)(raytrace_y + 1.0), (double)raytrace_z), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                } else if (direction == Direction.UP) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                } else if (direction == Direction.DOWN) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                } else if (direction == Direction.NORTH) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                } else if (direction == Direction.SOUTH) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                } else if (direction == Direction.WEST) {
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn != null) {
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                } else if (direction == Direction.EAST && world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    Entity entityToSpawn = ((EntityType)RojiuramodModEntities.FLOATING_RING_ENTITY.get()).m_262496_(_level, BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                    if (entityToSpawn != null) {
                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                    }
                }
                if (!(entity instanceof Player)) break block36;
                Player _plr = (Player)entity;
                if (_plr.m_150110_().f_35937_) break block35;
            }
            itemstack.m_41774_(1);
        }
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }
}

