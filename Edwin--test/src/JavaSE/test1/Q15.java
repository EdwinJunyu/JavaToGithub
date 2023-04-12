package JavaSE.test1;

import java.util.ArrayList;

//Write a Java program to find the common elements between two arrays of integers.
public class Q15 {
    public static void comValueQ15(int[] arr1, int[] arr2){
        ArrayList<Integer> commonValue = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == (arr2[j])){
                    commonValue.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(commonValue + " are common elements");
    }

    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,5};
        int[] test2 = {1,2,3,7,8};
        Q15.comValueQ15(test1, test2);
    }
}
