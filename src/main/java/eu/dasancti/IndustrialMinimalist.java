package eu.dasancti;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndustrialMinimalist implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("industrialminimalist");

	@Override
	public void onInitialize() {
		LOGGER.info("IndustrialMinimalist mod initialized.");
	}
}