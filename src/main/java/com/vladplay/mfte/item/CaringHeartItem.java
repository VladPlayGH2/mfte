package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CaringHeartItem extends Item {
	public CaringHeartItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(5f).build()));
	}
}