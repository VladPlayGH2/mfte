package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class InstantCakeItem extends Item {
	public InstantCakeItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(14).saturationMod(2.8f).build()));
	}
}