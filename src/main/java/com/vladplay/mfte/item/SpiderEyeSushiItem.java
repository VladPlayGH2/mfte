package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SpiderEyeSushiItem extends Item {
	public SpiderEyeSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(3).saturationMod(1.2f).build()));
	}
}