import components.map.Map;
import components.map.Map1L;
import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.set.Set;
import components.set.Set1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public final class MarvelCinematicUniverse {

    //0= Mantis, 1= Groot, 2= SL, 3= RR, 4= Gamora, 5=Drax
    public static Sequence<String> GuardiansGalaxy() {
        Sequence<String> group = new Sequence1L<>();
        group.add(0, "Drax");
        group.add(0, "Gamora");
        group.add(0, "Rocket Raccoon");
        group.add(0, "Star-Lord");
        group.add(0, "Groot");
        group.add(0, "Mantis");
        return group;

    }

    //0=MBK 1=WKB 2=OKO 3=NAK 4=Shuri 5=BP
    public static Sequence<String> Wakanda() {
        Sequence<String> group = new Sequence1L<>();
        group.add(0, "Black Panther");
        group.add(0, "Shuri");
        group.add(0, "Nakia");
        group.add(0, "Okoye");
        group.add(0, "W'Kabi");
        group.add(0, "M'Baku");
        return group;

    }

    //0=WM 1=Hawk 2=Falcon 3=Vision 4=SW 5=SM 6=BW 7=Hulk 8=IM 9=Thor 10=CA
    public static Sequence<String> Avengers() {
        Sequence<String> group = new Sequence1L<>();
        group.add(0, "Captain America");
        group.add(0, "Thor");
        group.add(0, "Iron Man");
        group.add(0, "Hulk");
        group.add(0, "Black Widow");
        group.add(0, "Spider-Man");
        group.add(0, "Scarlet Witch");
        group.add(0, "Vision");
        group.add(0, "Falcon");
        group.add(0, "Hawkeye");
        group.add(0, "War Machine");
        return group;
    }

    //0=Iron Fist, 1= LC, 2= DD, 3=JJ
    public static Sequence<String> Defenders() {
        Sequence<String> group = new Sequence1L<>();
        group.add(0, "Jessica Jones");
        group.add(0, "Daredevil");
        group.add(0, "Luke Cage");
        group.add(0, "Iron Fist");
        return group;
    }

    //HERO SEQUENCES
    //0 = Alter Ego
    //1 = Group
    //2 = Powers

    //Wakanda
    public static Sequence<String> MBaku() {
        Sequence<String> black = new Sequence1L<>();
        black.add(0, "None");
        black.add(1, "Wakanda");
        black.add(2,
                "Head of the Gorilla tribe of Wakanda. Leads Gorilla army. Super strength");
        return black;
    }

    public static Sequence<String> Wkabi() {
        Sequence<String> black = new Sequence1L<>();
        black.add(0, "None");
        black.add(1, "Wakanda");
        black.add(2,
                "Leads the rhino defense army of Wakanda. Super strength and endurance. Has horn that can summon rhinos to attack");
        return black;
    }

    public static Sequence<String> Okoye() {
        Sequence<String> black = new Sequence1L<>();
        black.add(0, "None");
        black.add(1, "Wakanda");
        black.add(2,
                "Head Wakandan warrior. Leads Wakandan army. Outstanding hand to hand combat along with weapons use");
        return black;
    }

    public static Sequence<String> Nakia() {
        Sequence<String> black = new Sequence1L<>();
        black.add(0, "None");
        black.add(1, "Wakanda");
        black.add(2,
                "Wakandan spy, outstanding reflexes and use of hand to hand combat");
        return black;
    }

    public static Sequence<String> Shuri() {
        Sequence<String> shuri = new Sequence1L<>();
        shuri.add(0, "None");
        shuri.add(1, "Wakanda");
        shuri.add(2,
                "Exceptional knowledge of science and engineering. Able to perform in hand to hand combat.");
        return shuri;
    }

    public static Sequence<String> BlackPanther() {
        Sequence<String> black = new Sequence1L<>();
        black.add(0, "T'Challa");
        black.add(1, "Wakanda");
        black.add(2,
                "After taking the Heart-Shaped Herb, hero gains powers of enhanced combat, strength, speed, reflexes, and agility. Suit allows him to be bulletproof and use kinetic power in combat, as well as grow claws to climb and attack");
        return black;
    }

    //Avengers
    public static Sequence<String> WarMachine() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "Rhodey Rhodes");
        captain.add(1, "Avengers");
        captain.add(2,
                "Powers almost identical to Iron Man's, where War Machine has a engineered suit of weapons and can fly");
        return captain;
    }

    public static Sequence<String> Hawkeye() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "CLint Barton");
        captain.add(1, "Avengers");
        captain.add(2,
                "Excpetional reflexes. Possesses world class marksmanship, as he uses bow and arrow to shoot targets without error");
        return captain;
    }

    public static Sequence<String> Falcon() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "Sam Wilson");
        captain.add(1, "Avengers");
        captain.add(2,
                "Uses engineered bird suit, which gives hero the ability to fly and use weapons. Goggles also give hero exceptional vision");
        return captain;
    }

    public static Sequence<String> Vision() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "None");
        captain.add(1, "Avengers");
        captain.add(2,
                "As an android, hero has superhuman stamina, reflexes, speed, agility and strength. Can pass through matter and can use power of the Mind Infinity Stone to shoot beams");
        return captain;
    }

    public static Sequence<String> Scarlet() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "Wanda Maximoff");
        captain.add(1, "Avengers");
        captain.add(2,
                "Ability to fly and use chaos magic to manipulate minds and move objects");
        return captain;
    }

    public static Sequence<String> Spiderman() {
        Sequence<String> spider = new Sequence1L<>();
        spider.add(0, "Peter Parker");
        spider.add(1, "Avengers");
        spider.add(2,
                "Has superhuman strength, agility, and reflexes. Ability to shoot webs out of wrists to use in combat and as transportation. Also can climb walls and has spider sense to locate unapparent danger");
        return spider;
    }

    public static Sequence<String> BlackWidow() {
        Sequence<String> blackW = new Sequence1L<>();
        blackW.add(0, "Natalia Romanova");
        blackW.add(1, "Avengers");
        blackW.add(2,
                "World class flexibility, hand to hand combat, and weapons specialist. Exceptional agent");
        return blackW;
    }

    public static Sequence<String> Hulk() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "Bruce Banner");
        captain.add(1, "Avengers");
        captain.add(2,
                "After changing into Hulk, hero possesses superhuman strength, longevity, speed, stamina, durability, and healing. Short temper allows hero to have advanced adrenaline");
        return captain;
    }

    public static Sequence<String> Thor() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "None");
        captain.add(1, "Avengers");
        captain.add(2,
                "Has ability to summon storm elements with hammer made of Asgardian metal. Can also fly, travel through time, and has superhuman strength");
        return captain;
    }

    public static Sequence<String> IronMan() {
        Sequence<String> ironman = new Sequence1L<>();
        ironman.add(0, "Tony Stark");
        ironman.add(1, "Avengers");
        ironman.add(2,
                "Engineered iron suit possesses a plethora of powers, such as the ability to fly, absorb damage, communicate, and use various weapons");
        return ironman;
    }

    public static Sequence<String> Captain() {
        Sequence<String> captain = new Sequence1L<>();
        captain.add(0, "Steve Rogers");
        captain.add(1, "Avengers");
        captain.add(2,
                "Advanced strength, endurance, agility, speed, reflexes, durability, and healing. Uses Vibranium shield for combat and defense");
        return captain;
    }

    //Defenders
    public static Sequence<String> LukeCage() {
        Sequence<String> luke = new Sequence1L<>();
        luke.add(0, "Luke Cage");
        luke.add(1, "Defenders");
        luke.add(2,
                "Possesses superhuman strength and stamina. Bulletproof skin allows him to be virtually impossible to have physical injury");
        return luke;
    }

    public static Sequence<String> IronFist() {
        Sequence<String> ironfist = new Sequence1L<>();
        ironfist.add(0, "Danny Rand");
        ironfist.add(1, "Defenders");
        ironfist.add(2,
                "After spending years at K'un-Lun, posses the power to supercharge fist to cause massive damage. Exceptional hand to hand combat");
        return ironfist;
    }

    public static Sequence<String> Jessica() {
        Sequence<String> jessica = new Sequence1L<>();
        jessica.add(0, "Jessica Jones");
        jessica.add(1, "Defenders");
        jessica.add(2,
                "Possesses superhuman strength, as well as the ability to reject mind control. Exceptional investigator");
        return jessica;
    }

    public static Sequence<String> Daredevil() {
        Sequence<String> daredevil = new Sequence1L<>();
        daredevil.add(0, "Matthew Murdock");
        daredevil.add(1, "Defenders");
        daredevil.add(2,
                "Despite being blind, has superhuman hearing. Incredible agility and reflexes, along with exceptional hand to hand combat. Able to locate danger with echolocation");
        return daredevil;
    }

    //Guardians of the Galaxy
    public static Sequence<String> Mantis() {
        Sequence<String> mantis = new Sequence1L<>();
        mantis.add(0, "Mantis");
        mantis.add(1, "Guardians of the Galaxy");
        mantis.add(2,
                "Ability to telepathically communicate and alter moods and feelings");
        return mantis;
    }

    public static Sequence<String> Rocket() {
        Sequence<String> rocket = new Sequence1L<>();
        rocket.add(0, "Rocket Raccoon");
        rocket.add(1, "Guardians of the Galaxy");
        rocket.add(2,
                "Amplified speed, acute sense of smell, sight, and hearing. Great use of firearms");
        ;
        return rocket;
    }

    public static Sequence<String> Starlord() {
        Sequence<String> starlord = new Sequence1L<>();
        starlord.add(0, "Peter Quill");
        starlord.add(1, "Guardians of the Galaxy");
        starlord.add(2,
                "Master strategist and problem solver, good at close-quarter combat and use of firearms. Has great knowledge of aliens, societies, and cultures");
        return starlord;
    }

    public static Sequence<String> Groot() {
        Sequence<String> groot = new Sequence1L<>();
        groot.add(0, "Groot");
        groot.add(1, "Guardians of the Galaxy");
        groot.add(2,
                "Can absorb wood as food, ability to regenerate. Has power to control trees and plants, has some resistance to fire");
        ;
        return groot;

    }

    public static Sequence<String> Gamora() {
        Sequence<String> gamora = new Sequence1L<>();
        gamora.add(0, "Gamora");
        gamora.add(1, "Guardians of the Galaxy");
        gamora.add(2,
                "Superhuman strength and agility, accelerated healing, elite combat");

        return gamora;
    }

    public static Sequence<String> Drax() {
        Sequence<String> drax = new Sequence1L<>();
        drax.add(0, "Drax");
        drax.add(1, "Guardians of the Galaxy");
        drax.add(2,
                "Enhanced strength and resilience, flight, and the ability to project energy blasts from his hands");

        return drax;
    }

    //Hero Sets
    public static Set<String> avengerSet() {
        Sequence<String> a = Avengers();
        Set<String> hero = new Set1L<>();
        for (int i = 0; i < a.length(); i++) {
            hero.add(a.entry(i));
        }
        return hero;
    }

    public static Set<String> guardianSet() {
        Set<String> hero = new Set1L<>();
        Sequence<String> b = GuardiansGalaxy();
        for (int e = 0; e < b.length(); e++) {
            hero.add(b.entry(e));
        }
        return hero;
    }

    public static Set<String> defenderSet() {
        Sequence<String> c = Defenders();
        Set<String> hero = new Set1L<>();
        for (int p = 0; p < c.length(); p++) {
            hero.add(c.entry(p));
        }
        return hero;

    }

    public static Set<String> wakandaSet() {
        Sequence<String> d = Wakanda();
        Set<String> hero = new Set1L<>();
        for (int q = 0; q < d.length(); q++) {
            hero.add(d.entry(q));
        }
        return hero;

    }

    //All heros set
    public static Set<String> Heroes() {

        Set<String> hero = new Set1L<>();
        hero.add(avengerSet());
        hero.add(guardianSet());
        hero.add(defenderSet());
        hero.add(wakandaSet());
        return hero;
    }

    //Avengers associated with their bio
    public static Map<String, Sequence<String>> avengerMap() {
        Map<String, Sequence<String>> aMap = new Map1L<>();
        aMap.add("Captain America", Captain());
        aMap.add("Iron Man", IronMan());
        aMap.add("Thor", Thor());
        aMap.add("Hulk", Hulk());
        aMap.add("Black Widow", BlackWidow());
        aMap.add("Spider-Man", Spiderman());
        aMap.add("Scarlet Witch", Scarlet());
        aMap.add("Vision", Vision());
        aMap.add("Falcon", Falcon());
        aMap.add("Hawkeye", Hawkeye());
        aMap.add("War Machine", WarMachine());
        return aMap;
    }

    //Defenders associated with their bio
    public static Map<String, Sequence<String>> defenderMap() {
        Map<String, Sequence<String>> dMap = new Map1L<>();
        dMap.add("Daredevil", Daredevil());
        dMap.add("Jessica Jones", Jessica());
        dMap.add("Luke Cage", LukeCage());
        dMap.add("Iron Fist", IronFist());
        return dMap;
    }

    //Guardians of the Galaxy associated with their bio
    public static Map<String, Sequence<String>> guardianMap() {
        Map<String, Sequence<String>> gMap = new Map1L<>();
        gMap.add("Star-Lord", Starlord());
        gMap.add("Gamora", Gamora());
        gMap.add("Groot", Groot());
        gMap.add("Rocket Raccoon", Rocket());
        gMap.add("Drax", Drax());
        gMap.add("Mantis", Mantis());
        return gMap;
    }

    //Wakanda heroes associated with their bio
    public static Map<String, Sequence<String>> wakandaMap() {
        Map<String, Sequence<String>> wMap = new Map1L<>();
        wMap.add("Black Panther", BlackPanther());
        wMap.add("Nakia", Nakia());
        wMap.add("Shuri", Shuri());
        wMap.add("M'Baku", MBaku());
        wMap.add("W'Kabi", Wkabi());
        wMap.add("Okoye", Okoye());
        return wMap;
    }

    //All heroes associated with their bio
    public static Map<String, Sequence<String>> heroMap() {
        Map<String, Sequence<String>> hMap = new Map1L<>();
        hMap.combineWith(wakandaMap());
        hMap.combineWith(avengerMap());
        hMap.combineWith(guardianMap());
        hMap.combineWith(defenderMap());
        return hMap;
    }

    public static void main(String[] args) {

        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        Map<String, Sequence<String>> heroes = heroMap();

        out.println("Options:");
        out.println("Press 0 for list of different hero groups");
        out.println("Press 1 to manually enter a hero name");
        out.println();

        int choice1 = in.nextInteger();
        while (choice1 > 1 || choice1 < 0) {
            out.println("Try again.");
            out.println("Press 0 for list of different hero groups");
            out.println("Press 1 to manually enter a hero name");
            choice1 = in.nextInteger();
        }
        if (choice1 == 0) {
            out.println(
                    "Groups: Avengers, Guardians of the Galaxy, Defenders, Wakandan heroes");
            out.println("Press 0 for a list of Avengers");
            out.println("Press 1 for a list of Guardians of the Galaxy");
            out.println("Press 2 for a list of Defenders");
            out.println("Press 3 for a list of Wakandan heroes");
            int choice2 = in.nextInteger();
            while (choice2 < 0 || choice2 > 3) {
                out.println("Try again.");
                out.println("Press 0 for a list of Avengers");
                out.println("Press 1 for a list of Guardians of the Galaxy");
                out.println("Press 2 for a list of Defenders");
                out.println("Press 3 for a list of Wakandan heroes");
                choice2 = in.nextInteger();
            }
            if (choice2 == 0) {
                out.println("Avengers: ");
                Sequence<String> avenger = Avengers();

                for (int i = 0; i < avenger.length() - 1; i++) {
                    out.print(avenger.entry(i) + ", ");
                }
                out.print(avenger.entry(avenger.length() - 1));
                out.println();

                out.println("Enter which Avenger you want to research: ");
                String choice3 = in.nextLine();
                Set<String> aSet = avengerSet();
                while (!aSet.contains(choice3)) {
                    out.println("Try again: ");
                    out.println("Enter which Avenger you want to research: ");
                    String tryAgain = in.nextLine();
                    choice3 = tryAgain;
                }
                out.println("Hero: " + choice3);
                out.println("Alter ego: " + heroes.value(choice3).entry(0));
                out.println("Hero group: " + heroes.value(choice3).entry(1));
                out.println("Powers: " + heroes.value(choice3).entry(2));

            } else if (choice2 == 1) {
                out.println("Guardians of the Galaxy: ");
                Sequence<String> guardian = GuardiansGalaxy();
                for (int i = 0; i < guardian.length() - 1; i++) {
                    out.print(guardian.entry(i) + ", ");
                }
                out.print(guardian.entry(guardian.length() - 1));
                out.println();
                out.println(
                        "Enter which Guardian of the Galaxy you want to research: ");
                String choice3 = in.nextLine();
                Set<String> gSet = guardianSet();
                while (!gSet.contains(choice3)) {
                    out.println("Try again: ");
                    out.println(
                            "Enter which Guardian of the Galaxy you want to research: ");
                    String tryAgain = in.nextLine();
                    choice3 = tryAgain;
                }
                out.println("Hero: " + choice3);
                out.println("Alter ego: " + heroes.value(choice3).entry(0));
                out.println("Hero group: " + heroes.value(choice3).entry(1));
                out.println("Powers: " + heroes.value(choice3).entry(2));

            } else if (choice2 == 2) {
                out.println("Defenders: ");
                Sequence<String> defender = Defenders();
                for (int i = 0; i < defender.length() - 1; i++) {
                    out.print(defender.entry(i) + ", ");
                }
                out.print(defender.entry(defender.length() - 1));
                out.println();

                out.println("Enter which Defender you want to research: ");
                String choice3 = in.nextLine();
                Set<String> dSet = defenderSet();
                while (!dSet.contains(choice3)) {
                    out.println("Try again: ");
                    out.println("Enter which Defender you want to research: ");
                    String tryAgain = in.nextLine();
                    choice3 = tryAgain;
                }
                out.println("Hero: " + choice3);
                out.println("Alter ego: " + heroes.value(choice3).entry(0));
                out.println("Hero group: " + heroes.value(choice3).entry(1));
                out.println("Powers: " + heroes.value(choice3).entry(2));
            } else if (choice2 == 3) {
                out.println("Wakandan heroes: ");
                Sequence<String> wakanda = Wakanda();
                for (int i = 0; i < wakanda.length() - 1; i++) {
                    out.print(wakanda.entry(i) + ", ");
                }
                out.print(wakanda.entry(wakanda.length() - 1));
                out.println();

                out.println("Enter which Wakandan hero you want to research: ");
                String choice3 = in.nextLine();
                Set<String> wSet = wakandaSet();
                while (!wSet.contains(choice3)) {
                    out.println("Try again: ");
                    out.println(
                            "Enter which Wakandan hero you want to research: ");
                    String tryAgain = in.nextLine();
                    choice3 = tryAgain;
                }

                out.println("Hero: " + choice3);
                out.println("Alter ego: " + heroes.value(choice3).entry(0));
                out.println("Hero group: " + heroes.value(choice3).entry(1));
                out.println("Powers: " + heroes.value(choice3).entry(2));
            }
        } else if (choice1 == 1) {
            out.println(
                    "Enter hero name (be very careful to case sensitivity and punctuation):");
            String hero = in.nextLine();
            Set<String> heroesSet = Heroes();
            while (!heroesSet.contains(hero)) {
                out.println("Try again:");
                out.println(
                        "Enter hero name (be very careful to case sensitivity and punctuation):");
                String tryAgain = in.nextLine();
                hero = tryAgain;
            }

            out.println("Hero: " + hero);
            out.println("Alter ego: " + heroes.value(hero).entry(0));
            out.println("Hero group: " + heroes.value(hero).entry(1));
            out.println("Powers: " + heroes.value(hero).entry(2));

        }
        in.close();
        out.close();

    }

}
