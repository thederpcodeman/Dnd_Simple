package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Shftr extends Choice {
    public Shftr(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();

        pick.add(new Option("Mordenkainen's Shifter (Shifter)"));
        pick.add(new Option("Eberron's Shifter (Shifter)"));
        Option a = Question.ask(pick, "Choose your Source");
        list.add(a);
        if (pick.indexOf(a) == 0){
            pick = new ArrayList<Option>();

            pick.add(new Option("Werebear (Mordenkainen's Shifter)"));
            pick.add(new Option("Wereboar (Mordenkainen's Shifter)"));
            pick.add(new Option("Wererat (Mordenkainen's Shifter)"));
            pick.add(new Option("Weretiger (Mordenkainen's Shifter)"));
            pick.add(new Option("Werewolf (wolflike) (Mordenkainen's Shifter)"));
            pick.add(new Option("Werewolf (doglike) (Mordenkainen's Shifter)"));
            a = Question.ask(pick, "Choose your Lycanthrope Ancestor");
            list.add(a);
            pick = new ArrayList<Option>();

            pick.add(new Option("Beasthide (Shifting)"));
            pick.add(new Option("Longtooth (Shifting)"));
            pick.add(new Option("Swiftstride (Shifting)"));
            pick.add(new Option("Wildhunt (Shifting)"));
            a = Question.ask(pick, "Choose your Shifting Benefit");
            list.add(a);
        }else {
            pick = new ArrayList<Option>();

            pick.add(new Option("Beasthide Shifter (Eberron's Shifter)"));
            pick.add(new Option("Longtooth Shifter (Eberron's Shifter)"));
            pick.add(new Option("Swiftstride Shifter (Eberron's Shifter)"));
            pick.add(new Option("Wildhunt Shifter (Eberron's Shifter)"));
            a = Question.ask(pick, "Choose your Subrace");
            list.add(a);
        }

        return list;
    }
}

