package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class DrdSub extends Choice {
    public DrdSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Dreams (Druid)"));
        pick.add(new Option("Land (Druid)"));
        pick.add(new Option("Moon (Druid)"));
        pick.add(new Option("Shepard (Druid)"));
        pick.add(new Option("Spores (Druid)"));
        pick.add(new Option("Stars (Druid)"));
        pick.add(new Option("Wildfire (Druid)"));
        Option a = Question.ask(pick, "Choose your Druid Circle");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }


        return list;
    }
}

