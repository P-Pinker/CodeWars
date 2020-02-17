package kyu6;//Implement the method reduce, which accepts three arguments:
//
//linked list (head)
//bi-function - (accumulated_value, current_element_data)
//initial value
//
//This method should return the result of applying the given function on every element with the accumulating result, starting with the initial value.
//
//For example:
//
//Given the list: 1 -> 2 -> 3, the function (acc, curr) => acc + curr and an initial value of 0, reduce should return 6, because:
//
//(0, 1) and the function (acc, curr) => acc + curr gives 1
//(1, 2) and the function (acc, curr) => acc + curr gives 3
//(3, 3) and the function (acc, curr) => acc + curr gives 6
//
//Another example:
//
//Given the list: 1 -> 2 -> 3 -> 4, the function (acc, curr) => acc * curr and an initial value of 1, reduce should return 24
//
//The linked list is defined as follows:


import java.util.function.BiFunction;

class Solution2 {
    static <T> T reduce(NodeR<T> head, BiFunction<T, T, T> f, T init) {

        while (head != null) {
            init = f.apply(init,head.data);
            head = head.next;
        }
        return init;
    }
}

class NodeR<T> {
    public T data;
    public NodeR<T> next;

    NodeR(T data, NodeR next) {
        this.data = data;
        this.next = next;
    }

    NodeR(T data) {
        this(data, null);
    }
}