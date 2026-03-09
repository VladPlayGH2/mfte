package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RavagerHaunchItem extends Item {
	public RavagerHaunchItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(3).saturationMod(1.8f).meat().build()));
	}
}