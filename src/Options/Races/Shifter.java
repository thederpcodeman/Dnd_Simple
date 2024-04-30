package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Shftr;
import src.Option;

import java.util.ArrayList;

public class Shifter extends Option {
    public Shifter(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Shftr();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}