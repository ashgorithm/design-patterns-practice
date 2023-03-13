package org.example.factoryMethod;

public class WindowsCalculatorCreator extends CalculatorCreator{

    @Override
    public BasicCalculator createBasicCalculator() {
        return new BasicWindowsCalculator();
    }

    @Override
    public ScientificCalculator createScientificCalculator() {
        return new ScientificWindowsCalculator();
    }

    @Override
    public ProgrammerCalculator createProgrammerCalculator() {
        return new ProgrammerWindowsCalculator();
    }
}
