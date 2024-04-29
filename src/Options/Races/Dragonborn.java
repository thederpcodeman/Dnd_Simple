package src.Options.Races;

import src.Choice;
import src.Choices.Races.Drgnbrn;
import src.Option;

import java.util.ArrayList;

public class Dragonborn extends Option {
    public Dragonborn(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Drgnbrn();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}