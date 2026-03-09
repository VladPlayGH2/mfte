package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class IllagerSushiItem extends Item {
	public IllagerSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(4.5f).build()));
	}
}