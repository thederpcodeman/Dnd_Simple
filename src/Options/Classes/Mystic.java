package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.MystSub;
import src.Option;

import java.util.ArrayList;

public class Mystic extends Option {
    public Mystic(String n){
        super(n, true, false);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new MystSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}