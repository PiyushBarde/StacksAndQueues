package com.bridgelabs.stackprogram;

public class MyStackMain {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);


        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        System.out.println("previous : ");
        myStack.printMyNode();
        System.out.println("peak:" + myStack.peak().getKey());
        System.out.println("after '' .pop ''");
        myStack.pop();
        myStack.printMyNode();

    }
}
