package at.floticey.chatColor_System.Events;

import at.floticey.chatColor_System.Data.Color;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashMap;
import java.util.UUID;

public class GuiInteract implements Listener {

    private HashMap<UUID, Color> playerColor = new HashMap<>();

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals(ChatColor.LIGHT_PURPLE + "Chat Color")) {
            e.setCancelled(true);
            switch (e.getRawSlot()) {
                case 8:
                    player.closeInventory();
                    break;
                case 20:
                    player.sendMessage("Your Chatcolor is now set to " + ChatColor.BLUE + "Blue");
                    playerColor.put(player.getUniqueId(), Color.BLUE);
                    break;
                case 22:
                    player.sendMessage("Your Chatcolor is now set to " + ChatColor.GREEN + "Green");
                    playerColor.put(player.getUniqueId(), Color.GREEN);
                    break;
                case 24:
                    player.sendMessage("Your Chatcolor is now set to " + ChatColor.RED + "Red");
                    playerColor.put(player.getUniqueId(), Color.RED);
                    break;
            }
        }
    }

    @EventHandler
    public void chatEvent(AsyncPlayerChatEvent e) {

        Color color = playerColor.getOrDefault(e.getPlayer().getUniqueId(), Color.WHITE);

        e.setMessage(color.getChatColor() + e.getMessage());

    }
}