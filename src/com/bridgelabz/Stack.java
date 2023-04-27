package com.bridgelabz;

public class Stack {
    LinkedList list = new LinkedList();
    public void add() {


        list.push(1);
        list.push(2);
        list.push(3);
        list.push(5);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add();
        stack.list.display();
    }
}
