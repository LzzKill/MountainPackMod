package com.lzzkill.mountain;

import com.lzzkill.mountain.item.Items;
import com.lzzkill.mountain.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;


@Mod(modid = TheModPack.MODID, name = TheModPack.NAME, version = TheModPack.VERSION)
@Mod.EventBusSubscriber(modid = TheModPack.MODID)
public class TheModPack
{
    public static final String MODID = "modpack";
    public static final String NAME = "Mountain Mod Pack";
    public static final String VERSION = "1.0.0";

    private static final Logger logger = LogManager.getLogger();
    public static final CreativeTabs CREATIVE_TAB = new CreativeTabs(MODID)
    {
        @Override @Nonnull
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.IRON_LATTICE);
        }
    };

    public TheModPack()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SidedProxy(clientSide = "com.lzzkill.themodpack.proxy.CommonProxy", serverSide = "com.lzzkill.themodpack.proxy.ClientProxy")
    public static CommonProxy commonProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        commonProxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        commonProxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        commonProxy.postInit(event);
    }
}
