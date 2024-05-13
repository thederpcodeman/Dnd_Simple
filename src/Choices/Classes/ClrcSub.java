package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Question;

import java.util.ArrayList;

public class ClrcSub extends Choice {
    public ClrcSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Arcana Domain (Cleric)"));//
        pick.add(new Option("Death Domain (Cleric)"));//
        pick.add(new Option("Forge Domain (Cleric)"));//
        pick.add(new Option("Grave Domain (Cleric)"));//
        pick.add(new Option("Knowledge Domain (Cleric)"));//
        pick.add(new Option("Life Domain (Cleric)"));//
        pick.add(new Option("Light Domain (Cleric)"));//
        pick.add(new Option("Nature Domain (Cleric)"));//
        pick.add(new Option("Order Domain (Cleric)"));//
        pick.add(new Option("Peace Domain (Cleric)"));//
        pick.add(new Option("Tempest Domain (Cleric)"));//
        pick.add(new Option("Trickery Domain (Cleric)"));//
        pick.add(new Option("Twilight Domain (Cleric)"));//
        pick.add(new Option("War Domain (Cleric)"));//
        pick.add(new Option("Ambition (Cleric)",true, false));//
        pick.add(new Option("Solidarity (Cleric)",true, false));//
        pick.add(new Option("Strength Domain (Cleric)",true, false));//
        pick.add(new Option("Zeal Domain (Cleric)",true, false));//
        pick.add(new Option("Fate Domain (Cleric)",true, false));//
        pick.add(new Option("Beauty Domain (Cleric)",false, true));//
        pick.add(new Option("Blood Domain ('Tal'Dorei Campaign Setting Reborn') (Cleric)",false, true));//
        pick.add(new Option("Mind Domain ('Exploring Eberron') (Cleric)",false, true));//
        pick.add(new Option("Moon Domain ('Tal'Dorei Campaign Setting Reborn') (Cleric)",false, true));//


        pick.add(new Option("Aegis Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Agony Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Air Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Angelica Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Anguish Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Arcana Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Art Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Atheism ('dandwiki')(Cleric)", true));
        pick.add(new Option("Atheism Domain (Ur-Priest) ('dandwiki')(Cleric)", true));
        pick.add(new Option("Battle Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Beauty and Love Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Blast Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Bokor ('dandwiki')(Cleric)", true));
        pick.add(new Option("Chance Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Chaos Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Chaotic Traveler ('dandwiki')(Cleric)", true));
        pick.add(new Option("Circle Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Cleric of Pantheism ('dandwiki')(Cleric)", true));
        pick.add(new Option("Coastal Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Cold Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Cold Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Color Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Control Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Darkened Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Darkness Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Death Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Death Magus Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Debt Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Destruction Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Disciple of Balance ('dandwiki')(Cleric)", true));
        pick.add(new Option("Domain of Heracy ('dandwiki')(Cleric)", true));
        pick.add(new Option("Domain of Mercy ('dandwiki')(Cleric)", true));
        pick.add(new Option("Domain of Night ('dandwiki')(Cleric)", true));
        pick.add(new Option("Domain of Rebirth ('dandwiki')(Cleric)", true));
        pick.add(new Option("Domain of Respite ('dandwiki')(Cleric)", true));
        pick.add(new Option("Domain of the Old Ones ('dandwiki')(Cleric)", true));
        pick.add(new Option("Domain of the Outer Ones ('dandwiki')(Cleric)", true));
        pick.add(new Option("Dragon Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Dragon Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Dragongod Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Dream Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Elemental Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Elven Sky Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Ether Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Evangelist Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Exorcism Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Fae Fang ('dandwiki')(Cleric)", true));
        pick.add(new Option("Fate Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Fire Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Fire Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Flame Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Force Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Forge Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Freedom Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Frost Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Giant Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Gift of the Eldritch ('dandwiki')(Cleric)", true));
        pick.add(new Option("Godless Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Guardian Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Harvest Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Harvest Domain, 2nd Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Harvest Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Healer ('dandwiki')(Cleric)", true));
        pick.add(new Option("Heretic Sword Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Holy Waters Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Hourglass Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Hunt Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Hunter Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Ice Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Illusion Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Infernal Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Juiblex Cultist ('dandwiki')(Cleric)", true));
        pick.add(new Option("Keyblade Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Ki Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Law Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Life & Death Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Lightning Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Love Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Love Domain, 2nd Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Love Domain, 3rd Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Love Domain, 5th Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Love Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Luck Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Magic Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Martyrdom Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Mind Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Miracle Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Mirror Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Mischief Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Momentum Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Moon Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Music Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Mystra's Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Night Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Occult Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Oceanic Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Ooze Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Pacifism Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Peace Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Pestilence Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Plague Doctor ('dandwiki')(Cleric)", true));
        pick.add(new Option("Prophet ('dandwiki')(Cleric)", true));
        pick.add(new Option("Protection Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Punishment Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Purity Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Queller of Dark Arts Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Radiant Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Revelry Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sacred Blade Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sanctification Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sarkicism Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sea Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Shadow Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Shadow Priest ('dandwiki')(Cleric)", true));
        pick.add(new Option("Shadoweir ('dandwiki')(Cleric)", true));
        pick.add(new Option("Shamanism ('dandwiki')(Cleric)", true));
        pick.add(new Option("Simplicity Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sin Eater Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sky Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Space Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Spider Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Spider Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Spirit Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Spirit Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Starseer Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Stasis Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Statue Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Strength Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Strength Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Strife Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sun Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sun Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Sword Dancer Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Tao Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Tech Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Technocleric ('dandwiki')(Cleric)", true));
        pick.add(new Option("Tempest Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("The Hero of the Gods Cleric ('dandwiki')(Cleric)", true));
        pick.add(new Option("Time Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Time Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Titan Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Travel Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Undead Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Undeath Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Undeath Domain, 2nd Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Undeath Domain, 3rd Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Undeath Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Underworld Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Valor Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Vengeance Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Virtue Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Void Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("War Domain, 2nd Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("War Domain, 3rd Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("War Domain, Variant ('dandwiki')(Cleric)", true));
        pick.add(new Option("Warhound Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Wine Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Wrath Domain ('dandwiki')(Cleric)", true));
        pick.add(new Option("Wu Wei Master ('dandwiki')(Cleric)", true));
        Option a = Question.ask(pick, "Choose your Divine Domain");
        list.add(a);


        return list;
    }
}

