package com.xyzcorp.observer;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BroadcastTest {

    class BroadcastEvent {
        private String message;

        public BroadcastEvent(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BroadcastEvent that = (BroadcastEvent) o;
            return Objects.equals(message, that.message);
        }

        @Override
        public int hashCode() {
            return Objects.hash(message);
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("BroadcastEvent{");
            sb.append("message='").append(message).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    class Broadcaster {
        private EventBus eventBus;

        public Broadcaster(EventBus eventBus) {
            this.eventBus = eventBus;
        }

        public void broadcastToAll() {
            this.eventBus.post(new BroadcastEvent("Canada is on fire"));
        }
    }

    class Subscriber {
        private List<String> messages;

        public Subscriber() {
            this.messages = new ArrayList<>();
        }

        @Subscribe
        public void eventOccurred(BroadcastEvent event) {
            messages.add(event.getMessage());
        }

        public List<String> getMessages() {
            return messages;
        }

        public int getCount() {
            return messages.size();
        }
    }

    class Subscriber2 {
        private List<String> messages;

        public Subscriber2() {
            this.messages = new ArrayList<>();
        }

        @Subscribe
        public void eventOccurred(String event) {
            messages.add(event);
        }

        public List<String> getMessages() {
            return messages;
        }

        public int getCount() {
            return messages.size();
        }
    }

    @Test
    void testBasicUse() {
        EventBus eventBus = new EventBus();
        Subscriber subscriber = new Subscriber();
        Subscriber2 subscriber2 = new Subscriber2();
        eventBus.register(subscriber);
        eventBus.register(subscriber2);

        Broadcaster broadcaster = new Broadcaster(eventBus);

        broadcaster.broadcastToAll();
        broadcaster.broadcastToAll();
        broadcaster.broadcastToAll();

        eventBus.post("Justin Bieber must go to prison");
        eventBus.post("Justin Bieber must go to prison");
        eventBus.post("Justin Bieber must go to prison");
        eventBus.post("Justin Bieber must go to prison");

        System.out.println(subscriber.getMessages());
        System.out.println("-----");
        System.out.println(subscriber2.getMessages());
    }
}
