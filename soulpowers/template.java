// Class name must be the same as the file name
import org.bukkit.entity.Player;

import valorless.valorlessutils.ValorlessUtils.Log;
@SoulPowerInfo(
	type = "onAttack", // trigger type (onAttack, onDefence, onKill, onEquip, etc.)
	cooldown = "5", // cooldown in seconds
	chance = "30", // chance percentage to activate (0-100)
	failCooldown = "true" // whether to apply cooldown on failed activation attempts
)
public class template implements SoulPower {
	@Override
	public void execute(ItemData data, Player player) {
		// Template, knocking up player.
		Vector knockUpVector = new Vector(0, 1, 0);
		player.setVelocity(knockUpVector);
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
