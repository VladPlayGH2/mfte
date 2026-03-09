package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HoneydewSliceItem extends Item {
	public HoneydewSliceItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(2).saturationMod(1.2f).build()));
	}
}