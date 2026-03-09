package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class NightVisionSushiItem extends Item {
	public NightVisionSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(3f).build()));
	}
}