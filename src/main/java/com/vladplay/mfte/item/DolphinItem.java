package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DolphinItem extends Item {
	public DolphinItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(3).saturationMod(2.4f).meat().build()));
	}
}