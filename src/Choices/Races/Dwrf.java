package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Dwrf extends Choice {
    public Dwrf(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Hill Dwarf (Dwarf)"));
        pick.add(new Option("Mountain Dwarf (Dwarf)"));
        pick.add(new Option("Mark of Warding (Eberron) (Dwarf)", true, false));
        pick.add(new Option("Plane Shift: Kaladesh (Dwarf)", true, false));
        pick.add(new Option("Arcadian ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Beast Born ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Brae Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Bronzebeard Clan (Ironforge Dwarf) ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Chultan Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Cloud Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Copperclaw Clan ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Crystal Born ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Dark Iron Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Deep Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Dragon Child ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Dragonshore Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Duergar, Variant ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Dwindle Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Elemental Born ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Exotic Elemental Born ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Fey Heritage ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Firebeard Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Frostbeard Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Celestial ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Draconic ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Dragon ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Elven ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Fiendish ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Genasi ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Giant ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Gnomish ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Half-Orcish ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Halfling ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Hammerdeep Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("High Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Highland Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Highlander Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Korobokuru ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Nidavellir ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Oakenshield Clan ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Orecutter Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Plains Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Rune Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Sainted ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Survivor ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Tree Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Volcano Dwarf ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Wildhammer Clan ('dandwiki')(Dwarf)", true));
        pick.add(new Option("Zombie ('dandwiki')(Dwarf)", true));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

