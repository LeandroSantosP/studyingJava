package domain.ANOTHERS.TestingCode;

public class Test02 {

    public static void main(String[] args) {
        int[] myArrayA = {1, 2, 2, 1, 2,4,7,10};
        int[] myArrayB = new int[myArrayA.length];

        for (int i = 0; i < (myArrayA.length / 2); i++) {
            myArrayB[i] = myArrayA[i] % 2 == 0 ? 1 : 0;
        }

        for (int i = 0; i < myArrayA.length; i++) {
            System.out.print(myArrayA[i]);
        }

        System.out.println();
        for (int i = 0; i < myArrayB.length; i++) {
            System.out.print(myArrayB[i]);
        }

    }
}
