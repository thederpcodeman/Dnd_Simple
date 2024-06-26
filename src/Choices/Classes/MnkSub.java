package src.Choices.Classes;

import src.Choice;
import src.Option;
import src.Options.Subchoice;
import src.Question;

import java.util.ArrayList;
import java.util.Arrays;

public class MnkSub extends Choice {
    public MnkSub(){
        super();
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        ArrayList<Option> pick = new ArrayList<Option>();
        pick.add(new Option("Way of the Astral Self (Monk)"));
        pick.add(new Option("Way of the Ascendant Dragon (Monk)"));
        pick.add(new Option("Way of the Drunken Master (Monk)"));
        pick.add(new Option("Way of the Four Elements (Monk)"));
        pick.add(new Option("Way of the Kensei (Monk)"));
        pick.add(new Option("Way of the Long Death (Monk)"));
        pick.add(new Option("Way of Mercy (Monk)"));
        pick.add(new Option("Way of the Open Hand (Monk)"));
        pick.add(new Option("Way of Shadow (Monk)"));
        pick.add(new Option("Way of the Sun Soul (Monk)"));
        pick.add(new Option("Way of the Cobalt Soul ('Tal'Dorei Campaign Setting Reborn') (Monk)", false, true));
        pick.add(new Subchoice("Way of the Living Weapon ('Exploring Eberron') (Monk)", new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(
                new Option("Forged Heart (3rd Level Discipline)"),
                new Option("Nightmare Shroud (3rd Level Discipline)"),
                new Option("Traveler’s Blade (3rd Level Discipline)"),
                new Option("Weretouched (3rd Level Discipline)")
        )),
                new ArrayList<>(Arrays.asList(
                        new Option("Forged Heart (17th Level Discipline)"),
                        new Option("Nightmare Shroud (17th Level Discipline)"),
                        new Option("Traveler’s Blade (17th Level Discipline)"),
                        new Option("Weretouched (17th Level Discipline)")
                ))
                )), false, true));
        pick.add(new Option("Way of the Soul Knife ('ThinkDM') (Monk)", false, true));


        pick.add(new Option("Binate Duelist ('dandwiki')(Monk)", true));
        pick.add(new Option("Brother of Blade ('dandwiki')(Monk)", true));
        pick.add(new Option("Dhampir Paragon ('dandwiki')(Monk)", true));
        pick.add(new Option("Fist of Thaël ('dandwiki')(Monk)", true));
        pick.add(new Option("Flash Ninja ('dandwiki')(Monk)", true));
        pick.add(new Option("Inaba Style ('dandwiki')(Monk)", true));
        pick.add(new Option("Martial Artist Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Monk Way Of The Belmont ('dandwiki')(Monk)", true));
        pick.add(new Option("Moonspeaker ('dandwiki')(Monk)", true));
        pick.add(new Option("Necron ('dandwiki')(Monk)", true));
        pick.add(new Option("Order of the Forge ('dandwiki')(Monk)", true));
        pick.add(new Option("Shadow Star Shinobi ('dandwiki')(Monk)", true));
        pick.add(new Option("Spell Breaker ('dandwiki')(Monk)", true));
        pick.add(new Option("Tenken ('dandwiki')(Monk)", true));
        pick.add(new Option("Tenseigan's Path ('dandwiki')(Monk)", true));
        pick.add(new Option("The Path of Despair ('dandwiki')(Monk)", true));
        pick.add(new Option("Void Walker ('dandwiki')(Monk)", true));
        pick.add(new Option("Water Stream Rock Smashing Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way Beyond Mortal Limits ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Arcane Chaos ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Avoidance ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Celerity ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Chan Kong-Sang ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Chaotic Fists ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Combustion Bending ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Corporal Knowledge ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Dakhor ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Destruction ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Destructive Death ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Devotion ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Dueling ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Elemental Chaos ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Elemental Spin ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Enlightenment ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Erratic Destruction ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Fishman Karate ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Fitness ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Flowing Water ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Focus ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Ghostly Blades ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Grappling ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of History ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Hozoin-Ryu ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Invulnerability ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Iron ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Lightning ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Martial Hyper Learning ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Miko ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Nentō-Kūsho ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Nine Gates of Hell ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of One Strike ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Reckless Fighting ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Ripples ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Root and Soil ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Sendō ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Shizou ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Sword Sage ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the 4 Elements, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the 6 Hidden Ki Barriers ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Abandon Ache ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Absolver ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Abundant Step ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Adaptive Spirit ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Air Elementalist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Aldur ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ancestral Guidance ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ancient Training ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Anti-Mage ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Antimage ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Arcane Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Arcane Fist, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Arcane Hunter ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ascendant Dinosaur ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Assassin ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Astral Hand ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Asura ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Asura Path ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Austere ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Avenger ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Axe ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Azure Striker ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Battle Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Beast ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Beggar ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Belly Dancer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Belmon *Jonathan* ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Black Leg ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Blade Dancer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Blade Thrower ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Bladed Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Bladeless Sword ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Blizzard ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Bloodied Hand ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Bloodied Hand, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Blur ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Bodily Technique ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Body ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Body Beyond the Body ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Boxer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Brawler ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Brawler, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Broken Thief ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Brush ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Brute ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Burning Soul ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Chainweaver ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Chakra Sage ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Channeler ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Clenched Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Clone ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Close Quarters ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Clouds ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Cobra Kai ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Copy Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Corrupter ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Crash ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Crescent Moon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Crimson Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Crow Brawler ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dark One ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dazai ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Deadly Venoms ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Demon Slayer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Demonic Arts ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Disdainful Stroke ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dissipating Palm ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dog ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Doom Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Doppelgänger ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Draconic Art ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dragon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dragon Blade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dragon Slayer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dragon's Breath ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dragoon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Dreadful Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Drunken Butterfly ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Drunken Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Drunken Immortal ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Drunken Master, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Drunken Reveler ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Earth ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Earth Elementalist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Electro-Combatant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Elemental Bender ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Elemental Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Elemental Pugilist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Elemental Soul ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Elements ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Emperor ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Empty World ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Enduring ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Enlightened Mind ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Everburning Heart ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Expanse ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Extended Arm ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Eyes of the Lord ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Falcon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Fearless Dancer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Feline ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Fire Elementalist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Fist of Corruption ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Five Elements ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Five Gates ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Fleet Foot ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Flowing River ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Flowing Waters ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Focused Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Focused Ki ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Force ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Forge ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Forgiven ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Four Elements (Variant) ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Four Elements, 2nd Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Four Elements, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Fox Spirit ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Frenzy ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Frost Soul ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Frozen Fang ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Fusion ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Gates ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Gentle Arts ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Glowing Rose ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the God Hand ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Godlike Strike ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Godspeed ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Grease Monkey Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Guardian ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Guardian, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Gun Kata ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Harbinger ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Harbinger, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Healer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Healing Mist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Healing Ones ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Heavenly Lores ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Hedgehog ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Hourglass ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Iaiken ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Icejade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Improv ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Improviser ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Incarnation of Space ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Incineroar ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Infinite Steps ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Inner Flame ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Inner Light ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Innumerable Stars ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Intercepting Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Iris ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Iron Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Iron Mind ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Iron Mountain ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Iron Shirt ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Iron Storm ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Jedi/Sith ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Jeskai ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Kakusareta Shōheki ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Kalaripayattu ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Kensei, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ki Blocker ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ki Blocker, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ki Body ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ki Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ki Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ki Thief ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the King of Crimson ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Kiwami Heat ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Knight of Cydonia ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Kure ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Leech ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Leg ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Legendary Warrior ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Leopard ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Lightfoot ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Lightning ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Lightning Savant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Lightning Slime ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Limitless ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Living Weapon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Lone Star ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Long Blade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Lynx ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Mage Slayer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Mageseeker ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Magic Seals ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Many Faced God ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Martial Dance ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Martial Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Martyred Champion ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Masked Hero ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of The Master of Posture ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Mastered Hand ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Matrix ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Mechanised Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Mentor ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Merciful Hand ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Miyagi Do Karate ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the MMA ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Monkey King ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Mord Sith ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Murim ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Mystic ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Nanto Ho-Ohken ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Nightfury ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Nightwalker ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ninja ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ninjutsu ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Oasis ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ogre ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the One Punch ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Oozes ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Open Mind ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Overflowing Gourd ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Pain ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Pain Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Passive Hand ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Patient ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Patient Blade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Perfect Blade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Perfect Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Phoenix ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Pistol ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Platinum Star ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Pressure Points ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Priest ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Primal Mask ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Psion ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Pugilist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Pugnacious Dancer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Pyrokinetic ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Raging Demon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Raging Light ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Raging River ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Raging Spirit ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Reaper ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Reaper's Hand ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Rhythm ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ronin ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Rubber Pirate ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sacred Form ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sainted Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Scholar Blade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Scribe ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Scribe, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Serpent ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Serpent, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Serpentine ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Serpents ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Seven Chakras ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shadow Claws ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shadow Ninja ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shadowhunter ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shambali ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shaofin ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shaolin ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shattered Sword ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shield ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Shifting Flow ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Silent Death ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Silent Step ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Six Forbidden Seals ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Soul Crusher ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Soul Knife, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Soul Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Spear ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Spear Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Spectral Blade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Speedster ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Spider ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Spirit Fighter ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Spirit Warrior ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Spirits ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Star ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Steel Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Storm ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Storm Soul ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Strangler King ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Strap ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Street Monk ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sun Soul Rework ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sun Soul, Revised ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sun Soul, Variant ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Swamp Guardians ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Swashbuckler ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sweet Science ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sword ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Sword Sage ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Symbol of Peace ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Tempest ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Temporal Anomaly ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Tengoku no ken ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Thousand Fists ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Thrashing Dragon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Thread ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Tiger ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Tiger Vessel ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Time Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Time Slip ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Toxic Palm ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Tranquil Soul ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Transcendent Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Transcendent Order ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the True Seeing ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Trueblade Myrmidon ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Turtle ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ultimate Truth ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Unchained Fighter ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Unending Assault ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Vampire Slayer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Vengeful Storm ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Vengful Fist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Ventus ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Virulent Form ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Void ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Volcano ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Vulcan ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Walking Soul ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Wanderer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Warrior ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Warrior Monk ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Watchful Gate ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Water Elementalist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Weapon Master ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the White Tiger ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the White Wolf ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Wildfist ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Wind ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Wind Temples ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Windblade ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Winds ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Windwalker ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Wu Jen ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Wuxia ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Yellow Rose ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Z Warrior ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Zealot ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Zen Archer ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Zodiac ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Thunder and Lightning ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Undeath ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Unseen Hands ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Ventus ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Vhaeraun's Clergy ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Void ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Voltage ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Xianghua ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of Yin and Yang ('dandwiki')(Monk)", true));
        pick.add(new Option("Five Finger Death Punch ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Cheesy Soul ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the Keijo ('dandwiki')(Monk)", true));
        pick.add(new Option("Way of the SuperHot ('dandwiki')(Monk)", true));

        Option a = Question.ask(pick, "Choose your Monastic Tradition");
        list.add(a);


        return list;
    }
}

