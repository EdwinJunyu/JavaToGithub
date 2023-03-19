package 临时软件包.test1;

import java.util.ArrayList;
import java.util.Arrays;

//Write a Java program to find the common elements between two arrays (string values).
public class Q14 {
    public static void comValueQ14(String[] arr1, String[] arr2){
        ArrayList<String> commonValue = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++){
                    if (arr1[i].equals(arr2[j])){
                        commonValue.add(arr1[i]);
                        break;
                    }
                }
            }
            System.out.println(commonValue + " are common elements");
        }

    public static void main(String[] args) {
        String[] test1 ={"hi","Hello" ,"Hello", "World" ,"World", "!", "666"};
        String[] test2 ={"hi","Hello" ,"Hello", "World" ,"World", "!"};
        Q14.comValueQ14(test1, test2);
    }
}
