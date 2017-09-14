package org.inputignhere;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class inputfun
  extends JavaPlugin
{
  public void onEnable() {}
  
  public void onDisable() {}
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (label.equalsIgnoreCase("test")) {
      p.sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.GREEN + "Hey! You just ran the test command!");
    }
    if (label.equalsIgnoreCase("ibelieveicanfly")) {
      if (p.getAllowFlight())
      {
        p.setAllowFlight(false);
        p.setFlying(false);
        p.sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.AQUA + "You got tired of flyng. Flying disabled.");
      }
      else
      {
        p.sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.AQUA + "You can now fly! enjoy!");
        p.setAllowFlight(true);
        p.setFlying(true);
      }
    }
    if (label.equalsIgnoreCase("expplz"))
    {
      p.sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.GREEN + "You got experience!!!");
      p.giveExpLevels(30);
    }
    if (label.equalsIgnoreCase("derpy"))
    {
      p.sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.GOLD + "You have been derpified!");
      p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 10));
      p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 200, 10));
      p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 10));
      p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 200, 10));
      p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 2));
    }
    if (label.equalsIgnoreCase("doctorhelpme"))
    {
      p.sendMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.RED + "[" + ChatColor.WHITE + "+" + ChatColor.RED + "]" + ChatColor.RED + "You have been treated " + ChatColor.WHITE + "you have been healed and fed. You may feel Dizzy");
      p.setHealth(20.0D);
      p.setFoodLevel(50);
      p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 10));
    }
    if (label.equalsIgnoreCase("makemepopular"))
    {
      Bukkit.broadcastMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.BLUE + p.getDisplayName() + ChatColor.BLUE + " wants to be famous...(he was dropped for this...)");
      p.getLocation().add(0.0D, 20.0D, 0.0D);
      Bukkit.broadcastMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.AQUA + " DERP ");
      Bukkit.broadcastMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.GREEN + " HEHE ");
      Bukkit.broadcastMessage(ChatColor.GREEN + "[" + ChatColor.DARK_GRAY + "+" + ChatColor.GREEN + "]" + ChatColor.BLUE + "No one ask... " + p.getDisplayName() + ChatColor.BLUE + " is fine ;)");
    }
    return true;
  }
}
