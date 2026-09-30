/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningqueue;

/**
 *
 * @author Ruggery
 */
public class CircularQueue {
    
    private FoodItem[] storage; //array that will store the objects from FoodItem class.
    private int front; //track the first index
    private int rear; //track the rear index(the adding)
    private int capacity; //track the size of capacity
    private int count; //track the counting
    
    //constructor receiving the capatiy to create the array size 
    public CircularQueue(int capacity){
        this.capacity = capacity;
        this.storage = new FoodItem[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0; 
    }
    
    public boolean isFull(){
        return count == capacity;
    }
    
    public void enqueue(FoodItem food){
        //check if queue is full, if true return error
        if(isFull()){
            throw new IllegalStateException("Queue is full!");
        }
        //currently rear will add +1 and module with capacity = reminder of that operation
        rear = (rear + 1) % capacity; //update rear
        storage[rear] = food; //insert the food item inside the array
        count ++; //update the count to know how many itens 
    }
    
    
    
}
