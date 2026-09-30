/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningqueue;

import java.time.LocalDateTime;

/**
 *
 * @author Ruggery
 */
public class FoodItem {

    //itens created based on the requirements.  
    private String name;
    private double weight;
    private LocalDateTime bestBeforeDate;
    private LocalDateTime timeAdded;

    //constructor to receive those parameters
    public FoodItem(String name, double weight, int daysValid) {
        this.name = name;
        this.weight = weight;
        this.timeAdded = LocalDateTime.now();
        //this will calculate and save how many days left
        this.bestBeforeDate = timeAdded.plusDays(daysValid);
    }

    //getters to get the information as we need
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDateTime getBestBeforeDate() {
        return bestBeforeDate;
    }

    public LocalDateTime getTimeAdded() {
        return timeAdded;
    }

    @Override
    public String toString() {
        return name + ": (" + weight + "g) | Added: " + timeAdded.toLocalTime() + " | Best Before: " + bestBeforeDate.toLocalDate();
    }

}
