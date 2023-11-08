package org.example;

import domain.*;
import domain.Math;

import java.text.ParseException;
import java.util.UUID;

public class Main {
    public static void main(String[] args)  {
        // add comment
        ProjectOne project = new ProjectOne(UUID.randomUUID(), "Test1", 22.1);
//      IO io = new IO();
//      Math math = new Math();
//      math.calc();
//         MathOperators mathOperators = new MathOperators();
//         mathOperators.calc();

        Challenge01 challenge01 = new Challenge01();

        challenge01.exec();

    }
}