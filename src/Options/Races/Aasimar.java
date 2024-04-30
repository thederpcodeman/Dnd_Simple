package src.Options.Races;

import src.Choice;
import src.Choices.Races.Asmar;
import src.Option;

import java.util.ArrayList;

public class Aasimar extends Option {
    public Aasimar(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Asmar();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}