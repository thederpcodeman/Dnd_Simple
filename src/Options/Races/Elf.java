package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Ef;
import src.Option;

import java.util.ArrayList;

public class Elf extends Option {
    public Elf(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Ef();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}