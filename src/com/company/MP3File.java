package com.company;

import java.io.File;

public class MP3File extends File implements AudioFile {
    public MP3File(String pathname) {
        super(pathname);
    }

    @Override
    public AudioFile getAudioFile() {
        return null;
    }
}
