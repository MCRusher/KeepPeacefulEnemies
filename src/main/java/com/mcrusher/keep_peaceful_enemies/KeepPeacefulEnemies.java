package com.mcrusher.keep_peaceful_enemies;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeepPeacefulEnemies implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("keep_peaceful_enemies");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Keep Peaceful Enemies has been initialized!");
	}
}
