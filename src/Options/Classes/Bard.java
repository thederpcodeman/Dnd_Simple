package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.BardSub;
import src.Option;

import java.util.ArrayList;

public class Bard extends Option {
    public Bard(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new BardSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}