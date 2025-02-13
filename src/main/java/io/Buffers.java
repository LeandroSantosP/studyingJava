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
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
            // 1️⃣ Set method to POST
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            // 2️⃣ Write request body
            OutputStream os = connection.getOutputStream();
            String jsonInput = "{ \"title\": \"New Post\", \"body\": \"Hello World\", \"userId\": 1 }";
            os.write(jsonInput.getBytes());
            os.flush();
            os.close();

            // 3️⃣ Read response
            InputStream is = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String data = reader.lines().collect(Collectors.joining("\n"));

            System.out.println(data);

            reader.close();
            connection.disconnect();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /*
         * try {
         * BufferedReader reader = new BufferedReader(new FileReader("output2.txt"));
         * System.out.print("Enter your name: ");
         * Stream<String> names = reader.lines();
         * names.forEach(System.out::println);
         * reader.close();
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         */

    }
}