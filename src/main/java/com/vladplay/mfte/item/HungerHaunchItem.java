package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HungerHaunchItem extends Item {
	public HungerHaunchItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(15).saturationMod(18f).meat().build()));
	}
}