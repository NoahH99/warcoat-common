package com.noahhendrickson.warcoat.common.mapper;

import com.noahhendrickson.warcoat.common.model.guild.Guild;
import com.noahhendrickson.warcoat.common.model.guild.Role;
import net.dv8tion.jda.api.entities.RoleIcon;

import java.time.Instant;

public class RoleMapper {

    public static Role toRoleModel(Guild guild, net.dv8tion.jda.api.entities.Role role) {
        RoleIcon icon = role.getIcon();

        return new Role(
                guild,
                role.getId(),
                role.getName(),
                role.getColorRaw(),
                role.isHoisted(),
                icon == null ? null : icon.getIconUrl(),
                icon == null ? null : icon.getEmoji(),
                role.getPosition(),
                String.valueOf(role.getPermissionsRaw()),
                role.isManaged(),
                role.isMentionable(),
                Instant.now()
        );
    }
}
