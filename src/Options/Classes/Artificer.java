package src.Options.Classes;

import src.Choice;
import src.Choices.Background;
import src.Choices.CClass;
import src.Choices.Classes.ArtSub;
import src.Choices.Race;
import src.Option;

import java.util.ArrayList;

public class Artificer extends Option {
    public Artificer(String n){
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