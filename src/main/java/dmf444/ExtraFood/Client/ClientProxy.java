package dmf444.ExtraFood.Client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import dmf444.ExtraFood.Client.renderer.*;
import dmf444.ExtraFood.Common.CommonProxy;
import dmf444.ExtraFood.Common.blocks.tileentity.*;

public class ClientProxy extends CommonProxy{

	public static BerryRender bushrender;
	public static OliveBushRender oliveBushRender;
	
	public void registerRenderers(){ 
		ClientRegistry.bindTileEntitySpecialRenderer(CheesePressTileEntity.class, new CheesePressRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(AutoCutterTileEntity.class, new AutoCutterRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityJuiceBlender.class, new RendererJuiceBlender());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOven.class, new RenderOven());
		ClientRegistry.bindTileEntitySpecialRenderer(JuiceMixerTileEntity.class, new JuiceMixerRenderer());
		//JuiceRegistry.instance = new JuiceRegistry();
		bushrender = new BerryRender();
		oliveBushRender = new OliveBushRender();
		RenderingRegistry.registerBlockHandler(bushrender);
		RenderingRegistry.registerBlockHandler(oliveBushRender);
		
		
	}
	@Override
	public void intermodComm(){
		//FMLInterModComms.sendMessage("Waila", "register", WailaConfig.class.getName() + ".callbackRegister");
	}
}

