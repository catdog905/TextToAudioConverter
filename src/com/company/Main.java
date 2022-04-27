package com.company;

public class Main {

    public static void main(String[] args) {
        PdfFile pdfFile = new PdfFile("path", Language.English);
        PdfToAudioAdapter pdfToAudioAdapter = new PdfToAudioAdapter(pdfFile);
        AudioFile audioFile = pdfToAudioAdapter.getAudioFile();
    }
}
