/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learningstack;

/**
 *
 * @author Ruggery
 */
public class LinkedListStack {

    //Class that will  contain the linkedList
    private static class Node {

        int data; //hold the value
        Node next; //hold the pointer to the value

        //constructor to insert a value to data, starting the pointer as null, because it hasnt received anything yet.
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; //this will be our variable for the stack

    public LinkedListStack() {
        this.top = null; //Also start as null
    }

    public boolean isEmpty() {
        return top == null; //is top is null return true
    }

    public void push(int value) {
        Node node = new Node(value); //passing the value to the data
        node.next = top; //making the next to be linked with top (still null)
        top = node; //the top now will be the last node
    }

    public int pop() {
        //check first if the stack is empty before trying to look into the data
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        int holdValue = top.data; //save the top value inside the new variable
        top = top.next; //updating top so it now hold the down value
        return holdValue; //then, returning the value in case we need to undo that.
    }

    public int peek() {
        //check first if the stack is empty before trying to look into the data
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return top.data; //it will display the top value in our stack.
    }

    public void display() {
        //check first if the stack is empty before trying to look into the data
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        
        Node current = top; //a new object to hold the last top value
        //while there is a value we go through the loop
        while(current != null){
            System.out.println(current.data + "--> "); //print the current top data
            current = current.next; //now the current value will hold the previous next
        }
        System.out.println("Null.");
    }

}
