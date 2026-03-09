package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class EnderDragonSushiItem extends Item {
	public EnderDragonSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(9).saturationMod(10.8f).build()));
	}
}