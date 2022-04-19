package com.company.audio;

import com.company.audio.AudioRecord;
import com.company.file.File;

public class AudioRecordFileAdapter extends File {
    private final AudioRecord audioRecord;

    public AudioRecordFileAdapter(AudioRecord audioRecord) {
        this.audioRecord = audioRecord;
    }

    @Override
    public Byte[] getByteStream() {
        return audioRecord.getSound().getByteArray();
    }
}
