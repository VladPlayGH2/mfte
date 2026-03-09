package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GuardianBrothItem extends Item {
	public GuardianBrothItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).build()));
	}
}