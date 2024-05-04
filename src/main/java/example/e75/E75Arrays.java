package org.example.e75;

public class E75Arrays {
    public static void main(double[][] args) {
      //WRITE THE CODE FROM HERE PLEASE

        double[][] matrix =
                        {{1.4, 2.0, 3.3, 2.0},
                        {4.0, 1.5, 6.1, 1.0},
                        {1.2, 3.1, 4.0, 1.6}};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (double[] i : matrix) {
            for (double j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}

