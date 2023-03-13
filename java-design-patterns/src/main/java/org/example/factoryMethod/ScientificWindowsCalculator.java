package org.example.factoryMethod;

public class ScientificWindowsCalculator implements  ScientificCalculator{
    @Override
    public int calculate(String operation) {
        System.out.println("Scientific windows caluculator calculate method");
        return 0;
    }

    @Override
    public double log(double x) {
        System.out.println("Scientific windows calculator log method");
        return 0;
    }
}
