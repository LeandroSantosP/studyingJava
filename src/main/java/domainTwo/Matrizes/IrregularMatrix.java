package domainTwo.Matrizes;

import java.util.Scanner;

public class IrregularMatrix {


    public static void main(String[] args) {
        System.out.println("Enter the numbers of people who will be interviewed: ");
        Scanner scanner = new Scanner(System.in);
        int interviewedNum = scanner.nextInt();

        String[][] childrenNames = new String[interviewedNum][];

        for (int i = 0; i < childrenNames.length; i++) {
            System.out.println("Enter the amount of children ");
            int amount = scanner.nextInt();
            childrenNames[i] = new String[amount];
            for (int j = 0; j < childrenNames[i].length; j++) {
                System.out.println("Type the son name: " + (j + 1));
                childrenNames[i][j] = scanner.next();
            }
        }

        for (int i = 0; i < childrenNames.length; i++) {
            for (int j = 0; j < childrenNames[i].length; j++) {
                System.out.println("Person: " + i + " have " + childrenNames[i][j] + " as son.");
            }
        }
    }
}


