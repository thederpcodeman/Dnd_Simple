package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.BarbSub;
import src.Option;

import java.util.ArrayList;

public class Barbarian extends Option {
    public Barbarian(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new BarbSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}