package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class EdiblePumpkinSeedsItem extends Item {
	public EdiblePumpkinSeedsItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).build()));
	}
}