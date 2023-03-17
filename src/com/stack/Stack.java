package com.stack;

public class Stack {

    MyLinkedList list =new MyLinkedList<>();
    public void push(Object data){
        list.addLast(data);
    }
    public void display() {
        list.printNode();
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
    }
}
