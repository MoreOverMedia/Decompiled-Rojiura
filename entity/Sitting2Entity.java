/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientGamePacketListener
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.AreaEffectCloud
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobType
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.ai.attributes.Attribute
 *  net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.ai.control.FlyingMoveControl
 *  net.minecraft.world.entity.ai.navigation.FlyingPathNavigation
 *  net.minecraft.world.entity.ai.navigation.PathNavigation
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ThrownPotion
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.LevelReader
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.common.ForgeMod
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 */
package rojiuramod.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import rojiuramod.init.RojiuramodModEntities;
import rojiuramod.procedures.Sitting1WanJiaYuGaiShiTiFaShengPengZhuangShiProcedure;

public class Sitting2Entity
extends PathfinderMob {
    public Sitting2Entity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<Sitting2Entity>)((EntityType)RojiuramodModEntities.SITTING_2.get()), world);
    }

    public Sitting2Entity(EntityType<Sitting2Entity> type, Level world) {
        super(type, world);
        this.m_274367_(0.0f);
        this.f_21364_ = 0;
        this.m_21557_(true);
        this.f_21342_ = new FlyingMoveControl((Mob)this, 10, true);
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    protected PathNavigation m_6037_(Level world) {
        return new FlyingPathNavigation((Mob)this, world);
    }

    public MobType m_6336_() {
        return MobType.f_21640_;
    }

    public double m_6048_() {
        return super.m_6048_() + -0.23;
    }

    public boolean m_142535_(float l, float d, DamageSource source) {
        return false;
    }

    public boolean m_6469_(DamageSource damagesource, float amount) {
        if (damagesource.m_276093_(DamageTypes.f_268631_)) {
            return false;
        }
        if (damagesource.m_7640_() instanceof AbstractArrow) {
            return false;
        }
        if (damagesource.m_7640_() instanceof Player) {
            return false;
        }
        if (damagesource.m_7640_() instanceof ThrownPotion || damagesource.m_7640_() instanceof AreaEffectCloud) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268671_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268585_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268722_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268450_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268565_) || damagesource.m_276093_(DamageTypes.f_268448_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268714_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268526_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268482_)) {
            return false;
        }
        if (damagesource.m_276093_(DamageTypes.f_268493_) || damagesource.m_276093_(DamageTypes.f_268641_)) {
            return false;
        }
        return super.m_6469_(damagesource, amount);
    }

    public boolean m_6128_() {
        return true;
    }

    public boolean m_5825_() {
        return true;
    }

    public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
        ItemStack itemstack = sourceentity.m_21120_(hand);
        InteractionResult retval = InteractionResult.m_19078_((boolean)this.m_9236_().m_5776_());
        super.m_6071_(sourceentity, hand);
        sourceentity.m_20329_((Entity)this);
        return retval;
    }

    public void m_6123_(Player sourceentity) {
        super.m_6123_(sourceentity);
        Sitting1WanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this, (Entity)sourceentity);
    }

    public boolean m_6914_(LevelReader world) {
        return world.m_45784_((Entity)this);
    }

    public boolean m_6040_() {
        double x = this.m_20185_();
        double y = this.m_20186_();
        double z = this.m_20189_();
        Level world = this.m_9236_();
        Sitting2Entity entity = this;
        return true;
    }

    public boolean m_6063_() {
        double x = this.m_20185_();
        double y = this.m_20186_();
        double z = this.m_20189_();
        Level world = this.m_9236_();
        Sitting2Entity entity = this;
        return false;
    }

    public boolean m_6094_() {
        return false;
    }

    protected void m_7324_(Entity entityIn) {
    }

    protected void m_6138_() {
    }

    public void m_7023_(Vec3 dir) {
        Entity entity;
        Entity entity2 = entity = this.m_20197_().isEmpty() ? null : (Entity)this.m_20197_().get(0);
        if (this.m_20160_()) {
            double d0;
            double d1;
            float f1;
            this.m_146922_(entity.m_146908_());
            this.f_19859_ = this.m_146908_();
            this.m_146926_(entity.m_146909_() * 0.5f);
            this.m_19915_(this.m_146908_(), this.m_146909_());
            this.f_20883_ = entity.m_146908_();
            this.f_20885_ = entity.m_146908_();
            if (entity instanceof LivingEntity) {
                LivingEntity passenger = (LivingEntity)entity;
                this.m_7910_((float)this.m_21133_(Attributes.f_22279_));
                float forward = passenger.f_20902_;
                float strafe = passenger.f_20900_;
                super.m_7023_(new Vec3((double)strafe, 0.0, (double)forward));
            }
            if ((f1 = (float)Math.sqrt((d1 = this.m_20185_() - this.f_19854_) * d1 + (d0 = this.m_20189_() - this.f_19856_) * d0) * 4.0f) > 1.0f) {
                f1 = 1.0f;
            }
            this.f_267362_.m_267771_(this.f_267362_.m_267731_() + (f1 - this.f_267362_.m_267731_()) * 0.4f);
            this.f_267362_.m_267590_(this.f_267362_.m_267756_() + this.f_267362_.m_267731_());
            this.m_267651_(true);
            return;
        }
        super.m_7023_(dir);
    }

    protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    public void m_20242_(boolean ignored) {
        super.m_20242_(true);
    }

    public void m_8107_() {
        super.m_8107_();
        this.m_20242_(true);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.0);
        builder = builder.m_22268_(Attributes.f_22276_, 1.0);
        builder = builder.m_22268_(Attributes.f_22284_, 0.0);
        builder = builder.m_22268_(Attributes.f_22281_, 0.0);
        builder = builder.m_22268_(Attributes.f_22277_, 0.0);
        builder = builder.m_22268_(Attributes.f_22280_, 0.0);
        builder = builder.m_22268_((Attribute)ForgeMod.SWIM_SPEED.get(), 0.0);
        return builder;
    }
}

