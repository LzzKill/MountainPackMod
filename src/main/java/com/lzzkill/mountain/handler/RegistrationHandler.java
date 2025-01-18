package com.lzzkill.mountain.handler;

import com.lzzkill.mountain.item.Items;
import com.lzzkill.mountain.model.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistrationHandler {
    @SubscribeEvent
    public static void ItemRegister(RegistryEvent.Register<Item> registryEvent)
    {
        registryEvent.getRegistry().registerAll(Items.COPPER_LATTICE, Items.EMERALD_LATTICE, Items.GOLD_LATTICE, Items.IRON_LATTICE, Items.QUARTZ_LATTICE, Items.REDSTONE_LATTICE, Items.TIN_LATTICE);
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : Items.all()) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModel();
            }
        }
    }
}
