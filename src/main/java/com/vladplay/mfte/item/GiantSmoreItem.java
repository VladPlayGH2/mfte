package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GiantSmoreItem extends Item {
	public GiantSmoreItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(10).saturationMod(12f).build()));
	}
}