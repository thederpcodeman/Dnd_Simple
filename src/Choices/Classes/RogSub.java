package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class RogSub extends Choice {
    public RogSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Arcane Trickster (Rogue)"));
        pick.add(new Option("Assasin (Rogue)"));
        pick.add(new Option("Inquisitive (Rogue)"));
        pick.add(new Option("Mastermind (Rogue)"));
        pick.add(new Option("Phantom (Rogue)"));
        pick.add(new Option("Scout (Rogue)"));
        pick.add(new Option("Soul Knife (Rogue)"));
        pick.add(new Option("Swashbuckler (Rogue)"));
        pick.add(new Option("Thief (Rogue)"));
        Option a = Question.ask(pick, "Choose your Roguish Archetype");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }


        return list;
    }
}

