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
        pick.add(new Option("Mark of Finding (Eberron) (Human)", true, false));
        pick.add(new Option("Mark of Handling (Eberron) (Human)", true, false));
        pick.add(new Option("Mark of Making (Eberron) (Human)", true, false));
        pick.add(new Option("Mark of Passage (Eberron) (Human)", true, false));
        pick.add(new Option("Mark of Sentinel (Eberron) (Human)", true, false));
        pick.add(new Option("Keldon (Plane Shift: Dominaria) (Human)", true, false));
        pick.add(new Option("Gavony (Plane Shift: Innistrad) (Human)", true, false));
        pick.add(new Option("Kessig (Plane Shift: Innistrad) (Human)", true, false));
        pick.add(new Option("Nephalia (Plane Shift: Innistrad) (Human)", true, false));
        pick.add(new Option("Stensia (Plane Shift: Innistrad) (Human)", true, false));

        Option a = Question.ask(pick, "Choose One");
        list.add(a);


        return list;
    }
}

