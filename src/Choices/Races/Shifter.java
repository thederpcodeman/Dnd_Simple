package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Shifter extends Choice {
    public Shifter(){
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

            pick.add(new Option("Necrotic Shroud (Celestial Revelation)"));
            pick.add(new Option("Radiant Consumption (Celestial Revelation)"));
            pick.add(new Option("Radiant Soul (Celestial Revelation)"));
            a = Question.ask(pick, "Choose your Celestial Revelation");
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

