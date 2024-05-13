package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class MystSub extends Choice {
    public MystSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Avatar (Mystic)"));
        pick.add(new Option("Awakened (Mystic)"));
        pick.add(new Option("The Immortal (Mystic)"));
        pick.add(new Option("Nomad (Mystic)"));
        pick.add(new Option("Soul Knife (Mystic)"));
        pick.add(new Option("Wu Jen (Mystic)"));


        pick.add(new Option("Order of the Dream Eater ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Ghost ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Open Mind ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Oracle ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Phantom Warrior ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Planemind ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Shadow Soul ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Tapir Spirit ('dandwiki')(Mystic)", true));
        pick.add(new Option("Order of the Wielder ('dandwiki')(Mystic)", true));

        Option a = Question.ask(pick, "Choose your Mystic Order");
        list.add(a);


        return list;
    }
}

