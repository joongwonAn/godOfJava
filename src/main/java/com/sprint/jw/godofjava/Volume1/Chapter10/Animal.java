package com.sprint.jw.godofjava.Volume1.Chapter10;

public class Animal {
    String name;
    String kind;
    int logCount;
    int iq;
    boolean hasWing;

    public static void main(String[] args) {

    }

    public void move() {
        System.out.println("Animal " + this.name + " is moving");
    }

    public void eatFood() {
        System.out.println("Animal " + this.name + " is eating");
    }
}
