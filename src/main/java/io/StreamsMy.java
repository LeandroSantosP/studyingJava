package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsMy {
    public static void main(String[] args) {
        String[] names = { "John", "Carl", "Jerry" };
        try {
            FileOutputStream fos = new FileOutputStream("output2.txt");

            for (int i = 0; i < names.length; i++) {
                var current = names[i].getBytes();

                fos.write(current);

                var scape = "\n".getBytes();
                fos.write(scape);

            }

            FileInputStream fis = new FileInputStream("output2.txt");

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
