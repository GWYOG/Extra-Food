/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 * 
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.core;

import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Provides icons, needed in some interfaces, most notably for bees and trees. 
 */
public interface IIconProvider {
	
	@SideOnly(Side.CLIENT)
	Item getIcon(short texUID);
	
	@SideOnly(Side.CLIENT)
	void registerIcons(Item register);

}
