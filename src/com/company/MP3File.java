package com.company;

/**
 * Specific case of audioFile
 */
public class MP3File implements AudioFile {
    private final String pathname;

    public MP3File(String pathname) {
        this.pathname = pathname;
    }

    @Override
    public byte[] getAudioFile() {
        return null;
    }
}
