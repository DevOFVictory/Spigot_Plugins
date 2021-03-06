package de.devofvictory.skykitpvp.utils;

import org.bukkit.Material;

public enum Interactable {
	
	ACACIA_DOOR,
	ACACIA_FENCE_GATE,
	ACACIA_BUTTON,
	ACACIA_TRAPDOOR,
	ANVIL,
	ARMOR_STAND,
	BARREL,
	BEACON,
	BED_BLOCK,
	BELL,
	BIRCH_BOAT,
	BIRCH_BUTTON,
	BIRCH_DOOR,
	BIRCH_FENCE_GATE,
	BIRCH_TRAPDOOR,
	BLACK_BED,
	BLACK_SHULKER_BOX,
	BLAST_FURNACE,
	BLUE_BED,
	BLUE_SHULKER_BOX,
	BREWING_STAND,
	BROWN_BED,
	BROWN_SHULKER_BOX,
	CAMPFIRE,
	CAULDRON,
	CHEST,
	CHEST_MINECART,
	CHIPPED_ANVIL,
	COMMAND,
	COMMAND_BLOCK,
	COMMAND_BLOCK_MINECART,
	COMPARATOR,
	COMPOSTER,
	CRAFTING_TABLE,
	CYAN_BED,
	CYAN_SHULKER_BOX,
	DAMAGED_ANVIL,
	DARK_OAK_BOAT,
	DARK_OAK_BUTTON,
	DARK_OAK_FENCE_GATE,
	DARK_OAK_TRAPDOOR,
	DARK_OAK_DOOR,
	DAYLIGHT_DETECTOR,
	DAYLIGHT_DETECTOR_INVERTED,
	DIODE,
	DIODE_BLOCK_OFF,
	DIODE_BLOCK_ON,
	DISPENSER,
	DOOR,
	DRAGON_EGG,
	DROPPER,
	ENCHANTING_TABLE,
	ENCHANTMENT_TABLE,
	END_CRYSTAL,
	END_PORTAL_FRAME,
	ENDER_PORTAL_FRAME,
	ENDER_CHEST,
	EXPLOSIVE_MINECART,
	FARMLAND,
	FLETCHING_TABLE,
	FLOWER_POT,
	FURNACE,
	FURNACE_MINECART,
	GRAY_BED,
	GRAY_SHULKER_BOX,
	GREEN_BED,
	GREEN_SHULKER_BOX,
	HOPPER,
	HOPPER_MINECART,
	IRON_DOOR,
	IRON_TRAPDOOR,
	ITEM_FRAME,
	JUKEBOX,
	JUNGLE_BUTTON,
	JUNGLE_BOAT,
	JUNGLE_DOOR,
	JUNGLE_FENCE_GATE,
	LEVER,
	LIGHT_BLUE_BED,
	LIGHT_BLUE_SHULKER_BOX,
	LIGHT_GRAY_BED,
	LIGHT_GRAY_SHULKER_BOX,
	LIME_BED,
	LIME_SHULKER_BOX,
	MAGENTA_BED,
	MAGENTA_SHULKER_BOX,
	MINECART,
	NOTE_BLOCK,
	OAK_BOAT,
	OAK_BUTTON,
	OAK_DOOR,
	OAK_FENCE_GATE,
	ORANGE_BED,
	ORANGE_SHULKER_BOX,
	PINK_BED,
	PINK_SHULKER_BOX,
	POWERED_MINECART,
	PURPLE_BED,
	PURPLE_SHULKER_BOX,
	RED_BED,
	RED_SHULKER_BOX,
	REDSTONE_ORE,
	REDSTONE_COMPARATOR_OFF,
	REDSTONE_COMPARATOR_ON,
	REPEATING_COMMAND_BLOCK,
	REPEATER,
	POWERED_REPEATER,
	UNPOWERED_REPEATER,
	REDSTONE_TORCH,
	SADDLE,
	SHULKER_BOX,
	SIGN,
	SIGN_POST,
	SMITHING_TABLE,
	SMOKER,
	SPRUCE_BOAT,
	SPRUCE_BUTTON,
	SPRUCE_DOOR,
	SPRUCE_FENCE_GATE,
	STONECUTTER,
	STONE_BUTTON,
	STORAGE_MINECART,
	TNT_MINECART,
	TNT,
	TRAP_DOOR,
	TRAPPED_CHEST,
	WHITE_BED,
	WHITE_SHULKER_BOX,
	WOOD_BUTTON,
	YELLOW_BED,
	YELOW_SHULKER_BOX;
	
	
	public static boolean contains(Material material) {

	    for (Interactable c : Interactable.values()) {
	        if (c.toString().equals(material.toString())) {
	            return true;
	        }
	    }

	    return false;
	}

}
