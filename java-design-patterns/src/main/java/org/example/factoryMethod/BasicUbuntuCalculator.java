package org.example.factoryMethod;

public class BasicUbuntuCalculator implements BasicCalculator{
    @Override
    public int calculate(String operation) {
        System.out.println("Ubuntu Basic Calculator calculate method");
        return 0;
    }
}
