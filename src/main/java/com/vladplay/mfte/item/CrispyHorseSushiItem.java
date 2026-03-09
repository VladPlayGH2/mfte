package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CrispyHorseSushiItem extends Item {
	public CrispyHorseSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(7).saturationMod(6.3f).build()));
	}
}