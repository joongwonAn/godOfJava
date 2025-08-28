package com.sprint.jw.godofjava.Volume1.Chapter05;

public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement operatorIncrement = new OperatorIncrement();
        operatorIncrement.increment();
    }

    public void increment() {
        int intValue = 1;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }
}
