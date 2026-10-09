/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package rojiuramod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class RojiuramodModSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.SOUND_EVENTS, (String)"rojiuramod");
    public static final RegistryObject<SoundEvent> GARBAGE_BASKET_OGG = REGISTRY.register("garbage_basket.ogg", () -> SoundEvent.m_262824_((ResourceLocation)new ResourceLocation("rojiuramod", "garbage_basket.ogg")));
    public static final RegistryObject<SoundEvent> GLASS_BIN_OGG = REGISTRY.register("glass_bin.ogg", () -> SoundEvent.m_262824_((ResourceLocation)new ResourceLocation("rojiuramod", "glass_bin.ogg")));
    public static final RegistryObject<SoundEvent> WIND_CHIME_OGG = REGISTRY.register("wind_chime.ogg", () -> SoundEvent.m_262824_((ResourceLocation)new ResourceLocation("rojiuramod", "wind_chime.ogg")));
    public static final RegistryObject<SoundEvent> COIN_INTO_A_MACHINE_OGG = REGISTRY.register("coin_into_a_machine.ogg", () -> SoundEvent.m_262824_((ResourceLocation)new ResourceLocation("rojiuramod", "coin_into_a_machine.ogg")));
    public static final RegistryObject<SoundEvent> CAN_FROM_A_MACHINE_OGG = REGISTRY.register("can_from_a_machine.ogg", () -> SoundEvent.m_262824_((ResourceLocation)new ResourceLocation("rojiuramod", "can_from_a_machine.ogg")));
    public static final RegistryObject<SoundEvent> METALSTAIR = REGISTRY.register("metalstair", () -> SoundEvent.m_262824_((ResourceLocation)new ResourceLocation("rojiuramod", "metalstair")));
}

