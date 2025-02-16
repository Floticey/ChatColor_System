package at.floticey.chatColor_System.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiInteract implements Listener {

    @EventHandler
    public void onClick (InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equals(ChatColor.LIGHT_PURPLE + "Chat Color")) {
            e.setCancelled(true);
            switch (e.getRawSlot()) {
                case 8:
                    player.closeInventory();
                    break;
                case 20:
                    player.sendMessage("Your Chatcolor is now set to " + ChatColor.BLUE  + "Blue");

                    break;
                case 22:
                    player.sendMessage("Your Chatcolor is now set to " + ChatColor.GREEN  + "Green");

                    break;
                case 24:
                    player.sendMessage("Your Chatcolor is now set to " + ChatColor.RED  + "Red");

                    break;
                }
            }
        }
    }
