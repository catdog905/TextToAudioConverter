package com.company;

import java.io.File;

public class PdfToAudioAdapter implements AudioFile {
    private final GoogleTranslator<AudioFile> googleTranslator = null; // converter dependency
    private final PdfFile pdfFile;

    public PdfToAudioAdapter(PdfFile pdfFile) {
        this.pdfFile = pdfFile;
    }

    @Override
    public AudioFile getAudioFile() {
        byte[] textBlob = pdfFile.getByteText();
        return googleTranslator.getAudioFromText(textBlob, pdfFile.getLanguage().toString());
    }
}
