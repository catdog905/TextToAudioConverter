package com.company.ui;

import com.company.audio.AudioRecordFileAdapter;
import com.company.file.File;
import com.company.file.HtmlLayout;
import com.company.text.Text;
import com.company.text.TextRecord;

import java.util.ArrayList;
import java.util.List;

public class TextConverterPage implements Page {
    private final HtmlLayout htmlLayout = new HtmlLayout();
    private final List<File> resources = new ArrayList<>();

    public TextConverterPage() {
    }

    public void addText(Text text) {
        resources.add(new AudioRecordFileAdapter(new TextRecord(text).getAudioFile()));
    }

    @Override
    public HtmlLayout getPageLayout() {
        return htmlLayout;
    }

    @Override
    public List<File> getResources() {
        return resources;
    }
}
