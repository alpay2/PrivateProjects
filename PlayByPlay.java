import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import javafx.util.Pair;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class PlayByPlay {

    private static Map<String, String> pistons() {
        Map<String, String> team = new HashMap<>();
        String a = "Pistons";
        team.put("Blake Griffin", a);
        team.put("Andre Drummond", a);
        team.put("Reggie Jackson", a);
        team.put("Reggie Bullock", a);
        team.put("Glenn Robinson III", a);
        team.put("Jon Leuer", a);
        team.put("Stanley Johnson", a);
        team.put("Zaza Pachulia", a);
        team.put("Ish Smith", a);
        team.put("Jose Calderon", a);
        team.put("Luke Kennard", a);
        team.put("Bruce Brown", a);
        team.put("Langston Galloway", a);
        return team;
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

    private static Queue<Integer> foulShot() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(3);
        q.add(2);
        q.add(1);
        return q;
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
        f.add("out of bounds");
        f.add("offensive three seconds"); //technical FT
        f.add("traveling violation");
        f.add("double dribble violation");
        f.add("carrying violation");
        f.add("turnover"); //<opponent player> steals
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

    private static Pair<String, String> genParser(Scanner in, Set<String> team,
            Set<String> verbs) {
        System.out.println(
                "Type 'name' to keep writing plays or 'game over' to finsih");
        String choice = in.nextLine();
        while (!choice.equals("name") && !choice.equals("game over")) {
            System.out.println(
                    "Type 'name' to keep writing plays or 'game over' to finsih");
            choice = in.nextLine();
        }
        if (choice.equals("name")) {
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
        } else {
            Pair<String, String> ans = new Pair<String, String>("", "");
            return ans;
        }
    }

    //TODO: Add assists clause to made shots
    //      Add "commits", "steps", "enters game for", "steals", turnovers
    private static void parser(Scanner in, Pair<String, String> action,
            Set<String> team, Set<String> scoreTypes, Set<String> turnover,
            Set<String> fouls, BufferedWriter out) throws IOException {
        if (action.getValue().equals("grabs")) {
            String rebound = in.nextLine();
            while (!rebound.equals("defensive rebound")
                    && !rebound.equals("offensive rebound")) {
                rebound = in.nextLine();
            }
            out.write(action.getKey() + " " + action.getValue() + " " + rebound
                    + "\n"); //file output
        } else if (action.getValue().equals("makes")) {
            System.out.println(
                    "What kind of point did " + action.getKey() + " score?");
            String shot = in.nextLine();
            while (!scoreTypes().contains(shot)) {
                System.out.println("Re-input shot type");
                shot = in.nextLine();
            }
            if (shot.equals("free throws")) {
                System.out.println("How many free throws total is "
                        + action.getKey() + " is shooting?");
                int foul = in.nextInt();
                while (foul != 1 && foul != 2 && foul != 3) {
                    System.out.println("Try again: ");
                    foul = in.nextInt();
                }
                int i = 1;
                out.write(action.getKey() + " makes free throw " + i + " of "
                        + foul + "\n"); //file output
                while (i < foul) {
                    i++;
                    System.out.println("Does " + action.getKey()
                            + " make or miss free throw " + i);
                    String ft = in.nextLine();
                    while (!ft.equals("makes") && !ft.equals("misses")) {
                        System.out.println("Try again: ");
                        ft = in.nextLine();
                    }
                    out.write(action.getKey() + " " + ft + " free throw " + i
                            + " of " + foul + "\n"); //file output
                }
            } else if (shot.equals("two point shot")) {
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
                out.write(action.getKey() + " " + action.getValue() + " " + dist
                        + "-foot " + twoP + "\n"); //file output
            } else {
                System.out.println("How far out was this three pointer?");
                int dist = in.nextInt();
                while (dist >= 95 || dist <= 23) {
                    System.out.println("Try again: ");
                    dist = in.nextInt();
                }
                out.write(action.getKey() + " " + action.getValue() + " " + dist
                        + "-foot three pointer \n"); //file output
            }
        } else if (action.getValue().equals("misses")) {
            System.out.println(
                    "What kind of point did " + action.getKey() + " miss?");
            String shot = in.nextLine();
            while (!scoreTypes().contains(shot)) {
                System.out.println("Re-input shot type");
                shot = in.nextLine();
            }
            if (shot.equals("free throws")) {
                System.out.println("How many free throws total is "
                        + action.getKey() + " is shooting?");
                int foul = in.nextInt();
                while (foul != 1 && foul != 2 && foul != 3) {
                    System.out.println("Try again: ");
                    foul = in.nextInt();
                }
                int i = 1;
                out.write(action.getKey() + " misses free throw " + i + " of "
                        + foul + "\n"); //file output
                while (i < foul) {
                    i++;
                    System.out.println("Does " + action.getKey()
                            + " make or miss free throw " + i);
                    String ft = in.nextLine();
                    while (!ft.equals("makes") && !ft.equals("misses")) {
                        System.out.println("Try again: ");
                        ft = in.nextLine();
                    }
                    out.write(action.getKey() + " " + ft + " free throw " + i
                            + " of " + foul + "\n"); //file output
                }
            } else if (shot.equals("two point shot")) {
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
                out.write(action.getKey() + " " + action.getValue() + " " + dist
                        + "-foot " + twoP + "\n"); //file output
            } else {
                System.out.println("How far out was this three pointer?");
                int dist = in.nextInt();
                while (dist >= 95 || dist <= 23) {
                    System.out.println("Try again: ");
                    dist = in.nextInt();
                }
                out.write(action.getKey() + " " + action.getValue() + " " + dist
                        + "-foot three pointer \n"); //file output
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Pair<String, Integer> p = new Pair("Pistons", 0);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String file = in.nextLine();
        while (!file.substring(file.length() - 4).equals(".txt")) {
            System.out.println("Enter file name: ");
            file = in.nextLine();
        }
        BufferedWriter write = new BufferedWriter(new FileWriter(file));
        Map<String, String> team = pistons();
        Set<String> keySet = team.keySet();
        Set<String> verbs = verbs();
        int i = 0;
        while (i == 0) {
            Pair<String, String> action = genParser(in, keySet, verbs);
            if (action.getKey().equals("")) {
                write.write("GAME OVER");
                i++;
            } else {
                parser(in, action, keySet, scoreTypes(), turnovers(), fouls(),
                        write);

            }
        }
        write.close();

    }

}
