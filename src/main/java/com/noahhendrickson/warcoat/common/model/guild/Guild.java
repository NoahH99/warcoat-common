package com.noahhendrickson.warcoat.common.model.guild;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class Guild {

    private String id;
    private String name;
    private String iconUrl;
    private String description;
    private String bannerUrl;
    private String ownerId;
    private String vanityUrlCode;
    private int verificationLevel;

    private List<Role> roles;

    private int premiumTier;
    private String preferredLocale;
    private Instant joinedAt;
    private Instant lastUpdatedAt;

    public Guild() {
    }

    public Guild(String id, String name, String iconUrl, String description, String bannerUrl, String ownerId, String vanityUrlCode, int verificationLevel, List<Role> roles, int premiumTier, String preferredLocale, Instant joinedAt, Instant lastUpdatedAt) {
        this.id = id;
        this.name = name;
        this.iconUrl = iconUrl;
        this.description = description;
        this.bannerUrl = bannerUrl;
        this.ownerId = ownerId;
        this.vanityUrlCode = vanityUrlCode;
        this.verificationLevel = verificationLevel;
        this.roles = roles;
        this.premiumTier = premiumTier;
        this.preferredLocale = preferredLocale;
        this.joinedAt = joinedAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getVanityUrlCode() {
        return vanityUrlCode;
    }

    public void setVanityUrlCode(String vanityUrlCode) {
        this.vanityUrlCode = vanityUrlCode;
    }

    public int getVerificationLevel() {
        return verificationLevel;
    }

    public void setVerificationLevel(int verificationLevel) {
        this.verificationLevel = verificationLevel;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public int getPremiumTier() {
        return premiumTier;
    }

    public void setPremiumTier(int premiumTier) {
        this.premiumTier = premiumTier;
    }

    public String getPreferredLocale() {
        return preferredLocale;
    }

    public void setPreferredLocale(String preferredLocale) {
        this.preferredLocale = preferredLocale;
    }

    public Instant getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }

    public Instant getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Instant lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Guild guild)) return false;

        return Objects.equals(id, guild.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
