package org.sickskillz.superluckyblock.api.luckyblocks;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Surprise {

    /**
     * The path/key to the surprise.
     *
     * @return The path/key to the surprise.
     */
    String getConfigPath();

    /**
     * Gets called by SuperLuckyBlock to execute the surprise.
     *
     * @param player The Player that broke the {@link Luckyblock}.
     * @param blockLoc The Location of the broken {@link Luckyblock}.
     */
    void execute(Player player, Location blockLoc);

    /**
     * Gets the name of the Surprise.
     *
     * @return The name of the Surprise.
     */
    String getName();

    /**
     * The chance of this Surprise happening.
     * A chance of 0 means it has been disabled.
     *
     * @return The chance of this surprise. Should be 0 or higher.
     */
    double getChance();

    /**
     * Gets if a message has been set.
     *
     * @return Has a message been set.
     */
    boolean isMessageSet();

    /**
     * Gets the message.
     *
     * @return The message that has been set.
     */
    String getMessage();
}
