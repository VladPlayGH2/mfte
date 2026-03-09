package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class InstantDamageHeartItem extends Item {
	public InstantDamageHeartItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.2f).meat().build()));
	}
}