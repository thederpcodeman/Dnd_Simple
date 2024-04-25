package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.BHSub;
import src.Option;

import java.util.ArrayList;

public class Blood_Hunter extends Option {
    public Blood_Hunter(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new BHSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}