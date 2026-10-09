/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.context.BlockPlaceContext
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.HorizontalDirectionalBlock
 *  net.minecraft.world.level.block.Mirror
 *  net.minecraft.world.level.block.Rotation
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.StateDefinition$Builder
 *  net.minecraft.world.level.block.state.properties.DirectionProperty
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraft.world.level.material.MapColor
 *  net.minecraft.world.level.pathfinder.BlockPathTypes
 *  net.minecraft.world.phys.BlockHitResult
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.Shapes
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package rojiuramod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rojiuramod.procedures.OutdoorSpotlightDangYouJiFangKuaiShiProcedure;

public class UtilityPoleLightBlock
extends Block {
    public static final IntegerProperty BLOCKSTATE = IntegerProperty.m_61631_((String)"blockstate", (int)0, (int)1);
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;

    public UtilityPoleLightBlock() {
        super(BlockBehaviour.Properties.m_284310_().m_284180_(MapColor.f_283818_).m_60918_(SoundType.f_56743_).m_60913_(0.5f, 10.0f).m_60953_(s -> new Object((BlockState)s){
            final /* synthetic */ BlockState val$s;
            {
                this.val$s = blockState;
            }

            public int getLightLevel() {
                if ((Integer)this.val$s.m_61143_((Property)BLOCKSTATE) == 1) {
                    return 15;
                }
                return 0;
            }
        }.getLightLevel()).m_60955_().m_60924_((bs, br, bp) -> false));
        this.m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
    }

    public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public VoxelShape m_5909_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.m_83040_();
    }

    public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch ((Direction)state.m_61143_((Property)FACING)) {
            default -> UtilityPoleLightBlock.m_49796_((double)5.0, (double)0.0, (double)-5.0, (double)11.0, (double)9.0, (double)4.5);
            case Direction.NORTH -> UtilityPoleLightBlock.m_49796_((double)5.0, (double)0.0, (double)11.5, (double)11.0, (double)9.0, (double)21.0);
            case Direction.EAST -> UtilityPoleLightBlock.m_49796_((double)-5.0, (double)0.0, (double)5.0, (double)4.5, (double)9.0, (double)11.0);
            case Direction.WEST -> UtilityPoleLightBlock.m_49796_((double)11.5, (double)0.0, (double)5.0, (double)21.0, (double)9.0, (double)11.0);
        };
    }

    protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
        super.m_7926_(builder);
        builder.m_61104_(new Property[]{FACING, BLOCKSTATE});
    }

    public BlockState m_5573_(BlockPlaceContext context) {
        return (BlockState)super.m_5573_(context).m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
    }

    public BlockState m_6843_(BlockState state, Rotation rot) {
        return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
    }

    public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
        return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
    }

    public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
        return BlockPathTypes.BLOCKED;
    }

    public InteractionResult m_6227_(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        super.m_6227_(blockstate, world, pos, entity, hand, hit);
        int x = pos.m_123341_();
        int y = pos.m_123342_();
        int z = pos.m_123343_();
        double hitX = hit.m_82450_().f_82479_;
        double hitY = hit.m_82450_().f_82480_;
        double hitZ = hit.m_82450_().f_82481_;
        Direction direction = hit.m_82434_();
        OutdoorSpotlightDangYouJiFangKuaiShiProcedure.execute((LevelAccessor)world, x, y, z, blockstate);
        return InteractionResult.SUCCESS;
    }
}

