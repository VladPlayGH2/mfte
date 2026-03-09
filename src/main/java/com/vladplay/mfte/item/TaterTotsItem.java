package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TaterTotsItem extends Item {
	public TaterTotsItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(3f).build()));
	}
}