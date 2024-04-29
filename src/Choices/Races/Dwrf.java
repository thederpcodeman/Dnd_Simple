package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Dwrf extends Choice {
    public Dwrf(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Hill Dwarf (Dwarf)"));
        pick.add(new Option("Mountain Dwarf (Dwarf)"));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

