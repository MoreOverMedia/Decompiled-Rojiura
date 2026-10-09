/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterLayerDefinitions
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package rojiuramod.init;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rojiuramod.client.model.Modelitem_beer_Converted;
import rojiuramod.client.model.Modelitem_cans_Converted;
import rojiuramod.client.model.Modelitem_floating_ring_Converted;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
public class RojiuramodModModels {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(Modelitem_cans_Converted.LAYER_LOCATION, Modelitem_cans_Converted::createBodyLayer);
        event.registerLayerDefinition(Modelitem_floating_ring_Converted.LAYER_LOCATION, Modelitem_floating_ring_Converted::createBodyLayer);
        event.registerLayerDefinition(Modelitem_beer_Converted.LAYER_LOCATION, Modelitem_beer_Converted::createBodyLayer);
    }
}

