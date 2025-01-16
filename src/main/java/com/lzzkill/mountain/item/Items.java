package com.lzzkill.mountain.item;

import com.lzzkill.mountain.TheModPack;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TheModPack.MODID)
public class Items
{
    public static final Item COPPER_LATTICE = new ItemLattice("item_copper_lattice");
    public static final Item EMERALD_LATTICE = new ItemLattice("item_emerald_lattice");
    public static final Item GOLD_LATTICE = new ItemLattice("item_gold_lattice");
    public static final Item IRON_LATTICE = new ItemLattice("item_iron_lattice");
    public static final Item QUARTZ_LATTICE = new ItemLattice("item_quartz_lattice");
    public static final Item REDSTONE_LATTICE = new ItemLattice("item_redstone_lattice");
    public static final Item TIN_LATTICE = new ItemLattice("item_tin_lattice");
//    public static final Item _LATTICE = new ItemLattice("item__lattice");

    @SubscribeEvent
    public static void ItemRegister(RegistryEvent.Register<Item> registryEvent)
    {
        registryEvent.getRegistry().registerAll(COPPER_LATTICE, EMERALD_LATTICE, GOLD_LATTICE, IRON_LATTICE, QUARTZ_LATTICE, REDSTONE_LATTICE, TIN_LATTICE);
    }
}
