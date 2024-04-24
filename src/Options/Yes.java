package src.Options;

import src.Choice;
import src.Option;

import java.util.ArrayList;

public class Yes extends Option{
    public Yes(String n){
        super(n);
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        Choice c = new Choice();
        Choice r = new Choice();
        Choice b = new Choice();
        for (Option i : c.run()){
            list.add(i);
        }
        for (Option i : r.run()){
            list.add(i);
        }
        for (Option i : b.run()){
            list.add(i);
        }
        return list;
    }
}
