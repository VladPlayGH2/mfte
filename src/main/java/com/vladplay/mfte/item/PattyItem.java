package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PattyItem extends Item {
	public PattyItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(2.4f).meat().build()));
	}
}