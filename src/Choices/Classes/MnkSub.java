package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class MnkSub extends Choice {
    public MnkSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Way of the Astral Self (Monk)"));
        pick.add(new Option("Way of the Ascendant Dragon (Monk)"));
        pick.add(new Option("Way of the Drunken Master (Monk)"));
        pick.add(new Option("Way of the Four Elements (Monk)"));
        pick.add(new Option("Way of the Kensei (Monk)"));
        pick.add(new Option("Way of the Long Death (Monk)"));
        pick.add(new Option("Way of Mercy (Monk)"));
        pick.add(new Option("Way of the Open Hand (Monk)"));
        pick.add(new Option("Way of Shadow (Monk)"));
        pick.add(new Option("Way of the Sun Soul (Monk)"));
        pick.add(new Option("Way of the Cobalt Soul ('Tal'Dorei Campaign Setting Reborn') (Monk)", false, true));
        pick.add(new Subchoice("Way of the Living Weapon ('Exploring Eberron') (Monk)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option("Forged Heart (3rd Level Discipline)"),
                new Option("Nightmare Shroud (3rd Level Discipline)"),
                new Option("Traveler’s Blade (3rd Level Discipline)"),
                new Option("Weretouched (3rd Level Discipline)")
        )),
                new ArrayList<>(Arrays.asList(
                        new Option("Forged Heart (17th Level Discipline)"),
                        new Option("Nightmare Shroud (17th Level Discipline)"),
                        new Option("Traveler’s Blade (17th Level Discipline)"),
                        new Option("Weretouched (17th Level Discipline)")
                ))
                )), false, true));
        pick.add(new Option("Way of the Soul Knife ('ThinkDM') (Monk)", false, true));
        Option a = Question.ask(pick, "Choose your Monastic Tradition");
        list.add(a);


        return list;
    }
}

