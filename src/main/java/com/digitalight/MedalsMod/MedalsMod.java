package com.digitalight.MedalsMod;

import com.digitalight.MedalsMod.handler.ConfigurationHandler;
import com.digitalight.MedalsMod.init.ModItems;
import com.digitalight.MedalsMod.proxy.IProxy;
import com.digitalight.MedalsMod.reference.Reference;
import com.digitalight.MedalsMod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Mike on 05/08/2014.
 */

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MedalsMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static MedalsMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)

    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
