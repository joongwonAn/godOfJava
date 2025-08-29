package com.sprint.jw.godofjava.Volume1.Chapter06;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();
        int day = 1;
        while (day < 366) {
            System.out.println("day " + day + ": " + interestManager.calculateAmount(day, 1000000));
            day += 10;
        }
    }

    public double getInterestRate(int day) {
        double interestRate = 0.0;
        if (1 <= day && day <= 90) {
            interestRate = 0.5;
        } else if (90 < day && day <= 180) {
            interestRate = 1.0;
        } else if (180 < day && day <= 364) {
            interestRate = 2.0;
        } else if (364 < day) {
            interestRate = 5.6;
        } else {
            System.out.println("Invalid day");
        }
        return interestRate;
    }

    public double calculateAmount(int day, long amount) {
        return amount + (amount * getInterestRate(day) /100.0);
    }
}
