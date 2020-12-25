package org.sickskillz.superluckyblock.api.luckyblocks;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.sickskillz.superluckyblock.api.animations.Animation;
import org.sickskillz.superluckyblock.api.enums.OpenMode;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Luckyblock {
    String getFileName();

    @Nullable
    Animation getAnimation();

    void setAnimation(@Nullable Animation animation);

    String getFileNameWithoutExtension();

    Set<Surprise> getSurprises();

    void addSurprise(Surprise surprise);

    boolean hasSurprise(Surprise surprise);

    ItemStack getLuckyBlockItem();

    FileConfiguration getConfig();

    boolean isBlockLuckyblock(Block block);

    boolean isItemStackLuckyblock(ItemStack itemStack);

    boolean takeFromPlayer(Player player, int amount);

    void giveToPlayer(Player player, int amount);

    boolean isEconomyEnabled();

    int getBuyPrice();

    int getSellPrice();

    String getSkullOwner();

    List<String> getDisabledWorlds();

    boolean isSoundEnabled();

    String getSoundName();

    float getSoundVolume();

    float getSoundPitch();

    boolean isParticlesEnabled();

    String getParticleName();

    int getParticleAmount();

    boolean isLuckyMiningEnabled();

    boolean isCreativeAllowed();

    boolean isCreativeBreakingDisabled();

    boolean isCreativeInteractionDisabled();

    OpenMode getOpenMode();

    Map<Material, Double> getMiningChances();

    boolean isCraftingEnabled();

    Map<String, Material> getRecipe();

    boolean isPermissionEnabled();

    String getPermission();
}
