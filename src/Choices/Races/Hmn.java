package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Hmn extends Choice {
    public Hmn(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Standard Human (Human)"));
        pick.add(new Option("Variant Human (Human)"));
        Option a = Question.ask(pick, "Are you using variant human");
        list.add(a);


        return list;
    }
}

