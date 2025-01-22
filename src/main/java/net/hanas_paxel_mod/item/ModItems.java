package net.hanas_paxel_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hanas_paxel_mod.HanasPaxelMod;
import net.hanas_paxel_mod.item.custom.ModToolMaterials;
import net.hanas_paxel_mod.item.custom.PaxelItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STONE_PAXEL = registerItem("stone_paxel",
            new PaxelItem(ModToolMaterials.PAXEL_STONE,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.STONE, 4, -2.5f))));
    public static final Item IRON_PAXEL = registerItem("iron_paxel",
            new PaxelItem(ModToolMaterials.PAXEL_IRON,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.5f))));
    public static final Item GOLDEN_PAXEL = registerItem("golden_paxel",
            new PaxelItem(ModToolMaterials.PAXEL_GOLD,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -2.5f))));
    public static final Item DIAMOND_PAXEL = registerItem("diamond_paxel",
            new PaxelItem(ModToolMaterials.PAXEL_DIAMOND,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 4, -2.5f))));
    public static final Item NETHERITE_PAXEL = registerItem("netherite_paxel",
            new PaxelItem(ModToolMaterials.PAXEL_NETHERITE,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 4, -2.5f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HanasPaxelMod.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
    }

    public static void registerModItems() {
        HanasPaxelMod.LOGGER.info("Registering Mod Items for " + HanasPaxelMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}