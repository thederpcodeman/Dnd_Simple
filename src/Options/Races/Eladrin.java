package src.Options.Races;

import src.Choice;
import src.Choices.Races.Eldrn;
import src.Option;

import java.util.ArrayList;

public class Eladrin extends Option {
    public Eladrin(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Eldrn();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}