package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dwrf;
import src.Choices.Races.Gnme;
import src.Option;

import java.util.ArrayList;

public class Gnome extends Option {
    public Gnome(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Gnme();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}