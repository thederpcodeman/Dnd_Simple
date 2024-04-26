package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class ScrSub extends Choice {
    public ScrSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Aberrant Mind (Sorcerer)"));
        pick.add(new Option("Clockwork Soul (Sorcerer)"));
        pick.add(new Option("Draconic Bloodline (Sorcerer)"));
        pick.add(new Option("Divine Soul (Sorcerer)"));
        pick.add(new Option("Lunar Sorcery (Sorcerer)"));
        pick.add(new Option("Shadow Magic (Sorcerer)"));
        pick.add(new Option("Storm Sorcery (Sorcerer)"));
        pick.add(new Option("Wild Magic (Sorcerer)"));
        Option a = Question.ask(pick, "Choose your Sorcerous Origin");
        list.add(a);
        pick = new ArrayList<Option>();
        pick.add(new Option("Carefull Spell (Metamagic)"));
        pick.add(new Option("Distant Spell (Metamagic)"));
        pick.add(new Option("Empowered Spell (Metamagic)"));
        pick.add(new Option("Extended Spell (Metamagic)"));
        pick.add(new Option("Heightened Spell (Metamagic)"));
        pick.add(new Option("Quickened Spell (Metamagic)"));
        pick.add(new Option("Seeking Spell (Metamagic)"));
        pick.add(new Option("Subtle Spell (Metamagic)"));
        pick.add(new Option("Transmuted Spell (Metamagic)"));
        pick.add(new Option("Twinned Spell (Metamagic)"));
        a = Question.ask(pick, "Choose your Metamagic Option");
        list.add(a);
        pick.remove(a);
        a = Question.ask(pick, "Choose your Second Metamagic Option");
        list.add(a);

        return list;
    }
}

