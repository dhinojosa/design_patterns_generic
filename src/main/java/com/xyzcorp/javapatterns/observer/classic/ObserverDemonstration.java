package com.xyzcorp.javapatterns.observer.classic;

import java.io.File;

/**
 * @author John Ericksen
 */
public class ObserverDemonstration {

    public static void main(String[] args) {


        String userHomeProperty = System.getProperty("user.home");
        RSSFeed johnsFeed = new RSSFeedImpl();

        johnsFeed.addObserver(new ConsoleOutObserver("Console 1"));
        RSSObserver console2 = johnsFeed.addObserver(new ConsoleOutObserver("Console 2"));
        johnsFeed.addObserver(new LoggingObserver(new File
                (userHomeProperty + "/rss.txt")));

        johnsFeed.broadcast(new RSSEntry("ABQJUG Rocks!"));

        johnsFeed.removeObserver(console2);

        johnsFeed.broadcast(new RSSEntry("ABQJUG Meeting Announcement"));
    }
}
