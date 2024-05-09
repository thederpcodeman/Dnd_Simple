package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class DrdSub extends Choice {
    public DrdSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Dreams (Druid)"));//
        pick.add(new Subchoice("Land (Druid)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option ("Arctic (Land)"),
                new Option ("Coast (Land)"),
                new Option ("Desert (Land)"),
                new Option ("Forest (Land)"),
                new Option ("Grassland (Land)"),
                new Option ("Mountain (Land)"),
                new Option ("Swamp (Land)"),
                new Option ("Underdark (Land)")))))));
        pick.add(new Option("Moon (Druid)"));//
        pick.add(new Option("Shepard (Druid)"));//
        pick.add(new Option("Spores (Druid)"));//
        pick.add(new Option("Stars (Druid)"));//
        pick.add(new Option("Wildfire (Druid)"));//
        pick.add(new Option("Primeval (Druid)", true, false));//
        pick.add(new Option("The Blighted ('Tal'Dorei Campaign Setting Reborn') (Druid)", false, true));//
        pick.add(new Option("The Forged ('Exploring Eberron') (Druid)", false, true));//
        Option a = Question.ask(pick, "Choose your Druid Circle");
        list.add(a);


        return list;
    }
}

