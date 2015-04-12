package dmf444.ExtraFood.Common.EventHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import dmf444.ExtraFood.Common.blocks.BlockLoader;
import dmf444.ExtraFood.Common.items.ItemLoader;
import dmf444.ExtraFood.Core.AchieveLoad;
import dmf444.ExtraFood.util.EFLog;
 
public class CraftingAchievements{

	@SubscribeEvent
	public void onCrafting(PlayerEvent.ItemCraftedEvent event){
		Item item = event.crafting.getItem();
		EntityPlayer thePlayer = event.player;
 
			if (item.equals(Item.getItemFromBlock(BlockLoader.cheesePress))){
				event.player.addStat(AchieveLoad.cheesePress, 1);
			}else if (item.equals(ItemLoader.knife)){
				EFLog.error("PING!");
				event.player.addStat(AchieveLoad.obtainKnife, 1);
			}

	}
 
	@SubscribeEvent
	public void onSmelting(PlayerEvent.ItemSmeltedEvent event) {
		Item item = event.smelting.getItem();
		EntityPlayer p = event.player;
  	}
}

