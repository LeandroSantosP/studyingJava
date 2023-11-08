package domain;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Challenge01 {

    public void exec()  {
        Locale.setDefault(Locale.US);
        Scanner sac = new Scanner(System.in);

        double width = sac.nextDouble();
        double length = sac.nextDouble();
        double pricePer = sac.nextDouble();
        double area =  width * length;
        double total = area * pricePer;

        System.out.printf("AREA: %.2f%n PRICE: %.2f%n", area, total);

        sac.close();

    }
}
