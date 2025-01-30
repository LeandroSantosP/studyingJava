package domain;

import java.lang.Math;
import java.util.Scanner;

public class MathOperators {
  private Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    new MathOperators().calc();
  }

  public void calc_two() {

    System.out.print("Enter the radius: ");
    double radius = scanner.nextDouble();

    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius, 2);
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    System.out.printf("Circumference is: %.1fcm\n", circumference);
    System.out.printf("Area is: %.1fcm\n", area);
    System.out.printf("Volume is: %.1fcm\n", volume );

    scanner.close();
  }

  /* HIPOTENUSE c = Math.a */
  public void Hipotenuse() {

    double a;
    double b;

    System.out.print("Enter the length of side A: ");
    a = scanner.nextDouble();

    System.out.print("Enter the length of side B: ");
    b = scanner.nextDouble();

    // Hipotenuse is the root square of 'a' power of 2 plus 'b' power of 2;
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println(String.format("The hipotenuse (side c) is %.2fcm", c));
    scanner.close();
  }

  public void calc() {
    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A, B, C;
    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);
    System.out.printf("Raiz quadrada de %s = %s%n", x, A);
    System.out.printf("Raiz quadrada de %s = %s%n", y, B);
    System.out.printf("Raiz quadrada de 25 = %s%n", C);

    A = Math.pow(x, y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);

    System.out.printf("%s elevado %s = %s%n", x, y, A);
    System.out.printf("x elevado ao qualdrado = %s%n", B);
    System.out.printf("5 elevado ao qualdrado = %s%n", C);

    A = Math.abs(y);
    B = Math.abs(z);
    System.out.printf("Valor absolute de %s = %s%n", y, A);
    System.out.printf("Valor absolute de %s = %s%n", z, B);

    double result = Math.pow(2, 3);
    System.out.println(result);

    var max = Math.max(10, 20);
    var min = Math.min(10, 20);
    System.out.println(String.format("Min: %s, Max: %d", min, max));

  }

}
