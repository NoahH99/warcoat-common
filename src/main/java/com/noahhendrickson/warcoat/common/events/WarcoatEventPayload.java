package com.noahhendrickson.warcoat.common.events;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.noahhendrickson.warcoat.common.events.impl.GuildMemberJoinPayload;
import com.noahhendrickson.warcoat.common.events.impl.GuildMemberRoleAddPayload;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = GuildMemberJoinPayload.class, name = "GUILD_MEMBER_JOIN"),
        @JsonSubTypes.Type(value = GuildMemberRoleAddPayload.class, name = "GUILD_MEMBER_ROLE_ADD")
})
public interface WarcoatEventPayload {
}
