package com.senac.bugs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class FileLines {

    public static void main(String[] args) throws IOException {
        int lines = 0;
        for (String line : Files.readAllLines(Path.of("file.txt"))) {
            lines++;
        }
        System.out.println("O arquivo tem " + lines + " linhas.");
    }

}
