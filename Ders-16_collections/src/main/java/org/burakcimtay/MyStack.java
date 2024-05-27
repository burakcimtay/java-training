package org.burakcimtay;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stackList = new Stack<>();
        stackList.push("Burak");
        stackList.push("Oğuzhan");
        stackList.push("Barış");
        stackList.push("Mehmet");

        stackList.add(3, "Emre");

        System.out.println(stackList);

        stackList.pop();

        System.out.println(stackList);

        System.out.println(stackList.peek());
        System.out.println(stackList.search("Burak"));
        System.out.println(stackList.search("Fevzi"));
        System.out.println(stackList.empty());

    }
}
