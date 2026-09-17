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

    //method push that will receive the value that will be stored.
    public void push(int value) {
        top++; //increasing the top, previous value + 1.
        stackArray[top] = value; //it will add the value inside the index represented by the 'top' value.
    }
}
