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
        pick.add(new Option("Ghostwise Halfling (SCAG) (Halfling)", true, false));
        pick.add(new Option("Lotusden Halfling (Wildemount) (Halfling)", true, false));
        pick.add(new Option("Mark of Hospitality (Eberron) (Halfling)", true, false));
        pick.add(new Option("Mark of Healing (Eberron) (Halfling)", true, false));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);
//

        return list;
    }
}

