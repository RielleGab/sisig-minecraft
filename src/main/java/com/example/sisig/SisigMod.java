package com.example.sisig;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public final class SisigMod implements ModInitializer {
    public static final String MOD_ID = "sisig";

    private static final ResourceKey<Item> SISIG_KEY = ResourceKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "sisig")
    );

    private static final ResourceKey<CreativeModeTab> FOOD_TAB = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath("minecraft", "food_and_drinks")
    );

    private static final FoodProperties SISIG_FOOD = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.0F)
            .build();

    public static final Item SISIG = Registry.register(
            BuiltInRegistries.ITEM,
            SISIG_KEY,
            new Item(new Item.Properties()
                    .setId(SISIG_KEY)
                    .food(SISIG_FOOD)
                    .stacksTo(16)
                    .usingConvertsTo(Items.BOWL))
    );

    @Override
    public void onInitialize() {
        CreativeModeTabEvents.modifyOutputEvent(FOOD_TAB)
                .register(output -> output.accept(SISIG));
    }
}
