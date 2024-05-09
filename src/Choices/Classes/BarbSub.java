package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class BarbSub extends Choice {
    public BarbSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Ancestral Guardian (Barbarian)"));//
        pick.add(new Option("Battlerager (Barbarian)"));//
        pick.add(new Option("Beast (Barbarian)"));//
        pick.add(new Option("Berserker (Barbarian)"));//
        pick.add(new Option("Giant (Barbarian)"));//
        pick.add(new Subchoice("Storm Herald (Barbarian)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option ("Desert (Storm Aura)"),
                new Option ("Sea (Storm Aura)"),
                new Option ("Tundra (Storm Aura)")))))));
        pick.add(new Subchoice("Totem Warrior (Barbarian)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option ("Bear (Totem Warrior)"),
                new Option ("Eagle (Totem Warrior)"),
                new Option ("Elk (Totem Warrior)"),
                new Option ("Tiger (Totem Warrior)"),
                new Option ("Wolf (Totem Warrior)")))))));
        pick.add(new Option("Wild Magic (Barbarian)"));//
        pick.add(new Option("Zealot (Barbarian)"));//
        pick.add(new Option("Juggernaut ('Tal'Dorei Campaign Setting Reborn') (Barbarian)", false, true));//
        pick.add(new Option("The Depths (' Legend of Runeterra: Dark Tides of Bilgewater') (Barbarian)", false, true));//

        Option a = Question.ask(pick, "Choose your Primal Path");
        list.add(a);


        return list;
    }
}

