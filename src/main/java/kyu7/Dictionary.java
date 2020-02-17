package kyu7;//In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:
//
//>>> Dictionary d = new Dictionary();
//
//>>> d.newEntry("Apple", "A fruit that grows on trees");
//
//>>> System.out.println(d.look("Apple"));
//A fruit that grows on trees
//
//>>> System.out.println(d.look("Banana"));
//Cant find entry for Banana
//
//Good luck and happy coding!


import java.util.HashMap;
import java.util.Map;


public class Dictionary{

    private String name;
    private String entry;
    private String output;
    Map<String, String> dictionary = new HashMap<String, String>();

    public void newEntry(String name, String entry){
        this.name = name;
        this.entry = entry;
        dictionary.put(name, entry);
    }

    public String look(String name){
        if (dictionary.isEmpty()){
            output = ("Cant find entry for " + name);
            return output;
        } else if (!dictionary.containsKey(name)){
            output = ("Cant find entry for " + name);
            return output;
        } else System.out.println(dictionary.get(name));
        return entry;

    }

}