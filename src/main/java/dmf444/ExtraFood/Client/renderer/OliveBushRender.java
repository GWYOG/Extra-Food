package dmf444.ExtraFood.Client.renderer;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import dmf444.ExtraFood.Common.blocks.OliveBush;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

/**
 * Created by mincrmatt12. Do not copy this or you will have to face
 * our legal team. (dmf444)
 */
public class OliveBushRender implements ISimpleBlockRenderingHandler{


    static int myRenderID;


    public OliveBushRender() {
        BerryRender.myRenderID = RenderingRegistry.getNextAvailableRenderId();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {

    }

    public void draw(int x, int y, int z, IIcon icon_wood, IIcon icon_top) {

        Tessellator tes = Tessellator.instance;
        tes.startDrawingQuads();

        double mv = (double) icon_wood.getMinV();
        double mu = (double) icon_wood.getMinU();
        double xv = (double) icon_wood.getMaxV();
        double xu = (double) icon_wood.getMaxU();

        // -y quad

        tes.addVertexWithUV(x+.375, y, z+.375, mu, mv);
        tes.addVertexWithUV(x+.625, y, z+.375, xu, mv);
        tes.addVertexWithUV(x+.625, y, z+.625, xu, xv);
        tes.addVertexWithUV(x+.375, y, z+.625, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // +x quad

        tes.addVertexWithUV(x+.375, y, z+.375, mu, mv);
        tes.addVertexWithUV(x+.375, y+.375, z+.375, xu, mv);
        tes.addVertexWithUV(x+.375, y+.375, z+.625, xu, xv);
        tes.addVertexWithUV(x+.375, y, z+.625, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // -x quad

        tes.addVertexWithUV(x+.625, y, z+.375, mu, mv);
        tes.addVertexWithUV(x+.625, y+.375, z+.375, xu, mv);
        tes.addVertexWithUV(x+.625, y+.375, z+.625, xu, xv);
        tes.addVertexWithUV(x+.625, y, z+.625, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // +z quad

        tes.addVertexWithUV(x+.375, y, z+.375, mu, mv);
        tes.addVertexWithUV(x+.375, y+.375, z+.375, xu, mv);
        tes.addVertexWithUV(x+.625, y+.375, z+.375, xu, xv);
        tes.addVertexWithUV(x+.625, y, z+.375, xu, mv);
        tes.draw();

        tes.startDrawingQuads();
        // -z quad

        tes.addVertexWithUV(x+.375, y, z+.625, mu, mv);
        tes.addVertexWithUV(x+.375, y+.375, z+.625, xu, mv);
        tes.addVertexWithUV(x+.625, y+.375, z+.625, xu, xv);
        tes.addVertexWithUV(x+.625, y, z+.625, xu, mv);
        tes.draw();

        tes.startDrawingQuads();
        mv = (double) icon_top.getMinV();
        mu = (double) icon_top.getMinU();
        xv = (double) icon_top.getMaxV();
        xu = (double) icon_top.getMaxU();


        // -y quad

        tes.addVertexWithUV(x+.1875, y+.375, z+.1875, mu, mv);
        tes.addVertexWithUV(x+.8125, y+.375, z+.1875, xu, mv);
        tes.addVertexWithUV(x+.8125, y+.375, z+.8125, xu, xv);
        tes.addVertexWithUV(x+.1875, y+.375, z+.8125, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // +y quad

        tes.addVertexWithUV(x+.1875, y+1, z+.1875, mu, mv);
        tes.addVertexWithUV(x+.8125, y+1, z+.1875, xu, mv);
        tes.addVertexWithUV(x+.8125, y+1, z+.8125, xu, xv);
        tes.addVertexWithUV(x+.1875, y+1, z+.8125, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // -z quad

        tes.addVertexWithUV(x+.1875, y+.375, z+.1875, mu, mv);
        tes.addVertexWithUV(x+.8125, y+.375, z+.1875, xu, mv);
        tes.addVertexWithUV(x+.8125, y+1, z+.1875, xu, xv);
        tes.addVertexWithUV(x+.1875, y+1, z+.1875, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // +z quad

        tes.addVertexWithUV(x+.1875, y+.375, z+.8125, mu, mv);
        tes.addVertexWithUV(x+.8125, y+.375, z+.8125, xu, mv);
        tes.addVertexWithUV(x+.8125, y+1, z+.8125, xu, xv);
        tes.addVertexWithUV(x+.1875, y+1, z+.8125, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // -x quad

        tes.addVertexWithUV(x+.1875, y+.375, z+.1875, mu, mv);
        tes.addVertexWithUV(x+.1875, y+.375, z+.8125, xu, mv);
        tes.addVertexWithUV(x+.1875, y+1, z+.8125, xu, xv);
        tes.addVertexWithUV(x+.1875, y+1, z+.1875, mu, xv);
        tes.draw();

        tes.startDrawingQuads();
        // +x quad

        tes.addVertexWithUV(x+.8125, y+.375, z+.1875, mu, mv);
        tes.addVertexWithUV(x+.8125, y+.375, z+.8125, xu, mv);
        tes.addVertexWithUV(x+.8125, y+1, z+.8125, xu, xv);
        tes.addVertexWithUV(x+.8125, y+1, z+.1875, mu, xv);




    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {

        OliveBush b = (OliveBush) block;
        draw(x, y, z, b.wood, b.leaves);

        return true;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return true;
    }

    @Override
    public int getRenderId() {
        return myRenderID;
    }
}
