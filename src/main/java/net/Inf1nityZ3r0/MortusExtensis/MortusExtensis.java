package net.Inf1nityZ3r0.MortusExtensis;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MortusExtensis implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("MortusExtensis");
	public static final EntityType<CorpseEntity> CORPSE = Registry.register(
			Registries.ENTITY_TYPE,
			new Identifier("mortusextensis", "corpse"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CorpseEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build()
	);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(CORPSE, CorpseEntity.createMobAttributes());
	}
}
