package org.sickskillz.superluckyblock.api.luckyblocks;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Surprise {

    String getConfigPath();

    void execute(Player player, Location blockLoc);

    String getName();

    double getChance();

    boolean isMessageSet();

    String getMessage();
}
