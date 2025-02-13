package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyBufferdStreams {
    public static void main(String[] args) {
        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_output.txt"));

            bos.write("Buffered Writing!".getBytes());

            bos.flush();
            bos.close();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("buffered_output.txt"));

            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

            bis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class ByteArrayStreamExample {
    public static void main(String[] args) {

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write("Hello ByteArray".getBytes()); // write in memory instead a file

            byte[] data = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(data);

            int b;

            while ((b = bais.read()) != -1) {
                System.out.print((char) b);
            }
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}