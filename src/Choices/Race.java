package src.Choices;

import src.Choice;
import src.Option;
import src.Options.Races.*;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

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
        pick.add(new Subchoice("Half Orc", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option("Standard Half Orc"),
                new Option("Mark of Finding (Eberron)")
        ))))));//
        pick.add(new Halfling("Halfling"));//
        pick.add(new Human("Human"));//
        pick.add(new Tiefling("Tiefling"));//

        //Exotic Lineages
        pick.add(new DualSource("Aarakocra", "Mordenkainen's Aarakocra (Aarakocra)","Elemental Evil's Aarakocra (Aarakocra)"));//
        pick.add(new Aasimar("Aasimar"));//
        pick.add(new DualSource("Changeling", "Mordenkainen's Changeling (Changeling)","Eberron's Changeling (Changeling)"));//
        pick.add(new DualSource("Deep Gnome", "Mordenkainen's Deep Gnome (Deep Gnome)","Elemental Evil's Deep Gnome (Deep Gnome)"));//
        pick.add(new DualSource("Duergar", "Mordenkainen's Duergar (Duergar)","SCAG's Duergar (Duergar)"));//
        pick.add(new Eladrin("Eladrin"));//
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
        pick.add(new Option("Bugbear"));//
        pick.add(new DualSource("Centar", "Mordenkainen's Centar (Centar)","Ravnica's Centar / Theros's Centar (Centar)"));//
        pick.add(new Option("Goblin"));//
        pick.add(new Option("Grung"));//
        pick.add(new DualSource("Hobgoblin", "Mordenkainen's Hobgoblin (Hobgoblin)","Volo's Hobgoblin (Hobgoblin)"));//
        pick.add(new Kobold("Kobold"));//
        pick.add(new DualSource("Lizardfolk", "Mordenkainen's Lizardfolk (Lizardfolk)","Volo's Lizardfolk (Lizardfolk)"));//
        pick.add(new DualSource("Minotaur", "Mordenkainen's Minotaur (Minotaur)","Ravnica's Minotaur / Theros's Minotaur (Minotaur)"));//
        pick.add(new DualSource("Orc", "Mordenkainen's Orc (Orc)","Volo's Orc / Eberron's Orc / Wildemount's Orc (Orc)"));//
        pick.add(new Shifter("Shifter"));//
        pick.add(new DualSource("Yuan-Ti", "Mordenkainen's Yuan-Ti (Yuan-Ti)","Volo's Yuan-Ti (Yuan-Ti)"));//

        //UA
        pick.add(new Option("Kender (Dragonlance)", true, false));
        pick.add(new Option("Kalashtar (Eberron)", true, false));
        pick.add(new Option("Warforged (Eberron)", true, false));
        pick.add(new Option("Aetherborn (Plane Shift)", true, false));
        pick.add(new Option("Aven (Plane Shift)", true, false));
        pick.add(new Option("Khenra (Plane Shift)", true, false));
        pick.add(new Option("Kor (Plane Shift)", true, false));
        pick.add(new Option("Merfolk (Plane Shift)", true, false));
        pick.add(new Option("Naga (Plane Shift)", true, false));
        pick.add(new Option("Siren (Plane Shift)", true, false));
        pick.add(new Option("Vampire (Plane Shift)", true, false));
        pick.add(new Option("Dhamphir (Ravenloft)", true, false));
        pick.add(new Option("Hexblood (Ravenloft)", true, false));
        pick.add(new Option("Reborn (Ravenloft)", true, false));
        pick.add(new Option("Loxodon (Ravnica)", true, false));
        pick.add(new Option("Simic Hybrid (Ravnica)", true, false));
        pick.add(new Option("Vedalken (Ravnica)", true, false));
        pick.add(new Option("Astral Elf (Spelljammer)", true, false));
        pick.add(new Option("Autognome (Spelljammer)", true, false));
        pick.add(new Option("Giff (Spelljammer)", true, false));
        pick.add(new Option("Hadozee (Spelljammer)", true, false));
        pick.add(new Option("Plasmoid (Spelljammer)", true, false));
        pick.add(new Option("Thri-kreen (Spelljammer)", true, false));
        pick.add(new Option("Leonin (Theros)", true, false));
        pick.add(new Option("Aarongar ('dandwiki')", true));
        pick.add(new Option("Alraune ('dandwiki')", true));
        pick.add(new Option("Celtic Born ('dandwiki')", true));
        pick.add(new Option("Earth Giant ('dandwiki')", true));
        pick.add(new Option("Embodied Mouther ('dandwiki')", true));
        pick.add(new Option("Nocturne ('dandwiki')", true));
        pick.add(new Option("Sobruaro ('dandwiki')", true));
        pick.add(new Option("Abdelian ('dandwiki')", true));
        pick.add(new Option("Aberrant Hybrid ('dandwiki')", true));
        pick.add(new Option("Abstraction ('dandwiki')", true));
        pick.add(new Option("Abyssal Minotaur ('dandwiki')", true));
        pick.add(new Option("Abyzou ('dandwiki')", true));
        pick.add(new Option("Acanthian ('dandwiki')", true));
        pick.add(new Option("Aeldari ('dandwiki')", true));
        pick.add(new Option("Aeris ('dandwiki')", true));
        pick.add(new Option("Aethelf ('dandwiki')", true));
        pick.add(new Option("Aethen ('dandwiki')", true));
        pick.add(new Option("Aetherborn ('dandwiki')", true));
        pick.add(new Option("Aggrand ('dandwiki')", true));
        pick.add(new Option("Ailuran ('dandwiki')", true));
        pick.add(new Option("Airrans ('dandwiki')", true));
        pick.add(new Option("Akatalian ('dandwiki')", true));
        pick.add(new Option("Albertine ('dandwiki')", true));
        pick.add(new Option("Albino Gnoll ('dandwiki')", true));
        pick.add(new Option("Ali'di ('dandwiki')", true));
        pick.add(new Option("Alien Grey ('dandwiki')", true));
        pick.add(new Option("Aligotarian ('dandwiki')", true));
        pick.add(new Option("Aligrine ('dandwiki')", true));
        pick.add(new Option("Alleozsa ('dandwiki')", true));
        pick.add(new Option("Alloprax ('dandwiki')", true));
        pick.add(new Option("Aloii ('dandwiki')", true));
        pick.add(new Option("Aloii, 2nd Variant ('dandwiki')", true));
        pick.add(new Option("Alterran ('dandwiki')", true));
        pick.add(new Option("Altine ('dandwiki')", true));
        pick.add(new Option("Alu-Demon ('dandwiki')", true));
        pick.add(new Option("Alu-Fiend ('dandwiki')", true));
        pick.add(new Option("Alverae ('dandwiki')", true));
        pick.add(new Option("Amaltel ('dandwiki')", true));
        pick.add(new Option("Amanel ('dandwiki')", true));
        pick.add(new Option("Amazon ('dandwiki')", true));
        pick.add(new Option("Amazon, Variant ('dandwiki')", true));
        pick.add(new Option("Amazonia ('dandwiki')", true));
        pick.add(new Option("Amazonian ('dandwiki')", true));
        pick.add(new Option("Ambis ('dandwiki')", true));
        pick.add(new Option("Ambun ('dandwiki')", true));
        pick.add(new Option("Amphibimen ('dandwiki')", true));
        pick.add(new Option("Amused ('dandwiki')", true));
        pick.add(new Option("Anamesa ('dandwiki')", true));
        pick.add(new Option("Anani ('dandwiki')", true));
        pick.add(new Option("Anansi ('dandwiki')", true));
        pick.add(new Option("Anathema ('dandwiki')", true));
        pick.add(new Option("Anathema, Rebalanced ('dandwiki')", true));
        pick.add(new Option("Ancient Cat, Warrior Cat Edition ('dandwiki')", true));
        pick.add(new Option("Angel ('dandwiki')", true));
        pick.add(new Option("Angel of Death ('dandwiki')", true));
        pick.add(new Option("Angel, Variant ('dandwiki')", true));
        pick.add(new Option("Angelic Succubus ('dandwiki')", true));
        pick.add(new Option("Angiospate ('dandwiki')", true));
        pick.add(new Option("Animated Armor ('dandwiki')", true));
        pick.add(new Option("Anime Dragonborn ('dandwiki')", true));
        pick.add(new Option("Annablax ('dandwiki')", true));
        pick.add(new Option("Anomaly ('dandwiki')", true));
        pick.add(new Option("Anouki ('dandwiki')", true));
        pick.add(new Option("Antaeud ('dandwiki')", true));
        pick.add(new Option("Anthesi ('dandwiki')", true));
        pick.add(new Option("Anthousai ('dandwiki')", true));
        pick.add(new Option("Anthro Humans ('dandwiki')", true));
        pick.add(new Option("Anthrolupe ('dandwiki')", true));
        pick.add(new Option("Anthropomorphic Fish ('dandwiki')", true));
        pick.add(new Option("Antilonoid ('dandwiki')", true));
        pick.add(new Option("Anubian ('dandwiki')", true));
        pick.add(new Option("Anuran ('dandwiki')", true));
        pick.add(new Option("Anutanin ('dandwiki')", true));
        pick.add(new Option("Apeling ('dandwiki')", true));
        pick.add(new Option("Aphrodian ('dandwiki')", true));
        pick.add(new Option("Apidites ('dandwiki')", true));
        pick.add(new Option("Apoidea ('dandwiki')", true));
        pick.add(new Option("Apothicon ('dandwiki')", true));
        pick.add(new Option("Appoplexian ('dandwiki')", true));
        pick.add(new Option("Aquaebant ('dandwiki')", true));
        pick.add(new Option("Aquarion ('dandwiki')", true));
        pick.add(new Option("Aquarius ('dandwiki')", true));
        pick.add(new Option("Aracae ('dandwiki')", true));
        pick.add(new Option("Arachne ('dandwiki')", true));
        pick.add(new Option("Arachnian ('dandwiki')", true));
        pick.add(new Option("Aracoi ('dandwiki')", true));
        pick.add(new Option("Aramatian ('dandwiki')", true));
        pick.add(new Option("Arangran ('dandwiki')", true));
        pick.add(new Option("Arboren ('dandwiki')", true));
        pick.add(new Option("Arborial ('dandwiki')", true));
        pick.add(new Option("Arcabe Vanpyr ('dandwiki')", true));
        pick.add(new Option("Arcaedia ('dandwiki')", true));
        pick.add(new Option("Arcane Forger ('dandwiki')", true));
        pick.add(new Option("Arcane Vampire ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));
        pick.add(new Option(" ('dandwiki')", true));

        //Randomizer probiblity modification
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
            pick.add(new Kobold("Kobold"));
        }

        Option a = Question.ask(pick, "Choose your race");
        list.add(a);

        return list;
    }
}
