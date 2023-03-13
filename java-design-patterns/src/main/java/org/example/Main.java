package org.example;

import org.example.Singleton.SingletonCache;
import org.example.factoryMethod.*;

public class Main {

    private static void testSingleton(){
        SingletonCache globalCache = SingletonCache.getInstance();
        globalCache.setValue("color", "blue");
        System.out.println(globalCache.getValue("color"));
        globalCache.setValue("font", "Roboto");
        System.out.println(globalCache.getValue("font"));
        SingletonCache<String, Integer> globalCach1 = SingletonCache.getInstance();
        globalCach1.setValue("width", 100);
        System.out.println(globalCach1.getValue("width"));
        System.out.println(globalCach1.getValue("color"));

//        SingletonCache singletonCache2 = globalCache.clone()
    }

    private static CalculatorCreator getCalculatorCreator(String os){
        if (os == "ubuntu"){
            return new UbuntuCalculatorCreator();
        } else if (os == "windows") {
            return new WindowsCalculatorCreator();
        }
        return null;
    }
    private static void testFactoryMethod(){
        //test ubuntu calculators
        String os = "ubuntu";
//        String os = "windows";
        CalculatorCreator calculatorCreator = getCalculatorCreator(os);
        BasicCalculator basicCalculator = calculatorCreator.createBasicCalculator();
        basicCalculator.calculate("add");
        ScientificCalculator scientificCalculator = calculatorCreator.createScientificCalculator();
        scientificCalculator.calculate("add");
        ProgrammerCalculator programmerCalculator = calculatorCreator.createProgrammerCalculator();
        programmerCalculator.calculate("add");
    }
    public static void main(String[] args) {
        testSingleton();
        testFactoryMethod();
    }
}