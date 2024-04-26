package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.RogSub;
import src.Option;

import java.util.ArrayList;

public class Rogue extends Option {
    public Rogue(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new RogSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}