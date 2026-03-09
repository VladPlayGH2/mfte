package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class StuffedEndermiteItem extends Item {
	public StuffedEndermiteItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(3f).meat().build()));
	}
}