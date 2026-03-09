package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedPufferfishSushiItem extends Item {
	public CookedPufferfishSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(2.6f).build()));
	}
}