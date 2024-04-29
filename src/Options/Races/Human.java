package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Hmn;
import src.Option;

import java.util.ArrayList;

public class Human extends Option {
    public Human(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Hmn();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}