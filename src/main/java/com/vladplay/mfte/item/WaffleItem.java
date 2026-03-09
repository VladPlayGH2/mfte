package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class WaffleItem extends Item {
	public WaffleItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(4.8f).build()));
	}
}