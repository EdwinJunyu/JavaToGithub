package JavaSE.test1;

import java.util.Arrays;

//Write a Java program to copy an array by iterating the array.
public class Q8 {
    public static int[] copyArray(int[] arr){
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
                newArr[j++] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        System.out.println("This is original array: " + Arrays.toString(test));
        System.out.println("This is new array: " + Arrays.toString(Q8.copyArray(test)));
    }
}
