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
            pick.add(new Option("Betrayed Aasimar ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Blood Angel ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("CPU Aasimar ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Devani ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Dragon Child ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Dragonborn Angel ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Fallen Angel ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Half-Dragon ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Mothra Aasimar ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Ophanim Aasimar ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Reaper Aasimar ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Risen Aasimar ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Spark Soul ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Survivor ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Titanborn ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Winged Aasimar ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Winged Aasimar, Variant ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Wisper Soul ('dandwiki')(Volo's Aasimar)", true));
            pick.add(new Option("Zombie ('dandwiki')(Volo's Aasimar)", true));
            a = Question.ask(pick, "Choose your Subrace");
            list.add(a);
        }

        return list;
    }
}

