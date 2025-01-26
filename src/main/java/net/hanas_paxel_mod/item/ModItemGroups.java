package net.hanas_paxel_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hanas_paxel_mod.HanasPaxelMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PAXEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasPaxelMod.MOD_ID, "paxels"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paxels"))
                    .icon(() -> new ItemStack(ModItems.STONE_PAXEL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WOOD_PAXEL);
                        entries.add(ModItems.STONE_PAXEL);
                        entries.add(ModItems.IRON_PAXEL);
                        entries.add(ModItems.GOLDEN_PAXEL);
                        entries.add(ModItems.DIAMOND_PAXEL);
                        entries.add(ModItems.NETHERITE_PAXEL);

                    }).build());

    public static void registerItemGroups() {
        HanasPaxelMod.LOGGER.info("Registering Item Groups for " + HanasPaxelMod.MOD_ID);
    }
}