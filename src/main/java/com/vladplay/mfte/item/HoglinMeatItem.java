package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HoglinMeatItem extends Item {
	public HoglinMeatItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(1.8f).meat().build()));
	}
}