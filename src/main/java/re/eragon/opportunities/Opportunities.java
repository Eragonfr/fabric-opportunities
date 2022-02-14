package re.eragon.opportunities;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import re.eragon.opportunities.fireworkStar.FireworkStarTable;
import re.eragon.opportunities.fireworkStar.FireworkStarTableEntity;
import re.eragon.opportunities.fireworkStar.FireworkStarTableScreenHandler;
import re.eragon.opportunities.fireworkTable.FireworkTable;
import re.eragon.opportunities.fireworkTable.FireworkTableEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import re.eragon.opportunities.fireworkTable.FireworkTableScreenHandler;

public class Opportunities implements ModInitializer {
	public static final String MOD_ID = "opportunities";

	// This logger is used to write text to the console and the log file.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Firework table block
    public static final FireworkTable FIREWORK_TABLE;
	public static final BlockItem FIREWORK_TABLE_ITEM;
	public static final BlockEntityType<FireworkTableEntity> FIREWORK_TABLE_ENTITY;
	public static final Identifier FIREWORK_TABLE_ID = new Identifier(MOD_ID, "firework_table");
	public static final ScreenHandlerType<FireworkTableScreenHandler> FIREWORK_TABLE_SCREEN_HANDLER;

	// Firework star table block
	public static final FireworkStarTable FIREWORK_STAR_TABLE;
	public static final BlockItem FIREWORK_STAR_TABLE_ITEM;
	public static final BlockEntityType<FireworkStarTableEntity> FIREWORK_STAR_TABLE_ENTITY;
	public static final Identifier FIREWORK_STAR_TABLE_ID = new Identifier(MOD_ID, "firework_star_table");
	public static final ScreenHandlerType<FireworkStarTableScreenHandler> FIREWORK_STAR_TABLE_SCREEN_HANDLER;

	static {
		// Firework table
		FIREWORK_TABLE = Registry.register(Registry.BLOCK, FIREWORK_TABLE_ID, new FireworkTable(FabricBlockSettings.copyOf(Blocks.CHEST)));
		FIREWORK_TABLE_ITEM = Registry.register(Registry.ITEM, FIREWORK_TABLE_ID, new BlockItem(FIREWORK_TABLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		FIREWORK_TABLE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, FIREWORK_TABLE_ID, FabricBlockEntityTypeBuilder.create(FireworkTableEntity::new, FIREWORK_TABLE).build(null));

		FIREWORK_TABLE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(FIREWORK_TABLE_ID, FireworkTableScreenHandler::new);

		// Firework star table
		FIREWORK_STAR_TABLE = Registry.register(Registry.BLOCK, FIREWORK_STAR_TABLE_ID, new FireworkStarTable(FabricBlockSettings.copyOf(Blocks.CHEST)));
		FIREWORK_STAR_TABLE_ITEM = Registry.register(Registry.ITEM, FIREWORK_STAR_TABLE_ID, new BlockItem(FIREWORK_STAR_TABLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		FIREWORK_STAR_TABLE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, FIREWORK_STAR_TABLE_ID, FabricBlockEntityTypeBuilder.create(FireworkStarTableEntity::new, FIREWORK_STAR_TABLE).build(null));

		FIREWORK_STAR_TABLE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(FIREWORK_STAR_TABLE_ID, FireworkStarTableScreenHandler::new);
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Hi ! Don't worry I'm here to fix the game.");
	}
}

