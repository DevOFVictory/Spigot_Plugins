package de.devofvictory.biomicploz.inventorys;

// Package declatation here!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.devofvictory.biomicploz.main.Main;
import de.devofvictory.biomicploz.utils.AnvilGUI;
import de.devofvictory.biomicploz.utils.AnvilGUI.AnvilClickEvent;
import de.devofvictory.biomicploz.utils.AnvilGUI.AnvilClickEventHandler;
import de.devofvictory.biomicploz.utils.AnvilGUI.AnvilSlot;
import de.devofvictory.biomicploz.utils.PlotManager;
import de.devofvictory.biomicploz.utils.Utils;

public class INV_Menu implements Listener{
	
	/*
	 * 
	 * Code generated by McGUI-Creator
	 * 	
	 * @author: DevOFVictory
	 * 
	 * » Remember to register this Class as listener in the onEnable() method!
	 * 
	 */
	
	static String invName = "§2•§a●§2§lCity§a§lBuild";
	static int lines = 3;
	static ArrayList<ItemStack> items;
	
	public static void callInv(Player p) {
		
items = new ArrayList<>();
	
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)6, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)6, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.WOOD_DOOR, (byte)0, 1, "§6Meine Grundstücke", (List<String>) Arrays.asList("§aÜberblick über all deine Grundstücke.")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.ENDER_PEARL, (byte)0, 1, "§6Teleportieren", (List<String>) Arrays.asList("§aTeleportiere dich zu anderen Grundstücken.")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.DIAMOND, (byte)0, 1, "§6Grundstück kaufen", (List<String>) Arrays.asList("§aKaufe das markierte Grundstück.")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.PAPER, (byte)0, 1, "§6Grundstück Info", (List<String>) Arrays.asList("§aSehe Informationen über das Grundstück ein.")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)6, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "§r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)6, 1, "§r", (List<String>) Arrays.asList("")));

		
		Inventory inv = Bukkit.createInventory(null, lines*9, invName);
		
		for (int i = 0; i<lines*9; i++) {
			
			try {
			
			@SuppressWarnings("deprecation")
			ItemStack item = new ItemStack(items.get(i).getType(), items.get(i).getAmount(), items.get(i).getData().getData());
			ItemMeta itemMeta = item.getItemMeta();
			itemMeta.setDisplayName(items.get(i).getItemMeta().getDisplayName());
			itemMeta.setLore(items.get(i).getItemMeta().getLore());
			item.setItemMeta(itemMeta);
			inv.setItem(i, item);
			
			}catch (NullPointerException ex) {
				inv.setItem(i, null);
			}
			
		}
		
		p.openInventory(inv);	
	}
	
	@EventHandler
	public void onInvClick(InventoryClickEvent e) {
		if (e.getWhoClicked() instanceof Player) {
			Player p = (Player)e.getWhoClicked();
			
			try {
				if (e.getClickedInventory().getName().equalsIgnoreCase(invName)) {
					
					if (items.contains(e.getCurrentItem())) {
						String clickedItem = e.getCurrentItem().getItemMeta().getDisplayName();
						e.setCancelled(true);
						switch (clickedItem) {
						case "§6Meine Grundstücke":
							
							if (PlotManager.getPlayerPlots(p.getUniqueId()).size() >= 1) {
								INV_MyPlots.callInv(p, p.getUniqueId());
							}else {
								Utils.sendNoSpamMsg(p, Main.Prefix+"§cDu hast noch keine Grundstücke!");
								p.closeInventory();
								p.playSound(p.getLocation(), Sound.ITEM_BREAK, 5, 5);
							}
							
							break;
						case "§6Teleportieren":
							
							AnvilGUI gui = new AnvilGUI(p, new AnvilClickEventHandler() {
								
								@SuppressWarnings("deprecation")
								@Override
								public void onAnvilClick(AnvilClickEvent e) {
									if (e.getSlot() == AnvilSlot.OUTPUT) {
										String playerName = e.getOutPutMessage().replaceAll("Name » ", "");
										
										e.setWillClose(true);
										e.setWillDestroy(true);
										
										if (Bukkit.getOfflinePlayer(playerName).hasPlayedBefore()) {
											
											OfflinePlayer of = Bukkit.getOfflinePlayer(playerName);
											
											if (PlotManager.getPlayerPlots(of.getUniqueId()).size() >= 1) {
												INV_MyPlots.callInv(p, of.getUniqueId());
											}else {
												Utils.sendNoSpamMsg(p, Main.Prefix+"§c"+of.getName()+" hat noch keine Grundstücke!");
											}
											
										}else {
											Utils.sendNoSpamMsg(p, Main.Prefix+"§c"+playerName+" konnte nicht gefunden werden!");
										}
										
									}else {
										e.setWillClose(false);
										e.setWillDestroy(false);
									}
									
									
								}
							});
							
							
							ItemStack input = new ItemStack(Material.PAPER);
							ItemMeta inputMeta = input.getItemMeta();
							inputMeta.setDisplayName("Name » ");
							input.setItemMeta(inputMeta);
							
							
							gui.setSlot(AnvilSlot.INPUT_LEFT, input);
							gui.open();
							
							
							
							break;
						case "§6Grundstück kaufen":
							
							p.performCommand("gs claim");
							
							
							break;
						case "§6Grundstück Info":
							
							p.performCommand("gs info");
							
							break;
						default:
							break;
						}
					}
					
				}
			}catch (NullPointerException ex) {
				
			}
			
		}
	}
	
	
	
	public static ItemStack getItemStack(Material type, byte meta, int amount, String displayName, List<String> lore) {
		
		ItemStack is = new ItemStack(type, amount, meta);
		ItemMeta isendNoSpamMsgeta = is.getItemMeta();
		isendNoSpamMsgeta.setDisplayName(displayName);
		isendNoSpamMsgeta.setLore(lore);
		
		is.setItemMeta(isendNoSpamMsgeta);
		
		return is;
		
	}

}
