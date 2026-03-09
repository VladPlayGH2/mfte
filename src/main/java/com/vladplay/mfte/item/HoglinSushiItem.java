package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HoglinSushiItem extends Item {
	public HoglinSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(8).saturationMod(7.2f).build()));
	}
}