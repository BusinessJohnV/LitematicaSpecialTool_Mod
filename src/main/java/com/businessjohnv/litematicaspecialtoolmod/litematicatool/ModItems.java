package com.businessjohnv.litematicaspecialtoolmod.litematicatool;

import com.businessjohnv.litematicaspecialtoolmod.LitematicaSpecialTool;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LITEMATICASPECIALTOOL = registerItem("litematicaspecialtool", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LitematicaSpecialTool.MOD_ID, name), item);
    }

    public static void register() {
        LitematicaSpecialTool.LOGGER.info("Registering Mod Items for " + LitematicaSpecialTool.MOD_ID);

        // ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
        //     entries.add(LITEMATICASPECIALTOOL);
        // });
    }
}
