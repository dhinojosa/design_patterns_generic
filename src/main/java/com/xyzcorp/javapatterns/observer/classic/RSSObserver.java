package com.xyzcorp.javapatterns.observer.classic;

/**
 * @author John Ericksen
 */
public interface RSSObserver {

    void update(RSSEntry entry);
}
