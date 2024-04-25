package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class BHSub extends Choice {
    public BHSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Ghostslayer (Blood Hunter)"));
        pick.add(new Option("Lycan (Blood Hunter)"));
        pick.add(new Option("Mutant (Blood Hunter)"));
        pick.add(new Option("Profane Soul (Blood Hunter)"));
        Option a = Question.ask(pick, "Choose your Blood Hunter Order");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }
        pick = new ArrayList<Option>();
        pick.add(new Option("Archery (Fighting Style)"));
        pick.add(new Option("Dueling (Fighting Style)"));
        pick.add(new Option("Great Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Two Weapon Fighting (Fighting Style)"));
        a = Question.ask(pick, "Choose your Blood Hunter Fighting Style");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }


        return list;
    }
}

