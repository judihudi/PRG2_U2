/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ta.prg2.u2;

import java.util.Random;

/**
 *
 * @author Marco Büeler <marco.bueeler@stud.hslu.ch>
 */
public class DoublyLinkedList<T> {
    private DoublyListNode<T> head;
    private DoublyListNode<T> tail;
    private Random rand;
    
    public DoublyLinkedList(){
        head = null;
        tail = null;
        rand = new Random();
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    /**
     * Fügt ein Node an erster Position ein. (Prev node ist immer null)
     * @param data 
     */
    public void insertFirst(T data){
        if(isEmpty()){
            head = new DoublyListNode<T>(head, null, data);
            tail = head;
        } else {
            head = new DoublyListNode<T>(head, null, data);
            head.next.prev = head;
        }
        
    }
    
    /**
     * Fügt ein Node an letzter Position ein. (Next node ist immer null)
     * @param data 
     */
    public void insertLast(T data){
        if(isEmpty()){
            tail = new DoublyListNode<T>(null, tail, data);
            head = tail;
        } else{
            tail = new DoublyListNode<T>(null, tail, data);
            tail.prev.next = tail;
        }
        
    }
    
    /**
     * Fügt ein Node an einer beliebigen Position zwischen dem ersten
     * und dem letzten ein.
     * @param data 
     */
    public void insertElsewhere(T data){
        if(isEmpty()){
            insertFirst(data);
        } else{
            DoublyListNode newNode = new DoublyListNode<T>(null, null, data);
            //Random Wert von 1 bis ('Anzahl Nodes'-1)
            int n = rand.nextInt(getLength()-1)+1;
            DoublyListNode<T> currentNode = head;
            for(int i = 0; i < n; i++){
                currentNode = currentNode.next;
            }
            newNode.next = currentNode;
            newNode.prev = currentNode.prev;
            currentNode.prev.next = newNode;
            currentNode.prev = newNode;
        }
        
    }
    /**
     * Entfernt ein Node an erster Position ein.
     */
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Die Liste enthält keine Elemente");
        } else {
            head = head.next;
            //Zweites Element (falls vorhanden, sonst 'null') wird als head gesetzt
            if(isEmpty()){
                tail = null;
                //Falls liste nun leer ist, wird der tail auch auf null gesetzt
            } else {
                head.prev = null;
                //sonst wird der zweite als head gesetzt (kein vorgänger element)
            }
        }
    }
    
    public int getLength(){
        int count = 0;
        DoublyListNode<T> currentNode = head;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }
    
    public void printForward(){
        DoublyListNode<T> currentNode = head;
        System.out.println("Liste vorwärts ausgeben");
        while(currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.next;
        }
    }
    
    public void printBackward(){
        DoublyListNode<T> currentNode = tail;
        System.out.println("Liste rückwärts ausgeben");
        while(currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.prev;
        }
    }
    
    
    public static void main(String[] args){
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.insertFirst("Erster Node");
        list.insertFirst("Ersterer Node");
        list.insertLast("Letzter Node");
        list.insertFirst("Erstererer Node");
        //list.insertLast("Letzterer Node");
        list.insertElsewhere("irgendwo Node");
        list.printForward();
        System.out.println();
        //list.printBackward();
        //System.out.println();
    }
    
}
