package com.eytangut.servermod.item;

import com.eytangut.servermod.ServerMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static void registerModItems() {
        ServerMod.LOGGER.debug("Registring Mod Items");
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ServerMod.MOD_ID, name), item);
    }
    public static final Item TEN_DICE = registerItem("ten_dice", new Item(new FabricItemSettings().group(ModItemGroup.COLLECTION).maxCount(1)));
    public static final Item ONE_HUNDRED_DICE = registerItem("one_hundred_dice", new Item(new FabricItemSettings().group(ModItemGroup.COLLECTION).maxCount(1)));
    public static final Item ONE_THOUSAND_DICE = registerItem("one_thousand_dice", new Item(new FabricItemSettings().group(ModItemGroup.COLLECTION).maxCount(1)));
    public static final Item BUG = registerItem("bug", new Item(new FabricItemSettings().group(ModItemGroup.COLLECTION).maxCount(48)));
}
