package com.noahhendrickson.warcoat.common.model.guild;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.time.Instant;
import java.util.Objects;

public class Role {

    @JsonBackReference("guild-roles")
    private Guild guild;

    private String id;
    private String name;
    private int color;
    private boolean hoist;
    private String iconUrl;
    private String unicodeEmoji;
    private int position;
    private String permissions;
    private boolean managed;
    private boolean mentionable;
    private Instant lastUpdatedAt;

    public Role() {
    }

    public Role(Guild guild, String id, String name, int color, boolean hoist, String iconUrl, String unicodeEmoji, int position, String permissions, boolean managed, boolean mentionable, Instant lastUpdatedAt) {
        this.guild = guild;
        this.id = id;
        this.name = name;
        this.color = color;
        this.hoist = hoist;
        this.iconUrl = iconUrl;
        this.unicodeEmoji = unicodeEmoji;
        this.position = position;
        this.permissions = permissions;
        this.managed = managed;
        this.mentionable = mentionable;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
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

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isHoist() {
        return hoist;
    }

    public void setHoist(boolean hoist) {
        this.hoist = hoist;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getUnicodeEmoji() {
        return unicodeEmoji;
    }

    public void setUnicodeEmoji(String unicodeEmoji) {
        this.unicodeEmoji = unicodeEmoji;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public boolean isManaged() {
        return managed;
    }

    public void setManaged(boolean managed) {
        this.managed = managed;
    }

    public boolean isMentionable() {
        return mentionable;
    }

    public void setMentionable(boolean mentionable) {
        this.mentionable = mentionable;
    }

    public Instant getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Instant lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Role role)) return false;

        return Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
