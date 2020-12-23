package me.burakuslenderanewbot.burakuslendera;

import org.bukkit.plugin.java.JavaPlugin;

public final class Burakuslendera extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Sistem başlatılıyor");

        getServer().getPluginManager().registerEvents(new breakBlock() , this);
    }

    @Override
    public void onDisable() {
        System.out.println("Sistem kapanıyor");
    }
}
