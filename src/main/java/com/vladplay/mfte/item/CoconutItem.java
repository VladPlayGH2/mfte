package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CoconutItem extends Item {
	public CoconutItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(3.6f).build()));
	}
}