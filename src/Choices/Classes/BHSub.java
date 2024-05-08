package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class BHSub extends Choice {
    public BHSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Ghostslayer (Blood Hunter)"));
        pick.add(new Option("Lycan (Blood Hunter)"));
        pick.add(new Option("Mutant (Blood Hunter)"));
        pick.add(new Subchoice("Profane Soul (Blood Hunter)", new ArrayList<ArrayList<Option>>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option("Archfey (Patron)"),
                new Option("Celestial (Patron)"),
                new Option("Fathomless (Patron)"),
                new Option("Fiend (Patron)"),
                new Option("Genie (Patron)"),
                new Option("Great Old One (Patron)"),
                new Option("Hexblade (Patron)"),
                new Option("Undead (Patron)"),
                new Option("Undying (Patron)")))))));
        Option a = Question.ask(pick, "Choose your Blood Hunter Order");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Archery (Fighting Style)"));
        pick.add(new Option("Dueling (Fighting Style)"));
        pick.add(new Option("Great Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Two Weapon Fighting (Fighting Style)"));
        a = Question.ask(pick, "Choose your Blood Hunter Fighting Style");
        list.add(a);

        return list;
    }
}

