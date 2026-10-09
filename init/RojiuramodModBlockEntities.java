/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.entity.BlockEntityType
 *  net.minecraft.world.level.block.entity.BlockEntityType$BlockEntitySupplier
 *  net.minecraft.world.level.block.entity.BlockEntityType$Builder
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package rojiuramod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import rojiuramod.block.entity.IceCandyBoxBlockEntity;
import rojiuramod.block.entity.LnvisibleLightBlockBlockEntity;
import rojiuramod.init.RojiuramodModBlocks;

public class RojiuramodModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.BLOCK_ENTITY_TYPES, (String)"rojiuramod");
    public static final RegistryObject<BlockEntityType<?>> ICE_CANDY_BOX = RojiuramodModBlockEntities.register("ice_candy_box", RojiuramodModBlocks.ICE_CANDY_BOX, IceCandyBoxBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> INVISIBLE_LIGHT_BLOCK = RojiuramodModBlockEntities.register("invisible_light_block", RojiuramodModBlocks.INVISIBLE_LIGHT_BLOCK, LnvisibleLightBlockBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.m_155273_((BlockEntityType.BlockEntitySupplier)supplier, (Block[])new Block[]{(Block)block.get()}).m_58966_(null));
    }
}

