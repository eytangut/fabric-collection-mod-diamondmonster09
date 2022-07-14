package com.eytangut.servermod.block;

import com.eytangut.servermod.ServerMod;
import com.eytangut.servermod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
   public static void registerModBlocks(){

   }
   public static final Block BUGB = registerBlock("bug_block", new Block(FabricBlockSettings.of(Material.METAL)), ModItemGroup.COLLECTION, 48);
   private static Block registerBlock(String name, Block block, ItemGroup tab, int count){
      registerBlockItem(name, block, tab, count);
      return Registry.register(Registry.BLOCK, new Identifier(ServerMod.MOD_ID, name), block);
   }
   private static Item registerBlockItem(String name, Block block, ItemGroup tab, int count){
      return Registry.register(Registry.ITEM, new Identifier(ServerMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab).maxCount(count)));

   }
}
