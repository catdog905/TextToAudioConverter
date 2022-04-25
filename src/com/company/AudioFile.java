package com.company;

import java.io.File;

//client interface
interface AudioFile<T extends File> {
    T getFile();
}
