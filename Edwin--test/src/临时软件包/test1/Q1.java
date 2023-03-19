package 临时软件包.test1;
//Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Q1 {
    public static void Q1Sort(int[] arr) {
        int value = arr.length;
        for (int i = 0; i < value - 1; i++) {
            for (int j = 0; j < value - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void Q1Sort(String[] arr) {
        int value = arr.length;
        for (int i = 0; i < value - 1; i++) {
            for (int j = i + 1; j < value - i; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] test1 = {1,4,2,5,2,6,3,8,3,8};
        String[] test2 = {"b","a","c"};
        Q1.Q1Sort(test1);
        System.out.println(Arrays.toString(test1));
        Q1.Q1Sort(test2);
        System.out.println(Arrays.toString(test2));
    }
}
