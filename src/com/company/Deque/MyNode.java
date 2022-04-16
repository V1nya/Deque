package com.company.Deque;

public class MyNode<T> {
    private final T value ;
    private MyNode next = null;
    private MyNode prev =null;

    public MyNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public MyNode<T> getNext(){
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public MyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyNode<T> prev) {
        this.prev = prev;
    }

}
