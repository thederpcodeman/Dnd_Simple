package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class BarbSub extends Choice {
    public BarbSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Ancestral Guardian (Barbarian)"));//
        pick.add(new Option("Battlerager (Barbarian)"));//
        pick.add(new Option("Beast (Barbarian)"));//
        pick.add(new Option("Berserker (Barbarian)"));//
        pick.add(new Option("Giant (Barbarian)"));//
        pick.add(new Subchoice("Storm Herald (Barbarian)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option ("Desert (Storm Aura)"),
                new Option ("Sea (Storm Aura)"),
                new Option ("Tundra (Storm Aura)")))))));
        pick.add(new Subchoice("Totem Warrior (Barbarian)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option ("Bear (Totem Warrior)"),
                new Option ("Eagle (Totem Warrior)"),
                new Option ("Elk (Totem Warrior)"),
                new Option ("Tiger (Totem Warrior)"),
                new Option ("Wolf (Totem Warrior)")))))));
        pick.add(new Option("Wild Magic (Barbarian)"));//
        pick.add(new Option("Zealot (Barbarian)"));//
        pick.add(new Option("Juggernaut ('Tal'Dorei Campaign Setting Reborn') (Barbarian)", false, true));//
        pick.add(new Option("The Depths (' Legend of Runeterra: Dark Tides of Bilgewater') (Barbarian)", false, true));//
        pick.add(new Option("Avatar of Rage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Axe Idiot ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Battlerager ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Battlerager, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Berserker, 2nd Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Berserker, 3rd Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Berserker, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Brutalist ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Champion of He ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Chemical Monster ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Dizzy Master ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Dragon Piercer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Jaguar Warrior ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Magical Girl ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Abyssal Might ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Arcane Rage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Arcane Rage, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Blinding Rage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Blood ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Blood, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Crash ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Einherji ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Graceful Rage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Gruumsh ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Hanma ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Heavy Armor ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Hoodoo Will ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Radiance ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Rage Incarnate ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Relentless Fury ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Rhonas ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Aberrant, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Abomination ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Abyssal Rage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Annihilator ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Ash-Veined ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Badass ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Barbarian ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Bat ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Battle Master ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Battleborn ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Beast Monarch ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Beastlord ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Beastlord, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Bladelord ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Blood Beast ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Bloodied ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Bloodrager ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Brawler ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Broken Chains ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Broken Chains, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Bruiser ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Brute ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Calamity ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Calm ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Cannibal ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Cavalry ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Champion ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Champion, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Chosen ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Colossal Weapon ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Colossus ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Consumer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Crusader ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Cursed Blade ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Cursed Soul ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dark Lord ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Demonoid ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dervish ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Devil ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Devourer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Doloromancer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dragon ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dragon Shaman ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dragon Soul ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dragonoid ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dragontribe ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Dragoon ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Drake Blood ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Drunken Brawler ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Drunken Lout ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Elements ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Enraged Brawler ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Executioner ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Exile ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Experiment ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Fiery Rage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Fist ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Flagellant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Frozen Warrior ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Giant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Giant, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the God Hand ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Grappler ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Gravedigger ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Gutbuster ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Healer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Heartless Hunter ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Heartstoker ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Hellborn ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Hellborn, 2nd Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Hellborn, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Hellion ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Hollowed Soul ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Holy Crusader ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Horselords ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of The Hunger ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Hunter ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Ichor ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Immortal ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Immortal Warrior ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Immortal, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Inner Beast ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Inner Beast, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Inquisition ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Instinctive Soul Barbarian ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Iron Fist ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Jedi/Sith ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Ki Warrior ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Knight ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Lightning Rager ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Living Tank ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Lumberjack ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Mage Slayer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Monkey King ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Norse Gods ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Northern Reaver ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Occultic Warrior ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Old Gods ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Old Master ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Otherworldly ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Owl ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Pack ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Pain Vortex ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Phoenix ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Pinoak Warrior ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Poet ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Primal Dragon ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Primordial Predator ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Primordial Predator, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Procrastinator ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Psi Fury ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Psion ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Psychic Berserker ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Psycho ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Psycho, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Pugilist ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Pummeler ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Rage Caster ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Rage Mage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Raging Bull ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Raging Fortress ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Ranger ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Ravage Doctor ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Rebuker ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Reckless Warrior ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Scale ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Scarred Witch Doctor ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Scourge ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Scourge, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Semi-Immortal ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Shaman ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Shugoki ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Siege Tower ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Silent Berserker ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Silent Berserker, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Sin of Wrath ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Skald ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Skinshifter ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Skull of Iron ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Slasher ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Slayer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Slayer, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Small Thorn ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Smasher ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Sorcerers’ Curse ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Spellbreaker ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Star ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Stone Warden ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Stormborn ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Strongest ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Super Saiyan ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Supernova ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Suplexer ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Survivor ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Swift Striker ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Tainted ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Tank ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Tavern Brawler ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Thousand-Lives ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Titan ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Titan V ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Titan VII ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Titanborn ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Totem Warrior, Expanded ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Totem Warrior, Expanded, Expanded Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Toxophilite ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Usurper ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the War God ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the War Rage ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Warborn ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Warforged ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Warlord ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Warlord, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Warp Spasm ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Warrior Shaman ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Watcher ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Weapon Master ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Weredragon ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Whistling Stones ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Whole ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Wild Mind ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Wild Shifter ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Wildwood ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Wrath Awakener ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of the Yojimbo ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Path of Thunder ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Slasher ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Slasher, Variant ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Spell Breaker ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Spell Muncher ('dandwiki')(Barbarian)", true));
        pick.add(new Option("The Shaman ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Titan Mauler ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Totem of the Sloth ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Troll Paragon ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Xenomorph Paragon ('dandwiki')(Barbarian)", true));
        pick.add(new Option("Yorgun Battlerager ('dandwiki')(Barbarian)", true));


        Option a = Question.ask(pick, "Choose your Primal Path");
        list.add(a);


        return list;
    }
}

