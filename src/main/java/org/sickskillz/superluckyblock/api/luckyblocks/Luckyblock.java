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

    /**
     * Gets the filename of this luckyblock.
     *
     * @return The name of the YAML file of this luckyblock, including .yml.
     */
    String getFileName();


    /**
     * Gets the filename of this luckyblock, without it's file extension.
     *
     * @return The name of the YAML file of this luckyblock, excluding .yml.
     */
    String getFileNameWithoutExtension();

    /**
     * Gets the {@link Animation} of this luckyblock.
     *
     * @return The animation for this Luckyblock or null when it has no animation registered.
     */
    @Nullable
    Animation getAnimation();

    /**
     * Sets the Luckyblock {@link Animation}
     *
     * @param animation The {@link Animation} object.
     */
    void setAnimation(@Nullable Animation animation);

    /**
     * Gets all {@link Surprise}s registered for this luckyblock.
     *
     * @return All {@link Surprise}s registered for this luckyblock.
     */
    Set<Surprise> getSurprises();

    /**
     * Adds a {@link Surprise} to this Luckyblock.
     *
     * @param surprise The {@link Surprise} to add to this luckyblock.
     * @throws
     */
    void addSurprise(Surprise surprise);

    /**
     * Gets if a certain {@link Surprise} has already been registered.
     *
     * @param surprise The {@link Surprise} that should be searched for.
     * @return Is de surprise registered.
     */
    boolean hasSurprise(Surprise surprise);

    /**
     * Gets the ItemStack for this Luckyblock.
     *
     * @return The ItemStack for this Luckyblock.
     */
    ItemStack getLuckyBlockItem();

    /**
     * Gets the config for this Luckyblock.
     *
     * @return The FileConfiguration for this Luckyblock.
     */
    FileConfiguration getConfig();

    /**
     * Checks if the given block is this Luckyblock.
     *
     * @param block The block to check.
     * @return Is the given block this luckyblock.
     */
    boolean isBlockLuckyblock(Block block);

    /**
     * Checks if the given ItemStack is this luckyblock.
     *
     * @param itemStack The ItemStack to check.
     * @return Is the given ItemStack this luckyblock.
     */
    boolean isItemStackLuckyblock(ItemStack itemStack);

    /**
     * Takes the amount of luckyblocks from the player's inventory, if possible.
     * If not possible, the luckyblocks will not be taken.
     *
     * @param player The Player.
     * @param amount The amount of Luckyblocks to take.
     * @return True if the provided amount of Luckyblocks could be taken, false if this was not possible.
     */
    boolean takeFromPlayer(Player player, int amount);

    /**
     * Gives the provided amount of Luckyblocks to the Player.
     *
     * @param player The Player.
     * @param amount The amount of Luckyblocks to give.
     */
    void giveToPlayer(Player player, int amount);

    /**
     * Gets if the economy feature is enabled for this Luckyblock.
     * If economy is enabled, this luckyblock can be bought or sold.
     *
     * @return Is the economy feature enabled.
     */
    boolean isEconomyEnabled();

    /**
     * Gets the buy price for the Luckyblock.
     *
     * @return The price of the Luckyblock.
     */
    int getBuyPrice();

    /**
     * Gets the sell price for the Luckyblock.
     *
     * @return The sell price for this Luckyblock.
     */
    int getSellPrice();

    /**
     * Gets the owner of this skull.
     * This might also be a Vanilla block. If that is the case, the String will be prefixed with "block:"
     *
     * @return The name of the owning player of the skull.
     */
    String getSkullOwner();

    /**
     * Gets the names of all Worlds this luckyblock can't be used in.
     *
     * @return A Set of the names of all disabled Worlds.
     */
    List<String> getDisabledWorlds();

    /**
     * Gets if sound has been enabled for this luckyblock.
     *
     * @return Is sound enabled for this luckyblock.
     */
    boolean isSoundEnabled();

    /**
     * Gets the name of the Sound that plays on break.
     * This name might be invalid so it is recommended to check if it is in the Sound enum.
     *
     * @return The name of the sounds for this Luckyblock.
     */
    String getSoundName();

    /**
     * Gets the volume of the sound.
     *
     * @return The volume of the sound.
     */
    float getSoundVolume();

    /**
     * Gets the pitch of the sound.
     *
     * @return The pitch of the sound.
     */
    float getSoundPitch();

    /**
     * Gets if particles are enabled for this Luckyblock.
     *
     * @return Are particles enabled.
     */
    boolean isParticlesEnabled();

    /**
     * Gets the name of the Particle that spawns on break.
     * This name might be invalid so it is recommended to check if it is in the Particle enum.
     *
     * @return The name of the particle.
     */
    String getParticleName();

    /**
     * Gets the amount of particles to spawn.
     *
     * @return The amount of particles to spawn.
     */
    int getParticleAmount();

    /**
     * Gets if the Luckymining feature has been enabled.
     *
     * @return Is Luckymining enabled.
     */
    boolean isLuckyMiningEnabled();

    /**
     * Gets if the block will reward the Player while the Player is in creative.
     *
     * @return Is creative allowed.
     */
    boolean isCreativeAllowed();

    /**
     * Gets if breaking the block in creative is allowed.
     * When false, the block will not break and no reward will be given.
     *
     * @return Is breaking in creative disabled.
     */
    boolean isCreativeBreakingDisabled();

    /**
     * Gets if interacting with this block in any way is allowed in creative.
     *
     * @return Is interaction in creative allowed.
     */
    boolean isCreativeInteractionDisabled();

    /**
     * Gets the mode this Luckyblock uses for opening. See {@link OpenMode} for more details.
     *
     * @return The {@link OpenMode} of this block.
     */
    OpenMode getOpenMode();

    /**
     * Gets all Luckymining blocks and their chances to drop a Luckyblock.
     *
     * @return A Map with all blocks and their chances. The key is the Material, the value is the chance as a Double.
     */
    Map<Material, Double> getMiningChances();

    /**
     * Gets if crafting is enabled for this Luckyblock.
     *
     * @return Is crafting enabled.
     */
    boolean isCraftingEnabled();

    /**
     * Gets the slot and the Material for this slot for the crafting recipe of this Luckyblock.
     *
     * @return A Map containing the slot and the Material. The key is the config key, the value is the MAterial.
     */
    Map<String, Material> getRecipe();

    /**
     * Gets if the permission feature has been enabled.
     *
     * @return Is the permission feature enabled.
     */
    boolean isPermissionEnabled();

    /**
     * Gets the permission required for this Luckyblock.
     *
     * @return The permission for this Luckyblock.
     */
    String getPermission();
}
