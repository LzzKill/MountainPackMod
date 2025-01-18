package com.lzzkill.mountain.item;

import com.lzzkill.mountain.TheModPack;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

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

    private static final List<Item> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(COPPER_LATTICE);
        ITEMS.add(EMERALD_LATTICE);
        ITEMS.add(GOLD_LATTICE);
        ITEMS.add(IRON_LATTICE);
        ITEMS.add(QUARTZ_LATTICE);
        ITEMS.add(REDSTONE_LATTICE);
        ITEMS.add(TIN_LATTICE);
    }

    public static Item[] all() {
        return ITEMS.toArray(new Item[0]);
    }

}
