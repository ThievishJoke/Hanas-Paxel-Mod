package net.hanas_paxel_mod.util;

import net.hanas_paxel_mod.HanasPaxelMod;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> PAXEL_MINEABLE = createTag("paxel_mineable");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HanasPaxelMod.MOD_ID, name));
        }
    }

    public static class Enchantents {

        private static TagKey<Enchantment> createTag(String name) {
            return TagKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(HanasPaxelMod.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> PAXELS =
                createTag("paxels");
        public static final TagKey<Item> PAXEL_ENCHANTABLE =
                createTag("paxel_enchantable");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HanasPaxelMod.MOD_ID, name));
        }
    }
}