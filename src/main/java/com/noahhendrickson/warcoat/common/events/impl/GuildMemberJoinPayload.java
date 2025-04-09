package com.noahhendrickson.warcoat.common.events.impl;

import com.noahhendrickson.warcoat.common.events.WarcoatEventPayload;
import com.noahhendrickson.warcoat.common.model.guild.Guild;
import com.noahhendrickson.warcoat.common.model.user.Member;
import com.noahhendrickson.warcoat.common.model.user.User;

public class GuildMemberJoinPayload implements WarcoatEventPayload {

    private Guild guild;
    private User user;
    private Member member;

    public GuildMemberJoinPayload() {
    }

    public GuildMemberJoinPayload(Guild guild, User user, Member member) {
        this.guild = guild;
        this.user = user;
        this.member = member;
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
}
