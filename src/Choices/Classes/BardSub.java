package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class BardSub extends Choice {
    public BardSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Creation (Bard)"));
        pick.add(new Option("Eloquence (Bard)"));
        pick.add(new Option("Glamor (Bard)"));
        pick.add(new Option("Lore (Bard)"));
        pick.add(new Option("Spirits (Bard)"));
        pick.add(new Option("Swords (Bard)"));
        pick.add(new Option("Valor (Bard)"));
        pick.add(new Option("Whispers (Bard)"));

        Option a = Question.ask(pick, "Choose your Bard College");
        list.add(a);


        return list;
    }
}

