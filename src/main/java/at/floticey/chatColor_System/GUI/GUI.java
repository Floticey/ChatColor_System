package at.floticey.chatColor_System.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            Inventory inv = Bukkit.createInventory(player, 45, ChatColor.LIGHT_PURPLE + "Chat Color");

            ItemStack Green = new ItemStack(Material.GREEN_DYE);
            ItemMeta GreenMeta = Green.getItemMeta();
            GreenMeta.setDisplayName(ChatColor.GREEN + "Green");
            Green.setItemMeta(GreenMeta);

            ItemStack Blue = new ItemStack(Material.BLUE_DYE);
            ItemMeta BlueMeta = Blue.getItemMeta();
            BlueMeta.setDisplayName(ChatColor.BLUE + "Blue");
            Blue.setItemMeta(BlueMeta);

            ItemStack Red = new ItemStack(Material.RED_DYE);
            ItemMeta RedMeta = Red.getItemMeta();
            RedMeta.setDisplayName(ChatColor.RED + "Red");
            Red.setItemMeta(RedMeta);

            ItemStack Exit = new ItemStack(Material.BARRIER);
            ItemMeta ExitMeta = Exit.getItemMeta();
            ExitMeta.setDisplayName(ChatColor.DARK_RED + "Exit");
            Exit.setItemMeta(ExitMeta);

            inv.setItem(20, Blue);
            inv.setItem(22, Green);
            inv.setItem(24, Red);
            inv.setItem(8, Exit);

            player.openInventory(inv);

        }

        return false;
    }
}
