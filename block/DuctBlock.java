/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.util.StringRepresentable
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.context.BlockPlaceContext
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.LevelReader
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.HorizontalDirectionalBlock
 *  net.minecraft.world.level.block.Mirror
 *  net.minecraft.world.level.block.Rotation
 *  net.minecraft.world.level.block.SimpleWaterloggedBlock
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.StateDefinition$Builder
 *  net.minecraft.world.level.block.state.properties.BlockStateProperties
 *  net.minecraft.world.level.block.state.properties.BooleanProperty
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.EnumProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraft.world.level.material.Fluid
 *  net.minecraft.world.level.material.FluidState
 *  net.minecraft.world.level.material.Fluids
 *  net.minecraft.world.level.material.MapColor
 *  net.minecraft.world.level.pathfinder.BlockPathTypes
 *  net.minecraft.world.phys.HitResult
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.Shapes
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package rojiuramod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rojiuramod.init.RojiuramodModItems;
import rojiuramod.procedures.DuctDangPiLinFangKuaiGengXinShiProcedure;

public class DuctBlock
extends Block
implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.f_61362_;
    public static final BooleanProperty DOWN = BooleanProperty.m_61465_((String)"down");
    public static final BooleanProperty UP = BooleanProperty.m_61465_((String)"up");
    public static final BooleanProperty NORTH = BooleanProperty.m_61465_((String)"north");
    public static final BooleanProperty SOUTH = BooleanProperty.m_61465_((String)"south");
    public static final BooleanProperty WEST = BooleanProperty.m_61465_((String)"west");
    public static final BooleanProperty EAST = BooleanProperty.m_61465_((String)"east");
    public static final EnumProperty<ShapeProperty> SHAPE = EnumProperty.m_61587_((String)"shape", ShapeProperty.class);
    public static final EnumProperty<InnerOuterProperty> INNER_OUTER = EnumProperty.m_61587_((String)"inner_outer", InnerOuterProperty.class);

    public DuctBlock() {
        super(BlockBehaviour.Properties.m_284310_().m_284180_(MapColor.f_283906_).m_60918_(SoundType.f_56743_).m_60913_(0.5f, 10.0f).m_60955_().m_60924_((bs, br, bp) -> false));
        this.m_49959_((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH)).m_61124_((Property)DOWN, (Comparable)Boolean.valueOf(false))).m_61124_((Property)UP, (Comparable)Boolean.valueOf(false))).m_61124_((Property)NORTH, (Comparable)Boolean.valueOf(false))).m_61124_((Property)SOUTH, (Comparable)Boolean.valueOf(false))).m_61124_((Property)WEST, (Comparable)Boolean.valueOf(false))).m_61124_((Property)EAST, (Comparable)Boolean.valueOf(false))).m_61124_(SHAPE, (Comparable)((Object)ShapeProperty.DOWN))).m_61124_(INNER_OUTER, (Comparable)((Object)InnerOuterProperty.NO))).m_61124_((Property)WATERLOGGED, (Comparable)Boolean.valueOf(false)));
    }

    public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
        return state.m_60819_().m_76178_();
    }

    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public VoxelShape m_5909_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.m_83040_();
    }

    public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch ((Direction)state.m_61143_((Property)FACING)) {
            default -> DuctBlock.m_49796_((double)1.0, (double)1.0, (double)1.0, (double)15.0, (double)15.0, (double)15.0);
            case Direction.NORTH -> DuctBlock.m_49796_((double)1.0, (double)1.0, (double)1.0, (double)15.0, (double)15.0, (double)15.0);
            case Direction.EAST -> DuctBlock.m_49796_((double)1.0, (double)1.0, (double)1.0, (double)15.0, (double)15.0, (double)15.0);
            case Direction.WEST -> DuctBlock.m_49796_((double)1.0, (double)1.0, (double)1.0, (double)15.0, (double)15.0, (double)15.0);
        };
    }

    protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
        super.m_7926_(builder);
        builder.m_61104_(new Property[]{FACING, DOWN, UP, NORTH, SOUTH, WEST, EAST, SHAPE, INNER_OUTER, WATERLOGGED});
    }

    public BlockState m_5573_(BlockPlaceContext context) {
        boolean flag = context.m_43725_().m_6425_(context.m_8083_()).m_76152_() == Fluids.f_76193_;
        return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)super.m_5573_(context).m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_())).m_61124_((Property)DOWN, (Comparable)Boolean.valueOf(false))).m_61124_((Property)UP, (Comparable)Boolean.valueOf(false))).m_61124_((Property)NORTH, (Comparable)Boolean.valueOf(false))).m_61124_((Property)SOUTH, (Comparable)Boolean.valueOf(false))).m_61124_((Property)WEST, (Comparable)Boolean.valueOf(false))).m_61124_((Property)EAST, (Comparable)Boolean.valueOf(false))).m_61124_(SHAPE, (Comparable)((Object)ShapeProperty.DOWN))).m_61124_(INNER_OUTER, (Comparable)((Object)InnerOuterProperty.NO))).m_61124_((Property)WATERLOGGED, (Comparable)Boolean.valueOf(flag));
    }

    public BlockState m_6843_(BlockState state, Rotation rot) {
        return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
    }

    public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
        return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
    }

    public FluidState m_5888_(BlockState state) {
        return (Boolean)state.m_61143_((Property)WATERLOGGED) != false ? Fluids.f_76193_.m_76068_(false) : super.m_5888_(state);
    }

    public BlockState m_7417_(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        if (((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue()) {
            world.m_186469_(currentPos, (Fluid)Fluids.f_76193_, Fluids.f_76193_.m_6718_((LevelReader)world));
        }
        return super.m_7417_(state, facing, facingState, world, currentPos, facingPos);
    }

    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
        return new ItemStack((ItemLike)RojiuramodModItems.DUCT_ITEM.get());
    }

    public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
        return BlockPathTypes.BLOCKED;
    }

    public void m_6861_(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.m_6861_(blockstate, world, pos, neighborBlock, fromPos, moving);
        DuctDangPiLinFangKuaiGengXinShiProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_(), blockstate);
    }

    public static enum ShapeProperty implements StringRepresentable
    {
        UP("up"),
        SIDE("side"),
        DOWN("down");

        private final String name;

        private ShapeProperty(String name) {
            this.name = name;
        }

        public String m_7912_() {
            return this.name;
        }
    }

    public static enum InnerOuterProperty implements StringRepresentable
    {
        UP("up"),
        SIDE("side"),
        DOWN("down"),
        NO("no");

        private final String name;

        private InnerOuterProperty(String name) {
            this.name = name;
        }

        public String m_7912_() {
            return this.name;
        }
    }
}

