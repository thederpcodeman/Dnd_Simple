package src.Choices;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class BackGround extends Option {
    ArrayList<Option> t;
    ArrayList<Option> i;
    ArrayList<Option> b;
    ArrayList<Option> f;
    ArrayList<ArrayList<Option>> cs;

    public BackGround(String name, ArrayList<Option> Traits, ArrayList<Option> Ideals, ArrayList<Option> Bonds, ArrayList<Option> Flaws){
        super(name);
        t = Traits; i = Ideals; b = Bonds; f = Flaws; cs = new ArrayList<ArrayList<Option>>();
    }
    public BackGround(String name, ArrayList<Option> Traits, ArrayList<Option> Ideals, ArrayList<Option> Bonds, ArrayList<Option> Flaws, ArrayList<ArrayList<Option>> Choices){
        super(name);
        t = Traits; i = Ideals; b = Bonds; f = Flaws; cs = Choices;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = t;
        Option a = Question.ask(pick, "Choose a Personality Trait");
        a.name = a.name + " [Personality Trait]";
        list.add(a);
        pick = i;
        a = Question.ask(pick, "Choose an Ideal");
        a.name = a.name + " [Ideal]";
        list.add(a);
        pick = b;
        a = Question.ask(pick, "Choose a Bond");
        a.name = a.name + " [Bond]";
        list.add(a);
        pick = f;
        a = Question.ask(pick, "Choose a Flaw");
        a.name = a.name + " [Flaw]";
        list.add(a);
        for (ArrayList<Option> i : cs){
            pick = i;
            a = Question.ask(pick, "Choose an option");
            list.add(a);
        }


        return list;
    }
}

