package src.Options;

import src.Option;
import src.Question;

import java.util.ArrayList;

public class Subchoice extends Option {
    private ArrayList<ArrayList<Option>> list;
    public Subchoice(String n, ArrayList<ArrayList<Option>> l){
        super(n);
        list = l;
    }
    public Subchoice(String n, ArrayList<ArrayList<Option>> l, Boolean u, Boolean h){
        super(n, u, h);
        list = l;
    }
    public Subchoice(String n, ArrayList<ArrayList<Option>> l, Boolean a){
        super(n, a);
        list = l;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> pick;
        ArrayList<Option> done = new ArrayList<>();
        Option a;
        for (ArrayList<Option> i : list){
            pick = i;
            a = Question.ask(pick, "Choose an option");
            done.add(a);
        }

        return done;
    }
}
