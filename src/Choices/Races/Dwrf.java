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
        pick.add(new Option("Mark of Warding (Eberron) (Dwarf)", true, false));
        pick.add(new Option("Plane Shift: Kaladesh (Dwarf)", true, false));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

