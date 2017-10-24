package com.massivecraft.factions.integration.PexChat;

import com.massivecraft.factions.Rel;
import com.massivecraft.factions.entity.MConf;
import org.bukkit.ChatColor;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class ChannelFactionsFaction extends ChannelFactionsAbstract
{
	public static final Set<Rel> targetRelations = EnumSet.of(Rel.MEMBER, Rel.RECRUIT);
	@Override public Set<Rel> getTargetRelations() { return targetRelations; }
	
	@Override public String getName() { return MConf.get().PexChatFactionName; }
	
	@Override public String getNick() { return MConf.get().PexChatFactionNick; }
	@Override public void setNick(String nick) { MConf.get().PexChatFactionNick = nick; }
	
	@Override public String getFormat() { return MConf.get().PexChatFactionFormat; }
	@Override public void setFormat(String format) { MConf.get().PexChatFactionFormat = format; }
	
	@Override public ChatColor getColor() { return MConf.get().PexChatFactionColor; }
	@Override public void setColor(ChatColor color) { MConf.get().PexChatFactionColor = color; }
	
	@Override public int getDistance() { return MConf.get().PexChatFactionDistance; }
	@Override public void setDistance(int distance) { MConf.get().PexChatFactionDistance = distance; }
	
	@Override public void addWorld(String world) { MConf.get().PexChatFactionWorlds.add(world); }
	@Override public Set<String> getWorlds() { return new HashSet<>(MConf.get().PexChatFactionWorlds); }
	@Override public void setWorlds(Set<String> worlds) { MConf.get().PexChatFactionWorlds = worlds; }
	
	@Override public boolean isShortcutAllowed() { return MConf.get().PexChatFactionIsShortcutAllowed; }
	@Override public void setShortcutAllowed(boolean shortcutAllowed) { MConf.get().PexChatFactionIsShortcutAllowed = shortcutAllowed; }
	
	@Override public boolean isCrossWorld() { return MConf.get().PexChatFactionCrossWorld; }
	@Override public void setCrossWorld(boolean crossWorld) { MConf.get().PexChatFactionCrossWorld = crossWorld; }
	
	@Override public boolean isMuted() { return MConf.get().PexChatFactionMuted; }
	@Override public void setMuted(boolean value) { MConf.get().PexChatFactionMuted = value; }
}
