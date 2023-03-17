package 临时软件包.test1;

import java.util.Arrays;

//Write a Java program to remove a specific element from an array.
public class Q7 {
    public static int[] removeValueQ7(int[] arr, int target){
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        System.out.println("This is original array: " + Arrays.toString(test));
        System.out.println("This is current array: " + Arrays.toString(Q7.removeValueQ7(test, 3)));
    }
}
