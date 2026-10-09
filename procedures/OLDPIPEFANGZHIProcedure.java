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
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModBlocks;

public class OLDPIPEFANGZHIProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
        block42: {
            block51: {
                EnumProperty _enumProp;
                DirectionProperty _dp;
                block49: {
                    block50: {
                        EnumProperty _enumProp2;
                        DirectionProperty _dp2;
                        block47: {
                            block48: {
                                EnumProperty _enumProp3;
                                DirectionProperty _dp3;
                                block45: {
                                    block46: {
                                        EnumProperty _enumProp4;
                                        DirectionProperty _dp4;
                                        block43: {
                                            block44: {
                                                EnumProperty _enumProp5;
                                                DirectionProperty _dp5;
                                                block40: {
                                                    block41: {
                                                        EnumProperty _enumProp6;
                                                        DirectionProperty _dp6;
                                                        if (direction == null || entity == null) {
                                                            return;
                                                        }
                                                        if (world instanceof Level) {
                                                            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                        }
                                                        if (direction != Direction.UP || !world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_247087_()) break block40;
                                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), ((Block)RojiuramodModBlocks.OLD_PIPE.get()).m_49966_(), 3);
                                                        Direction _dir = entity.m_6350_().m_122424_();
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
                                                        String _value = "down";
                                                        _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                                        _bs = world.m_8055_(_pos);
                                                        _dp6 = _bs.m_60734_().m_49965_().m_61081_("shape");
                                                        if (_dp6 instanceof EnumProperty && (_enumProp6 = (EnumProperty)_dp6).m_6215_(_value).isPresent()) {
                                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_enumProp6, (Comparable)((Object)((Enum)_enumProp6.m_6215_(_value).get()))), 3);
                                                        }
                                                        if (!(entity instanceof Player)) break block41;
                                                        Player _plr = (Player)entity;
                                                        if (_plr.m_150110_().f_35937_) break block42;
                                                    }
                                                    itemstack.m_41774_(1);
                                                    break block42;
                                                }
                                                if (direction != Direction.DOWN || !world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_247087_()) break block43;
                                                world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), ((Block)RojiuramodModBlocks.OLD_PIPE.get()).m_49966_(), 3);
                                                Direction _dir = entity.m_6350_().m_122424_();
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
                                                String _value = "up";
                                                _pos = BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z);
                                                _bs = world.m_8055_(_pos);
                                                _dp5 = _bs.m_60734_().m_49965_().m_61081_("shape");
                                                if (_dp5 instanceof EnumProperty && (_enumProp5 = (EnumProperty)_dp5).m_6215_(_value).isPresent()) {
                                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_enumProp5, (Comparable)((Object)((Enum)_enumProp5.m_6215_(_value).get()))), 3);
                                                }
                                                if (!(entity instanceof Player)) break block44;
                                                Player _plr = (Player)entity;
                                                if (_plr.m_150110_().f_35937_) break block42;
                                            }
                                            itemstack.m_41774_(1);
                                            break block42;
                                        }
                                        if (direction != Direction.NORTH || !world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_247087_()) break block45;
                                        world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0)), ((Block)RojiuramodModBlocks.OLD_PIPE.get()).m_49966_(), 3);
                                        Direction _dir = direction;
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
                                        String _value = "side";
                                        _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0));
                                        _bs = world.m_8055_(_pos);
                                        _dp4 = _bs.m_60734_().m_49965_().m_61081_("shape");
                                        if (_dp4 instanceof EnumProperty && (_enumProp4 = (EnumProperty)_dp4).m_6215_(_value).isPresent()) {
                                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_enumProp4, (Comparable)((Object)((Enum)_enumProp4.m_6215_(_value).get()))), 3);
                                        }
                                        if (!(entity instanceof Player)) break block46;
                                        Player _plr = (Player)entity;
                                        if (_plr.m_150110_().f_35937_) break block42;
                                    }
                                    itemstack.m_41774_(1);
                                    break block42;
                                }
                                if (direction != Direction.SOUTH || !world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_247087_()) break block47;
                                world.m_7731_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0)), ((Block)RojiuramodModBlocks.OLD_PIPE.get()).m_49966_(), 3);
                                Direction _dir = direction;
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
                                String _value = "side";
                                _pos = BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0));
                                _bs = world.m_8055_(_pos);
                                _dp3 = _bs.m_60734_().m_49965_().m_61081_("shape");
                                if (_dp3 instanceof EnumProperty && (_enumProp3 = (EnumProperty)_dp3).m_6215_(_value).isPresent()) {
                                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_enumProp3, (Comparable)((Object)((Enum)_enumProp3.m_6215_(_value).get()))), 3);
                                }
                                if (!(entity instanceof Player)) break block48;
                                Player _plr = (Player)entity;
                                if (_plr.m_150110_().f_35937_) break block42;
                            }
                            itemstack.m_41774_(1);
                            break block42;
                        }
                        if (direction != Direction.WEST || !world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_247087_()) break block49;
                        world.m_7731_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.OLD_PIPE.get()).m_49966_(), 3);
                        Direction _dir = direction;
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
                        String _value = "side";
                        _pos = BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z);
                        _bs = world.m_8055_(_pos);
                        _dp2 = _bs.m_60734_().m_49965_().m_61081_("shape");
                        if (_dp2 instanceof EnumProperty && (_enumProp2 = (EnumProperty)_dp2).m_6215_(_value).isPresent()) {
                            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_enumProp2, (Comparable)((Object)((Enum)_enumProp2.m_6215_(_value).get()))), 3);
                        }
                        if (!(entity instanceof Player)) break block50;
                        Player _plr = (Player)entity;
                        if (_plr.m_150110_().f_35937_) break block42;
                    }
                    itemstack.m_41774_(1);
                    break block42;
                }
                if (direction != Direction.EAST || !world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_247087_()) break block42;
                world.m_7731_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z), ((Block)RojiuramodModBlocks.OLD_PIPE.get()).m_49966_(), 3);
                Direction _dir = direction;
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
                String _value = "side";
                _pos = BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z);
                _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("shape");
                if (property instanceof EnumProperty && (_enumProp = (EnumProperty)property).m_6215_(_value).isPresent()) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(_value).get()))), 3);
                }
                if (!(entity instanceof Player)) break block51;
                Player _plr = (Player)entity;
                if (_plr.m_150110_().f_35937_) break block42;
            }
            itemstack.m_41774_(1);
        }
    }
}

