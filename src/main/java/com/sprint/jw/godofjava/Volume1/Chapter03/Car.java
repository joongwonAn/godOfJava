package com.sprint.jw.godofjava.Volume1.Chapter03;

public class Car {
    int speed;
    int distance;
    String color;

    public Car() {

    }

    public void speedUp() {
        speed += 5;
    }

    public void breakeDown() {
        speed -= 10;
    }

    public int getCurrentSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car dogCar = new Car();
        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakeDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}
