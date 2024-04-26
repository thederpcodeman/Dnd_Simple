package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class ClrcSub extends Choice {
    public ClrcSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Arcana (Cleric)"));
        pick.add(new Option("Death (Cleric)"));
        pick.add(new Option("Forge (Cleric)"));
        pick.add(new Option("Grave (Cleric)"));
        pick.add(new Option("Knowledge (Cleric)"));
        pick.add(new Option("Life (Cleric)"));
        pick.add(new Option("Light (Cleric)"));
        pick.add(new Option("Nature (Cleric)"));
        pick.add(new Option("Order (Cleric)"));
        pick.add(new Option("Peace (Cleric)"));
        pick.add(new Option("Tempest (Cleric)"));
        pick.add(new Option("Trickery (Cleric)"));
        pick.add(new Option("Twilight (Cleric)"));
        pick.add(new Option("War (Cleric)"));
        Option a = Question.ask(pick, "Choose your Divine Domain");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }


        return list;
    }
}

