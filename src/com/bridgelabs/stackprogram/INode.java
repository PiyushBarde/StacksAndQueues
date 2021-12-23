package com.bridgelabs.stackprogram;

public interface INode<T extends Comparable> {
    T getKey();
    void setKey(T key);

    INode getNext();
    void setNext(INode next);


}
