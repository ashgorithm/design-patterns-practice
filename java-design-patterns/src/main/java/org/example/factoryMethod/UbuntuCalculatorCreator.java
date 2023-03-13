package org.example.factoryMethod;

public class UbuntuCalculatorCreator extends CalculatorCreator{

    @Override
    public BasicCalculator createBasicCalculator() {
        return new BasicUbuntuCalculator();
    }

    @Override
    public ScientificCalculator createScientificCalculator() {
        return new ScientificUbuntuCalculator();
    }

    @Override
    public ProgrammerCalculator createProgrammerCalculator() {
        return new ProgrammerUbuntuCalculator();
    }
}
