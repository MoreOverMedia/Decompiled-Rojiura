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
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
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
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModBlocks;

public class CardBoardBed1YouJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
        block40: {
            block47: {
                EnumProperty _ap;
                IntegerProperty _integerProp;
                block45: {
                    block46: {
                        EnumProperty _ap2;
                        IntegerProperty _integerProp2;
                        block43: {
                            block44: {
                                EnumProperty _ap3;
                                IntegerProperty _integerProp3;
                                block41: {
                                    block42: {
                                        EnumProperty _ap4;
                                        DirectionProperty _dp;
                                        IntegerProperty _integerProp4;
                                        if (direction == null || entity == null) {
                                            return;
                                        }
                                        if (direction != Direction.UP) break block40;
                                        if (world instanceof Level) {
                                            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                        }
                                        if (entity.m_6350_() != Direction.NORTH) break block41;
                                        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0))).m_60734_() != Blocks.f_50016_ || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block40;
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0)), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                                        int _value = 1;
                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0));
                                        BlockState _bs = world.m_8055_(_pos);
                                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                        if (property instanceof IntegerProperty && (_integerProp4 = (IntegerProperty)property).m_6908_().contains(_value)) {
                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp4, (Comparable)Integer.valueOf(_value)), 3);
                                        }
                                        Direction _dir = entity.m_6350_().m_122424_();
                                        _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                        _bs = world.m_8055_(_pos);
                                        Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
                                        } else {
                                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                            if (_property instanceof EnumProperty && (_ap4 = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap4, (Comparable)_dir.m_122434_()), 3);
                                            }
                                        }
                                        _dir = entity.m_6350_().m_122424_();
                                        _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z - 1.0));
                                        _bs = world.m_8055_(_pos);
                                        _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
                                        } else {
                                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                            if (_property instanceof EnumProperty && (_ap4 = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap4, (Comparable)_dir.m_122434_()), 3);
                                            }
                                        }
                                        if (!(entity instanceof Player)) break block42;
                                        Player _plr = (Player)entity;
                                        if (_plr.m_150110_().f_35937_) break block40;
                                    }
                                    itemstack.m_41774_(1);
                                    break block40;
                                }
                                if (entity.m_6350_() != Direction.SOUTH) break block43;
                                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0))).m_60734_() != Blocks.f_50016_ || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block40;
                                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0)), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                                int _value = 1;
                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0));
                                BlockState _bs = world.m_8055_(_pos);
                                Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                                if (_dp instanceof IntegerProperty && (_integerProp3 = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp3, (Comparable)Integer.valueOf(_value)), 3);
                                }
                                Direction _dir = entity.m_6350_().m_122424_();
                                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                _bs = world.m_8055_(_pos);
                                Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                                } else {
                                    _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                    if (_property instanceof EnumProperty && (_ap3 = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap3, (Comparable)_dir.m_122434_()), 3);
                                    }
                                }
                                _dir = entity.m_6350_().m_122424_();
                                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)(z + 1.0));
                                _bs = world.m_8055_(_pos);
                                _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                                } else {
                                    _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                    if (_property instanceof EnumProperty && (_ap3 = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap3, (Comparable)_dir.m_122434_()), 3);
                                    }
                                }
                                if (!(entity instanceof Player)) break block44;
                                Player _plr = (Player)entity;
                                if (_plr.m_150110_().f_35937_) break block40;
                            }
                            itemstack.m_41774_(1);
                            break block40;
                        }
                        if (entity.m_6350_() != Direction.WEST) break block45;
                        if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_ || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block40;
                        world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                        int _value = 1;
                        BlockPos _pos = BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_dp instanceof IntegerProperty && (_integerProp2 = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp2, (Comparable)Integer.valueOf(_value)), 3);
                        }
                        Direction _dir = entity.m_6350_().m_122424_();
                        _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                        _bs = world.m_8055_(_pos);
                        Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                        } else {
                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                            if (_property instanceof EnumProperty && (_ap2 = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap2, (Comparable)_dir.m_122434_()), 3);
                            }
                        }
                        _dir = entity.m_6350_().m_122424_();
                        _pos = BlockPos.m_274561_((double)(x - 1.0), (double)(y + 1.0), (double)z);
                        _bs = world.m_8055_(_pos);
                        _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                        } else {
                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                            if (_property instanceof EnumProperty && (_ap2 = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap2, (Comparable)_dir.m_122434_()), 3);
                            }
                        }
                        if (!(entity instanceof Player)) break block46;
                        Player _plr = (Player)entity;
                        if (_plr.m_150110_().f_35937_) break block40;
                    }
                    itemstack.m_41774_(1);
                    break block40;
                }
                if (entity.m_6350_() != Direction.EAST || world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_ || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block40;
                world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.CARD_BOARD_BED_BLOCK.get()).m_49966_(), 3);
                int _value = 1;
                BlockPos _pos = BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property _dp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (_dp instanceof IntegerProperty && (_integerProp = (IntegerProperty)_dp).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
                Direction _dir = entity.m_6350_().m_122424_();
                _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                _bs = world.m_8055_(_pos);
                Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                } else {
                    _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                    if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                    }
                }
                _dir = entity.m_6350_().m_122424_();
                _pos = BlockPos.m_274561_((double)(x + 1.0), (double)(y + 1.0), (double)z);
                _bs = world.m_8055_(_pos);
                _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_(_dp, (Comparable)_dir), 3);
                } else {
                    _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                    if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                    }
                }
                if (!(entity instanceof Player)) break block47;
                Player _plr = (Player)entity;
                if (_plr.m_150110_().f_35937_) break block40;
            }
            itemstack.m_41774_(1);
        }
    }
}

