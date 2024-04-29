package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Dual extends Choice {
    private String s1;
    private String s2;
    public Dual(String S1, String S2){
        super();
        s1 = S1;
        s2 = S2;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option(s1));
        pick.add(new Option(s2));
        Option a = Question.ask(pick, "Choose your Source");
        list.add(a);


        return list;
    }
}

