package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class KiwifruitItem extends Item {
	public KiwifruitItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(3).saturationMod(2.1f).build()));
	}
}