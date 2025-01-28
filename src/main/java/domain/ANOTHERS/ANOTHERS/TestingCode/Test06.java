package domain.ANOTHERS.ANOTHERS.TestingCode;

import java.math.BigInteger;
import java.util.Calendar;

public class Test06 {

    public static void main(String[] args) {
        final int[] myArrayA = { 12, 5, 4, 100, 1 };
        final BigInteger[] myArrayB = new BigInteger[myArrayA.length];

        for (int i = 0; i < myArrayA.length; i++) {
            BigInteger factorial = BigInteger.ONE;
            System.out.println("curr: " + myArrayA[i]);
            for (int j = myArrayA[i]; j > 0; j--) {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }
            System.out.print(factorial + "\n");
        }
    }
}
