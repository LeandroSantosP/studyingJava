package domain.ANOTHERS.ANOTHERS.TestingCode;

import javax.sound.sampled.Line;

public class Test03 {

    public static void main(String[] args) {
        int[] myArrayA = {3, 2, 2, 1, 20, 4, 7, 10};
        int[] myArrayB = {1, 2, 3, 4, 5, 6, 7, 10};
        int[] myArrayC = new int[myArrayA.length];

        for (int i = 0; i < myArrayA.length ; i++) {
            if (myArrayA[i] == myArrayB[i]) {
                myArrayC[i] = 0;
            } else if (myArrayA[i] > myArrayB[i]) {
                myArrayC[i] = 1;
            } else {
                myArrayC[i] = -1;
            }
        }


        for (int i = 0; i < myArrayA.length; i++) {
            System.out.print(myArrayA[i]);
        }

        System.out.println();
        for (int i = 0; i < myArrayB.length; i++) {
            System.out.print(myArrayB[i]);
        }

        System.out.println();
        for (int i = 0; i < myArrayC.length; i++) {
            System.out.print(myArrayC[i]);
        }
    }
}
