package me.sgray.plugin.bukkitplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        // Don't log disabling, Bukkit does that for you automatically!
    }

    @Override
    public void onEnable() {
       // Don't log enabling, Bukkit does that for you automatically!
    }
}
