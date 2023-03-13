package org.example.factoryMethod;

public abstract class CalculatorCreator {

    public abstract BasicCalculator createBasicCalculator();

    public abstract ScientificCalculator createScientificCalculator();

    public abstract ProgrammerCalculator createProgrammerCalculator();

}
