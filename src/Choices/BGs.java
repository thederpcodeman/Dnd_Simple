package src.Choices;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class BGs extends Choice {
    public BGs(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new BackGround("Acolyte",
                new ArrayList<>(Arrays.asList(//Traits
                        new Option ("I idolize a particular hero of my faith, and constantly refer to that person's deeds and example."),
                        new Option ("I can find common ground between the fiercest enemies, empathizing with them and always working toward peace."),
                        new Option ("I see omens in every event and action. The gods try to speak to us, we just need to listen."),
                        new Option ("Nothing can shake my optimistic attitude."),
                        new Option ("I quote (or misquote) sacred texts and proverbs in almost every situation."),
                        new Option ("I am tolerant of other faiths and respect the worship of other gods."),
                        new Option ("I am intolerant of other faiths and condemn the worship of other gods."),
                        new Option ("I've enjoyed fine food, drink, and high society among my temple's elite. Rough living grates on me."),
                        new Option ("I've spent so long in the temple that I have little practical experience dealing with people in the outside world."),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Ideals
                        new Option ("Tradition. The ancient traditions of worship and sacrifice must be preserved and upheld. (Lawful)"),
                        new Option ("Charity. I always try to help those in need, no matter what the personal cost. (Good)"),
                        new Option ("Change. We must help bring about the changes the gods are constantly working in the world. (Chaotic)"),
                        new Option ("Power. I hope to one day rise to the top of my faith's religious hierarchy. (Lawful)"),
                        new Option ("Faith. I trust that my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)"),
                        new Option ("Aspiration. I seek to prove myself worthy of my god's favor by matching my actions against their teachings. (Any)"),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Bonds
                        new Option ("I would die to recover an ancient relic of my faith that was lost long ago."),
                        new Option ("I will someday get revenge on the corrupt temple hierarchy who branded me a heretic."),
                        new Option ("I owe my life to the priest who took me in when my parents died."),
                        new Option ("Everything I do is for the common people."),
                        new Option ("I will do anything to protect the temple where I served."),
                        new Option ("I seek to preserve a sacred text that my enemies consider heretical and seek to destroy."),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Flaws
                        new Option ("I judge others harshly, and myself even more severely."),
                        new Option ("I put too much trust in those who wield power within my temple's hierarchy."),
                        new Option ("My piety sometimes leads me to blindly trust those that profess faith in my god."),
                        new Option ("I am inflexible in my thinking."),
                        new Option ("I am suspicious of strangers and expect the worst of them."),
                        new Option ("Once I pick a goal, I become obsessed with it to the detriment of everything else in my life."),
                        new Option ("Other.")))));
        pick.add(new BackGround("Anthropologist",
                new ArrayList<>(Arrays.asList(//Traits
                        new Option ("I prefer the company of those who aren't like me, including people of other races."),
                        new Option ("I'm a stickler when it comes to observing proper etiquette and local customs."),
                        new Option ("I would rather observe than meddle."),
                        new Option ("By living among violent people, I have become desensitized to violence."),
                        new Option ("I would risk life and limb to discover a new culture or unravel the secrets of a dead one."),
                        new Option ("When I arrive at a new settlement for the first time, I must learn all its customs."),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Ideals
                        new Option ("Discovery. I want to be the first person to discover a lost culture. (Any)"),
                        new Option ("Distance. One must not interfere with the affairs of another culture – even one in need of aid. (Lawful)"),
                        new Option ("Knowledge. By understanding other races and cultures, we learn to understand ourselves. (Any)"),
                        new Option ("Power. Common people crave strong leadership, and I do my utmost to provide it. (Lawful)"),
                        new Option ("Protection. I must do everything possible to save a society facing extinction. (Good)"),
                        new Option ("Indifferent. Life is cruel. What's the point in saving people if they're going to die anyway? (Chaotic)"),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Bonds
                        new Option ("My mentor gave me a journal filled with lore and wisdom. Losing it would devastate me."),
                        new Option ("Having lived among the people of a primeval tribe or clan, I long to return and see how they are faring."),
                        new Option ("Years ago, tragedy struck the members of an isolated society I befriended, and I will honor them."),
                        new Option ("I want to learn more about a particular humanoid culture that fascinates me."),
                        new Option ("I seek to avenge a clan, tribe, kingdom, or empire that was wiped out."),
                        new Option ("I have a trinket that I believe is the key to finding a long-lost society."),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Flaws
                        new Option ("Boats make me seasick."),
                        new Option ("I talk to myself, and I don't make friends easily."),
                        new Option ("I believe that I'm intellectually superior to people from other cultures and have much to teach them."),
                        new Option ("I've picked up some unpleasant habits living among races such as goblins, lizardfolk, or orcs."),
                        new Option ("I complain about everything."),
                        new Option ("I wear a tribal mask and never take it off."),
                        new Option ("Other.")))));
        pick.add(new BackGround("Archaeologist",
                new ArrayList<>(Arrays.asList(//Traits
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Ideals
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Bonds
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option ("Other."))),
                new ArrayList<>(Arrays.asList(//Flaws
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option (""),
                        new Option ("Other.")))));
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

        return list;
    }
}