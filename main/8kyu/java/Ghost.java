//Color Ghost
//
//Create a class Ghost
//
//Ghost objects are instantiated without any arguments.
//
//Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated
//
//Ghost ghost = new Ghost();
//ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
//

import java.util.Random;

public class Ghost {

    private String color;
    String[] colors = {"white", "yellow", "purple", "red"};

    public Ghost(){
        this.color = getColor();
    }

    public String getColor(){
        String color = (colors[new Random().nextInt(colors.length)]);
        return color;
    }
}
