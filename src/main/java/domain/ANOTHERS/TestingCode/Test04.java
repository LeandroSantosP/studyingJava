package domain.ANOTHERS.TestingCode;

public class Test04 {

    public static void main(String[] args) {
        int[] myArrayA = {3, 2, 2, 1, 20, 4, 7, 10};
        int[] myArrayB = {3, 2, 2, 1, 20, 4, 7, 10};
        int[] myArrayC = new int[myArrayA.length * 2];

        for (int i = 0; i < myArrayA.length; i++) {
            myArrayC[myArrayA.length - 1 - i] = myArrayA[i];
        }

        for (int i = 0; i < myArrayB.length; i++) {
            myArrayC[myArrayB.length + i] = myArrayB[i];
        }

        for (int i = 0; i < myArrayC.length; i++) {
            if (i == myArrayC.length / 2){
                System.out.print(" | ");
            }
            System.out.print(myArrayC[i]+" ");
        }
    }
}
