package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Drgnbrn extends Choice {
    public Drgnbrn(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Black (Dragonborn)"));
        pick.add(new Option("Blue (Dragonborn)"));
        pick.add(new Option("Green (Dragonborn)"));
        pick.add(new Option("Red (Dragonborn)"));
        pick.add(new Option("White (Dragonborn)"));
        pick.add(new Option("Brass (Dragonborn)"));
        pick.add(new Option("Bronze (Dragonborn)"));
        pick.add(new Option("Copper (Dragonborn)"));
        pick.add(new Option("Gold (Dragonborn)"));
        pick.add(new Option("Silver (Dragonborn)"));
        pick.add(new Option("Amethyst (Dragonborn)"));
        pick.add(new Option("Crystal (Dragonborn)"));
        pick.add(new Option("Emerald (Dragonborn)"));
        pick.add(new Option("Sapphire (Dragonborn)"));
        pick.add(new Option("Topaz (Dragonborn)"));
        Option a = Question.ask(pick, "Choose your Draconic Ancestors Color");
        list.add(a);
        int i = pick.indexOf(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Standard Dragonborn (Dragonborn)"));
        pick.add(new Option("Draconblood (Dragonborn)"));
        pick.add(new Option("Ravenite (Dragonborn)"));
        if (i < 5 && i >= 0){
            pick.add(new Option("Chromatic Dragonborn (Dragonborn)"));
        }else if (i < 10 && i >= 5){
            pick.add(new Option("Metallic Dragonborn (Dragonborn)"));
        }else if (i < 15 && i >= 10){
            pick.add(new Option("Gem Dragonborn (Dragonborn)"));
        }
        a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

