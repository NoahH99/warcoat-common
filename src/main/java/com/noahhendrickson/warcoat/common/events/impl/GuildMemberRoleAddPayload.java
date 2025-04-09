package com.noahhendrickson.warcoat.common.events.impl;

import com.noahhendrickson.warcoat.common.events.WarcoatEventPayload;
import com.noahhendrickson.warcoat.common.model.guild.Guild;
import com.noahhendrickson.warcoat.common.model.guild.Role;
import com.noahhendrickson.warcoat.common.model.user.Member;
import com.noahhendrickson.warcoat.common.model.user.User;

import java.util.List;

public class GuildMemberRoleAddPayload implements WarcoatEventPayload {

    private Guild guild;
    private User user;
    private Member member;
    private List<Role> roles;

    public GuildMemberRoleAddPayload() {
    }

    public GuildMemberRoleAddPayload(Guild guild, User user, Member member, List<Role> roles) {
        this.guild = guild;
        this.user = user;
        this.member = member;
        this.roles = roles;
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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
