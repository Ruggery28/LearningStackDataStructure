/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learningqueue;

import java.util.Scanner;

/**
 *
 * @author Ruggery
 */
public class QueueStructure {

    /*This will be a project based on my assignment in class (computer science),
    The idea is to learn the concepts first before doing the project, this is the concept idea: 
        
    A fast-food restaurant provides five different types of food for parties: Burger, Pizza, Fries,
    Sandwich, and Hotdog. These food items are stored in a rectangular storage unit with two sides: 
    one at the front and one on the opposite side. However, the chef can either use the front side for 
    both adding and removing food items or use the front side for adding food items and the opposite side 
    for removing them. The storage can hold up to 8 trays at a time, and the food items have different 
    weights and names that must be tracked as they are placed into and removed from the storage. 
    The Java application should store each food item’s information, including its name, weight (grams), 
    the best-before date (maximum of two weeks), and the time it was placed into the storage.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularQueue queue = new CircularQueue(8);
        System.out.println("=== Welcome to the Storage food ===");

        while (true) {
            try {
                System.out.println("================== Menu ==================");
                System.out.println("Enter 01: Add a food to the tray.");
                System.out.println("Enter 02: Remove a food to the tray.");
                System.out.println("Enter 03: Peek the old item from the tray.");
                System.out.println("Enter 04: Display all the food from the tray.");
                System.out.println("Enter 05: To exit.");
                System.out.printf("Enter a valid option: ");
                String option = sc.nextLine();

                switch (option) {
                    case "1": {
                        System.out.printf("What food are you adding: ");
                        String foodName = sc.nextLine();
                        System.out.printf("What is its weight:[grams] ");
                        double foodWeight = sc.nextDouble();
                        sc.nextLine(); //clean the buffer
                        int expiredDay = 14;

                        FoodItem food = new FoodItem(foodName, foodWeight, expiredDay);
                        queue.enqueue(food);
                        break;
                    }
                    case "2": {
                        System.out.println("Item deleted: " + queue.dequeue());
                        break;
                    }
                    case "3": {
                        System.out.println("Front item: " + queue.peek());
                        break;
                    }
                    case "4": {
                        queue.display();
                        break;
                    }
                    case "5": {
                        System.out.println("Exiting the program...");
                        sc.close();
                        return;
                    }
                    default:{
                        System.out.println("Invalid option! Enter again!");
                    }
                }

            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

}
