package core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeightConvert {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Select: ");
      System.out.println("1: Convert Kg to Pounds");
      System.out.println("2: Convert Pounds to Kg");
      int choice = sc.nextInt();
      if (!new ArrayList<Integer>(Arrays.asList(1, 2)).contains(choice)) {
         System.out.println("Invalid choice!");
         sc.close();
         return;
      }
      double result;

      if (choice == 1) {
         System.out.print("Weight In Kilos: ");
         double rawWeight = sc.nextDouble();
         result = rawWeight / 0.4536;
      } else {
         System.out.print("Weight In Kilos: ");
         double rawWeight = sc.nextDouble();
         result = rawWeight / 2.205;
      }

      System.out.printf("Result: %.4f\n", result);
      sc.close();
   }
}
