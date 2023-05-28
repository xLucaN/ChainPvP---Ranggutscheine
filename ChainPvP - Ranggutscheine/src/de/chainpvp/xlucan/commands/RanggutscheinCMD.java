package de.chainpvp.xlucan.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import de.chainpvp.xlucan.main.Main;
import de.chainpvp.xlucan.util.ItemCreator;

public class RanggutscheinCMD implements CommandExecutor, Listener {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(Main.Prefix);
			return false;
		}

		Player p = (Player) sender;
		if (p.hasPermission("nigthfront.ranggutschein")) {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("Ultimate")) {
					p.getInventory().addItem(new ItemCreator().material(Material.BOOK).amount(1)
							.displayName("§aRanggutschein: §9Ultimate").build());
					p.sendMessage(Main.Prefix + "Du hast nun ein Buch von den Rang §9Ultimate");
				} else if (args[0].equalsIgnoreCase("Saphire")) {
					p.getInventory().addItem(new ItemCreator().material(Material.BOOK).amount(1)
							.displayName("§aRanggutschein: §aSaphire").build());
					p.sendMessage(Main.Prefix + "Du hast nun ein Buch von den Rang §aSaphire");
				} else if (args[0].equalsIgnoreCase("Angel")) {
					p.getInventory().addItem(new ItemCreator().material(Material.BOOK).amount(1)
							.displayName("§aRanggutschein: §cAngel").build());
					p.sendMessage(Main.Prefix + "Du hast nun ein Buch von den Rang §cAngel");
				} else if (args[0].equalsIgnoreCase("God")) {
					p.getInventory().addItem(new ItemCreator().material(Material.BOOK).amount(1)
							.displayName("§aRanggutschein: §e§lGod").build());
					p.sendMessage(Main.Prefix + "Du hast nun ein Buch von den Rang §e§lGod");
				} else if (args[0].equalsIgnoreCase("ixde")) {
					p.getInventory().addItem(new ItemCreator().material(Material.BOOK).amount(1)
							.displayName("§aRanggutschein: §e§lIXDE").build());
					p.sendMessage(Main.Prefix + "Du hast nun ein Buch von den Rang §e§lIXDE");
				} else {
					p.sendMessage(Main.Prefix + "/ranggutschein <Saphire/Ultimate/Angel/God>");
				}
			} else {
				p.sendMessage(Main.Prefix + "/ranggutschein <Saphire/Ultimate/Angel/God>");
			}
		} else {
			p.sendMessage(Main.noperms);
		}
		return false;
	}

	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		try {
			Player p = e.getPlayer();
			if (e.getItem().getItemMeta().getDisplayName().equals("§aRanggutschein: §9Ultimate")) {
				if (p.getItemInHand().getAmount() >= 2) {
					p.sendMessage(Main.Prefix + "Gutscheine dürfen nicht gestackt benutzt werden.");
				} else {
					if (p.hasPermission("arcane.ultimate")) {
						p.sendMessage(Main.Prefix + "Du kannst diesen Gutschein nicht einlösen,");
						p.sendMessage(Main.Prefix + "da du bereits diesen Rang hast,");
						p.sendMessage(Main.Prefix + "oder du einen höheren Rang besitzt.");
						return;
					}
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
							("pex user " + p.getName() + " group set Ultimate"));
					p.setItemInHand(null);
					p.sendMessage(Main.Prefix + "Du hast nun den Rang §9Ultimate");
				}
			}
			if (e.getItem().getItemMeta().getDisplayName().equals("§aRanggutschein: §aSaphire")) {
				if (p.getItemInHand().getAmount() >= 2) {
					p.sendMessage(Main.Prefix + "Gutscheine dürfen nicht gestackt benutzt werden.");
				} else {
					if (p.hasPermission("arcane.saphire")) {
						p.sendMessage(Main.Prefix + "Du kannst diesen Gutschein nicht einlösen,");
						p.sendMessage(Main.Prefix + "da du bereits diesen Rang hast,");
						p.sendMessage(Main.Prefix + "oder du einen höheren Rang besitzt.");
						return;
					}
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
							("pex user " + p.getName() + " group set Saphire"));
					p.setItemInHand(null);
					p.sendMessage(Main.Prefix + "Du hast nun den Rang §aSaphire");
				}
			}
			if (e.getItem().getItemMeta().getDisplayName().equals("§aRanggutschein: §cAngel")) {
				if (p.getItemInHand().getAmount() >= 2) {
					p.sendMessage(Main.Prefix + "Gutscheine dürfen nicht gestackt benutzt werden.");
				} else {
					if (p.hasPermission("arcane.angel")) {
						p.sendMessage(Main.Prefix + "Du kannst diesen Gutschein nicht einlösen,");
						p.sendMessage(Main.Prefix + "da du bereits diesen Rang hast,");
						p.sendMessage(Main.Prefix + "oder du einen höheren Rang besitzt.");
						return;
					}
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ("pex user " + p.getName() + " group set Angel"));
					p.setItemInHand(null);
					p.sendMessage(Main.Prefix + "Du hast nun den Rang §cAngel");
				}
			}
			if (e.getItem().getItemMeta().getDisplayName().equals("§aRanggutschein: §e§lGod")) {
				if (p.getItemInHand().getAmount() >= 2) {
					p.sendMessage(Main.Prefix + "Gutscheine dürfen nicht gestackt benutzt werden.");
				} else {
					if (p.hasPermission("arcane.god")) {
						p.sendMessage(Main.Prefix + "Du kannst diesen Gutschein nicht einlösen,");
						p.sendMessage(Main.Prefix + "da du bereits diesen Rang hast,");
						p.sendMessage(Main.Prefix + "oder du einen höheren Rang besitzt.");
						return;
					}
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ("pex user " + p.getName() + " group set God"));
					p.setItemInHand(null);
					p.sendMessage(Main.Prefix + "Du hast nun den Rang §e§lGod");
				}
			}
			if (e.getItem().getItemMeta().getDisplayName().equals("§aRanggutschein: §e§lIXDE")) {
				if (p.getItemInHand().getAmount() >= 2) {
					p.sendMessage(Main.Prefix + "Gutscheine dürfen nicht gestackt benutzt werden.");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), ("pex user " + p.getName() + " group set Owner"));
					p.setItemInHand(null);
					p.sendMessage(Main.Prefix + "Du hast nun den Rang §e§lIXDE");
				}
			}
		} catch (Exception p) {
		}
	}
}