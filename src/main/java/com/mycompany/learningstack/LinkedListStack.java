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

    public LinkedListStack(Node top) {
        this.top = null; //Also start as null
    }

    
    
    
    
}
