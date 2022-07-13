package com.eytangut.servermod.item;

import com.eytangut.servermod.ServerMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COLLECTION = FabricItemGroupBuilder.build(new Identifier(ServerMod.MOD_ID, "collection"), () -> new ItemStack(ModItems.BUG));
}
