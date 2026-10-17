package com.daubaue.soulboundswordmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulboundSwordMod implements ModInitializer {
    public static final String MOD_ID = "soulboundswordmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item SOULBOUND_SWORD = new SwordItem(
            ToolMaterials.DIAMOND,
            new FabricItemSettings().maxDamage(-1).fireproof()
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Soulbound Sword Mod");
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soulbound_sword"), SOULBOUND_SWORD);
    }
}