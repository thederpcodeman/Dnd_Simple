package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class RanSub extends Choice {
    public RanSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Subchoice("Beast Master (Ranger)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option ("Ranger's Companion (Non-Variant Feature)"),
                new Option ("Primal Companion (Variant Feature)")))))));
        pick.add(new Option("Fey Wonderer (Ranger)"));//
        pick.add(new Option("Gloom Stalker (Ranger)"));//
        pick.add(new Option("Horizon Walker (Ranger)"));//
        pick.add(new Subchoice("Hunter (Ranger)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                        new Option ("Colossus Slayer (3rd level Feature)"),
                        new Option ("Giant Killer (3rd level Feature)"),
                        new Option ("Horde Breaker (3rd level Feature)"))),
                new ArrayList<>(Arrays.asList(
                        new Option ("Escape the Horde (7th level Feature)"),
                        new Option ("Multiattack Defense (7th level Feature)"),
                        new Option ("Steel Will (7th level Feature)"))),
                new ArrayList<>(Arrays.asList(
                        new Option ("Volley (11th level Feature)"),
                        new Option ("Whirlwind Attack (11th level Feature)"))),
                new ArrayList<>(Arrays.asList(
                        new Option ("Evasion (15th level Feature)"),
                        new Option ("Stand Against the Tide (15th level Feature)"),
                        new Option ("Uncanny Dodge (15th level Feature)")))))));
        pick.add(new Option("Monster Slayer (Ranger)"));
        pick.add(new Option("Swarmkeeper (Ranger)"));
        pick.add(new Option("Drakewarden (Ranger)"));//

        pick.add(new Option("Airborne Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Anti-Mage Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Arcane Ranger Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Arcane Warmonger ('dandwiki')(Ranger)", true));
        pick.add(new Option("Archer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Archer of Divine Undeath ('dandwiki')(Ranger)", true));
        pick.add(new Option("Beastial Beyond ('dandwiki')(Ranger)", true));
        pick.add(new Option("Beastshifter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Behemoth Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Blade Dancer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Bladedancer Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Bladedancer Conclave, Variant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Bloodhunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Bone Crafter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Bowman of the Wild ('dandwiki')(Ranger)", true));
        pick.add(new Option("Bravely Default Ranger ('dandwiki')(Ranger)", true));
        pick.add(new Option("Bushwhacker ('dandwiki')(Ranger)", true));
        pick.add(new Option("Capture Ranger ('dandwiki')(Ranger)", true));
        pick.add(new Option("Celestial Archer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Champion of Nature ('dandwiki')(Ranger)", true));
        pick.add(new Option("Chaos Caller ('dandwiki')(Ranger)", true));
        pick.add(new Option("Chromatic Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Darkness Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Deepwood Sniper ('dandwiki')(Ranger)", true));
        pick.add(new Option("Dhampir Paragon ('dandwiki')(Ranger)", true));
        pick.add(new Option("Disciple of Wulfen ('dandwiki')(Ranger)", true));
        pick.add(new Option("Dragon Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Dragon Master Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Dragon Slayer Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Eldritch Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Elemental Conjurer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Elluel Bowmaster ('dandwiki')(Ranger)", true));
        pick.add(new Option("Expert Craft ('dandwiki')(Ranger)", true));
        pick.add(new Option("Extricator ('dandwiki')(Ranger)", true));
        pick.add(new Option("Fey Wanderer, Variant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Flamewielder ('dandwiki')(Ranger)", true));
        pick.add(new Option("Forester ('dandwiki')(Ranger)", true));
        pick.add(new Option("Forgotten Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Giantslayer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Gravewalker ('dandwiki')(Ranger)", true));
        pick.add(new Option("Gunslinger Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Hedge Knight ('dandwiki')(Ranger)", true));
        pick.add(new Option("Hexblade Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Holy Avenger ('dandwiki')(Ranger)", true));
        pick.add(new Option("Holy Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Horizon Walker, Variant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Hunter of the Undead ('dandwiki')(Ranger)", true));
        pick.add(new Option("Inquisitor Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Jedi/Sith Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Jinn Bearer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Keisho Ninja ('dandwiki')(Ranger)", true));
        pick.add(new Option("Knight Errant Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Liberator Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Lightbringer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Lumberjack ('dandwiki')(Ranger)", true));
        pick.add(new Option("Magi Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Martial Blade ('dandwiki')(Ranger)", true));
        pick.add(new Option("Master of Monsters ('dandwiki')(Ranger)", true));
        pick.add(new Option("Medjey ('dandwiki')(Ranger)", true));
        pick.add(new Option("Missionary ('dandwiki')(Ranger)", true));
        pick.add(new Option("Monster Slayer, Variant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Moonlight Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Nature's Handmaiden ('dandwiki')(Ranger)", true));
        pick.add(new Option("Nightmare Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Nightstalker ('dandwiki')(Ranger)", true));
        pick.add(new Option("Nomadic Arrow Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Oakleaf ('dandwiki')(Ranger)", true));
        pick.add(new Option("Occult Hunter Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Pack Master ('dandwiki')(Ranger)", true));
        pick.add(new Option("Pact Keeper ('dandwiki')(Ranger)", true));
        pick.add(new Option("Primal ('dandwiki')(Ranger)", true));
        pick.add(new Option("Primal Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Primal Seeker ('dandwiki')(Ranger)", true));
        pick.add(new Option("Primeval Guardian, Variant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Pseudo Druid ('dandwiki')(Ranger)", true));
        pick.add(new Option("Ranger of Araluen ('dandwiki')(Ranger)", true));
        pick.add(new Option("Ranger of the North ('dandwiki')(Ranger)", true));
        pick.add(new Option("Rust Eater ('dandwiki')(Ranger)", true));
        pick.add(new Option("Scholared ('dandwiki')(Ranger)", true));
        pick.add(new Option("Seasoned Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Servant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Settler ('dandwiki')(Ranger)", true));
        pick.add(new Option("Sharp-shot ('dandwiki')(Ranger)", true));
        pick.add(new Option("Sharpshooter Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Silver Knight Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Slime Rancher Ranger ('dandwiki')(Ranger)", true));
        pick.add(new Option("Sniper ('dandwiki')(Ranger)", true));
        pick.add(new Option("Sniper Hunter ('dandwiki')(Ranger)", true));
        pick.add(new Option("Spell Breaker ('dandwiki')(Ranger)", true));
        pick.add(new Option("Spell Gunner ('dandwiki')(Ranger)", true));
        pick.add(new Option("Spellstrider ('dandwiki')(Ranger)", true));
        pick.add(new Option("Spirit Beast ('dandwiki')(Ranger)", true));
        pick.add(new Option("Steel Dancer Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Strider ('dandwiki')(Ranger)", true));
        pick.add(new Option("Supernaturalist ('dandwiki')(Ranger)", true));
        pick.add(new Option("The Song ('dandwiki')(Ranger)", true));
        pick.add(new Option("Thunder Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Thunder Strider ('dandwiki')(Ranger)", true));
        pick.add(new Option("Tiny Beast Master ('dandwiki')(Ranger)", true));
        pick.add(new Option("Toxicologist ('dandwiki')(Ranger)", true));
        pick.add(new Option("Trapper, Variant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Troll Paragon ('dandwiki')(Ranger)", true));
        pick.add(new Option("Vanguard Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Vigilante ('dandwiki')(Ranger)", true));
        pick.add(new Option("Ward of Amaras ('dandwiki')(Ranger)", true));
        pick.add(new Option("Warden ('dandwiki')(Ranger)", true));
        pick.add(new Option("Warden, Variant ('dandwiki')(Ranger)", true));
        pick.add(new Option("Wayfarer ('dandwiki')(Ranger)", true));
        pick.add(new Option("Wild Strider ('dandwiki')(Ranger)", true));
        pick.add(new Option("Witcher Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Wolf's Bane ('dandwiki')(Ranger)", true));
        pick.add(new Option("Wolfbrother Conclave ('dandwiki')(Ranger)", true));
        pick.add(new Option("Xenomorph Paragon ('dandwiki')(Ranger)", true));
        pick.add(new Option("Yorkshire Conclave ('dandwiki')(Ranger)", true));
        Option a = Question.ask(pick, "Choose your Ranger Conclave");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Archery (Fighting Style)"));
        pick.add(new Option("Blind Fighting (Fighting Style)"));
        pick.add(new Option("Defence (Fighting Style)"));
        pick.add(new Option("Druidic Warrior (Fighting Style)"));
        pick.add(new Option("Dueling (Fighting Style)"));
        pick.add(new Option("Thrown Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Two Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Close Quarters Shooter (Fighting Style)", true, false));
        pick.add(new Option("Interception (Fighting Style)", true, false));
        pick.add(new Option("Mariner (Fighting Style)", true, false));
        pick.add(new Option("Tunnel Fighter (Fighting Style)", true, false));
        pick.add(new Option("Unarmed Fighting (Fighting Style)", true, false));
        a = Question.ask(pick, "Choose your Ranger Fighting Style");
        list.add(a);
        //Favored Enemy v favored foe
        pick = new ArrayList<Option>();
        pick.add(new Option("Favored Enemy (Ranger Feature)"));
        pick.add(new Option("Favored Foe (Ranger Feature)"));
        a = Question.ask(pick, "Choose one");
        list.add(a);
        //natural explorer v deft explorer
        pick = new ArrayList<Option>();
        pick.add(new Option("Natural Explorer (Ranger Feature)"));
        pick.add(new Option("Deft Explorer (Ranger Feature)"));
        a = Question.ask(pick, "Choose one");
        list.add(a);
        //Primeval awareness v primal awareness
        pick = new ArrayList<Option>();
        pick.add(new Option("Primeval Awareness (Ranger Feature)"));
        pick.add(new Option("Primal Awareness (Ranger Feature)"));
        a = Question.ask(pick, "Choose one at 3rd level");
        list.add(a);
        //Hide in Plain sight v Nature's veil
        pick = new ArrayList<Option>();
        pick.add(new Option("Hide in Plain Sight (Ranger Feature)"));
        pick.add(new Option("Nature's Veil (Ranger Feature)"));
        a = Question.ask(pick, "Choose one at 10th level");
        list.add(a);


        return list;
    }
}

