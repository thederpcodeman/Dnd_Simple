package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Kbld;
import src.Option;

import java.util.ArrayList;

public class Kobold extends Option {
    public Kobold(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Kbld();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}