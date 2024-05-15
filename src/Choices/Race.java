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
        pick.add(new Option("Arcania ('dandwiki')", true));
        pick.add(new Option("Archdemon ('dandwiki')", true));
        pick.add(new Option("Archdevil ('dandwiki')", true));
        pick.add(new Option("Ardan Uruks ('dandwiki')", true));
        pick.add(new Option("Ardragmon ('dandwiki')", true));
        pick.add(new Option("Argile ('dandwiki')", true));
        pick.add(new Option("Argonian ('dandwiki')", true));
        pick.add(new Option("Arkanos ('dandwiki')", true));
        pick.add(new Option("Armadillo-Kin ('dandwiki')", true));
        pick.add(new Option("Armordillo ('dandwiki')", true));
        pick.add(new Option("Arsenasite ('dandwiki')", true));
        pick.add(new Option("Artemian ('dandwiki')", true));
        pick.add(new Option("Asari ('dandwiki')", true));
        pick.add(new Option("Asera ('dandwiki')", true));
        pick.add(new Option("Ashlang ('dandwiki')", true));
        pick.add(new Option("Asoarix ('dandwiki')", true));
        pick.add(new Option("Asteri ('dandwiki')", true));
        pick.add(new Option("Astomi (Gangines) ('dandwiki')", true));
        pick.add(new Option("Astral Angels ('dandwiki')", true));
        pick.add(new Option("Astral Being ('dandwiki')", true));
        pick.add(new Option("Astéri ('dandwiki')", true));
        pick.add(new Option("Asura ('dandwiki')", true));
        pick.add(new Option("Asura, Guild Wars ('dandwiki')", true));
        pick.add(new Option("Athreki ('dandwiki')", true));
        pick.add(new Option("Atlantean ('dandwiki')", true));
        pick.add(new Option("Atrodr'rath ('dandwiki')", true));
        pick.add(new Option("Au'Ra ('dandwiki')", true));
        pick.add(new Option("Augmented Soldier ('dandwiki')", true));
        pick.add(new Option("Auren ('dandwiki')", true));
        pick.add(new Option("Aurochs ('dandwiki')", true));
        pick.add(new Option("Autiscribus ('dandwiki')", true));
        pick.add(new Option("Autokob ('dandwiki')", true));
        pick.add(new Option("Automaton ('dandwiki')", true));
        pick.add(new Option("Avali ('dandwiki')", true));
        pick.add(new Option("Avali, Variant ('dandwiki')", true));
        pick.add(new Option("Avariel ('dandwiki')", true));
        pick.add(new Option("Aven ('dandwiki')", true));
        pick.add(new Option("Avian ('dandwiki')", true));
        pick.add(new Option("Avian, Variant ('dandwiki')", true));
        pick.add(new Option("Avilus ('dandwiki')", true));
        pick.add(new Option("Avilus, ('dandwiki')", true));
        pick.add(new Option("Avion ('dandwiki')", true));
        pick.add(new Option("Awakened ('dandwiki')", true));
        pick.add(new Option("Awakened Aqua ('dandwiki')", true));
        pick.add(new Option("Awakened Bear ('dandwiki')", true));
        pick.add(new Option("Awakened Fennec ('dandwiki')", true));
        pick.add(new Option("Awakened Flame ('dandwiki')", true));
        pick.add(new Option("Awakened Owl Bear ('dandwiki')", true));
        pick.add(new Option("Awakened Plant ('dandwiki')", true));
        pick.add(new Option("Awakened Weird ('dandwiki')", true));
        pick.add(new Option("Awakened Zombie ('dandwiki')", true));
        pick.add(new Option("Axari ('dandwiki')", true));
        pick.add(new Option("Axolyte ('dandwiki')", true));
        pick.add(new Option("Axostome ('dandwiki')", true));
        pick.add(new Option("Azara ('dandwiki')", true));
        pick.add(new Option("Azer-Forged ('dandwiki')", true));
        pick.add(new Option("Azmari Lion ('dandwiki')", true));
        pick.add(new Option("Azure ('dandwiki')", true));
        pick.add(new Option("Badger Lord ('dandwiki')", true));
        pick.add(new Option("Badgerfolk ('dandwiki')", true));
        pick.add(new Option("Baeron ('dandwiki')", true));
        pick.add(new Option("Baketako ('dandwiki')", true));
        pick.add(new Option("Banette ('dandwiki')", true));
        pick.add(new Option("Bantam Fomorian ('dandwiki')", true));
        pick.add(new Option("Baphomeri ('dandwiki')", true));
        pick.add(new Option("Barakoa ('dandwiki')", true));
        pick.add(new Option("Barbed Devil ('dandwiki')", true));
        pick.add(new Option("Barghest ('dandwiki')", true));
        pick.add(new Option("Barghest, Variant ('dandwiki')", true));
        pick.add(new Option("Barken ('dandwiki')", true));
        pick.add(new Option("Basitin ('dandwiki')", true));
        pick.add(new Option("Bearkin ('dandwiki')", true));
        pick.add(new Option("Bearnaur ('dandwiki')", true));
        pick.add(new Option("Bearon ('dandwiki')", true));
        pick.add(new Option("Beast-Borne ('dandwiki')", true));
        pick.add(new Option("Beastkin ('dandwiki')", true));
        pick.add(new Option("Beastkin, Variant ('dandwiki')", true));
        pick.add(new Option("Beastmen ('dandwiki')", true));
        pick.add(new Option("Beeholder ('dandwiki')", true));
        pick.add(new Option("Behalfer ('dandwiki')", true));
        pick.add(new Option("Beheaded ('dandwiki')", true));
        pick.add(new Option("Beholderborn ('dandwiki')", true));
        pick.add(new Option("Beholdertouched ('dandwiki')", true));
        pick.add(new Option("Bestial Mutant ('dandwiki')", true));
        pick.add(new Option("Betrayed ('dandwiki')", true));
        pick.add(new Option("Birali ('dandwiki')", true));
        pick.add(new Option("Blaad' Os ('dandwiki')", true));
        pick.add(new Option("Black Blood Angel ('dandwiki')", true));
        pick.add(new Option("Black Eyes ('dandwiki')", true));
        pick.add(new Option("Black Pudding ('dandwiki')", true));
        pick.add(new Option("Blackheart ('dandwiki')", true));
        pick.add(new Option("Bladebeast ('dandwiki')", true));
        pick.add(new Option("Bladebound ('dandwiki')", true));
        pick.add(new Option("Bladeling ('dandwiki')", true));
        pick.add(new Option("Bladesh ('dandwiki')", true));
        pick.add(new Option("Blastborn ('dandwiki')", true));
        pick.add(new Option("Bleeko ('dandwiki')", true));
        pick.add(new Option("Blemmigan ('dandwiki')", true));
        pick.add(new Option("Blessed Automaton ('dandwiki')", true));
        pick.add(new Option("Blessed Narehate ('dandwiki')", true));
        pick.add(new Option("Blobgoblin ('dandwiki')", true));
        pick.add(new Option("Blood Angel ('dandwiki')", true));
        pick.add(new Option("Blood Angel, Variant ('dandwiki')", true));
        pick.add(new Option("Bloodborne ('dandwiki')", true));
        pick.add(new Option("Bloodclan Cat, Warrior Cat Edition ('dandwiki')", true));
        pick.add(new Option("Bloodied Fallen Angel ('dandwiki')", true));
        pick.add(new Option("Bloodraven ('dandwiki')", true));
        pick.add(new Option("Blossom Shifter ('dandwiki')", true));
        pick.add(new Option("Blue Bloods ('dandwiki')", true));
        pick.add(new Option("Blueveined ('dandwiki')", true));
        pick.add(new Option("Blugruim ('dandwiki')", true));
        pick.add(new Option("Boden ('dandwiki')", true));
        pick.add(new Option("Bombay Cat-Shifters ('dandwiki')", true));
        pick.add(new Option("Bonded ('dandwiki')", true));
        pick.add(new Option("Bone Splinter ('dandwiki')", true));
        pick.add(new Option("Bonthain ('dandwiki')", true));
        pick.add(new Option("Borosi ('dandwiki')", true));
        pick.add(new Option("Bossemer ('dandwiki')", true));
        pick.add(new Option("Bothan ('dandwiki')", true));
        pick.add(new Option("Bouffalor ('dandwiki')", true));
        pick.add(new Option("Branded ('dandwiki')", true));
        pick.add(new Option("Brazilian ('dandwiki')", true));
        pick.add(new Option("Breloom ('dandwiki')", true));
        pick.add(new Option("Breton ('dandwiki')", true));
        pick.add(new Option("Briar Skulk ('dandwiki')", true));
        pick.add(new Option("Brightmaid ('dandwiki')", true));
        pick.add(new Option("Brilrine ('dandwiki')", true));
        pick.add(new Option("Browl ('dandwiki')", true));
        pick.add(new Option("Brute ('dandwiki')", true));
        pick.add(new Option("Bugfolk ('dandwiki')", true));
        pick.add(new Option("Bularre ('dandwiki')", true));
        pick.add(new Option("Bulbon ('dandwiki')", true));
        pick.add(new Option("Bullywug ('dandwiki')", true));
        pick.add(new Option("Bunnyfolk ('dandwiki')", true));
        pick.add(new Option("Buttery Sprite ('dandwiki')", true));
        pick.add(new Option("Cactalfolk ('dandwiki')", true));
        pick.add(new Option("Cactian ('dandwiki')", true));
        pick.add(new Option("Calkan ('dandwiki')", true));
        pick.add(new Option("Callisto ('dandwiki')", true));
        pick.add(new Option("Cambíon ('dandwiki')", true));
        pick.add(new Option("Camelfolk ('dandwiki')", true));
        pick.add(new Option("Caminite ('dandwiki')", true));
        pick.add(new Option("Cancer ('dandwiki')", true));
        pick.add(new Option("Cancroid ('dandwiki')", true));
        pick.add(new Option("Candlefolk ('dandwiki')", true));
        pick.add(new Option("Candlehead ('dandwiki')", true));
        pick.add(new Option("Canegii ('dandwiki')", true));
        pick.add(new Option("Canibri ('dandwiki')", true));
        pick.add(new Option("Canicor ('dandwiki')", true));
        pick.add(new Option("Canilorian ('dandwiki')", true));
        pick.add(new Option("Canine Genus ('dandwiki')", true));
        pick.add(new Option("Caninus ('dandwiki')", true));
        pick.add(new Option("Canus ('dandwiki')", true));
        pick.add(new Option("Caoraa ('dandwiki')", true));
        pick.add(new Option("Capri ('dandwiki')", true));
        pick.add(new Option("Capricorn ('dandwiki')", true));
        pick.add(new Option("Caprin ('dandwiki')", true));
        pick.add(new Option("Carcharial ('dandwiki')", true));
        pick.add(new Option("Cartura ('dandwiki')", true));
        pick.add(new Option("Castoran ('dandwiki')", true));
        pick.add(new Option("Cat Sith ('dandwiki')", true));
        pick.add(new Option("Catfolk ('dandwiki')", true));
        pick.add(new Option("Cathartes ('dandwiki')", true));
        pick.add(new Option("Catkin ('dandwiki')", true));
        pick.add(new Option("Cattlean ('dandwiki')", true));
        pick.add(new Option("Cauzerauti ('dandwiki')", true));
        pick.add(new Option("Cecaelia ('dandwiki')", true));
        pick.add(new Option("Celestial, Lesser ('dandwiki')", true));
        pick.add(new Option("Celestus ('dandwiki')", true));
        pick.add(new Option("Cellmanaur ('dandwiki')", true));
        pick.add(new Option("Celt ('dandwiki')", true));
        pick.add(new Option("Centaur, Variant ('dandwiki')", true));
        pick.add(new Option("Centifolk, Variant ('dandwiki')", true));
        pick.add(new Option("Cerbren ('dandwiki')", true));
        pick.add(new Option("Cerean ('dandwiki')", true));
        pick.add(new Option("Cervitaur ('dandwiki')", true));
        pick.add(new Option("Chaik ('dandwiki')", true));
        pick.add(new Option("Chains of Heaven ('dandwiki')", true));
        pick.add(new Option("Chamasin ('dandwiki')", true));
        pick.add(new Option("Changeling (variant 1.0) ('dandwiki')", true));
        pick.add(new Option("Changeling, 2nd Variant ('dandwiki')", true));
        pick.add(new Option("Changeling, 3rd Variant ('dandwiki')", true));
        pick.add(new Option("Changeling, 6th Variant ('dandwiki')", true));
        pick.add(new Option("Changeling, 7th Variant ('dandwiki')", true));
        pick.add(new Option("Changeling, Variant ('dandwiki')", true));
        pick.add(new Option("Chao ('dandwiki')", true));
        pick.add(new Option("Chaos-Born ('dandwiki')", true));
        pick.add(new Option("Chaosborn ('dandwiki')", true));
        pick.add(new Option("Charr ('dandwiki')", true));
        pick.add(new Option("Charr, Variant ('dandwiki')", true));
        pick.add(new Option("Cheliceri ('dandwiki')", true));
        pick.add(new Option("Cheox ('dandwiki')", true));
        pick.add(new Option("Cheshire Cat ('dandwiki')", true));
        pick.add(new Option("Cheshire Cat, Humanoid ('dandwiki')", true));
        pick.add(new Option("Chibido ('dandwiki')", true));
        pick.add(new Option("Chimera ('dandwiki')", true));
        pick.add(new Option("Chimeran ('dandwiki')", true));
        pick.add(new Option("Chimeroth ('dandwiki')", true));
        pick.add(new Option("Chiropterans ('dandwiki')", true));
        pick.add(new Option("Chiss ('dandwiki')", true));
        pick.add(new Option("Chitine ('dandwiki')", true));
        pick.add(new Option("Chitinoid ('dandwiki')", true));
        pick.add(new Option("Chosen Undead, Variant ('dandwiki')", true));
        pick.add(new Option("Chthonic Vampyre ('dandwiki')", true));
        pick.add(new Option("Chwinga ('dandwiki')", true));
        pick.add(new Option("Cijelese ('dandwiki')", true));
        pick.add(new Option("Clabber	Half-Mimics, ('dandwiki')", true));
        pick.add(new Option("Clamantes Hostia ('dandwiki')", true));
        pick.add(new Option("Clan Cat, Warrior Cat Edition ('dandwiki')", true));
        pick.add(new Option("Claustronoctiling ('dandwiki')", true));
        pick.add(new Option("Clawfolk ('dandwiki')", true));
        pick.add(new Option("Cleansed Blight ('dandwiki')", true));
        pick.add(new Option("Clockwork ('dandwiki')", true));
        pick.add(new Option("Clockwork Man ('dandwiki')", true));
        pick.add(new Option("Cloned Human ('dandwiki')", true));
        pick.add(new Option("Cloudshifter ('dandwiki')", true));
        pick.add(new Option("Clown ('dandwiki')", true));
        pick.add(new Option("Clown, Variant ('dandwiki')", true));
        pick.add(new Option("Clugs ('dandwiki')", true));
        pick.add(new Option("Cnámhrûh ('dandwiki')", true));
        pick.add(new Option("Cofagrigus ('dandwiki')", true));
        pick.add(new Option("Coldskin ('dandwiki')", true));
        pick.add(new Option("Coldskin, Variant ('dandwiki')", true));
        pick.add(new Option("Coldvein ('dandwiki')", true));
        pick.add(new Option("Coleoptera ('dandwiki')", true));
        pick.add(new Option("Colowred ('dandwiki')", true));
        pick.add(new Option("Concubus ('dandwiki')", true));
        pick.add(new Option("Console Patron Unit ('dandwiki')", true));
        pick.add(new Option("Convel ('dandwiki')", true));
        pick.add(new Option("Corado ('dandwiki')", true));
        pick.add(new Option("Core Conscience ('dandwiki')", true));
        pick.add(new Option("Corebot ('dandwiki')", true));
        pick.add(new Option("CoreKin ('dandwiki')", true));
        pick.add(new Option("Corivilus ('dandwiki')", true));
        pick.add(new Option("Cornerian ('dandwiki')", true));
        pick.add(new Option("Corodont ('dandwiki')", true));
        pick.add(new Option("Corollin ('dandwiki')", true));
        pick.add(new Option("Corrupted ('dandwiki')", true));
        pick.add(new Option("Corrupted Weapon ('dandwiki')", true));
        pick.add(new Option("Cosmalog ('dandwiki')", true));
        pick.add(new Option("Cosmic Elf ('dandwiki')", true));
        pick.add(new Option("Cosmic Nychdrake ('dandwiki')", true));
        pick.add(new Option("Couatl ('dandwiki')", true));
        pick.add(new Option("Cowfolk ('dandwiki')", true));
        pick.add(new Option("Coyouin ('dandwiki')", true));
        pick.add(new Option("Coyouin Fourfooter ('dandwiki')", true));
        pick.add(new Option("Crabfolk ('dandwiki')", true));
        pick.add(new Option("Cragfar ('dandwiki')", true));
        pick.add(new Option("Crimson Demon ('dandwiki')", true));
        pick.add(new Option("Critterfolk ('dandwiki')", true));
        pick.add(new Option("Croagunk ('dandwiki')", true));
        pick.add(new Option("Crocodilian ('dandwiki')", true));
        pick.add(new Option("Crossbreed ('dandwiki')", true));
        pick.add(new Option("Crustacheae ('dandwiki')", true));
        pick.add(new Option("Cryslesian ('dandwiki')", true));
        pick.add(new Option("Crystal Elf, Variant ('dandwiki')", true));
        pick.add(new Option("Crystal Gems ('dandwiki')", true));
        pick.add(new Option("Cursed of the Abyss ('dandwiki')", true));
        pick.add(new Option("Cursed Oni ('dandwiki')", true));
        pick.add(new Option("Cursedion ('dandwiki')", true));
        pick.add(new Option("Cutebold ('dandwiki')", true));
        pick.add(new Option("Cy'kn ('dandwiki')", true));
        pick.add(new Option("Cyborg ('dandwiki')", true));
        pick.add(new Option("Cyclops ('dandwiki')", true));
        pick.add(new Option("Cyclops, Variant ('dandwiki')", true));


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
