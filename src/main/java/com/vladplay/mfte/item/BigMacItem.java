package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BigMacItem extends Item {
	public BigMacItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(12).saturationMod(14.4f).build()));
	}
}