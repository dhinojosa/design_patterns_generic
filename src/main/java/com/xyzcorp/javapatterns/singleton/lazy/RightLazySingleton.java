package com.xyzcorp.javapatterns.singleton.lazy;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:33 PM
 */
public class RightLazySingleton {
    private static RightLazySingleton instance;

    private RightLazySingleton() {
        //I would have to initialize here, but I cannot
    }

    public static synchronized RightLazySingleton getInstance() {
        if (instance == null) {
            instance = new RightLazySingleton();
        }
        return instance;
    }
}
