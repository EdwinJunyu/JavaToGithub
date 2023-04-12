package JavaSE.test1;

import java.util.ArrayList;

//Write a Java program to convert an array to ArrayList.
public class Q20 {
    public static ArrayList<Integer> arrayToArrayList(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }
}
