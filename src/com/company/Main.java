package com.company;

public class Main {

    public static void main(String[] args) {
        PdfFile pdfFile = new PdfFile("path", Language.English);
        PdfToAudioAdapter<MP3File> pdfToAudioAdapter = new PdfToAudioAdapter<>(pdfFile);
        MP3File audioFile = pdfToAudioAdapter.getFile();
    }
}
