package com.donut.rattacore;

import org.bukkit.plugin.java.JavaPlugin;

public class RattaCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello im babey");
        this.getCommand("test").setExecutor(new CommandTest());
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
