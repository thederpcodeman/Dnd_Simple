package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class FghtSub extends Choice {
    public FghtSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Arcane Archer (Fighter)"));
        pick.add(new Option("Banneret (Fighter)"));
        pick.add(new Option("Battle Master (Fighter)"));
        pick.add(new Option("Cavalier (Fighter)"));
        pick.add(new Option("Champion (Fighter)"));
        pick.add(new Option("Echo Knight (Fighter)"));
        pick.add(new Option("Eldrich Knight (Fighter)"));
        pick.add(new Option("Psi Warrior (Fighter)"));
        pick.add(new Option("Rune Knight (Fighter)"));
        pick.add(new Option("Samurai (Fighter)"));
        pick.add(new Option("Gunslinger ('D&D Beyond') (Fighter)", false, true));
        pick.add(new Subchoice("Renegade ('Legends of Runeterra: Dark Tides of Bilgewater') (Fighter)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option("Pistoleer (Renagade)"),
                new Option("Sniper (Renagade)")
        )))), false, true));


        pick.add(new Option("4's Dead ('dandwiki')(Fighter)", true));
        pick.add(new Option("Abyssal Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Abysswalker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Acrobatic Nomad ('dandwiki')(Fighter)", true));
        pick.add(new Option("Adept Survivor ('dandwiki')(Fighter)", true));
        pick.add(new Option("Aerial Combatant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Air Planetouched Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Ancestral Weapon Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Anti-Mage ('dandwiki')(Fighter)", true));
        pick.add(new Option("Anti-Mage Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Anti-Magic Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Aran ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Battle Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Dragoon Lancer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Guardian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Pugilist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Swordsman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Thrower ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Warden ('dandwiki')(Fighter)", true));
        pick.add(new Option("Arcane Weapon Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Archdragoon ('dandwiki')(Fighter)", true));
        pick.add(new Option("Archfighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Armory ('dandwiki')(Fighter)", true));
        pick.add(new Option("Armstrong Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Artillerist, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Artillery Specialist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Ascendent Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Atlas ('dandwiki')(Fighter)", true));
        pick.add(new Option("Atlira Arcane Archer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Avian Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Axemaster ('dandwiki')(Fighter)", true));
        pick.add(new Option("Back-Alley ('dandwiki')(Fighter)", true));
        pick.add(new Option("Banner Commander ('dandwiki')(Fighter)", true));
        pick.add(new Option("Banneret, Revised ('dandwiki')(Fighter)", true));
        pick.add(new Option("Banneret, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Banuk Shaman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Barbarian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Battle Enchanter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Battle Fiend ('dandwiki')(Fighter)", true));
        pick.add(new Option("Battle Healer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Battle Master, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Battle Master, Variant 2 ('dandwiki')(Fighter)", true));
        pick.add(new Option("Beast Alma ('dandwiki')(Fighter)", true));
        pick.add(new Option("Beast Rider ('dandwiki')(Fighter)", true));
        pick.add(new Option("Beastheart Brawler ('dandwiki')(Fighter)", true));
        pick.add(new Option("Berserk ('dandwiki')(Fighter)", true));
        pick.add(new Option("Berserk Fighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Black Warden ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blade Dancer, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blade Grappler ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blade Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blade Slinger ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blade-throwing Bulwark ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blightbearer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blitz Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blitzkrieger ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blood Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blood Knight, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Blood Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Bloody Executioner ('dandwiki')(Fighter)", true));
        pick.add(new Option("Bond Wielder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Bone Breaker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Bow Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Brambleknight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Brawler ('dandwiki')(Fighter)", true));
        pick.add(new Option("Briar Champion ('dandwiki')(Fighter)", true));
        pick.add(new Option("Broken Soldier ('dandwiki')(Fighter)", true));
        pick.add(new Option("Bronze Age Hoplite ('dandwiki')(Fighter)", true));
        pick.add(new Option("Brutal Combatant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Bulwark ('dandwiki')(Fighter)", true));
        pick.add(new Option("Bulwark Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Cannoneer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Cavalier, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Cavalier, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Celestial Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Chain Fighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Chain Wielder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Champion, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Champion, 3rd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Champion, 4th Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Champion, 5th Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Champion, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Chaos Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Chaplain ('dandwiki')(Fighter)", true));
        pick.add(new Option("Chesser ('dandwiki')(Fighter)", true));
        pick.add(new Option("Chrono Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Claw of Konjoshu ('dandwiki')(Fighter)", true));
        pick.add(new Option("Cold Heart, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Colossal Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Colossus Wielder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Combo Combatant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Combo Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Commander ('dandwiki')(Fighter)", true));
        pick.add(new Option("Contender ('dandwiki')(Fighter)", true));
        pick.add(new Option("Corrupted Saint ('dandwiki')(Fighter)", true));
        pick.add(new Option("Crusader ('dandwiki')(Fighter)", true));
        pick.add(new Option("Crystal Mage ('dandwiki')(Fighter)", true));
        pick.add(new Option("Cursed Lycanthrope ('dandwiki')(Fighter)", true));
        pick.add(new Option("Custodian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dark Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dark Knight FF X-2 ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dawnwarden ('dandwiki')(Fighter)", true));
        pick.add(new Option("Deadeye ('dandwiki')(Fighter)", true));
        pick.add(new Option("Death Guard ('dandwiki')(Fighter)", true));
        pick.add(new Option("Death Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Death Magus ('dandwiki')(Fighter)", true));
        pick.add(new Option("Deathknight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Demon Hunter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Demon's Spearmen ('dandwiki')(Fighter)", true));
        pick.add(new Option("Demonic Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Demonic Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dervish ('dandwiki')(Fighter)", true));
        pick.add(new Option("Destroyer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Diluvian Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Divine Crusader ('dandwiki')(Fighter)", true));
        pick.add(new Option("Divine Hospitaller ('dandwiki')(Fighter)", true));
        pick.add(new Option("Divine Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Divine Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("DoomKnight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Draco ('dandwiki')(Fighter)", true));
        pick.add(new Option("Draconic Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Draconic Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragon Heir ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragon Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragon Knight, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragon Rider ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragon Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragoon ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragoon, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dragoon, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dread Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dreadnought ('dandwiki')(Fighter)", true));
        pick.add(new Option("Drunken Pirate ('dandwiki')(Fighter)", true));
        pick.add(new Option("Drunken Swordsman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dual Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dual Blade, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dual Wielder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Duelist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dungeoneer and Dragon Killer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Duskblade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Dwarven Defender ('dandwiki')(Fighter)", true));
        pick.add(new Option("Earth Planetouched Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Earthshaker Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Eclipse Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Eldritch Knight, Second Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Eldritch Knight, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Eldritch Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Elegant Edge ('dandwiki')(Fighter)", true));
        pick.add(new Option("Elemental Adept ('dandwiki')(Fighter)", true));
        pick.add(new Option("Elemental Archer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Elemental Fighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Elemental's Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Elite Mercenary ('dandwiki')(Fighter)", true));
        pick.add(new Option("Emperor's Children ('dandwiki')(Fighter)", true));
        pick.add(new Option("Enforcer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Eviscerator ('dandwiki')(Fighter)", true));
        pick.add(new Option("Eviscerator Redub ('dandwiki')(Fighter)", true));
        pick.add(new Option("Faith Militant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Fallen Soldier ('dandwiki')(Fighter)", true));
        pick.add(new Option("Fearless Leader ('dandwiki')(Fighter)", true));
        pick.add(new Option("Fire Emblem Tactician ('dandwiki')(Fighter)", true));
        pick.add(new Option("Fire Planetouched Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Firearm Virtuoso ('dandwiki')(Fighter)", true));
        pick.add(new Option("Flame Hashira ('dandwiki')(Fighter)", true));
        pick.add(new Option("Flame Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Force of Havoc ('dandwiki')(Fighter)", true));
        pick.add(new Option("Forgemaster ('dandwiki')(Fighter)", true));
        pick.add(new Option("Forger of Souls ('dandwiki')(Fighter)", true));
        pick.add(new Option("Forsaken Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Frost Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Frostwarden Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Galeforce Gladiator ('dandwiki')(Fighter)", true));
        pick.add(new Option("Gladiator ('dandwiki')(Fighter)", true));
        pick.add(new Option("Gladiator (Variant 2) ('dandwiki')(Fighter)", true));
        pick.add(new Option("Gladiator, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Grand Marshal ('dandwiki')(Fighter)", true));
        pick.add(new Option("Grave Walker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Gravitonic Archer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Gravity Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Gravity Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Great Weapon Dancer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Great Weapon Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Green Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Guardian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Guardian, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Gunslinger ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hammer Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hand of Blood ('dandwiki')(Fighter)", true));
        pick.add(new Option("Harmacist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Heavy Archer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Heavy Defender ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hellraiser ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hero of Ooo ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hex Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hitman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hoplite ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hurler ('dandwiki')(Fighter)", true));
        pick.add(new Option("Hyperkinetic ('dandwiki')(Fighter)", true));
        pick.add(new Option("Illusionary Weapons Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Illusory Duelist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Impi ('dandwiki')(Fighter)", true));
        pick.add(new Option("Improvised Thrower ('dandwiki')(Fighter)", true));
        pick.add(new Option("Improviser ('dandwiki')(Fighter)", true));
        pick.add(new Option("Incursionist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Infinity Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Inquirer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Iron Sentinel ('dandwiki')(Fighter)", true));
        pick.add(new Option("Jedi/Sith ('dandwiki')(Fighter)", true));
        pick.add(new Option("Jingoist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Judoka ('dandwiki')(Fighter)", true));
        pick.add(new Option("Killer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Kinetic Duelist ('dandwiki')(Fighter)", true));
        pick.add(new Option("King's Hammer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Kishin Asura ('dandwiki')(Fighter)", true));
        pick.add(new Option("Knight of the High Tower ('dandwiki')(Fighter)", true));
        pick.add(new Option("Knight of the Mystic Fire ('dandwiki')(Fighter)", true));
        pick.add(new Option("Knight of the Order of the Union ('dandwiki')(Fighter)", true));
        pick.add(new Option("Knight of the Order of Wulf ('dandwiki')(Fighter)", true));
        pick.add(new Option("Knight Templar ('dandwiki')(Fighter)", true));
        pick.add(new Option("Kyūdōka ('dandwiki')(Fighter)", true));
        pick.add(new Option("Kūha ('dandwiki')(Fighter)", true));
        pick.add(new Option("Lancer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Legendary Blazer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Life Hunt ('dandwiki')(Fighter)", true));
        pick.add(new Option("Lightning Lancer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Lightning Spearman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Little Champion ('dandwiki')(Fighter)", true));
        pick.add(new Option("Living Gear Fighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Living Wall ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mage Breaker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mage Hunter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mage Seeker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mageslayer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Magic Marksman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Magic Savant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Magical Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Magus ('dandwiki')(Fighter)", true));
        pick.add(new Option("Magus Venator ('dandwiki')(Fighter)", true));
        pick.add(new Option("Maid ('dandwiki')(Fighter)", true));
        pick.add(new Option("Man-at-Arms ('dandwiki')(Fighter)", true));
        pick.add(new Option("Manhunter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Marauder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Marksman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Martial Artist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Martial Champion ('dandwiki')(Fighter)", true));
        pick.add(new Option("Master Dual-Wielder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Master of Two Weapons ('dandwiki')(Fighter)", true));
        pick.add(new Option("Melee Tactician ('dandwiki')(Fighter)", true));
        pick.add(new Option("Militant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mistwalker Marauder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mobian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Moon Child ('dandwiki')(Fighter)", true));
        pick.add(new Option("Moonlight Guardian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Moonshadow Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mountain Warden ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mounted Champion ('dandwiki')(Fighter)", true));
        pick.add(new Option("Mushroom Mender ('dandwiki')(Fighter)", true));
        pick.add(new Option("Musician Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Myriad Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Natural Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Necroblade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Necroknight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Neon Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Ninja Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("One Dragoon ('dandwiki')(Fighter)", true));
        pick.add(new Option("Opportunist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Orb Sentinel ('dandwiki')(Fighter)", true));
        pick.add(new Option("Outrider ('dandwiki')(Fighter)", true));
        pick.add(new Option("Paladin ('dandwiki')(Fighter)", true));
        pick.add(new Option("Paragon ('dandwiki')(Fighter)", true));
        pick.add(new Option("Peasant Hero ('dandwiki')(Fighter)", true));
        pick.add(new Option("Perfect Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Phantom Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Pit Fighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Polearm Defender ('dandwiki')(Fighter)", true));
        pick.add(new Option("Primordial Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Primordial Specialist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Psi Warrior, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Psy-Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Qin Shi Huang ('dandwiki')(Fighter)", true));
        pick.add(new Option("Radiant Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Ranger ('dandwiki')(Fighter)", true));
        pick.add(new Option("Re:Champion ('dandwiki')(Fighter)", true));
        pick.add(new Option("Reaver ('dandwiki')(Fighter)", true));
        pick.add(new Option("Revenant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Rifle Expert ('dandwiki')(Fighter)", true));
        pick.add(new Option("Rootwraith ('dandwiki')(Fighter)", true));
        pick.add(new Option("Royal Ranger ('dandwiki')(Fighter)", true));
        pick.add(new Option("Rune Keeper ('dandwiki')(Fighter)", true));
        pick.add(new Option("Rune Warden ('dandwiki')(Fighter)", true));
        pick.add(new Option("Rune Wielder ('dandwiki')(Fighter)", true));
        pick.add(new Option("Runeblade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sacred Guardian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sage of War ('dandwiki')(Fighter)", true));
        pick.add(new Option("Saivas ('dandwiki')(Fighter)", true));
        pick.add(new Option("Samurai, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Samurai, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sand Dervish ('dandwiki')(Fighter)", true));
        pick.add(new Option("Santoryu ('dandwiki')(Fighter)", true));
        pick.add(new Option("Santoryu, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Savage Attacker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Savage Beast ('dandwiki')(Fighter)", true));
        pick.add(new Option("Savage Brute ('dandwiki')(Fighter)", true));
        pick.add(new Option("Scorpion Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Scout, Reimagined ('dandwiki')(Fighter)", true));
        pick.add(new Option("Scout, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sengoku Samurai ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sentinel of Zenius ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sentry ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shade Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shadow Fighter Mage ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shadowhunter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shard Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shield Defender ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shield Guardian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shield Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shieldbearer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shieldman ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shien ('dandwiki')(Fighter)", true));
        pick.add(new Option("Shining Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Slasher, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Slaughter Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Slayer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Smelting Aura Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Solar Sentinel ('dandwiki')(Fighter)", true));
        pick.add(new Option("Solarflare Vanguard ('dandwiki')(Fighter)", true));
        pick.add(new Option("SOLDIER ('dandwiki')(Fighter)", true));
        pick.add(new Option("Songsword ('dandwiki')(Fighter)", true));
        pick.add(new Option("Songsword, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sorcerous Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sorcerous Knight, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Soul Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Soul Magi ('dandwiki')(Fighter)", true));
        pick.add(new Option("Soulblade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Spartan ('dandwiki')(Fighter)", true));
        pick.add(new Option("Spear Dancer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Spear Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Spell Archer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Spell Guardian ('dandwiki')(Fighter)", true));
        pick.add(new Option("SpellShot ('dandwiki')(Fighter)", true));
        pick.add(new Option("SpellShot, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Spin User ('dandwiki')(Fighter)", true));
        pick.add(new Option("Spirit Rider ('dandwiki')(Fighter)", true));
        pick.add(new Option("Staff Expert ('dandwiki')(Fighter)", true));
        pick.add(new Option("Starburst Striker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Steel Hand ('dandwiki')(Fighter)", true));
        pick.add(new Option("Stoneheart Guardian ('dandwiki')(Fighter)", true));
        pick.add(new Option("Storm Herald Fighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Stormbound ('dandwiki')(Fighter)", true));
        pick.add(new Option("Street Brawler ('dandwiki')(Fighter)", true));
        pick.add(new Option("Streetfighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Super Minion ('dandwiki')(Fighter)", true));
        pick.add(new Option("Survivalist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Survivor ('dandwiki')(Fighter)", true));
        pick.add(new Option("Swarmstopper ('dandwiki')(Fighter)", true));
        pick.add(new Option("Swiftblade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sword Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Swordmaster ('dandwiki')(Fighter)", true));
        pick.add(new Option("Swordsman of Will ('dandwiki')(Fighter)", true));
        pick.add(new Option("Sylvan Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Synerthogen ('dandwiki')(Fighter)", true));
        pick.add(new Option("Tactical Commander ('dandwiki')(Fighter)", true));
        pick.add(new Option("Tactical Fighter ('dandwiki')(Fighter)", true));
        pick.add(new Option("Tactician ('dandwiki')(Fighter)", true));
        pick.add(new Option("Tahl'shias ('dandwiki')(Fighter)", true));
        pick.add(new Option("Team Leader ('dandwiki')(Fighter)", true));
        pick.add(new Option("Telekinetic Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Tempest ('dandwiki')(Fighter)", true));
        pick.add(new Option("Templar Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("The Hero ('dandwiki')(Fighter)", true));
        pick.add(new Option("The Light Lord ('dandwiki')(Fighter)", true));
        pick.add(new Option("The Mad Cow ('dandwiki')(Fighter)", true));
        pick.add(new Option("The One Thief ('dandwiki')(Fighter)", true));
        pick.add(new Option("The Vigilante ('dandwiki')(Fighter)", true));
        pick.add(new Option("Thousand Son ('dandwiki')(Fighter)", true));
        pick.add(new Option("Thrower Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Thug ('dandwiki')(Fighter)", true));
        pick.add(new Option("Thunderborn ('dandwiki')(Fighter)", true));
        pick.add(new Option("Tidecaller ('dandwiki')(Fighter)", true));
        pick.add(new Option("Trion Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Trueblade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Twilight Sentinel ('dandwiki')(Fighter)", true));
        pick.add(new Option("Twirling Blade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Umbrella Savant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Undeath Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Undying Frenzy ('dandwiki')(Fighter)", true));
        pick.add(new Option("Undying Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Valinor Guard ('dandwiki')(Fighter)", true));
        pick.add(new Option("Vampire Assassin ('dandwiki')(Fighter)", true));
        pick.add(new Option("Vanguard ('dandwiki')(Fighter)", true));
        pick.add(new Option("Vanguard, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Vanguard, 3rd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Vanguard, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Vassal of Tiamat ('dandwiki')(Fighter)", true));
        pick.add(new Option("Verdant Vanguard ('dandwiki')(Fighter)", true));
        pick.add(new Option("Veteran ('dandwiki')(Fighter)", true));
        pick.add(new Option("Vicious Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Void Clasher ('dandwiki')(Fighter)", true));
        pick.add(new Option("Void Knight ('dandwiki')(Fighter)", true));
        pick.add(new Option("Void Knight, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("War Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("War Medic ('dandwiki')(Fighter)", true));
        pick.add(new Option("Warbreaker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Warden, 2nd Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Warlord ('dandwiki')(Fighter)", true));
        pick.add(new Option("Warlord, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Warpriest ('dandwiki')(Fighter)", true));
        pick.add(new Option("Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Warrior, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Water Planetouched Warrior ('dandwiki')(Fighter)", true));
        pick.add(new Option("Way of the Crimson Lotus ('dandwiki')(Fighter)", true));
        pick.add(new Option("Way of the Kalaripayattu ('dandwiki')(Fighter)", true));
        pick.add(new Option("Way of the Mystic Sword ('dandwiki')(Fighter)", true));
        pick.add(new Option("Weapon Adept ('dandwiki')(Fighter)", true));
        pick.add(new Option("Weapon Master ('dandwiki')(Fighter)", true));
        pick.add(new Option("Weapon Master, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Weapon Specialist ('dandwiki')(Fighter)", true));
        pick.add(new Option("Weapons Fanatic ('dandwiki')(Fighter)", true));
        pick.add(new Option("Weave Render ('dandwiki')(Fighter)", true));
        pick.add(new Option("Widowmaker ('dandwiki')(Fighter)", true));
        pick.add(new Option("Widowmaker, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Wildfire Warden ('dandwiki')(Fighter)", true));
        pick.add(new Option("Wind Dancer ('dandwiki')(Fighter)", true));
        pick.add(new Option("Windblade ('dandwiki')(Fighter)", true));
        pick.add(new Option("Windblade, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Windwalker, Variant ('dandwiki')(Fighter)", true));
        pick.add(new Option("Windwhisper Templar ('dandwiki')(Fighter)", true));
        pick.add(new Option("Xenomorph Paragon ('dandwiki')(Fighter)", true));
        pick.add(new Option("Door Master/Fighdor ('dandwiki')(Fighter)", true));
        Option a = Question.ask(pick, "Choose your Martial Archetype");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Archery (Fighting Style)"));
        pick.add(new Option("Blind Fighting (Fighting Style)"));
        pick.add(new Option("Defence (Fighting Style)"));
        pick.add(new Option("Dueling (Fighting Style)"));
        pick.add(new Option("Great Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Interception (Fighting Style)"));
        pick.add(new Option("Protection (Fighting Style)"));
        pick.add(new Option("Superior Technique (Fighting Style)"));
        pick.add(new Option("Thrown Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Two Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Unarmed Fighting (Fighting Style)"));
        pick.add(new Option("Close Quarters Shooter (Fighting Style)", true, false));
        pick.add(new Option("Mariner (Fighting Style)", true, false));
        pick.add(new Option("Tunnel Fighter (Fighting Style)", true, false));

        a = Question.ask(pick, "Choose your Fighter Fighting Style");
        list.add(a);


        return list;
    }
}

