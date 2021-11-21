package org.sickskillz.superluckyblock.api.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.sickskillz.superluckyblock.api.luckyblocks.Luckyblock;

public class LuckyblockBreakEvent extends Event implements Cancellable {

    private static final HandlerList handlerList = new HandlerList();
    private final Player player;
    private final Block block;
    private final Luckyblock luckyblock;
    private boolean cancelled = false;

    public LuckyblockBreakEvent(Player player, Block block, Luckyblock luckyblock) {
        this.player = player;
        this.block = block;
        this.luckyblock = luckyblock;
    }

    /**
     * Gets the player who broke the luckyblock.
     *
     * @return A Player object of the player who broke the luckyblock.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return A Block object of the luckyblock.
     */
    public Block getBlock() {
        return block;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public Luckyblock getLuckyblock() {
        return luckyblock;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
