import java.util.ArrayList;
import java.util.Collections;

import components.map.Map;
import components.map.Map.Pair;
import components.map.Map1L;
import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
import components.queue.Queue;
import components.queue.Queue1L;
import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.set.Set;
import components.set.Set1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Aytekin Alpay
 *
 */
public final class ChampionsLeague {

    public static Sequence<String> firstPot(SimpleReader in, SimpleWriter out) { //creates first pot
        Sequence<String> firstP = new Sequence1L<>();
        out.println(
                "Do you want to choose the first pot teams or go with the current pot teams?");
        String choice = in.nextLine();
        if (choice.equals("choose")) {
            out.println("Which 8 teams are in the first pot?");
            Set<String> teams = new Set1L<>();
            for (int i = 0; i < 8; i++) {
                out.println("Team " + (i + 1) + ": ");
                String team = in.nextLine();
                if (teams.contains(team)) {
                    out.println("Re-input team " + (i + 1) + ": ");
                    String redo = in.nextLine();
                    team = redo;
                }
                teams.add(team);
            }
            for (int a = 0; a < 8; a++) {
                firstP.add(0, teams.removeAny());
            }

        } else {
            firstP.add(0, "Juventus");
            firstP.add(0, "Real Madrid");
            firstP.add(0, "Manchester City");
            firstP.add(0, "Bayern Munich");
            firstP.add(0, "Lokomotiv Moscow");
            firstP.add(0, "PSG");
            firstP.add(0, "Barcelona");
            firstP.add(0, "Atletico Madrid");
        }

        return firstP;

    }

    public static Sequence<String> secondPot(SimpleReader in,
            SimpleWriter out) { //creates second pot
        Sequence<String> secondP = new Sequence1L<>();
        out.println(
                "Do you want to choose the second pot teams or go with the current pot teams?");
        String choice = in.nextLine();
        if (choice.equals("choose")) {
            out.println("Which 8 teams are in the second pot?");
            Set<String> teams = new Set1L<>();
            for (int i = 0; i < 8; i++) {
                out.println("Team " + (i + 1) + ": ");
                String team = in.nextLine();
                if (teams.contains(team)) {
                    out.println("Re-input team " + (i + 1) + ": ");
                    String redo = in.nextLine();
                    team = redo;
                }
                teams.add(team);
            }
            for (int a = 0; a < 8; a++) {
                secondP.add(0, teams.removeAny());
            }
        } else {
            secondP.add(0, "Manchester United");
            secondP.add(0, "Roma");
            secondP.add(0, "Shakhtar Donetsk");
            secondP.add(0, "Benfica");
            secondP.add(0, "Porto");
            secondP.add(0, "Napoli");
            secondP.add(0, "Tottenham");
            secondP.add(0, "Borussia Dortmund");
        }
        return secondP;

    }

    public static Sequence<String> thirdPot(SimpleReader in, SimpleWriter out) { //creates third pot
        Sequence<String> thirdP = new Sequence1L<>();
        out.println(
                "Do you want to choose the third pot teams or go with the current pot teams?");
        String choice = in.nextLine();
        if (choice.equals("choose")) {
            out.println("Which 8 teams are in the third pot?");
            Set<String> teams = new Set1L<>();
            for (int i = 0; i < 8; i++) {
                out.println("Team " + (i + 1) + ": ");
                String team = in.nextLine();
                if (teams.contains(team)) {
                    out.println("Re-input team " + (i + 1) + ": ");
                    String redo = in.nextLine();
                    team = redo;
                }
                teams.add(team);
            }
            for (int a = 0; a < 8; a++) {
                thirdP.add(0, teams.removeAny());
            }
        } else {
            thirdP.add(0, "Valencia");
            thirdP.add(0, "CSKA Moscow");
            thirdP.add(0, "Olymoique Lyon");
            thirdP.add(0, "Ajax");
            thirdP.add(0, "Schalke 04");
            thirdP.add(0, "Liverpool");
            thirdP.add(0, "PSV");
            thirdP.add(0, "Monaco");
        }
        return thirdP;

    }

    public static Sequence<String> fourthPot(SimpleReader in,
            SimpleWriter out) { //creates fourth pot
        Sequence<String> fourthP = new Sequence1L<>();
        out.println(
                "Do you want to choose the fourth pot teams or go with the current pot teams?");
        String choice = in.nextLine();
        if (choice.equals("choose")) {
            out.println("Which 8 teams are in the second pot?");
            Set<String> teams = new Set1L<>();
            for (int i = 0; i < 8; i++) {
                out.println("Team " + (i + 1) + ": ");
                String team = in.nextLine();
                if (teams.contains(team)) {
                    out.println("Re-input team " + (i + 1) + ": ");
                    String redo = in.nextLine();
                    team = redo;
                }
                teams.add(team);
            }
            for (int a = 0; a < 8; a++) {
                fourthP.add(0, teams.removeAny());
            }

        } else {
            fourthP.add(0, "Young Boys");
            fourthP.add(0, "Viktoria Pizen");
            fourthP.add(0, "Hoffenheim");
            fourthP.add(0, "AEK Athens");
            fourthP.add(0, "Galatasaray");
            fourthP.add(0, "Red Star Belgrade");
            fourthP.add(0, "Inter Milan");
            fourthP.add(0, "Club Brugge");
        }
        return fourthP;
    }

    public static void createGroup(Sequence<String> first,
            Sequence<String> second, Sequence<String> third,
            Sequence<String> fourth, Set<String> group, int i) { //create groups off of first, second, third. and fourth pots
        group.add(first.entry(i));
        group.add(second.entry(i));
        group.add(third.entry(i));
        group.add(fourth.entry(i));
    }

    public static void groupGame(String first, String second,
            NaturalNumber firstPoints, NaturalNumber secondPoints,
            NaturalNumber firstGoals, NaturalNumber secondGoals,
            NaturalNumber firstCon, NaturalNumber secondCon, SimpleReader in,
            SimpleWriter out) {
        out.println();
        out.print(first + " @ " + second);
        out.println();
        out.print(first + ": ");
        int fw1 = in.nextInteger();
        while (fw1 < 0) {
            out.println("Goals scored cannot be negative. Try again. " + first
                    + ": ");
            int fw1Copy = in.nextInteger();
            fw1 = fw1Copy;
        }
        NaturalNumber firstTeamG = new NaturalNumber1L(fw1);
        firstGoals.add(firstTeamG);
        secondCon.add(firstTeamG);
        out.println();
        out.print(second + ": ");
        int fw2 = in.nextInteger();
        while (fw2 < 0) {
            out.println("Goals scored cannot be negative. Try again. " + second
                    + ": ");
            int fw2Copy = in.nextInteger();
            fw2 = fw2Copy;
        }
        NaturalNumber secondTeamG = new NaturalNumber1L(fw2);
        out.println();
        secondGoals.add(secondTeamG);
        firstCon.add(secondTeamG);
        if (fw1 > fw2) {
            firstPoints.add(new NaturalNumber1L(3));

        } else if (fw1 < fw2) {
            secondPoints.add(new NaturalNumber1L(3));
        } else if (fw1 == fw2) {
            firstPoints.add(new NaturalNumber1L(1));
            secondPoints.add(new NaturalNumber1L(1));
        }
    }

    public static String concatS(String con, int amount) {
        String w = con;
        if (amount == 1) {
        } else {
            w.concat("s");
        }
        return w;
    }

    public static String concatS(String con, NaturalNumber amount) {
        String w = con;
        if (amount.equals(new NaturalNumber1L(1))) {

        } else {
            w.concat("s");
        }
        return w;
    }

    public static void printGroupOutcome(SimpleWriter out, String team,
            int point, String points, NaturalNumber GF, String scored,
            NaturalNumber GA, String concede, int GD) {
        out.println(team + " has " + point + " " + points + " and scored " + GF
                + " " + scored + " and conceded " + GA + " " + concede
                + ", with a goal difference of " + GD);
    }

    public static Sequence<String> groupOutcome(String name, Set<String> group,
            SimpleReader in, SimpleWriter out) {
        Sequence<String> groupOrder = new Sequence1L<>();

        //Names of teams
        String team1 = group.removeAny();
        String team2 = group.removeAny();
        String team3 = group.removeAny();
        String team4 = group.removeAny();

        out.println();
        out.println("If you'd like to play for " + name
                + " write 'play'. Otherwise press any other key and you can choose the group winner and second place team");
        String choice = in.nextLine();
        if (choice.equals("play")) {
            //Points for each team
            NaturalNumber team1Points = new NaturalNumber1L(0);
            NaturalNumber team2Points = new NaturalNumber1L(0);
            NaturalNumber team3Points = new NaturalNumber1L(0);
            NaturalNumber team4Points = new NaturalNumber1L(0);

            // Goals each team scored
            NaturalNumber team1GoalsFor = new NaturalNumber1L(0);
            NaturalNumber team2GoalsFor = new NaturalNumber1L(0);
            NaturalNumber team3GoalsFor = new NaturalNumber1L(0);
            NaturalNumber team4GoalsFor = new NaturalNumber1L(0);

            //Goals each team conceded
            NaturalNumber team1GoalsAgainst = new NaturalNumber1L(0);
            NaturalNumber team2GoalsAgainst = new NaturalNumber1L(0);
            NaturalNumber team3GoalsAgainst = new NaturalNumber1L(0);
            NaturalNumber team4GoalsAgainst = new NaturalNumber1L(0);

            //First Week
            out.println("First Week");
            groupGame(team1, team2, team1Points, team2Points, team1GoalsFor,
                    team2GoalsFor, team1GoalsAgainst, team2GoalsAgainst, in,
                    out);
            groupGame(team3, team4, team3Points, team4Points, team3GoalsFor,
                    team4GoalsFor, team3GoalsAgainst, team4GoalsAgainst, in,
                    out);

            //Second Week
            out.println("Second Week");
            groupGame(team1, team3, team1Points, team3Points, team1GoalsFor,
                    team3GoalsFor, team1GoalsAgainst, team3GoalsAgainst, in,
                    out);
            groupGame(team2, team4, team2Points, team4Points, team2GoalsFor,
                    team4GoalsFor, team2GoalsAgainst, team4GoalsAgainst, in,
                    out);

            //Third Week
            out.println("Third Week");
            groupGame(team4, team1, team4Points, team1Points, team4GoalsFor,
                    team1GoalsFor, team4GoalsAgainst, team1GoalsAgainst, in,
                    out);
            groupGame(team3, team2, team3Points, team2Points, team3GoalsFor,
                    team2GoalsFor, team3GoalsAgainst, team2GoalsAgainst, in,
                    out);

            //Fourth Week
            out.println("Fourth Week");
            groupGame(team2, team1, team2Points, team1Points, team2GoalsFor,
                    team1GoalsFor, team2GoalsAgainst, team1GoalsAgainst, in,
                    out);
            groupGame(team4, team3, team4Points, team3Points, team4GoalsFor,
                    team3GoalsFor, team4GoalsAgainst, team3GoalsAgainst, in,
                    out);

            //Fifth Week
            out.println("Fifth Week");
            groupGame(team1, team4, team1Points, team4Points, team1GoalsFor,
                    team4GoalsFor, team1GoalsAgainst, team4GoalsAgainst, in,
                    out);
            groupGame(team2, team3, team2Points, team3Points, team2GoalsFor,
                    team3GoalsFor, team2GoalsAgainst, team3GoalsAgainst, in,
                    out);

            //Sixth Week
            out.println("Sixth Week");
            groupGame(team3, team1, team3Points, team1Points, team3GoalsFor,
                    team1GoalsFor, team3GoalsAgainst, team1GoalsAgainst, in,
                    out);
            groupGame(team4, team2, team4Points, team2Points, team4GoalsFor,
                    team2GoalsFor, team4GoalsAgainst, team2GoalsAgainst, in,
                    out);

            // Calculate goal difference
            Integer team1GD = Integer.parseInt(team1GoalsFor.toString())
                    - Integer.parseInt(team1GoalsAgainst.toString());
            Integer team2GD = Integer.parseInt(team2GoalsFor.toString())
                    - Integer.parseInt(team2GoalsAgainst.toString());
            Integer team3GD = Integer.parseInt(team3GoalsFor.toString())
                    - Integer.parseInt(team3GoalsAgainst.toString());
            Integer team4GD = Integer.parseInt(team4GoalsFor.toString())
                    - Integer.parseInt(team4GoalsAgainst.toString());

            ////   TODO: IF POINTS ARE EQUAL, USE GOAL DIFFERENCE

            // Changes points from NN to int
            Integer team1Point = Integer.parseInt(team1Points.toString());
            Integer team2Point = Integer.parseInt(team2Points.toString());
            Integer team3Point = Integer.parseInt(team3Points.toString());
            Integer team4Point = Integer.parseInt(team4Points.toString());

            // Map of each team with their points
            Map<String, Integer> teamPoints = new Map1L<>();

            teamPoints.add(team1, team1Point);
            teamPoints.add(team2, team2Point);
            teamPoints.add(team3, team3Point);
            teamPoints.add(team4, team4Point);

            // Map of each team with their goal difference
            Map<String, Integer> teamGD = new Map1L<>();

            teamGD.add(team1, team1GD);
            teamGD.add(team2, team2GD);
            teamGD.add(team3, team3GD);
            teamGD.add(team4, team4GD);

            // ArrayList of the points got by each team, sorted so that last place is teamPnts.get(0)
            ArrayList<Integer> teamPnts = new ArrayList<Integer>();
            teamPnts.add(team1Point);
            teamPnts.add(team2Point);
            teamPnts.add(team3Point);
            teamPnts.add(team4Point);
            Collections.sort(teamPnts); //sorted order of points

            ArrayList<String> teamLine = new ArrayList<String>();

            int a = 0;
            Map<String, Integer> teamPntsTemp = new Map1L<>();
            Map<String, Integer> teamPntsF = new Map1L<>();
            teamPntsF.transferFrom(teamPoints);
            while (a <= 3) {
                if (a == 0) {
                    int pointRef = teamPnts.get(a);

                    if (pointRef == teamPnts.get(a + 1)) //[0,1] are same
                    {
                        if (pointRef == teamPnts.get(a + 2)) //[0,1,2] are same
                        {
                            if (pointRef == teamPnts.get(a + 3)) //all points are same
                            {
                                teamLine.add(teamPoints.removeAny().key());
                                teamLine.add(teamPoints.removeAny().key());
                                teamLine.add(teamPoints.removeAny().key());
                                teamLine.add(teamPoints.removeAny().key());
                                a = 4;
                            } else {
                                int c = 0;

                                while (c < 3) {
                                    Pair<String, Integer> check = teamPoints
                                            .removeAny();
                                    if (check.value() == pointRef) {
                                        teamLine.add(check.key());
                                        c++;
                                    } else {
                                        teamPntsTemp.add(check.key(),
                                                check.value());

                                    }
                                }
                                while (teamPntsTemp.size() > 0) {
                                    Pair<String, Integer> temp = teamPntsTemp
                                            .removeAny();
                                    teamPoints.add(temp.key(), temp.value());
                                }
                                a = 3;
                            }
                        } else {
                            int c = 0;
                            int d = 0;
                            while (c < 2 && d < 2) {
                                Pair<String, Integer> check = teamPoints
                                        .removeAny();
                                if (check.value() == pointRef) {
                                    teamLine.add(check.key());
                                    c++;
                                } else {
                                    teamPntsTemp.add(check.key(),
                                            check.value());
                                    d++;
                                }
                            }
                            while (teamPntsTemp.size() > 0) {
                                Pair<String, Integer> temp = teamPntsTemp
                                        .removeAny();
                                teamPoints.add(temp.key(), temp.value());
                            }
                            a = 2;
                        }
                    } else {
                        int c = 0;
                        int d = 0;
                        while (c < 1 && d < 3) {
                            Pair<String, Integer> check = teamPoints
                                    .removeAny();
                            if (check.value() == pointRef) {
                                teamLine.add(check.key());
                                c++;
                            } else {
                                teamPntsTemp.add(check.key(), check.value());
                                d++;
                            }
                        }
                        while (teamPntsTemp.size() > 0) {
                            Pair<String, Integer> temp = teamPntsTemp
                                    .removeAny();
                            teamPoints.add(temp.key(), temp.value());
                        }
                        a = 1;
                    }
                }

                else if (a == 1) {
                    int pointRef = teamPnts.get(a);

                    if (pointRef == teamPnts.get(a + 1)) //[1,2]
                    {
                        if (pointRef == teamPnts.get(a + 2)) //[1,2,3]
                        {
                            teamLine.add(teamPoints.removeAny().key());
                            teamLine.add(teamPoints.removeAny().key());
                            teamLine.add(teamPoints.removeAny().key());
                            a = 4;
                        } else {
                            int c = 0;

                            while (c < 2) {
                                Pair<String, Integer> check = teamPoints
                                        .removeAny();
                                if (check.value() == pointRef) {
                                    teamLine.add(check.key());
                                    c++;
                                } else {
                                    teamPntsTemp.add(check.key(),
                                            check.value());
                                }
                            }
                            while (teamPntsTemp.size() > 0) {
                                Pair<String, Integer> temp = teamPntsTemp
                                        .removeAny();
                                teamPoints.add(temp.key(), temp.value());
                            }
                            a = 3;
                        }

                    } else {

                        int d = 0;
                        while (d < 2) {
                            Pair<String, Integer> check = teamPoints
                                    .removeAny();
                            if (check.value() == pointRef) {
                                teamLine.add(check.key());

                            } else {
                                teamPntsTemp.add(check.key(), check.value());
                                d++;
                            }
                        }
                        while (teamPntsTemp.size() > 0) {
                            Pair<String, Integer> temp = teamPntsTemp
                                    .removeAny();
                            teamPoints.add(temp.key(), temp.value());
                        }
                    }

                    a = 2;
                } else if (a == 2) {
                    int pointRef = teamPnts.get(a);

                    if (pointRef == teamPnts.get(a + 1))//[2,3]
                    {
                        teamLine.add(teamPoints.removeAny().key());
                        teamLine.add(teamPoints.removeAny().key());
                        a = 4;
                    } else {
                        Pair<String, Integer> check = teamPoints.removeAny();
                        if (check.value() == pointRef) {
                            teamLine.add(check.key());
                        } else {
                            teamPntsTemp.add(check.key(), check.value());
                        }
                        while (teamPntsTemp.size() > 0) {
                            Pair<String, Integer> temp = teamPntsTemp
                                    .removeAny();
                            teamPoints.add(temp.key(), temp.value());
                        }
                    }
                    a = 3;

                } else if (a == 3) {
                    teamLine.add(teamPoints.removeAny().key());
                    a = 4;
                }
            }

            ArrayList<Integer> teamGDL = new ArrayList<Integer>();

            for (int i = 0; i < 4; i++) {
                teamGDL.add(i, teamGD.value(teamLine.get(i)));
            }

            // make arraylist of GD, sorted
            // make placement based on sorted GD and GD Map

            String point1 = concatS("points", team1Point);
            String point2 = concatS("points", team2Point);
            String point3 = concatS("points", team3Point);
            String point4 = concatS("points", team4Point);

            String goalsS1 = concatS("goals", team1GoalsFor);
            String goalsS2 = concatS("goals", team2GoalsFor);
            String goalsS3 = concatS("goals", team3GoalsFor);
            String goalsS4 = concatS("goals", team4GoalsFor);

            String goalsC1 = concatS("goals", team1GoalsAgainst);
            String goalsC2 = concatS("goals", team2GoalsAgainst);
            String goalsC3 = concatS("goals", team3GoalsAgainst);
            String goalsC4 = concatS("goals", team4GoalsAgainst);

            SimpleWriter out1 = new SimpleWriter1L();

            printGroupOutcome(out1, team1, team1Point, point1, team1GoalsFor,
                    goalsS1, team1GoalsAgainst, goalsC1, team1GD);
            printGroupOutcome(out1, team2, team2Point, point2, team2GoalsFor,
                    goalsS2, team2GoalsAgainst, goalsC2, team2GD);
            printGroupOutcome(out1, team3, team3Point, point3, team3GoalsFor,
                    goalsS3, team3GoalsAgainst, goalsC3, team3GD);
            printGroupOutcome(out1, team4, team4Point, point4, team4GoalsFor,
                    goalsS4, team4GoalsAgainst, goalsC4, team4GD);
            out1.close();

        } else if (choice.equals("sim")) {
            for (int i = 0; i < 4; i++) {
                groupOrder.add(0, team1);
                groupOrder.add(0, team2);
                groupOrder.add(0, team3);
                groupOrder.add(0, team4);
            }
        } else {
            Set<String> teamCopy = new Set1L<>();
            teamCopy.add(team1);
            teamCopy.add(team2);
            teamCopy.add(team3);
            teamCopy.add(team4);
            out.println("Out of " + team1 + ", " + team2 + ", " + team3
                    + ", or " + team4 + " who will win the group?");
            String choiceWin = in.nextLine();
            while (!teamCopy.contains(choiceWin)) {
                out.println("That's not a team in " + name + ". Out of " + team1
                        + ", " + team2 + ", " + team3 + ", or " + team4
                        + " who will win the group?");
                String choiceWin1 = in.nextLine();
                choiceWin = choiceWin1;
            }
            groupOrder.add(0, choiceWin);
            teamCopy.remove(choiceWin);
            out.println("Which team will be the runner up?");
            String choiceRunner = in.nextLine();
            while (!teamCopy.contains(choiceRunner)) {
                out.println("This team is not a valid choice. Try again: ");
                String choiceRunner1 = in.nextLine();
                choiceRunner = choiceRunner1;
            }
            groupOrder.add(1, choiceRunner);
            teamCopy.remove(choiceRunner);
            out.println("Which team will be third place?");
            String choiceThird = in.nextLine();
            while (!teamCopy.contains(choiceThird)) {
                out.println("This team is not a valid choice. Try again: ");
                String choiceThird1 = in.nextLine();
                choiceThird = choiceThird1;
            }
            groupOrder.add(2, choiceThird);
            teamCopy.remove(choiceThird);
            groupOrder.add(3, teamCopy.removeAny());
        }
        return groupOrder;
    }

    public static Set<String> knockOutSetCreator(String A, String B, String C,
            String D, String E, String F, String G, String H) {
        Set<String> ans = new Set1L<>();
        ans.add(A);
        ans.add(B);
        ans.add(C);
        ans.add(D);
        ans.add(E);
        ans.add(F);
        ans.add(G);
        ans.add(H);
        return ans;
    }

    public static Sequence<String> randomKnockOutWinners(Set<String> winners) {
        Sequence<String> winner = new Sequence1L<>();
        Set<String> temp = new Set1L<>();
        while (winners.size() > 0) {
            String t = winners.removeAny();
            winner.add(0, t);
            temp.add(t);
        }
        winners = temp;
        return winner;
    }

    public static Sequence<String> randomKnockOutSeconds(Set<String> seconds) {
        Sequence<String> second = new Sequence1L<>();
        Set<String> temp = new Set1L<>();
        while (seconds.size() > 0) {
            String t = seconds.removeAny();
            second.add(0, t);
            temp.add(t);
        }
        seconds = temp;

        return second;
    }

    public static String knockOutRoundMatch(String f, String s,
            SimpleWriter out, SimpleReader in) {
        int fHome = 0;
        int fAway = 0;
        int sHome = 0;
        int sAway = 0;

        out.println();
        out.println();
        out.println("First Leg: ");
        out.println("Home: " + f + "   Away: " + s);
        out.print(f + ": ");
        fHome = in.nextInteger();
        out.println();
        out.print(s + ": ");
        sAway = in.nextInteger();

        out.println();
        out.println();
        out.println("Second Leg: ");
        out.println("Home: " + s + "   Away: " + f);
        out.print(s + ": ");
        sHome = in.nextInteger();
        out.println();
        out.print(f + ": ");
        fAway = in.nextInteger();

        int fTotal = fHome + fAway;
        int sTotal = sHome + sAway;

        if (fTotal > sTotal) {
            return f;
        }

        else if (sTotal > fTotal) {
            return s;
        } else {
            if (fAway > sAway) {
                return f;
            } else if (sAway > fAway) {
                return s;
            } else {
                out.println("Penaly shootout required");
                out.println("Who do you choose to win PK shootout?");
                String winner = in.nextLine();
                boolean tp = false;
                while (tp == false) {
                    if (winner.toLowerCase().equals(f.toLowerCase())) {
                        return f;
                    } else if (winner.toLowerCase().equals(s.toLowerCase())) {
                        return s;
                    } else {
                        out.println("Try again");
                        String tr = in.nextLine();
                        winner = tr;
                    }
                }
            }
        }
        return "";

    }

    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        Sequence<String> firstP = firstPot(in, out);
        Sequence<String> secondP = secondPot(in, out);
        Sequence<String> thirdP = thirdPot(in, out);
        Sequence<String> fourthP = fourthPot(in, out);
        Set<String> groupA = new Set1L<>();
        Set<String> groupB = new Set1L<>();
        Set<String> groupC = new Set1L<>();
        Set<String> groupD = new Set1L<>();
        Set<String> groupE = new Set1L<>();
        Set<String> groupF = new Set1L<>();
        Set<String> groupG = new Set1L<>();
        Set<String> groupH = new Set1L<>();
        createGroup(firstP, secondP, thirdP, fourthP, groupA, 0); //groupA
        createGroup(firstP, secondP, thirdP, fourthP, groupB, 1); //groupB
        createGroup(firstP, secondP, thirdP, fourthP, groupC, 2); //groupC
        createGroup(firstP, secondP, thirdP, fourthP, groupD, 3); //groupD
        createGroup(firstP, secondP, thirdP, fourthP, groupE, 4); //groupE
        createGroup(firstP, secondP, thirdP, fourthP, groupF, 5); //groupF
        createGroup(firstP, secondP, thirdP, fourthP, groupG, 6); //groupG
        createGroup(firstP, secondP, thirdP, fourthP, groupH, 7); //groupH

        Sequence<String> groupAOutcome = groupOutcome("Group A", groupA, in,
                out);

        String groupAWinner = groupAOutcome.entry(0);
        String groupARunner = groupAOutcome.entry(1);
        String groupAThird = groupAOutcome.entry(2);
        String groupALast = groupAOutcome.entry(3);

        out.println();
        out.println("Group A: ");
        out.println("1st: " + groupAWinner);
        out.println("2nd: " + groupARunner);
        out.println("3rd: " + groupAThird);
        out.println("4th: " + groupALast);

        Sequence<String> groupBOutcome = groupOutcome("Group B", groupB, in,
                out);
        String groupBWinner = groupBOutcome.entry(0);
        String groupBRunner = groupBOutcome.entry(1);
        String groupBThird = groupBOutcome.entry(2);
        String groupBLast = groupBOutcome.entry(3);

        out.println();
        out.println("Group B: ");
        out.println("1st: " + groupBWinner);
        out.println("2nd: " + groupBRunner);
        out.println("3rd: " + groupBThird);
        out.println("4th: " + groupBLast);

        Sequence<String> groupCOutcome = groupOutcome("Group C", groupC, in,
                out);
        String groupCWinner = groupCOutcome.entry(0);
        String groupCRunner = groupCOutcome.entry(1);
        String groupCThird = groupCOutcome.entry(2);
        String groupCLast = groupCOutcome.entry(3);

        out.println();
        out.println("Group C: ");
        out.println("1st: " + groupCWinner);
        out.println("2nd: " + groupCRunner);
        out.println("3rd: " + groupCThird);
        out.println("4th: " + groupCLast);

        Sequence<String> groupDOutcome = groupOutcome("Group D", groupD, in,
                out);
        String groupDWinner = groupDOutcome.entry(0);
        String groupDRunner = groupDOutcome.entry(1);
        String groupDThird = groupDOutcome.entry(2);
        String groupDLast = groupDOutcome.entry(3);

        out.println();
        out.println("Group D: ");
        out.println("1st: " + groupDWinner);
        out.println("2nd: " + groupDRunner);
        out.println("3rd: " + groupDThird);
        out.println("4th: " + groupDLast);

        Sequence<String> groupEOutcome = groupOutcome("Group E", groupE, in,
                out);
        String groupEWinner = groupEOutcome.entry(0);
        String groupERunner = groupEOutcome.entry(1);
        String groupEThird = groupEOutcome.entry(2);
        String groupELast = groupEOutcome.entry(3);

        out.println();
        out.println("Group E: ");
        out.println("1st: " + groupEWinner);
        out.println("2nd: " + groupERunner);
        out.println("3rd: " + groupEThird);
        out.println("4th: " + groupELast);

        Sequence<String> groupFOutcome = groupOutcome("Group F", groupF, in,
                out);
        String groupFWinner = groupFOutcome.entry(0);
        String groupFRunner = groupFOutcome.entry(1);
        String groupFThird = groupFOutcome.entry(2);
        String groupFLast = groupFOutcome.entry(3);

        out.println();
        out.println("Group F: ");
        out.println("1st: " + groupFWinner);
        out.println("2nd: " + groupFRunner);
        out.println("3rd: " + groupFThird);
        out.println("4th: " + groupFLast);

        Sequence<String> groupGOutcome = groupOutcome("Group G", groupG, in,
                out);
        String groupGWinner = groupGOutcome.entry(0);
        String groupGRunner = groupGOutcome.entry(1);
        String groupGThird = groupGOutcome.entry(2);
        String groupGLast = groupGOutcome.entry(3);

        out.println();
        out.println("Group G: ");
        out.println("1st: " + groupGWinner);
        out.println("2nd: " + groupGRunner);
        out.println("3rd: " + groupGThird);
        out.println("4th: " + groupGLast);

        Sequence<String> groupHOutcome = groupOutcome("Group H", groupH, in,
                out);
        String groupHWinner = groupHOutcome.entry(0);
        String groupHRunner = groupHOutcome.entry(1);
        String groupHThird = groupHOutcome.entry(2);
        String groupHLast = groupHOutcome.entry(3);

        out.println();
        out.println("Group H: ");
        out.println("1st: " + groupHWinner);
        out.println("2nd: " + groupHRunner);
        out.println("3rd: " + groupHThird);
        out.println("4th: " + groupHLast);

        Set<String> groupThirds1 = knockOutSetCreator(groupAThird, groupBThird,
                groupCThird, groupDThird, groupEThird, groupFThird, groupGThird,
                groupHThird);
        out.println();
        out.print("Relegated to UEFA Europa League: ");
        while (groupThirds1.size() > 1) {
            out.print(groupThirds1.removeAny() + ", ");
        }
        out.print(groupThirds1.removeAny());

        out.println();
        out.println();
        out.println(
                "If you'd like to choose the Round of 16 draws, write 'play'. Otherwise press any other key and the computer will randomly make draws");
        String KOChoice = in.nextLine();
        Sequence<String> firsts = new Sequence1L<>();
        Sequence<String> seconds = new Sequence1L<>();
        Set<String> groupWinners = knockOutSetCreator(groupAWinner,
                groupBWinner, groupCWinner, groupDWinner, groupEWinner,
                groupFWinner, groupGWinner, groupHWinner);
        Set<String> groupRunners = knockOutSetCreator(groupARunner,
                groupBRunner, groupCRunner, groupDRunner, groupERunner,
                groupFRunner, groupGRunner, groupHRunner);
        if (KOChoice.equals("play")) {
            out.println();
            out.println("Round of 16 match ups: ");
            out.println();

            while (groupWinners.size() > 0) {
                out.println("Choose one of the remaining winners: ");
                for (String fds : groupWinners) {
                    out.println(fds);
                }
                out.println();
                String choiceWin = in.nextLine();
                if (!groupWinners.contains(choiceWin)) {
                    out.println("Try again: ");
                    String choiceWin1 = in.nextLine();
                    choiceWin = choiceWin1;
                }
                groupWinners.remove(choiceWin);
                firsts.add(0, choiceWin);
                out.println();
                out.println("Who is " + choiceWin + "'s opponent?");
                out.println("Choose one of the remaining second-place teams: ");
                for (String p : groupRunners) {
                    out.println(p);
                }
                out.println();
                String choiceRun = in.nextLine();
                if (!groupRunners.contains(choiceRun)) {
                    out.println("Try again: ");
                    String choiceRun1 = in.nextLine();
                    choiceRun = choiceRun1;
                }
                groupRunners.remove(choiceRun);
                seconds.add(0, choiceRun);
                out.println();

            }

        } else {
            firsts = randomKnockOutWinners(groupWinners);
            seconds = randomKnockOutSeconds(groupRunners);
        }
        out.println("Round of 16 matchups: ");
        for (int i = 0; i < firsts.length(); i++) {
            out.println();
            out.println(firsts.entry(i) + " vs. " + seconds.entry(i));
        }

        Queue<String> quarters = new Queue1L<>();

        for (int i = 0; i < firsts.length(); i++) {
            String check = knockOutRoundMatch(firsts.entry(i), seconds.entry(i),
                    out, in);
            out.println();
            out.println(check + " advances!");
            quarters.enqueue(check);
        }

        // make play option to choose matchups
        out.println();
        out.println("Quarterfinals: ");
        for (int i = 0; i < 4; i++) {
            out.println();
            String a = quarters.dequeue();
            String b = quarters.dequeue();
            out.println(a + " vs. " + b);
            quarters.enqueue(a);
            quarters.enqueue(b);
        }

        // make play option to choose matchups

        Queue<String> semis = new Queue1L<>();
        for (int i = 0; i < 4; i++) {
            String a = quarters.dequeue();
            String b = quarters.dequeue();
            String check = knockOutRoundMatch(a, b, out, in);
            out.println();
            out.println(check + " advances!");
            semis.enqueue(check);
        }
        out.println();
        out.println("Semifinals: ");
        for (int i = 0; i < 2; i++) {
            out.println();
            String a = semis.dequeue();
            String b = semis.dequeue();
            out.println(a + " vs. " + b);
            semis.enqueue(a);
            semis.enqueue(b);

        }

        Queue<String> finals = new Queue1L<>();
        for (int i = 0; i < 2; i++) {
            out.println();
            String a = semis.dequeue();
            String b = semis.dequeue();
            String check = knockOutRoundMatch(a, b, out, in);
            out.println();
            out.println(check + " advances!");
            finals.enqueue(check);
        }

        out.println();
        out.println("Final: ");

        String a = finals.dequeue();
        String b = finals.dequeue();
        out.println(a + " vs. " + b);

        int aGoals = 0;
        int bGoals = 0;
        out.println();
        out.print(a + ": ");
        aGoals = in.nextInteger();
        out.println();
        out.print(b + ": ");
        bGoals = in.nextInteger();
        out.println();
        if (aGoals > bGoals) {
            out.println(a + " wins the 2019 UEFA Champions League!");
        } else if (bGoals > aGoals) {
            out.println(b + " wins the 2019 UEFA Champions League!");
        } else {
            boolean t = false;
            while (t == false) {
                out.println("Who wins the Final in penalties?");
                String c = in.nextLine();
                if (c.toLowerCase().equals(a.toLowerCase())) {
                    out.println(a + " wins the 2019 UEFA Champions League!");
                    t = true;
                } else if (c.toLowerCase().equals(a.toLowerCase())) {
                    out.println(b + " wins the 2019 UEFA Champions League!");
                    t = true;
                } else {
                    out.println("Try again");
                    String d = in.nextLine();
                    c = d;
                }
            }

        }

        in.close();
        out.close();
    }

}
