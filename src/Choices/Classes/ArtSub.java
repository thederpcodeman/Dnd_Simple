package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class ArtSub  extends Choice {
    public ArtSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Alchemist (Artificer)"));//
        pick.add(new Option("Armorer (Artificer)"));//
        pick.add(new Option("Artillerist (Artificer)"));//
        pick.add(new Option("Battle Smith (Artificer)"));//
        pick.add(new Option("Forge Adept ('Exploring Eberron') (Artificer)", false, true));//
        pick.add(new Option("Mastermaker ('Dread Metrol') (Artificer)", false, true));//
        pick.add(new Option("Maverick ('Exploring Eberron') (Artificer)", false, true));//
        Option a = Question.ask(pick, "Choose your Artificer Specialty");
        list.add(a);


        return list;
    }
}

