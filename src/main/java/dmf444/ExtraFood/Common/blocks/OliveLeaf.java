package dmf444.ExtraFood.Common.blocks;


import dmf444.ExtraFood.Common.items.ItemLoader;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Random;

public class OliveLeaf extends BananaLeaf{

    public static final PropertyInteger  METALVL = PropertyInteger.create("growth", 0, 4);

    public OliveLeaf(){
        this.blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)).withProperty(METALVL, Integer.valueOf(0));
    }

    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        if(rand.nextInt() == 43 && ((Integer)state.getValue(METALVL)).intValue() < 4){
            world.setBlockState(pos, state.withProperty(METALVL, Integer.valueOf(((Integer) state.getValue(METALVL)).intValue() + 1)), 2);
        }

        super.updateTick(world, pos, state, rand);
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(BlockLoader.oliveBush);
    }

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        int meta = ((Integer)world.getBlockState(pos).getValue(METALVL)).intValue();
        if(meta < 4){
            return false;
        } else{
            if(!world.isRemote) {
                EntityItem olives = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemLoader.olive));
                world.spawnEntityInWorld(olives);
            }
        }
        return false;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {CHECK_DECAY, DECAYABLE, METALVL});
    }
}
