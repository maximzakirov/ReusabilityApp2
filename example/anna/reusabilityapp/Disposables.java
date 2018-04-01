package com.example.anna.reusabilityapp;

/**
 * Created by anna on 3/31/18.
 */

public abstract class Disposables {
    private int counter;

    public Disposables(){
        counter = 0;
    }

    public int getCounter(){
        return counter;
    }

    public void addToCounter() {
        counter++;
    }
}
