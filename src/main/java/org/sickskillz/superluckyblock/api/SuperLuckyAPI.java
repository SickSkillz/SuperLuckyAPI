package org.sickskillz.superluckyblock.api;

import org.sickskillz.superluckyblock.api.managers.LuckyblockManager;

public class SuperLuckyAPI {

    private static LuckyblockManager luckyblockManager;

    public static LuckyblockManager getLuckyblockManager() {
        return luckyblockManager;
    }

    public static void setLuckyblockManager(LuckyblockManager luckyblockManager) {
        SuperLuckyAPI.luckyblockManager = luckyblockManager;
    }
}
