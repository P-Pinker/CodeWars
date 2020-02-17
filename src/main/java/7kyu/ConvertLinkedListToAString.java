//Create a function stringify which accepts an argument list/$list and returns a string representation of the list. The string representation of the list starts with the value of the current Node, specified by its data/$data/Data property, followed by a whitespace character, an arrow and another whitespace character (" -> "), followed by the rest of the list. The end of the string representation of a list must always end with null/NULL/None/nil/nullptr/null() (all caps or all lowercase depending on the language you are undertaking this Kata in). For example, given the following list:
//
//new Node(1, new Node(2, new Node(3)))
//
//... its string representation would be:
//
//"1 -> 2 -> 3 -> null"
//
//And given the following linked list:
//
//new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
//
//... its string representation would be:
//
//"0 -> 1 -> 4 -> 9 -> 16 -> null"



import java.util.Arrays;
import java.util.List;

public class ConvertLinkedListToAString {

    public static String stringify(Node list) {

        StringBuilder nl = new StringBuilder();
        while(list != null){
            nl.append(list.getData());
            nl.append(" -> ");
            list = list.getNext();
        }
        nl.append("null");
        return nl.toString();
    }
}


class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}