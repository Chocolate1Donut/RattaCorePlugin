package com.donut.rattacore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class CommandTest implements CommandExecutor {
    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            getLogger().info("Test command executed by "+((Player) sender).getDisplayName());
            if (args.length != 0) {
                getLogger().severe(("Args: " + args.toString()));
                switch (args[0]) {
                    case "boner":
                        sender.sendMessage("§x§1§8§f§f§f§8W§x§2§e§d§f§f§9T§x§4§3§b§f§f§aF §x§5§9§9§f§f§bH§x§6§e§8§0§f§cA§x§8§4§6§0§f§cH§x§9§9§4§0§f§dA§x§a§f§2§0§f§eH§x§c§4§0§0§f§fA");
                        getLogger().severe(((Player) sender).getPlayer().getGameMode().toString());
                        break;
                    case "poop", "poopy":
                        getLogger().severe("I am literally a child");
                        ((Player) sender).getPlayer().sendMessage("&4Fuck you.");
                        break;
                    default:
                        getLogger().severe("Unrecognized argument.");
                        break;
                }
            }
            else {
                getLogger().severe("No additional arguments provided.");
            }
            return true;
        }
        else {
            getLogger().warning("You must be a player to use this command!");
            return false;
        }
    }
}
