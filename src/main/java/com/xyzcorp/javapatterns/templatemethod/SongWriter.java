package com.xyzcorp.javapatterns.templatemethod;

public abstract class SongWriter {
    abstract void writeString(String str) throws SongWriterException;
    public abstract void writeNewLine() throws SongWriterException;

    public final void writeLyrics() throws SongWriterException {
        writeString("I see trees of green");
        writeNewLine();
        writeString("red roses too, I see them bloom");
        writeNewLine();
        writeString("for me and you");
        writeNewLine();
        writeString("and I think to myself");
        writeNewLine();
        writeString("what a wonderful world");
        writeNewLine();
    }
}
