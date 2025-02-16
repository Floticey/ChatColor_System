package at.floticey.chatColor_System;

import at.floticey.chatColor_System.Events.GuiInteract;
import at.floticey.chatColor_System.GUI.GUI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    getCommand("chatcolor").setExecutor(new GUI());
    Bukkit.getPluginManager().registerEvents(new GuiInteract(), this);

    }
}
