package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Tflng;
import src.Option;

import java.util.ArrayList;

public class Tiefling extends Option {
    public Tiefling(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Tflng();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}