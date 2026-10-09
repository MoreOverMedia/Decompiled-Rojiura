/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import rojiuramod.init.RojiuramodModItems;

public class AsphaltLayerWetDangFangKuaiBeiWanJiaPoPiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
        block34: {
            int n;
            ServerLevel _level;
            block35: {
                int n2;
                boolean bl;
                if (entity == null) {
                    return;
                }
                if (entity instanceof Player) {
                    Player _plr = (Player)entity;
                    bl = _plr.m_150110_().f_35937_;
                } else {
                    bl = false;
                }
                if (bl) break block34;
                Property property = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (property instanceof IntegerProperty) {
                    IntegerProperty _getip2 = (IntegerProperty)property;
                    n2 = (Integer)blockstate.m_61143_((Property)_getip2);
                } else {
                    n2 = -1;
                }
                if (n2 != 1) break block35;
                if (!(world instanceof ServerLevel)) break block34;
                _level = (ServerLevel)world;
                ItemEntity entityToSpawn = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ASPHALT_LAYER_WET.get()));
                entityToSpawn.m_32010_(10);
                _level.m_7967_((Entity)entityToSpawn);
                break block34;
            }
            _level = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
            if (_level instanceof IntegerProperty) {
                IntegerProperty _getip5 = (IntegerProperty)_level;
                n = (Integer)blockstate.m_61143_((Property)_getip5);
            } else {
                n = -1;
            }
            if (n == 2) {
                for (int index0 = 0; index0 < 2; ++index0) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level2 = (ServerLevel)world;
                    ItemEntity entityToSpawn = new ItemEntity((Level)_level2, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ASPHALT_LAYER_WET.get()));
                    entityToSpawn.m_32010_(10);
                    _level2.m_7967_((Entity)entityToSpawn);
                }
            } else {
                int n3;
                Property index0 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                if (index0 instanceof IntegerProperty) {
                    IntegerProperty _getip8 = (IntegerProperty)index0;
                    n3 = (Integer)blockstate.m_61143_((Property)_getip8);
                } else {
                    n3 = -1;
                }
                if (n3 == 3) {
                    for (int index1 = 0; index1 < 3; ++index1) {
                        if (!(world instanceof ServerLevel)) continue;
                        ServerLevel _level3 = (ServerLevel)world;
                        ItemEntity entityToSpawn = new ItemEntity((Level)_level3, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ASPHALT_LAYER_WET.get()));
                        entityToSpawn.m_32010_(10);
                        _level3.m_7967_((Entity)entityToSpawn);
                    }
                } else {
                    int n4;
                    Property index1 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                    if (index1 instanceof IntegerProperty) {
                        IntegerProperty _getip11 = (IntegerProperty)index1;
                        n4 = (Integer)blockstate.m_61143_((Property)_getip11);
                    } else {
                        n4 = -1;
                    }
                    if (n4 == 4) {
                        for (int index2 = 0; index2 < 4; ++index2) {
                            if (!(world instanceof ServerLevel)) continue;
                            ServerLevel _level4 = (ServerLevel)world;
                            ItemEntity entityToSpawn = new ItemEntity((Level)_level4, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ASPHALT_LAYER_WET.get()));
                            entityToSpawn.m_32010_(10);
                            _level4.m_7967_((Entity)entityToSpawn);
                        }
                    } else {
                        int n5;
                        Property index2 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                        if (index2 instanceof IntegerProperty) {
                            IntegerProperty _getip14 = (IntegerProperty)index2;
                            n5 = (Integer)blockstate.m_61143_((Property)_getip14);
                        } else {
                            n5 = -1;
                        }
                        if (n5 == 5) {
                            for (int index3 = 0; index3 < 5; ++index3) {
                                if (!(world instanceof ServerLevel)) continue;
                                ServerLevel _level5 = (ServerLevel)world;
                                ItemEntity entityToSpawn = new ItemEntity((Level)_level5, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ASPHALT_LAYER_WET.get()));
                                entityToSpawn.m_32010_(10);
                                _level5.m_7967_((Entity)entityToSpawn);
                            }
                        } else {
                            int n6;
                            Property index3 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                            if (index3 instanceof IntegerProperty) {
                                IntegerProperty _getip17 = (IntegerProperty)index3;
                                n6 = (Integer)blockstate.m_61143_((Property)_getip17);
                            } else {
                                n6 = -1;
                            }
                            if (n6 == 6) {
                                for (int index4 = 0; index4 < 6; ++index4) {
                                    if (!(world instanceof ServerLevel)) continue;
                                    ServerLevel _level6 = (ServerLevel)world;
                                    ItemEntity entityToSpawn = new ItemEntity((Level)_level6, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ASPHALT_LAYER_WET.get()));
                                    entityToSpawn.m_32010_(10);
                                    _level6.m_7967_((Entity)entityToSpawn);
                                }
                            } else {
                                int n7;
                                Property index4 = blockstate.m_60734_().m_49965_().m_61081_("blockstate");
                                if (index4 instanceof IntegerProperty) {
                                    IntegerProperty _getip20 = (IntegerProperty)index4;
                                    n7 = (Integer)blockstate.m_61143_((Property)_getip20);
                                } else {
                                    n7 = -1;
                                }
                                if (n7 == 7) {
                                    for (int index5 = 0; index5 < 7; ++index5) {
                                        if (!(world instanceof ServerLevel)) continue;
                                        ServerLevel _level7 = (ServerLevel)world;
                                        ItemEntity entityToSpawn = new ItemEntity((Level)_level7, x, y, z, new ItemStack((ItemLike)RojiuramodModItems.ASPHALT_LAYER_WET.get()));
                                        entityToSpawn.m_32010_(10);
                                        _level7.m_7967_((Entity)entityToSpawn);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

