package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Option;

import java.util.ArrayList;

public class Dwarf extends Option {
    public Dwarf(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Dwrf();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}