package com.xyzcorp.javapatterns.observer.classic;

/**
 * @author John Ericksen
 */
public class ConsoleOutObserver implements RSSObserver {

    private String name;

    public ConsoleOutObserver(String name) {
        this.name = name;
    }

    public void update(RSSEntry entry) {
        System.out.println(name + " : " + entry.getValue());
    }
}
