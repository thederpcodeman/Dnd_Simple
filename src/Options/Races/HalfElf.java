package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Hlfelf;
import src.Option;

import java.util.ArrayList;

public class HalfElf extends Option {
    public HalfElf(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Hlfelf();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}