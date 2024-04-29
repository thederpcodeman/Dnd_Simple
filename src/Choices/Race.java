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
        pick.add(new Halfling("Halfling"));//
        pick.add(new Human("Human"));//
        pick.add(new Tiefling("Tiefling"));//

        //Exotic Lineages
        pick.add(new DualSource("Aarakocra", "Mordenkainen's Aarakocra (Aarakocra)","Elemental Evil's Aarakocra (Aarakocra)"));//
        pick.add(new Option("Aasimar"));
        pick.add(new DualSource("Changeling", "Mordenkainen's Changeling (Changeling)","Eberron's Changeling (Changeling)"));//
        pick.add(new DualSource("Deep Gnome", "Mordenkainen's Deep Gnome (Deep Gnome)","Elemental Evil's Deep Gnome (Deep Gnome)"));//
        pick.add(new DualSource("Duergar", "Mordenkainen's Duergar (Duergar)","SCAG's Duergar (Duergar)"));//
        pick.add(new Option("Eladrin"));
        pick.add(new Option("Fairy"));//
        pick.add(new DualSource("Firbolg", "Mordenkainen's Firbolg (Firbolg)","Volo's Firbolg (Firbolg)"));//
        pick.add(new DualSource("Genasi (Air)", "Mordenkainen's Air Genasi (Air Genasi)","Elemental Evil's Air Genasi (Air Genasi)"));//
        pick.add(new DualSource("Genasi (Earth)", "Mordenkainen's Earth Genasi (Earth Genasi)","Elemental Evil's Earth Genasi (Earth Genasi)"));//
        pick.add(new DualSource("Genasi (Fire)", "Mordenkainen's Fire Genasi (Fire Genasi)","Elemental Evil's Fire Genasi (Fire Genasi)"));//
        pick.add(new DualSource("Genasi (Water)", "Mordenkainen's Water Genasi (Water Genasi)","Elemental Evil's Water Genasi (Water Genasi)"));//
        pick.add(new DualSource("Githyanki", "Monsters of the Multiverse's Githyanki (Githyanki)","Tome of Foes's Githyanki (Githyanki)"));//
        pick.add(new DualSource("Githzerai", "Monsters of the Multiverse's Githzerai (Githzerai)","Tome of Foes's Githzerai (Githzerai)"));//
        pick.add(new DualSource("Goliath", "Mordenkainen's Goliath (Goliath)","Elemental Evil's Goliath (Goliath)"));//
        pick.add(new Option("Harengon"));//
        pick.add(new DualSource("Kenku", "Mordenkainen's Kenku (Kenku)","Volo's Kenku (Kenku)"));//
        pick.add(new Option("Locathah"));//
        pick.add(new Option("Owlin"));//
        pick.add(new DualSource("Satyr", "Mordenkainen's Satyr (Satyr)","Theros's Satyr (Satyr)"));//
        pick.add(new DualSource("Sea Elf", "Monsters of the Multiverse's Sea Elf (Sea Elf)","Tome of Foes's Sea Elf (Sea Elf)"));//
        pick.add(new DualSource("Shadar-Kai", "Monsters of the Multiverse's Shadar-Kai (Shadar-Kai)","Tome of Foes's Shadar-Kai (Shadar-Kai)"));//
        pick.add(new DualSource("Tabaxi", "Mordenkainen's Tabaxi (Tabaxi)","Volo's Tabaxi (Tabaxi)"));//
        pick.add(new DualSource("Tortle", "Mordenkainen's Tortle (Tortle)","Tortle's Tortle, Tortle Squared if you will (Tortle)"));//
        pick.add(new DualSource("Triton", "Mordenkainen's Triton (Triton)","Volo's Triton (Triton)"));//
        pick.add(new Option("Verdan"));//

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

        //Randomizer probiblity mod
        if (Question.rand){
            pick.add(new Dragonborn("Dragonborn"));
            pick.add(new Dwarf("Dwarf"));
            pick.add(new Elf("Elf"));
            pick.add(new Gnome("Gnome"));
            pick.add(new HalfElf("Half Elf"));
            pick.add(new Option("Half Orc"));
            pick.add(new Halfling("Halfling"));
            pick.add(new Human("Human"));
            pick.add(new Human("Human"));
            pick.add(new Tiefling("Tiefling"));
        }

        Option a = Question.ask(pick, "Choose your race");
        list.add(a);

        return list;
    }
}
