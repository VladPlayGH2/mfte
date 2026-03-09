package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GuardianEyeItem extends Item {
	public GuardianEyeItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.4f).build()));
	}
}