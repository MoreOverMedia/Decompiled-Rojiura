/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResultHolder
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.level.Level
 */
package rojiuramod.item;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class GravityStickItem
extends Item {
    public GravityStickItem() {
        super(new Item.Properties().m_41487_(64).m_41497_(Rarity.COMMON));
    }

    public int m_8105_(ItemStack itemstack) {
        return 10;
    }

    public void m_7373_(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
        super.m_7373_(itemstack, level, list, flag);
        list.add((Component)Component.m_237115_((String)"item.rojiuramod.gravity_stick.description_0"));
    }

    public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder ar = super.m_7203_(world, entity, hand);
        entity.m_6672_(hand);
        return ar;
    }
}

