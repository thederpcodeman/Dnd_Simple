package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class RogSub extends Choice {
    public RogSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Arcane Trickster (Rogue)"));
        pick.add(new Option("Assasin (Rogue)"));
        pick.add(new Option("Inquisitive (Rogue)"));
        pick.add(new Option("Mastermind (Rogue)"));
        pick.add(new Option("Phantom (Rogue)"));
        pick.add(new Option("Scout (Rogue)"));
        pick.add(new Option("Soul Knife (Rogue)"));
        pick.add(new Option("Swashbuckler (Rogue)"));
        pick.add(new Option("Thief (Rogue)"));
        pick.add(new Subchoice("Wild Card ('Legends of Runeterra: Dark Tides of Bilgewater') (Rogue)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option("Loaded Dice (Wild Card’s Gambit)"),
                new Option("Dragonchess (Wild Card’s Gambit)"),
                new Option("Playing Cards (Wild Card’s Gambit)")
        )))), false, true));
        pick.add(new Option("Abyssal Executioner ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ace ('dandwiki')(Rogue)", true));
        pick.add(new Option("Aerial Assailant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Alchemist Rogue ('dandwiki')(Rogue)", true));
        pick.add(new Option("Alchemist, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ambusher ('dandwiki')(Rogue)", true));
        pick.add(new Option("Arachnissassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Arcane Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Arcane Assassin, 2nd Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Arcane Assassin, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Arishikage Clan Ninja ('dandwiki')(Rogue)", true));
        pick.add(new Option("Assassin of Darkness ('dandwiki')(Rogue)", true));
        pick.add(new Option("Assassin, Revised ('dandwiki')(Rogue)", true));
        pick.add(new Option("Assassin, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Astral Assassin, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Athasian Bard ('dandwiki')(Rogue)", true));
        pick.add(new Option("Auramancer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Backstabber ('dandwiki')(Rogue)", true));
        pick.add(new Option("Bladedancer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Blademaster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Blessed One ('dandwiki')(Rogue)", true));
        pick.add(new Option("Blood Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Blood Rogue ('dandwiki')(Rogue)", true));
        pick.add(new Option("Bloodied Knife Freak ('dandwiki')(Rogue)", true));
        pick.add(new Option("Bounty Hunter ('dandwiki')(Rogue)", true));
        pick.add(new Option("Bounty Hunter, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Bravo Blade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Brawler's Shadow ('dandwiki')(Rogue)", true));
        pick.add(new Option("Brotherhood Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Brotherhood Assassin, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Butcher ('dandwiki')(Rogue)", true));
        pick.add(new Option("Cangaceiro ('dandwiki')(Rogue)", true));
        pick.add(new Option("Captain ('dandwiki')(Rogue)", true));
        pick.add(new Option("Card Arcanum ('dandwiki')(Rogue)", true));
        pick.add(new Option("Cardslinger ('dandwiki')(Rogue)", true));
        pick.add(new Option("Cloaked Fist ('dandwiki')(Rogue)", true));
        pick.add(new Option("Cloaker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Coinblade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Combat Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Coward ('dandwiki')(Rogue)", true));
        pick.add(new Option("Dagger-Master Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Dark One ('dandwiki')(Rogue)", true));
        pick.add(new Option("Deadly Blade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Deceptive ('dandwiki')(Rogue)", true));
        pick.add(new Option("Delver ('dandwiki')(Rogue)", true));
        pick.add(new Option("Dhampir Paragon ('dandwiki')(Rogue)", true));
        pick.add(new Option("Dirty Fighter ('dandwiki')(Rogue)", true));
        pick.add(new Option("Divine Agent ('dandwiki')(Rogue)", true));
        pick.add(new Option("Dodgemaster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Duskblade (Variant) ('dandwiki')(Rogue)", true));
        pick.add(new Option("Eldritch Raider ('dandwiki')(Rogue)", true));
        pick.add(new Option("Eldritch Scout ('dandwiki')(Rogue)", true));
        pick.add(new Option("Elemental Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Faceblaster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Fencer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Front Runner ('dandwiki')(Rogue)", true));
        pick.add(new Option("Gadgeteer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Gangster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Genius ('dandwiki')(Rogue)", true));
        pick.add(new Option("Gentle Blade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ghost ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ghost Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ghost Fiend Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Graverobber ('dandwiki')(Rogue)", true));
        pick.add(new Option("Grenadier ('dandwiki')(Rogue)", true));
        pick.add(new Option("Grimm Reaper ('dandwiki')(Rogue)", true));
        pick.add(new Option("Hacker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Haunted ('dandwiki')(Rogue)", true));
        pick.add(new Option("Hellfire ('dandwiki')(Rogue)", true));
        pick.add(new Option("Hexrogue ('dandwiki')(Rogue)", true));
        pick.add(new Option("Hidden Adept ('dandwiki')(Rogue)", true));
        pick.add(new Option("Highwayman ('dandwiki')(Rogue)", true));
        pick.add(new Option("Houndmaster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Improvised Weapon Breaker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Inquisitor ('dandwiki')(Rogue)", true));
        pick.add(new Option("Interdimensional Traveler ('dandwiki')(Rogue)", true));
        pick.add(new Option("Investigator ('dandwiki')(Rogue)", true));
        pick.add(new Option("Investigator, 2nd Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Investigator, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Invisible Blade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Jedi/Sith, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Joker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Journeyman ('dandwiki')(Rogue)", true));
        pick.add(new Option("Keyblade Rogue ('dandwiki')(Rogue)", true));
        pick.add(new Option("Knife Master ('dandwiki')(Rogue)", true));
        pick.add(new Option("Knife Thrower ('dandwiki')(Rogue)", true));
        pick.add(new Option("Knife Thrower, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Kusari Clan ('dandwiki')(Rogue)", true));
        pick.add(new Option("Lost One ('dandwiki')(Rogue)", true));
        pick.add(new Option("Lucky ('dandwiki')(Rogue)", true));
        pick.add(new Option("Lucky Bastard ('dandwiki')(Rogue)", true));
        pick.add(new Option("Manipulator ('dandwiki')(Rogue)", true));
        pick.add(new Option("Master Ninja ('dandwiki')(Rogue)", true));
        pick.add(new Option("Master of Fear ('dandwiki')(Rogue)", true));
        pick.add(new Option("Master of Manipulation ('dandwiki')(Rogue)", true));
        pick.add(new Option("Mediator ('dandwiki')(Rogue)", true));
        pick.add(new Option("Memorivore ('dandwiki')(Rogue)", true));
        pick.add(new Option("Mercenary ('dandwiki')(Rogue)", true));
        pick.add(new Option("Mesmer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Meta-Gambler ('dandwiki')(Rogue)", true));
        pick.add(new Option("Mobster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Mord Sith ('dandwiki')(Rogue)", true));
        pick.add(new Option("Mountebank ('dandwiki')(Rogue)", true));
        pick.add(new Option("Mystic Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Nebulous Walker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Nevervoid Binder ('dandwiki')(Rogue)", true));
        pick.add(new Option("Nightblade ('dandwiki')(Rogue)", true));
        pick.add(new Option("NightWing ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ninja ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ninja Clan Yami ('dandwiki')(Rogue)", true));
        pick.add(new Option("Open Mind ('dandwiki')(Rogue)", true));
        pick.add(new Option("Open Mind, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Outlaw ('dandwiki')(Rogue)", true));
        pick.add(new Option("Pactblade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Pactblade, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Paper Mage ('dandwiki')(Rogue)", true));
        pick.add(new Option("Phantom Thief ('dandwiki')(Rogue)", true));
        pick.add(new Option("Phantom Thief (Variant) ('dandwiki')(Rogue)", true));
        pick.add(new Option("Physicist ('dandwiki')(Rogue)", true));
        pick.add(new Option("Pickpocket ('dandwiki')(Rogue)", true));
        pick.add(new Option("Pirate ('dandwiki')(Rogue)", true));
        pick.add(new Option("Pirate, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Poison Stalker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Poisoner Guild's Initiate ('dandwiki')(Rogue)", true));
        pick.add(new Option("Prankster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Predator ('dandwiki')(Rogue)", true));
        pick.add(new Option("Professional Thrower ('dandwiki')(Rogue)", true));
        pick.add(new Option("Psionist ('dandwiki')(Rogue)", true));
        pick.add(new Option("PsyOp ('dandwiki')(Rogue)", true));
        pick.add(new Option("Pug ('dandwiki')(Rogue)", true));
        pick.add(new Option("Quickdraw ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ranged Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ranged Killer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Reaper ('dandwiki')(Rogue)", true));
        pick.add(new Option("Red Army Rogue ('dandwiki')(Rogue)", true));
        pick.add(new Option("Renegade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Reporter ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ripper ('dandwiki')(Rogue)", true));
        pick.add(new Option("Ruffian ('dandwiki')(Rogue)", true));
        pick.add(new Option("Santa Claus ('dandwiki')(Rogue)", true));
        pick.add(new Option("Scoundrel ('dandwiki')(Rogue)", true));
        pick.add(new Option("Sea Assailant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Sellsword ('dandwiki')(Rogue)", true));
        pick.add(new Option("Sellsword, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadow ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadow Archer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadow Assassin ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadow Blade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadow Prowler ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadow Thief ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadow Walker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadowdancer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadowfell ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadowling ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadowmaster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shadowstalker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shinobi ('dandwiki')(Rogue)", true));
        pick.add(new Option("Shrouded Blade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Silent Knight ('dandwiki')(Rogue)", true));
        pick.add(new Option("Sin of Greed ('dandwiki')(Rogue)", true));
        pick.add(new Option("Skill Master ('dandwiki')(Rogue)", true));
        pick.add(new Option("Smuggler's Savvy ('dandwiki')(Rogue)", true));
        pick.add(new Option("Snake Dagger ('dandwiki')(Rogue)", true));
        pick.add(new Option("Soul Archer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Soul-Knife ('dandwiki')(Rogue)", true));
        pick.add(new Option("Soulknife, 2nd Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Soulknife, 3rd Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Spectral Ghost ('dandwiki')(Rogue)", true));
        pick.add(new Option("Speedster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Speedster, Variant ('dandwiki')(Rogue)", true));
        pick.add(new Option("Spell Breaker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Spellstealer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Spellthief ('dandwiki')(Rogue)", true));
        pick.add(new Option("Spider Rogue ('dandwiki')(Rogue)", true));
        pick.add(new Option("Spook ('dandwiki')(Rogue)", true));
        pick.add(new Option("Sprinter ('dandwiki')(Rogue)", true));
        pick.add(new Option("Striker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Templar Marksmen ('dandwiki')(Rogue)", true));
        pick.add(new Option("The Burst ('dandwiki')(Rogue)", true));
        pick.add(new Option("Thieves' Cant Master ('dandwiki')(Rogue)", true));
        pick.add(new Option("Thug ('dandwiki')(Rogue)", true));
        pick.add(new Option("Time Twister ('dandwiki')(Rogue)", true));
        pick.add(new Option("Time Walker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Tourist ('dandwiki')(Rogue)", true));
        pick.add(new Option("Toxic Trickster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Traceur ('dandwiki')(Rogue)", true));
        pick.add(new Option("Trapmaster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Trapper ('dandwiki')(Rogue)", true));
        pick.add(new Option("True Thinker ('dandwiki')(Rogue)", true));
        pick.add(new Option("Tsundere ('dandwiki')(Rogue)", true));
        pick.add(new Option("Two Weapon Specialist ('dandwiki')(Rogue)", true));
        pick.add(new Option("Underdark Rogue ('dandwiki')(Rogue)", true));
        pick.add(new Option("Vampire Bloodblade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Venomeer ('dandwiki')(Rogue)", true));
        pick.add(new Option("Vicious Hunter ('dandwiki')(Rogue)", true));
        pick.add(new Option("Void Blade ('dandwiki')(Rogue)", true));
        pick.add(new Option("Wild Trickster ('dandwiki')(Rogue)", true));
        pick.add(new Option("Wyrmhand ('dandwiki')(Rogue)", true));
        pick.add(new Option("MacGyver ('dandwiki')(Rogue)", true));
        Option a = Question.ask(pick, "Choose your Roguish Archetype");
        list.add(a);


        return list;
    }
}

