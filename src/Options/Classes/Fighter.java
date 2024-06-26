package src.Options.Classes;

import src.Choice;
import src.Choices.Classes.ArtSub;
import src.Choices.Classes.FghtSub;
import src.Option;

import java.util.ArrayList;

public class Fighter extends Option {
    public Fighter(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new FghtSub();
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}