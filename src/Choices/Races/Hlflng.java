package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Hlflng extends Choice {
    public Hlflng(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Lightfoot Halfling (Halfling)"));
        pick.add(new Option("Stout Halfling (Halfling)"));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

