package domain;

import java.util.Arrays;
import java.util.Locale;
import java.lang.Math;
import java.util.Map;
import java.util.Scanner;

public class Challenge02 {
    private int calculateTaxes(int minutesExceeded) { return 2 * minutesExceeded; }

    public double exec(int minutesUsed) throws Exception {
        Locale.setDefault(Locale.US);
        double bill;
        int minMinutes = 100;
        double basePrice = 50;

        String name = "John Dow Test";
        var res = name.split(" ", 2);
        System.out.println(Arrays.toString(res));

        if(minutesUsed <= 0){
            throw new Exception("Must not be negative minutes!");
        }
        if(minutesUsed < minMinutes) {
            bill = basePrice;
        } else {
            int minutesExceeded = Math.max(0, minutesUsed - minMinutes);
            int taxes = calculateTaxes(minutesExceeded);
            bill = basePrice + taxes;
        }
        System.out.println(bill);
        return bill;
    }
}
