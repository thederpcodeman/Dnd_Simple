package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Gnme extends Choice {
    public Gnme(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Forest Gnome (Gnome)"));
        pick.add(new Option("Rock Gnome (Gnome)"));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

