package com.massivecraft.factions.integration.PexChat;

import com.massivecraft.massivecore.Engine;
import com.massivecraft.massivecore.Integration;

public class IntegrationPexChat extends Integration
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static IntegrationPexChat i = new IntegrationPexChat();
	public static IntegrationPexChat get() { return i; }
	private IntegrationPexChat()
	{
		this.setPluginName("PexChat");
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public Engine getEngine()
	{
		return EnginePexChat.get();
	}
	
}
