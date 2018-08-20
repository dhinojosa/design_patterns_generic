package com.xyzcorp.javapatterns.templatemethod;

public class SongWriterSystemOut extends SongWriter {
    @Override
    void writeString(String str) throws SongWriterException {
        System.out.println(str);
    }

    @Override
    public void writeNewLine() throws SongWriterException {
        System.out.println();
    }
}
