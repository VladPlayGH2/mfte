package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ShulkerSpaghettiItem extends Item {
	public ShulkerSpaghettiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(7).saturationMod(8.4f).build()));
	}
}