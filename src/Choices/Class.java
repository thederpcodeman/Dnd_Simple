package src.Choices;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Class extends Choice {
    public Class(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Barbarian"));
        pick.add(new Option("Bard"));
        pick.add(new Option("Cleric"));
        pick.add(new Option("Druid"));
        list.add(Question.ask(pick, "Choose your class"));


        return list;
    }
}
