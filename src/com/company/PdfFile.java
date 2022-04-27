package com.company;

import java.io.File;

/**
 * Service to be adapted to client interface
 */
public class PdfFile {
    private final String path;
    private final Language language;

    public PdfFile(String path, Language language) {
        this.path = path;
        this.language = language;
    }

    public byte[] getByteText() {
        return null;
    }

    public Language getLanguage() {
        return language;
    }
}
