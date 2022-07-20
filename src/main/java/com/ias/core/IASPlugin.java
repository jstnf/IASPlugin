package com.ias.core;

import com.ias.core.event.ItemFramePhysicsListener;
import org.bukkit.plugin.java.JavaPlugin;

public class IASPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ItemFramePhysicsListener(), this);
    }

    @Override
    public void onDisable() { }
}