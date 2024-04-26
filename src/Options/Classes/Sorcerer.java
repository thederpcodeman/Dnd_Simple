package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Option;

import java.util.ArrayList;

public class Sorcerer extends Option {
    public Sorcerer(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new ArtSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}