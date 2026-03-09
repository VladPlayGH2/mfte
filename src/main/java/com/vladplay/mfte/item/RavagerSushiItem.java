package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RavagerSushiItem extends Item {
	public RavagerSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(9).saturationMod(8.1f).build()));
	}
}