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
		oliveBushRender = new OliveBushRender();
		bushrender = new BerryRender();
		RenderingRegistry.registerBlockHandler(oliveBushRender.getRenderId(), oliveBushRender);
		RenderingRegistry.registerBlockHandler(bushrender);

		
		
	}
	@Override
	public void intermodComm(){
		//FMLInterModComms.sendMessage("Waila", "register", WailaConfig.class.getName() + ".callbackRegister");
	}
}

