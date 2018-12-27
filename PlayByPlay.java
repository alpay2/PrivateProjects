import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javafx.util.Pair;

/**
 * Put a short phrase describing the program here.
 *
 * @author Aytekin Alpay
 *
 */
public final class PlayByPlay {

    private static Set<String> teamRoster(String a) throws IOException {
        File file = new File(a);
        BufferedReader inF = new BufferedReader(new FileReader(file));
        Set<String> aff = new HashSet<>();
        String fa = "";
        while ((fa = inF.readLine()) != null) {
            int f = 0;
            while (fa.charAt(f) == ' '
                    || (fa.charAt(f) >= 48 && fa.charAt(f) <= 57)) {
                f++;
            }
            aff.add(fa.substring(f));
        }
        inF.close();
        return aff;
    }

    private static Map<String, Set<String>> rosters() throws IOException {
        Map<String, Set<String>> a = new HashMap<>();
        a.put("Detroit Pistons", teamRoster("detroit/pistons.txt"));
        a.put("Milwaukee Bucks", teamRoster("milwaukee/bucks.txt"));
        a.put("Cleveland Cavaliers", teamRoster("cleveland/cavaliers.txt"));
        a.put("Chicago Bulls", teamRoster("chicago/bulls.txt"));
        a.put("Indiana Pacers", teamRoster("indiana/pacers.txt"));
        a.put("New York Knicks", teamRoster("newyork/knicks.txt"));
        a.put("Brooklyn Nets", teamRoster("brooklyn/nets.txt"));
        a.put("Boston Celtics", teamRoster("boston/celtics.txt"));
        a.put("Toronto Raptors", teamRoster("toronto/raptors.txt"));
        a.put("Memphis Grizzlies", teamRoster("memphis/grizzlies.txt"));
        a.put("Minnesota Timberwolves",
                teamRoster("minnesota/timberwolves.txt"));
        a.put("Miami Heat", teamRoster("miami/heat.txt"));
        a.put("Orlando Magic", teamRoster("orlando/magic.txt"));
        a.put("New Orleans Pelicans", teamRoster("neworleans/pelicans.txt"));
        a.put("Charlotte Hornets", teamRoster("charlotte/hornets.txt"));
        a.put("Houston Rockets", teamRoster("houston/rockets.txt"));//16
        a.put("Dallas Mavericks", teamRoster("dallas/mavericks.txt"));
        a.put("San Antonio Spurs", teamRoster("sanantonio/spurs.txt"));
        a.put("Atlanta Hawks", teamRoster("atlanta/hawks.txt"));
        a.put("Oklahoma City Thunder", teamRoster("oklahomacity/thunder.txt")); //20
        a.put("Phoenix Suns", teamRoster("phoenix/suns.txt"));
        a.put("Utah Jazz", teamRoster("utah/jazz.txt"));
        a.put("Denver Nuggets", teamRoster("denver/nuggets.txt"));
        a.put("Los Angeles Lakers", teamRoster("losangelesL/lakers.txt"));
        a.put("Los Angeles Clippers", teamRoster("losangelesC/clippers.txt"));
        a.put("Golden State Warriors", teamRoster("goldenstate/warriors.txt")); //26
        a.put("Sacramento Kings", teamRoster("sacramento/kings.txt"));
        a.put("Portland Trailblazers", teamRoster("portland/trailblazers.txt"));
        a.put("Philadelphia 76ers", teamRoster("philadelphia/76ers.txt"));
        a.put("Washington Wizards", teamRoster("washington/wizards.txt"));
        return a;
    }

    private static Set<String> fouls() {
        Set<String> f = new HashSet<>();
        f.add("personal");
        f.add("loose ball");
        f.add("shooting");
        f.add("flagrant");
        f.add("charging"); //turnover
        f.add("offensive"); //turnover
        f.add("blocking");
        f.add("reach-in");
        return f;
    }

    private static Set<String> twoPoint() {
        Set<String> f = new HashSet<>();
        f.add("dunk"); //alley-oop
        f.add("lay-up");
        f.add("hook shot");
        f.add("tip shot");
        f.add("jumper");
        f.add("floater");
        return f;
    }

    private static Set<String> turnovers() {
        Set<String> f = new HashSet<>();
        f.add("offensive three seconds"); //technical FT
        f.add("traveling violation");
        f.add("double dribble violation");
        f.add("carrying violation");
        f.add("bad pass");
        f.add("loses ball");
        f.add("offensive foul"); //charging or illegal screen
        return f;
    }

    private static Set<String> verbs() {
        Set<String> f = new HashSet<>();
        f.add("makes"); //shot or free throw
        f.add("misses"); //shot or free throw
        f.add("grabs"); //rebounds
        f.add("commits"); //foul or turnover
        f.add("steps"); //out of bounds
        f.add("assists");
        f.add("enters the game for");
        f.add("steals");
        return f;
    }

    private static Set<String> scoreTypes() {
        Set<String> f = new HashSet<>();
        f.add("free throws");
        f.add("two point shot");
        f.add("three point shot");
        return f;
    }

    private static Set<String> starters(Set<String> roster, Scanner in,
            String team) {
        Set<String> start = new HashSet<>();
        int i = 0;
        while (i < 5) {
            System.out
                    .println("Who is starter " + (i + 1) + " for the " + team);
            String starter = in.nextLine();
            while (!roster.contains(starter) || start.contains(starter)) {
                System.out.println("Try again. Who is starter " + (i + 1)
                        + " for the " + team);
                starter = in.nextLine();
            }
            start.add(starter);
            i++;
        }
        return start;
    }

    private static Pair<String, String> genParser(Scanner in, Set<String> team,
            Set<String> verbs) {
        System.out.println("Name: ");
        String name = in.nextLine();
        while (!team.contains(name)) {
            System.out.println("Use a valid player");
            name = in.nextLine();
        }
        System.out.println("Action: ");
        String action = in.nextLine();
        while (!verbs.contains(action)) {
            System.out.println("Use a valid action");
            action = in.nextLine();
        }
        Pair<String, String> ans = new Pair<String, String>(name, action);
        return ans;

    }

    private static void parser(Scanner in, Pair<String, String> play,
            Set<String> starters, Set<String> scoreTypes, Set<String> turnover,
            Set<String> fouls, Set<String> team, BufferedWriter out)
            throws IOException {
        if (play.getValue().equals("grabs")) { //REBOUNDS
            System.out.println("What kind of rebound did " + play.getKey()
                    + " grab(must be offensive or defensive) ?");
            String rebound = in.nextLine();
            while (!rebound.equals("defensive")
                    && !rebound.equals("offensive")) {
                System.out.println("Try again: ");
                rebound = in.nextLine();
            }
            out.write(play.getKey() + " " + play.getValue() + " " + rebound
                    + " rebound\n"); //file output
        } else if (play.getValue().equals("makes")) { //POINTS
            System.out.println("What kind of point did " + play.getKey()
                    + " score? (must be 'free throws', 'two point shot' or 'three point shot')");
            String shot = in.nextLine();
            while (!scoreTypes().contains(shot)) {
                System.out.println("Re-input shot type");
                shot = in.nextLine();
            }
            if (shot.equals("free throws")) { //FTS
                System.out.println("How many free throws total is "
                        + play.getKey() + " is shooting?");
                int foul = in.nextInt();
                while (foul != 1 && foul != 2 && foul != 3) {
                    System.out.println("Try again: ");
                    foul = in.nextInt();
                }
                int i = 1;
                out.write(play.getKey() + " makes free throw " + i + " of "
                        + foul + "\n"); //file output
                while (i < foul) {
                    i++;
                    System.out.println("Does " + play.getKey()
                            + " make or miss free throw " + i);
                    String ft = in.nextLine();
                    while (!ft.equals("makes") && !ft.equals("misses")) {
                        System.out.println("Try again: ");
                        ft = in.nextLine();
                    }
                    out.write(play.getKey() + " " + ft + " free throw " + i
                            + " of " + foul + "\n"); //file output
                }
            } else if (shot.equals("two point shot")) { //2 POINTS
                System.out.println("What kind of " + shot + " was this?");
                String twoP = in.nextLine();
                while (!twoPoint().contains(twoP)) {
                    System.out.println("Try again: ");
                    twoP = in.nextLine();
                }
                String assist = "";

                if (twoP.equals("dunk")) { //DUNK
                    System.out.println("Was it an alley oop?");
                    String a = in.nextLine();
                    while (!a.toLowerCase().equals("yes")
                            && !a.toLowerCase().equals("no")) {
                        System.out.println("Try again");
                        a = in.nextLine();
                    }
                    if (a.toLowerCase().equals("yes")) { //ALLEY OOP
                        System.out.println("Who assisted?");
                        String player = in.nextLine();
                        while (!starters.contains(player)) {
                            System.out.println("Try again");
                            player = in.nextLine();
                        }
                        assist = " (assisted by " + player + ")";
                        out.write(play.getKey() + " makes alley-oop" + assist
                                + "\n");
                    } else {
                        System.out
                                .println("How far out was this " + twoP + "?");
                        int dist = in.nextInt();
                        while (dist < 0 || dist > 23) {
                            System.out.println("Try again: ");
                            dist = in.nextInt();
                        }
                        System.out.println("Did anyone assist this bucket?");
                        String yesNo = in.nextLine();
                        while (!yesNo.toLowerCase().equals("yes")
                                && !yesNo.toLowerCase().equals("no")) {
                            System.out.println("Must be 'yes' or 'no'");
                            yesNo = in.nextLine();
                        }
                        if (yesNo.toLowerCase().equals("yes")) {
                            System.out.println("Who assisted?");
                            String player = in.nextLine();
                            while (!starters.contains(player)) {
                                System.out.println("Try again");
                                player = in.nextLine();
                            }
                            assist = " (assisted by " + player + ")";
                            out.write(play.getKey() + " makes " + dist
                                    + " foot dunk" + assist + "\n");
                        } else {
                            out.write(play.getKey() + " makes " + dist
                                    + " foot dunk" + "\n");
                        }
                    }

                } else { //2 POINTS NOT A DUNK
                    System.out.println("How far out was this " + twoP + "?");
                    int dist = in.nextInt();
                    while (dist < 0 || dist > 23) {
                        System.out.println("Try again: ");
                        dist = in.nextInt();
                    }
                    System.out.println("Did anyone assist this bucket?");
                    String yesNo = in.nextLine();
                    while (!yesNo.toLowerCase().equals("yes")
                            && !yesNo.toLowerCase().equals("no")) {
                        System.out.println("Must be 'yes' or 'no'");
                        yesNo = in.nextLine();
                    }
                    if (yesNo.toLowerCase().equals("yes")) {
                        System.out.println("Who assisted?");
                        String player = in.nextLine();
                        while (!starters.contains(player)) {
                            System.out.println("Try again");
                            player = in.nextLine();
                        }
                        assist = " (assisted by " + player + ")";
                    } else {

                    }
                    out.write(play.getKey() + " " + play.getValue() + " " + dist
                            + "-foot " + twoP + assist + "\n"); //file output
                }
            } else { //3 POINTER
                System.out.println("How far out was this three pointer?");
                int dist = in.nextInt();
                while (dist >= 95 || dist <= 23) {
                    System.out.println("Try again: ");
                    dist = in.nextInt();
                }
                System.out.println("Did anyone assist this bucket?");
                String yesNo = in.nextLine();
                while (!yesNo.toLowerCase().equals("yes")
                        && !yesNo.toLowerCase().equals("no")) {
                    System.out.println("Must be 'yes' or 'no'");
                    yesNo = in.nextLine();
                }
                String assist = "";
                if (yesNo.toLowerCase().equals("yes")) {
                    System.out.println("Who assisted?");
                    String player = in.nextLine();
                    while (!starters.contains(player)) {
                        System.out.println("Try again");
                        player = in.nextLine();
                    }
                    assist = " (assisted by " + player + ")";
                } else {

                }
                out.write(play.getKey() + " " + play.getValue() + " " + dist
                        + "-foot three pointer" + assist + "\n"); //file output
            }
        } else if (play.getValue().equals("misses")) { //MISSED SHOTS
            System.out.println("What kind of point did " + play.getKey()
                    + " miss?('free throws', 'two point shot', or 'three point shot')");
            String shot = in.nextLine();
            while (!scoreTypes().contains(shot)) {
                System.out.println("Re-input shot type");
                shot = in.nextLine();
            }
            if (shot.equals("free throws")) { //FREE THROWS
                System.out.println("How many free throws total is "
                        + play.getKey() + " is shooting?");
                int foul = in.nextInt();
                while (foul != 1 && foul != 2 && foul != 3) {
                    System.out.println("Try again: ");
                    foul = in.nextInt();
                }
                int i = 1;
                out.write(play.getKey() + " misses free throw " + i + " of "
                        + foul + "\n"); //file output
                while (i < foul) {
                    i++;
                    System.out.println("Does " + play.getKey()
                            + " make or miss free throw " + i);
                    String ft = in.nextLine();
                    while (!ft.equals("makes") && !ft.equals("misses")) {
                        System.out.println("Try again: ");
                        ft = in.nextLine();
                    }
                    out.write(play.getKey() + " " + ft + " free throw " + i
                            + " of " + foul + "\n"); //file output
                }
            } else if (shot.equals("two point shot")) { //TWO POINT SHOT
                System.out.println("What kind of " + shot + " was this?");
                String twoP = in.nextLine();
                while (!twoPoint().contains(twoP)) {
                    System.out.println("Try again: ");
                    twoP = in.nextLine();
                }
                System.out.println("How far out was this " + twoP + "?");
                int dist = in.nextInt();
                while (dist < 0 || dist > 23) {
                    System.out.println("Try again: ");
                    dist = in.nextInt();
                }
                out.write(play.getKey() + " " + play.getValue() + " " + dist
                        + "-foot " + twoP + "\n"); //file output
            } else { //THREES
                System.out.println("How far out was this three pointer?");
                int dist = in.nextInt();
                while (dist >= 95 || dist <= 23) {
                    System.out.println("Try again: ");
                    dist = in.nextInt();
                }
                out.write(play.getKey() + " " + play.getValue() + " " + dist
                        + "-foot three pointer \n"); //file output
            }
        } else if (play.getValue().equals("steps")) {
            out.write(play.getKey() + " " + play.getValue()
                    + " out of bounds. Turnover. \n");
        } else if (play.getValue().equals("commits")) {
            System.out.println(
                    "Did " + play.getKey() + " commit a foul or a turnover?");
            String commit = in.nextLine();
            while (!commit.equals("foul") && !commit.equals("turnover")) {
                System.out.println("Try again: ");
                commit = in.nextLine();
            }
            if (commit.equals("foul")) {
                System.out.println(
                        "What kind of foul did " + play.getKey() + " commit?");
                System.out.print("Must be ");
                for (String f : fouls) {
                    System.out.print(f + " ");
                }
                System.out.println();
                String foul = in.nextLine();
                while (!fouls.contains(foul)) {
                    System.out.println("Try again: ");
                    foul = in.nextLine();
                }
                out.write(play.getKey() + " commits " + foul + " foul\n");
            } else {
                System.out.println("What kind of turnover did " + play.getKey()
                        + " commit?");
                System.out.println("Must be ");
                for (String t : turnover) {
                    System.out.print(t + " ");
                }
                System.out.println();
                String turn = in.nextLine();
                while (!turnover.contains(turn)) {
                    System.out.println("Try again: ");
                    turn = in.nextLine();
                }
                out.write(play.getKey() + " commits " + turn + " turnover\n");
            }
        } else if (play.getValue().equals("steals")) {
            out.write(play.getKey() + " steals ball\n");
        } else if (play.getValue().equals("comes out for")) {
            String sub = in.nextLine();
            while (starters.contains(sub) || !team.contains(sub)) {
                if (starters.contains(sub)) {
                    System.out.println(
                            "Cannot come in for already playing player. Try again.");
                } else {
                    System.out.println("Player not on roster. Try again.");
                }
                sub = in.nextLine();
            }
            out.write(play.getKey() + " comes out for " + sub);
            starters.remove(play.getKey());
            starters.add(sub);

        }
    }

    public static void main(String[] args) throws IOException {
        //Pair<String, Integer> p = new Pair("Pistons", 0);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String file = in.nextLine();
        while (!file.substring(file.length() - 4).equals(".txt")) {
            System.out.println("Enter file name: ");
            file = in.nextLine();
        }
        BufferedWriter write = new BufferedWriter(new FileWriter(file));

        System.out.println("Enter home team: ");
        String team1 = in.nextLine();
        Map<String, Set<String>> rosters = rosters();
        while (!rosters.keySet().contains(team1)) {
            System.out.println("Re-input team name: ");
            team1 = in.nextLine();
        }
        Set<String> homeTeam = rosters.get(team1);
        System.out.println(homeTeam);
        System.out.println("Enter away team: ");
        String team2 = in.nextLine();
        while (team2.equals(team1) || !rosters.keySet().contains(team2)) {
            System.out.println("Re-input team name: ");
            team2 = in.nextLine();
        }
        Set<String> awayTeam = rosters.get(team2);
        System.out.println(awayTeam);

        Set<String> verbs = verbs();
        System.out.println();
        Set<String> homeStarters = starters(homeTeam, in, team1);
        System.out.println();
        Set<String> awayStarters = starters(awayTeam, in, team2);
        System.out.println();
        int i = 0;
        while (i == 0) {
            System.out.println(
                    "Type which team just made an action. Otherwise type 'Game Over' to end game");
            String team = in.nextLine();
            while (!team.equals(team1) && !team.equals(team2)
                    && !team.equals("Game Over")) {
                System.out.println("Not a valid choice");
                team = in.nextLine();
            }
            if (team.equals("Game Over")) {
                write.write("GAME OVER");
                i++;

            } else {
                if (team.equals(team1)) {
                    Pair<String, String> action = genParser(in, homeStarters,
                            verbs);
                    parser(in, action, homeStarters, scoreTypes(), turnovers(),
                            fouls(), homeTeam, write);
                } else {
                    Pair<String, String> action = genParser(in, awayStarters,
                            verbs);
                    parser(in, action, awayStarters, scoreTypes(), turnovers(),
                            fouls(), awayTeam, write);
                }
            }
        }
        write.close();

    }

}
