package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Option;

import java.util.ArrayList;

public class Monk extends Option {
    public Monk(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new MnkSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}