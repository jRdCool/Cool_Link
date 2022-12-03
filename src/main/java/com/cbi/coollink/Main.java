package com.cbi.coollink;

import com.cbi.coollink.blocks.AIO_Network;
import com.cbi.coollink.blocks.TestBlock;
import com.cbi.coollink.items.SmartPhone;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("cool-link");

    @Override
    public void onInitialize() {
        LOGGER.info("loading cool link");
        Registry.register(Registry.BLOCK, new Identifier("cool-link","test_block"),TestBlock.ENTRY);
        Registry.register(Registry.ITEM, new Identifier("cool-link", "test_block"),new BlockItem(TestBlock.ENTRY, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.BLOCK, new Identifier("cool-link","aio_network"), AIO_Network.ENTRY);
        Registry.register(Registry.ITEM, new Identifier("cool-link", "aio_network"),new BlockItem(AIO_Network.ENTRY, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier("cool-link", "smart_phone"),new SmartPhone(new FabricItemSettings().group(ItemGroup.MISC)));
    }
}