package JavaSE.test1;

import java.util.Arrays;

//Write a Java program to reverse an array of integer values.
public class Q11 {
    public static void reverseQ11(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Q11.reverseQ11(test);
    }
}
