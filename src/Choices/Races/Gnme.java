package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Gnme extends Choice {
    public Gnme(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Forest Gnome (Gnome)"));
        pick.add(new Option("Rock Gnome (Gnome)"));
        pick.add(new Option("Mark of Scribing (eberron) (Gnome)", true, false));
        pick.add(new Option("Cliff Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Desert Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Dragon Child ('dandwiki')(Gnome)", true));
        pick.add(new Option("Frost Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Garden Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Celestial ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Draconic ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Dragon ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Dwarven ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Elven ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Fiendish ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Genasi ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Gnome Wereshark ('dandwiki')(Gnome)", true));
        pick.add(new Option("Half-Orcish ('dandwiki')(Gnome)", true));
        pick.add(new Option("Halfling ('dandwiki')(Gnome)", true));
        pick.add(new Option("Mechanical Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Mountain Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Redcap ('dandwiki')(Gnome)", true));
        pick.add(new Option("Sainted ('dandwiki')(Gnome)", true));
        pick.add(new Option("Salt Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Survivor ('dandwiki')(Gnome)", true));
        pick.add(new Option("Svirfneblin, Variant ('dandwiki')(Gnome)", true));
        pick.add(new Option("Volcano Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Wack Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Wavecrest Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Winged Gnome ('dandwiki')(Gnome)", true));
        pick.add(new Option("Zombie ('dandwiki')(Gnome)", true));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

