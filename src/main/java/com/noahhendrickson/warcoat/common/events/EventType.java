package com.noahhendrickson.warcoat.common.events;

import com.noahhendrickson.warcoat.common.events.impl.GuildMemberJoinPayload;
import com.noahhendrickson.warcoat.common.events.impl.GuildMemberRoleAddPayload;

import java.util.Map;

public enum EventType {
    GUILD_MEMBER_JOIN,
    GUILD_MEMBER_ROLE_ADD;

    public static final Map<EventType, Class<? extends WarcoatEventPayload>> PAYLOAD_TYPES = Map.of(
            GUILD_MEMBER_JOIN, GuildMemberJoinPayload.class,
            GUILD_MEMBER_ROLE_ADD, GuildMemberRoleAddPayload.class
    );
}
