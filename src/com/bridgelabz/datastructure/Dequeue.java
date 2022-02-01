package com.bridgelabz.datastructure;

public class Dequeue<E>{
    public E data;
    public Dequeue<E>next;
    public Dequeue<E>pre;

    public Dequeue() {
        this.next=null;
        this.pre=null;
    }
    public Dequeue(E val) {
        this.data=val;
        this.next=null;
        this.pre=null;
    }
}
