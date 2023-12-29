package domainTwo.Exeptions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExampleOne {

//    public static void main(String[] args) {
//        try {
//            int[] vector = {1, 2, 3, 4, 5};
//            vector[6] = 2;
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Finished");
//    }

    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 20, 30, 20, 2};
        int[] demon = {2, 0, 0, 8, 0, 2};
        for (int i = 0; i < numbs.length; i++) {
            try {
                System.out.println(numbs[i] + " / " + demon[i] + " = " + (numbs[i] / demon[i]));
            } catch (Exception e) {
                // show in the console which line the exception was thrown
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
