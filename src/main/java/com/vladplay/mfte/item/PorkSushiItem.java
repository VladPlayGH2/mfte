package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PorkSushiItem extends Item {
	public PorkSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(7).saturationMod(6f).build()));
	}
}