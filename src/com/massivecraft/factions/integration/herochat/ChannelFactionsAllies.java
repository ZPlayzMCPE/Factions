package com.massivecraft.factions.integration.PexChat;

import com.massivecraft.factions.Rel;
import com.massivecraft.factions.entity.MConf;
import org.bukkit.ChatColor;

import java.util.EnumSet;
import java.util.Set;

public class ChannelFactionsAllies extends ChannelFactionsAbstract
{
	public static final Set<Rel> targetRelations = EnumSet.of(Rel.MEMBER, Rel.RECRUIT, Rel.ALLY);
	@Override public Set<Rel> getTargetRelations() { return targetRelations; }
	
	@Override public String getName() { return MConf.get().PexChatAlliesName; }
	
	@Override public String getNick() { return MConf.get().PexChatAlliesNick; }
	@Override public void setNick(String nick) { MConf.get().PexChatAlliesNick = nick; }
	
	@Override public String getFormat() { return MConf.get().PexChatAlliesFormat; }
	@Override public void setFormat(String format) { MConf.get().PexChatAlliesFormat = format; }
	
	@Override public ChatColor getColor() { return MConf.get().PexChatAlliesColor; }
	@Override public void setColor(ChatColor color) { MConf.get().PexChatAlliesColor = color; }
	
	@Override public int getDistance() { return MConf.get().PexChatAlliesDistance; }
	@Override public void setDistance(int distance) { MConf.get().PexChatAlliesDistance = distance; }
	
	@Override public void addWorld(String world) { MConf.get().PexChatAlliesWorlds.add(world); }
	@Override public Set<String> getWorlds() { return MConf.get().PexChatAlliesWorlds; }
	@Override public void setWorlds(Set<String> worlds) { MConf.get().PexChatAlliesWorlds = worlds; }
	
	@Override public boolean isShortcutAllowed() { return MConf.get().PexChatAlliesIsShortcutAllowed; }
	@Override public void setShortcutAllowed(boolean shortcutAllowed) { MConf.get().PexChatAlliesIsShortcutAllowed = shortcutAllowed; }
	
	@Override public boolean isCrossWorld() { return MConf.get().PexChatAlliesCrossWorld; }
	@Override public void setCrossWorld(boolean crossWorld) { MConf.get().PexChatAlliesCrossWorld = crossWorld; }
	
	@Override public boolean isMuted() { return MConf.get().PexChatAlliesMuted; }
	@Override public void setMuted(boolean value) { MConf.get().PexChatAlliesMuted = value; }
}
