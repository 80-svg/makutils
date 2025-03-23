package org.makutils.makutils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class Makutils extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Makutils has been summoned!! :)");
        getServer().getPluginManager().registerEvents(this, this);
    }

    // Change Join Message
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playerName = event.getPlayer().getName();
        String joinMassage = "{player} has arrived! Everybody act natural!";
        Component message = Component.text(playerName + " has arrived! Everybody act natural!").color(NamedTextColor.YELLOW);
        event.joinMessage(message);
    }




    // Boilerplate, don't touch this except if you know what you are doing pls.
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Makutils shut down, :(((");
    }
}
