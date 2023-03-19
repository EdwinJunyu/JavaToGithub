package 临时软件包.test1;

import java.util.Arrays;

//write a Java program to insert an element (specific position) into an array.
public class Q9 {
    public static int[] insertQ9(int[] arr, int target, int index){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = target;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int [] test = {1,4,2,5,2,6,3,8,3,8};
        System.out.println("This is original array: " + Arrays.toString(test));
        System.out.println("This is current array: " + Arrays.toString(Q9.insertQ9(test, 10,1)));
    }
}
