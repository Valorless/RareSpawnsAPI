# RareSpawns
 
[![Build Plugin](https://github.com/Valorless/RareSpawns/actions/workflows/maven.yml/badge.svg?branch=main)]()

Docs: https://valorless.github.io/RareSpawns

RareSpawns is a Minecraft plugin for Spigot/Paper that introduces configurable, data-driven rare entity spawns with unique loot and abilities, plus a standalone custom item system. Rares and items are defined by IDs, enabling consistent lookups, integrations, and content reuse. Standalone custom items are not tied to entities and can be granted via commands. A lightweight Java API lets other plugins detect rares, fetch IDs, build items (optionally randomized), and enumerate available entities and abilities. It also exposes events so you can react to rare spawns, updates, and deaths.

### Key capabilities:

	•  Configurable rare entities with ID-based definitions, unique drops, and abilities
	•  Standalone custom items obtainable via commands, independent of entities
	•  Ability system with ID lookups and pluggable behaviors
	•  Lightweight API for detection, ID resolution, item building, listing content, and programmatic spawns
	•  Synchronous API events for spawn, update, and death to integrate with your systems
	•  Designed for clean integration with external plugins

### Developer API:
https://github.com/Valorless/RareSpawnsLite/wiki/API

	•  Detection & IDs: isRare(Entity), isRareItem(ItemStack), getRareID(Entity), getRareID(ItemStack)
	•  Items: getItem(id, randomize) to build items by ID with optional randomization, getItemData(id) to read definition data, getItemIds() to enumerate items
	•  Rares: getRare(id) to fetch rare entity data, getRareIds() to enumerate rares, spawnRare(id, Location) to spawn via API
	•  Abilities: getAbilityIds() to list available ability IDs
	•  Events: RareSpawnEvent (with SpawnCause), RareUpdateEvent, RareDeathEvent for reacting to lifecycle
	•  Plugin access: getInstance() returns the active JavaPlugin

See API docs for details: https://valorless.github.io/RareSpawns

### Use cases:

	•  Reward systems that react to rare kills and drops
	•  Command-only collectibles and keys using standalone items
	•  GUI or command listings sourced from getItemIds(), getRareIds(), and getAbilityIds()
	•  Inter-plugin features that need to recognize or generate RareSpawns content by ID

Configuration is data-driven to keep content definition flexible and maintainable. The API surface is minimal and static, making it straightforward for other plugins to depend on RareSpawns and interact with rares, items, and abilities by their identifiers.
