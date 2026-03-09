package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GlowingFishItem extends Item {
	public GlowingFishItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(7).saturationMod(10f).build()));
	}
}