package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PiglinPizzaItem extends Item {
	public PiglinPizzaItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(9).saturationMod(10.8f).build()));
	}
}