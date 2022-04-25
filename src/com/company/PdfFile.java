package com.company;

import java.io.File;

public class PdfFile extends File {
    private final String path;
    private final Language language;

    public PdfFile(String path, Language language) {
        super(path);
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
