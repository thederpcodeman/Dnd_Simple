package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.RanSub;
import src.Option;

import java.util.ArrayList;

public class Ranger extends Option {
    public Ranger(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new RanSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}