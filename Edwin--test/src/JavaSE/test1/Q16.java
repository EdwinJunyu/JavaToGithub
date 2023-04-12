package JavaSE.test1;

import java.util.Arrays;

//Write a Java program to remove duplicate elements from an array.
public class Q16 {
    public static void removeComValueQ16(int[] arr){
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1]){
                newArr[j++] = arr[i];
                }
            }
        newArr[j++] = arr[arr.length-1];
        System.out.println(Arrays.toString(Arrays.copyOf(newArr, j))); // copy yo new array.
    }

    public static void main(String[] args) {
        int[] test = {1,2,2,3,4,5};
        Q16.removeComValueQ16(test);
    }
}
