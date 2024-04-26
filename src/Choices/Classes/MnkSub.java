package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class MnkSub extends Choice {
    public MnkSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Way of the Astral Self (Monk)"));
        pick.add(new Option("Way of the Ascendant Dragon (Monk)"));
        pick.add(new Option("Way of the Drunken Master (Monk)"));
        pick.add(new Option("Way of the Four Elements (Monk)"));
        pick.add(new Option("Way of the Kensei (Monk)"));
        pick.add(new Option("Way of the Long Death (Monk)"));
        pick.add(new Option("Way of Mercy (Monk)"));
        pick.add(new Option("Way of the Open Hand (Monk)"));
        pick.add(new Option("Way of Shadow (Monk)"));
        pick.add(new Option("Way of the Sun Soul (Monk)"));
        Option a = Question.ask(pick, "Choose your Monastic Tradition");
        list.add(a);


        return list;
    }
}

