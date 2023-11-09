package domain;

import java.util.Locale;
import java.lang.Math;
import java.util.Scanner;

public class Challenge02 {
    private int calculateTaxes(int minutesExceeded) {
        int pricePerMinute = 2;
        return pricePerMinute * minutesExceeded;
    }

    public int exec(int minutesUsed) throws Exception {
        Locale.setDefault(Locale.US);
        int totalPrice;
        int minMinutes = 100;
        int basePrice = 50;

        if(minutesUsed <= 0){
            throw new Exception("Must not be negative minutes!");
        }
        if(minutesUsed < minMinutes) {
            totalPrice = basePrice;
        } else {
            int minutesExceeded = Math.max(0, minutesUsed - minMinutes);
            int taxes = calculateTaxes(minutesExceeded);
            totalPrice = basePrice + taxes;
        }
        System.out.println(totalPrice);
        return totalPrice;
    }
}
