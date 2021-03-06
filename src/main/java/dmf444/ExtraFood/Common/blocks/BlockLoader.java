package dmf444.ExtraFood.Common.blocks;

import dmf444.ExtraFood.Common.blocks.Machines.*;
import dmf444.ExtraFood.Common.blocks.Plants.*;
import dmf444.ExtraFood.Common.blocks.tileentity.*;
import dmf444.ExtraFood.Common.fluids.FluidLoader;
import dmf444.ExtraFood.Common.fluids.GeneralFluid;
import dmf444.ExtraFood.Core.lib.BlockLib;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockLoader {

	public static Block bananaBunch;
	public static Block saplingBanana, saplingOrange;
	public static Block cheesePress;
	public static Block autoCutter;
	public static Block juiceBlender;
	public static Block oven;
	public static Block whiteout;
	public static Block Bbananajuice;
	public static Block Bstrawberryjuice;
	public static Block Beggnog;
	public static Block strawberryBush;
	public static Block Bcarrotjuice;
	public static Block bananaLeaf, oliveLeaf;
	public static Block peanutbush;
	public static Block tomatoCrop;
	public static Block lettuceCrop, pineappleCrop, grapeVine;
	public static Block juiceMixer;
	public static Block Chocake;
	public static Block oliveBush;
	public static Block BdiscustingMix, BappleJuice, BorangeJuice, BwatermelonJuice, Bgrapejuice, Bapplegrapejuice, Bcitusjuice, BpinappleJuice, BfruitJuice, BmixedberryJuice, tropicalJuice, strawberryBananaJuice;
	public static Block OrangeBlock;
	
	public static boolean Register=false;
	
	public static void initiateBlocks() {
		bananaBunch = new BananaBlock(Material.cactus).setUnlocalizedName(BlockLib.bBB);
		saplingBanana = new BananaTreeSapling().setUnlocalizedName(BlockLib.bBS);
		cheesePress = new CheesePress().setUnlocalizedName(BlockLib.bCP).setHardness(1.5F);
		autoCutter = new AutoCutter().setUnlocalizedName(BlockLib.bAC).setHardness(2.0F);
		juiceBlender = new BlockJuiceBlender().setUnlocalizedName(BlockLib.bJB).setHardness(1.5F);
		oven = new Oven().setUnlocalizedName(BlockLib.bO);
		whiteout = new Whiteout().setUnlocalizedName(BlockLib.bTWB).setHardness(1.5F);
        bananaLeaf = new BananaLeaf().setUnlocalizedName(BlockLib.bBL);
        peanutbush = new PeanutBush(Material.plants).setUnlocalizedName(BlockLib.bPB);
        tomatoCrop = new CropBlock("tomato").setUnlocalizedName(BlockLib.bCT);
        lettuceCrop = new CropBlock("lettuce").setUnlocalizedName(BlockLib.bCL);
        juiceMixer = new BlockJuiceMixer().setUnlocalizedName(BlockLib.bJM);
        Chocake = new ChocolateCake().setUnlocalizedName(BlockLib.bCake);
        strawberryBush = new StrawberryBush(Material.plants).setUnlocalizedName(BlockLib.bSB);
		oliveBush = new OliveTreeSapling().setUnlocalizedName(BlockLib.bOliveBush);
		oliveLeaf = new OliveLeaf().setUnlocalizedName(BlockLib.bOliveLeaf);
		OrangeBlock = new OrangeBlock().setUnlocalizedName(BlockLib.bBlockOrange);
		pineappleCrop = new CropBlock("pineapple").setUnlocalizedName(BlockLib.bPineappleCrop);
		grapeVine = new GrapeVines().setUnlocalizedName(BlockLib.bGrapeVine);
		saplingOrange = new OrangeTreeSapling().setUnlocalizedName(BlockLib.ORANGE_SAPLING);

		//Fluid Blocks
		Bbananajuice = new GeneralFluid(FluidLoader.Fbananajuice, Material.water).setUnlocalizedName(BlockLib.bFluidBan);
		Beggnog = new GeneralFluid(FluidLoader.FEggnog, Material.water).setUnlocalizedName(BlockLib.bFluidEgg);
		Bstrawberryjuice = new GeneralFluid(FluidLoader.Fstrawberryjuice, Material.water).setUnlocalizedName(BlockLib.bFluidStraw);
		Bcarrotjuice = new GeneralFluid(FluidLoader.Fcarrotjuice, Material.water).setUnlocalizedName(BlockLib.bFluidCarrot);
		BdiscustingMix = new GeneralFluid(FluidLoader.FHorribleLiquid, Material.water).setUnlocalizedName(BlockLib.bDisgustingMix);
		BappleJuice = new GeneralFluid(FluidLoader.Fapplejuice, Material.water).setUnlocalizedName(BlockLib.bAppleJuice);
		BorangeJuice = new GeneralFluid(FluidLoader.Forangejuice, Material.water).setUnlocalizedName(BlockLib.bOrangeJuice);
		BwatermelonJuice = new GeneralFluid(FluidLoader.Fwatermelonjuice, Material.water).setUnlocalizedName(BlockLib.bMelonJuice);
		Bgrapejuice = new GeneralFluid(FluidLoader.Fgrapejuice, Material.water).setUnlocalizedName(BlockLib.GRAPE_JUICE_BLOCK);
		Bapplegrapejuice = new GeneralFluid(FluidLoader.Fapplegrapejuice, Material.water).setUnlocalizedName(BlockLib.APPLE_GRAPE_JUICE_BLOCK);
		Bcitusjuice = new GeneralFluid(FluidLoader.Fcitusjuice, Material.water).setUnlocalizedName(BlockLib.CITRUS_JUICE_BLOCK);
		BpinappleJuice = new GeneralFluid(FluidLoader.FpinappleJuice, Material.water).setUnlocalizedName(BlockLib.PINEAPPLE_JUICE_BLOCK);
		BfruitJuice = new GeneralFluid(FluidLoader.Ffruitjuice, Material.water).setUnlocalizedName(BlockLib.FRUIT_JUICE_BLOCK);
		strawberryBananaJuice = new GeneralFluid(FluidLoader.Fstrawberrybanana, Material.water).setUnlocalizedName(BlockLib.STRAWBERRY_BANANA_JUICE);
		BmixedberryJuice = new GeneralFluid(FluidLoader.Fmixedberryjuice, Material.water).setUnlocalizedName(BlockLib.MIXED_BERRY_JUICE);
		tropicalJuice = new GeneralFluid(FluidLoader.Ftropicaljuice, Material.water).setUnlocalizedName(BlockLib.TROPICAL_JUICE);

		
		registerBlocks();
	}
	private static void registerBlocks() {
		if(!Register){
			GameRegistry.registerBlock(bananaBunch, BlockLib.bBB);
			GameRegistry.registerBlock(saplingBanana, BlockLib.bBS);
			GameRegistry.registerBlock(cheesePress, BlockLib.bCP);
			GameRegistry.registerBlock(autoCutter, BlockLib.bAC);
			GameRegistry.registerBlock(juiceBlender, BlockLib.bJB);
			GameRegistry.registerBlock(oven, BlockLib.bO);
			GameRegistry.registerBlock(whiteout, BlockLib.bTWB);
			GameRegistry.registerBlock(Bbananajuice, BlockLib.bFluidBan);
			GameRegistry.registerBlock(Bstrawberryjuice, BlockLib.bFluidStraw);
			GameRegistry.registerBlock(Beggnog, BlockLib.bFluidEgg);
            GameRegistry.registerBlock(Bcarrotjuice, BlockLib.bFluidCarrot);
			GameRegistry.registerBlock(strawberryBush, BlockLib.bSB);
			GameRegistry.registerBlock(bananaLeaf, BlockLib.bBL);
			GameRegistry.registerBlock(peanutbush, BlockLib.bPB);
			GameRegistry.registerBlock(tomatoCrop, BlockLib.bCT);
			GameRegistry.registerBlock(lettuceCrop, BlockLib.bCL);
			GameRegistry.registerBlock(juiceMixer, BlockLib.bJM);
			GameRegistry.registerBlock(Chocake, BlockLib.bCake);
			GameRegistry.registerBlock(oliveBush, BlockLib.bOliveBush);
			GameRegistry.registerBlock(oliveLeaf, BlockLib.bOliveLeaf);
			GameRegistry.registerBlock(BdiscustingMix, BlockLib.bDisgustingMix);
			GameRegistry.registerBlock(OrangeBlock, BlockLib.bBlockOrange);
			GameRegistry.registerBlock(BappleJuice, BlockLib.bAppleJuice);
			GameRegistry.registerBlock(BorangeJuice, BlockLib.bOrangeJuice);
			GameRegistry.registerBlock(BwatermelonJuice, BlockLib.bMelonJuice);
			GameRegistry.registerBlock(pineappleCrop, BlockLib.bPineappleCrop);
			GameRegistry.registerBlock(grapeVine, BlockLib.bGrapeVine);
			GameRegistry.registerBlock(Bapplegrapejuice, BlockLib.APPLE_GRAPE_JUICE_BLOCK);
			GameRegistry.registerBlock(Bgrapejuice, BlockLib.GRAPE_JUICE_BLOCK);
			GameRegistry.registerBlock(Bcitusjuice, BlockLib.CITRUS_JUICE_BLOCK);
			GameRegistry.registerBlock(BpinappleJuice, BlockLib.PINEAPPLE_JUICE_BLOCK);
			GameRegistry.registerBlock(saplingOrange, BlockLib.ORANGE_SAPLING);
			GameRegistry.registerBlock(BfruitJuice, BlockLib.FRUIT_JUICE_BLOCK);
			GameRegistry.registerBlock(BmixedberryJuice, BlockLib.MIXED_BERRY_JUICE);
			GameRegistry.registerBlock(tropicalJuice, BlockLib.TROPICAL_JUICE);
			GameRegistry.registerBlock(strawberryBananaJuice, BlockLib.STRAWBERRY_BANANA_JUICE);
		}
		Register=true;
	}
	
	public static void initTileEntity() {
		GameRegistry.registerTileEntity(CheesePressTileEntity.class, BlockLib.bCP);
		GameRegistry.registerTileEntity(AutoCutterTileEntity.class, BlockLib.bAC);
		GameRegistry.registerTileEntity(TileEntityJuiceBlender.class, BlockLib.bJB);
		GameRegistry.registerTileEntity(TileEntityOven.class, BlockLib.bO);
		GameRegistry.registerTileEntity(JuiceMixerTileEntity.class, BlockLib.bJM);
	}
	
}

