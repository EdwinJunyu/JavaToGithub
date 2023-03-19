package 临时软件包.test1;

import java.util.Arrays;

//Write a Java program to add two matrices of the same size.
public class Q19 {
    public static void addMatrices(int[][] mat1, int[][] mat2){
        int[][] newMatrices = new int[mat1.length][mat1[0].length];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                newMatrices[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println(Arrays.toString(newMatrices));
    }
}
