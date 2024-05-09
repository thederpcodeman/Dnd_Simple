package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class WizSub extends Choice {
    public WizSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Abjuration (Wizard)"));
        pick.add(new Option("Bladesinging (Wizard)"));
        pick.add(new Option("Chronurgy (Wizard)"));
        pick.add(new Option("Conjuration (Wizard)"));
        pick.add(new Option("Divination (Wizard)"));
        pick.add(new Option("Enchantment (Wizard)"));
        pick.add(new Option("Evocation (Wizard)"));
        pick.add(new Option("Graviturgy (Wizard)"));
        pick.add(new Option("Illusion (Wizard)"));
        pick.add(new Option("Necromancy (Wizard)"));
        pick.add(new Option("The Order of Scribes (Wizard)"));
        pick.add(new Option("Transmutation (Wizard)"));
        pick.add(new Option("War Magic (Wizard)"));
        pick.add(new Option("Rune Crafter (Wizard)", true, false));
        pick.add(new Option("Blood Magic ('Tal'Dorei Campaign Setting Reborn') (Wizard)", false, true));
        Option a = Question.ask(pick, "Choose your Arcane Tradition");
        list.add(a);


        return list;
    }
}

