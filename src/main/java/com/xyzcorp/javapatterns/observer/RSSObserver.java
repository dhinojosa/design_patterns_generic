package com.xyzcorp.javapatterns.observer;

/**
 * @author John Ericksen
 */
public interface RSSObserver {

    void update(RSSEntry entry);
}
