package org.example;

import org.example.Singleton.SingletonCache;
import org.example.builder.Person;
import org.example.builder.PersonBuilder;

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

    private static void testBuilder(){
        Person person = new PersonBuilder("John", "Doe").setEmail("johndoe@gmail.com").setFacebookId("johndoe123").setCountry("USA").getResult();

        System.out.println(person);

        Person joseph = new PersonBuilder("joseph", "Smith").setEmail("joesph@gmail.com").getResult();

        System.out.println(joseph);


    }
    public static void main(String[] args) {


//        testSingleton();
        testBuilder();
    }
}