package com.digitalight.MedalsMod.init;

import com.digitalight.MedalsMod.item.ItemGoldMedal;
import com.digitalight.MedalsMod.item.ItemMedal;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Mike on 06/08/2014.
 */
public class ModItems {
    public static final ItemMedal goldMedal = new ItemGoldMedal();

    public static void init(){
        GameRegistry.registerItem(goldMedal, "GoldMedal");
    }
}
