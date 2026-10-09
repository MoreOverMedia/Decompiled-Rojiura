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

public class AsphaltLayerCrack1YouJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity, ItemStack itemstack) {
        block37: {
            block48: {
                DirectionProperty _dp;
                Player _plr;
                Direction _dir;
                block46: {
                    block47: {
                        DirectionProperty _dp2;
                        block44: {
                            block45: {
                                DirectionProperty _dp3;
                                block42: {
                                    block43: {
                                        DirectionProperty _dp4;
                                        block40: {
                                            block41: {
                                                DirectionProperty _dp5;
                                                block38: {
                                                    block39: {
                                                        DirectionProperty _dp6;
                                                        block36: {
                                                            int n;
                                                            if (direction == null || entity == null) {
                                                                return;
                                                            }
                                                            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get() || direction != Direction.UP) break block36;
                                                            Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                            if (property instanceof IntegerProperty) {
                                                                IntegerProperty _getip4 = (IntegerProperty)property;
                                                                n = (Integer)blockstate.m_61143_((Property)_getip4);
                                                            } else {
                                                                n = -1;
                                                            }
                                                            if (n != 7) break block37;
                                                        }
                                                        if (world instanceof Level) {
                                                            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                        }
                                                        if (direction != Direction.UP || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() != Blocks.f_49990_) break block38;
                                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get()).m_49966_(), 3);
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
                                                        if (!(entity instanceof Player)) break block39;
                                                        _plr = (Player)entity;
                                                        if (_plr.m_150110_().f_35937_) break block37;
                                                    }
                                                    itemstack.m_41774_(1);
                                                    break block37;
                                                }
                                                if (direction != Direction.DOWN || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_49990_) break block40;
                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get()).m_49966_(), 3);
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
                                                if (!(entity instanceof Player)) break block41;
                                                _plr = (Player)entity;
                                                if (_plr.m_150110_().f_35937_) break block37;
                                            }
                                            itemstack.m_41774_(1);
                                            break block37;
                                        }
                                        if (direction != Direction.NORTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() != Blocks.f_49990_) break block42;
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get()).m_49966_(), 3);
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
                                        if (!(entity instanceof Player)) break block43;
                                        _plr = (Player)entity;
                                        if (_plr.m_150110_().f_35937_) break block37;
                                    }
                                    itemstack.m_41774_(1);
                                    break block37;
                                }
                                if (direction != Direction.SOUTH || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() != Blocks.f_49990_) break block44;
                                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get()).m_49966_(), 3);
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
                                if (!(entity instanceof Player)) break block45;
                                _plr = (Player)entity;
                                if (_plr.m_150110_().f_35937_) break block37;
                            }
                            itemstack.m_41774_(1);
                            break block37;
                        }
                        if (direction != Direction.WEST || world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_49990_) break block46;
                        world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get()).m_49966_(), 3);
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
                        if (!(entity instanceof Player)) break block47;
                        _plr = (Player)entity;
                        if (_plr.m_150110_().f_35937_) break block37;
                    }
                    itemstack.m_41774_(1);
                    break block37;
                }
                if (direction != Direction.EAST || world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_50016_ && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() != Blocks.f_49990_) break block37;
                world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.ASPHALT_LAYER_CRACK_BLOCK.get()).m_49966_(), 3);
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
                if (!(entity instanceof Player)) break block48;
                _plr = (Player)entity;
                if (_plr.m_150110_().f_35937_) break block37;
            }
            itemstack.m_41774_(1);
        }
    }
}

