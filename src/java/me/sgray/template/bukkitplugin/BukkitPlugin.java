package me.sgray.template.bukkitplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        // Don't log disabling, Bukkit does that for you automatically!
    }

    @Override
    public void onEnable() {
        // Don't log enabling, Bukkit does that for you automatically!

        // Add commands to plugin.yml if using one of following snippets.
        // getCommand.setExecutor(this);
        // getCommand.setExecutor(new MyPluginCommand(this));
    }
}
