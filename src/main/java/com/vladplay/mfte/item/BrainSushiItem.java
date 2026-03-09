package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BrainSushiItem extends Item {
	public BrainSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(3).saturationMod(2.4f).build()));
	}
}