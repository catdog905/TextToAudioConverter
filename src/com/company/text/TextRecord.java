package com.company.text;

import com.company.audio.AudioConverter;
import com.company.audio.AudioConverterImpl;
import com.company.audio.AudioRecord;

public class TextRecord {
    private final Text text;
    private AudioRecord audioFile;
    private final AudioConverter audioConverter = new AudioConverterImpl();

    public TextRecord(Text text, AudioRecord audioFile) {
        this.text = text;
        this.audioFile = audioFile;
    }

    public TextRecord(Text text) {
        this(text, null);
    }

    public Text getText() {
        return text;
    }

    public AudioRecord getAudioFile() {
        if (audioFile == null) {
            audioFile = audioConverter.speakText(text);
        }
        return audioFile;
    }
}
