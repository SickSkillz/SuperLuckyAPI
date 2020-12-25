package org.sickskillz.superluckyblock.api;

import org.bukkit.plugin.Plugin;
import org.sickskillz.superluckyblock.api.managers.LuckyblockManager;

public class SuperLuckyAPI {

    private static LuckyblockManager luckyblockManager;
    private static Plugin plugin;

    /**
     * Get the {@link LuckyblockManager} that has been set by SuperLuckyBlock.
     *
     * @return The {@link LuckyblockManager}
     */
    public static LuckyblockManager getLuckyblockManager() {
        return luckyblockManager;
    }

    /**
     * Sets the {@link LuckyblockManager}. This should only be done by SuperLuckyBlock!
     *
     * @param luckyblockManager
     */
    public static void setLuckyblockManager(LuckyblockManager luckyblockManager) {
        SuperLuckyAPI.luckyblockManager = luckyblockManager;
    }

    /**
     * Gets the Plugin instance. This is mainly used within this API and should not be used by any other plugin.
     *
     * @return The SuperLuckyBlock Plugin instance.
     */
    public static Plugin getPlugin() {
        return plugin;
    }

    /**
     * Sets the Plugin instance. This is mainly used within this API and should not be used by any other plugin.
     *
     * @param plugin The SuperLuckyBlock Plugin instance.
     */
    public static void setPlugin(Plugin plugin) {
        SuperLuckyAPI.plugin = plugin;
    }
}
