package com.lzzkill.mountain.item;

import com.lzzkill.mountain.TheModPack;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;

public class ItemLattice extends Item
{
    public ItemLattice(@Nonnull final String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(TheModPack.CREATIVE_TAB);
    }
}
