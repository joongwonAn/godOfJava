package com.sprint.jw.godofjava.Volume1.Chapter05;

public class SalaryManager {

    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        System.out.println(salaryManager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;
        double allTax = calculateTax(monthlySalary) + calculateNationalPension(monthlySalary) + calculateHealthInsurance(monthlySalary);
        monthlySalary -= allTax;

        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        double tax = monthlySalary * 0.125;
        System.out.println("근로 소득세: " + tax);
        return tax;
    }

    public double calculateNationalPension(double monthlySalary) {
        double nationalPension = monthlySalary * 0.081;
        System.out.println("국민 연금: " + nationalPension);
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        double healthInsurance = monthlySalary * 0.135;
        System.out.println("건강 보혐료: " + healthInsurance);
        return healthInsurance;
    }
}
