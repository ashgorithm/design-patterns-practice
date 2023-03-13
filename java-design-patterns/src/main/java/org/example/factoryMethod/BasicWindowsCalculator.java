package org.example.factoryMethod;

public class BasicWindowsCalculator implements BasicCalculator{
    @Override
    public int calculate(String operation) {
        System.out.println("Windows Basic calculate method");
        return 0;
    }
}
