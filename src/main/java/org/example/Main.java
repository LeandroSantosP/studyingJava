package org.example;

import domain.*;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // add comment
//        ProjectOne project = new ProjectOne(UUID.randomUUID(), "Test1", 22.1);
//        Employee joao = new Employee("Joao", 6000);
//
//        joao.IncreaseSalary(10);
//        joao.printInfo();

        Student student = new Student("John doe");
        student.addNote(27.00);
        student.addNote(10.00);
        student.addNote(23.00);
        student.print();


        //      IO io = new IO();
        //      Math math = new Math();
        //      math.calc();
        //      MathOperators mathOperators = new MathOperators();
        //      mathOperators.calc();
        //
        //        Challenge02 challenge02 = new Challenge02();
        //        challenge02.exec(100);

//        MYString myString = new MYString();
//        myString.exec();
    }
}