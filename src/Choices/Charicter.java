package src.Choices;

import src.Choice;
import src.Option;
import src.Options.Yes;

import java.util.ArrayList;

public class Charicter extends Choice {
    public Charicter(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Option a = new Yes("PC");
        list.add(a);
        return list;
    }
}
