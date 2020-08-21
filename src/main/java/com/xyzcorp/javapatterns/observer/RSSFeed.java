package com.xyzcorp.javapatterns.observer;

public interface RSSFeed {
    void broadcast(RSSEntry entry);

    RSSObserver addObserver(RSSObserver observer);

    void removeObserver(RSSObserver observer);
}
