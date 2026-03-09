package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class WinterWrapItem extends Item {
	public WinterWrapItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(7.2f).build()));
	}
}