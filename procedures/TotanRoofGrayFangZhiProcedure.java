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

public class TotanRoofGrayFangZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity, ItemStack itemstack) {
        block95: {
            Level _level;
            block96: {
                block98: {
                    block97: {
                        Player _plr;
                        Direction _dir;
                        block82: {
                            block85: {
                                block94: {
                                    DirectionProperty _dp;
                                    block92: {
                                        block93: {
                                            DirectionProperty _dp2;
                                            block90: {
                                                block91: {
                                                    DirectionProperty _dp3;
                                                    block88: {
                                                        block89: {
                                                            DirectionProperty _dp4;
                                                            block86: {
                                                                block87: {
                                                                    DirectionProperty _dp5;
                                                                    block83: {
                                                                        block84: {
                                                                            DirectionProperty _dp6;
                                                                            block81: {
                                                                                int n;
                                                                                if (direction == null || entity == null) {
                                                                                    return;
                                                                                }
                                                                                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) break block81;
                                                                                if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara")))) break block82;
                                                                                Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                                                if (property instanceof IntegerProperty) {
                                                                                    IntegerProperty _getip5 = (IntegerProperty)property;
                                                                                    n = (Integer)blockstate.m_61143_((Property)_getip5);
                                                                                } else {
                                                                                    n = -1;
                                                                                }
                                                                                if (n < 8) break block82;
                                                                            }
                                                                            if (direction != Direction.UP || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block83;
                                                                            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
                                                                            _dir = entity.m_6350_().m_122424_();
                                                                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
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
                                                                            if (!(entity instanceof Player)) break block84;
                                                                            _plr = (Player)entity;
                                                                            if (_plr.m_150110_().f_35937_) break block85;
                                                                        }
                                                                        itemstack.m_41774_(1);
                                                                        break block85;
                                                                    }
                                                                    if (direction != Direction.DOWN || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_50016_) break block86;
                                                                    world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
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
                                                                    if (!(entity instanceof Player)) break block87;
                                                                    _plr = (Player)entity;
                                                                    if (_plr.m_150110_().f_35937_) break block85;
                                                                }
                                                                itemstack.m_41774_(1);
                                                                break block85;
                                                            }
                                                            if (direction != Direction.NORTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() != Blocks.f_50016_) break block88;
                                                            world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
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
                                                            if (!(entity instanceof Player)) break block89;
                                                            _plr = (Player)entity;
                                                            if (_plr.m_150110_().f_35937_) break block85;
                                                        }
                                                        itemstack.m_41774_(1);
                                                        break block85;
                                                    }
                                                    if (direction != Direction.SOUTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() != Blocks.f_50016_) break block90;
                                                    world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
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
                                                    if (!(entity instanceof Player)) break block91;
                                                    _plr = (Player)entity;
                                                    if (_plr.m_150110_().f_35937_) break block85;
                                                }
                                                itemstack.m_41774_(1);
                                                break block85;
                                            }
                                            if (direction != Direction.WEST || world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_) break block92;
                                            world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
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
                                            if (!(entity instanceof Player)) break block93;
                                            _plr = (Player)entity;
                                            if (_plr.m_150110_().f_35937_) break block85;
                                        }
                                        itemstack.m_41774_(1);
                                        break block85;
                                    }
                                    if (direction != Direction.EAST || world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_) break block85;
                                    world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
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
                                    if (!(entity instanceof Player)) break block94;
                                    _plr = (Player)entity;
                                    if (_plr.m_150110_().f_35937_) break block85;
                                }
                                itemstack.m_41774_(1);
                            }
                            if (world instanceof Level) {
                                _level = (Level)world;
                                _level.m_46672_(BlockPos.m_274561_((double)x, (double)y, (double)z), _level.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_());
                            }
                            break block95;
                        }
                        if (!world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara"))) || direction == Direction.UP) break block96;
                        if (direction == Direction.DOWN && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() == Blocks.f_50016_) {
                            DirectionProperty _dp;
                            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
                            _dir = entity.m_6350_().m_122424_();
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z);
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
                        } else if (direction == Direction.NORTH && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == Blocks.f_50016_) {
                            DirectionProperty _dp;
                            world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
                            _dir = entity.m_6350_().m_122424_();
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
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
                        } else if (direction == Direction.SOUTH && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == Blocks.f_50016_) {
                            DirectionProperty _dp;
                            world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
                            _dir = entity.m_6350_().m_122424_();
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
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
                        } else if (direction == Direction.WEST && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == Blocks.f_50016_) {
                            DirectionProperty _dp;
                            world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
                            _dir = entity.m_6350_().m_122424_();
                            BlockPos _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
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
                        } else if (direction == Direction.EAST && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == Blocks.f_50016_) {
                            DirectionProperty _dp;
                            world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.TOTAN_ROOF_GRAY_BLOCK.get()).m_49966_(), 3);
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
                        }
                        if (!(entity instanceof Player)) break block97;
                        _plr = (Player)entity;
                        if (_plr.m_150110_().f_35937_) break block98;
                    }
                    itemstack.m_41774_(1);
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    _level.m_46672_(BlockPos.m_274561_((double)x, (double)y, (double)z), _level.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_());
                }
                break block95;
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:totanroof/kawara"))) && direction == Direction.UP) {
                int n;
                _level = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_level instanceof IntegerProperty) {
                    IntegerProperty _getip113 = (IntegerProperty)_level;
                    n = (Integer)blockstate.m_61143_((Property)_getip113);
                } else {
                    n = -1;
                }
                if (n <= 7) {
                    if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60783_((BlockGetter)world, BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Direction.UP)) {
                        IntegerProperty _integerProp;
                        int n2;
                        Property _bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_bs instanceof IntegerProperty) {
                            IntegerProperty _getip116 = (IntegerProperty)_bs;
                            n2 = (Integer)blockstate.m_61143_((Property)_getip116);
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
                            IntegerProperty _getip119 = (IntegerProperty)_bs;
                            n3 = (Integer)blockstate.m_61143_((Property)_getip119);
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

