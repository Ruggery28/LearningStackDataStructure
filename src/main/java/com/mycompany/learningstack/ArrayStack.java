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
    //creating the two
    private int[] stackArray;
    private int top;

    public ArrayStack(int capacity) {
        stackArray = new int[capacity];
        top = -1; // Indicates stack is initially empty
    }

    public void push(int value) {
        top++; 
        stackArray[top] = value;
    }
}
