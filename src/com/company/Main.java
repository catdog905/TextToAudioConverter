package com.company;

/**
 * Example of client behaviour
 */
public class Main {

    public static void main(String[] args) {
        PdfFile pdfFile = new PdfFile("path", Language.English);
        PdfToAudioAdapter pdfToAudioAdapter = new PdfToAudioAdapter(pdfFile);
        byte[] audioFile = pdfToAudioAdapter.getAudioFile();
//        play audio file
    }
}
