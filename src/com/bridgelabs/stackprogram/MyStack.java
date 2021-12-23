package com.bridgelabs.stackprogram;

public class MyStack {
    private final CreatingLinkList creatingLinkList;

    public MyStack() {
        this.creatingLinkList = new CreatingLinkList();
    }


    public  void push(INode myNode)
    {
        creatingLinkList.add(myNode);

    }
    public void printMyNode()
    {
        creatingLinkList.printMyNode();
    }
    public INode peak(){
        return creatingLinkList.head;
    }
    public void pop(){
        creatingLinkList.pop();
    }
}
