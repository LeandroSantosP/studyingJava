package domainTwo.Matrizes;
public class Grades {

    public static void main(String[] args) {
        double[][] studentsGrades = new double[10][4];

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
        studentsGrades[2][2] = 8;
        studentsGrades[2][3] = 9.5;

        for (int i = 0; i < studentsGrades.length; i++) {
            for (int j = 0; j < studentsGrades[i].length; j++) {
                System.out.print(studentsGrades[i][j] + " | " + "\t");
            }
            System.out.println(	"\n" + "-----------------------------"); // Nova linha para a próxima linha da matriz
        }
    }
}
