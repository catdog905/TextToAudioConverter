package com.company;

import java.io.File;

public class PdfToAudioAdapter<T extends File> implements AudioFile<T> {
    private final GoogleTranslator<T> googleTranslator = null; // converter dependency
    private final PdfFile pdfFile;

    public PdfToAudioAdapter(PdfFile pdfFile) {
        this.pdfFile = pdfFile;
    }

    @Override
    public T getFile() {
        byte[] textBlob = pdfFile.getByteText();
        return googleTranslator.getAudioFromText(textBlob, pdfFile.getLanguage().toString());
    }
}
