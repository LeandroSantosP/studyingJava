package domain;

public class Math {
    public void calc() {
        int locUp = 6;
        int base = 8;
        int heightL = 5;

        double area = (double) (base + locUp) / 2 * heightL;
        // Casting
        int a = 5;
        int b = 2;
        double result = (double) a / b;
        System.out.println(result);

        // Casting
        double d = 2.2;
        int c = 1;
        c = (int) d;
        System.out.println(c);
    }


}
