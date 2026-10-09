/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModBlocks;

public class BuoyYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
        block18: {
            block27: {
                block25: {
                    block26: {
                        block23: {
                            block24: {
                                block21: {
                                    block22: {
                                        block19: {
                                            block20: {
                                                block16: {
                                                    block17: {
                                                        if (direction == null || entity == null) {
                                                            return;
                                                        }
                                                        double raytrace_y = 0.0;
                                                        double raytrace_x = 0.0;
                                                        double raytrace_z = 0.0;
                                                        if (direction != Direction.UP || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_49990_) break block16;
                                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.BUOY_BLOCK.get()).m_49966_(), 3);
                                                        if (!(entity instanceof Player)) break block17;
                                                        Player _plr = (Player)entity;
                                                        if (_plr.m_150110_().f_35937_) break block18;
                                                    }
                                                    itemstack.m_41774_(1);
                                                    break block18;
                                                }
                                                if (direction != Direction.DOWN || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_49990_) break block19;
                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.BUOY_BLOCK.get()).m_49966_(), 3);
                                                if (!(entity instanceof Player)) break block20;
                                                Player _plr = (Player)entity;
                                                if (_plr.m_150110_().f_35937_) break block18;
                                            }
                                            itemstack.m_41774_(1);
                                            break block18;
                                        }
                                        if (direction != Direction.NORTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() != Blocks.f_49990_) break block21;
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.BUOY_BLOCK.get()).m_49966_(), 3);
                                        if (!(entity instanceof Player)) break block22;
                                        Player _plr = (Player)entity;
                                        if (_plr.m_150110_().f_35937_) break block18;
                                    }
                                    itemstack.m_41774_(1);
                                    break block18;
                                }
                                if (direction != Direction.SOUTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() != Blocks.f_49990_) break block23;
                                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.BUOY_BLOCK.get()).m_49966_(), 3);
                                if (!(entity instanceof Player)) break block24;
                                Player _plr = (Player)entity;
                                if (_plr.m_150110_().f_35937_) break block18;
                            }
                            itemstack.m_41774_(1);
                            break block18;
                        }
                        if (direction != Direction.WEST || world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_49990_) break block25;
                        world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.BUOY_BLOCK.get()).m_49966_(), 3);
                        if (!(entity instanceof Player)) break block26;
                        Player _plr = (Player)entity;
                        if (_plr.m_150110_().f_35937_) break block18;
                    }
                    itemstack.m_41774_(1);
                    break block18;
                }
                if (direction != Direction.EAST || world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_49990_) break block18;
                world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.BUOY_BLOCK.get()).m_49966_(), 3);
                if (!(entity instanceof Player)) break block27;
                Player _plr = (Player)entity;
                if (_plr.m_150110_().f_35937_) break block18;
            }
            itemstack.m_41774_(1);
        }
        if (world instanceof Level) {
            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lily_pad.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }
}

