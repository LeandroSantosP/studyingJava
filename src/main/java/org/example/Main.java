package org.example;

import domain.IO;
import domain.Math;
import domain.ProjectOne;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // add comment
        ProjectOne project = new ProjectOne(UUID.randomUUID(), "Test1", 22.1);
        IO io = new IO();
        Math math = new Math();
        math.calc();

    }
}