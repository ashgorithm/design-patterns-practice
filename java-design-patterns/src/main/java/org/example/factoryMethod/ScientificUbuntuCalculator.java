package org.example.factoryMethod;

public class ScientificUbuntuCalculator implements ScientificCalculator{

    @Override
    public int calculate(String operation) {
        System.out.println("Scientific Ubuntu Calculator calculate method");
        return 0;
    }

    @Override
    public double log(double x) {
        System.out.println("Scientific Ubuntu Calculator log method");
        return 0;
    }
}
