package net.robin.compactor.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.robin.compactor.Compactor;
import net.robin.compactor.common.items.depthMeasure;

public class modItems {

    public static Item registerItems(String id, Item item) {
//        // Create an identifier for the item
//        Identifier itemID = Identifier.of(Compactor.MOD_ID, id);
//
//        // Registers the item
//        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
//
//        // Return the registered item
//        return registeredItem;

        return Registry.register(Registries.ITEM, Identifier.of(Compactor.MOD_ID, id), item);
    }


    public static final FoodComponent flesh_pile_component = new FoodComponent.Builder()
        .nutrition(-8)
        .saturationModifier(0.0f)
        .alwaysEdible()
        .statusEffect(new StatusEffectInstance(modEffects.mystery_illness, 3600, 0), 1.0f)
        .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 3600, 0), 1.0f)
        .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 3600, 9), 1.0f)
        .build();

    public static final FoodComponent spider_eye_jar_component = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(0.0f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(modEffects.lethal_poison, 3600, 0), 1.0f)
            .build();

//    public static final Item depth_measure = registerItems("depth_measure", new depthMeasure(new Item.Settings().maxCount(16)));
    public static final Item arrow_bundle = registerItems("bundle_of_arrows", new Item(new Item.Settings()));
    public static final Item spectral_arrow_bundle = registerItems("bundle_of_spectral_arrows", new Item(new Item.Settings()));
    public static final Item flesh_pile = registerItems("questionable_meat_sack", new Item(new Item.Settings().food(flesh_pile_component)));
    public static final Item spider_eye_jar = registerItems("jar_of_spider_eyes", new Item(new Item.Settings().food(spider_eye_jar_component)));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(arrow_bundle);
        entries.add(spectral_arrow_bundle);
    }

    private static void addItemsToIngredientsFoodGroup(FabricItemGroupEntries entries) {
        entries.add(flesh_pile);
        entries.add(spider_eye_jar);
    }

    public static void registerItems() {
        Compactor.LOGGER.info("Registering mod items for " + Compactor.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(modItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(modItems::addItemsToIngredientsFoodGroup);
    }

}
