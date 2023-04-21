package com.likelion.javaproject2.week1.previous;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is;
        is = new InputStreamReader(System.in);
        int asciiCode = is.read();
        System.out.println(asciiCode);
    }
}
