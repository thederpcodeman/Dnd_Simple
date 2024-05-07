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
        pick.add(new Option("Arcana Domain (Cleric)"));
        pick.add(new Option("Death Domain (Cleric)"));
        pick.add(new Option("Forge Domain (Cleric)"));
        pick.add(new Option("Grave Domain (Cleric)"));
        pick.add(new Option("Knowledge Domain (Cleric)"));
        pick.add(new Option("Life Domain (Cleric)"));
        pick.add(new Option("Light Domain (Cleric)"));
        pick.add(new Option("Nature Domain (Cleric)"));
        pick.add(new Option("Order Domain (Cleric)"));
        pick.add(new Option("Peace Domain (Cleric)"));
        pick.add(new Option("Tempest Domain (Cleric)"));
        pick.add(new Option("Trickery Domain (Cleric)"));
        pick.add(new Option("Twilight Domain (Cleric)"));
        pick.add(new Option("War Domain (Cleric)"));
        pick.add(new Option("Ambition (Cleric)",true, false));
        pick.add(new Option("Solidarity (Cleric)",true, false));
        pick.add(new Option("Strength Domain (Cleric)",true, false));
        pick.add(new Option("Zeal Domain (Cleric)",true, false));
        pick.add(new Option("Fate Domain (Cleric)",true, false));
        Option a = Question.ask(pick, "Choose your Divine Domain");
        list.add(a);


        return list;
    }
}

