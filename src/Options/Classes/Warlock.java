package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.WlkSub;
import src.Option;

import java.util.ArrayList;

public class Warlock extends Option {
    public Warlock(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new WlkSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}