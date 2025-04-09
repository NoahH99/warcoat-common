package com.noahhendrickson.warcoat.common.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.noahhendrickson.warcoat.common.model.guild.Guild;
import com.noahhendrickson.warcoat.common.model.guild.Role;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class Member {

    private Guild guild;
    private User user;

    private String nickname;

    private List<Role> roles;

    private Instant joinedAt;
    private Instant premiumSince;
    private int flags;
    private boolean pending;
    private String permissions;
    private Instant lastUpdatedAt;

    public Member() {
    }

    public Member(Guild guild, User user, String nickname, List<Role> roles, Instant joinedAt, Instant premiumSince, int flags, boolean pending, String permissions, Instant lastUpdatedAt) {
        this.guild = guild;
        this.user = user;
        this.nickname = nickname;
        this.roles = roles;
        this.joinedAt = joinedAt;
        this.premiumSince = premiumSince;
        this.flags = flags;
        this.pending = pending;
        this.permissions = permissions;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Instant getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }

    public Instant getPremiumSince() {
        return premiumSince;
    }

    public void setPremiumSince(Instant premiumSince) {
        this.premiumSince = premiumSince;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Instant getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Instant lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;

        return Objects.equals(guild, member.guild);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guild);
    }
}
