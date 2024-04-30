package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Kbld extends Choice {
    public Kbld(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Mordenkainen's Kobold (Kobold)"));
        pick.add(new Option("Volo's Kobold (Kobold)"));
        Option a = Question.ask(pick, "Choose your Source");
        list.add(a);
        if (pick.indexOf(a) == 0){
            pick = new ArrayList<Option>();
            pick.add(new Option("Craftiness (Kobold Legacy)"));
            pick.add(new Option("Defiance (Kobold Legacy)"));
            pick.add(new Option("Draconic Sorcery (Kobold Legacy)"));
            a = Question.ask(pick, "Choose your Kobold Legacy Feature");
            list.add(a);
        }

        return list;
    }
}

