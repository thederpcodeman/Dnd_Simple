package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class DrdSub extends Choice {
    public DrdSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Dreams (Druid)"));//
        pick.add(new Subchoice("Land (Druid)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option ("Arctic (Land)"),
                new Option ("Coast (Land)"),
                new Option ("Desert (Land)"),
                new Option ("Forest (Land)"),
                new Option ("Grassland (Land)"),
                new Option ("Mountain (Land)"),
                new Option ("Swamp (Land)"),
                new Option ("Underdark (Land)")))))));
        pick.add(new Option("Moon (Druid)"));//
        pick.add(new Option("Shepard (Druid)"));//
        pick.add(new Option("Spores (Druid)"));//
        pick.add(new Option("Stars (Druid)"));//
        pick.add(new Option("Wildfire (Druid)"));//
        pick.add(new Option("Primeval (Druid)", true, false));//
        pick.add(new Option("The Blighted ('Tal'Dorei Campaign Setting Reborn') (Druid)", false, true));//
        pick.add(new Option("The Forged ('Exploring Eberron') (Druid)", false, true));//

        pick.add(new Option("Air Elemental Warrior, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Avengers Sect ('dandwiki')(Druid)", true));
        pick.add(new Option("Beast Walker Druid ('dandwiki')(Druid)", true));
        pick.add(new Option("Brother of Wolves ('dandwiki')(Druid)", true));
        pick.add(new Option("Chaos Pyromancy ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Anathema ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Anathema, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Animal Companionship ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Animals ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Ash ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Beasts ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Birds and Beasts ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Bubbles ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Chaos ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Constellations ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Dominance ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Dragons ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Dragons, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Fae ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Fae Trickster ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Faezres ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Graveyards ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Hunger ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Iron ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Ley ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Life ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Lycanthropy ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Masks ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Monsters ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Moon, 2023 Movie Edition ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Moths ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Mutation ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Nature ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Oozes ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Plants ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Prehistoric Ferocity ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Rage ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Rainbows ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Reincarnation ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Reptiles ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Rodents ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Roots ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Rot ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Rot, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Savagery (Malar) ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Science ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Serpent ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Shades ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Solitude ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Spiders ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Spirits ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Spores, Second Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Spores, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Stars, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Steel ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Steeping ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Avenger ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Barrel ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Beast ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Bloodmoon ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Blue Mage ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Caverns ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the City ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Claw ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Clock ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Clock Legacy ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Dragonshifter ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Duplicate ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Elemental Warrior ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Elements ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Feather ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Fey ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the First Forest ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Fittest ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Force ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Forest ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Fountain ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Four Winds Druid ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Furies ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Gorgon ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Harvest ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Healer ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Healing Waves ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the High Sea ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Hunt ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Long Winter ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Moon, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Mother ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the New Moon ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Noble Beast ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Pack ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Pack, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Path ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Pillars of the Earth ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of The Primal ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Primeval, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Reaper ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Ringmaster ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Seasons ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Shepherd, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Soil ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Solar Crest ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Subtle Realm ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Summoner ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Sun ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Sunken ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Swarm ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Swarm, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Sword ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Torn Veil ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Traveler ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Veil ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Voice ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Void ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Web Walkers ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Wildlife ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Winds ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Wood ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of the Woodshaper ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Twilight, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Vengeance ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of War ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Warshapers ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Waves ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Wild Magic ('dandwiki')(Druid)", true));
        pick.add(new Option("Circle of Wildfighters ('dandwiki')(Druid)", true));
        pick.add(new Option("Earth Elemental Warrior ('dandwiki')(Druid)", true));
        pick.add(new Option("Earthfeeler ('dandwiki')(Druid)", true));
        pick.add(new Option("Fire Born ('dandwiki')(Druid)", true));
        pick.add(new Option("Nature's Champion ('dandwiki')(Druid)", true));
        pick.add(new Option("Necrotic Circle ('dandwiki')(Druid)", true));
        pick.add(new Option("Prehistoric Circle ('dandwiki')(Druid)", true));
        pick.add(new Option("Prehistoric Circle, Variant ('dandwiki')(Druid)", true));
        pick.add(new Option("Shamanism ('dandwiki')(Druid)", true));
        pick.add(new Option("Wu Wei Master ('dandwiki')(Druid)", true));
        Option a = Question.ask(pick, "Choose your Druid Circle");
        list.add(a);


        return list;
    }
}

