package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GlowingCarrotItem extends Item {
	public GlowingCarrotItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(3.6f).build()));
	}
}