package org.makutils.makutils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;

//import java.awt.*;

public final class Makutils extends JavaPlugin implements Listener {
    Random rand = new Random();
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
        //String joinMessage = "{player} has arrived! Everybody act natural!";
        String[] joinMessage = new String[]{"{player} has arrived! Everybody act natural!", "{player} is here! Quick, hide the diamonds!", "Welcome, {player}! We were just talking about you...", "{player} just joined. Time to increase server lag!", "{player} has joined the game. Hope they read the rules!", "{player} has joined! Say hi or they'll cry :(", "Give a warm welcome to {player}! (Or don’t, your choice.)", "{player} just joined. Who wants to 1v1 them first?", "Welcome, {player}! Ready to explore the world of [Server Name]?", "{player} just entered the SMP. Let’s see how long they last!", "{player} is here! Let the chaos begin!"};
        int randomNumber = rand.nextInt(joinMessage.length);
        Component message = Component.text(joinMessage[randomNumber].replace("{player}", playerName)).color(NamedTextColor.YELLOW);
        event.joinMessage(message);
    }

    // Change Leave Message
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) { //Basically the same as the onPlayerJoin thing btw
        String playerName = event.getPlayer().getName();
        String quitMessage = "{player} got pegged in the ass";
        Component message = Component.text(quitMessage.replace("{player}", playerName)).color(NamedTextColor.YELLOW);
        event.quitMessage(message);
    }

}
