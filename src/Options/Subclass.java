package src.Options;

import src.Choice;
import src.Choices.Races.Dual;
import src.Option;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class Subclass  extends Option {
    private ArrayList<ArrayList<Option>> list;
    public Subclass(String n, ArrayList<ArrayList<Option>> l){
        super(n);
        list = l;
    }
    public Subclass(String n, ArrayList<ArrayList<Option>> l, Boolean u, Boolean h){
        super(n, u, h);
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
