package dmf444.ExtraFood.Common.blocks.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import dmf444.ExtraFood.Common.blocks.tileentity.AutoCutterTileEntity;
import dmf444.ExtraFood.Common.items.ItemLoader;


public class AutoCutterContainer extends Container {

    protected AutoCutterTileEntity tileEntity;
    private int localTime;

    public AutoCutterContainer (InventoryPlayer inventoryPlayer, AutoCutterTileEntity te){
            tileEntity = te;

            //the Slot constructor takes the IInventory and the slot number in that it binds to
            //and the x-y coordinates it resides on-screen
            this.addSlotToContainer(new Slot(te, 0, 80, 24));
            this.addSlotToContainer(new Slot(te, 1, 80, 56));
            this.addSlotToContainer(new SlotFilter(te, 2, 147, 24, ItemLoader.knife));
			
            //commonly used vanilla code that adds the player's inventory
            bindPlayerInventory(inventoryPlayer);
    }
    @Override
    public void addCraftingToCrafters(ICrafting crafters)
    {
        super.addCraftingToCrafters(crafters);
        crafters.sendProgressBarUpdate(this, 0, this.tileEntity.complete);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.localTime != this.tileEntity.getTotalTime())
            {
                icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.getTotalTime());
            }
        }

        this.localTime = this.tileEntity.getTotalTime();
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int arg1, int arg2)
    {
        if (arg1 == 0)
        {
            this.tileEntity.ResetTiming(arg2);
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
            return tileEntity.isUseableByPlayer(player);
    }


    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
            for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 9; j++) {
                            addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                                            8 + j * 18, 84 + i * 18));
                    }
            }

            for (int i = 0; i < 9; i++) {
                    addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
            }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
            ItemStack stack = null;
            Slot slotObject = (Slot) inventorySlots.get(slot);

            //null checks and checks if the item can be stacked (maxStackSize > 1)
            if (slotObject != null && slotObject.getHasStack()) {
                    ItemStack stackInSlot = slotObject.getStack();
                    stack = stackInSlot.copy();

                    //merges the item into player inventory since its in the tileEntity
                    if (slot < 9) {
                            if (!this.mergeItemStack(stackInSlot, 0, 35, true)) {
                                    return null;
                            }
                    }
                    //places it into the tileEntity is possible since its in the player inventory
                    else if (!this.mergeItemStack(stackInSlot, 0, 9, false)) {
                            return null;
                    }

                    if (stackInSlot.stackSize == 0) {
                            slotObject.putStack(null);
                    } else {
                            slotObject.onSlotChanged();
                    }

                    if (stackInSlot.stackSize == stack.stackSize) {
                            return null;
                    }
                    slotObject.onPickupFromSlot(player, stackInSlot);
            }
            return stack;
    }
}
