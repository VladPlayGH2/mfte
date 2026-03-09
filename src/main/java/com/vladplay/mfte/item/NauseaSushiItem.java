package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class NauseaSushiItem extends Item {
	public NauseaSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(1.2f).build()));
	}
}