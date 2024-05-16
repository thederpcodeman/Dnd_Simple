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
        pick.add(new Option("Acheron Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Baphomet Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Bestial Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Bloodborn Teifling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Carcerian Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Cataegis Tiefling (Winged) ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Dagon Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Demogorgon Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Dragon Child ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Envious Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Fraz-Urb'luu Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Gehhenna Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Gluttonous Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Graz'zt Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Great Horned Rat Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Greedy Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Hades Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Half-Dragon ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Harlequin Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Hell Hound Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Hellfire Soul ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Imp Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Impure Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Juiblex Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Khornate Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Kostchtchie Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Lolthite Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Lustful Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Malagard Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Malal Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Malcanthet Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Maltaur ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Mare Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Moloch Soul ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Nurglite Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Obox-ob Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Oni Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Orcus Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Pandemonium Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Pazuzu Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Prideful Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Rakshasa Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Slaaneshi Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Slothful Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Stygian Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Survivor ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Terminus Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Tiamat ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Tiamat Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Tzeentchian Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Ugudenk Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Vashtorr Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Voidborn Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Wrathful Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Yeenoghu Tiefling ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Zombie ('dandwiki')(Tiefling)", true));
        pick.add(new Option("Zuggtmoy Tiefling ('dandwiki')(Tiefling)", true));
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

