package com.company;

import java.io.File;

public class WAVFile extends File implements AudioFile {
    public WAVFile(String pathname) {
        super(pathname);
    }

    @Override
    public AudioFile getAudioFile() {
        return null;
    }
}
