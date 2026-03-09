package com.vladplay.mfte.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.vladplay.mfte.procedures.ZombieHaunchPlayerFinishesUsingItemProcedure;

public class ZombieHaunchItem extends Item {
	public ZombieHaunchItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(8).saturationMod(5f).meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		ZombieHaunchPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}