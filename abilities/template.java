// Class name must be the same as the file name
@AbilityInfo(
    name = "Template", // Ability name
	cooldown = "5", // cooldown in seconds
	single = "true" // single use (true/false)
)
public class template implements Ability {
	/**
	 * Executes the ability, applying a knock-up effect to all players within a certain radius of the entity.
	 * Each player within the specified radius will have their velocity set upwards, causing them to be knocked up into the air.
	 */
	@Override
	public void execute(EntityData data, Mob rare) {
		// Iterate over all players within a 5 block radius around the entity
		for (Player player : EntityUtils.getPlayersInRadius(rare, 5)) {

			// Create a knock-up vector (this will push players upward with a velocity of 5 on the Y-axis)
			Vector knockUpVector = new Vector(0, 5, 0);

			// Set the player's velocity to the knock-up vector, making them move upwards
			player.setVelocity(knockUpVector);
		}
	}
}

	// Note: These are the following default imports:
	/*
		import java.util.ArrayList;
				import java.util.HashMap;
				import java.util.List;
				import java.util.Set;
				import java.util.Map;
				import java.util.Iterator;
				import java.util.ListIterator;
				import java.util.Collections;
				import java.util.Arrays;
				import java.util.Objects;
				import java.util.Random;
				import java.util.UUID;
				import java.util.Date;
				import java.io.*;
				import java.net.*;
				import org.bukkit.*;
				import org.bukkit.block.*;
				import org.bukkit.entity.*;
				import org.bukkit.event.*;
				import org.bukkit.entity.LivingEntity;
				import org.bukkit.event.player.*;
				import org.bukkit.inventory.*;
				import org.bukkit.plugin.*;
				import org.bukkit.scheduler.*;
				import org.bukkit.util.*;
				import valorless.rarespawns.*;
				import valorless.rarespawns.api.*;
				import valorless.rarespawns.ability.Ability;
				import valorless.rarespawns.ability.AbilityInfo;
				import valorless.rarespawns.builders.*;
				import valorless.rarespawns.datamodels.*;
				import valorless.rarespawns.utils.*;
				import valorless.rarespawns.persistentdatacontainer.PDC;
				import valorless.rarespawns.soulpower.SoulPower;
				import valorless.rarespawns.soulpower.SoulPowerInfo;
				import valorless.valorlessutils.*;
	 */
