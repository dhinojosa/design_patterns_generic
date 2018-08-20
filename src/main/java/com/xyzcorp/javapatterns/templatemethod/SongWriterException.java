package com.xyzcorp.javapatterns.templatemethod;

public class SongWriterException extends Exception {
    private final Throwable source;

    public SongWriterException(Throwable e) {
        this.source = e;
    }

    public Throwable getSource() {
        return source;
    }
}
