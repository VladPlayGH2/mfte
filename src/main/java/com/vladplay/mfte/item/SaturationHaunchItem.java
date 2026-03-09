package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SaturationHaunchItem extends Item {
	public SaturationHaunchItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(8).saturationMod(20f).meat().build()));
	}
}