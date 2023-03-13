package org.example.factoryMethod;

public class ProgrammerWindowsCalculator implements  ProgrammerCalculator{

    @Override
    public int calculate(String operation) {
        System.out.println("Programmer Windows calculator calculate method");
        return 0;
    }
}
