/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.item.context.UseOnContext
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package rojiuramod.item;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import rojiuramod.procedures.LnvisibleLightYouJiFangKuaiShiFangKuaiDeWeiZhi4Procedure;

public class InvisibleLight4Item
extends Item {
    public InvisibleLight4Item() {
        super(new Item.Properties().m_41487_(64).m_41497_(Rarity.UNCOMMON));
    }

    public void m_7373_(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
        super.m_7373_(itemstack, level, list, flag);
        list.add((Component)Component.m_237115_((String)"item.rojiuramod.invisible_light_4.description_0"));
    }

    public InteractionResult m_6225_(UseOnContext context) {
        super.m_6225_(context);
        LnvisibleLightYouJiFangKuaiShiFangKuaiDeWeiZhi4Procedure.execute((LevelAccessor)context.m_43725_(), context.m_8083_().m_123341_(), context.m_8083_().m_123342_(), context.m_8083_().m_123343_(), context.m_43719_(), (Entity)context.m_43723_(), context.m_43722_());
        return InteractionResult.SUCCESS;
    }
}

