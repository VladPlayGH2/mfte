package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ButteredPancakesItem extends Item {
	public ButteredPancakesItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(3.5f).build()));
	}
}