package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.WizSub;
import src.Option;

import java.util.ArrayList;

public class Wizard extends Option {
    public Wizard(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new WizSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}