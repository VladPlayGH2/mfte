package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ChickenSushiItem extends Item {
	public ChickenSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(5.4f).build()));
	}
}