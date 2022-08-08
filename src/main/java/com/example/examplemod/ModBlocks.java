package com.example.examplemod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {







    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS,ExampleMod.MODID);
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,ExampleMod.MODID)



    // OUR ITEMS AND BLOCKS

    public static final RegistryObject<Item> ROCK= ITEMS.register("rock",()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
public static final RegistryObject<Block>POKEBLOCK=BLOCKS.register("pokeblock",()->new Block(AbstractBlock.Properties.of(Material.STONE)));
public static final RegistryObject<BlockItem>POKEBLOCK_ITEM=ITEMS.register("pokeblock_item",()->new BlockItem(POKEBLOCK.get(),new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
public static final RegistryObject<Item> PIKACHUAXE=ITEMS.register("pikachuaxe",()->new AxeItem(ItemTier.IRON,1,20.0f,new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
public static final RegistryObject<Item> POKEBALL=ITEMS.register("pokeball",()->new SnowballItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));



}

