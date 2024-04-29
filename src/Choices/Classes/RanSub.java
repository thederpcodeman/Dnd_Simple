package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class RanSub extends Choice {
    public RanSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Beast Master (Ranger)"));
        pick.add(new Option("Fey Wondered (Ranger)"));
        pick.add(new Option("Gloom Stalker (Ranger)"));
        pick.add(new Option("Horizon Walker (Ranger)"));
        pick.add(new Option("Hunter (Ranger)"));
        pick.add(new Option("Monster Slayer (Ranger)"));
        pick.add(new Option("Swarmkeeper (Ranger)"));
        pick.add(new Option("Drakewarden (Ranger)"));
        Option a = Question.ask(pick, "Choose your Ranger Conclave");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Archery (Fighting Style)"));
        pick.add(new Option("Blind Fighting (Fighting Style)"));
        pick.add(new Option("Defence (Fighting Style)"));
        pick.add(new Option("Druidic Warrior (Fighting Style)"));
        pick.add(new Option("Dueling (Fighting Style)"));
        pick.add(new Option("Thrown Weapon Fighting (Fighting Style)"));
        pick.add(new Option("Two Weapon Fighting (Fighting Style)"));
        a = Question.ask(pick, "Choose your Ranger Fighting Style");
        list.add(a);
        //Favored Enemy v favored foe
        pick = new ArrayList<Option>();
        pick.add(new Option("Favored Enemy (Ranger Feature)"));
        pick.add(new Option("Favored Foe (Ranger Feature)"));
        a = Question.ask(pick, "Choose one");
        list.add(a);
        //natural explorer v deft explorer
        pick = new ArrayList<Option>();
        pick.add(new Option("Natural Explorer (Ranger Feature)"));
        pick.add(new Option("Deft Explorer (Ranger Feature)"));
        a = Question.ask(pick, "Choose one");
        list.add(a);
        //Primeval awareness v primal awareness
        pick = new ArrayList<Option>();
        pick.add(new Option("Primeval Awareness (Ranger Feature)"));
        pick.add(new Option("Primal Awareness (Ranger Feature)"));
        a = Question.ask(pick, "Choose one at 3rd level");
        list.add(a);
        //Hide in Plain sight v Nature's veil
        pick = new ArrayList<Option>();
        pick.add(new Option("Hide in Plain Sight (Ranger Feature)"));
        pick.add(new Option("Nature's Veil (Ranger Feature)"));
        a = Question.ask(pick, "Choose one at 10th level");
        list.add(a);


        return list;
    }
}

