/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.food.FoodProperties$Builder
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.UseAnim
 *  net.minecraft.world.item.context.UseOnContext
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package rojiuramod.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import rojiuramod.procedures.CansDangWanJiaWanChengShiYongWuPinShiProcedure;
import rojiuramod.procedures.CansYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure;

public class CansItem
extends Item {
    public CansItem() {
        super(new Item.Properties().m_41487_(64).m_41497_(Rarity.COMMON).m_41489_(new FoodProperties.Builder().m_38760_(4).m_38758_(0.3f).m_38765_().m_38757_().m_38767_()));
    }

    public UseAnim m_6164_(ItemStack itemstack) {
        return UseAnim.DRINK;
    }

    public ItemStack m_5922_(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = super.m_5922_(itemstack, world, entity);
        double x = entity.m_20185_();
        double y = entity.m_20186_();
        double z = entity.m_20189_();
        CansDangWanJiaWanChengShiYongWuPinShiProcedure.execute((Entity)entity);
        return retval;
    }

    public InteractionResult m_6225_(UseOnContext context) {
        super.m_6225_(context);
        CansYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure.execute((LevelAccessor)context.m_43725_(), context.m_8083_().m_123341_(), context.m_8083_().m_123342_(), context.m_8083_().m_123343_(), context.m_43719_(), (Entity)context.m_43723_(), context.m_43722_());
        return InteractionResult.SUCCESS;
    }
}

