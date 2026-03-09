package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HungerSushiItem extends Item {
	public HungerSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(12).saturationMod(14f).build()));
	}
}