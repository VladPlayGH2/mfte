package com.vladplay.mfte.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TeaLeavesItem extends Item {
	public TeaLeavesItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(1).saturationMod(0f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}