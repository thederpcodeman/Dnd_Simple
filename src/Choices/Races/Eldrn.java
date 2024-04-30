package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Eldrn extends Choice {
    public Eldrn(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Monsters of the Multiverse's Eladrin (Eladrin)"));
        pick.add(new Option("Tome of Foes's Eladrin (Eladrin)"));
        Option a = Question.ask(pick, "Choose your Source");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Autumn (Eladrin)"));
        pick.add(new Option("Winter (Eladrin)"));
        pick.add(new Option("Spring (Eladrin)"));
        pick.add(new Option("Summer (Eladrin)"));
        a = Question.ask(pick, "Choose your Season");
        list.add(a);


        return list;
    }
}

