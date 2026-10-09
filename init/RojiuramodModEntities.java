/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EntityType$Builder
 *  net.minecraft.world.entity.MobCategory
 *  net.minecraftforge.event.entity.EntityAttributeCreationEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package rojiuramod.init;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import rojiuramod.entity.FloatingRingEntityEntity;
import rojiuramod.entity.Sitting1Entity;
import rojiuramod.entity.Sitting2Entity;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RojiuramodModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.ENTITY_TYPES, (String)"rojiuramod");
    public static final RegistryObject<EntityType<Sitting1Entity>> SITTING1 = RojiuramodModEntities.register("sitting1", EntityType.Builder.m_20704_(Sitting1Entity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sitting1Entity::new).m_20719_().m_20699_(0.1f, 0.1f));
    public static final RegistryObject<EntityType<Sitting2Entity>> SITTING_2 = RojiuramodModEntities.register("sitting_2", EntityType.Builder.m_20704_(Sitting2Entity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sitting2Entity::new).m_20719_().m_20699_(0.1f, 0.1f));
    public static final RegistryObject<EntityType<FloatingRingEntityEntity>> FLOATING_RING_ENTITY = RojiuramodModEntities.register("floating_ring_entity", EntityType.Builder.m_20704_(FloatingRingEntityEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FloatingRingEntityEntity::new).m_20719_().m_20699_(0.9f, 0.25f));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            Sitting1Entity.init();
            Sitting2Entity.init();
            FloatingRingEntityEntity.init();
        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put((EntityType)SITTING1.get(), Sitting1Entity.createAttributes().m_22265_());
        event.put((EntityType)SITTING_2.get(), Sitting2Entity.createAttributes().m_22265_());
        event.put((EntityType)FLOATING_RING_ENTITY.get(), FloatingRingEntityEntity.createAttributes().m_22265_());
    }
}

