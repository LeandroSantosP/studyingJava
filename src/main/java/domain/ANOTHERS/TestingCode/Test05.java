package domain.ANOTHERS.TestingCode;

public class Test05 {

    public static void main(String[] args) {
        int[] myArrayA = {3, 2, 4, 3, 20, 4, 6, 10};

        boolean primo;
        for (int i = 0; i < myArrayA.length; i++) {
            primo = true;
            for (int j = 2; j < myArrayA[i]; j++) {
                if (myArrayA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            String msg = primo ? "primo" : "inpar";
            System.out.println(myArrayA[i] + ": " + msg);
        }
    }
}
