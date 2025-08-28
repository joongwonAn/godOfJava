package com.sprint.jw.godofjava.Volume1.Chapter05;

public class OperatorCompound {
    public static void main(String[] args) {
        OperatorCompound operatorCompound = new OperatorCompound();
        operatorCompound.compound();
    }

    public void compound() {
        int intValue = 10;
        intValue += 5;
        System.out.println(intValue);
        intValue -= 5;
        System.out.println(intValue);
        intValue *= 5;
        System.out.println(intValue);
        intValue /= 5;
        System.out.println(intValue);
        intValue %= 5;
        System.out.println(intValue);
    }
}
