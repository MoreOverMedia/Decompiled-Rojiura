/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.Projectile
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
 *  net.minecraft.world.phys.BlockHitResult
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.Shapes
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package rojiuramod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rojiuramod.procedures.WindChimeDangYouJiFangKuaiShiProcedure;
import rojiuramod.procedures.WindChimeShiTiZaiFangKuaiZhongPengZhuangShiProcedure;
import rojiuramod.procedures.WindChimeZaiKeGengXinShiProcedure;

public class WindChimeBlock
extends Block {
    public static final IntegerProperty BLOCKSTATE = IntegerProperty.m_61631_((String)"blockstate", (int)0, (int)1);
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;

    public WindChimeBlock() {
        super(BlockBehaviour.Properties.m_284310_().m_284180_(MapColor.f_283869_).m_60918_(SoundType.f_56736_).m_60913_(0.5f, 10.0f).m_60953_(s -> new Object((BlockState)s){
            final /* synthetic */ BlockState val$s;
            {
                this.val$s = blockState;
            }

            public int getLightLevel() {
                if ((Integer)this.val$s.m_61143_((Property)BLOCKSTATE) == 1) {
                    return 0;
                }
                return 0;
            }
        }.getLightLevel()).m_60910_().m_60955_().m_60924_((bs, br, bp) -> false));
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
            default -> WindChimeBlock.m_49796_((double)6.75, (double)-2.0, (double)7.0, (double)9.25, (double)16.0, (double)9.0);
            case Direction.NORTH -> WindChimeBlock.m_49796_((double)6.75, (double)-2.0, (double)7.0, (double)9.25, (double)16.0, (double)9.0);
            case Direction.EAST -> WindChimeBlock.m_49796_((double)7.0, (double)-2.0, (double)6.75, (double)9.0, (double)16.0, (double)9.25);
            case Direction.WEST -> WindChimeBlock.m_49796_((double)7.0, (double)-2.0, (double)6.75, (double)9.0, (double)16.0, (double)9.25);
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

    public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.m_6807_(blockstate, world, pos, oldState, moving);
        world.m_186460_(pos, (Block)this, 20);
    }

    public void m_6861_(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.m_6861_(blockstate, world, pos, neighborBlock, fromPos, moving);
        WindChimeDangYouJiFangKuaiShiProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
    }

    public void m_213897_(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
        super.m_213897_(blockstate, world, pos, random);
        int x = pos.m_123341_();
        int y = pos.m_123342_();
        int z = pos.m_123343_();
        WindChimeZaiKeGengXinShiProcedure.execute((LevelAccessor)world, x, y, z);
        world.m_186460_(pos, (Block)this, 20);
    }

    public void m_7892_(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
        super.m_7892_(blockstate, world, pos, entity);
        WindChimeShiTiZaiFangKuaiZhongPengZhuangShiProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_(), blockstate);
    }

    public void m_5581_(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
        WindChimeDangYouJiFangKuaiShiProcedure.execute((LevelAccessor)world, hit.m_82425_().m_123341_(), hit.m_82425_().m_123342_(), hit.m_82425_().m_123343_());
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
        WindChimeDangYouJiFangKuaiShiProcedure.execute((LevelAccessor)world, x, y, z);
        return InteractionResult.SUCCESS;
    }
}

