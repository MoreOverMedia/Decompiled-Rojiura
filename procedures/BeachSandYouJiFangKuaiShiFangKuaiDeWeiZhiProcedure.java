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
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.BooleanProperty
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModBlocks;

public class BeachSandYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity, ItemStack itemstack) {
        block47: {
            IntegerProperty _integerProp;
            int n;
            block44: {
                block56: {
                    Player _plr;
                    BlockPos _pos;
                    block54: {
                        block55: {
                            block52: {
                                block53: {
                                    block50: {
                                        block51: {
                                            block48: {
                                                block49: {
                                                    block45: {
                                                        block46: {
                                                            block43: {
                                                                int n2;
                                                                if (direction == null || entity == null) {
                                                                    return;
                                                                }
                                                                if (world instanceof Level) {
                                                                    ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                                }
                                                                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != RojiuramodModBlocks.BEACH_SAND_BLOCK.get() || direction != Direction.UP) break block43;
                                                                Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                                if (property instanceof IntegerProperty) {
                                                                    IntegerProperty _getip5 = (IntegerProperty)property;
                                                                    n2 = (Integer)blockstate.m_61143_((Property)_getip5);
                                                                } else {
                                                                    n2 = -1;
                                                                }
                                                                if (n2 != 7) break block44;
                                                            }
                                                            if (direction != Direction.UP) break block45;
                                                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == Blocks.f_49990_) {
                                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                                                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                                BlockState _bs = world.m_8055_(_pos);
                                                                Property property = _bs.m_60734_().m_49965_().m_61081_("waterlogged");
                                                                if (property instanceof BooleanProperty) {
                                                                    BooleanProperty _booleanProp = (BooleanProperty)property;
                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
                                                                }
                                                            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == Blocks.f_50016_) {
                                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                                            }
                                                            if (!(entity instanceof Player)) break block46;
                                                            _plr = (Player)entity;
                                                            if (_plr.m_150110_().f_35937_) break block47;
                                                        }
                                                        itemstack.m_41774_(1);
                                                        break block47;
                                                    }
                                                    if (direction != Direction.DOWN) break block48;
                                                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() == Blocks.f_49990_) {
                                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                                        _pos = BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z);
                                                        BlockState _bs = world.m_8055_(_pos);
                                                        Property property = _bs.m_60734_().m_49965_().m_61081_("waterlogged");
                                                        if (property instanceof BooleanProperty) {
                                                            BooleanProperty _booleanProp = (BooleanProperty)property;
                                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
                                                        }
                                                    } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() == Blocks.f_50016_) {
                                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                                    }
                                                    if (!(entity instanceof Player)) break block49;
                                                    _plr = (Player)entity;
                                                    if (_plr.m_150110_().f_35937_) break block47;
                                                }
                                                itemstack.m_41774_(1);
                                                break block47;
                                            }
                                            if (direction != Direction.NORTH) break block50;
                                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == Blocks.f_49990_) {
                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                                _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                                                BlockState _bs = world.m_8055_(_pos);
                                                Property property = _bs.m_60734_().m_49965_().m_61081_("waterlogged");
                                                if (property instanceof BooleanProperty) {
                                                    BooleanProperty _booleanProp = (BooleanProperty)property;
                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
                                                }
                                            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == Blocks.f_50016_) {
                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                            }
                                            if (!(entity instanceof Player)) break block51;
                                            _plr = (Player)entity;
                                            if (_plr.m_150110_().f_35937_) break block47;
                                        }
                                        itemstack.m_41774_(1);
                                        break block47;
                                    }
                                    if (direction != Direction.SOUTH) break block52;
                                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == Blocks.f_49990_) {
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                                        BlockState _bs = world.m_8055_(_pos);
                                        Property property = _bs.m_60734_().m_49965_().m_61081_("waterlogged");
                                        if (property instanceof BooleanProperty) {
                                            BooleanProperty _booleanProp = (BooleanProperty)property;
                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
                                        }
                                    } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == Blocks.f_50016_) {
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                    }
                                    if (!(entity instanceof Player)) break block53;
                                    _plr = (Player)entity;
                                    if (_plr.m_150110_().f_35937_) break block47;
                                }
                                itemstack.m_41774_(1);
                                break block47;
                            }
                            if (direction != Direction.WEST) break block54;
                            if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == Blocks.f_49990_) {
                                world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                                _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property property = _bs.m_60734_().m_49965_().m_61081_("waterlogged");
                                if (property instanceof BooleanProperty) {
                                    BooleanProperty _booleanProp = (BooleanProperty)property;
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
                                }
                            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == Blocks.f_50016_) {
                                world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                            }
                            if (!(entity instanceof Player)) break block55;
                            _plr = (Player)entity;
                            if (_plr.m_150110_().f_35937_) break block47;
                        }
                        itemstack.m_41774_(1);
                        break block47;
                    }
                    if (direction != Direction.EAST) break block47;
                    if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == Blocks.f_49990_) {
                        world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                        _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("waterlogged");
                        if (property instanceof BooleanProperty) {
                            BooleanProperty _booleanProp = (BooleanProperty)property;
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
                        }
                    } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == Blocks.f_50016_) {
                        world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.BEACH_SAND_BLOCK.get()).m_49966_(), 3);
                    }
                    if (!(entity instanceof Player)) break block56;
                    _plr = (Player)entity;
                    if (_plr.m_150110_().f_35937_) break block47;
                }
                itemstack.m_41774_(1);
                break block47;
            }
            Property _booleanProp = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_booleanProp instanceof IntegerProperty) {
                IntegerProperty _getip73 = (IntegerProperty)_booleanProp;
                n = (Integer)blockstate.m_61143_((Property)_getip73);
            } else {
                n = -1;
            }
            int _value = n + 1;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        }
    }
}

