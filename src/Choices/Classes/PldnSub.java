package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class PldnSub extends Choice {
    public PldnSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Oath of the Ancients (Paladin)"));
        pick.add(new Option("Oath of Conquest (Paladin)"));
        pick.add(new Option("Oath of the Crown (Paladin)"));
        pick.add(new Option("Oath of Devotion (Paladin)"));
        pick.add(new Option("Oath of Glory (Paladin)"));
        pick.add(new Option("Oath of Redemption (Paladin)"));
        pick.add(new Option("Oath of Vengeance (Paladin)"));
        pick.add(new Option("Oath of the Watchers (Paladin)"));
        pick.add(new Option("Oathbreaker (Paladin)"));
        Option a = Question.ask(pick, "Choose your Sacred Oath");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }
        pick = new ArrayList<Option>();
        pick.add(new Option("Blessed Warrior (Fighting Style)"));
        pick.add(new Option("Blind Fighting (Fighting Style)"));
        pick.add(new Option("Defence (Fighting Style)"));
        pick.add(new Option("Dueling (Fighting Style)"));
        pick.add(new Option("Great Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Interception (Fighting Style)"));
        pick.add(new Option("Protection (Fighting Style)"));

        a = Question.ask(pick, "Choose your Paladin Fighting Style");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }


        return list;
    }
}

