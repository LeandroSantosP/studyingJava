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
        int basePriceForUpTo100Minutes = 50;

        if(minutesUsed <= 0){
            throw new Exception("Must not be negative minutes!");
        }
        if(minutesUsed < basePriceForUpTo100Minutes) {
            totalPrice = basePriceForUpTo100Minutes;
        } else {
            int minutesExceeded = Math.max(0, minutesUsed - basePriceForUpTo100Minutes);
            int taxes = calculateTaxes(minutesExceeded);
            totalPrice = basePriceForUpTo100Minutes + taxes;
        }
        System.out.println(totalPrice);
        return totalPrice;
    }
}
