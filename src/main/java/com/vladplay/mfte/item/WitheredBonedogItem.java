package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class WitheredBonedogItem extends Item {
	public WitheredBonedogItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(7).saturationMod(8.4f).build()));
	}
}