/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vladplay.mfte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.vladplay.mfte.block.*;
import com.vladplay.mfte.MorefoodthaneverMod;

public class MorefoodthaneverModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MorefoodthaneverMod.MODID);
	public static final RegistryObject<Block> PLASTIC_ORE;
	public static final RegistryObject<Block> DEEPSLATE_PLASTIC_ORE;
	public static final RegistryObject<Block> WAX_BLOCK;
	public static final RegistryObject<Block> SOUR_BERRY_BUSH;
	public static final RegistryObject<Block> CANTALOUPE;
	public static final RegistryObject<Block> CANTALOUPE_PLANT;
	public static final RegistryObject<Block> LEMON_SAPLING;
	public static final RegistryObject<Block> BENZOIN_SAPLING;
	public static final RegistryObject<Block> GRAPEFRUIT_SAPLING;
	public static final RegistryObject<Block> LAVENDER_SAPLING;
	public static final RegistryObject<Block> MINT_SAPLING;
	public static final RegistryObject<Block> OAKMOSS_SAPLING;
	public static final RegistryObject<Block> PINE_OIL_SAPLING;
	public static final RegistryObject<Block> TONKA_SAPLING;
	public static final RegistryObject<Block> YLANG_YLANG_SAPLING;
	public static final RegistryObject<Block> ORANGE_SAPLING;
	public static final RegistryObject<Block> LIME_SAPLING;
	public static final RegistryObject<Block> HONEYDEW;
	public static final RegistryObject<Block> HONEYDEW_PLANT;
	public static final RegistryObject<Block> RICE_PANICLE;
	static {
		PLASTIC_ORE = REGISTRY.register("plastic_ore", PlasticOreBlock::new);
		DEEPSLATE_PLASTIC_ORE = REGISTRY.register("deepslate_plastic_ore", DeepslatePlasticOreBlock::new);
		WAX_BLOCK = REGISTRY.register("wax_block", WaxBlockBlock::new);
		SOUR_BERRY_BUSH = REGISTRY.register("sour_berry_bush", SourBerryBushBlock::new);
		CANTALOUPE = REGISTRY.register("cantaloupe", CantaloupeBlock::new);
		CANTALOUPE_PLANT = REGISTRY.register("cantaloupe_plant", CantaloupePlantBlock::new);
		LEMON_SAPLING = REGISTRY.register("lemon_sapling", LemonSaplingBlock::new);
		BENZOIN_SAPLING = REGISTRY.register("benzoin_sapling", BenzoinSaplingBlock::new);
		GRAPEFRUIT_SAPLING = REGISTRY.register("grapefruit_sapling", GrapefruitSaplingBlock::new);
		LAVENDER_SAPLING = REGISTRY.register("lavender_sapling", LavenderSaplingBlock::new);
		MINT_SAPLING = REGISTRY.register("mint_sapling", MintSaplingBlock::new);
		OAKMOSS_SAPLING = REGISTRY.register("oakmoss_sapling", OakmossSaplingBlock::new);
		PINE_OIL_SAPLING = REGISTRY.register("pine_oil_sapling", PineOilSaplingBlock::new);
		TONKA_SAPLING = REGISTRY.register("tonka_sapling", TonkaSaplingBlock::new);
		YLANG_YLANG_SAPLING = REGISTRY.register("ylang_ylang_sapling", YlangYlangSaplingBlock::new);
		ORANGE_SAPLING = REGISTRY.register("orange_sapling", OrangeSaplingBlock::new);
		LIME_SAPLING = REGISTRY.register("lime_sapling", LimeSaplingBlock::new);
		HONEYDEW = REGISTRY.register("honeydew", HoneydewBlock::new);
		HONEYDEW_PLANT = REGISTRY.register("honeydew_plant", HoneydewPlantBlock::new);
		RICE_PANICLE = REGISTRY.register("rice_panicle", RicePanicleBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}