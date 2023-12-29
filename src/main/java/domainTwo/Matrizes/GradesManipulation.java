package domainTwo.Matrizes;

import java.util.Arrays;

public class GradesManipulation {

    public static void main(String[] args) {
        double[][] studentsGrades = new double[5][4];

        studentsGrades[0][0] = 10;
        studentsGrades[0][1] = 7;
        studentsGrades[0][2] = 8;
        studentsGrades[0][3] = 9.5;

        studentsGrades[1][0] = 10;
        studentsGrades[1][1] = 7;
        studentsGrades[1][2] = 8;
        studentsGrades[1][3] = 9.5;

        studentsGrades[2][0] = 10;
        studentsGrades[2][1] = 7;
        studentsGrades[2][2] = 30;
        studentsGrades[2][3] = 9.5;

        studentsGrades[3][0] = 20;
        studentsGrades[3][1] = 10.2;
        studentsGrades[3][2] = 3.2;
        studentsGrades[3][3] = 9;

        for (int i = 0; i < studentsGrades.length; i++) {
            for (int j = 0; j < studentsGrades[i].length; j++) {
                System.out.print(studentsGrades[i][j] + " | " + "\t");
            }
            System.out.println("\n" + "-----------------------------"); // Nova linha para a próxima linha da matriz
        }

        Averages[] averages = new Averages[5];
        double averageSum;
        for (int c = 0; c < studentsGrades.length; c++) {
            averageSum = 0;
            for (int r = 0; r < studentsGrades[c].length; r++) {
                double subtotal = studentsGrades[c][r];
                averageSum += subtotal / studentsGrades[c].length;
            }
            averages[c] = new Averages(c + 1, averageSum);
        }
        Arrays.stream(averages).forEach(i -> System.out.println("Average of " + i.ID() + " is " + i.amount()));
    }

    private record Averages(int ID, double amount) {
    }
}
