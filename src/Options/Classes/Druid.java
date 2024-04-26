package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.DrdSub;
import src.Option;

import java.util.ArrayList;

public class Druid extends Option {
    public Druid(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new DrdSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}