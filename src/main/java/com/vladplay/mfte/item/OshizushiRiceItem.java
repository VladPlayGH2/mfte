package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class OshizushiRiceItem extends Item {
	public OshizushiRiceItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(1.7f).build()));
	}
}