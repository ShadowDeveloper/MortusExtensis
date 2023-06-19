package net.Inf1nityZ3r0.MortusExtensis;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;

import java.util.Calendar;


public class CorpseEntity extends MobEntity {
    public static final DefaultAttributeContainer ATTRIBUTES = createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0).build();


    public CorpseEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initDataTracker() {
        
    }
}
