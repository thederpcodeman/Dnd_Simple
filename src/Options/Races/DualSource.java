package src.Options.Races;

import src.Choice;
import src.Choices.Races.Dual;
import src.Choices.Races.Dwrf;
import src.Option;

import java.util.ArrayList;

public class DualSource extends Option {
    private String s1;
    private String s2;
    public DualSource(String n, String S1, String S2){
        super(n);
        s1 = S1;
        s2 = S2;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice sp = new Dual(s1, s2);
        for (Option i : sp.run()){
            list.add(i);
        }

        return list;
    }
}