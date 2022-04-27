package com.company;

/**
 * Specific case of audioFile
 */
public class WAVFile implements AudioFile {
    private final String pathname;
    public WAVFile(String pathname) {
        this.pathname = pathname;
    }

    @Override
    public byte[] getAudioFile() {
        return null;
    }
}
