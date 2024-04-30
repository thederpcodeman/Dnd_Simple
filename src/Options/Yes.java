package src.Options;

import src.Choice;
import src.Choices.BGs;
import src.Choices.CClass;
import src.Choices.Race;
import src.Option;

import java.util.ArrayList;

public class Yes extends Option{
    public Yes(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice c = new CClass();
        Choice r = new Race();
        Choice b = new BGs();
        for (Option i : r.run()){
            list.add(i);
        }
        for (Option i : b.run()){
            list.add(i);
        }
        for (Option i : c.run()){
            list.add(i);
        }
        return list;
    }
}
