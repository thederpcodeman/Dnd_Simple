package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Hlfelf extends Choice {
    public Hlfelf(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Skill Versatility (Half-Elf)"));
        pick.add(new Option("Elf Weapon Training (Half-Elf)"));
        pick.add(new Option("Cantrip (Half-Elf)"));
        pick.add(new Option("Fleet of Foot (Half-Elf)"));
        pick.add(new Option("Mask of the Wild (Half-Elf)"));
        pick.add(new Option("Drow Magic (Half-Elf)"));
        pick.add(new Option("Swim Speed (Half-Elf)"));

        Option a = Question.ask(pick, "Choose your Half-Elf Versatility Feature");
        list.add(a);


        return list;
    }
}

