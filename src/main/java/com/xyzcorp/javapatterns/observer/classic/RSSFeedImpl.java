package com.xyzcorp.javapatterns.observer.classic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Ericksen
 */
//RSSFeed Observable
public class RSSFeedImpl implements RSSFeed {

    private List<RSSObserver> observers = new ArrayList<RSSObserver>();

    @Override
    public void broadcast(RSSEntry entry) {
        for (RSSObserver observer : observers) {
            observer.update(entry);
        }
    }

    @Override
    public RSSObserver addObserver(RSSObserver observer) {
        observers.add(observer);
        return observer;
    }

    @Override
    public void removeObserver(RSSObserver observer) {
        observers.remove(observer);
    }
}
