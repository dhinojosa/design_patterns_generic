package com.xyzcorp.javapatterns.command;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<String, Action> commandMap = new HashMap<>();

        Target target = new Target();

        Action action1 = () -> target.displayTime(LocalDateTime.now());
        Action action2 = () -> target.displayTime(LocalDateTime.now().minusHours(3));

        commandMap.put("showTime", action1);
        commandMap.put("showTimeMinus3Hours", action2);

        commandMap.get("showTime").execute();
        commandMap.get("showTimeMinus3Hours").execute();
    }
}
