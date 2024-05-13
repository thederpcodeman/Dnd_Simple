package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class BardSub extends Choice {
    public BardSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Creation (Bard)"));//
        pick.add(new Option("Eloquence (Bard)"));//
        pick.add(new Option("Glamor (Bard)"));//
        pick.add(new Option("Lore (Bard)"));//
        pick.add(new Option("Spirits (Bard)"));
        pick.add(new Option("Swords (Bard)"));
        pick.add(new Subchoice("Swords (Bard))", new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(
                    new Option ("Dueling (Fighting Style)"),
                    new Option ("Two-Weapon Fighting (Fighting Style)"))),
                new ArrayList<>(Arrays.asList(
                        new Option ("Defensive Flourish (Blade Flourish)"),
                        new Option ("Slashing Flourish (Blade Flourish)"),
                        new Option ("Mobile Flourish (Blade Flourish)")))
                ))));
        pick.add(new Option("Valor (Bard)"));//
        pick.add(new Option("Whispers (Bard)"));//
        pick.add(new Option("Dirge Singer ('Exploring Eberron') (Bard)", false, true));//
        pick.add(new Option("Maestro ('DMSGuild') (Bard)", false, true));//
        pick.add(new Option("Tragedy ('Tal'Dorei Campaign Setting Reborn') (Bard)", false, true));//


        pick.add(new Option("Artiste de Cirque ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Acapella ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Apamaanit ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Arcane Archer ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Beasts ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Boom ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Boons ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Bows ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Bows, Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Boy Kissing ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Comedy ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Compulsion ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Convocation ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Corruption ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Cultists ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Death's Song ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Diplomacy ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Divination ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Divinity ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Dolls ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Dubstep ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Enchantment ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Envoys ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Failure Leader ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Fools ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Fortune ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Funkin' ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Fury ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Gambling ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Gravitas ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Guile ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Healing ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Heavy Metal ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Hymn ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Hymns ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Jesters ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Lambasting ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Legends ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Luck ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Lullabies ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Martial Dancing ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Masks ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Masks, Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Melee ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Metal ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Mockery ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Mockery, Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Names ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Nature ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Necromancy ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Osu ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Pain ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Prestige ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Prosecutors ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Protection ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Puppetry ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Radiance ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Regulation ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Rejuvenation ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Repertoire ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Revelry ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Sculpting ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Shanties ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Sorrow ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Soulking ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Sound ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Soundstrikers ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Strokes ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Synesthesia ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Synth ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Taiko ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Teaching ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Acrobat ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Barkeep ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Bartender ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Choir ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Colossal Chord ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Dancer ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Dealer ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Edge ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Epic Saga ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Falling Star ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Feudal Lord ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Gambler ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Jedi/Sith ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Jester ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Mesmer ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Moment ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Moment, Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Nightosphere ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Raccoon Spirit ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Soul Star ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Stage ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Stars ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Sunsinger ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Toréador ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Troubadour ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Vain ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Vocalist ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Vocalist, Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Wandering Skies ('dandwiki')(Bard)", true));
        pick.add(new Option("College of the Wilds ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Time ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Time, Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Tongues ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Trickery ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Troublemakers ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Undead ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Valor, 2nd Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Valor, Variant ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Ventriloquism ('dandwiki')(Bard)", true));
        pick.add(new Option("College of Vylius ('dandwiki')(Bard)", true));
        pick.add(new Option("Cursed Musician ('dandwiki')(Bard)", true));
        pick.add(new Option("General College ('dandwiki')(Bard)", true));
        pick.add(new Option("Hedonist ('dandwiki')(Bard)", true));
        pick.add(new Option("Rastafarian ('dandwiki')(Bard)", true));


        Option a = Question.ask(pick, "Choose your Bard College");
        list.add(a);


        return list;
    }
}

