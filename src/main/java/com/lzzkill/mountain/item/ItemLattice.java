package com.lzzkill.mountain.item;

import com.lzzkill.mountain.TheModPack;
import com.lzzkill.mountain.model.IHasModel;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;

public class ItemLattice extends Item implements IHasModel
{
    public ItemLattice(@Nonnull final String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(TheModPack.CREATIVE_TAB);
    }

    @Override
    public void registerModel() {
        TheModPack.commonProxy.registerItemRenderer(this, 0, "inventory");
    }
}
