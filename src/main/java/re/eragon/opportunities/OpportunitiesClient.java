package re.eragon.opportunities;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import re.eragon.opportunities.fireworkStar.FireworkStarTableScreen;
import re.eragon.opportunities.fireworkTable.FireworkTableScreen;

@Environment(EnvType.CLIENT)
public class OpportunitiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(Opportunities.FIREWORK_TABLE_SCREEN_HANDLER, FireworkTableScreen::new);
        ScreenRegistry.register(Opportunities.FIREWORK_STAR_TABLE_SCREEN_HANDLER, FireworkStarTableScreen::new);
    }
}
