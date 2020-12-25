package org.sickskillz.superluckyblock.api.animations;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.sickskillz.superluckyblock.api.SuperLuckyAPI;
import org.sickskillz.superluckyblock.api.luckyblocks.Luckyblock;

public abstract class Animation {

    private int taskId = 0;
    private Runnable callback;

    /**
     * Gets how often the animation method has to be called in ticks.
     *
     * @return How often the animate method gets called during an animation in ticks. Has to be >= 1.
     */
    protected abstract long getTickRate();

    /**
     * Will be called after spawning the ArmorStand, but before starting the animation.
     * Should be used to edit the ArmorStand to your liking.
     *
     * @param armorStand The ArmorStand that will be used for the animation.
     * @param luckyBlock The {@link Luckyblock} that caused this animation to trigger.
     */
    public void prepare(ArmorStand armorStand, Luckyblock luckyBlock) {
        armorStand.setHelmet(luckyBlock.getLuckyBlockItem());
    }

    /**
     * Gets called every X ticks defined by {@link Animation#getTickRate()}.
     * In this method you implement the animation.
     * This can be done by, for example, teleporting the ArmorStand to new locations or rotate it.
     *
     * @param armorStand The ArmorStand that is being used by animation.
     * @param luckyblockLoc The location where the {@link Luckyblock} was broken.
     */
    public abstract void animate(ArmorStand armorStand, Location luckyblockLoc);

    /**
     * Starts the animation. This method is usually called by SuperLuckyBlock. In most cases you should not call this.
     *
     * DON'T FORGET to call {@link Animation#stop()} when your animation is done.
     *
     * @param armorStand The ArmorStand that will be used for the animation.
     * @param luckyblockLoc The location where the {@link Luckyblock} was broken.
     * @param callback The callback function that will be executed after {@link Animation#stop()} has been called.
     */
    public void start(@NotNull ArmorStand armorStand, Location luckyblockLoc, @Nullable Runnable callback) {
        this.callback = callback;
        this.taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(SuperLuckyAPI.getPlugin(), () -> animate(armorStand, luckyblockLoc), 0L, getTickRate());
    }

    /**
     * Stops the animation task and calls the callback function.
     *
     * This HAS to be called in the start function when the animation is done.
     * If this is not called the {@link Animation#animate(ArmorStand, Location)} will continue to be called and the player will not be rewarded.
     */
    public void stop() {
        Bukkit.getScheduler().cancelTask(taskId);

        if (callback != null) {
            callback.run();
        }
    }
}
