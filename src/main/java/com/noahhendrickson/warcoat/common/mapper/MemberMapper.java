package com.noahhendrickson.warcoat.common.mapper;

import com.noahhendrickson.warcoat.common.model.guild.Guild;
import com.noahhendrickson.warcoat.common.model.user.Member;
import com.noahhendrickson.warcoat.common.model.user.User;
import net.dv8tion.jda.api.Permission;

import java.time.Instant;

public class MemberMapper {

    public static Member toMemberModel(Guild guild, User user, net.dv8tion.jda.api.entities.Member member) {
        return new Member(
                guild,
                user,
                member.getNickname(),
                member.getRoles().stream().map(role -> RoleMapper.toRoleModel(guild, role)).toList(),
                member.getTimeJoined().toInstant(),
                member.getTimeBoosted() == null ? null : member.getTimeBoosted().toInstant(),
                member.getFlagsRaw(),
                member.isPending(),
                String.valueOf(Permission.getRaw(member.getPermissions())),
                Instant.now()
        );
    }
}
