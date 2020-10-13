/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketBooking;

/**
 *
 * @author Harsh007
 */
import java.util.ArrayList;
//import java.util.Scanner;

public class Queue<T> extends TicketBooking{
    private ArrayList<T> arr;

    public Queue() {
        arr = new ArrayList<T>();
    }

    public void enqueue(T e) {
        arr.add(e);
    }

    public T dequeue() {
        return arr.remove(0);
    }

    public boolean empty() {
        return arr.isEmpty();
    }

    public static void main(String[] args) {
       
    }
}