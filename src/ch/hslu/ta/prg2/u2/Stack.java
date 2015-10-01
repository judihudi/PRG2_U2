/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ta.prg2.u2;

import java.util.ArrayList;

/**
 *
 * @author Marco Büeler <marco.bueeler@stud.hslu.ch>
 */
public class Stack<T> {

    private int top;
    private ArrayList<T> stack;
   
    public Stack(){
        stack = new ArrayList<>();
        top = 0;
    }
    
    public void push(T s){
        stack.add(top, s);
        top++;
    }
    
    public T pop(){
        top--;
        return stack.get(top);
    }
    
    public boolean isEmpty(){
        return (top == 0);
    }
    
    public int getSize(){
        return top;
    }
    
    public void printStack(){
        for (int i = 0; i < top; i++){
            System.out.println(stack.get(i));
        }
    }
}
