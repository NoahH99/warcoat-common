package com.noahhendrickson.warcoat.common.mapper;

import com.noahhendrickson.warcoat.common.model.user.User;

import java.time.Instant;

public class UserMapper {

    public static User toUser(net.dv8tion.jda.api.entities.User user, net.dv8tion.jda.api.entities.User.Profile profile) {
        return new User(
                user.getId(),
                user.getName(),
                user.getDiscriminator(),
                user.getGlobalName(),
                user.getAvatarUrl(),
                user.isBot(),
                user.isSystem(),
                profile.getBannerUrl(),
                profile.getAccentColorRaw(),
                user.getFlagsRaw(),
                user.getTimeCreated().toInstant(),
                Instant.now()
        );
    }
}
