package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SushiRiceItem extends Item {
	public SushiRiceItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(1.7f).build()));
	}
}