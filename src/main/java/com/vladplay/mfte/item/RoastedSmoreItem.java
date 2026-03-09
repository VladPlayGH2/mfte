package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RoastedSmoreItem extends Item {
	public RoastedSmoreItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(4.8f).build()));
	}
}