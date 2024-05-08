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

