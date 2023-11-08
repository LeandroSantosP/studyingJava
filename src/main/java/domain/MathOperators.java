package domain;
import java.lang.Math;
public class MathOperators {

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
          System.out.printf("Valor absolute de %s = %s%n",y, A);
          System.out.printf("Valor absolute de %s = %s%n", z, B);
    }
}
