package com.xyzcorp.javapatterns.observer.classic;

public interface RSSFeed {
    void broadcast(RSSEntry entry);

    RSSObserver addObserver(RSSObserver observer);

    void removeObserver(RSSObserver observer);
}
