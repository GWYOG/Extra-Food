/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 * 
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.world;

import com.mojang.authlib.GameProfile;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public interface ITreeGenData {

	int getGirth(World world, BlockPos pos);

	float getHeightModifier();

	boolean canGrow(World world, BlockPos pos, int expectedGirth, int expectedHeight);

	void setLeaves(World world, GameProfile owner, BlockPos pos);

	boolean allowsFruitBlocks();

	boolean trySpawnFruitBlock(World world, BlockPos pos);

	Item getGenome();
}
