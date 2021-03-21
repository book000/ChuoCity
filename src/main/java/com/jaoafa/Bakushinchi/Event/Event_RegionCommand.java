package com.jaoafa.Bakushinchi.Event;

import com.jaoafa.Bakushinchi.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Event_RegionCommand implements Listener {
    @EventHandler
    public void onRegionCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        if (!Main.isBakushinchi(player.getLocation())) {
            return;
        }
        String[] commands = event.getMessage().split(" ");
        if (!commands[0].equalsIgnoreCase("/rg") &&
            !commands[0].equalsIgnoreCase("/region") &&
            !commands[0].equalsIgnoreCase("/regions")) {
            return;
        }
        if (!commands[1].equalsIgnoreCase("claim")) {
            return;
        }

        player.sendMessage("[Bakushinchi] " + ChatColor.RED + "爆新地内でエリア保護をするためには /bakushinchi claim を使う必要があります。");
    }
}
