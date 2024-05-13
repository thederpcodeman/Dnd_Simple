package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class ArtSub  extends Choice {
    public ArtSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Alchemist (Artificer)"));//
        pick.add(new Option("Armorer (Artificer)"));//
        pick.add(new Option("Artillerist (Artificer)"));//
        pick.add(new Option("Battle Smith (Artificer)"));//
        pick.add(new Option("Forge Adept ('Exploring Eberron') (Artificer)", false, true));//
        pick.add(new Option("Mastermaker ('Dread Metrol') (Artificer)", false, true));//
        pick.add(new Option("Maverick ('Exploring Eberron') (Artificer)", false, true));//
        pick.add(new Option("Alchemical Toxicologist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Animator ('dandwiki')(Artificer)", true));
        pick.add(new Option("Arcane Artist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Arcane Cannoneer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Arcane Craftsman ('dandwiki')(Artificer)", true));
        pick.add(new Option("Armorsmith ('dandwiki')(Artificer)", true));
        pick.add(new Option("Arsonist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Artillurgist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Augumented ('dandwiki')(Artificer)", true));
        pick.add(new Option("Author ('dandwiki')(Artificer)", true));
        pick.add(new Option("Auto-Mechanic ('dandwiki')(Artificer)", true));
        pick.add(new Option("Battle Engineer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Biomechanist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Bomber ('dandwiki')(Artificer)", true));
        pick.add(new Option("Bonesmith ('dandwiki')(Artificer)", true));
        pick.add(new Option("Calligrapher ('dandwiki')(Artificer)", true));
        pick.add(new Option("Camera Operator ('dandwiki')(Artificer)", true));
        pick.add(new Option("Cartographer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Chrono-Manipulator ('dandwiki')(Artificer)", true));
        pick.add(new Option("Concocter ('dandwiki')(Artificer)", true));
        pick.add(new Option("Conduit ('dandwiki')(Artificer)", true));
        pick.add(new Option("Coriumancer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Demolitionist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Demolitionist, 2nd Variant ('dandwiki')(Artificer)", true));
        pick.add(new Option("Demolitionist, Variant ('dandwiki')(Artificer)", true));
        pick.add(new Option("Drone Carrier ('dandwiki')(Artificer)", true));
        pick.add(new Option("Dynamo ('dandwiki')(Artificer)", true));
        pick.add(new Option("Elemental Conduit ('dandwiki')(Artificer)", true));
        pick.add(new Option("Flesh-Forger ('dandwiki')(Artificer)", true));
        pick.add(new Option("Fusilier ('dandwiki')(Artificer)", true));
        pick.add(new Option("Gemwright ('dandwiki')(Artificer)", true));
        pick.add(new Option("Gravity Arcanist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Gunsmith ('dandwiki')(Artificer)", true));
        pick.add(new Option("Gunsmith, Variant ('dandwiki')(Artificer)", true));
        pick.add(new Option("Jammer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Jeweler ('dandwiki')(Artificer)", true));
        pick.add(new Option("Kaboomer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Master Enchanter ('dandwiki')(Artificer)", true));
        pick.add(new Option("Maverick, Variant ('dandwiki')(Artificer)", true));
        pick.add(new Option("Mech Pilot ('dandwiki')(Artificer)", true));
        pick.add(new Option("Mechanist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Mechanized Engineer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Miniaturizer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Monster Catcher ('dandwiki')(Artificer)", true));
        pick.add(new Option("Nora Stitcher ('dandwiki')(Artificer)", true));
        pick.add(new Option("Oseram Weaponsmith ('dandwiki')(Artificer)", true));
        pick.add(new Option("Reinforcer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Ruin Smith ('dandwiki')(Artificer)", true));
        pick.add(new Option("Rune Scribe ('dandwiki')(Artificer)", true));
        pick.add(new Option("Rune Smith ('dandwiki')(Artificer)", true));
        pick.add(new Option("Siege Breaker ('dandwiki')(Artificer)", true));
        pick.add(new Option("Spellsword Crafter ('dandwiki')(Artificer)", true));
        pick.add(new Option("Stylist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Swiftcrafter ('dandwiki')(Artificer)", true));
        pick.add(new Option("The Tattoo Artist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Thunder Monger Artificer ('dandwiki')(Artificer)", true));
        pick.add(new Option("Time Traveler ('dandwiki')(Artificer)", true));
        pick.add(new Option("Vehicleist ('dandwiki')(Artificer)", true));
        pick.add(new Option("Warpsmith ('dandwiki')(Artificer)", true));
        pick.add(new Option("Watchmaker ('dandwiki')(Artificer)", true));
        pick.add(new Option("Weapon Shifter ('dandwiki')(Artificer)", true));

        Option a = Question.ask(pick, "Choose your Artificer Specialty");
        list.add(a);


        return list;
    }
}

