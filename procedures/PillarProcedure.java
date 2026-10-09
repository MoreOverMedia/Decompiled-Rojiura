/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Direction$Axis
 *  net.minecraft.core.Direction$AxisDirection
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.tags.BlockTags
 *  net.minecraft.world.level.LevelAccessor
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
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class PillarProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                IntegerProperty _integerProp;
                int _value = 27;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            } else {
                IntegerProperty _integerProp;
                int _value = 13;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            }
        } else if (!(world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))))) {
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                IntegerProperty _integerProp;
                int _value = 14;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            } else {
                IntegerProperty _integerProp;
                int _value = 0;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                }
            }
        } else if (new Object(){

            public Direction getDirection(BlockState _bs) {
                EnumProperty _ep;
                Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                if (_prop instanceof DirectionProperty) {
                    DirectionProperty _dp = (DirectionProperty)_prop;
                    return (Direction)_bs.m_61143_((Property)_dp);
                }
                _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection(blockstate) == Direction.NORTH) {
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 23;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 24;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 25;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 26;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 12;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 19;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 5;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 20;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 6;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 21;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 7;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 22;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 18;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 17;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 15;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 1;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 16;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 2;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            }
        } else if (new Object(){

            public Direction getDirection(BlockState _bs) {
                EnumProperty _ep;
                Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                if (_prop instanceof DirectionProperty) {
                    DirectionProperty _dp = (DirectionProperty)_prop;
                    return (Direction)_bs.m_61143_((Property)_dp);
                }
                _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection(blockstate) == Direction.SOUTH) {
            if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 23;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 24;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 25;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 26;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 12;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 19;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 5;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 20;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 6;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 21;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 7;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 22;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 18;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 17;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 15;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 1;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 16;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 2;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            }
        } else if (new Object(){

            public Direction getDirection(BlockState _bs) {
                EnumProperty _ep;
                Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                if (_prop instanceof DirectionProperty) {
                    DirectionProperty _dp = (DirectionProperty)_prop;
                    return (Direction)_bs.m_61143_((Property)_dp);
                }
                _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection(blockstate) == Direction.WEST) {
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 23;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 24;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 25;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 26;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 12;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 19;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 5;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 20;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 6;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 21;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 7;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 22;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 18;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 17;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 15;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 1;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 16;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 2;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            }
        } else if (new Object(){

            public Direction getDirection(BlockState _bs) {
                EnumProperty _ep;
                Property _prop = _bs.m_60734_().m_49965_().m_61081_("facing");
                if (_prop instanceof DirectionProperty) {
                    DirectionProperty _dp = (DirectionProperty)_prop;
                    return (Direction)_bs.m_61143_((Property)_dp);
                }
                _prop = _bs.m_60734_().m_49965_().m_61081_("axis");
                return _prop instanceof EnumProperty && (_ep = (EnumProperty)_prop).m_6908_().toArray()[0] instanceof Direction.Axis ? Direction.m_122387_((Direction.Axis)((Direction.Axis)_bs.m_61143_((Property)_ep)), (Direction.AxisDirection)Direction.AxisDirection.POSITIVE) : Direction.NORTH;
            }
        }.getDirection(blockstate) == Direction.EAST) {
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 23;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 9;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 24;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 10;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 25;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 11;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 26;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 12;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 19;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 5;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 20;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 6;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 21;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 7;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 22;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 8;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 18;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 17;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 3;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 15;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 1;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            } else if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar"))) || world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:pillar")))) {
                    IntegerProperty _integerProp;
                    int _value = 16;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                } else {
                    IntegerProperty _integerProp;
                    int _value = 2;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                        world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    }
                }
            }
        }
    }
}

