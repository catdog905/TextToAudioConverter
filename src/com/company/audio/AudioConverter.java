package com.company.audio;

import com.company.text.Text;

public interface AudioConverter {
    AudioRecord speakText(Text text);
}
