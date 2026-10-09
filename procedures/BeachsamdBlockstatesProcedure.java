/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.tags.BlockTags
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModBlocks;

public class BeachsamdBlockstatesProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z) {
        int n;
        int n2;
        int n3;
        Property _getep39;
        int n4;
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != RojiuramodModBlocks.SEAWEED.get()) {
            int n5;
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("minecraft:slabs")))) {
                String string;
                Property property = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("type");
                if (property instanceof EnumProperty) {
                    EnumProperty _getep5 = (EnumProperty)property;
                    string = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getep5).toString();
                } else {
                    string = "";
                }
                if (string.equals("bottom")) {
                    int _value = 4;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos);
                    Property property2 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property2 instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property2;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:layers"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != RojiuramodModBlocks.BEACH_SAND_BLOCK.get()) {
                int n6;
                Property _pos = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_pos instanceof IntegerProperty) {
                    IntegerProperty _getip12 = (IntegerProperty)_pos;
                    n6 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip12);
                } else {
                    n6 = -1;
                }
                if (n6 == 7) {
                    int _value = 0;
                    BlockPos _pos2 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos2);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos2, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:layers")))) {
                int n7;
                Property _integerProp = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                if (_integerProp instanceof IntegerProperty) {
                    IntegerProperty _getip17 = (IntegerProperty)_integerProp;
                    n7 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip17);
                } else {
                    n7 = -1;
                }
                int _value = n7 + 1;
                BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp2 = (IntegerProperty)property;
                if (!_integerProp2.m_6908_().contains(_value)) return;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp2, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
            Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
            if (_value instanceof IntegerProperty) {
                IntegerProperty _getip20 = (IntegerProperty)_value;
                n5 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip20);
            } else {
                n5 = -1;
            }
            if (n5 >= 1 && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_49990_) {
                int n8;
                int n9;
                Property _pos = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
                if (_pos instanceof IntegerProperty) {
                    IntegerProperty _getip24 = (IntegerProperty)_pos;
                    n9 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip24);
                } else {
                    n9 = -1;
                }
                if (n9 == 8) {
                    int _value2 = 0;
                    BlockPos _pos3 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos3);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp = (IntegerProperty)property;
                    if (!_integerProp.m_6908_().contains(_value2)) return;
                    world.m_7731_(_pos3, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value2)), 3);
                    return;
                }
                Property _bs = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
                if (_bs instanceof IntegerProperty) {
                    IntegerProperty _getip27 = (IntegerProperty)_bs;
                    n8 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip27);
                } else {
                    n8 = -1;
                }
                int _value3 = n8;
                BlockPos _pos4 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                _bs = world.m_8055_(_pos4);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value3)) return;
                world.m_7731_(_pos4, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value3)), 3);
                return;
            }
            int _value2 = 0;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos);
            Property _integerProp = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(_integerProp instanceof IntegerProperty)) return;
            IntegerProperty _integerProp3 = (IntegerProperty)_integerProp;
            if (!_integerProp3.m_6908_().contains(_value2)) return;
            world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp3, (Comparable)Integer.valueOf(_value2)), 3);
            return;
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_() != RojiuramodModBlocks.SEAWEED.get()) return;
        Property _pos = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
        if (_pos instanceof IntegerProperty) {
            IntegerProperty _getip33 = (IntegerProperty)_pos;
            n4 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip33);
        } else {
            n4 = -1;
        }
        if (n4 >= 0) {
            int n10;
            _pos = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
            if (_pos instanceof IntegerProperty) {
                IntegerProperty _getip35 = (IntegerProperty)_pos;
                n10 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip35);
            } else {
                n10 = -1;
            }
            if (n10 <= 8) {
                int n11;
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("minecraft:slabs")))) {
                    String string;
                    Property _bs = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("type");
                    if (_bs instanceof EnumProperty) {
                        _getep39 = (EnumProperty)_bs;
                        string = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_(_getep39).toString();
                    } else {
                        string = "";
                    }
                    if (string.equals("bottom")) {
                        int _value = 4;
                        BlockPos _pos5 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs2 = world.m_8055_(_pos5);
                        Property property = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos5, (BlockState)_bs2.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:layers"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != RojiuramodModBlocks.BEACH_SAND_BLOCK.get()) {
                    int n12;
                    Property _pos5 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_pos5 instanceof IntegerProperty) {
                        IntegerProperty _getip46 = (IntegerProperty)_pos5;
                        n12 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip46);
                    } else {
                        n12 = -1;
                    }
                    if (n12 == 7) {
                        int _value = 0;
                        BlockPos _pos6 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos6);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value)) return;
                        world.m_7731_(_pos6, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                        return;
                    }
                }
                if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:layers")))) {
                    int n13;
                    Property _integerProp = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
                    if (_integerProp instanceof IntegerProperty) {
                        IntegerProperty _getip51 = (IntegerProperty)_integerProp;
                        n13 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip51);
                    } else {
                        n13 = -1;
                    }
                    int _value = n13 + 1;
                    BlockPos _pos7 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs = world.m_8055_(_pos7);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp4 = (IntegerProperty)property;
                    if (!_integerProp4.m_6908_().contains(_value)) return;
                    world.m_7731_(_pos7, (BlockState)_bs.m_61124_((Property)_integerProp4, (Comparable)Integer.valueOf(_value)), 3);
                    return;
                }
                Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip54 = (IntegerProperty)_value;
                    n11 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip54);
                } else {
                    n11 = -1;
                }
                if (n11 >= 1 && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_49990_) {
                    int n14;
                    int n15;
                    Property _pos7 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
                    if (_pos7 instanceof IntegerProperty) {
                        IntegerProperty _getip58 = (IntegerProperty)_pos7;
                        n15 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip58);
                    } else {
                        n15 = -1;
                    }
                    if (n15 == 8) {
                        int _value4 = 0;
                        BlockPos _pos8 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs = world.m_8055_(_pos8);
                        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                        if (!(property instanceof IntegerProperty)) return;
                        IntegerProperty _integerProp = (IntegerProperty)property;
                        if (!_integerProp.m_6908_().contains(_value4)) return;
                        world.m_7731_(_pos8, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
                        return;
                    }
                    Property _bs = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
                    if (_bs instanceof IntegerProperty) {
                        IntegerProperty _getip61 = (IntegerProperty)_bs;
                        n14 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip61);
                    } else {
                        n14 = -1;
                    }
                    int _value5 = n14;
                    BlockPos _pos9 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs = world.m_8055_(_pos9);
                    Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                    if (!(property instanceof IntegerProperty)) return;
                    IntegerProperty _integerProp6 = (IntegerProperty)property;
                    if (!_integerProp6.m_6908_().contains(_value5)) return;
                    world.m_7731_(_pos9, (BlockState)_bs.m_61124_((Property)_integerProp6, (Comparable)Integer.valueOf(_value5)), 3);
                    return;
                }
                int _value3 = 0;
                BlockPos _pos10 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs3 = world.m_8055_(_pos10);
                Property _integerProp6 = _bs3.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(_integerProp6 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp5 = (IntegerProperty)_integerProp6;
                if (!_integerProp5.m_6908_().contains(_value3)) return;
                world.m_7731_(_pos10, (BlockState)_bs3.m_61124_((Property)_integerProp5, (Comparable)Integer.valueOf(_value3)), 3);
                return;
            }
        }
        if ((_getep39 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
            IntegerProperty _getip65 = (IntegerProperty)_getep39;
            n3 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip65);
        } else {
            n3 = -1;
        }
        if (n3 < 9) return;
        _getep39 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
        if (_getep39 instanceof IntegerProperty) {
            IntegerProperty _getip67 = (IntegerProperty)_getep39;
            n2 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)z)).m_61143_((Property)_getip67);
        } else {
            n2 = -1;
        }
        if (n2 > 17) return;
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("minecraft:slabs")))) {
            String string;
            Property _getip46 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("type");
            if (_getip46 instanceof EnumProperty) {
                EnumProperty _getep71 = (EnumProperty)_getip46;
                string = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getep71).toString();
            } else {
                string = "";
            }
            if (string.equals("bottom")) {
                int _value = 13;
                BlockPos _pos11 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos11);
                Property _bs3 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(_bs3 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)_bs3;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos11, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:layers"))) && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != RojiuramodModBlocks.BEACH_SAND_BLOCK.get()) {
            int n16;
            Property _pos11 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
            if (_pos11 instanceof IntegerProperty) {
                IntegerProperty _getip78 = (IntegerProperty)_pos11;
                n16 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip78);
            } else {
                n16 = -1;
            }
            if (n16 == 7) {
                int _value = 9;
                BlockPos _pos12 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos12);
                Property _integerProp5 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(_integerProp5 instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)_integerProp5;
                if (!_integerProp.m_6908_().contains(_value)) return;
                world.m_7731_(_pos12, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
                return;
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_204336_(BlockTags.create((ResourceLocation)new ResourceLocation("rojiuramod:layers")))) {
            int n17;
            Property _integerProp = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate");
            if (_integerProp instanceof IntegerProperty) {
                IntegerProperty _getip83 = (IntegerProperty)_integerProp;
                n17 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip83);
            } else {
                n17 = -1;
            }
            int _value = n17 + 10;
            BlockPos _pos13 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs = world.m_8055_(_pos13);
            Property _integerProp6 = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(_integerProp6 instanceof IntegerProperty)) return;
            IntegerProperty _integerProp7 = (IntegerProperty)_integerProp6;
            if (!_integerProp7.m_6908_().contains(_value)) return;
            world.m_7731_(_pos13, (BlockState)_bs.m_61124_((Property)_integerProp7, (Comparable)Integer.valueOf(_value)), 3);
            return;
        }
        Property _value = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
        if (_value instanceof IntegerProperty) {
            IntegerProperty _getip86 = (IntegerProperty)_value;
            n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip86);
        } else {
            n = -1;
        }
        if (n >= 1 && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() != Blocks.f_49990_) {
            int n18;
            int n19;
            Property _pos13 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
            if (_pos13 instanceof IntegerProperty) {
                IntegerProperty _getip90 = (IntegerProperty)_pos13;
                n19 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip90);
            } else {
                n19 = -1;
            }
            if (n19 == 8) {
                int _value6 = 9;
                BlockPos _pos14 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                BlockState _bs = world.m_8055_(_pos14);
                Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
                if (!(property instanceof IntegerProperty)) return;
                IntegerProperty _integerProp = (IntegerProperty)property;
                if (!_integerProp.m_6908_().contains(_value6)) return;
                world.m_7731_(_pos14, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value6)), 3);
                return;
            }
            Property _bs = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("layers");
            if (_bs instanceof IntegerProperty) {
                IntegerProperty _getip93 = (IntegerProperty)_bs;
                n18 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip93);
            } else {
                n18 = -1;
            }
            int _value7 = n18 + 9;
            BlockPos _pos15 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos15);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (!(property instanceof IntegerProperty)) return;
            IntegerProperty _integerProp = (IntegerProperty)property;
            if (!_integerProp.m_6908_().contains(_value7)) return;
            world.m_7731_(_pos15, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value7)), 3);
            return;
        }
        int _value4 = 9;
        BlockPos _pos16 = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs = world.m_8055_(_pos16);
        Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
        if (!(property instanceof IntegerProperty)) return;
        IntegerProperty _integerProp = (IntegerProperty)property;
        if (!_integerProp.m_6908_().contains(_value4)) return;
        world.m_7731_(_pos16, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value4)), 3);
    }
}

