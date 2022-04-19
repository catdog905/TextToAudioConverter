package com.company.ui;

import com.company.file.File;
import com.company.file.HtmlLayout;

import java.util.List;

public interface Page {
    HtmlLayout getPageLayout();
    List<File> getResources();
}
