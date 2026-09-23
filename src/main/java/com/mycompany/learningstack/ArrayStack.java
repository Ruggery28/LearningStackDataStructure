/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learningstack;

/**
 *
 * @author Ruggery
 */
public class ArrayStack {

    //creating the two variables, one array and the top.
    private int[] stackArray; //empty array and no size has been set up yet.
    private int top; //the top could have been initialised here as well = -1.

    //constructor to initialise the size and also the top
    public ArrayStack(int capacity) {
        stackArray = new int[capacity];
        top = -1; // Indicates stack is initially empty
    }

    //method to check if the stack is empty by returning true or false
    public boolean isEmpty() {
        return top == -1;
    }

    //method to check if the stack is full, by comparing the size of the array to the top value plus 1.
    public boolean isFull() {
        return stackArray.length == top + 1;
    }

    //method push that will receive the value that will be stored.
    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full!");
        }
        top++; //increasing the top, previous value + 1.
        stackArray[top] = value; //it will add the value inside the index represented by the 'top' value.
    }

    //method pop to remove a value inside the array.
    public int pop() {
        //if method to check if isEmpty is true, if so, throw the error message otherwise contunie the code.
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        } else {
            int indexValue = stackArray[top]; //saving the last value inside the array.
            top--; //decreasing the size of top.
            return indexValue; //return the value we deleted just in case we need to fix it.
        }
    }

    //method to return the last element in the array, check first if it is empty.
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return stackArray[top]; //returning the last elemenet according with the value of top.
    }

    //a method to display all the elements inside the array.
    public void display() {
        //check fist if it is empty, return the error message if so.
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        //using for to go through the array but only using top as references instead of checking all the size of the array.
        System.out.printf("[");
        for (int i = 0; i < top + 1; i++) {
            //just a if to print the last element with the ] in the end.
            if (i == top + 1) {
                System.out.printf("%d ]", stackArray[i]);
            } else {
                System.out.printf("%d, ", stackArray[i]);
            }
        }
        //in this case I want the sintax to be printed one after another instead of one in each line [.. , ..]
    }
}
