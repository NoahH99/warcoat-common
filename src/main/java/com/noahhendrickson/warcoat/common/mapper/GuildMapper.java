package com.noahhendrickson.warcoat.common.mapper;

import com.noahhendrickson.warcoat.common.model.guild.Guild;

import java.time.Instant;
import java.util.stream.Collectors;

public class GuildMapper {

    public static Guild toGuildModel(net.dv8tion.jda.api.entities.Guild guild) {
        Guild guildModel = new Guild(
                guild.getId(),
                guild.getName(),
                guild.getIconUrl(),
                guild.getDescription(),
                guild.getBannerUrl(),
                guild.getOwnerId(),
                guild.getVanityCode(),
                guild.getVerificationLevel().getKey(),
                null,
                guild.getBoostTier().getKey(),
                guild.getLocale().getLocale(),
                guild.getSelfMember().getTimeJoined().toInstant(),
                Instant.now()
        );

        guildModel.setRoles(guild.getRoles().stream().map(role -> RoleMapper.toRoleModel(guildModel, role)).collect(Collectors.toList()));

        return guildModel;
    }
}
