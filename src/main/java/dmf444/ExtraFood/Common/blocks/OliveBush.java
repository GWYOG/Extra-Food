package dmf444.ExtraFood.Common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dmf444.ExtraFood.Client.ClientProxy;
import dmf444.ExtraFood.Core.OvenFoodTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by mincrmatt12. Do not copy this or you will have to face
 * our legal team. (dmf444)
 */
public class OliveBush extends Block{

    public IIcon wood;
    public IIcon leaves;

    public OliveBush() {
        super(Material.plants);
        this.setCreativeTab(OvenFoodTab.INSTANCE);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getRenderType() {
        return ClientProxy.oliveBushRender.getRenderId();
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        wood = p_149651_1_.registerIcon("minecraft:log_oak");
        leaves = p_149651_1_.registerIcon("extrafood:Plants/berries_stage_0");
    }
}
