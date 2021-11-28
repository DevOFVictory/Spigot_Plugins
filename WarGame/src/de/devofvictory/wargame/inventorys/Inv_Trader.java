package de.devofvictory.wargame.inventorys;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.devofvictory.wargame.main.Main;

public class Inv_Trader implements Listener{
	
	/*
	 * 
	 * Code generated by McGUI-Creator
	 * 	
	 * @author: DevOFVictory
	 * 
	 * � Remember to register this Class as listener in the onEnable() method!
	 * 
	 */
	
	static String invName = "�e�lH�ndler";
	static int lines = 3;
	static ArrayList<ItemStack> items = new ArrayList<>();
	
	public static void callInv(Player p) {
	
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)3, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(null);
items.add(null);
items.add(getItemStack(Material.FEATHER, (byte)0, 1, "�3Gleiter", (List<String>) Arrays.asList("�aKaufe einen sch�nen Gleiter!")));
items.add(null);
items.add(getItemStack(Material.SKULL_ITEM, (byte)3, 1, "�3Skins", (List<String>) Arrays.asList("�aKaufe einen sch�nen Skin!")));
items.add(null);
items.add(null);
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));
items.add(getItemStack(Material.STAINED_GLASS_PANE, (byte)7, 1, "�r", (List<String>) Arrays.asList("")));

		
		Inventory inv = Bukkit.createInventory(null, lines*9, invName);
		
		for (int i = 0; i<lines*9; i++) {
			
			try {
			
			@SuppressWarnings("deprecation")
			ItemStack item = new ItemStack(items.get(i).getType(), items.get(i).getAmount(), items.get(i).getData().getData());
			ItemMeta itemMeta = item.getItemMeta();
			itemMeta.setDisplayName(items.get(i).getItemMeta().getDisplayName());
			if (!items.get(i).getItemMeta().getLore().toString().equalsIgnoreCase("[]"))
			itemMeta.setLore(items.get(i).getItemMeta().getLore());
			if (i == 8) {
				itemMeta.setDisplayName("�3�lW�b�la�3�lr�eCoins: �6"+Main.getMinigame().getCoins(p));
			}
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
						switch (clickedItem) {
						case "�3Gleiter":
							p.sendMessage(Main.Prefix+"�cZurzeit sind noch keine Gleiter verf�gbar!");
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 10, 10);
							p.closeInventory();
							break;
						case "�3Skins":
							Inv_Shop_Skins.callInv(p);
							p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
							break;
						case "c":
							/*Code here*/
							break;
						case "d":
							/*Code here*/
							break;
						case "e":
							/*Code here*/		
							break;
						case "f":
							/*Code here*/
							break;
						case "g":
							/*Code here*/
							break;
						case "h":
							/*Code here*/
							break;
						case "i":
							/*Code here*/
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
		ItemMeta isMeta = is.getItemMeta();
		isMeta.setDisplayName(displayName);
		isMeta.setLore(lore);
		
		is.setItemMeta(isMeta);
		
		return is;
		
	}

}