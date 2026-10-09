/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.item.context.BlockPlaceContext
 *  net.minecraft.world.level.BlockGetter
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
 *  net.minecraft.world.level.block.state.properties.IntegerProperty
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraft.world.level.material.Fluid
 *  net.minecraft.world.level.material.FluidState
 *  net.minecraft.world.level.material.Fluids
 *  net.minecraft.world.level.material.MapColor
 *  net.minecraft.world.level.pathfinder.BlockPathTypes
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.Shapes
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package rojiuramod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
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
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import rojiuramod.procedures.ConcreteWallDangPiLinFangKuaiGengXinShiProcedure;
import rojiuramod.procedures.GENGXINProcedure;

public class ConcreteWallWindholeBlock
extends Block
implements SimpleWaterloggedBlock {
    public static final IntegerProperty BLOCKSTATE = IntegerProperty.m_61631_((String)"blockstate", (int)0, (int)5);
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.f_61362_;

    public ConcreteWallWindholeBlock() {
        super(BlockBehaviour.Properties.m_284310_().m_284180_(MapColor.f_283779_).m_60918_(SoundType.f_56742_).m_60913_(0.5f, 10.0f).m_60953_(s -> new Object((BlockState)s){
            final /* synthetic */ BlockState val$s;
            {
                this.val$s = blockState;
            }

            public int getLightLevel() {
                if ((Integer)this.val$s.m_61143_((Property)BLOCKSTATE) == 1) {
                    return 0;
                }
                if ((Integer)this.val$s.m_61143_((Property)BLOCKSTATE) == 2) {
                    return 0;
                }
                if ((Integer)this.val$s.m_61143_((Property)BLOCKSTATE) == 3) {
                    return 0;
                }
                if ((Integer)this.val$s.m_61143_((Property)BLOCKSTATE) == 4) {
                    return 0;
                }
                if ((Integer)this.val$s.m_61143_((Property)BLOCKSTATE) == 5) {
                    return 0;
                }
                return 0;
            }
        }.getLightLevel()).m_60955_().m_60924_((bs, br, bp) -> false));
        this.m_49959_((BlockState)((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH)).m_61124_((Property)WATERLOGGED, (Comparable)Boolean.valueOf(false)));
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
        if ((Integer)state.m_61143_((Property)BLOCKSTATE) == 1) {
            return switch ((Direction)state.m_61143_((Property)FACING)) {
                default -> ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0);
                case Direction.NORTH -> ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)5.0);
                case Direction.EAST -> ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0);
                case Direction.WEST -> ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)5.0, (double)16.0, (double)16.0);
            };
        }
        if ((Integer)state.m_61143_((Property)BLOCKSTATE) == 2) {
            return switch ((Direction)state.m_61143_((Property)FACING)) {
                default -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)11.0));
                case Direction.NORTH -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)5.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)5.0, (double)5.0, (double)16.0, (double)16.0));
                case Direction.EAST -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)5.0));
                case Direction.WEST -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)5.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)5.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0));
            };
        }
        if ((Integer)state.m_61143_((Property)BLOCKSTATE) == 3) {
            return switch ((Direction)state.m_61143_((Property)FACING)) {
                default -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)16.0, (double)10.0, (double)17.0, (double)18.0, (double)17.0), ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)11.0), ConcreteWallWindholeBlock.m_49796_((double)10.0, (double)16.0, (double)0.0, (double)17.0, (double)18.0, (double)10.0)});
                case Direction.NORTH -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)5.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)-1.0, (double)16.0, (double)-1.0, (double)16.0, (double)18.0, (double)6.0), ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)5.0, (double)5.0, (double)16.0, (double)16.0), ConcreteWallWindholeBlock.m_49796_((double)-1.0, (double)16.0, (double)6.0, (double)6.0, (double)18.0, (double)16.0)});
                case Direction.EAST -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)10.0, (double)16.0, (double)-1.0, (double)17.0, (double)18.0, (double)16.0), ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)5.0), ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)16.0, (double)-1.0, (double)10.0, (double)18.0, (double)6.0)});
                case Direction.WEST -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)5.0, (double)16.0, (double)16.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)-1.0, (double)16.0, (double)0.0, (double)6.0, (double)18.0, (double)17.0), ConcreteWallWindholeBlock.m_49796_((double)5.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0), ConcreteWallWindholeBlock.m_49796_((double)6.0, (double)16.0, (double)10.0, (double)16.0, (double)18.0, (double)17.0)});
            };
        }
        if ((Integer)state.m_61143_((Property)BLOCKSTATE) == 4) {
            return switch ((Direction)state.m_61143_((Property)FACING)) {
                default -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)5.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)5.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0));
                case Direction.NORTH -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)5.0));
                case Direction.EAST -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)11.0));
                case Direction.WEST -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)5.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)5.0, (double)5.0, (double)16.0, (double)16.0));
            };
        }
        if ((Integer)state.m_61143_((Property)BLOCKSTATE) == 5) {
            return switch ((Direction)state.m_61143_((Property)FACING)) {
                default -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)5.0, (double)16.0, (double)16.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)-1.0, (double)16.0, (double)0.0, (double)6.0, (double)18.0, (double)17.0), ConcreteWallWindholeBlock.m_49796_((double)5.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0), ConcreteWallWindholeBlock.m_49796_((double)6.0, (double)16.0, (double)10.0, (double)16.0, (double)18.0, (double)17.0)});
                case Direction.NORTH -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)10.0, (double)16.0, (double)-1.0, (double)17.0, (double)18.0, (double)16.0), ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)5.0), ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)16.0, (double)-1.0, (double)10.0, (double)18.0, (double)6.0)});
                case Direction.EAST -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)16.0, (double)10.0, (double)17.0, (double)18.0, (double)17.0), ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)11.0), ConcreteWallWindholeBlock.m_49796_((double)10.0, (double)16.0, (double)0.0, (double)17.0, (double)18.0, (double)10.0)});
                case Direction.WEST -> Shapes.m_83124_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)5.0), (VoxelShape[])new VoxelShape[]{ConcreteWallWindholeBlock.m_49796_((double)-1.0, (double)16.0, (double)-1.0, (double)16.0, (double)18.0, (double)6.0), ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)5.0, (double)5.0, (double)16.0, (double)16.0), ConcreteWallWindholeBlock.m_49796_((double)-1.0, (double)16.0, (double)6.0, (double)6.0, (double)18.0, (double)16.0)});
            };
        }
        return switch ((Direction)state.m_61143_((Property)FACING)) {
            default -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)11.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)16.0, (double)10.0, (double)16.0, (double)18.0, (double)17.0));
            case Direction.NORTH -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)5.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)16.0, (double)-1.0, (double)16.0, (double)18.0, (double)6.0));
            case Direction.EAST -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)11.0, (double)0.0, (double)0.0, (double)16.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)10.0, (double)16.0, (double)0.0, (double)17.0, (double)18.0, (double)16.0));
            case Direction.WEST -> Shapes.m_83110_((VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)0.0, (double)0.0, (double)0.0, (double)5.0, (double)16.0, (double)16.0), (VoxelShape)ConcreteWallWindholeBlock.m_49796_((double)-1.0, (double)16.0, (double)0.0, (double)6.0, (double)18.0, (double)16.0));
        };
    }

    protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
        super.m_7926_(builder);
        builder.m_61104_(new Property[]{FACING, WATERLOGGED, BLOCKSTATE});
    }

    public BlockState m_5573_(BlockPlaceContext context) {
        boolean flag = context.m_43725_().m_6425_(context.m_8083_()).m_76152_() == Fluids.f_76193_;
        return (BlockState)((BlockState)super.m_5573_(context).m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_())).m_61124_((Property)WATERLOGGED, (Comparable)Boolean.valueOf(flag));
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

    public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
        return BlockPathTypes.BLOCKED;
    }

    public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.m_6807_(blockstate, world, pos, oldState, moving);
        GENGXINProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
    }

    public void m_6861_(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.m_6861_(blockstate, world, pos, neighborBlock, fromPos, moving);
        ConcreteWallDangPiLinFangKuaiGengXinShiProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_(), blockstate);
    }
}

