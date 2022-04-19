package com.company.file;

public class MP3File extends File {
    private Byte[] body;

    @Override
    public Byte[] getByteStream() {
        return body;
    }
}
