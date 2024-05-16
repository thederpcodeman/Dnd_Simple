package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Hlflng extends Choice {
    public Hlflng(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Lightfoot Halfling (Halfling)"));
        pick.add(new Option("Stout Halfling (Halfling)"));
        pick.add(new Option("Ghostwise Halfling (SCAG) (Halfling)", true, false));
        pick.add(new Option("Lotusden Halfling (Wildemount) (Halfling)", true, false));
        pick.add(new Option("Mark of Hospitality (Eberron) (Halfling)", true, false));
        pick.add(new Option("Mark of Healing (Eberron) (Halfling)", true, false));
        pick.add(new Option("Burly Halfling ('dandwiki')(Halfling)", true));
        pick.add(new Option("Dovahkiin ('dandwiki')(Halfling)", true));
        pick.add(new Option("Dragon Child ('dandwiki')(Halfling)", true));
        pick.add(new Option("Fallohide Halfling ('dandwiki')(Halfling)", true));
        pick.add(new Option("Froggit ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Celestial ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Draconic ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Dragon ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Dwarven ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Elven ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Fiendish ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Genasi ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Gnomish ('dandwiki')(Halfling)", true));
        pick.add(new Option("Half-Orcish ('dandwiki')(Halfling)", true));
        pick.add(new Option("Hearth Halfling ('dandwiki')(Halfling)", true));
        pick.add(new Option("Imp-Wise Halfling ('dandwiki')(Halfling)", true));
        pick.add(new Option("Quarterling ('dandwiki')(Halfling)", true));
        pick.add(new Option("Sainted ('dandwiki')(Halfling)", true));
        pick.add(new Option("Shadowfoot ('dandwiki')(Halfling)", true));
        pick.add(new Option("Shu ('dandwiki')(Halfling)", true));
        pick.add(new Option("Survivor ('dandwiki')(Halfling)", true));
        pick.add(new Option("Wyldling ('dandwiki')(Halfling)", true));
        pick.add(new Option("Zombie ('dandwiki')(Halfling)", true));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);
//

        return list;
    }
}

