package com.xyzcorp.javapatterns.command;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<String, Action> commandMap = new HashMap<>();
        Target target = new Target();
        Action action1 = () -> {
            target.displayTime(LocalDateTime.now());
        };
        Action action2 = new QueryTimeAction(target);
        commandMap.put("showTime", action1);
        commandMap.put("showTime2", action2);
        commandMap.get("showTime").execute();
    }
}
