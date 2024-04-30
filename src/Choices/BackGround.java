package src.Choices;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class BackGround extends Choice {
    ArrayList<Option> t;
    ArrayList<Option> i;
    ArrayList<Option> b;
    ArrayList<Option> f;
    public BackGround(ArrayList<Option> Traits, ArrayList<Option> Ideals, ArrayList<Option> Bonds, ArrayList<Option> Flaws){
        super();
        t = Traits; i = Ideals; b = Bonds; f = Flaws;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = t;
        Option a = Question.ask(pick, "Choose a Personality Trait");
        list.add(a);
        pick = i;
        a = Question.ask(pick, "Choose an Ideal");
        list.add(a);
        pick = b;
        a = Question.ask(pick, "Choose a Bond");
        list.add(a);
        pick = f;
        a = Question.ask(pick, "Choose a Flaw");
        list.add(a);


        return list;
    }
}

