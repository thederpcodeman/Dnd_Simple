package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class FghtSub extends Choice {
    public FghtSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Arcane Archer (Fighter)"));
        pick.add(new Option("Banneret (Fighter)"));
        pick.add(new Option("Battle Master (Fighter)"));
        pick.add(new Option("Cavalier (Fighter)"));
        pick.add(new Option("Champion (Fighter)"));
        pick.add(new Option("Echo Knight (Fighter)"));
        pick.add(new Option("Eldrich Knight (Fighter)"));
        pick.add(new Option("Psi Warrior (Fighter)"));
        pick.add(new Option("Rune Knight (Fighter)"));
        pick.add(new Option("Samurai (Fighter)"));
        Option a = Question.ask(pick, "Choose your Martial Archetype");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }
        pick = new ArrayList<Option>();
        pick.add(new Option("Archery (Fighting Style)"));
        pick.add(new Option("Blind Fighting (Fighting Style)"));
        pick.add(new Option("Defence (Fighting Style)"));
        pick.add(new Option("Dueling (Fighting Style)"));
        pick.add(new Option("Great Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Interception (Fighting Style)"));
        pick.add(new Option("Protection (Fighting Style)"));
        pick.add(new Option("Superior Technique (Fighting Style)"));
        pick.add(new Option("Thrown Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Two Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Unarmed Fighting (Fighting Style)"));

        a = Question.ask(pick, "Choose your Fighter Fighting Style");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }


        return list;
    }
}

