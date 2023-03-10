package org.example;

import org.example.Singleton.SingletonCache;

public class Main {

    private void testSingleton(){
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
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}