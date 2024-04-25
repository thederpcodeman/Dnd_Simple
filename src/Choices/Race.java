package src.Choices;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Race extends Choice {
    public Race(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Dwarf"));
        pick.add(new Option("Human"));
        pick.add(new Option("Teifling"));
        pick.add(new Option("Elf"));
        Option a = Question.ask(pick, "Choose your race");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }

        return list;
    }
}
