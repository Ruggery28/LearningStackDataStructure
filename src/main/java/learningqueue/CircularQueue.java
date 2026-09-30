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
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.storage = new FoodItem[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    //checking if the queue is full
    public boolean isFull() {
        return count == capacity;
    }

    //checking if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    //method to push an item inside the queue
    public void enqueue(FoodItem food) {
        //check if queue is full, if true return error
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }
        //currently rear will add +1 and module with capacity = reminder of that operation
        rear = (rear + 1) % capacity; //update rear
        storage[rear] = food; //insert the food item inside the array
        count++; //update the count to know how many itens 
    }

    //method to remove an item from the queue
    public FoodItem dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        FoodItem previousItem = storage[front]; //saved the item before deliting in case I need it
        storage[front] = null; //cleaning up the memory reference from the storage
        front = (front + 1) % capacity; //move front forward to the loop
        count--; //decrease the numbers of items in the storage

        return previousItem; //return the item just in case need to restore it
    }

    //method peek to see the front value
    public FoodItem peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        //return the front item from the array
        return storage[front];

    }

    //method to display all the items
    public void display() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        //I know this is not the best approach, but it was the way I thought while learning the concepts
        //I will change it later when I am doing some adjustments into this code.
        int counter = count;
        
        for (int c = front; counter!= 0;) {
            if (storage[c] != null) {
                System.out.println(storage[c].toString());
            }
            c = (c + 1) % capacity;
            counter--;
        }

    }
}
