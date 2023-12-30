package domainTwo.Matrizes;

public class MatrixThreeDimensional {

    public static void main(String[] args) {
        int[][][] matrixMultidimensional = new int[3][3][3];

        int averageSum = 0;

        for (int i = 0; i < matrixMultidimensional.length; i++) {
            System.out.println("Start cube: " + (i));
            for (int j = 0; j < matrixMultidimensional[i].length; j++) {
                for (int k = 0; k < matrixMultidimensional[i][j].length; k++) {
                    matrixMultidimensional[i][j][k] = 100 * i * j * 23 / 2;
                    averageSum += matrixMultidimensional[i][j][k];
                    System.out.println("i = " + i + " j = " + j + " k = " + k + " Current Value: " + matrixMultidimensional[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int totalElements = matrixMultidimensional.length * matrixMultidimensional[0].length * matrixMultidimensional[0][0].length;
        System.out.println("average: " + averageSum / totalElements);

        // create a copy of matrixMultidimensional
//        for (int[][] external : matrixMultidimensional) {
//            for (int[] vertical : external) {
//                for (int horizontal : vertical) {
//                    horizontal = 100;
//                    System.out.print(horizontal + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        System.out.println(matrixMultidimensional[1][1][1]);
    }
}
