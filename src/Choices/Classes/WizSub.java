package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class WizSub extends Choice {
    public WizSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Abjuration (Wizard)"));
        pick.add(new Option("Bladesinging (Wizard)"));
        pick.add(new Option("Chronurgy (Wizard)"));
        pick.add(new Option("Conjuration (Wizard)"));
        pick.add(new Option("Divination (Wizard)"));
        pick.add(new Option("Enchantment (Wizard)"));
        pick.add(new Option("Evocation (Wizard)"));
        pick.add(new Option("Graviturgy (Wizard)"));
        pick.add(new Option("Illusion (Wizard)"));
        pick.add(new Option("Necromancy (Wizard)"));
        pick.add(new Option("The Order of Scribes (Wizard)"));
        pick.add(new Option("Transmutation (Wizard)"));
        pick.add(new Option("War Magic (Wizard)"));
        pick.add(new Option("Rune Crafter (Wizard)", true, false));
        pick.add(new Option("Blood Magic ('Tal'Dorei Campaign Setting Reborn') (Wizard)", false, true));


        pick.add(new Option("AetherDancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Alchemy ('dandwiki')(Wizard)", true));
        pick.add(new Option("Alienist ('dandwiki')(Wizard)", true));
        pick.add(new Option("Amelioration ('dandwiki')(Wizard)", true));
        pick.add(new Option("Ancient Magic ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arcane Avenger ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arcane Blade School ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arcane Chef ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arcane Doctor ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arcane Linguist ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arcane Tactician ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arcane Tutor ('dandwiki')(Wizard)", true));
        pick.add(new Option("Arch-Magi ('dandwiki')(Wizard)", true));
        pick.add(new Option("Archivist Tradition ('dandwiki')(Wizard)", true));
        pick.add(new Option("Archon of Mystra ('dandwiki')(Wizard)", true));
        pick.add(new Option("Athasian Cerebremancy – Dark Sun Arcane Tradition ('dandwiki')(Wizard)", true));
        pick.add(new Option("Awakened Mystic ('dandwiki')(Wizard)", true));
        pick.add(new Option("Battle Wizard ('dandwiki')(Wizard)", true));
        pick.add(new Option("Battlemage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Black Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Blade Caster ('dandwiki')(Wizard)", true));
        pick.add(new Option("Blood Wizard ('dandwiki')(Wizard)", true));
        pick.add(new Option("Calefactor ('dandwiki')(Wizard)", true));
        pick.add(new Option("Chaos Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Chaos Pyromancy ('dandwiki')(Wizard)", true));
        pick.add(new Option("Chaos Wizard ('dandwiki')(Wizard)", true));
        pick.add(new Option("Chronolord ('dandwiki')(Wizard)", true));
        pick.add(new Option("Chronomancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Constructor ('dandwiki')(Wizard)", true));
        pick.add(new Option("Corruptor ('dandwiki')(Wizard)", true));
        pick.add(new Option("Dahnan Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Death Dancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Death Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Defiler ('dandwiki')(Wizard)", true));
        pick.add(new Option("Dragonclad ('dandwiki')(Wizard)", true));
        pick.add(new Option("Eldritch Secrecy ('dandwiki')(Wizard)", true));
        pick.add(new Option("Elemancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Elemental Path ('dandwiki')(Wizard)", true));
        pick.add(new Option("Elementalist ('dandwiki')(Wizard)", true));
        pick.add(new Option("Enchanter ('dandwiki')(Wizard)", true));
        pick.add(new Option("Eternal War School ('dandwiki')(Wizard)", true));
        pick.add(new Option("Familiar Master ('dandwiki')(Wizard)", true));
        pick.add(new Option("Fiendish Tradition ('dandwiki')(Wizard)", true));
        pick.add(new Option("Floraturgy ('dandwiki')(Wizard)", true));
        pick.add(new Option("Gastromancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Geomancy ('dandwiki')(Wizard)", true));
        pick.add(new Option("Gravity Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Gravity Magic ('dandwiki')(Wizard)", true));
        pick.add(new Option("Gryffindor ('dandwiki')(Wizard)", true));
        pick.add(new Option("Hallowed Necromancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Hedge Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Hufflepuff ('dandwiki')(Wizard)", true));
        pick.add(new Option("Infinite Caster ('dandwiki')(Wizard)", true));
        pick.add(new Option("Jedi/Sith Arcane Tradition ('dandwiki')(Wizard)", true));
        pick.add(new Option("Law Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Librarian ('dandwiki')(Wizard)", true));
        pick.add(new Option("Lich Lord ('dandwiki')(Wizard)", true));
        pick.add(new Option("Lichdom School ('dandwiki')(Wizard)", true));
        pick.add(new Option("Lore Mastery, Variant ('dandwiki')(Wizard)", true));
        pick.add(new Option("Magical Savant ('dandwiki')(Wizard)", true));
        pick.add(new Option("Magician ('dandwiki')(Wizard)", true));
        pick.add(new Option("Magnetist ('dandwiki')(Wizard)", true));
        pick.add(new Option("Magus Sanguis ('dandwiki')(Wizard)", true));
        pick.add(new Option("Master of the Elements ('dandwiki')(Wizard)", true));
        pick.add(new Option("Mesmerist ('dandwiki')(Wizard)", true));
        pick.add(new Option("Metamage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Mind Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Mind Sculptor ('dandwiki')(Wizard)", true));
        pick.add(new Option("Mirror Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Muscle Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Muscle Wizard ('dandwiki')(Wizard)", true));
        pick.add(new Option("Mystic Theurge ('dandwiki')(Wizard)", true));
        pick.add(new Option("Necrosomner ('dandwiki')(Wizard)", true));
        pick.add(new Option("Occultist ('dandwiki')(Wizard)", true));
        pick.add(new Option("Portal Master ('dandwiki')(Wizard)", true));
        pick.add(new Option("Portalier ('dandwiki')(Wizard)", true));
        pick.add(new Option("Psion ('dandwiki')(Wizard)", true));
        pick.add(new Option("Psionics ('dandwiki')(Wizard)", true));
        pick.add(new Option("Puppeteer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Pure Necromancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Pyromancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Pyromancer Wizard School ('dandwiki')(Wizard)", true));
        pick.add(new Option("Ravenclaw ('dandwiki')(Wizard)", true));
        pick.add(new Option("Runecaster ('dandwiki')(Wizard)", true));
        pick.add(new Option("Runic Blade ('dandwiki')(Wizard)", true));
        pick.add(new Option("Scar Caster ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Academics ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Anatomy ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Arcane Archery ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Biomancy ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Borrowing ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Chicanery ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Chronomancy ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Dabbling ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Diablerie ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Discovery ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Divination, Variant ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Divinity ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Enchantment, Variant ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Gun Magic ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Gun Magic (pre-edit) ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Historical Studies ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Incarceration ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Martial Art ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Mastery ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Mereology ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Minor Magic ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Nature ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Panacea ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Polygony ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Runes ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Runes and Rites ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Runes, Variant ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Sanguimancy ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Simplicity ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Sniping ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Summoning ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Telekinesis ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Arcane Fist ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Arcane Weapon ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Dark Arts ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Focus ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Focus-Blade ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Generic ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Gunmage ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Hedge-Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of the Occult ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Time Magic ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Unbroken Will ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Universal Magic ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Voodoo ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Warping ('dandwiki')(Wizard)", true));
        pick.add(new Option("School of Wizardry ('dandwiki')(Wizard)", true));
        pick.add(new Option("Schrodingermancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Sha'ir ('dandwiki')(Wizard)", true));
        pick.add(new Option("Shadow Monarch ('dandwiki')(Wizard)", true));
        pick.add(new Option("Shadow Necromancer ('dandwiki')(Wizard)", true));
        pick.add(new Option("Shadowcaller ('dandwiki')(Wizard)", true));
        pick.add(new Option("Shadowcaster ('dandwiki')(Wizard)", true));
        pick.add(new Option("Shaman ('dandwiki')(Wizard)", true));
        pick.add(new Option("Slytherin ('dandwiki')(Wizard)", true));
        pick.add(new Option("Spellblade, Variant ('dandwiki')(Wizard)", true));
        pick.add(new Option("Spiritual Invoker ('dandwiki')(Wizard)", true));
        pick.add(new Option("Summoning ('dandwiki')(Wizard)", true));
        pick.add(new Option("Sun and Moon ('dandwiki')(Wizard)", true));
        pick.add(new Option("Swordplay Tradition ('dandwiki')(Wizard)", true));
        pick.add(new Option("Thaumaturge ('dandwiki')(Wizard)", true));
        pick.add(new Option("The Line ('dandwiki')(Wizard)", true));
        pick.add(new Option("The Magic of Friendship ('dandwiki')(Wizard)", true));
        pick.add(new Option("The Weaver ('dandwiki')(Wizard)", true));
        pick.add(new Option("Theologian ('dandwiki')(Wizard)", true));
        pick.add(new Option("Time Bender ('dandwiki')(Wizard)", true));
        pick.add(new Option("Time Wizard ('dandwiki')(Wizard)", true));
        pick.add(new Option("Trickster ('dandwiki')(Wizard)", true));
        pick.add(new Option("True Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("True Mystic Theurge ('dandwiki')(Wizard)", true));
        pick.add(new Option("Twizard ('dandwiki')(Wizard)", true));
        pick.add(new Option("War Magic, Variant ('dandwiki')(Wizard)", true));
        pick.add(new Option("Watcher ('dandwiki')(Wizard)", true));
        pick.add(new Option("Wayward Arcanist ('dandwiki')(Wizard)", true));
        pick.add(new Option("White Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Wild Mage ('dandwiki')(Wizard)", true));
        pick.add(new Option("Witch ('dandwiki')(Wizard)", true));
        pick.add(new Option("Wizard School of Anatomy, Variant ('dandwiki')(Wizard)", true));
        pick.add(new Option("Wordsmith ('dandwiki')(Wizard)", true));
        pick.add(new Option("Wu Wei Master ('dandwiki')(Wizard)", true));
        Option a = Question.ask(pick, "Choose your Arcane Tradition");
        list.add(a);


        return list;
    }
}

