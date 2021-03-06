/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 * 
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.farming;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Collection;

public interface IFarmLogic {

	int getFertilizerConsumption();

	int getWaterConsumption(float hydrationModifier);

	boolean isAcceptedResource(ItemStack itemstack);

	boolean isAcceptedGermling(ItemStack itemstack);

	Collection<ItemStack> collect();

	boolean cultivate(BlockPos pos, EnumFacing direction, int extent);

	Collection<ICrop> harvest(BlockPos pos, EnumFacing direction, int extent);

	IFarmLogic setManual(boolean manual);

	@SideOnly(Side.CLIENT)
    Item getIcon();

	ResourceLocation getSpriteSheet();
	
	String getName();
}
