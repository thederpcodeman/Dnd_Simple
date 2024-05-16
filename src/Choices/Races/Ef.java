package src.Choices.Races;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class Ef extends Choice {
    public Ef(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("High Elf (Elf)"));
        pick.add(new Option("Wood Elf (Elf)"));
        pick.add(new Option("Dark Elf (Elf)"));
        pick.add(new Option("Pallid Elf (Wildemount) (Elf)", true, false));
        pick.add(new Option("Mark of Shadow (Eberron) (Elf)", true, false));
        pick.add(new Option("Bishtahar/Tirahar Elf (Plane Shift: Kaladesh) (Elf)", true, false));
        pick.add(new Option("Vahadar Elf (Plane Shift: Kaladesh) (Elf)", true, false));
        pick.add(new Subchoice("Plane Shift: Zendikar (Elf)", new ArrayList<ArrayList<Option>>(Arrays.asList(new ArrayList<Option>(Arrays.asList(
                new Option("Tajuru"),
                new Option("Juraga"),
                new Option("Mul Daya")
        )))), true, false));
        pick.add(new Option("Avariel Elf (Elf)", true, false));
        pick.add(new Option("Gurgach Elf (Greyhawk) (Elf)", true, false));
        pick.add(new Option("Aereni ('dandwiki')(Elf)", true));
        pick.add(new Option("Andresin ('dandwiki')(Elf)", true));
        pick.add(new Option("Aos Si ('dandwiki')(Elf)", true));
        pick.add(new Option("Arctic Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Avareni ('dandwiki')(Elf)", true));
        pick.add(new Option("Avariel ('dandwiki')(Elf)", true));
        pick.add(new Option("Averene Dragon Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Beach Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Blood Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Blood Elf, 2nd Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Blood Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Brobdingnagian Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Celestial Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Cosmic Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Cosmo-Blessed Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Crick Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Crimson Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Crimson Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Crystal Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Crystaline ('dandwiki')(Elf)", true));
        pick.add(new Option("Desert Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Dragon Child ('dandwiki')(Elf)", true));
        pick.add(new Option("Dragon Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Drakelf ('dandwiki')(Elf)", true));
        pick.add(new Option("Dunmer ('dandwiki')(Elf)", true));
        pick.add(new Option("Dust Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Døkkálfr ('dandwiki')(Elf)", true));
        pick.add(new Option("Elf, Science Fantasy ('dandwiki')(Elf)", true));
        pick.add(new Option("Exocoetidae ('dandwiki')(Elf)", true));
        pick.add(new Option("Fell Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Fell Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Fire Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Fortuna Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Frost Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Frozen Shadow Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Gelf ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Celestial ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Draconic ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Dragon ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Dwarven ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Fiendish ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Genasi ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Gnomish ('dandwiki')(Elf)", true));
        pick.add(new Option("Half-Orcish ('dandwiki')(Elf)", true));
        pick.add(new Option("Halfling ('dandwiki')(Elf)", true));
        pick.add(new Option("High Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Holy Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Horselord Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Ice Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Jing Ling Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Karpalima Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Kitsune-Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Kor ('dandwiki')(Elf)", true));
        pick.add(new Option("Light Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Lord Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Lunar Drow ('dandwiki')(Elf)", true));
        pick.add(new Option("Lythari ('dandwiki')(Elf)", true));
        pick.add(new Option("Maledictus Dryadalis ('dandwiki')(Elf)", true));
        pick.add(new Option("Moon Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Moon Fae ('dandwiki')(Elf)", true));
        pick.add(new Option("Muddle Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Night Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Nightborne ('dandwiki')(Elf)", true));
        pick.add(new Option("Ormr Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Pact Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Quenya ('dandwiki')(Elf)", true));
        pick.add(new Option("Reformed Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Rift Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Sainted ('dandwiki')(Elf)", true));
        pick.add(new Option("Sea Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Sen Ath Tel' drii ('dandwiki')(Elf)", true));
        pick.add(new Option("Shadar-Kai, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Shade Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Shadow Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Shemeife ('dandwiki')(Elf)", true));
        pick.add(new Option("Shyling Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Silver Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Sin'dorei ('dandwiki')(Elf)", true));
        pick.add(new Option("Snow Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Snow Elf, 2nd Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Snow Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Solstice Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Spectral Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Spellburnt Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Star Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Succubus Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Sun Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Sunfire Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Survivor ('dandwiki')(Elf)", true));
        pick.add(new Option("Swamp Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Szarkai ('dandwiki')(Elf)", true));
        pick.add(new Option("Terrados Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Urban Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Valan Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Wild Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Winged Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Winter Elf ('dandwiki')(Elf)", true));
        pick.add(new Option("Winter Elf, 2nd Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Winter Elf, Variant ('dandwiki')(Elf)", true));
        pick.add(new Option("Zombie ('dandwiki')(Elf)", true));
        Option a = Question.ask(pick, "Choose your Subrace");
        list.add(a);


        return list;
    }
}

