package me.sgray.template.spigotplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPlugin extends JavaPlugin {
    @Override
    public void onDisable() {
        // Don't log disabling, Spigot does that for you automatically!
    }

    @Override
    public void onEnable() {
        // Don't log enabling, Spigot does that for you automatically!

        // Add commands to plugin.yml if using ONE of following snippets.
        // getCommand("example").setExecutor(this);
        getCommand("example").setExecutor(new ExampleCommand(this));
    }
}
