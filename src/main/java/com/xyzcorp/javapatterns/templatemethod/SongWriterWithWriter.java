package com.xyzcorp.javapatterns.templatemethod;

import java.io.IOException;
import java.io.Writer;

public class SongWriterWithWriter extends SongWriter {
    private final Writer writer;

    public SongWriterWithWriter(Writer writer) {
        this.writer = writer;
    }

    @Override
    void writeString(String str) throws SongWriterException {
        try {
            writer.write(str);
        } catch (IOException e) {
            throw new SongWriterException(e);
        }
    }

    @Override
    public void writeNewLine() throws SongWriterException {
        try {
            writer.write("\n");
        } catch (IOException e) {
            throw new SongWriterException(e);
        }
    }
}
