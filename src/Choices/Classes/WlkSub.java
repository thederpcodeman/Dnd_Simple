package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class WlkSub extends Choice {
    public WlkSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Archfey (Warlock)"));
        pick.add(new Option("Celestial (Warlock)"));
        pick.add(new Option("Fathomless (Warlock)"));
        pick.add(new Option("Fiend (Warlock)"));
        pick.add(new Option("Genie (Warlock)"));
        pick.add(new Option("Great Old One (Warlock)"));
        pick.add(new Option("Hexblade (Warlock)"));
        pick.add(new Option("Undead (Warlock)"));
        pick.add(new Option("Undying (Warlock)"));
        Option a = Question.ask(pick, "Choose your Patron");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Pact of the Blade (Warlock)"));
        pick.add(new Option("Pact of the Chain (Warlock)"));
        pick.add(new Option("Pact of the Tome (Warlock)"));
        pick.add(new Option("Pact of the Talisman (Warlock)"));
        a = Question.ask(pick, "Choose your Pact Boon");
        list.add(a);

        return list;
    }
}

