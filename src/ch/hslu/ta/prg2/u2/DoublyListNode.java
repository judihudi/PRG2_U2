/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ta.prg2.u2;

/**
 *
 * @author Marco Büeler <marco.bueeler@stud.hslu.ch>
 */
public class DoublyListNode<T> {
    public T data;
    public DoublyListNode<T> next;
    public DoublyListNode<T> prev;
    
    /**
     * Konstruktor für ListNode
     * @param next
     * @param prev
     * @param data 
     */
    public DoublyListNode(DoublyListNode<T> next, DoublyListNode<T> prev, T data) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    } 
}