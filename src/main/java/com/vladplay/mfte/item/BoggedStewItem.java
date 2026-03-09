package com.vladplay.mfte.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BoggedStewItem extends Item {
	public BoggedStewItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(8).saturationMod(9.6f).build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}
}