package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class ArtSub  extends Choice {
    public ArtSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Alchemist (Artificer)"));
        pick.add(new Option("Armorer (Artificer)"));
        pick.add(new Option("Artistic (Artificer)"));
        pick.add(new Option("Battle Smith (Artificer)"));
        Option a = Question.ask(pick, "Choose your Artificer Specialty");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }


        return list;
    }
}

