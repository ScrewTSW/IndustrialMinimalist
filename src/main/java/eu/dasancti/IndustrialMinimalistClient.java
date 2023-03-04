package eu.dasancti;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndustrialMinimalistClient implements ClientModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("industrialminimalist");

    @Override
    public void onInitializeClient() {
        LOGGER.info("IndustrialMinimalistClient initialized.");
    }
}
