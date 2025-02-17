package at.floticey.chatColor_System.Data;

import org.bukkit.ChatColor;

public enum Color {

    RED(ChatColor.RED),
    GREEN(ChatColor.GREEN),
    BLUE(ChatColor.BLUE),
    WHITE(ChatColor.WHITE);

    private ChatColor color;

    Color(ChatColor color) { this.color = color; }

    public ChatColor getChatColor() { return color; }

}
