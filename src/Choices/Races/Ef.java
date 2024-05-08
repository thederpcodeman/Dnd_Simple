package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class Ef extends Choice {
    public Ef(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("High Elf (Elf)"));
        pick.add(new Option("Wood Elf (Elf)"));
        pick.add(new Option("Dark Elf (Elf)"));
        pick.add(new Option("Pallid Elf (Wildemount) (Elf)", true, false));
        pick.add(new Option("Mark of Shadow (Eberron) (Elf)", true, false));
        pick.add(new Option("Bishtahar/Tirahar Elf (Plane Shift: Kaladesh) (Elf)", true, false));
        pick.add(new Option("Vahadar Elf (Plane Shift: Kaladesh) (Elf)", true, false));
        pick.add(new Subchoice("Plane Shift: Zendikar (Elf)", new ArrayList<ArrayList<Option>>(Arrays.asList(new ArrayList<Option>(Arrays.asList(
                new Option("Tajuru"),
                new Option("Juraga"),
                new Option("Mul Daya")
        )))), true, false));
        pick.add(new Option("Avariel Elf (Elf)", true, false));
        pick.add(new Option("Gurgach Elf (Greyhawk) (Elf)", true, false));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

