package org.sickskillz.superluckyblock.api.managers;

import org.sickskillz.superluckyblock.api.luckyblocks.Luckyblock;
import org.sickskillz.superluckyblock.api.luckyblocks.Surprise;

import java.util.Set;

public interface LuckyblockManager {

    /**
     * Gets the {@link Luckyblock} object from the given file.
     *
     * @param fileName The filename of the luckyblock, including the file extension.
     * @return The {@link Luckyblock} object from the given file.
     */
    Luckyblock getLuckyBlockByFileName(String fileName);

    /**
     * Gets all currently registered luckyblocks.
     *
     * @return A set with all registered {@link Luckyblock} objects.
     */
    Set<Luckyblock> getLuckyBlocks();

    /**
     * Adds a {@link Surprise} to the {@link Luckyblock} from the given filename.
     * This method is mainly used for registering CustomSurprises (not implemented yet).
     *
     * @param luckyblockName The filename of the luckyblock, including the file extension.
     * @param surprise The {@link Surprise} object.
     */
    void registerSurprise(String luckyblockName, Surprise surprise);

    /**
     * Adds multiple {@link Surprise} objects to the {@link Luckyblock} from the given filename.
     * This method is mainly used for registering CustomSurprises (not implemented yet).
     *
     * @param luckyblockName The filename of the luckyblock, including the file extension.
     * @param surprises Multiple {@link Surprise} objects.
     */
    void registerSurprises(String luckyblockName, Surprise... surprises);

    /**
     * Returns if the {@link Luckyblock} from the given filename has been registered already.
     *
     * @param luckyblockName The filename of the luckyblock, including the file extension.
     * @return Is the {@link Luckyblock} registered.
     */
    boolean isLuckyBlockRegistered(String luckyblockName);

    /**
     * Fully clears the LuckyBlock cache. Should generally not be used.
     */
    void clearLuckyblocks();
}
