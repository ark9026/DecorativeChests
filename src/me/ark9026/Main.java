package me.ark9026;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("Starting up DecorativeChests!");
		getLogger().info("This plugin is coded by ark9026!");
	}

	@Override
	public void onDisable() {
		getLogger().info("Shutting down DecorativeChests!");
	}
    @EventHandler
	public void onClick(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (e.getClickedBlock().getType() == Material.CHEST) {
				e.setCancelled(true);

			}
		}
	}
}
