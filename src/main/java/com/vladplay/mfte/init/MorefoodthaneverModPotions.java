/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vladplay.mfte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import com.vladplay.mfte.MorefoodthaneverMod;

public class MorefoodthaneverModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MorefoodthaneverMod.MODID);
	public static final RegistryObject<Potion> HUNGER = REGISTRY.register("hunger",
			() -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 900, 0, false, true), new MobEffectInstance(MobEffects.HUNGER, 3600, 0, false, true), new MobEffectInstance(MobEffects.HUNGER, 400, 1, false, true)));
	public static final RegistryObject<Potion> HEALTH_BOOST = REGISTRY.register("health_boost",
			() -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 900, 0, false, true), new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, false, true), new MobEffectInstance(MobEffects.HEALTH_BOOST, 400, 1, false, true)));
	public static final RegistryObject<Potion> BLINDNESS = REGISTRY.register("blindness",
			() -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 900, 0, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 400, 1, false, true)));
	public static final RegistryObject<Potion> NAUSEA = REGISTRY.register("nausea",
			() -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 900, 0, false, true), new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, false, true), new MobEffectInstance(MobEffects.CONFUSION, 400, 1, false, true)));
	public static final RegistryObject<Potion> SATURATION = REGISTRY.register("saturation",
			() -> new Potion(new MobEffectInstance(MobEffects.SATURATION, 900, 0, false, true), new MobEffectInstance(MobEffects.SATURATION, 3600, 0, false, true), new MobEffectInstance(MobEffects.SATURATION, 400, 1, false, true)));
	public static final RegistryObject<Potion> CONDUIT_POWER = REGISTRY.register("conduit_power",
			() -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 900, 0, false, true), new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 0, false, true), new MobEffectInstance(MobEffects.CONDUIT_POWER, 400, 1, false, true)));
	public static final RegistryObject<Potion> RAID_OMEN = REGISTRY.register("raid_omen",
			() -> new Potion(new MobEffectInstance(MobEffects.BAD_OMEN, 900, 0, false, true), new MobEffectInstance(MobEffects.BAD_OMEN, 3600, 0, false, true), new MobEffectInstance(MobEffects.BAD_OMEN, 400, 1, false, true)));
	public static final RegistryObject<Potion> DOLPHINS_GRACE = REGISTRY.register("dolphins_grace",
			() -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 900, 0, false, true), new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0, false, true), new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 1, false, true)));
	public static final RegistryObject<Potion> LUCK = REGISTRY.register("luck",
			() -> new Potion(new MobEffectInstance(MobEffects.LUCK, 900, 0, false, true), new MobEffectInstance(MobEffects.LUCK, 3600, 0, false, true), new MobEffectInstance(MobEffects.LUCK, 400, 1, false, true)));
	public static final RegistryObject<Potion> BAD_LUCK = REGISTRY.register("bad_luck",
			() -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 900, 0, false, true), new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true), new MobEffectInstance(MobEffects.UNLUCK, 400, 1, false, true)));
}