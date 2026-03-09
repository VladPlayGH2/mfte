package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class NachoItem extends Item {
	public NachoItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(2.8f).build()));
	}
}