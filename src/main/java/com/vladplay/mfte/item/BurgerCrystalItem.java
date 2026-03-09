package com.vladplay.mfte.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BurgerCrystalItem extends Item {
	public BurgerCrystalItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(13).saturationMod(1.3f).build()));
	}
}