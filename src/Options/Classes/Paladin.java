package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.PldnSub;
import src.Option;

import java.util.ArrayList;

public class Paladin extends Option {
    public Paladin(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new PldnSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}