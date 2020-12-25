package org.sickskillz.superluckyblock.api.managers;

import org.sickskillz.superluckyblock.api.luckyblocks.Luckyblock;
import org.sickskillz.superluckyblock.api.luckyblocks.Surprise;

import java.util.Set;

public interface LuckyblockManager {

    Luckyblock getLuckyBlockByFileName(String fileName);

    Set<Luckyblock> getLuckyBlocks();

    void registerSurprise(String luckyblockName, Surprise surprise);

    void registerSurprises(String luckyblockName, Surprise... surprises);

    boolean isLuckyBlockRegistered(String luckyblockName);

    void clearLuckyblocks();
}
