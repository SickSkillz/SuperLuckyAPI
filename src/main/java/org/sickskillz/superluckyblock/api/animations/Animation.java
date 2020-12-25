package org.sickskillz.superluckyblock.api.animations;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.sickskillz.superluckyblock.api.luckyblocks.Luckyblock;

public interface Animation {

    void prepare(ArmorStand armorStand, Luckyblock luckyBlock);

    void start(@NotNull ArmorStand armorStand, Location luckyblockLoc, @Nullable Runnable callback);

    void animate(ArmorStand armorStand, Location luckyblockLoc);

    void stop();
}
