package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Hlflng;
import src.Option;

import java.util.ArrayList;

public class Halfling extends Option {
    public Halfling(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Hlflng();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}