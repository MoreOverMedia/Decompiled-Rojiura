/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class DoorMetalWhiteBlockDangFangKuaiBeiWanJiaPoPiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        block21: {
            block22: {
                int n;
                int n2;
                int n3;
                int n4;
                Property property;
                block20: {
                    block19: {
                        int n5;
                        int n6;
                        int n7;
                        int n8;
                        property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty) {
                            IntegerProperty _getip1 = (IntegerProperty)property;
                            n8 = (Integer)blockstate.m_61143_((Property)_getip1);
                        } else {
                            n8 = -1;
                        }
                        if (n8 == 0) break block19;
                        property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty) {
                            IntegerProperty _getip3 = (IntegerProperty)property;
                            n7 = (Integer)blockstate.m_61143_((Property)_getip3);
                        } else {
                            n7 = -1;
                        }
                        if (n7 == 2) break block19;
                        property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty) {
                            IntegerProperty _getip5 = (IntegerProperty)property;
                            n6 = (Integer)blockstate.m_61143_((Property)_getip5);
                        } else {
                            n6 = -1;
                        }
                        if (n6 == 4) break block19;
                        property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (property instanceof IntegerProperty) {
                            IntegerProperty _getip7 = (IntegerProperty)property;
                            n5 = (Integer)blockstate.m_61143_((Property)_getip7);
                        } else {
                            n5 = -1;
                        }
                        if (n5 != 6) break block20;
                    }
                    world.m_7731_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z), Blocks.f_50016_.m_49966_(), 3);
                    break block21;
                }
                property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip10 = (IntegerProperty)property;
                    n4 = (Integer)blockstate.m_61143_((Property)_getip10);
                } else {
                    n4 = -1;
                }
                if (n4 == 1) break block22;
                property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip12 = (IntegerProperty)property;
                    n3 = (Integer)blockstate.m_61143_((Property)_getip12);
                } else {
                    n3 = -1;
                }
                if (n3 == 3) break block22;
                property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip14 = (IntegerProperty)property;
                    n2 = (Integer)blockstate.m_61143_((Property)_getip14);
                } else {
                    n2 = -1;
                }
                if (n2 == 5) break block22;
                property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip16 = (IntegerProperty)property;
                    n = (Integer)blockstate.m_61143_((Property)_getip16);
                } else {
                    n = -1;
                }
                if (n != 7) break block21;
            }
            world.m_7731_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z), Blocks.f_50016_.m_49966_(), 3);
        }
    }
}

