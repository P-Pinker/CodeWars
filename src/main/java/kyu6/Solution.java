package kyu6;//Implement the method map, which accepts a linked list (head) and a mapping function, and returns a new linked list (head) where every element is the result of applying the given mapping method to each element of the original list.
//
//Make sure you do not modify the original list!
//
//For example: Given the list: 1 -> 2 -> 3, and the mapping function x => x * 2, map should return 2 -> 4 -> 6
//
//The linked list is defined as follows:

import java.util.function.Function;

public class Solution {

    static <T, R> NodeS<R> map(NodeS<T> head, Function<T, R> f) {

        while (head != null) {
            return new NodeS(f.apply(head.data), map(head.next, f));
        }
        return null;
    }
}


class NodeS<T> {
    public T data;
    public NodeS<T> next;

    NodeS(T data, NodeS next) {
        this.data = data;
        this.next = next;
    }

    NodeS(T data) {
        this(data, null);
    }
}