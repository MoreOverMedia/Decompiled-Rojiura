/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.tags.BlockTags
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModBlocks;

public class KawaraGrayFangZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity, ItemStack itemstack) {
        block94: {
            Level _level;
            block95: {
                block98: {
                    block105: {
                        DirectionProperty _dp;
                        Player _plr;
                        Direction _dir;
                        block103: {
                            block104: {
                                DirectionProperty _dp2;
                                block101: {
                                    block102: {
                                        DirectionProperty _dp3;
                                        block99: {
                                            block100: {
                                                DirectionProperty _dp4;
                                                block96: {
                                                    block97: {
                                                        DirectionProperty _dp5;
                                                        block81: {
                                                            block84: {
                                                                block93: {
                                                                    DirectionProperty _dp6;
                                                                    block91: {
                                                                        block92: {
                                                                            DirectionProperty _dp7;
                                                                            block89: {
                                                                                block90: {
                                                                                    DirectionProperty _dp8;
                                                                                    block87: {
                                                                                        block88: {
                                                                                            DirectionProperty _dp9;
                                                                                            block85: {
                                                                                                block86: {
                                                                                                    DirectionProperty _dp10;
                                                                                                    block82: {
                                                                                                        block83: {
                                                                                                            DirectionProperty _dp11;
                                                                                                            block80: {
                                                                                                                int n;
                                                                                                                if (direction == null || entity == null) {
                                                                                                                    return;
                                                                                                                }
                                                                                                                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) break block80;
                                                                                                                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) break block81;
                                                                                                                Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                                                if (property instanceof IntegerProperty) {
                                                                                                                    IntegerProperty _getip5 = (IntegerProperty)property;
                                                                                                                    n = (Integer)blockstate.m_61143_((Property)_getip5);
                                                                                                                } else {
                                                                                                                    n = -1;
                                                                                                                }
                                                                                                                if (n < 8) break block81;
                                                                                                            }
                                                                                                            if (direction != Direction.UP || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block82;
                                                                                                            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                                                                            _dir = entity.m_6350_().m_122424_();
                                                                                                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                                                                            BlockState _bs = world.m_8055_(_pos);
                                                                                                            Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                                                                            if (_property instanceof DirectionProperty && (_dp11 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                                                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp11, (Comparable)_dir), 3);
                                                                                                            } else {
                                                                                                                EnumProperty _ap;
                                                                                                                _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                                                                                if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                                                                                }
                                                                                                            }
                                                                                                            if (!(entity instanceof Player)) break block83;
                                                                                                            _plr = (Player)entity;
                                                                                                            if (_plr.m_150110_().f_35937_) break block84;
                                                                                                        }
                                                                                                        itemstack.m_41774_(1);
                                                                                                        break block84;
                                                                                                    }
                                                                                                    if (direction != Direction.DOWN || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block85;
                                                                                                    world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                                                                    _dir = entity.m_6350_().m_122424_();
                                                                                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z);
                                                                                                    BlockState _bs = world.m_8055_(_pos);
                                                                                                    Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                                                                    if (_property instanceof DirectionProperty && (_dp10 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp10, (Comparable)_dir), 3);
                                                                                                    } else {
                                                                                                        EnumProperty _ap;
                                                                                                        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                                                                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                                                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                                                                        }
                                                                                                    }
                                                                                                    if (!(entity instanceof Player)) break block86;
                                                                                                    _plr = (Player)entity;
                                                                                                    if (_plr.m_150110_().f_35937_) break block84;
                                                                                                }
                                                                                                itemstack.m_41774_(1);
                                                                                                break block84;
                                                                                            }
                                                                                            if (direction != Direction.NORTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() != Blocks.f_50016_) break block87;
                                                                                            world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                                                            _dir = entity.m_6350_().m_122424_();
                                                                                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                                                                                            BlockState _bs = world.m_8055_(_pos);
                                                                                            Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                                                            if (_property instanceof DirectionProperty && (_dp9 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp9, (Comparable)_dir), 3);
                                                                                            } else {
                                                                                                EnumProperty _ap;
                                                                                                _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                                                                if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                                                                }
                                                                                            }
                                                                                            if (!(entity instanceof Player)) break block88;
                                                                                            _plr = (Player)entity;
                                                                                            if (_plr.m_150110_().f_35937_) break block84;
                                                                                        }
                                                                                        itemstack.m_41774_(1);
                                                                                        break block84;
                                                                                    }
                                                                                    if (direction != Direction.SOUTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() != Blocks.f_50016_) break block89;
                                                                                    world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                                                    _dir = entity.m_6350_().m_122424_();
                                                                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                                                                                    BlockState _bs = world.m_8055_(_pos);
                                                                                    Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                                                    if (_property instanceof DirectionProperty && (_dp8 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp8, (Comparable)_dir), 3);
                                                                                    } else {
                                                                                        EnumProperty _ap;
                                                                                        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                                                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                                                        }
                                                                                    }
                                                                                    if (!(entity instanceof Player)) break block90;
                                                                                    _plr = (Player)entity;
                                                                                    if (_plr.m_150110_().f_35937_) break block84;
                                                                                }
                                                                                itemstack.m_41774_(1);
                                                                                break block84;
                                                                            }
                                                                            if (direction != Direction.WEST || world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_) break block91;
                                                                            world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                                            _dir = entity.m_6350_().m_122424_();
                                                                            BlockPos _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                                                                            BlockState _bs = world.m_8055_(_pos);
                                                                            Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                                            if (_property instanceof DirectionProperty && (_dp7 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp7, (Comparable)_dir), 3);
                                                                            } else {
                                                                                EnumProperty _ap;
                                                                                _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                                                if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                                                }
                                                                            }
                                                                            if (!(entity instanceof Player)) break block92;
                                                                            _plr = (Player)entity;
                                                                            if (_plr.m_150110_().f_35937_) break block84;
                                                                        }
                                                                        itemstack.m_41774_(1);
                                                                        break block84;
                                                                    }
                                                                    if (direction != Direction.EAST || world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_) break block84;
                                                                    world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                                    _dir = entity.m_6350_().m_122424_();
                                                                    BlockPos _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                                                                    BlockState _bs = world.m_8055_(_pos);
                                                                    Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                                    if (_property instanceof DirectionProperty && (_dp6 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp6, (Comparable)_dir), 3);
                                                                    } else {
                                                                        EnumProperty _ap;
                                                                        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                                        if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                                        }
                                                                    }
                                                                    if (!(entity instanceof Player)) break block93;
                                                                    _plr = (Player)entity;
                                                                    if (_plr.m_150110_().f_35937_) break block84;
                                                                }
                                                                itemstack.m_41774_(1);
                                                            }
                                                            if (world instanceof Level) {
                                                                _level = (Level)world;
                                                                _level.m_46672_(BlockPos.m_274561_((double)x, (double)y, (double)z), _level.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_());
                                                            }
                                                            break block94;
                                                        }
                                                        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara"))) || direction == Direction.UP) break block95;
                                                        if (direction != Direction.DOWN || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block96;
                                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                        _dir = entity.m_6350_().m_122424_();
                                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z);
                                                        BlockState _bs = world.m_8055_(_pos);
                                                        Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                        if (_property instanceof DirectionProperty && (_dp5 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp5, (Comparable)_dir), 3);
                                                        } else {
                                                            EnumProperty _ap;
                                                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                            if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                            }
                                                        }
                                                        if (!(entity instanceof Player)) break block97;
                                                        _plr = (Player)entity;
                                                        if (_plr.m_150110_().f_35937_) break block98;
                                                    }
                                                    itemstack.m_41774_(1);
                                                    break block98;
                                                }
                                                if (direction != Direction.NORTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() != Blocks.f_50016_) break block99;
                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                                _dir = entity.m_6350_().m_122424_();
                                                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                                                BlockState _bs = world.m_8055_(_pos);
                                                Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                                if (_property instanceof DirectionProperty && (_dp4 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp4, (Comparable)_dir), 3);
                                                } else {
                                                    EnumProperty _ap;
                                                    _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                                    if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                                    }
                                                }
                                                if (!(entity instanceof Player)) break block100;
                                                _plr = (Player)entity;
                                                if (_plr.m_150110_().f_35937_) break block98;
                                            }
                                            itemstack.m_41774_(1);
                                            break block98;
                                        }
                                        if (direction != Direction.SOUTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() != Blocks.f_50016_) break block101;
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                        _dir = entity.m_6350_().m_122424_();
                                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                                        BlockState _bs = world.m_8055_(_pos);
                                        Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                        if (_property instanceof DirectionProperty && (_dp3 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp3, (Comparable)_dir), 3);
                                        } else {
                                            EnumProperty _ap;
                                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                            if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                            }
                                        }
                                        if (!(entity instanceof Player)) break block102;
                                        _plr = (Player)entity;
                                        if (_plr.m_150110_().f_35937_) break block98;
                                    }
                                    itemstack.m_41774_(1);
                                    break block98;
                                }
                                if (direction != Direction.WEST || world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_) break block103;
                                world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                                _dir = entity.m_6350_().m_122424_();
                                BlockPos _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                                BlockState _bs = world.m_8055_(_pos);
                                Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                                if (_property instanceof DirectionProperty && (_dp2 = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp2, (Comparable)_dir), 3);
                                } else {
                                    EnumProperty _ap;
                                    _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                                    if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                                    }
                                }
                                if (!(entity instanceof Player)) break block104;
                                _plr = (Player)entity;
                                if (_plr.m_150110_().f_35937_) break block98;
                            }
                            itemstack.m_41774_(1);
                            break block98;
                        }
                        if (direction != Direction.EAST || world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_) break block98;
                        world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.KAWARA_GRAY_BLOCK.get()).m_49966_(), 3);
                        _dir = entity.m_6350_().m_122424_();
                        BlockPos _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos);
                        Property _property = _bs.m_60734_().m_49965_().m_61081_("facing");
                        if (_property instanceof DirectionProperty && (_dp = (DirectionProperty)_property).m_6908_().contains(_dir)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3);
                        } else {
                            EnumProperty _ap;
                            _property = _bs.m_60734_().m_49965_().m_61081_("axis");
                            if (_property instanceof EnumProperty && (_ap = (EnumProperty)_property).m_6908_().contains(_dir.m_122434_())) {
                                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);
                            }
                        }
                        if (!(entity instanceof Player)) break block105;
                        _plr = (Player)entity;
                        if (_plr.m_150110_().f_35937_) break block98;
                    }
                    itemstack.m_41774_(1);
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    _level.m_46672_(BlockPos.m_274561_((double)x, (double)y, (double)z), _level.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_());
                }
                break block94;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara"))) && direction == Direction.UP) {
                int n;
                _level = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_level instanceof IntegerProperty) {
                    IntegerProperty _getip125 = (IntegerProperty)_level;
                    n = (Integer)blockstate.m_61143_((Property)_getip125);
                } else {
                    n = -1;
                }
                if (n <= 7) {
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                        IntegerProperty _integerProp;
                        int n2;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip128 = (IntegerProperty)_bs;
                            n2 = (Integer)blockstate.m_61143_((Property)_getip128);
                        } else {
                            n2 = -1;
                        }
                        _value = n2 + 8;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    } else {
                        IntegerProperty _integerProp;
                        int n3;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip131 = (IntegerProperty)_bs;
                            n3 = (Integer)blockstate.m_61143_((Property)_getip131);
                        } else {
                            n3 = -1;
                        }
                        _value = n3 + 16;
                        BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity)entity;
                        _entity.m_21011_(InteractionHand.MAIN_HAND, true);
                    }
                    if (world instanceof Level) {
                        _level = (Level)world;
                        _level.m_46672_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), _level.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_());
                    }
                }
            }
        }
    }
}

