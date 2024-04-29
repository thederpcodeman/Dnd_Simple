package src.Choices;

import src.Choice;
import src.Option;
import src.Options.Races.*;
import src.Question;

import java.util.ArrayList;

public class Race extends Choice {
    public Race(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Dragonborn("Dragonborn"));//
        pick.add(new Dwarf("Dwarf"));//
        pick.add(new Elf("Elf"));//
        pick.add(new Gnome("Gnome"));//
        pick.add(new HalfElf("Half Elf"));//
        pick.add(new Option("Half Orc"));//
        pick.add(new Halfling("Halfling"));
        pick.add(new Human("Human"));
        pick.add(new Tiefling("Tiefling"));

        //Exotic Lineages
        pick.add(new Option("Aarakocra"));
        pick.add(new Option("Aasimar"));
        pick.add(new Option("Changeling"));
        pick.add(new Option("Deep Gnome"));
        pick.add(new Option("Duergar"));
        pick.add(new Option("Eladrin"));
        pick.add(new Option("Fairy"));
        pick.add(new Option("Firbolg"));
        pick.add(new Option("Genasi (Air)"));
        pick.add(new Option("Genasi (Earth)"));
        pick.add(new Option("Genasi (Fire)"));
        pick.add(new Option("Genasi (Water)"));
        pick.add(new Option("Githyanki"));
        pick.add(new Option("Githzerai"));
        pick.add(new Option("Goliath"));
        pick.add(new Option("Harengon"));
        pick.add(new Option("Kenku"));
        pick.add(new Option("Locathah"));
        pick.add(new Option("Owlin"));
        pick.add(new Option("Satyr"));
        pick.add(new Option("Sea Elf"));
        pick.add(new Option("Shadar-Kai"));
        pick.add(new Option("Tabaxi"));
        pick.add(new Option("Tortle"));
        pick.add(new Option("Triton"));
        pick.add(new Option("Verdan"));

        //Monstrous Lineages
        pick.add(new Option("Bugbear"));
        pick.add(new Option("Centar"));
        pick.add(new Option("Goblin"));
        pick.add(new Option("Grung"));
        pick.add(new Option("Hobgoblin"));
        pick.add(new Option("Kobold"));
        pick.add(new Option("Lizardfolk"));
        pick.add(new Option("Minotaur"));
        pick.add(new Option("Orc"));
        pick.add(new Option("Shifter"));
        pick.add(new Option("Yuan-Ti"));

        Option a = Question.ask(pick, "Choose your race");
        list.add(a);

        return list;
    }
}
