/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraftforge.registries.ForgeRegistries
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;
import rojiuramod.init.RojiuramodModBlocks;

public class DoorMetalWhiteBlockDangYouJiFangKuaiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        block77: {
            int n;
            IntegerProperty _integerProp;
            int n2;
            Property _bs;
            block82: {
                int n3;
                int n4;
                Property _value;
                block81: {
                    int n5;
                    IntegerProperty _integerProp2;
                    int n6;
                    Property _bs2;
                    block80: {
                        int n7;
                        int n8;
                        block79: {
                            int n9;
                            IntegerProperty _integerProp3;
                            int n10;
                            Property _bs3;
                            block78: {
                                int n11;
                                int n12;
                                block76: {
                                    int n13;
                                    IntegerProperty _integerProp4;
                                    int n14;
                                    Property property;
                                    block75: {
                                        int n15;
                                        int n16;
                                        Property property2;
                                        block73: {
                                            block74: {
                                                int n17;
                                                int n18;
                                                int n19;
                                                int n20;
                                                block72: {
                                                    block71: {
                                                        int n21;
                                                        int n22;
                                                        int n23;
                                                        int n24;
                                                        property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                        if (property2 instanceof IntegerProperty) {
                                                            IntegerProperty _getip1 = (IntegerProperty)property2;
                                                            n24 = (Integer)blockstate.m_61143_((Property)_getip1);
                                                        } else {
                                                            n24 = -1;
                                                        }
                                                        if (n24 == 0) break block71;
                                                        property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                        if (property2 instanceof IntegerProperty) {
                                                            IntegerProperty _getip3 = (IntegerProperty)property2;
                                                            n23 = (Integer)blockstate.m_61143_((Property)_getip3);
                                                        } else {
                                                            n23 = -1;
                                                        }
                                                        if (n23 == 1) break block71;
                                                        property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                        if (property2 instanceof IntegerProperty) {
                                                            IntegerProperty _getip5 = (IntegerProperty)property2;
                                                            n22 = (Integer)blockstate.m_61143_((Property)_getip5);
                                                        } else {
                                                            n22 = -1;
                                                        }
                                                        if (n22 == 4) break block71;
                                                        property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                        if (property2 instanceof IntegerProperty) {
                                                            IntegerProperty _getip7 = (IntegerProperty)property2;
                                                            n21 = (Integer)blockstate.m_61143_((Property)_getip7);
                                                        } else {
                                                            n21 = -1;
                                                        }
                                                        if (n21 != 5) break block72;
                                                    }
                                                    if (blockstate.m_60734_() == RojiuramodModBlocks.ALM_DOOR_BLOCK.get() || blockstate.m_60734_() == RojiuramodModBlocks.OLD_DOOR_BLOCK.get() || blockstate.m_60734_() == RojiuramodModBlocks.OLD_DOOR_TALL_BLOCK.get()) {
                                                        if (world instanceof Level) {
                                                            ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                        }
                                                    } else if (world instanceof Level) {
                                                        ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.open")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                    }
                                                    break block73;
                                                }
                                                property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                if (property2 instanceof IntegerProperty) {
                                                    IntegerProperty _getip17 = (IntegerProperty)property2;
                                                    n20 = (Integer)blockstate.m_61143_((Property)_getip17);
                                                } else {
                                                    n20 = -1;
                                                }
                                                if (n20 == 2) break block74;
                                                property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                if (property2 instanceof IntegerProperty) {
                                                    IntegerProperty _getip19 = (IntegerProperty)property2;
                                                    n19 = (Integer)blockstate.m_61143_((Property)_getip19);
                                                } else {
                                                    n19 = -1;
                                                }
                                                if (n19 == 3) break block74;
                                                property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                if (property2 instanceof IntegerProperty) {
                                                    IntegerProperty _getip21 = (IntegerProperty)property2;
                                                    n18 = (Integer)blockstate.m_61143_((Property)_getip21);
                                                } else {
                                                    n18 = -1;
                                                }
                                                if (n18 == 6) break block74;
                                                property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                                if (property2 instanceof IntegerProperty) {
                                                    IntegerProperty _getip23 = (IntegerProperty)property2;
                                                    n17 = (Integer)blockstate.m_61143_((Property)_getip23);
                                                } else {
                                                    n17 = -1;
                                                }
                                                if (n17 != 7) break block73;
                                            }
                                            if (blockstate.m_60734_() == RojiuramodModBlocks.ALM_DOOR_BLOCK.get() || blockstate.m_60734_() == RojiuramodModBlocks.OLD_DOOR_BLOCK.get() || blockstate.m_60734_() == RojiuramodModBlocks.OLD_DOOR_TALL_BLOCK.get()) {
                                                if (world instanceof Level) {
                                                    ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                }
                                            } else if (world instanceof Level) {
                                                ((Level)world).m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_door.close")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                            }
                                        }
                                        if ((property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                                            IntegerProperty _getip33 = (IntegerProperty)property2;
                                            n16 = (Integer)blockstate.m_61143_((Property)_getip33);
                                        } else {
                                            n16 = -1;
                                        }
                                        if (n16 == 0) break block75;
                                        property2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                        if (property2 instanceof IntegerProperty) {
                                            IntegerProperty _getip35 = (IntegerProperty)property2;
                                            n15 = (Integer)blockstate.m_61143_((Property)_getip35);
                                        } else {
                                            n15 = -1;
                                        }
                                        if (n15 != 4) break block76;
                                    }
                                    if ((property = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                                        IntegerProperty _getip37 = (IntegerProperty)property;
                                        n14 = (Integer)blockstate.m_61143_((Property)_getip37);
                                    } else {
                                        n14 = -1;
                                    }
                                    int _value2 = n14 + 2;
                                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                                    BlockState _bs4 = world.m_8055_(_pos);
                                    Property property3 = _bs4.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property3 instanceof IntegerProperty && (_integerProp4 = (IntegerProperty)property3).m_6908_().contains(_value2)) {
                                        world.m_7731_(_pos, (BlockState)_bs4.m_61124_((Property)_integerProp4, (Comparable)Integer.valueOf(_value2)), 3);
                                    }
                                    if ((_bs4 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                                        IntegerProperty _getip40 = (IntegerProperty)_bs4;
                                        n13 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_61143_((Property)_getip40);
                                    } else {
                                        n13 = -1;
                                    }
                                    _value2 = n13 + 2;
                                    _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                                    _bs4 = world.m_8055_(_pos);
                                    property3 = _bs4.m_60734_().m_49965_().m_61081_("blockstate");
                                    if (property3 instanceof IntegerProperty && (_integerProp4 = (IntegerProperty)property3).m_6908_().contains(_value2)) {
                                        world.m_7731_(_pos, (BlockState)_bs4.m_61124_((Property)_integerProp4, (Comparable)Integer.valueOf(_value2)), 3);
                                    }
                                    break block77;
                                }
                                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value instanceof IntegerProperty) {
                                    IntegerProperty _getip43 = (IntegerProperty)_value;
                                    n12 = (Integer)blockstate.m_61143_((Property)_getip43);
                                } else {
                                    n12 = -1;
                                }
                                if (n12 == 2) break block78;
                                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                if (_value instanceof IntegerProperty) {
                                    IntegerProperty _getip45 = (IntegerProperty)_value;
                                    n11 = (Integer)blockstate.m_61143_((Property)_getip45);
                                } else {
                                    n11 = -1;
                                }
                                if (n11 != 6) break block79;
                            }
                            if ((_bs3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                                IntegerProperty _getip47 = (IntegerProperty)_bs3;
                                n10 = (Integer)blockstate.m_61143_((Property)_getip47);
                            } else {
                                n10 = -1;
                            }
                            int _value3 = n10 - 2;
                            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                            _bs3 = world.m_8055_(_pos);
                            Property property = _bs3.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property instanceof IntegerProperty && (_integerProp3 = (IntegerProperty)property).m_6908_().contains(_value3)) {
                                world.m_7731_(_pos, (BlockState)_bs3.m_61124_((Property)_integerProp3, (Comparable)Integer.valueOf(_value3)), 3);
                            }
                            if ((_bs3 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                                IntegerProperty _getip50 = (IntegerProperty)_bs3;
                                n9 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_61143_((Property)_getip50);
                            } else {
                                n9 = -1;
                            }
                            _value3 = n9 - 2;
                            _pos = BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z);
                            _bs3 = world.m_8055_(_pos);
                            property = _bs3.m_60734_().m_49965_().m_61081_("blockstate");
                            if (property instanceof IntegerProperty && (_integerProp3 = (IntegerProperty)property).m_6908_().contains(_value3)) {
                                world.m_7731_(_pos, (BlockState)_bs3.m_61124_((Property)_integerProp3, (Comparable)Integer.valueOf(_value3)), 3);
                            }
                            break block77;
                        }
                        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value instanceof IntegerProperty) {
                            IntegerProperty _getip53 = (IntegerProperty)_value;
                            n8 = (Integer)blockstate.m_61143_((Property)_getip53);
                        } else {
                            n8 = -1;
                        }
                        if (n8 == 1) break block80;
                        _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (_value instanceof IntegerProperty) {
                            IntegerProperty _getip55 = (IntegerProperty)_value;
                            n7 = (Integer)blockstate.m_61143_((Property)_getip55);
                        } else {
                            n7 = -1;
                        }
                        if (n7 != 5) break block81;
                    }
                    if ((_bs2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                        IntegerProperty _getip57 = (IntegerProperty)_bs2;
                        n6 = (Integer)blockstate.m_61143_((Property)_getip57);
                    } else {
                        n6 = -1;
                    }
                    int _value4 = n6 + 2;
                    BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    _bs2 = world.m_8055_(_pos);
                    Property property = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp2 = (IntegerProperty)property).m_6908_().contains(_value4)) {
                        world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp2, (Comparable)Integer.valueOf(_value4)), 3);
                    }
                    if ((_bs2 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                        IntegerProperty _getip60 = (IntegerProperty)_bs2;
                        n5 = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip60);
                    } else {
                        n5 = -1;
                    }
                    _value4 = n5 + 2;
                    _pos = BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z);
                    _bs2 = world.m_8055_(_pos);
                    property = _bs2.m_60734_().m_49965_().m_61081_("blockstate");
                    if (property instanceof IntegerProperty && (_integerProp2 = (IntegerProperty)property).m_6908_().contains(_value4)) {
                        world.m_7731_(_pos, (BlockState)_bs2.m_61124_((Property)_integerProp2, (Comparable)Integer.valueOf(_value4)), 3);
                    }
                    break block77;
                }
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip63 = (IntegerProperty)_value;
                    n4 = (Integer)blockstate.m_61143_((Property)_getip63);
                } else {
                    n4 = -1;
                }
                if (n4 == 3) break block82;
                _value = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (_value instanceof IntegerProperty) {
                    IntegerProperty _getip65 = (IntegerProperty)_value;
                    n3 = (Integer)blockstate.m_61143_((Property)_getip65);
                } else {
                    n3 = -1;
                }
                if (n3 != 7) break block77;
            }
            if ((_bs = blockstate.m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip67 = (IntegerProperty)_bs;
                n2 = (Integer)blockstate.m_61143_((Property)_getip67);
            } else {
                n2 = -1;
            }
            int _value = n2 - 2;
            BlockPos _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            Property property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
            if ((_bs = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("blockstate")) instanceof IntegerProperty) {
                IntegerProperty _getip70 = (IntegerProperty)_bs;
                n = (Integer)world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getip70);
            } else {
                n = -1;
            }
            _value = n - 2;
            _pos = BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("blockstate");
            if (property instanceof IntegerProperty && (_integerProp = (IntegerProperty)property).m_6908_().contains(_value)) {
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_integerProp, (Comparable)Integer.valueOf(_value)), 3);
            }
        }
    }
}

