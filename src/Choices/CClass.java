package src.Choices;

import src.Choice;
import src.Option;
import src.Options.Classes.*;
import src.Question;

import java.util.ArrayList;

public class CClass extends Choice {
    public CClass(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Artificer("Artificer"));
        pick.add(new Barbarian("Barbarian"));
        pick.add(new Bard("Bard"));
        pick.add(new Blood_Hunter("Blood Hunter"));
        pick.add(new Cleric("Cleric"));
        pick.add(new Druid("Druid"));
        pick.add(new Fighter("Fighter"));
        pick.add(new Monk("Monk"));
        pick.add(new Paladin("Paladin"));
        pick.add(new Option("Ranger"));
        pick.add(new Option("Rogue"));
        pick.add(new Option("Sorcerer"));
        pick.add(new Option("Warlock"));
        pick.add(new Option("Wizard"));
        Option a = Question.ask(pick, "Choose your class");
        list.add(a);


        return list;
    }
}
