package com.bridgelabs.stackprogram;

public class MyNode<T extends Comparable> implements INode<T>{
    private T key;
    private INode next;

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }
    public INode<T> getNext() {
        return next;
    }

    public void setNext(INode next)
    {
        this.next = (MyNode<T>)next;
    }

    public MyNode(T key) {
        this.key = key;
        this.next = null;

    }
}
