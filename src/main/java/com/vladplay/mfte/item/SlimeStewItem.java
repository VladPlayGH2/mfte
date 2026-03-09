package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SlimeStewItem extends Item {
	public SlimeStewItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(3f).build()));
	}
}