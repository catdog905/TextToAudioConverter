package com.company;

/**
 * Adapter for PdfFile to AudioFile interface
 */
public class PdfToAudioAdapter implements AudioFile {
    // library implementation
    private final GoogleTranslator googleTranslator = null;
    private final PdfFile pdfFile;

    public PdfToAudioAdapter(PdfFile pdfFile) {
        this.pdfFile = pdfFile;
    }

    @Override
    public byte[] getAudioFile() {
        byte[] textBlob = pdfFile.getByteText();
        return googleTranslator.getAudioFromText(textBlob, pdfFile.getLanguage().toString());
    }
}
