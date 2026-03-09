package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class WitherSkullSubItem extends Item {
	public WitherSkullSubItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(8).saturationMod(9.6f).build()));
	}
}