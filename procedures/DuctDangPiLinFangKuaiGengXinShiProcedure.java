/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Direction$Axis
 *  net.minecraft.core.Direction$AxisDirection
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.BooleanProperty
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.Property
 */
package rojiuramod.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class DuctDangPiLinFangKuaiGengXinShiProcedure {
    /*
     * Enabled aggressive block sorting
     */
    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
        String string;
        Property _getep51;
        String string2;
        Property _getep36;
        String string3;
        BooleanProperty _booleanProp;
        Property property;
        BlockState _bs;
        BlockPos _pos;
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == blockstate.m_60734_()) {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("north");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
            }
        } else {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("north");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(false)), 3);
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == blockstate.m_60734_()) {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("south");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
            }
        } else {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("south");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(false)), 3);
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("west");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
            }
        } else {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("west");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(false)), 3);
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("east");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
            }
        } else {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("east");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(false)), 3);
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("up");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
            }
        } else {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("up");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(false)), 3);
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("down");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(true)), 3);
            }
        } else {
            _pos = BlockPos.m_274561_((double)x, (double)y, (double)z);
            _bs = world.m_8055_(_pos);
            property = _bs.m_60734_().m_49965_().m_61081_("down");
            if (property instanceof BooleanProperty) {
                _booleanProp = (BooleanProperty)property;
                world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_booleanProp, (Comparable)Boolean.valueOf(false)), 3);
            }
        }
        property = blockstate.m_60734_().m_49965_().m_61081_("shape");
        if (property instanceof EnumProperty) {
            EnumProperty _getep31 = (EnumProperty)property;
            string3 = blockstate.m_61143_((Property)_getep31).toString();
        } else {
            string3 = "";
        }
        if (string3.equals("DOWN")) {
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
                String string4;
                Property property2 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("shape");
                if (property2 instanceof EnumProperty) {
                    _getep36 = (EnumProperty)property2;
                    string4 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_61143_(_getep36).toString();
                } else {
                    string4 = "";
                }
                if (string4.equals("SIDE")) {
                    String string5 = "up";
                    BlockPos _pos2 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs2 = world.m_8055_(_pos2);
                    Property property3 = _bs2.m_60734_().m_49965_().m_61081_("inner_outer");
                    if (!(property3 instanceof EnumProperty)) return;
                    EnumProperty _enumProp = (EnumProperty)property3;
                    if (!_enumProp.m_6215_(string5).isPresent()) return;
                    world.m_7731_(_pos2, (BlockState)_bs2.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string5).get()))), 3);
                    return;
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
                String string6;
                Property property4 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("shape");
                if (property4 instanceof EnumProperty) {
                    EnumProperty _getep42 = (EnumProperty)property4;
                    string6 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getep42).toString();
                } else {
                    string6 = "";
                }
                if (string6.equals("SIDE")) {
                    String string7 = "down";
                    BlockPos _pos3 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs3 = world.m_8055_(_pos3);
                    Property property5 = _bs3.m_60734_().m_49965_().m_61081_("inner_outer");
                    if (!(property5 instanceof EnumProperty)) return;
                    EnumProperty _enumProp = (EnumProperty)property5;
                    if (!_enumProp.m_6215_(string7).isPresent()) return;
                    world.m_7731_(_pos3, (BlockState)_bs3.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string7).get()))), 3);
                    return;
                }
            }
            String string8 = "no";
            BlockPos _pos4 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs4 = world.m_8055_(_pos4);
            Property property6 = _bs4.m_60734_().m_49965_().m_61081_("inner_outer");
            if (!(property6 instanceof EnumProperty)) return;
            EnumProperty _enumProp = (EnumProperty)property6;
            if (!_enumProp.m_6215_(string8).isPresent()) return;
            world.m_7731_(_pos4, (BlockState)_bs4.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string8).get()))), 3);
            return;
        }
        _getep36 = blockstate.m_60734_().m_49965_().m_61081_("shape");
        if (_getep36 instanceof EnumProperty) {
            EnumProperty _getep46 = (EnumProperty)_getep36;
            string2 = blockstate.m_61143_((Property)_getep46).toString();
        } else {
            string2 = "";
        }
        if (string2.equals("UP")) {
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
                String string9;
                Property property7 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("shape");
                if (property7 instanceof EnumProperty) {
                    _getep51 = (EnumProperty)property7;
                    string9 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_61143_(_getep51).toString();
                } else {
                    string9 = "";
                }
                if (string9.equals("SIDE")) {
                    String string10 = "up";
                    BlockPos _pos5 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs5 = world.m_8055_(_pos5);
                    Property property8 = _bs5.m_60734_().m_49965_().m_61081_("inner_outer");
                    if (!(property8 instanceof EnumProperty)) return;
                    EnumProperty _enumProp = (EnumProperty)property8;
                    if (!_enumProp.m_6215_(string10).isPresent()) return;
                    world.m_7731_(_pos5, (BlockState)_bs5.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string10).get()))), 3);
                    return;
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
                String string11;
                Property property9 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("shape");
                if (property9 instanceof EnumProperty) {
                    EnumProperty _getep57 = (EnumProperty)property9;
                    string11 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getep57).toString();
                } else {
                    string11 = "";
                }
                if (string11.equals("SIDE")) {
                    String string12 = "down";
                    BlockPos _pos6 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs6 = world.m_8055_(_pos6);
                    Property property10 = _bs6.m_60734_().m_49965_().m_61081_("inner_outer");
                    if (!(property10 instanceof EnumProperty)) return;
                    EnumProperty _enumProp = (EnumProperty)property10;
                    if (!_enumProp.m_6215_(string12).isPresent()) return;
                    world.m_7731_(_pos6, (BlockState)_bs6.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string12).get()))), 3);
                    return;
                }
            }
            String string13 = "no";
            BlockPos _pos7 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs7 = world.m_8055_(_pos7);
            Property property11 = _bs7.m_60734_().m_49965_().m_61081_("inner_outer");
            if (!(property11 instanceof EnumProperty)) return;
            EnumProperty _enumProp = (EnumProperty)property11;
            if (!_enumProp.m_6215_(string13).isPresent()) return;
            world.m_7731_(_pos7, (BlockState)_bs7.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string13).get()))), 3);
            return;
        }
        _getep51 = blockstate.m_60734_().m_49965_().m_61081_("shape");
        if (_getep51 instanceof EnumProperty) {
            EnumProperty _getep61 = (EnumProperty)_getep51;
            string = blockstate.m_61143_((Property)_getep61).toString();
        } else {
            string = "";
        }
        if (!string.equals("SIDE")) return;
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
            String string14;
            Property property12 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_60734_().m_49965_().m_61081_("shape");
            if (property12 instanceof EnumProperty) {
                EnumProperty _getep66 = (EnumProperty)property12;
                string14 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y + 1.0), (double)z)).m_61143_((Property)_getep66).toString();
            } else {
                string14 = "";
            }
            if (string14.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_() == blockstate.m_60734_()) {
                String string15;
                Property property13 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_60734_().m_49965_().m_61081_("shape");
                if (property13 instanceof EnumProperty) {
                    EnumProperty _getep71 = (EnumProperty)property13;
                    string15 = world.m_8055_(BlockPos.m_274561_((double)x, (double)(y - 1.0), (double)z)).m_61143_((Property)_getep71).toString();
                } else {
                    string15 = "";
                }
                if (string15.equals("SIDE")) {
                    String string16 = "no";
                    BlockPos _pos8 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs8 = world.m_8055_(_pos8);
                    Property property14 = _bs8.m_60734_().m_49965_().m_61081_("inner_outer");
                    if (!(property14 instanceof EnumProperty)) return;
                    EnumProperty _enumProp = (EnumProperty)property14;
                    if (!_enumProp.m_6215_(string16).isPresent()) return;
                    world.m_7731_(_pos8, (BlockState)_bs8.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string16).get()))), 3);
                    return;
                }
            }
        }
        if (new Object(){

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
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == blockstate.m_60734_()) {
                String string17;
                Property property15 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("shape");
                if (property15 instanceof EnumProperty) {
                    EnumProperty enumProperty = (EnumProperty)property15;
                    string17 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)enumProperty).toString();
                } else {
                    string17 = "";
                }
                if (string17.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                    String string18;
                    Property property16 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                    if (property16 instanceof EnumProperty) {
                        EnumProperty _getep85 = (EnumProperty)property16;
                        string18 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getep85).toString();
                    } else {
                        string18 = "";
                    }
                    if (string18.equals("SIDE")) {
                        String string19 = "up";
                        BlockPos _pos9 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs9 = world.m_8055_(_pos9);
                        Property property17 = _bs9.m_60734_().m_49965_().m_61081_("inner_outer");
                        if (!(property17 instanceof EnumProperty)) return;
                        EnumProperty _enumProp = (EnumProperty)property17;
                        if (!_enumProp.m_6215_(string19).isPresent()) return;
                        world.m_7731_(_pos9, (BlockState)_bs9.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string19).get()))), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == blockstate.m_60734_()) {
                String string20;
                Property property18 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("shape");
                if (property18 instanceof EnumProperty) {
                    EnumProperty _getep91 = (EnumProperty)property18;
                    string20 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getep91).toString();
                } else {
                    string20 = "";
                }
                if (string20.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                    String string21;
                    Property property19 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                    if (property19 instanceof EnumProperty) {
                        EnumProperty _getep96 = (EnumProperty)property19;
                        string21 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getep96).toString();
                    } else {
                        string21 = "";
                    }
                    if (string21.equals("SIDE")) {
                        String string22 = "down";
                        BlockPos _pos10 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs10 = world.m_8055_(_pos10);
                        Property property20 = _bs10.m_60734_().m_49965_().m_61081_("inner_outer");
                        if (!(property20 instanceof EnumProperty)) return;
                        EnumProperty _enumProp = (EnumProperty)property20;
                        if (!_enumProp.m_6215_(string22).isPresent()) return;
                        world.m_7731_(_pos10, (BlockState)_bs10.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string22).get()))), 3);
                        return;
                    }
                }
            }
            String string23 = "no";
            BlockPos _pos11 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs11 = world.m_8055_(_pos11);
            Property property21 = _bs11.m_60734_().m_49965_().m_61081_("inner_outer");
            if (!(property21 instanceof EnumProperty)) return;
            EnumProperty _enumProp = (EnumProperty)property21;
            if (!_enumProp.m_6215_(string23).isPresent()) return;
            world.m_7731_(_pos11, (BlockState)_bs11.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string23).get()))), 3);
            return;
        }
        if (new Object(){

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
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == blockstate.m_60734_()) {
                String string24;
                Property property22 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("shape");
                if (property22 instanceof EnumProperty) {
                    EnumProperty enumProperty = (EnumProperty)property22;
                    string24 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)enumProperty).toString();
                } else {
                    string24 = "";
                }
                if (string24.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                    String string25;
                    Property property23 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                    if (property23 instanceof EnumProperty) {
                        EnumProperty _getep111 = (EnumProperty)property23;
                        string25 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getep111).toString();
                    } else {
                        string25 = "";
                    }
                    if (string25.equals("SIDE")) {
                        String string26 = "up";
                        BlockPos _pos12 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs12 = world.m_8055_(_pos12);
                        Property property24 = _bs12.m_60734_().m_49965_().m_61081_("inner_outer");
                        if (!(property24 instanceof EnumProperty)) return;
                        EnumProperty _enumProp = (EnumProperty)property24;
                        if (!_enumProp.m_6215_(string26).isPresent()) return;
                        world.m_7731_(_pos12, (BlockState)_bs12.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string26).get()))), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == blockstate.m_60734_()) {
                String string27;
                Property property25 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("shape");
                if (property25 instanceof EnumProperty) {
                    EnumProperty _getep117 = (EnumProperty)property25;
                    string27 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getep117).toString();
                } else {
                    string27 = "";
                }
                if (string27.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                    String string28;
                    Property property26 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                    if (property26 instanceof EnumProperty) {
                        EnumProperty _getep122 = (EnumProperty)property26;
                        string28 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getep122).toString();
                    } else {
                        string28 = "";
                    }
                    if (string28.equals("SIDE")) {
                        String string29 = "down";
                        BlockPos _pos13 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs13 = world.m_8055_(_pos13);
                        Property property27 = _bs13.m_60734_().m_49965_().m_61081_("inner_outer");
                        if (!(property27 instanceof EnumProperty)) return;
                        EnumProperty _enumProp = (EnumProperty)property27;
                        if (!_enumProp.m_6215_(string29).isPresent()) return;
                        world.m_7731_(_pos13, (BlockState)_bs13.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string29).get()))), 3);
                        return;
                    }
                }
            }
            String string30 = "no";
            BlockPos _pos14 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs14 = world.m_8055_(_pos14);
            Property property28 = _bs14.m_60734_().m_49965_().m_61081_("inner_outer");
            if (!(property28 instanceof EnumProperty)) return;
            EnumProperty _enumProp = (EnumProperty)property28;
            if (!_enumProp.m_6215_(string30).isPresent()) return;
            world.m_7731_(_pos14, (BlockState)_bs14.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string30).get()))), 3);
            return;
        }
        if (new Object(){

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
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == blockstate.m_60734_()) {
                String string31;
                Property property29 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("shape");
                if (property29 instanceof EnumProperty) {
                    EnumProperty enumProperty = (EnumProperty)property29;
                    string31 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)enumProperty).toString();
                } else {
                    string31 = "";
                }
                if (string31.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                    String string32;
                    Property property30 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                    if (property30 instanceof EnumProperty) {
                        EnumProperty _getep137 = (EnumProperty)property30;
                        string32 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getep137).toString();
                    } else {
                        string32 = "";
                    }
                    if (string32.equals("SIDE")) {
                        String string33 = "up";
                        BlockPos _pos15 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs15 = world.m_8055_(_pos15);
                        Property property31 = _bs15.m_60734_().m_49965_().m_61081_("inner_outer");
                        if (!(property31 instanceof EnumProperty)) return;
                        EnumProperty _enumProp = (EnumProperty)property31;
                        if (!_enumProp.m_6215_(string33).isPresent()) return;
                        world.m_7731_(_pos15, (BlockState)_bs15.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string33).get()))), 3);
                        return;
                    }
                }
            }
            if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_() == blockstate.m_60734_()) {
                String string34;
                Property property32 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_60734_().m_49965_().m_61081_("shape");
                if (property32 instanceof EnumProperty) {
                    EnumProperty _getep143 = (EnumProperty)property32;
                    string34 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z - 1.0))).m_61143_((Property)_getep143).toString();
                } else {
                    string34 = "";
                }
                if (string34.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                    String string35;
                    Property property33 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                    if (property33 instanceof EnumProperty) {
                        EnumProperty _getep148 = (EnumProperty)property33;
                        string35 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getep148).toString();
                    } else {
                        string35 = "";
                    }
                    if (string35.equals("SIDE")) {
                        String string36 = "down";
                        BlockPos _pos16 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                        BlockState _bs16 = world.m_8055_(_pos16);
                        Property property34 = _bs16.m_60734_().m_49965_().m_61081_("inner_outer");
                        if (!(property34 instanceof EnumProperty)) return;
                        EnumProperty _enumProp = (EnumProperty)property34;
                        if (!_enumProp.m_6215_(string36).isPresent()) return;
                        world.m_7731_(_pos16, (BlockState)_bs16.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string36).get()))), 3);
                        return;
                    }
                }
            }
            String string37 = "no";
            BlockPos _pos17 = BlockPos.m_274561_((double)x, (double)y, (double)z);
            BlockState _bs17 = world.m_8055_(_pos17);
            Property property35 = _bs17.m_60734_().m_49965_().m_61081_("inner_outer");
            if (!(property35 instanceof EnumProperty)) return;
            EnumProperty _enumProp = (EnumProperty)property35;
            if (!_enumProp.m_6215_(string37).isPresent()) return;
            world.m_7731_(_pos17, (BlockState)_bs17.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string37).get()))), 3);
            return;
        }
        if (new Object(){

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
        }.getDirection(blockstate) != Direction.EAST) return;
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == blockstate.m_60734_()) {
            String string38;
            Property property36 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("shape");
            if (property36 instanceof EnumProperty) {
                EnumProperty enumProperty = (EnumProperty)property36;
                string38 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)enumProperty).toString();
            } else {
                string38 = "";
            }
            if (string38.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                String string39;
                Property property37 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                if (property37 instanceof EnumProperty) {
                    EnumProperty _getep163 = (EnumProperty)property37;
                    string39 = world.m_8055_(BlockPos.m_274561_((double)(x - 1.0), (double)y, (double)z)).m_61143_((Property)_getep163).toString();
                } else {
                    string39 = "";
                }
                if (string39.equals("SIDE")) {
                    String string40 = "up";
                    BlockPos _pos18 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs18 = world.m_8055_(_pos18);
                    Property property38 = _bs18.m_60734_().m_49965_().m_61081_("inner_outer");
                    if (!(property38 instanceof EnumProperty)) return;
                    EnumProperty _enumProp = (EnumProperty)property38;
                    if (!_enumProp.m_6215_(string40).isPresent()) return;
                    world.m_7731_(_pos18, (BlockState)_bs18.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string40).get()))), 3);
                    return;
                }
            }
        }
        if (world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_() == blockstate.m_60734_()) {
            String string41;
            Property property39 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_60734_().m_49965_().m_61081_("shape");
            if (property39 instanceof EnumProperty) {
                EnumProperty _getep169 = (EnumProperty)property39;
                string41 = world.m_8055_(BlockPos.m_274561_((double)x, (double)y, (double)(z + 1.0))).m_61143_((Property)_getep169).toString();
            } else {
                string41 = "";
            }
            if (string41.equals("SIDE") && world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_() == blockstate.m_60734_()) {
                String string42;
                Property property40 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_60734_().m_49965_().m_61081_("shape");
                if (property40 instanceof EnumProperty) {
                    EnumProperty _getep174 = (EnumProperty)property40;
                    string42 = world.m_8055_(BlockPos.m_274561_((double)(x + 1.0), (double)y, (double)z)).m_61143_((Property)_getep174).toString();
                } else {
                    string42 = "";
                }
                if (string42.equals("SIDE")) {
                    String string43 = "down";
                    BlockPos _pos19 = BlockPos.m_274561_((double)x, (double)y, (double)z);
                    BlockState _bs19 = world.m_8055_(_pos19);
                    Property property41 = _bs19.m_60734_().m_49965_().m_61081_("inner_outer");
                    if (!(property41 instanceof EnumProperty)) return;
                    EnumProperty _enumProp = (EnumProperty)property41;
                    if (!_enumProp.m_6215_(string43).isPresent()) return;
                    world.m_7731_(_pos19, (BlockState)_bs19.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string43).get()))), 3);
                    return;
                }
            }
        }
        String string44 = "no";
        BlockPos _pos20 = BlockPos.m_274561_((double)x, (double)y, (double)z);
        BlockState _bs20 = world.m_8055_(_pos20);
        Property property42 = _bs20.m_60734_().m_49965_().m_61081_("inner_outer");
        if (!(property42 instanceof EnumProperty)) return;
        EnumProperty _enumProp = (EnumProperty)property42;
        if (!_enumProp.m_6215_(string44).isPresent()) return;
        world.m_7731_(_pos20, (BlockState)_bs20.m_61124_((Property)_enumProp, (Comparable)((Object)((Enum)_enumProp.m_6215_(string44).get()))), 3);
    }
}

