/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.learningstack;

import java.util.Scanner;

/**
 *
 * @author Ruggery
 */
public class LearningStack {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=== Welcome to learning Stack Array ===");
        System.out.printf("Enter the size of the Array: ");
        int size = scan.nextInt();
        scan.nextLine(); //clean the buffer

        //Initialising the object in the class and sneding the size to the constructor.
        ArrayStack array = new ArrayStack(size);

        //I am not checking if the user insert a negative number, but while it is > 0 it will go to the while.
        while (size > -1) {
            System.out.println("=== Menu Options ===");
            System.out.println("Enter 1. Push");
            System.out.println("Enter 2. Pop");
            System.out.println("Enter 3. Peak");
            System.out.println("Enter 4. Display");
            System.out.println("Enter 5. Exit");
            System.out.printf("Enter your option: ");
            int option = scan.nextInt();
            scan.nextLine(); //clean the buffer
            
            //switch case to check the menu options and redirect to the methods.
            switch(option){
                case 1: {
                    System.out.printf("Push a number: ");
                    int number = scan.nextInt();
                    array.push(number);
                    break;
                }    
                case 2: {
                    System.out.println("Number deleted: " + array.pop());
                    break;
                }
                case 3:{
                    System.out.println(array.peek());
                    break;
                }
                case 4: {
                    array.display();
                    break;
                }
                case 5:{
                    System.out.println("Exiting the program...");
                    scan.close();
                    return;
                }
                default:{
                    System.out.println("Enter a valid number.");
                }
            }
        }

    }
}
