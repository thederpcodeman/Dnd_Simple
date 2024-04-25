package src.Choices;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class Background extends Choice {
    public Background(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Acolyte"));
        pick.add(new Option("Anthropologist"));
        pick.add(new Option("Archaeologist"));
        pick.add(new Option("Charlatan"));
        pick.add(new Option("City Watch"));
        pick.add(new Option("Clan Crafter"));
        pick.add(new Option("Cloistered Scholar"));
        pick.add(new Option("Courtier"));
        pick.add(new Option("Criminal"));
        pick.add(new Option("Entertainer"));
        pick.add(new Option("Faceless"));
        pick.add(new Option("Faction Agent"));
        pick.add(new Option("Far Traveler"));
        pick.add(new Option("Fisher"));
        pick.add(new Option("Folk Hero"));
        pick.add(new Option("Giant Foundling"));
        pick.add(new Option("Gladiator"));
        pick.add(new Option("Guild Artisan"));
        pick.add(new Option("Guild Merchant"));
        pick.add(new Option("Haunted One"));
        pick.add(new Option("Hermit"));
        pick.add(new Option("House Agent"));
        pick.add(new Option("Inheritor"));
        pick.add(new Option("Investigator (VRGR)"));
        pick.add(new Option("Knight of the Order"));
        pick.add(new Option("Marine"));
        pick.add(new Option("Mercenary Veteran"));
        pick.add(new Option("Noble"));
        pick.add(new Option("Outlander"));
        pick.add(new Option("Pirate"));
        pick.add(new Option("Rewarded"));
        pick.add(new Option("Ruined"));
        pick.add(new Option("Rune Carver"));
        pick.add(new Option("Sage"));
        pick.add(new Option("Sailor"));
        pick.add(new Option("Shipwright"));
        pick.add(new Option("Smuggler"));
        pick.add(new Option("Soldier"));
        pick.add(new Option("Spy"));
        pick.add(new Option("Urban Bounty Hunter"));
        pick.add(new Option("Urchin"));

        Option a = Question.ask(pick, "Choose your background");
        list.add(a);
        for (Option i : a.run()){
            list.add(i);
        }

        return list;
    }
}
