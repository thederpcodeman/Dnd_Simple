package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Tflng extends Choice {
    public Tflng(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Bloodline of Asmodeus / Standard Tiefling (Tiefling)"));
        pick.add(new Option("Bloodline of Baalzebul (Tiefling)"));
        pick.add(new Option("Bloodline of Dispater (Tiefling)"));
        pick.add(new Option("Bloodline of Fierna (Tiefling)"));
        pick.add(new Option("Bloodline of Glasya (Tiefling)"));
        pick.add(new Option("Bloodline of Levistus (Tiefling)"));
        pick.add(new Option("Bloodline of Mammon (Tiefling)"));
        pick.add(new Option("Bloodline of Mephistopheles (Tiefling)"));
        pick.add(new Option("Bloodline of Zariel (Tiefling)"));
        pick.add(new Option("Abyssal Tiefling (Tiefling)", true, false));
        Option a = Question.ask(pick, "Choose your Bloodline");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("[Standard Tiefling]"));
        pick.add(new Option("Feral (Variant Tiefling)"));
        if (Question.rand){
            pick.add(new Option("[Standard Tiefling]"));
            pick.add(new Option("[Standard Tiefling]"));
            pick.add(new Option("[Standard Tiefling]"));
        }
        a = Question.ask(pick, "Are you using Variant Rules Feral Tiefling (blank is not using the Variant rule)");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("[Standard Tiefling]"));
        pick.add(new Option("Devil's Tongue (Variant Tiefling)"));
        pick.add(new Option("Hellfire (Variant Tiefling)"));
        pick.add(new Option("Winged (Variant Tiefling)"));
        if (Question.rand){
            pick.add(new Option("[Standard Tiefling]"));
            pick.add(new Option("[Standard Tiefling]"));
            pick.add(new Option("[Standard Tiefling]"));
            pick.add(new Option("[Standard Tiefling]"));
            pick.add(new Option("[Standard Tiefling]"));
            pick.add(new Option("[Standard Tiefling]"));
        }
        a = Question.ask(pick, "Are you using Other Variant Rules (blank is not using Variant rules)");
        list.add(a);


        return list;
    }
}

