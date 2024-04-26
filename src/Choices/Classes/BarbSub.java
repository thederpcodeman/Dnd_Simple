package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class BarbSub extends Choice {
    public BarbSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Ancestral Guardian (Barbarian)"));
        pick.add(new Option("Battlerager (Barbarian)"));
        pick.add(new Option("Beast (Barbarian)"));
        pick.add(new Option("Berserker (Barbarian)"));
        pick.add(new Option("Giant (Barbarian)"));
        pick.add(new Option("Storm Herald (Barbarian)"));
        pick.add(new Option("Totem Warrior (Barbarian)"));
        pick.add(new Option("Wild Magic (Barbarian)"));
        pick.add(new Option("Zealot (Barbarian)"));

        Option a = Question.ask(pick, "Choose your Primal Path");
        list.add(a);


        return list;
    }
}

