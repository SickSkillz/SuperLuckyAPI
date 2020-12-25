package org.sickskillz.superluckyblock.api.enums;

import org.sickskillz.superluckyblock.api.luckyblocks.Luckyblock;

/**
 * The different modes of opening a {@link Luckyblock}.
 */
public enum OpenMode {
    /**
     * The {@link Luckyblock} will be opened by breaking it.
     */
    BREAK,

    /**
     * The {@link Luckyblock} will be opened by left or right clicking a placed block.
     */
    CLICK_PLACED,

    /**
     * The {@link Luckyblock} will be opened by left or right clicking it while holding it in your hand..
     */
    CLICK_HAND
}
