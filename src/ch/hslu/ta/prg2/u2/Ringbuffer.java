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
public class Ringbuffer<T> {

    private T[] queue;
    private int size;
    private int head;
    private int tail;
    private int nbrElt;
    
    public Ringbuffer(int size){
        queue = (T[]) new Object[size];
        this.size = size;
        head = 0;
        tail = 0;
        nbrElt = 0;
    }
    
    public void enqueue(T x) {
    // Fügt x am Ende in die Warteschlange ein,
    // falls die Warteschlange nicht voll ist;
        if (!isFull()){
            nbrElt++;
            queue[tail % size] = x;
            tail++;
        } else {
            System.out.println("Die Warteschlange ist voll!");
        }
    }

    public T dequeue() {
    // Entfernt das erste Element aus der Warteschlange,
    // falls die Warteschlange nicht leer ist;
        if (!isEmpty()){
            nbrElt--;
            T temp = queue[head % size];
            head++;
            return temp;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        //liefert true genau dann, wenn die Warteschlange kein Element enthält
        return nbrElt == 0;
    }

    public boolean isFull() {
    //liefert true genau dann, wenn die Warteschlange voll ist
        return nbrElt == size;
    }
    
    /**
     * Main Methode für rudimentäre Tests
     * @param args 
     */
    public static void main(String[] args){
        Ringbuffer<String> rb1 = new Ringbuffer(4);
        //System.out.println("A.A. hinzufügen");
        rb1.enqueue("A.A.");
        rb1.enqueue("YLA");
        rb1.enqueue("M.B.");
        System.out.println("warteschlange ist voll: " + rb1.isFull());
        rb1.enqueue("S.F.");
        System.out.println("warteschlange ist voll: " + rb1.isFull());
        System.out.println(rb1.dequeue());
        System.out.println(rb1.dequeue());
        System.out.println(rb1.dequeue());
        rb1.enqueue("S.F.");
        System.out.println(rb1.dequeue());
    }
}
