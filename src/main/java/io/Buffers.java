package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Buffers {

    public static void main(String[] args) {

        String[] names = { "John", "Carl", "Jerry" };

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file.");
            for (int i = 0; i < names.length; i++) {
                writer.write("\n" + names[i]);
            }
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class BuffersStreams {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output2.txt"));
            System.out.print("Enter your name: ");
            Stream<String> names = reader.lines();
            names.forEach(System.out::println);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}