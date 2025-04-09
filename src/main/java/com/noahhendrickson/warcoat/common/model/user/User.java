package com.noahhendrickson.warcoat.common.model.user;

import java.time.Instant;
import java.util.Objects;

public class User {

    private String id;
    private String username;
    private String discriminator;
    private String globalName;
    private String avatarUrl;
    private boolean bot;
    private boolean system;
    private String bannerUrl;
    private int accentColor;
    private int flags;
    private Instant createdAt;
    private Instant lastUpdatedAt;

    public User() {
    }

    public User(String id, String username, String discriminator, String globalName, String avatarUrl, boolean bot, boolean system, String bannerUrl, int accentColor, int flags, Instant createdAt, Instant lastUpdatedAt) {
        this.id = id;
        this.username = username;
        this.discriminator = discriminator;
        this.globalName = globalName;
        this.avatarUrl = avatarUrl;
        this.bot = bot;
        this.system = system;
        this.bannerUrl = bannerUrl;
        this.accentColor = accentColor;
        this.flags = flags;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getGlobalName() {
        return globalName;
    }

    public void setGlobalName(String globalName) {
        this.globalName = globalName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public boolean isSystem() {
        return system;
    }

    public void setSystem(boolean system) {
        this.system = system;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public int getAccentColor() {
        return accentColor;
    }

    public void setAccentColor(int accentColor) {
        this.accentColor = accentColor;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Instant lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof User user)) return false;

        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
