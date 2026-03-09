package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PotatoEyeSushiItem extends Item {
	public PotatoEyeSushiItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(4f).build()));
	}
}