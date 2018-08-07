//Late last night in the Tanner household, ALF was repairing his spaceship so he might get back to Melmac. Unfortunately for him, he forgot to put on the parking brake, and the spaceship took off during repair. Now it's hovering in space.
//
//ALF has the technology to bring the spaceship home if he can lock on to it's location.
//
//Given a map:
//
//..........
//..........
//..........
//.......X..
//..........
//..........
//
//The map will be given in the form of a string with \n separating new lines. The bottom left of the map is [0, 0]. X is ALF's spaceship.
//
//In this expample:
//
//findSpaceship(map) => "[7, 2]"
//
//If you cannot find the spaceship, the result should be
//
//"Spaceship lost forever."
//
//Can you help ALF?


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class EightiesKids2 {

    public static String findSpaceship(String map) {

        int y;

        List<String> galaxies = Arrays.asList(map.split("\n"));
        Collections.reverse(galaxies);

        for (int i = 0; i < galaxies.size(); i++) {
            if(galaxies.get(i).contains("X")) {
                y = i;
                String[] starSystem = galaxies.get(i).split("");
                for (int j = 0; j < starSystem.length; j++) {
                    if(starSystem[j].equals("X"))
                        return "[" + j + ", " + y + "]";
                }
            }
        }
        return "Spaceship lost forever.";
    }
}