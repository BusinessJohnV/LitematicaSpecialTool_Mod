package com.businessjohnv.litematicaspecialtoolmod.tabs;

import com.businessjohnv.litematicaspecialtoolmod.LitematicaSpecialTool;
import com.businessjohnv.litematicaspecialtoolmod.litematicatool.ModItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LITEMATICASPECIALTOOLGROUP = Registry.register(
        Registries.ITEM_GROUP, 
        Identifier.of(LitematicaSpecialTool.MOD_ID), 
        FabricItemGroup.builder().icon(
            () -> new ItemStack(ModItems.LITEMATICASPECIALTOOL)
        )
        .displayName(
            Text.translatable("itemgroup.litematicaspecialtool.tab")
        )
        .entries((displayContext, entries) -> {
            entries.add(ModItems.LITEMATICASPECIALTOOL);
        })
        .build()
    );

    public static void register() {
        LitematicaSpecialTool.LOGGER.info("Registering Item Groups for " + LitematicaSpecialTool.MOD_ID);
    }
}
