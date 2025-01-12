package net.hanas_paxel_mod;

import net.fabricmc.api.ModInitializer;
import net.hanas_paxel_mod.item.ModItemGroups;
import net.hanas_paxel_mod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HanasPaxelMod implements ModInitializer {
    public static final String MOD_ID = "hanas_paxel_mod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
    }
}
