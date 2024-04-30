package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Asmar extends Choice {
    public Asmar(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();

        pick.add(new Option("Mordenkainen's Aasimar (Aasimar)"));
        pick.add(new Option("Volo's Aasimar (Aasimar)"));
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

            pick.add(new Option("Protector Aasimar (Volo's Aasimar)"));
            pick.add(new Option("Scourge Aasimar (Volo's Aasimar)"));
            pick.add(new Option("Fallen Aasimar (Volo's Aasimar)"));
            a = Question.ask(pick, "Choose your Subrace");
            list.add(a);
        }

        return list;
    }
}

