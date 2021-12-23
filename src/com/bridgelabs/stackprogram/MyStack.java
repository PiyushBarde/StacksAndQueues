package com.bridgelabs.stackprogram;

public class MyStack {
    private static CreatingLinkList creatingLinkList;

    public MyStack() {
        creatingLinkList = new CreatingLinkList();
    }


    public static void push(INode myNode){
        creatingLinkList.add(myNode);

    }
    public void printMyNode(){
        creatingLinkList.printMyNode();
    }
    public INode peak(){
        return creatingLinkList.head;
    }
}
