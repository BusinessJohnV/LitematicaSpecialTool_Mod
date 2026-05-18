package com.businessjohnv.litematicaspecialtoolmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.businessjohnv.litematicaspecialtoolmod.litematicatool.ModItems;
import com.businessjohnv.litematicaspecialtoolmod.tabs.ModItemGroups;

public class LitematicaSpecialTool implements ModInitializer {
	public static final String MOD_ID = "litematicaspecialtoolmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModItemGroups.register();
	}
}